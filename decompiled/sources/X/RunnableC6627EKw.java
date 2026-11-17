package X;

/* renamed from: X.EKw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6627EKw implements Runnable {
    public static final String __redex_internal_original_name = "DelayedWorkTracker$1";
    public final /* synthetic */ C6628EKx A00;
    public final /* synthetic */ EKE A01;

    public RunnableC6627EKw(final C6628EKx this$0, final EKE val$workSpec) {
        this.A00 = this$0;
        this.A01 = val$workSpec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EK9 ek9A00 = EK9.A00();
        String str = C6628EKx.A04;
        EKE eke = this.A01;
        BV4.A1E(ek9A00, "Scheduling work ", eke.A0O, str);
        this.A00.A01.Ac8(eke);
    }
}
