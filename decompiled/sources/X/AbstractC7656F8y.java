package X;

/* renamed from: X.F8y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7656F8y {
    public static C7616F6s A00(F9C f9c, F94 f94, String str) {
        F9C f9c2 = new F9C(f9c);
        C7616F6s c7616F6s = new C7616F6s();
        if (f94.AXl() != C79.A0C) {
            f94.Afp();
            c7616F6s = null;
        } else {
            while (f94.ARK() != C79.A0K) {
                String strAXk = f94.AXk();
                boolean zA1P = BV5.A1P(FBK.A00(strAXk), 32);
                f94.ARK();
                if (!zA1P) {
                    if ("id".equals(strAXk)) {
                        c7616F6s.A01 = F94.A01(f94);
                    } else if ("payload".equals(strAXk)) {
                        c7616F6s.A00 = AbstractC7653F8v.A00(f9c2, f94);
                    }
                }
                f94.Afp();
            }
        }
        if (str != null) {
            f9c2.A00(str, c7616F6s.A01);
        }
        return c7616F6s;
    }
}
