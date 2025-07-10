package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.function.BooleanSupplier;

/**
 * AutonTest/Commons functions shall only be called by <strong>LinearOpModes</strong>
 */
@Autonomous(name = "Arjun's Auton Preview", group = "Auton TEST")
public class AutonTest {

    public static DcMotor frontLeftMotor;
    public static DcMotor frontRightMotor;
    public static DcMotor backLeftMotor;
    public static DcMotor backRightMotor;

    public static final int fieldWidth = 144;
    public static final int fieldHeight = 144;

    public static double robotPosX;
    public static double robotPosY;
    public static int robotOrientation;

    public static boolean initialized = false;

    public static BooleanSupplier opModeIsActive;

    public static Telemetry telemetry;

    /**
     * Initializes <strong>AutonTest/Commons</strong> with robot position, orientation, <strong>OpMode</strong> provided status updates,
     * hardware control and telemetry control. <strong>AutonTest/Commons</strong> functions will <strong>NOT</strong> work
     * without calling init with appropriate parameters.
     * @param hardwareMap <strong>HardwareMap</strong> from the <strong>LinearOpMode</strong> init is called by
     * @param opModeIsActive Put <strong>this::opModeIsActive</strong> for this parameter
     * @param telemetry <strong>Telemetry</strong> from the <strong>LinearOpMode</strong> init is called by
     * @param robotX The starting x-coordinate on the field in inches, the left of the field being the <strong>0</strong>, and the right of the field being <strong>fieldWidth</strong>
     * @param robotY The starting y-coordinate on the field in inches, the top of the field being the <strong>0</strong>, and the bottom of the field being <strong>fieldHeight</strong>
     * @param robotOrientation The robot orientation as a multiple of <strong>90</strong>, from <strong>0</strong> to <strong>270</strong>
     */
    public static void init(HardwareMap hardwareMap, BooleanSupplier opModeIsActive, Telemetry telemetry, double robotX, double robotY, int robotOrientation) {
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");

        AutonTest.opModeIsActive = opModeIsActive;
        AutonTest.telemetry = telemetry;

        robotPosX = robotX;
        robotPosY = robotY;

        AutonTest.robotOrientation = robotOrientation;

        initialized = true;
    }
}
