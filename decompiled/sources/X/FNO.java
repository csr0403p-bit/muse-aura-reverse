package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class FNO<T> {
    public static final AtomicInteger A02 = new AtomicInteger(1);
    public final long A00;
    public final AbstractC7972FNn A01;

    public FNO(AbstractC7972FNn abstractC7972FNn, long j) {
        this.A01 = abstractC7972FNn;
        A02.getAndIncrement();
        this.A00 = j;
    }
}
