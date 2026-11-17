package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class CT3 {
    public final void A00(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Throwable> listPutIfAbsent;
        if (this instanceof C3548CTh) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            return;
        }
        if (this instanceof CUH) {
            CUH cuh = (CUH) this;
            if (th2 == th) {
                throw BV4.A0Q("Self suppression is not allowed.", th2);
            }
            CUI cui = cuh.A00;
            ReferenceQueue<Throwable> referenceQueue = cui.A00;
            while (true) {
                Reference<? extends Throwable> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    break;
                } else {
                    cui.A01.remove(referencePoll);
                }
            }
            EvR evR = new EvR(th, null);
            ConcurrentHashMap<EvR, List<Throwable>> concurrentHashMap = cui.A01;
            List<Throwable> listA0v = BV6.A0v(evR, concurrentHashMap);
            if (listA0v != null || (listPutIfAbsent = concurrentHashMap.putIfAbsent(new EvR(th, referenceQueue), (listA0v = new Vector<>(2)))) == null) {
                listPutIfAbsent = listA0v;
            }
            listPutIfAbsent.add(th2);
        }
    }
}
