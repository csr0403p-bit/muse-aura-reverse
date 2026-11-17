package X;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;

/* loaded from: classes5.dex */
public final class BjK implements InterfaceC2804Blh {
    public ImageWriter A00;
    public C2863BnN A01;
    public BeX A02;
    public BjC A03;
    public boolean A04;
    public boolean A07;
    public final C2476Bc3 A08;
    public final BnB A09;
    public boolean A06 = false;
    public boolean A05 = false;

    public BjK(C2476Bc3 c2476Bc3) {
        this.A08 = c2476Bc3;
        int[] iArr = (int[]) c2476Bc3.A02(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 4) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.A04 = z;
        this.A07 = AbstractC2398BaB.A00.A01(ZslDisablerQuirk.class) != null;
        this.A09 = new BnB(new BlN() { // from class: X.BlK
        }, 3);
    }
}
