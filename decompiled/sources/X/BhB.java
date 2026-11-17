package X;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* loaded from: classes5.dex */
public final class BhB implements BhI {
    public final InterfaceC2670BhE A00;

    @Override // X.BhI
    public final InterfaceC2670BhE A7I(long j) {
        return new BhB(j);
    }

    @Override // X.InterfaceC2670BhE
    public final long ALi() {
        return this.A00.ALi();
    }

    @Override // X.InterfaceC2670BhE
    public final BhF AVa(InterfaceC2676BhQ interfaceC2676BhQ) {
        if (this.A00.AVa(interfaceC2676BhQ).A02) {
            return BhF.A04;
        }
        Throwable th = ((Bh8) interfaceC2676BhQ).A02;
        if (th instanceof CameraValidator$CameraIdListIncorrectException) {
            AbstractC2875Bni.A02("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
            if (((CameraValidator$CameraIdListIncorrectException) th).mAvailableCameraCount > 0) {
                return BhF.A03;
            }
        }
        return BhF.A05;
    }

    public BhB(long j) {
        this.A00 = new C2669BhD(j);
    }
}
