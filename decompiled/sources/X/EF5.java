package X;

import android.os.Build;

/* loaded from: classes5.dex */
public final class EF5 {
    public final DAF A00;
    public final EF1 A01;
    public final EFD A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.EFR] */
    public EF5() {
        int i = Build.VERSION.SDK_INT;
        EEw eEw = new EEw(i);
        ?? r2 = new Object() { // from class: X.EFR
        };
        DAF daf = new DAF(eEw);
        this.A00 = daf;
        this.A01 = new EF1(eEw, daf, i);
        this.A02 = new EFD(r2, daf);
    }
}
