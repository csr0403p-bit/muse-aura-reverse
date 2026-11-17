package X;

import androidx.camera.core.ImageCaptureException;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class Bi2 implements BlY {
    public C3010Brs<Void> A00;
    public C3010Brs<Void> A01;
    public ListenableFuture<Void> A02;
    public final BhR A05;
    public final AbstractC2401BaE A06;
    public boolean A03 = false;
    public boolean A04 = false;
    public final ListenableFuture<Void> A07 = AbstractC2947Bpi.A01(this, 14);
    public final ListenableFuture<Void> A08 = AbstractC2947Bpi.A01(this, 15);

    public static void A01(Bi2 bi2) {
        BeS.A07(!bi2.A08.isDone(), "The callback can only complete once.");
        bi2.A01.A03(null);
    }

    public Bi2(BhR bhR, AbstractC2401BaE abstractC2401BaE) {
        this.A06 = abstractC2401BaE;
        this.A05 = bhR;
    }

    public static void A00(ImageCaptureException imageCaptureException, Bi2 bi2) {
        BoT.A00();
        AbstractC2401BaE abstractC2401BaE = bi2.A06;
        ((C2699Bi3) abstractC2401BaE).A08.execute(new RunnableC2702BiL(imageCaptureException, abstractC2401BaE));
    }

    @Override // X.BlY
    public final void onCaptureStarted() {
        BoT.A00();
        if (this.A03 || this.A04) {
            return;
        }
        this.A04 = true;
        BiW biW = ((C2699Bi3) this.A06).A05;
        if (biW != null) {
            biW.onCaptureStarted();
        }
    }
}
