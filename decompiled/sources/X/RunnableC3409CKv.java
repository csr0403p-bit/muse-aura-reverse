package X;

import java.util.concurrent.Callable;

/* renamed from: X.CKv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3409CKv implements Runnable {
    public static final String __redex_internal_original_name = "zzz";
    public final /* synthetic */ CSC A00;
    public final /* synthetic */ Callable A01;

    public RunnableC3409CKv(CSC csc, Callable callable) {
        this.A00 = csc;
        this.A01 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A0G(this.A01.call());
        } catch (Exception e) {
            this.A00.A0F(e);
        } catch (Throwable th) {
            this.A00.A0F(BV4.A0e(th));
        }
    }
}
