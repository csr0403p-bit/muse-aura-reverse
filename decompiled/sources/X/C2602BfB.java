package X;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.BfB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2602BfB {
    public BjC A00;
    public C2643Bga A01;
    public final Size A03;
    public final BhK A05;
    public final C2491BcI A06 = new C2491BcI();
    public C2625Bfs A02 = null;
    public final Ber A04 = new Ber();

    public static final C2643Bga A00(C2602BfB c2602BfB) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = c2602BfB.A03;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        BgX bgXA00 = BgX.A00(size, c2602BfB.A04);
        bgXA00.A04.A00 = 1;
        BhY bhY = new BhY(surface);
        c2602BfB.A00 = bhY;
        AbstractC2942BpW.A03(new F59(surfaceTexture, surface, c2602BfB, 0), AbstractC2942BpW.A01(bhY.A08), ExecutorC2446BbZ.A00());
        bgXA00.A03(C2507Bcd.A07, c2602BfB.A00, -1);
        C2625Bfs c2625Bfs = c2602BfB.A02;
        if (c2625Bfs != null) {
            c2625Bfs.A00.set(true);
        }
        C2625Bfs c2625Bfs2 = new C2625Bfs(new C7582F4v(c2602BfB, 0));
        c2602BfB.A02 = c2625Bfs2;
        bgXA00.A02 = c2625Bfs2;
        return bgXA00.A01();
    }

    public C2602BfB(Bb2 bb2, BhK bhK, C2476Bc3 c2476Bc3) throws CloneNotSupportedException {
        Size size;
        this.A05 = bhK;
        Size[] sizeArrA02 = c2476Bc3.A01().A02(34);
        if (sizeArrA02 == null) {
            AbstractC2875Bni.A02("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (this.A06.A00 != null && BV6.A1a("Huawei") && BV6.A1Z("mha-l29")) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (Size size2 : sizeArrA02) {
                    if (C2491BcI.A02.compare(size2, C2491BcI.A01) >= 0) {
                        arrayListA0h.add(size2);
                    }
                }
                sizeArrA02 = (Size[]) arrayListA0h.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrA02);
            C7572F4l.A00(0, listAsList);
            if (bb2.A03 == null) {
                bb2.A03 = Bb2.A00(bb2);
            }
            long jMin = Math.min(BV8.A0K(bb2.A03), 307200L);
            int length = sizeArrA02.length;
            size = null;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size3 = sizeArrA02[i];
                long jA0K = BV8.A0K(size3);
                if (jA0K != jMin) {
                    if (jA0K > jMin) {
                        if (size == null) {
                            break;
                        }
                    } else {
                        i++;
                        size = size3;
                    }
                } else {
                    size = size3;
                    break;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.A03 = size;
        AbstractC2875Bni.A01("MeteringRepeating", AnonymousClass007.A0a("MeteringSession SurfaceTexture size: ", size));
        this.A01 = A00(this);
    }
}
