package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class Drive extends Command {
    private final DriveTrain m_drivetrain;

    private double DriveX;
    private double DriveY;
    public Joystick joystick = new Joystick(Constants.joyPort);

    public Drive(Joystick mJoystick, DriveTrain DriveTrain) {
        joystick = mJoystick;
        m_drivetrain = DriveTrain;
        addRequirements(m_drivetrain);
    }

    @Override
    public void execute() {
        DriveX = joystick.getX()*Constants.steerSpeed;
        DriveY = joystick.getY()*Constants.driveSpeed;
        m_drivetrain.mDifferentialDrive.arcadeDrive(DriveX, DriveY);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {


    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
