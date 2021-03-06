// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc9997.Pearland_9997v2.subsystems;

import org.usfirst.frc9997.Pearland_9997v2.RobotMap;
import org.usfirst.frc9997.Pearland_9997v2.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftFrontBrown = RobotMap.driveLeftFrontBrown;
    SpeedController leftRearWhite = RobotMap.driveLeftRearWhite;
    SpeedController rightRearBlue = RobotMap.driveRightRearBlue;
    SpeedController rightFrontOrange = RobotMap.driveRightFrontOrange;
    RobotDrive robotDrive41 = RobotMap.driveRobotDrive41;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


public void takeJoystickInputs(double left, double right) {
    robotDrive41.tankDrive(left, right);
}

public void stop() {
    robotDrive41.drive(0,0);
}
        
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	setDefaultCommand(new DriveWithJoysticks());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

