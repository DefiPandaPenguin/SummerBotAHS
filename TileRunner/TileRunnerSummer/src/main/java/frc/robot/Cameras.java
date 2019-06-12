package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.cscore.UsbCamera;

public class Cameras {
    private UsbCamera cam0;

    public Cameras(){
        cam0 = CameraServer.getInstance().startAutomaticCapture(0);
        cam0.setResolution(320, 240);
        cam0.setFPS(10);
    }
}