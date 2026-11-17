package X;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class Bd2 {
    public static final BWz A00;
    public static final Map<String, Map<Integer, Bd6>> A01;

    /* JADX WARN: Incorrect types in method signature: (IIIIIIIIILandroid/util/Range<Ljava/lang/Integer;>;)I */
    public static int A00(Range range, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int iDoubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue() * new Rational(i8, i9).doubleValue());
        String strA0M = AbstractC2875Bni.A08("VideoConfigUtil", 3) ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue)) : "";
        if (!AbstractC2440BbT.A00.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (AbstractC2875Bni.A08("VideoConfigUtil", 3)) {
                strA0M = FGI.A0M(strA0M, String.format("\nClamped to range %s -> %dbps", range, num));
            }
        }
        AbstractC2875Bni.A01("VideoConfigUtil", strA0M);
        return iDoubleValue;
    }

    public static Bd7 A02(AbstractC2509Bcf abstractC2509Bcf) {
        Bd6 bd6 = Bd6.A03;
        C2520Bcr c2520Bcr = (C2520Bcr) abstractC2509Bcf;
        String str = c2520Bcr.A09;
        if (str == null) {
            throw BV4.A0a("Null mimeType");
        }
        int i = c2520Bcr.A07;
        Size sizeA0P = BV6.A0P(c2520Bcr.A08, c2520Bcr.A06);
        int i2 = c2520Bcr.A04;
        int i3 = c2520Bcr.A01;
        BWz bWz = A00;
        if ("".isEmpty()) {
            return new Bd7(sizeA0P, bWz, bd6, str, i, i2, i3);
        }
        throw BV8.A0l("");
    }

    public static Bd6 A03(String str, int i) {
        Bd6 bd6;
        Map<Integer, Bd6> map = A01.get(str);
        if (map != null && (bd6 = (Bd6) BV5.A0f(map, i)) != null) {
            return bd6;
        }
        AbstractC2875Bni.A03("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", BV5.A1a(str, i)));
        return Bd6.A03;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        A01 = mapA0u;
        A00 = BWz.UPTIME;
        HashMap mapA0u2 = BV4.A0u();
        Integer numA0W = BV4.A0W();
        Bd6 bd6 = Bd6.A03;
        mapA0u2.put(numA0W, bd6);
        Integer numA0X = BV4.A0X();
        Bd6 bd62 = Bd6.A00;
        mapA0u2.put(numA0X, bd62);
        Bd6 bd63 = Bd6.A01;
        mapA0u2.put(4096, bd63);
        mapA0u2.put(8192, bd63);
        HashMap mapA0u3 = BV4.A0u();
        mapA0u3.put(numA0W, bd6);
        mapA0u3.put(numA0X, bd62);
        mapA0u3.put(4096, bd63);
        mapA0u3.put(8192, bd63);
        HashMap mapA0u4 = BV4.A0u();
        mapA0u4.put(numA0W, bd6);
        BV6.A1E(bd62, mapA0u4, 4);
        mapA0u4.put(4096, bd63);
        BV6.A1E(bd63, mapA0u4, 16384);
        mapA0u4.put(numA0X, bd6);
        BV6.A1E(bd62, mapA0u4, 8);
        mapA0u4.put(8192, bd63);
        BV6.A1E(bd63, mapA0u4, 32768);
        HashMap mapA0u5 = BV4.A0u();
        BV6.A1E(bd62, mapA0u5, 256);
        mapA0u5.put(512, Bd6.A02);
        mapA0u.put("video/hevc", mapA0u2);
        mapA0u.put("video/av01", mapA0u3);
        mapA0u.put("video/x-vnd.on2.vp9", mapA0u4);
        mapA0u.put("video/dolby-vision", mapA0u5);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.Bd5 A01(X.C2507Bcd r13, X.BdC r14, X.AbstractC2527Bcy r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bd2.A01(X.Bcd, X.BdC, X.Bcy):X.Bd5");
    }
}
