package X;

/* loaded from: classes6.dex */
public final class GCE extends GCH {
    public static final String __redex_internal_original_name = "TaskImpl";
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Task[");
        Runnable runnable = this.A00;
        AbstractC7609F5w.A1L(sbA0x, runnable);
        sbA0x.append('@');
        AbstractC7609F5w.A1K(sbA0x, runnable);
        sbA0x.append(", ");
        sbA0x.append(super.A00);
        sbA0x.append(", ");
        boolean z = this.A01;
        int i = HlS.A01;
        sbA0x.append(z ? "Blocking" : "Non-blocking");
        return BV5.A0o(sbA0x);
    }

    public GCE(long j, Runnable runnable, boolean z) {
        super.A00 = j;
        this.A01 = z;
        this.A00 = runnable;
    }
}
