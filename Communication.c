#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char* argv[]){
    int fd[2];
    //fd[0] -> read
    //fd[1] -> write
    if(pipe(fd) == -1){
        printf("Error occured in opening a pipe");
        return 1;
    }
    int pid = fork();
    if(pid==-1){
        printf("An error occured with fork\n");
        return 2;
    }
    if(pid != 0){
        close(fd[0]);
        //Parent process
        int acc;
        int angle;
        char status[10];
        char ackR[10];
       

        printf("Lead truck attempting to connect to trail truck\n");
        
        printf("Lead truck sending acceleration information\n");
        scanf("%d",&acc);
        if(write(fd[1],&acc, sizeof(int)) == -1){
            printf("An error occured while writing acceleration to the pipe\n");
            return 2;
        }
        
        printf("Lead truck sending steering angle information\n");
        scanf("%d",&angle);
        if(write(fd[1],&angle, sizeof(int))==-1) {
            printf("An error occured while writing steerling angle to the pipe\n");
            return 2;
       }

       printf("Lead truck sending PRND status\n");
        scanf("%s",status);
        if(write(fd[1],&status, sizeof(status))==-1) {
            printf("An error occured while writing PRND status to the pipe\n");
            return 2;
            close(fd[1]);
       }     

    } else{
        //Child process
        
        
        int accR;
        int angleR;
        char statusR[10];
        char ack[10] = "ack";

        if(read(fd[0],&accR, sizeof(int)) == -1){
            printf("An error occured while reading acceleration to the pipe\n");
            return 3;
        }

        if(read(fd[0],&angleR, sizeof(int)) == -1){
            printf("An error occured while reading break angle to the pipe\n");
            return 3;
        }

        if(read(fd[0],&statusR, sizeof(statusR)) == -1){
            printf("An error occured while reading PRND status to the pipe\n");
            return 3;
        }

        printf("Trail truck sending acknowledgement to lead truck\n");
        if(write(fd[1],&ack, sizeof(ack)) == -1){
            printf("An error occured while sending ack\n");
            return 2;
        }
        
        printf("Acceleration data recieved from Lead truck : %d\n", accR);
        printf("Steering angle data recieved from Lead truck : %d\n", angleR);
        printf("PRND status data recieved from Lead truck : %s\n", statusR);
        close(fd[0]);
        close(fd[1]);
    }
}
