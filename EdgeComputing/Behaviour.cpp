#include <Arduino.h>
#include "motorDriver.h"
#include "sensorDriver.h"

class bclass {
public:
    bclass();
    int angleCalc(int xrover, int yrover, int xtarget, int ytarget, int roverAngle);
    void startTurn(int phi);
    void turnRightSt(int phi);
    void turnLeftSt(int phi);
    void turnLeft();
    void turnRight();
    void bclass::testing_approximity(int left, int right, int center);

    int phi;    //angle between the target and rover's direction
};
    int bclass::angleCalc(int xrover, int yrover, int xtarget, int ytarget, int roverAngle){ //roverAngle is calculated as: (360-"rover angle from AWS") due to inverse y-axis
        int theta = atan2((ytarget-yrover), (xtarget-xrover))*180/PI;
        phi = abs(theta-roverAngle);
        return phi;
    }
    void bclass::startTurn(int phi){
    if (phi > 180)        
        {turnRightSt(360-phi);}
    else
        {turnLeftSt(phi);}
    }

    void bclass::turnRightSt(int phi){
        // rover turning function calcuated practically timeForCompleteTurn*255/360

    }
    void bclass::turnLeftSt(int phi){
        // rover turning function calcuated practically timeForCompleteTurn*255/360
        
    }
    void bclass::turnRight(){ //truning the rover to the right while moving for faster performance
        // rover turning while moving function for slowing down MotorA to half for 100ms    
        mclass motorobject = mclass();
        motorobject.set_speed(MotorA, Forward, 127);
        motorobject.set_speed(MotorB, Backward, 255);
        delay(100);

    }
    void bclass::turnLeft(){ //truning the rover to the left while moving for faster performance
        // rover turning while moving function for slowing down MotorB to half for 100ms
        mclass motorobject = mclass();
        motorobject.set_speed(MotorA, Forward, 255);
        motorobject.set_speed(MotorB, Backward, 127);
        delay(100);
    }

 
    
   void bclass::testing_approximity(int left, int right, int center){
       int threshold = 2;
       delay(100);
       /*  int left = arr[0];
       int center = arr[1];
       int right = arr[2]; */
       int16_t *arr = sensorobject.reading();
       while (left-arr[0] >= threshold){
           turnRight();
           int16_t *arr = sensorobject.reading();
           delay(1000);
       }
       while (right-arr[2] >= threshold){
           turnLeft();
           int16_t *arr = sensorobject.reading();
           delay(1000);
       }
       
    }
    
    


