package X;

import android.util.Pair;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.BqE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2963BqE {
    public final ByteOrder A00;
    public final List<Map<String, C2967BqK>> A01 = Collections.list(new BqD(this));
    public static final Pattern A05 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A03 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A04 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final List<HashMap<String, C2965BqG>> A02 = Collections.list(new C2964BqF());

    public static Pair<Integer, Integer> A00(String str) throws NumberFormatException {
        Integer numValueOf;
        if (!str.contains(",")) {
            if (!str.contains(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? BV7.A0b(-1, 9) : BV7.A0b(-1, 4) : BV5.A0E(BV4.A0Y(), 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return BV7.A0b(-1, 12);
                }
            }
            String[] strArrSplit = str.split(CustomConnectorRegisterRepositoryKt.ROOT_PATH, -1);
            if (strArrSplit.length == 2) {
                long jA0L = BV6.A0L(strArrSplit, 0);
                long jA0L2 = BV6.A0L(strArrSplit, 1);
                return (jA0L < 0 || jA0L2 < 0) ? BV7.A0b(-1, 10) : (jA0L > 2147483647L || jA0L2 > 2147483647L) ? BV7.A0b(-1, 5) : BV5.A0E(10, 5);
            }
            return BV4.A0A(2, -1);
        }
        String[] strArrSplit2 = str.split(",", -1);
        Pair<Integer, Integer> pairA00 = A00(strArrSplit2[0]);
        if (BV7.A08(pairA00) != 2) {
            for (int i = 1; i < strArrSplit2.length; i++) {
                Pair<Integer, Integer> pairA002 = A00(strArrSplit2[i]);
                Object obj = pairA002.first;
                int iA08 = (obj.equals(pairA00.first) || pairA002.second.equals(pairA00.first)) ? BV7.A08(pairA00) : -1;
                int iA07 = (BV7.A07(pairA00) == -1 || !(obj.equals(pairA00.second) || pairA002.second.equals(pairA00.second))) ? -1 : BV7.A07(pairA00);
                if (iA08 == -1 && iA07 == -1) {
                    return BV4.A0A(2, -1);
                }
                if (iA08 == -1) {
                    numValueOf = Integer.valueOf(iA07);
                } else if (iA07 == -1) {
                    numValueOf = Integer.valueOf(iA08);
                }
                pairA00 = BV4.A0A(numValueOf, -1);
            }
        }
        return pairA00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r2 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        if (r2.A01 != 2) goto L38;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0125. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(java.lang.String r20, java.lang.String r21, java.util.List<java.util.Map<java.lang.String, X.C2967BqK>> r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2963BqE.A02(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void A03(int i) throws NumberFormatException {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            AbstractC2875Bni.A03("ExifData", FGI.A0I("Unexpected orientation value: ", i, ". Must be one of 0, 90, 180, 270."));
            i2 = 0;
        } else {
            i2 = 8;
        }
        A04("Orientation", String.valueOf(i2));
    }

    public final void A04(String str, String str2) throws NumberFormatException {
        A02(str, str2, this.A01);
    }

    public C2963BqE(ByteOrder byteOrder) {
        this.A00 = byteOrder;
    }

    public static void A01(C2963BqE c2963BqE, String str, String str2, List list) throws NumberFormatException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c2963BqE.A02(str, str2, list);
    }
}
