package X;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.EuP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7391EuP<TResult> {
    public final Exception A03() {
        Exception exc;
        CE0 ce0 = (CE0) this;
        synchronized (ce0.A04) {
            CE0.A00(ce0);
            exc = ce0.A00;
        }
        return exc;
    }

    public final TResult A04() {
        TResult tresult;
        CE0 ce0 = (CE0) this;
        synchronized (ce0.A04) {
            CE0.A00(ce0);
            tresult = ce0.A01;
        }
        return tresult;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/concurrent/Executor;LX/CEB<TTResult;>;)LX/EuP<TTResult;>; */
    public final void A05(CEB ceb, Executor executor) {
        CE0 ce0 = (CE0) this;
        C7384Etj.A0Y(executor, 0);
        CE1<TResult> ce1 = new CE1<>(ceb, executor);
        synchronized (ce0.A04) {
            ArrayList<CE1<TResult>> arrayListA0h = ce0.A02;
            if (arrayListA0h == null) {
                arrayListA0h = C3cG.A0h();
                ce0.A02 = arrayListA0h;
            }
            arrayListA0h.add(ce1);
        }
        CE0.A02(ce0);
    }
}
