package X;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes5.dex */
public final class Bi6 {
    public C2863BnN A00;
    public BiX A01;
    public AbstractC2814Blr A03;
    public Bi7 A04 = null;
    public C2862BnM A02 = null;

    public final int A00() {
        int iAHQ;
        BoT.A00();
        C2863BnN c2863BnN = this.A00;
        BeS.A07(AnonymousClass002.A1X(c2863BnN), "The ImageReader is not initialized.");
        synchronized (c2863BnN.A05) {
            iAHQ = c2863BnN.A04.AHQ() - c2863BnN.A00;
        }
        return iAHQ;
    }

    public final void A01(Bi7 bi7) {
        BoT.A00();
        BeS.A07(AnonymousClass002.A1Q(bi7.A0A.size(), 1), "only one capture stage is supported.");
        BeS.A07(A00() > 0, "Too many acquire images. Close image to be able to process next.");
        this.A04 = bi7;
        ExecutorC2446BbZ.A02(bi7.A08, bi7, this, 5);
    }

    public final void A02(AbstractC2816Blt abstractC2816Blt) {
        boolean z;
        BoT.A00();
        Bi7 bi7 = this.A04;
        if (bi7 != null) {
            Bi9 bi9 = (Bi9) abstractC2816Blt;
            if (bi7.A02 == bi9.A00) {
                ImageCaptureException imageCaptureException = bi9.A01;
                Bi2 bi2 = (Bi2) bi7.A07;
                BoT.A00();
                if (bi2.A03) {
                    return;
                }
                AbstractC2401BaE abstractC2401BaE = bi2.A06;
                BoT.A00();
                int i = abstractC2401BaE.A00;
                if (i > 0) {
                    z = true;
                    abstractC2401BaE.A00 = i - 1;
                } else {
                    z = false;
                    Bi2.A00(imageCaptureException, bi2);
                }
                Bi2.A01(bi2);
                bi2.A00.A04(imageCaptureException);
                if (z) {
                    Bi1 bi1 = (Bi1) bi2.A05;
                    BoT.A00();
                    AbstractC2875Bni.A01("TakePictureManager", "Add a new request for retrying.");
                    bi1.A04.addFirst(abstractC2401BaE);
                    bi1.A01();
                }
            }
        }
    }
}
