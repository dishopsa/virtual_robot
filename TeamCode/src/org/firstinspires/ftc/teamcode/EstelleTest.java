package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "EstelleTest")
public class EstelleTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("name", "Estelle");
        telemetry.update();
        waitForStart();
        int counter = 0;
        while(opModeIsActive()){
            counter++;
            telemetry.addData("counter", counter);
            telemetry.update();
        }
    }
}
