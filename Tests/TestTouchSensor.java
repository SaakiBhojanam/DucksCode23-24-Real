package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

 @TeleOp
 public class TestTouchSensor extends LinearOpMode{
 // Define variables for our touch sensor and motor
  TouchSensor touch;
  DcMotor motor;

  @Override
  public void runOpMode() {

   // Get the touch sensor and motor from hardwareMap
   touch = hardwareMap.get(TouchSensor.class,"touch");
   motor = hardwareMap.get(DcMotor.class, "motor");

   // Wait for the play button to be pressed
   waitForStart();

   // Loop while the Op Mode is running
   while (opModeIsActive()) {

    // Loop while the Op Mode is running
    if (opModeIsActive()) {

     // If the touch sensor is pressed, stop the motor
     if (touch.isPressed()) {
      motor.setPower(0);

     } else { // Otherwise, run the motor
      motor .setPower(0.3);
     }
    }
   }
  }
}
