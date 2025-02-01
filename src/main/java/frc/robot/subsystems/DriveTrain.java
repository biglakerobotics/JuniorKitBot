package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {

    SparkMax leftLeader;
    SparkMax leftFollower;
    SparkMax rightLeader;
    SparkMax rightFollower;

    public DriveTrain() {
        leftLeader = new SparkMax(1, MotorType.kBrushed);
        leftFollower = new SparkMax(2, MotorType.kBrushed);
        rightLeader = new SparkMax(3, MotorType.kBrushed);
        rightFollower = new SparkMax(4, MotorType.kBrushed);
    }
}
