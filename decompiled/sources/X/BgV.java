package X;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* loaded from: classes5.dex */
public final class BgV extends BgW {
    public static final BgV A01 = new BgV(new BhM());
    public final BhM A00;

    public BgV(BhM bhM) {
        this.A00 = bhM;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BfN<*>;LX/Bgc;)V */
    @Override // X.BgW, X.InterfaceC2656Bgo
    public final void Ahg(C2645Bgc c2645Bgc, BfN bfN) {
        CaptureRequest.Key key;
        super.Ahg(c2645Bgc, bfN);
        if (!(bfN instanceof Bf6)) {
            throw C60O.A0i("config is not ImageCaptureConfig");
        }
        BgU bgU = new BgU();
        AbstractC2531BdI<Integer> abstractC2531BdI = Bf6.A05;
        C2584Beg c2584Beg = ((Bf6) bfN).A00;
        if (c2584Beg.A74(abstractC2531BdI)) {
            int iA0F = AnonymousClass001.A0F(c2584Beg.Abk(abstractC2531BdI));
            if (AbstractC2398BaB.A00.A01(ImageCapturePixelHDRPlusQuirk.class) != null) {
                boolean z = true;
                if (iA0F == 0) {
                    key = CaptureRequest.CONTROL_ENABLE_ZSL;
                } else if (iA0F == 1) {
                    key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    z = false;
                }
                bgU.A01(key, Boolean.valueOf(z));
            }
        }
        C2592Beo.A00(bgU, c2645Bgc);
    }
}
