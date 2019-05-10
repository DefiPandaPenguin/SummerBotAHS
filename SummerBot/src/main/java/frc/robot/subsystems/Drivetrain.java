package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import frc.robot.OI;
import frc.robot.Constants;
import frc.robot.commands.DriveCommand;

public class Drivetrain extends Subsystem {

  DifferentialDrive drive;

  //These are the RIGHT MOTORS
  public WPI_TalonSRX rightMaster = new WPI_TalonSRX(Constants.rightMotor);
  // TalonSRX rightFollower = new TalonSRX(Constants.rightFallow);

  //Left Motors
  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(Constants.leftMotor);
  // TalonSRX leftFollower = new TalonSRX(Constants.leftFollow);


  public Drivetrain (){

    // rightFollower.follow(rightMaster);
    // leftFollower.follow(leftMaster);
    drive = new DifferentialDrive(leftMaster, rightMaster);
  }

  public void arcade(double move, double turn){
    drive.arcadeDrive(move, turn);
  }

  public void tank(double left, double right)
  {
    drive.tankDrive(left, right);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveCommand(OI.throttle,OI.turn));
  }
}