/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class Controls {
    // Axis
    private static final int AXIS_LEFT_X = 0;
    private static final int AXIS_LEFT_Y = 1;
    private static final int AXIS_SHOULDER_L = 2;
	private static final int AXIS_SHOULDER_R = 3;
	private static final int AXIS_RIGHT_X = 4;
    private static final int AXIS_RIGHT_Y = 5;

    private Joystick joystick = new Joystick(0);

    //creates Joystick Object
    public Controls() {
        //super(ControlsPort);
    }

    //Returns X pos of the left stick
    public double getX() {
        return joystick.getRawAxis(AXIS_LEFT_X);
    }
    //Returns X of the Right Stick
    
    //Returns Y pos of the left stick
    public double getY() {
        return joystick.getRawAxis(AXIS_LEFT_Y);
    }

    
	

}
