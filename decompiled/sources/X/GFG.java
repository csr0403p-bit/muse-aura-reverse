package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GFG {
    public static final GFA<?, ?> A00;
    public static final GFA<?, ?> A01;
    public static final Class<?> A02;

    static {
        GFA<?, ?> gfa;
        Class<?> cls;
        GFJ gfj = GFJ.A02;
        Class<?> cls2 = null;
        try {
            cls2 = Class.forName("androidx.health.platform.client.proto.GeneratedMessage");
        } catch (Throwable unused) {
        }
        A02 = cls2;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
        }
        if (cls != null) {
            try {
                gfa = (GFA) cls.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
                gfa = null;
            }
        } else {
            gfa = null;
        }
        A00 = gfa;
        A01 = new GFA();
    }

    public static void A07(Object obj, Object obj2) {
        GF2 gf2 = (GF2) obj;
        GFI gfi = gf2.unknownFields;
        GFI gfi2 = ((GF2) obj2).unknownFields;
        GFI gfi3 = GFI.A05;
        if (!gfi3.equals(gfi2)) {
            if (gfi3.equals(gfi)) {
                int i = gfi.A00 + gfi2.A00;
                int[] iArrCopyOf = Arrays.copyOf(gfi.A03, i);
                System.arraycopy(gfi2.A03, 0, iArrCopyOf, gfi.A00, gfi2.A00);
                Object[] objArrCopyOf = Arrays.copyOf(gfi.A04, i);
                System.arraycopy(gfi2.A04, 0, objArrCopyOf, gfi.A00, gfi2.A00);
                gfi = new GFI();
                gfi.A01 = -1;
                gfi.A00 = i;
                gfi.A03 = iArrCopyOf;
                gfi.A04 = objArrCopyOf;
                gfi.A02 = true;
            } else if (!gfi2.equals(gfi3)) {
                if (!gfi.A02) {
                    throw C8j3.A17();
                }
                int i2 = gfi.A00 + gfi2.A00;
                GFI.A00(gfi, i2);
                System.arraycopy(gfi2.A03, 0, gfi.A03, gfi.A00, gfi2.A00);
                System.arraycopy(gfi2.A04, 0, gfi.A04, gfi.A00, gfi2.A00);
                gfi.A00 = i2;
            }
        }
        gf2.unknownFields = gfi;
    }

    public static int A00(List<Integer> list) {
        int iA0G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDR) {
            GDR gdr = (GDR) list;
            iA0G = 0;
            while (i < size) {
                long jA00 = GDC.A00(gdr, i);
                boolean z = GFE.A05;
                iA0G = AbstractC7610F5x.A0G(jA00, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0H = C8j4.A0H(list, i);
                boolean z2 = GFE.A05;
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
        if (list instanceof GDR) {
            GDR gdr = (GDR) list;
            iA0G = 0;
            while (i < size) {
                long jA00 = GDC.A00(gdr, i);
                boolean z = GFE.A05;
                iA0G = AbstractC7610F5x.A0G(jA00, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0H = C8j4.A0H(list, i);
                boolean z2 = GFE.A05;
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
        if (list instanceof GDQ) {
            GDQ gdq = (GDQ) list;
            iA0G = 0;
            while (i < size) {
                long jA01 = GDC.A01(gdq, i);
                boolean z = GFE.A05;
                iA0G = AbstractC7610F5x.A0G(jA01, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = GFE.A05;
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
        if (list instanceof GDR) {
            GDR gdr = (GDR) list;
            iA0E = 0;
            while (i < size) {
                int iA00 = GDC.A00(gdr, i);
                boolean z = GFE.A05;
                iA0E = AbstractC7610F5x.A0E(AbstractC7607F5u.A0A(iA00), iA0E);
                i++;
            }
        } else {
            iA0E = 0;
            while (i < size) {
                int iA0H = C8j4.A0H(list, i);
                boolean z2 = GFE.A05;
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
        if (list instanceof GDQ) {
            GDQ gdq = (GDQ) list;
            iA08 = 0;
            while (i < size) {
                long jA01 = GDC.A01(gdq, i);
                boolean z = GFE.A05;
                iA08 += AbstractC7609F5w.A08(AbstractC7610F5x.A0S(jA01));
                i++;
            }
        } else {
            iA08 = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = GFE.A05;
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
        if (list instanceof GDR) {
            GDR gdr = (GDR) list;
            iA0E = 0;
            while (i < size) {
                int iA00 = GDC.A00(gdr, i);
                boolean z = GFE.A05;
                iA0E = AbstractC7610F5x.A0E(iA00, iA0E);
                i++;
            }
        } else {
            iA0E = 0;
            while (i < size) {
                int iA0H = C8j4.A0H(list, i);
                boolean z2 = GFE.A05;
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
        if (list instanceof GDQ) {
            GDQ gdq = (GDQ) list;
            iA0G = 0;
            while (i < size) {
                long jA01 = GDC.A01(gdq, i);
                boolean z = GFE.A05;
                iA0G = AbstractC7610F5x.A0G(jA01, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = GFE.A05;
                iA0G = AbstractC7610F5x.A0G(jA0O, iA0G);
                i++;
            }
        }
        return iA0G;
    }
}
