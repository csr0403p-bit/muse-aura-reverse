package X;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EOG<V> implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Function0<Boolean> A03;
    public final /* synthetic */ EOW A04;
    public final /* synthetic */ EP0 A05;
    public final /* synthetic */ EOH A06;

    public EOG(Context context, String str, Function0 function0, EOW eow, EP0 ep0, EOH eoh, int i) {
        this.A01 = context;
        this.A05 = ep0;
        this.A06 = eoh;
        this.A04 = eow;
        this.A02 = str;
        this.A03 = function0;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ReentrantReadWriteLock reentrantReadWriteLock = AbstractC6667EOc.A00;
        Context context = this.A01;
        EP0 ep0 = this.A05;
        EOH eoh = this.A06;
        EOW eow = this.A04;
        String str = this.A02;
        Function0<Boolean> function0 = this.A03;
        int i = this.A00;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            EOB eob = EOB.A05;
            return EOB.A00(context, null, eoh.A00, str, eoh.A01, function0, eob, eow, ep0, i);
        } finally {
            lock.unlock();
        }
    }
}
