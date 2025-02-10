// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {
  public static final int joyPort = 0;

  public static final int motorLLead = 3;
  public static final int motorLFollow = 2;
  public static final int motorRLead = 5;
  public static final int motorRFollow = 4;
  public static final int motorShooter = 1;

  public static final double steerSpeed = .75; // -1.0 to 1.0
  public static final double driveSpeed = 1.0; // -1.0 to 1.0

  public static final int stallLimit = 50;

  public static final double shootSpeed = .4; // -1.0 to 1.0
  public static boolean shootMotorInverted = false;
}
