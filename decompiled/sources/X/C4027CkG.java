package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.CkG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4027CkG {
    public final C4035Ckb A00;
    public final CYA A01;
    public final ExecutorService A02;

    public C4027CkG(C4032CkY c4032CkY) {
        CYA cya = c4032CkY.A00;
        if (cya == null) {
            throw BV4.A0a("Missing engine");
        }
        this.A01 = cya;
        ExecutorService executorServiceNewFixedThreadPool = c4032CkY.A01;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
            c4032CkY.A01 = executorServiceNewFixedThreadPool;
        }
        this.A02 = executorServiceNewFixedThreadPool;
        this.A00 = new C4035Ckb(this);
    }
}
