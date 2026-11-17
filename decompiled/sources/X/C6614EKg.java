package X;

import androidx.work.impl.WorkDatabase;

/* renamed from: X.EKg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6614EKg implements EL0 {
    public final ENK A00;
    public final EL5 A01;
    public final ENP A02;

    static {
        EK9.A01("WMFgUpdater");
    }

    public C6614EKg(WorkDatabase workDatabase, ENK foregroundProcessor, ENP taskExecutor) {
        this.A00 = foregroundProcessor;
        this.A02 = taskExecutor;
        this.A01 = F0C.A01(workDatabase);
    }
}
