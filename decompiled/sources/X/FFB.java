package X;

import android.os.Looper;

/* loaded from: classes6.dex */
public final class FFB {
    public final FFF A00;
    public final FFA A01 = new FFA(Looper.getMainLooper(), this);
    public final FBB A02;
    public final FDW A03;

    public FFB(FBB fbb, FDW fdw, int i) {
        this.A03 = fdw;
        this.A02 = fbb;
        this.A00 = new FFF(i);
    }
}
