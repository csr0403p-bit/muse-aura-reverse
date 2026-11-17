package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GSt implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordingStateTracker$notifyExactRecordingSilencedListeners$1";
    public final /* synthetic */ C9621GSq A00;

    public GSt(C9621GSq c9621GSq) {
        this.A00 = c9621GSq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C9621GSq c9621GSq = this.A00;
        ReentrantLock reentrantLock = c9621GSq.A0D;
        reentrantLock.lock();
        try {
            Map<G0U<Boolean, Unit>, GSw> map = c9621GSq.A0B;
            List listA0B = AbstractC3060BvS.A0B((Map) map);
            reentrantLock.unlock();
            Iterator it = listA0B.iterator();
            while (it.hasNext()) {
                HxE hxEA10 = C60Q.A10(it);
                A a = hxEA10.first;
                GSw gSw = (GSw) hxEA10.second;
                reentrantLock.lock();
                if (map.get(a) == gSw) {
                    long j = gSw.A00 + 1;
                    gSw.A00 = j;
                    HxE hxEA0r = C3cG.A0r(Long.valueOf(j), Long.valueOf(c9621GSq.A01));
                    reentrantLock.unlock();
                    gSw.A03.invoke(new C8185FYc(hxEA0r, a, gSw, c9621GSq, 30));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
