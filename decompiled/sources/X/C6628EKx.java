package X;

import java.util.Map;

/* renamed from: X.EKx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6628EKx {
    public static final String A04 = EK9.A01("DelayedWorkTracker");
    public final ENJ A00;
    public final ELY A01;
    public final Map<String, Runnable> A02 = BV4.A0u();
    public final ED6 A03;

    public C6628EKx(ED6 immediateScheduler, ENJ runnableScheduler, ELY clock) {
        this.A01 = clock;
        this.A00 = runnableScheduler;
        this.A03 = immediateScheduler;
    }
}
