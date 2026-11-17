package X;

import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.F4v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7582F4v implements InterfaceC2641BgM {
    public final int $t;
    public final Object A00;

    public C7582F4v(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2641BgM
    public final void AT5(C2643Bga c2643Bga, Integer num) {
        BfA bfA;
        switch (this.$t) {
            case 0:
                C2602BfB c2602BfB = (C2602BfB) this.A00;
                c2602BfB.A01 = C2602BfB.A00(c2602BfB);
                Bj4 bj4 = ((C2665Bgy) c2602BfB.A05).A00;
                try {
                    if (AnonymousClass001.A1X(AbstractC2947Bpi.A01(bj4, 2).get())) {
                        C2602BfB c2602BfB2 = bj4.A04;
                        bj4.A0Q.execute(new BjO(bj4, c2602BfB2.A01, null, c2602BfB2.A04, FGI.A0H("MeteringRepeating", c2602BfB2.hashCode()), Collections.singletonList(EnumC2489BcG.METERING_REPEATING)));
                        return;
                    }
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    throw BV4.A0d("Unable to check if MeteringRepeating is attached.", e);
                }
            case 1:
                BfL bfL = (BfL) this.A00;
                if (bfL.A0B() != null) {
                    BoT.A00();
                    C2625Bfs c2625Bfs = bfL.A03;
                    if (c2625Bfs != null) {
                        C2625Bfs.A00(c2625Bfs);
                        bfL.A03 = null;
                    }
                    BjC bjC = bfL.A01;
                    if (bjC != null) {
                        bjC.A02();
                        bfL.A01 = null;
                    }
                    bfL.A04.A01();
                    bfL.A0H();
                    Bf7 bf7 = (Bf7) ((BfD) bfL).A05;
                    AbstractC2481Bc8 abstractC2481Bc8 = ((BfD) bfL).A04;
                    abstractC2481Bc8.getClass();
                    BgX bgXA00 = BfL.A00(bfL, bf7, abstractC2481Bc8);
                    bfL.A02 = bgXA00;
                    AbstractC2390BYs.A01(bfL, bgXA00);
                    bfA = bfL;
                    break;
                } else {
                    return;
                }
            case 2:
                C2605BfM c2605BfM = (C2605BfM) this.A00;
                if (c2605BfM.A0B() != null) {
                    Bi1 bi1 = c2605BfM.A02;
                    BoT.A00();
                    bi1.A02 = true;
                    Bi2 bi2 = bi1.A01;
                    if (bi2 != null) {
                        BoT.A00();
                        if (!bi2.A08.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException(3, "The request is aborted silently and retried.", null);
                            BoT.A00();
                            bi2.A03 = true;
                            ListenableFuture<Void> listenableFuture = bi2.A02;
                            listenableFuture.getClass();
                            listenableFuture.cancel(true);
                            bi2.A00.A04(imageCaptureException);
                            bi2.A01.A03(null);
                            BhR bhR = bi2.A05;
                            AbstractC2401BaE abstractC2401BaE = bi2.A06;
                            Bi1 bi12 = (Bi1) bhR;
                            BoT.A00();
                            AbstractC2875Bni.A01("TakePictureManager", "Add a new request for retrying.");
                            bi12.A04.addFirst(abstractC2401BaE);
                            bi12.A01();
                        }
                    }
                    Log.d("ImageCapture", "clearPipeline");
                    BoT.A00();
                    C2625Bfs c2625Bfs2 = c2605BfM.A04;
                    if (c2625Bfs2 != null) {
                        C2625Bfs.A00(c2625Bfs2);
                        c2605BfM.A04 = null;
                    }
                    Bi5 bi5 = c2605BfM.A01;
                    if (bi5 != null) {
                        bi5.A00();
                        c2605BfM.A01 = null;
                    }
                    String strA0H = c2605BfM.A0H();
                    Bf6 bf6 = (Bf6) ((BfD) c2605BfM).A05;
                    AbstractC2481Bc8 abstractC2481Bc82 = ((BfD) c2605BfM).A04;
                    abstractC2481Bc82.getClass();
                    BgX bgXA01 = C2605BfM.A01(c2605BfM, bf6, abstractC2481Bc82, strA0H);
                    c2605BfM.A03 = bgXA01;
                    AbstractC2390BYs.A01(c2605BfM, bgXA01);
                    c2605BfM.A0N();
                    Bi1 bi13 = c2605BfM.A02;
                    BoT.A00();
                    bi13.A02 = false;
                    bi13.A01();
                    return;
                }
                return;
            case 3:
                BfA bfA2 = (BfA) this.A00;
                if (bfA2.A0B() != null) {
                    BfA.A02(bfA2, (C2593Beq) ((BfD) bfA2).A05, ((BfD) bfA2).A04);
                    bfA = bfA2;
                    break;
                } else {
                    return;
                }
            case 4:
                Iterator<InterfaceC2641BgM> it = ((C2644Bgb) this.A00).A00.iterator();
                while (it.hasNext()) {
                    it.next().AT5(c2643Bga, num);
                }
                return;
            default:
                ((Bf9) this.A00).A0Y();
                return;
        }
        bfA.A0N();
    }
}
