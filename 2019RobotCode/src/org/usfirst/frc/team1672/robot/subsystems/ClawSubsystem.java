package org.usfirst.frc.team1672.robot.subsystems;

import org.usfirst.frc.team1672.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClawSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void extendClaw(double s)
	{
		RobotMap.clawExtender.setSpeed(s);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

