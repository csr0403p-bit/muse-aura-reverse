package X;

/* loaded from: classes6.dex */
public abstract class FB6 {
    public static FDW A00(F9b f9b, FAW faw) {
        FDW fdw;
        if (f9b.A08 != null) {
            fdw = f9b.A0Q;
        } else {
            C7674F9s c7674F9s = f9b.A07;
            if (c7674F9s == null) {
                return null;
            }
            fdw = c7674F9s.A02;
        }
        if (fdw == null) {
            return null;
        }
        FB7 fb7 = new FB7(faw);
        FB5.A00(fdw, fb7, 0);
        return fb7.A00;
    }
}
