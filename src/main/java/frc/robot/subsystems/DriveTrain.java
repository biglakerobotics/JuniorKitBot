package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

    // SparkMax leftLeader = new SparkMax(Constants.motorLLead, null);


    //notes for the noob junior programmers: 
    //The motors were being defined inside public DriveTrain()
    //but they should have been defined outside of it, like where it is now. see the before and after

    //after
    SparkMax leftLeader = new SparkMax(Constants.motorLLead, MotorType.kBrushed);
    SparkMax leftFollower = new SparkMax(Constants.motorLFollow, MotorType.kBrushed);
    SparkMax rightLeader = new SparkMax(Constants.motorRLead, MotorType.kBrushed);
    SparkMax rightFollower = new SparkMax(Constants.motorRFollow, MotorType.kBrushed);

    public final DifferentialDrive mDifferentialDrive = new DifferentialDrive(leftLeader, rightLeader);

    public DriveTrain() {

        //before
        // leftLeader = new SparkMax(Constants.motorLLead, MotorType.kBrushed);
        // leftFollower = new SparkMax(Constants.motorLFollow, MotorType.kBrushed);
        // rightLeader = new SparkMax(Constants.motorRLead, MotorType.kBrushed);
        // rightFollower = new SparkMax(Constants.motorRFollow, MotorType.kBrushed);
        
        // why isnt it named leftleadconfig????
        SparkMaxConfig globalConfig = new SparkMaxConfig();
        SparkMaxConfig leftLeaderConfig = new SparkMaxConfig();
        SparkMaxConfig rightLeaderConfig = new SparkMaxConfig();
        SparkMaxConfig leftFollowerConfig = new SparkMaxConfig();
        SparkMaxConfig rightFollowerConfig = new SparkMaxConfig();

        globalConfig
            .smartCurrentLimit(Constants.stallLimit)
            .idleMode(IdleMode.kBrake);
            // .inverted(true);

        leftLeaderConfig
            .apply(globalConfig)
            .inverted(true);;

        rightLeaderConfig
            .apply(globalConfig)
            .inverted(true);

        leftFollowerConfig
            .apply(globalConfig)
            .follow(leftLeader)
            .inverted(true);

        rightFollowerConfig
            .apply(globalConfig)
            .follow(rightLeader)
            ;

        leftLeader.configure(leftLeaderConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        leftFollower.configure(leftFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        rightLeader.configure(rightLeaderConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        rightFollower.configure(rightFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }
}
