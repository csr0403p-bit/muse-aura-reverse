package X;

import android.view.Choreographer;
import java.util.List;

/* renamed from: X.Ayl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC2120Ayl implements Runnable, Choreographer.FrameCallback {
    public static final String __redex_internal_original_name = "AndroidUiDispatcher$dispatchCallback$1";
    public final /* synthetic */ C2119Ayk A00;

    public RunnableC2120Ayl(C2119Ayk c2119Ayk) {
        this.A00 = c2119Ayk;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C2119Ayk c2119Ayk = this.A00;
        c2119Ayk.A04.removeCallbacks(this);
        C2119Ayk.A00(c2119Ayk);
        synchronized (c2119Ayk.A08) {
            if (c2119Ayk.A02) {
                c2119Ayk.A02 = false;
                List<Choreographer.FrameCallback> list = c2119Ayk.A01;
                c2119Ayk.A01 = c2119Ayk.A00;
                c2119Ayk.A00 = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2119Ayk c2119Ayk = this.A00;
        C2119Ayk.A00(c2119Ayk);
        synchronized (c2119Ayk.A08) {
            if (c2119Ayk.A01.isEmpty()) {
                c2119Ayk.A05.removeFrameCallback(this);
                c2119Ayk.A02 = false;
            }
        }
    }
}
