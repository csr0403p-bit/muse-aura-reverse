package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FCu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7743FCu {
    public static Handler A00;
    public static final List<RunnableC7745FCw> A01 = C3cG.A0h();

    public static synchronized Handler A00() {
        if (A00 == null) {
            HandlerThread handlerThreadA0C = BV5.A0C("BackgroundLayoutPreparer", 5);
            A00 = new Handler(handlerThreadA0C.getLooper());
            handlerThreadA0C.getThreadId();
        }
        return A00;
    }

    public static synchronized void A01(int i, boolean z, List list) {
        Handler handlerA00 = A00();
        List<RunnableC7745FCw> list2 = A01;
        Iterator<RunnableC7745FCw> it = list2.iterator();
        while (it.hasNext()) {
            RunnableC7745FCw next = it.next();
            if (next.A00 == i) {
                next.A01.A00.compareAndSet(false, true);
            }
            C7746FCx c7746FCx = next.A01;
            if (c7746FCx.A00.get()) {
                handlerA00.removeCallbacksAndMessages(c7746FCx);
                it.remove();
            }
        }
        C7746FCx c7746FCx2 = new C7746FCx();
        final RunnableC7745FCw runnableC7745FCw = new RunnableC7745FCw(c7746FCx2, list, i, z);
        list2.add(runnableC7745FCw);
        handlerA00.postAtTime(new Runnable() { // from class: X.FCv
            public static final String __redex_internal_original_name = "BackgroundPreparer$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC7745FCw runnableC7745FCw2 = runnableC7745FCw;
                runnableC7745FCw2.run();
                synchronized (C7743FCu.class) {
                    C7743FCu.A01.remove(runnableC7745FCw2);
                }
            }
        }, c7746FCx2, 0L);
    }
}
