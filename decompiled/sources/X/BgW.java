package X;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes5.dex */
public class BgW implements InterfaceC2656Bgo {
    public static final BgW A00 = new BgW();

    /* JADX WARN: Incorrect types in method signature: (LX/BfN<*>;LX/Bgc;)V */
    @Override // X.InterfaceC2656Bgo
    public void Ahg(C2645Bgc c2645Bgc, BfN bfN) {
        C2646Bgd c2646Bgd = (C2646Bgd) bfN.Abl(BfN.A02, null);
        InterfaceC2585Beh interfaceC2585Beh = C2584Beg.A01;
        int i = new C2645Bgc().A01().A00;
        if (c2646Bgd != null) {
            i = c2646Bgd.A00;
            c2645Bgc.A03(c2646Bgd.A04);
            interfaceC2585Beh = c2646Bgd.A02;
        }
        c2645Bgc.A02 = C2582Bee.A01(interfaceC2585Beh);
        InterfaceC2585Beh interfaceC2585Beh2 = new BgY(bfN).A00;
        c2645Bgc.A00 = AnonymousClass001.A0F(interfaceC2585Beh2.Abl(BgY.A06, Integer.valueOf(i)));
        BV7.A1E(new C2657Bgp((CameraCaptureSession.CaptureCallback) interfaceC2585Beh2.Abl(BgY.A02, new C2706Bic())), c2645Bgc.A04);
        c2645Bgc.A02(new C2592Beo(InterfaceC2585Beh.A00(interfaceC2585Beh2)));
    }
}
