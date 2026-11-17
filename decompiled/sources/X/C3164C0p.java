package X;

import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.C0p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3164C0p {
    public final C3167C0s A00;
    public final List<BYO> A01;
    public final int A02;
    public final Handler A03;
    public final Runnable A04;

    public static final void A00(C3164C0p c3164C0p) {
        int i = c3164C0p.A02;
        if (i > 0) {
            c3164C0p.A03.postDelayed(c3164C0p.A04, TimeUnit.SECONDS.toMillis(i));
        }
    }

    public C3164C0p(Handler handler, C3167C0s c3167C0s, int i) {
        this.A00 = c3167C0s;
        this.A03 = handler;
        this.A02 = i;
        List<BYO> listSynchronizedList = Collections.synchronizedList(BV4.A0y());
        C7384Etj.A0U(listSynchronizedList);
        this.A01 = listSynchronizedList;
        this.A04 = new RunnableC3165C0q(this);
        A00(this);
    }
}
