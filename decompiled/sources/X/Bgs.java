package X;

import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class Bgs extends CameraDevice.StateCallback {
    public final List<CameraDevice.StateCallback> A00 = C3cG.A0h();

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Iterator<CameraDevice.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Iterator<CameraDevice.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        Iterator<CameraDevice.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Iterator<CameraDevice.StateCallback> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onOpened(cameraDevice);
        }
    }

    public Bgs(List<CameraDevice.StateCallback> list) {
        for (CameraDevice.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof C2659Bgr)) {
                this.A00.add(stateCallback);
            }
        }
    }
}
