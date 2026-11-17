package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GI2 {
    public static final C9411GIa A00;
    public static final Class A01;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A01 = cls;
        A00 = new C9411GIa();
    }

    public static Object A04(Object obj, Object obj2, int i, int i2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            GI0 gi0 = (GI0) obj;
            GI4 gi4 = gi0.b;
            obj3 = gi4;
            if (gi4 == GI4.A05) {
                GI4 gi42 = new GI4(new int[8], new Object[8], 0, true);
                gi0.b = gi42;
                obj3 = gi42;
            }
        }
        ((GI4) obj3).A02(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void A05(Object obj, Object obj2) {
        GI0 gi0 = (GI0) obj;
        GI4 gi4 = gi0.b;
        GI4 gi42 = ((GI0) obj2).b;
        GI4 gi43 = GI4.A05;
        if (!gi43.equals(gi42)) {
            if (gi43.equals(gi4)) {
                int i = gi4.A00 + gi42.A00;
                int[] iArrCopyOf = Arrays.copyOf(gi4.A03, i);
                System.arraycopy(gi42.A03, 0, iArrCopyOf, gi4.A00, gi42.A00);
                Object[] objArrCopyOf = Arrays.copyOf(gi4.A04, i);
                System.arraycopy(gi42.A04, 0, objArrCopyOf, gi4.A00, gi42.A00);
                gi4 = new GI4(iArrCopyOf, objArrCopyOf, i, true);
            } else {
                gi4.getClass();
                if (!gi42.equals(gi43)) {
                    if (!gi4.A02) {
                        throw C8j3.A17();
                    }
                    int i2 = gi4.A00 + gi42.A00;
                    gi4.A01(i2);
                    System.arraycopy(gi42.A03, 0, gi4.A03, gi4.A00, gi42.A00);
                    System.arraycopy(gi42.A04, 0, gi4.A04, gi4.A00, gi42.A00);
                    gi4.A00 = i2;
                }
            }
        }
        gi0.b = gi4;
    }

    public static int A00(List list) {
        int iA0C;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDW) {
            GDW gdw = (GDW) list;
            iA0C = 0;
            while (i < size) {
                iA0C = AbstractC7610F5x.A0G(GDG.A01(gdw, i), iA0C);
                i++;
            }
        } else {
            iA0C = 0;
            while (i < size) {
                iA0C = AbstractC7611F5y.A0C(list, i, iA0C);
                i++;
            }
        }
        return iA0C;
    }

    public static int A01(List list) {
        int iA0C;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDW) {
            GDW gdw = (GDW) list;
            iA0C = 0;
            while (i < size) {
                iA0C = AbstractC7610F5x.A0G(GDG.A01(gdw, i), iA0C);
                i++;
            }
        } else {
            iA0C = 0;
            while (i < size) {
                iA0C = AbstractC7611F5y.A0C(list, i, iA0C);
                i++;
            }
        }
        return iA0C;
    }

    public static int A02(List list) {
        int iA05;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDW) {
            GDW gdw = (GDW) list;
            iA05 = 0;
            while (i < size) {
                iA05 += AbstractC7609F5w.A05(AbstractC7607F5u.A0A(GDG.A01(gdw, i)));
                i++;
            }
        } else {
            iA05 = 0;
            while (i < size) {
                iA05 += AbstractC7609F5w.A05(AbstractC7610F5x.A0Q(list, i));
                i++;
            }
        }
        return iA05;
    }

    public static int A03(List list) {
        int iA05;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDW) {
            GDW gdw = (GDW) list;
            iA05 = 0;
            while (i < size) {
                iA05 += AbstractC7609F5w.A05(GDG.A01(gdw, i));
                i++;
            }
        } else {
            iA05 = 0;
            while (i < size) {
                iA05 += AbstractC7609F5w.A05(C8j4.A0H(list, i));
                i++;
            }
        }
        return iA05;
    }
}
