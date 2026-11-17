package X;

import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class GZZ extends AbstractC9635GVx {
    public CameraApi A00;

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setApi(CameraApi cameraApi) {
        C7384Etj.A0Y(cameraApi, 0);
        this.A00 = cameraApi;
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final ArrayList<Camera> createAvailableCameras() {
        return AbstractC0885AGm.A0x(Camera.FRONT_FACING_CAMERA, Camera.BACK_FACING_CAMERA);
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void release() {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCamera(Camera camera) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraMode(int i) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetFps(int i) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setCameraOn(boolean z, int i) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final void setTargetCaptureResolution(int i, int i2) {
    }

    @Override // com.facebook.rsys.camera.gen.CameraProxy
    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return 0;
    }
}
