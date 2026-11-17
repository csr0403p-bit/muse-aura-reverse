package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GHL {
    public static final GHT<?, ?> A00;
    public static final GHT<?, ?> A01;
    public static final Class<?> A02;

    static {
        GHT<?, ?> ght;
        Class<?> cls;
        GHP ghp = GHP.A02;
        Class<?> cls2 = null;
        try {
            cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
        }
        A02 = cls2;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
        }
        if (cls != null) {
            try {
                ght = (GHT) cls.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
                ght = null;
            }
        } else {
            ght = null;
        }
        A00 = ght;
        A01 = new GHT();
    }

    public static void A07(Object obj, Object obj2) {
        GHM ghm = (GHM) obj;
        GHQ ghq = ghm.unknownFields;
        GHQ ghq2 = ((GHM) obj2).unknownFields;
        GHQ ghq3 = GHQ.A05;
        if (!ghq3.equals(ghq2)) {
            if (ghq3.equals(ghq)) {
                int i = ghq.A00 + ghq2.A00;
                int[] iArrCopyOf = Arrays.copyOf(ghq.A03, i);
                System.arraycopy(ghq2.A03, 0, iArrCopyOf, ghq.A00, ghq2.A00);
                Object[] objArrCopyOf = Arrays.copyOf(ghq.A04, i);
                System.arraycopy(ghq2.A04, 0, objArrCopyOf, ghq.A00, ghq2.A00);
                ghq = new GHQ();
                ghq.A01 = -1;
                ghq.A00 = i;
                ghq.A03 = iArrCopyOf;
                ghq.A04 = objArrCopyOf;
                ghq.A02 = true;
            } else if (!ghq2.equals(ghq3)) {
                if (!ghq.A02) {
                    throw C8j3.A17();
                }
                int i2 = ghq.A00 + ghq2.A00;
                GHQ.A00(ghq, i2);
                System.arraycopy(ghq2.A03, 0, ghq.A03, ghq.A00, ghq2.A00);
                System.arraycopy(ghq2.A04, 0, ghq.A04, ghq.A00, ghq2.A00);
                ghq.A00 = i2;
            }
        }
        ghm.unknownFields = ghq;
    }

    public static int A00(List<Integer> list) {
        int iA0G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof GDS) {
            GDS gds = (GDS) list;
            iA0G = 0;
            while (i < size) {
                long jA00 = GDF.A00(gds, i);
                boolean z = GGF.A05;
                iA0G = AbstractC7610F5x.A0G(jA00, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0H = C8j4.A0H(list, i);
                boolean z2 = GGF.A05;
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
        if (list instanceof GDS) {
            GDS gds = (GDS) list;
            iA0G = 0;
            while (i < size) {
                long jA00 = GDF.A00(gds, i);
                boolean z = GGF.A05;
                iA0G = AbstractC7610F5x.A0G(jA00, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0H = C8j4.A0H(list, i);
                boolean z2 = GGF.A05;
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
        if (list instanceof GDT) {
            GDT gdt = (GDT) list;
            iA0G = 0;
            while (i < size) {
                long jA01 = GDF.A01(gdt, i);
                boolean z = GGF.A05;
                iA0G = AbstractC7610F5x.A0G(jA01, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = GGF.A05;
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
        if (list instanceof GDS) {
            GDS gds = (GDS) list;
            iA0E = 0;
            while (i < size) {
                int iA00 = GDF.A00(gds, i);
                boolean z = GGF.A05;
                iA0E = AbstractC7610F5x.A0E(AbstractC7607F5u.A0A(iA00), iA0E);
                i++;
            }
        } else {
            iA0E = 0;
            while (i < size) {
                int iA0H = C8j4.A0H(list, i);
                boolean z2 = GGF.A05;
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
        if (list instanceof GDT) {
            GDT gdt = (GDT) list;
            iA08 = 0;
            while (i < size) {
                long jA01 = GDF.A01(gdt, i);
                boolean z = GGF.A05;
                iA08 += AbstractC7609F5w.A08(AbstractC7610F5x.A0S(jA01));
                i++;
            }
        } else {
            iA08 = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = GGF.A05;
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
        if (list instanceof GDS) {
            GDS gds = (GDS) list;
            iA0E = 0;
            while (i < size) {
                int iA00 = GDF.A00(gds, i);
                boolean z = GGF.A05;
                iA0E = AbstractC7610F5x.A0E(iA00, iA0E);
                i++;
            }
        } else {
            iA0E = 0;
            while (i < size) {
                int iA0H = C8j4.A0H(list, i);
                boolean z2 = GGF.A05;
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
        if (list instanceof GDT) {
            GDT gdt = (GDT) list;
            iA0G = 0;
            while (i < size) {
                long jA01 = GDF.A01(gdt, i);
                boolean z = GGF.A05;
                iA0G = AbstractC7610F5x.A0G(jA01, iA0G);
                i++;
            }
        } else {
            iA0G = 0;
            while (i < size) {
                long jA0O = AbstractC7609F5w.A0O(list, i);
                boolean z2 = GGF.A05;
                iA0G = AbstractC7610F5x.A0G(jA0O, iA0G);
                i++;
            }
        }
        return iA0G;
    }
}
