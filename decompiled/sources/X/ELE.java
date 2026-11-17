package X;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes5.dex */
public final class ELE implements ENI {
    public static final String A02 = EK9.A01("WorkProgressUpdater");
    public final WorkDatabase A00;
    public final ENP A01;

    public ELE(WorkDatabase workDatabase, ENP taskExecutor) {
        this.A00 = workDatabase;
        this.A01 = taskExecutor;
    }
}
