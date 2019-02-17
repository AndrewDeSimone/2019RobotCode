package org.usfirst.frc.team1672.robot.subsystems;

import org.usfirst.frc.team1672.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	DifferentialDrive driveTrain = new DifferentialDrive(RobotMap.leftDrive,RobotMap.rightDrive);
	
	public void updatePosition(double x,double y)
	{
		driveTrain.arcadeDrive(y, x);
	}
	
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

