package X;

import androidx.camera.core.ImageCaptureException;

/* renamed from: X.BiL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2702BiL implements Runnable {
    public static final String __redex_internal_original_name = "TakePictureRequest$$ExternalSyntheticLambda4";
    public final /* synthetic */ ImageCaptureException A00;
    public final /* synthetic */ AbstractC2401BaE A01;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2401BaE abstractC2401BaE = this.A01;
        ImageCaptureException imageCaptureException = this.A00;
        BiW biW = ((C2699Bi3) abstractC2401BaE).A05;
        if (biW == null) {
            throw C3cG.A0Q("One and only one callback is allowed.");
        }
        biW.onError(imageCaptureException);
    }

    public /* synthetic */ RunnableC2702BiL(ImageCaptureException imageCaptureException, AbstractC2401BaE abstractC2401BaE) {
        this.A01 = abstractC2401BaE;
        this.A00 = imageCaptureException;
    }
}
