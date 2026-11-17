package X;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EbR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6869EbR {
    public ExecutorService A01;
    public int A00 = 5;
    public final ArrayDeque<RunnableC6867EbP> A02 = BV4.A0s();
    public final ArrayDeque<RunnableC6867EbP> A03 = BV4.A0s();
    public final ArrayDeque<C6864EbM> A04 = BV4.A0s();

    public static final void A00(C6869EbR c6869EbR) {
        int i;
        ExecutorService threadPoolExecutor;
        byte[] bArr = AbstractC6843Eav.A06;
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (c6869EbR) {
            Iterator itA0N = C7384Etj.A0N(c6869EbR.A02);
            while (itA0N.hasNext()) {
                RunnableC6867EbP runnableC6867EbP = (RunnableC6867EbP) itA0N.next();
                ArrayDeque<RunnableC6867EbP> arrayDeque = c6869EbR.A03;
                if (arrayDeque.size() >= 64) {
                    break;
                }
                if (runnableC6867EbP.A01.get() < c6869EbR.A00) {
                    itA0N.remove();
                    runnableC6867EbP.A01.incrementAndGet();
                    arrayListA0h.add(runnableC6867EbP);
                    arrayDeque.add(runnableC6867EbP);
                }
            }
            c6869EbR.A03.size();
            c6869EbR.A04.size();
            i = 0;
        }
        int size = arrayListA0h.size();
        while (i < size) {
            int i2 = i + 1;
            RunnableC6867EbP runnableC6867EbP2 = (RunnableC6867EbP) arrayListA0h.get(i);
            synchronized (c6869EbR) {
                threadPoolExecutor = c6869EbR.A01;
                if (threadPoolExecutor == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    String strA0y = AnonymousClass006.A0y(" Dispatcher", AbstractC6843Eav.A00, C60O.A0w());
                    C7384Etj.A0Y(strA0y, 0);
                    threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new EcI(strA0y, false));
                    c6869EbR.A01 = threadPoolExecutor;
                }
                C7384Etj.A0X(threadPoolExecutor);
            }
            C6864EbM c6864EbM = runnableC6867EbP2.A02;
            C6859EbH c6859EbH = c6864EbM.A09;
            try {
                try {
                    threadPoolExecutor.execute(runnableC6867EbP2);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    c6864EbM.A01(interruptedIOException);
                    runnableC6867EbP2.A00.onFailure(c6864EbM, interruptedIOException);
                    c6859EbH.A0E.A01(runnableC6867EbP2);
                }
                i = i2;
            } catch (Throwable th) {
                c6859EbH.A0E.A01(runnableC6867EbP2);
                throw th;
            }
        }
    }

    public final void A01(RunnableC6867EbP runnableC6867EbP) {
        runnableC6867EbP.A01.decrementAndGet();
        ArrayDeque<RunnableC6867EbP> arrayDeque = this.A03;
        synchronized (this) {
            if (!arrayDeque.remove(runnableC6867EbP)) {
                throw BV4.A0N("Call wasn't in-flight!");
            }
        }
        A00(this);
    }
}
