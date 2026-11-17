package X;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GGM {
    public static final GGX<?, ?> A00;
    public static final GGX<?, ?> A01;
    public static final GGX<?, ?> A02;
    public static final Class<?> A03;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        A03 = cls;
        try {
            cls3 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
        }
        GGX<?, ?> ggx = cls3 != null ? (GGX) cls3.getConstructor(Boolean.TYPE).newInstance(false) : null;
        A00 = ggx;
        try {
            cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused3) {
        }
        GGX<?, ?> ggx2 = cls2 != null ? (GGX) cls2.getConstructor(Boolean.TYPE).newInstance(true) : null;
        A01 = ggx2;
        A02 = new GGX();
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<LX/GDl;>;LX/GGq;)V */
    public static void A09(InterfaceC9378GGq interfaceC9378GGq, List list, int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        for (int i2 = 0; i2 < list.size(); i2++) {
            GGI ggi = ggl.A00;
            AbstractC9309GDl abstractC9309GDl = (AbstractC9309GDl) list.get(i2);
            GHG.A09(ggi, i);
            ggi.A0B(abstractC9309GDl);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/String;>;LX/GGq;)V */
    public static void A0A(InterfaceC9378GGq interfaceC9378GGq, List list, int i) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!(list instanceof Hl2)) {
            while (i2 < list.size()) {
                GGI ggi = ggl.A00;
                String strA0n = C60Q.A0n(list, i2);
                GHG.A09(ggi, i);
                ggi.A0C(strA0n);
                i2++;
            }
            return;
        }
        Hl2 hl2 = (Hl2) list;
        while (i2 < list.size()) {
            Object objAJO = hl2.AJO(i2);
            boolean z = objAJO instanceof String;
            GGI ggi2 = ggl.A00;
            if (z) {
                GHG.A09(ggi2, i);
                ggi2.A0C((String) objAJO);
            } else {
                GHG.A09(ggi2, i);
                ggi2.A0B((AbstractC9309GDl) objAJO);
            }
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Boolean;>;LX/GGq;Z)V */
    public static void A0B(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (z) {
            GGI ggi = ggl.A00;
            GHG.A09(ggi, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3++;
            }
            ggi.A06(i3);
            while (i2 < list.size()) {
                ggi.A0D(AbstractC7609F5w.A1Z(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            GGI ggi2 = ggl.A00;
            boolean zA1Z = AbstractC7609F5w.A1Z(list, i2);
            GGH ggh = (GGH) ggi2;
            GGH.A01(ggh, 11);
            ggh.A0F(i << 3);
            byte b = zA1Z ? (byte) 1 : (byte) 0;
            byte[] bArr = ggh.A03;
            int i5 = ggh.A00;
            ggh.A00 = i5 + 1;
            bArr[i5] = b;
            ggh.A01++;
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Double;>;LX/GGq;Z)V */
    public static void A0C(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A09(i, AbstractC7610F5x.A0Z(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        ggi.A06(i3);
        while (i2 < list.size()) {
            long jA0Z = AbstractC7610F5x.A0Z(list, i2);
            GGH.A01(ggh, 8);
            ggh.A0G(jA0Z);
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Integer;>;LX/GGq;Z)V */
    public static void A0D(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A08(i, C8j4.A0H(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int iA03 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iA0H = C8j4.A0H(list, i3);
            iA03 += iA0H >= 0 ? GGI.A03(iA0H) : 10;
        }
        ggi.A06(iA03);
        while (i2 < list.size()) {
            int iA0H2 = C8j4.A0H(list, i2);
            if (iA0H2 >= 0) {
                ggh.A06(iA0H2);
            } else {
                GHG.A08(ggh, iA0H2);
            }
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Integer;>;LX/GGq;Z)V */
    public static void A0E(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A07(i, C8j4.A0H(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        ggi.A06(i3);
        while (i2 < list.size()) {
            int iA0H = C8j4.A0H(list, i2);
            GGH.A01(ggh, 4);
            ggh.A0E(iA0H);
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Long;>;LX/GGq;Z)V */
    public static void A0F(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A09(i, AbstractC7609F5w.A0O(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        ggi.A06(i3);
        while (i2 < list.size()) {
            long jA0O = AbstractC7609F5w.A0O(list, i2);
            GGH.A01(ggh, 8);
            ggh.A0G(jA0O);
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Float;>;LX/GGq;Z)V */
    public static void A0G(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A07(i, Float.floatToRawIntBits(C8j4.A03(list, i2)));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        ggi.A06(i3);
        while (i2 < list.size()) {
            int iFloatToRawIntBits = Float.floatToRawIntBits(C8j4.A03(list, i2));
            GGH.A01(ggh, 4);
            ggh.A0E(iFloatToRawIntBits);
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Integer;>;LX/GGq;Z)V */
    public static void A0H(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A08(i, C8j4.A0H(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int iA03 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iA0H = C8j4.A0H(list, i3);
            iA03 += iA0H >= 0 ? GGI.A03(iA0H) : 10;
        }
        ggi.A06(iA03);
        while (i2 < list.size()) {
            int iA0H2 = C8j4.A0H(list, i2);
            if (iA0H2 >= 0) {
                ggh.A06(iA0H2);
            } else {
                GHG.A08(ggh, iA0H2);
            }
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Long;>;LX/GGq;Z)V */
    public static void A0I(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A0A(i, AbstractC7609F5w.A0O(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int iA04 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA04 += GGI.A04(AbstractC7609F5w.A0O(list, i3));
        }
        ggi.A06(iA04);
        while (i2 < list.size()) {
            GHG.A08(ggh, AbstractC7609F5w.A0O(list, i2));
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Integer;>;LX/GGq;Z)V */
    public static void A0J(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A07(i, C8j4.A0H(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        ggi.A06(i3);
        while (i2 < list.size()) {
            int iA0H = C8j4.A0H(list, i2);
            GGH.A01(ggh, 4);
            ggh.A0E(iA0H);
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Long;>;LX/GGq;Z)V */
    public static void A0K(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A09(i, AbstractC7609F5w.A0O(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        ggi.A06(i3);
        while (i2 < list.size()) {
            long jA0O = AbstractC7609F5w.A0O(list, i2);
            GGH.A01(ggh, 8);
            ggh.A0G(jA0O);
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Integer;>;LX/GGq;Z)V */
    public static void A0L(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                GGI ggi = ggl.A00;
                int iA0Q = AbstractC7610F5x.A0Q(list, i2);
                GGH ggh = (GGH) ggi;
                GHG.A07(ggh, i);
                ggh.A0F(iA0Q);
                i2++;
            }
            return;
        }
        GGI ggi2 = ggl.A00;
        GHG.A09(ggi2, i);
        int iA03 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA03 += GGI.A03(AbstractC7610F5x.A0Q(list, i3));
        }
        ggi2.A06(iA03);
        while (i2 < list.size()) {
            ggi2.A06(AbstractC7610F5x.A0Q(list, i2));
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Long;>;LX/GGq;Z)V */
    public static void A0M(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A0A(i, AbstractC7611F5y.A0H(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int iA04 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA04 += GGI.A04(AbstractC7611F5y.A0H(list, i3));
        }
        ggi.A06(iA04);
        while (i2 < list.size()) {
            GHG.A08(ggh, AbstractC7611F5y.A0H(list, i2));
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Integer;>;LX/GGq;Z)V */
    public static void A0N(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                GGI ggi = ggl.A00;
                int iA0H = C8j4.A0H(list, i2);
                GGH ggh = (GGH) ggi;
                GHG.A07(ggh, i);
                ggh.A0F(iA0H);
                i2++;
            }
            return;
        }
        GGI ggi2 = ggl.A00;
        GHG.A09(ggi2, i);
        int iA03 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA03 += GGI.A03(C8j4.A0H(list, i3));
        }
        ggi2.A06(iA03);
        while (i2 < list.size()) {
            ggi2.A06(C8j4.A0H(list, i2));
            i2++;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/Long;>;LX/GGq;Z)V */
    public static void A0O(InterfaceC9378GGq interfaceC9378GGq, List list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        GGL ggl = (GGL) interfaceC9378GGq;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ggl.A00.A0A(i, AbstractC7609F5w.A0O(list, i2));
                i2++;
            }
            return;
        }
        GGI ggi = ggl.A00;
        GGH ggh = (GGH) ggi;
        GHG.A09(ggh, i);
        int iA04 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA04 += GGI.A04(AbstractC7609F5w.A0O(list, i3));
        }
        ggi.A06(iA04);
        while (i2 < list.size()) {
            GHG.A08(ggh, AbstractC7609F5w.A0O(list, i2));
            i2++;
        }
    }

    public static void A0P(Object obj, Object obj2) {
        AbstractC9339GEw abstractC9339GEw = (AbstractC9339GEw) obj;
        GGN ggn = abstractC9339GEw.unknownFields;
        GGN ggn2 = ((AbstractC9339GEw) obj2).unknownFields;
        if (!ggn2.equals(GGN.A05)) {
            int i = ggn.A00 + ggn2.A00;
            int[] iArrCopyOf = Arrays.copyOf(ggn.A03, i);
            System.arraycopy(ggn2.A03, 0, iArrCopyOf, ggn.A00, ggn2.A00);
            Object[] objArrCopyOf = Arrays.copyOf(ggn.A04, i);
            System.arraycopy(ggn2.A04, 0, objArrCopyOf, ggn.A00, ggn2.A00);
            ggn = new GGN();
            ggn.A01 = -1;
            ggn.A00 = i;
            ggn.A03 = iArrCopyOf;
            ggn.A04 = objArrCopyOf;
            ggn.A02 = true;
        }
        abstractC9339GEw.unknownFields = ggn;
    }

    public static int A00(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA03 = 0;
        for (int i = 0; i < size; i++) {
            int iA0H = C8j4.A0H(list, i);
            boolean z = GGI.A02;
            iA03 += iA0H >= 0 ? GGI.A03(iA0H) : 10;
        }
        return iA03;
    }

    public static int A01(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA03 = 0;
        for (int i = 0; i < size; i++) {
            int iA0H = C8j4.A0H(list, i);
            boolean z = GGI.A02;
            iA03 += iA0H >= 0 ? GGI.A03(iA0H) : 10;
        }
        return iA03;
    }

    public static int A02(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA04 = 0;
        for (int i = 0; i < size; i++) {
            iA04 += GGI.A04(AbstractC7609F5w.A0O(list, i));
        }
        return iA04;
    }

    public static int A03(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA03 = 0;
        for (int i = 0; i < size; i++) {
            iA03 += GGI.A03(AbstractC7610F5x.A0Q(list, i));
        }
        return iA03;
    }

    public static int A04(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA04 = 0;
        for (int i = 0; i < size; i++) {
            iA04 += GGI.A04(AbstractC7611F5y.A0H(list, i));
        }
        return iA04;
    }

    public static int A05(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA03 = 0;
        for (int i = 0; i < size; i++) {
            iA03 += GGI.A03(C8j4.A0H(list, i));
        }
        return iA03;
    }

    public static int A06(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA04 = 0;
        for (int i = 0; i < size; i++) {
            iA04 += GGI.A04(AbstractC7609F5w.A0O(list, i));
        }
        return iA04;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<LX/GDl;>;)I */
    public static int A07(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA06 = size * GHG.A06(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iA01 = ((AbstractC9309GDl) list.get(i2)).A01();
            iA06 += GGI.A03(iA01) + iA01;
        }
        return iA06;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<*>;)I */
    public static int A08(List list, int i) {
        int iA05;
        int iA052;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iA06 = GHG.A06(i) * size;
        if (list instanceof Hl2) {
            Hl2 hl2 = (Hl2) list;
            while (i2 < size) {
                Object objAJO = hl2.AJO(i2);
                if (objAJO instanceof AbstractC9309GDl) {
                    int iA01 = ((AbstractC9309GDl) objAJO).A01();
                    iA052 = GGI.A03(iA01) + iA01;
                } else {
                    iA052 = GGI.A05((String) objAJO);
                }
                iA06 += iA052;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC9309GDl) {
                    int iA012 = ((AbstractC9309GDl) obj).A01();
                    iA05 = GGI.A03(iA012) + iA012;
                } else {
                    iA05 = GGI.A05((String) obj);
                }
                iA06 += iA05;
                i2++;
            }
        }
        return iA06;
    }
}
