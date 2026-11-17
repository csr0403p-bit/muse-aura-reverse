package X;

import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FBf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7707FBf {
    public C7674F9s A00;
    public RunnableFuture<C7674F9s> A01;
    public final AtomicInteger A02;

    public C7707FBf(FBB fbb, C7684FAc c7684FAc, Map<String, ? extends Object> map) {
        C7384Etj.A0Y(fbb, 0);
        this.A02 = new AtomicInteger(-1);
        this.A01 = new FutureTask(new CallableC10631I0b(c7684FAc, fbb, map, 3));
    }
}
