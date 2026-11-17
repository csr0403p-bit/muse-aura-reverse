package X;

import android.os.Handler;

/* renamed from: X.DSv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5062DSv {
    public RunnableC5063DSw A00;
    public final C5303Dfm A01;
    public final Handler A02 = C60O.A02();

    public static final void A00(EnumC3085Bxl enumC3085Bxl, C5062DSv c5062DSv) {
        RunnableC5063DSw runnableC5063DSw = c5062DSv.A00;
        if (runnableC5063DSw != null) {
            runnableC5063DSw.run();
        }
        RunnableC5063DSw runnableC5063DSw2 = new RunnableC5063DSw(enumC3085Bxl, c5062DSv.A01);
        c5062DSv.A00 = runnableC5063DSw2;
        c5062DSv.A02.postAtFrontOfQueue(runnableC5063DSw2);
    }

    public C5062DSv(C1HY c1hy) {
        this.A01 = new C5303Dfm(c1hy, true);
    }
}
