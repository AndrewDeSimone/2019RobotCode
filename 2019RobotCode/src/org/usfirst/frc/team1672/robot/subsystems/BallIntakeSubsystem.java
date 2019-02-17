package org.usfirst.frc.team1672.robot.subsystems;

import org.usfirst.frc.team1672.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallIntakeSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void turnIntake(double s)
	{
		RobotMap.intakeTurner.setSpeed(s);
	}
	
	public void extendIntake(double s)
	{
		RobotMap.intakeExtender.set(s);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

