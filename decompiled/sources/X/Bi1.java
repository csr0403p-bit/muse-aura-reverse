package X;

import androidx.camera.core.ImageCaptureException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class Bi1 implements InterfaceC2889Bnx, BhR {
    public Bi5 A00;
    public Bi2 A01;
    public final InterfaceC2795BlW A03;
    public final List<Bi2> A05;
    public final Deque<AbstractC2401BaE> A04 = BV4.A0s();
    public boolean A02 = false;

    public Bi1(InterfaceC2795BlW interfaceC2795BlW) {
        BoT.A00();
        this.A03 = interfaceC2795BlW;
        this.A05 = C3cG.A0h();
    }

    public final void A00() {
        BoT.A00();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Deque<AbstractC2401BaE> deque = this.A04;
        for (AbstractC2401BaE abstractC2401BaE : deque) {
            ((C2699Bi3) abstractC2401BaE).A08.execute(new RunnableC2702BiL(imageCaptureException, abstractC2401BaE));
        }
        deque.clear();
        Iterator itA0z = BV5.A0z(this.A05);
        while (itA0z.hasNext()) {
            Bi2 bi2 = (Bi2) itA0z.next();
            BoT.A00();
            if (!bi2.A08.isDone()) {
                BoT.A00();
                bi2.A03 = true;
                ListenableFuture<Void> listenableFuture = bi2.A02;
                listenableFuture.getClass();
                listenableFuture.cancel(true);
                bi2.A00.A04(imageCaptureException);
                bi2.A01.A03(null);
                Bi2.A00(imageCaptureException, bi2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bi1.A01():void");
    }

    @Override // X.InterfaceC2889Bnx
    public final void ATY(InterfaceC2873Bng interfaceC2873Bng) {
        BoS.A00().execute(new Runnable() { // from class: X.BiZ
            public static final String __redex_internal_original_name = "TakePictureManager$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A01();
            }
        });
    }
}
