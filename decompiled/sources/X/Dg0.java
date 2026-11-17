package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Dg0 extends Dg6 {
    public static final Executor A02 = new F52(0);
    public static volatile Dg0 A03;
    public Dg6 A00;
    public final Dg6 A01;

    public static Dg0 A00() {
        if (A03 == null) {
            synchronized (Dg0.class) {
                if (A03 == null) {
                    A03 = new Dg0();
                }
            }
        }
        return A03;
    }

    @Override // X.Dg6
    public final void A01(Runnable runnable) {
        this.A00.A01(runnable);
    }

    @Override // X.Dg6
    public final void A02(Runnable runnable) {
        this.A00.A02(runnable);
    }

    @Override // X.Dg6
    public final boolean A03() {
        return this.A00.A03();
    }

    public Dg0() {
        BrH brH = new BrH();
        this.A01 = brH;
        this.A00 = brH;
    }
}
