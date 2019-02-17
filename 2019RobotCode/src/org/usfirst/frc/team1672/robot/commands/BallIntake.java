package org.usfirst.frc.team1672.robot.commands;

import org.usfirst.frc.team1672.robot.OI;
import org.usfirst.frc.team1672.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BallIntake extends Command {

    public BallIntake() {
    	requires(Robot.m_intakeSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	if(OI.controller.getBumper(Hand.kRight))
    	{
    		Robot.m_intakeSubsystem.turnIntake(1);
    	}
    	else if(OI.controller.getBumper(Hand.kLeft))
    	{
    		Robot.m_intakeSubsystem.turnIntake(-1);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
