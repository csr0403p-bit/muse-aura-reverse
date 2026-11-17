package X;

import android.os.Process;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class FC9 implements InterfaceC7734FCl<C7715FBp, FBB, FCT<Object>> {
    public final FBB A00;
    public final C7707FBf A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0158  */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.AbstractList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FDW A00(X.FDW r18, X.FDW r19, X.FCE r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FC9.A00(X.FDW, X.FDW, X.FCE):X.FDW");
    }

    @Override // X.InterfaceC7734FCl
    public final /* bridge */ /* synthetic */ FCW AbX(FCX fcx, Object obj, List list) {
        RunnableFuture<C7674F9s> runnableFuture;
        C7674F9s c7674F9s;
        FDW fdw;
        Map<Integer, Object> map;
        C7715FBp c7715FBp = (C7715FBp) obj;
        C7707FBf c7707FBf = this.A01;
        FCY fcy = new FCY(fcx, this.A00);
        synchronized (c7707FBf) {
            runnableFuture = c7707FBf.A01;
            c7674F9s = c7707FBf.A00;
        }
        if (c7674F9s == null) {
            if (runnableFuture == null) {
                throw C3cG.A0Q("The future task is null but there is no computed result");
            }
            AtomicInteger atomicInteger = c7707FBf.A02;
            if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                runnableFuture.run();
            }
            c7674F9s = (C7674F9s) AbstractC8162FXe.A00(runnableFuture, atomicInteger.get());
            synchronized (c7707FBf) {
                c7707FBf.A00 = c7674F9s;
                c7707FBf.A01 = null;
            }
            C7384Etj.A0X(c7674F9s);
        }
        FCW<FDW, Map<Integer, Object>> fcw = c7715FBp != null ? c7715FBp.A00 : null;
        F9N f9n = F9N.A00;
        C7384Etj.A0Y(list, 3);
        FDW fdw2 = c7674F9s.A02;
        if (fcw != null) {
            fdw = (FDW) fcw.A00;
            map = fcw.A01;
            if (map == null) {
            }
            FCE fce = new FCE(fcy, f9n, BV4.A0t(list), map);
            FCW fcw2 = new FCW(A00(fdw2, fdw, fce), fce.A03, list);
            C7715FBp c7715FBp2 = new C7715FBp(fcw2, c7674F9s);
            return new FCW(c7715FBp2.A00.A00, c7715FBp2, fcw2.A02);
        }
        fdw = null;
        map = C9jH.A00;
        FCE fce2 = new FCE(fcy, f9n, BV4.A0t(list), map);
        FCW fcw22 = new FCW(A00(fdw2, fdw, fce2), fce2.A03, list);
        C7715FBp c7715FBp22 = new C7715FBp(fcw22, c7674F9s);
        return new FCW(c7715FBp22.A00.A00, c7715FBp22, fcw22.A02);
    }

    public FC9(FBB fbb, C7707FBf c7707FBf) {
        this.A00 = fbb;
        this.A01 = c7707FBf;
    }
}
