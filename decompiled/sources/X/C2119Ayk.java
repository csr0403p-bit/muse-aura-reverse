package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;

/* renamed from: X.Ayk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2119Ayk extends GBK {
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final Choreographer A05;
    public final BQr A06;
    public static final F0C<C78T> A0B = AbstractC5321DgF.A03(new BUS(22));
    public static final ThreadLocal<C78T> A0A = new C2118Ayj();
    public final Object A08 = C3cG.A0T();
    public final AIG<Runnable> A09 = new AIG<>();
    public List<Choreographer.FrameCallback> A01 = C3cG.A0h();
    public List<Choreographer.FrameCallback> A00 = C3cG.A0h();
    public final RunnableC2120Ayl A07 = new RunnableC2120Ayl(this);

    public static final void A00(C2119Ayk c2119Ayk) {
        AIG<Runnable> aig;
        Runnable runnableRemoveFirst;
        boolean z;
        while (true) {
            Object obj = c2119Ayk.A08;
            synchronized (obj) {
                aig = c2119Ayk.A09;
                runnableRemoveFirst = aig.isEmpty() ? null : aig.removeFirst();
            }
            if (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
            } else {
                synchronized (obj) {
                    z = true;
                    if (aig.isEmpty()) {
                        z = false;
                        c2119Ayk.A03 = false;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    @Override // X.GBK
    public final void dispatch(C78T c78t, Runnable runnable) {
        synchronized (this.A08) {
            this.A09.addLast(runnable);
            if (!this.A03) {
                this.A03 = true;
                Handler handler = this.A04;
                RunnableC2120Ayl runnableC2120Ayl = this.A07;
                handler.post(runnableC2120Ayl);
                if (!this.A02) {
                    this.A02 = true;
                    this.A05.postFrameCallback(runnableC2120Ayl);
                }
            }
        }
    }

    public C2119Ayk(Handler handler, Choreographer choreographer) {
        this.A05 = choreographer;
        this.A04 = handler;
        this.A06 = new C2121Aym(choreographer, this);
    }
}
