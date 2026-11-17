package X;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GG2 {
    public static final GG8<?, ?> A00;
    public static final GG8<?, ?> A01;
    public static final Class<?> A02;

    static {
        GG8<?, ?> gg8;
        Class<?> cls;
        C9359GFs c9359GFs = C9359GFs.A02;
        Class<?> cls2 = null;
        try {
            cls2 = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
        }
        A02 = cls2;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
        }
        if (cls != null) {
            try {
                gg8 = (GG8) cls.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
                gg8 = null;
            }
        } else {
            gg8 = null;
        }
        A00 = gg8;
        A01 = new GG8();
    }

    public static void A07(Object obj, Object obj2) {
        GF0 gf0 = (GF0) obj;
        GG7 gg7 = gf0.unknownFields;
        GG7 gg72 = ((GF0) obj2).unknownFields;
        GG7 gg73 = GG7.A05;
        if (!gg73.equals(gg72)) {
            if (gg73.equals(gg7)) {
                int i = gg7.A00 + gg72.A00;
                int[] iArrCopyOf = Arrays.copyOf(gg7.A03, i);
                System.arraycopy(gg72.A03, 0, iArrCopyOf, gg7.A00, gg72.A00);
                Object[] objArrCopyOf = Arrays.copyOf(gg7.A04, i);
                System.arraycopy(gg72.A04, 0, objArrCopyOf, gg7.A00, gg72.A00);
                gg7 = new GG7();
                gg7.A01 = -1;
                gg7.A00 = i;
                gg7.A03 = iArrCopyOf;
                gg7.A04 = objArrCopyOf;
                gg7.A02 = true;
            } else if (!gg72.equals(gg73)) {
                if (!gg7.A02) {
                    throw C8j3.A17();
                }
                int i2 = gg7.A00 + gg72.A00;
                GG7.A00(gg7, i2);
                System.arraycopy(gg72.A03, 0, gg7.A03, gg7.A00, gg72.A00);
                System.arraycopy(gg72.A04, 0, gg7.A04, gg7.A00, gg72.A00);
                gg7.A00 = i2;
            }
        }
        gf0.unknownFields = gg7;
    }

    public static int A00(List<Integer> list) {
        int iA0G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDU) {
            GDU gdu = (GDU) list;
            iA0G = 0;
            while (i < size) {
                long jA00 = GDE.A00(gdu, i);
                boolean z = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA00, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0H = C8j4.A0H(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA0H, iA0G);
                i++;
            }
        }
        return iA0G;
    }

    public static int A01(List<Integer> list) {
        int iA0G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDU) {
            GDU gdu = (GDU) list;
            iA0G = 0;
            while (i < size) {
                long jA00 = GDE.A00(gdu, i);
                boolean z = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA00, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0H = C8j4.A0H(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA0H, iA0G);
                i++;
            }
        }
        return iA0G;
    }

    public static int A02(List<Long> list) {
        int iA0G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDV) {
            GDV gdv = (GDV) list;
            iA0G = 0;
            while (i < size) {
                long jA01 = GDE.A01(gdv, i);
                boolean z = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA01, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA0O, iA0G);
                i++;
            }
        }
        return iA0G;
    }

    public static int A03(List<Integer> list) {
        int iA0E;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDU) {
            GDU gdu = (GDU) list;
            iA0E = 0;
            while (i < size) {
                int iA00 = GDE.A00(gdu, i);
                boolean z = CodedOutputStream.A02;
                iA0E = AbstractC7610F5x.A0E(AbstractC7607F5u.A0A(iA00), iA0E);
                i++;
            }
        } else {
            iA0E = 0;
            while (i < size) {
                int iA0H = C8j4.A0H(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA0E = AbstractC7610F5x.A0E(AbstractC7607F5u.A0A(iA0H), iA0E);
                i++;
            }
        }
        return iA0E;
    }

    public static int A04(List<Long> list) {
        int iA08;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDV) {
            GDV gdv = (GDV) list;
            iA08 = 0;
            while (i < size) {
                long jA01 = GDE.A01(gdv, i);
                boolean z = CodedOutputStream.A02;
                iA08 += AbstractC7609F5w.A08(AbstractC7610F5x.A0S(jA01));
                i++;
            }
        } else {
            iA08 = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA08 += AbstractC7609F5w.A08(AbstractC7610F5x.A0S(jA0O));
                i++;
            }
        }
        return iA08;
    }

    public static int A05(List<Integer> list) {
        int iA0E;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDU) {
            GDU gdu = (GDU) list;
            iA0E = 0;
            while (i < size) {
                int iA00 = GDE.A00(gdu, i);
                boolean z = CodedOutputStream.A02;
                iA0E = AbstractC7610F5x.A0E(iA00, iA0E);
                i++;
            }
        } else {
            iA0E = 0;
            while (i < size) {
                int iA0H = C8j4.A0H(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA0E = AbstractC7610F5x.A0E(iA0H, iA0E);
                i++;
            }
        }
        return iA0E;
    }

    public static int A06(List<Long> list) {
        int iA0G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDV) {
            GDV gdv = (GDV) list;
            iA0G = 0;
            while (i < size) {
                long jA01 = GDE.A01(gdv, i);
                boolean z = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA01, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA0O, iA0G);
                i++;
            }
        }
        return iA0G;
    }
}
