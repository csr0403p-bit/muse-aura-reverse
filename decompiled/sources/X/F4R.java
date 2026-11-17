package X;

import android.app.Application;
import java.io.File;
import java.util.List;
import java.util.Random;

/* loaded from: classes5.dex */
public final class F4R implements C5E {
    public final int $t;

    public F4R(int i) {
        this.$t = i;
    }

    public static void A00(int i, List list) {
        list.add(new F4R(i));
    }

    @Override // X.C5E
    /* renamed from: create */
    public final Object create2(C3241C4y c3241C4y) {
        File fileA01;
        C76 c76;
        C3244C5b c3244C5b;
        switch (this.$t) {
            case 0:
            case 9:
            case 21:
                Application application = c3241C4y.A0E;
                C6P c6p = new C6P();
                c6p.A00 = application;
                return c6p;
            case 1:
            case 7:
            case 19:
                File fileA012 = c3241C4y.A03().A01(c3241C4y.A03().A07);
                if (fileA012 != null) {
                    return new C3229C4m(fileA012);
                }
                return null;
            case 2:
            case 8:
            case 20:
                File fileA013 = c3241C4y.A03().A01(c3241C4y.A0V.AMN());
                if (fileA013 != null) {
                    return new C6J(fileA013);
                }
                return null;
            case 3:
            case 10:
            case 22:
                fileA01 = c3241C4y.A03().A01(c3241C4y.A03().A07);
                if (fileA01 == null) {
                    return null;
                }
                break;
            case 4:
                BeS.A03(c3241C4y.A00, "Did you call earlyInit()?");
                return new C3270C6x(c3241C4y.A00);
            case 5:
                return new C8M();
            case 6:
            case 11:
            case 12:
                fileA01 = c3241C4y.A03().A05;
                BeS.A03(fileA01, "Did you call SessionManager.init()?");
                break;
            case 13:
                return new C6g(c3241C4y.A00, new C7432Evp(new Random()), BeS.A01(c3241C4y));
            case 14:
                return new C6F(c3241C4y.A0E, c3241C4y, this);
            case 15:
                synchronized (C3245C5c.class) {
                    c3244C5b = C3245C5c.A00;
                }
                if (c3244C5b == null) {
                    C3244C5b c3244C5b2 = new C3244C5b(c3241C4y, this);
                    synchronized (C3245C5c.class) {
                        C3245C5c.A00 = c3244C5b2;
                    }
                }
                return new C3240C4x(c3241C4y.A00, BeS.A01(c3241C4y));
            case 16:
                F18 f18 = c3241C4y.A0O;
                Application application2 = c3241C4y.A0E;
                C54 c54A01 = BeS.A01(c3241C4y);
                C3232C4p c3232C4p = c3241C4y.A00;
                synchronized (C76.class) {
                    c76 = C76.A08;
                    if (c76 == null) {
                        c76 = new C76();
                        C76.A08 = c76;
                    }
                }
                F18 f4a = c3241C4y.A03;
                if (f4a == null) {
                    f4a = new F4A(c3241C4y, 5);
                    c3241C4y.A03 = f4a;
                }
                C4X c4x = (C4X) f4a.AMN();
                C56 c56 = new C56(this);
                F18 f4a2 = c3241C4y.A07;
                if (f4a2 == null) {
                    f4a2 = new F4A(c3241C4y, 8);
                    c3241C4y.A07 = f4a2;
                }
                return new C75(application2, c76, c4x, f18 == null ? null : (C78) f18.AMN(), c3232C4p, c56, new C3238C4v(), c54A01, (C7B) f4a2.AMN());
            case 17:
                return new C5S(c3241C4y.A00, BeS.A01(c3241C4y));
            case 18:
                Application application3 = c3241C4y.A0E;
                C6Z c6z = new C6Z();
                c6z.A00 = application3;
                return c6z;
            default:
                return null;
        }
        return new C6A(c3241C4y.A03(), fileA01);
    }
}
