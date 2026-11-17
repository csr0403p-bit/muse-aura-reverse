package X;

import com.facebook.forker.Process;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class BYg {
    public static C2384BXz A00;
    public static C2384BXz A01;
    public static C2384BXz A02;
    public static C2384BXz A03;
    public static C2384BXz A04;
    public static C2384BXz A05;
    public static C2384BXz A06;
    public static C2384BXz A07;
    public static Function0<Integer> A08;
    public static Function0<Boolean> A09;
    public static C2384BXz A0A;
    public static C2384BXz A0B;
    public static C2384BXz A0C;
    public static C2384BXz A0D;
    public static final AtomicInteger A0E;
    public static final AtomicReference<BYk> A0F;
    public static final AtomicReference<BYk> A0G;
    public static final AtomicReference<BYk> A0H;
    public static final AtomicReference<EnumC2375BWj> A0I;
    public static volatile Map<BWU, C2384BXz> A0J;
    public static volatile Function0<Float> A0K;
    public static volatile Function0<Boolean> A0L;

    static {
        BYk bYk = BYk.GREEN;
        A0H = BV4.A16(bYk);
        A0G = BV4.A16(bYk);
        A0F = BV4.A16(bYk);
        A0L = C6724EXi.A00(40);
        A0E = BV5.A17();
        A08 = C6724EXi.A00(38);
        A09 = C6724EXi.A00(39);
        A0I = BV4.A16(EnumC2375BWj.UNKNOWN);
        C9jH c9jHA0E = AGH.A0E();
        BY0 by0 = BY0.A02;
        A04 = new C2384BXz(by0, BWU.A0A, c9jHA0E);
        A0K = C6724EXi.A00(37);
        A07 = new C2384BXz(by0, BWU.A0D, c9jHA0E);
        A03 = new C2384BXz(by0, BWU.A07, c9jHA0E);
        A02 = new C2384BXz(by0, BWU.A06, c9jHA0E);
        BWU bwu = BWU.A05;
        A01 = new C2384BXz(by0, bwu, c9jHA0E);
        A06 = new C2384BXz(by0, bwu, c9jHA0E);
        A0A = new C2384BXz(by0, BWU.A0F, c9jHA0E);
        A0C = new C2384BXz(by0, BWU.A08, c9jHA0E);
        A0D = new C2384BXz(by0, BWU.A09, c9jHA0E);
        A05 = new C2384BXz(by0, BWU.A0C, c9jHA0E);
        A0B = new C2384BXz(by0, BWU.A0G, c9jHA0E);
        A0J = new EnumMap(BWU.class);
        A00 = new C2384BXz(by0, BWU.A04, c9jHA0E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r5 != (-2147483647)) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.BY0 r11, X.C2384BXz r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYg.A00(X.BY0, X.BXz, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(X.BWU r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            X.AnonymousClass003.A0v(r10, r11)
            java.util.Map<X.BWU, X.BXz> r4 = X.BYg.A0J
            boolean r0 = r4.containsKey(r9)
            if (r0 == 0) goto L11
            java.lang.Object r0 = r4.get(r9)
            if (r0 != 0) goto L28
        L11:
            r2 = 0
            int r0 = r10.length()
            if (r0 != 0) goto L5c
            X.BWU r2 = X.BWU.A0E
            X.9jH r1 = X.AGH.A0E()
            X.BY0 r0 = X.BY0.A02
            X.BXz r3 = new X.BXz
            r3.<init>(r0, r2, r1)
        L25:
            r4.put(r9, r3)
        L28:
            java.lang.Object r3 = r4.get(r9)
            X.BXz r3 = (X.C2384BXz) r3
            if (r3 == 0) goto Le9
            X.BWU r0 = r3.A01
            if (r0 != r9) goto Le9
            X.Ey9 r0 = X.BY0.A00
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.BY0 r0 = (X.BY0) r0
            java.lang.String r0 = r0.value
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L3a
        L4f:
            X.BY0 r1 = (X.BY0) r1
            if (r1 != 0) goto L55
            X.BY0 r1 = X.BY0.A02
        L55:
            int r0 = A00(r1, r3, r12)
            return r0
        L5a:
            r1 = 0
            goto L4f
        L5c:
            org.json.JSONObject r7 = X.BV4.A19(r10)     // Catch: java.lang.Throwable -> Lda
            X.BWU r6 = X.BWU.A0E     // Catch: java.lang.Throwable -> Lda
            X.BY0 r8 = X.BY0.A02     // Catch: java.lang.Throwable -> Lda
            java.lang.String r1 = "type"
            boolean r0 = r7.has(r1)     // Catch: org.json.JSONException -> L75 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            if (r0 == 0) goto L75
            java.lang.String r0 = X.C7384Etj.A0L(r7, r1)     // Catch: org.json.JSONException -> L75 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            X.BWU r6 = X.BWU.valueOf(r0)     // Catch: org.json.JSONException -> L75 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
        L75:
            X.C7384Etj.A0Y(r6, r2)     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            java.util.LinkedHashMap r5 = X.C3cG.A0j()     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            X.Ey9 r0 = X.BYh.A00     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
        L82:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            if (r0 == 0) goto La4
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            X.BYh r2 = (X.BYh) r2     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            boolean r0 = r7.has(r1)     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            if (r0 == 0) goto L9d
            int r0 = r7.getInt(r1)     // Catch: org.json.JSONException -> L9d java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            goto La0
        L9d:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        La0:
            X.C8j4.A1O(r2, r5, r0)     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            goto L82
        La4:
            java.lang.String r1 = "eligibleContext"
            boolean r0 = r7.has(r1)     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            if (r0 == 0) goto Ld2
            java.lang.String r3 = X.C7384Etj.A0L(r7, r1)     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            X.Ey9 r0 = X.BY0.A00     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            java.util.Iterator r2 = r0.iterator()     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
        Lb6:
            boolean r0 = r2.hasNext()     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            if (r0 == 0) goto Lce
            java.lang.Object r1 = r2.next()     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            r0 = r1
            X.BY0 r0 = (X.BY0) r0     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            java.lang.String r0 = r0.value     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            boolean r0 = r3.equals(r0)     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            if (r0 == 0) goto Lb6
        Lcb:
            X.BY0 r1 = (X.BY0) r1     // Catch: org.json.JSONException -> Ld2 java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            goto Ld0
        Lce:
            r1 = 0
            goto Lcb
        Ld0:
            if (r1 != 0) goto Ld3
        Ld2:
            r1 = r8
        Ld3:
            X.BXz r3 = new X.BXz     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            r3.<init>(r1, r6, r5)     // Catch: java.lang.Throwable -> Lda java.lang.Throwable -> Lda java.lang.Throwable -> Lda
            goto L25
        Lda:
            X.BWU r2 = X.BWU.A0E
            X.9jH r1 = X.AGH.A0E()
            X.BY0 r0 = X.BY0.A02
            X.BXz r3 = new X.BXz
            r3.<init>(r0, r2, r1)
            goto L25
        Le9:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYg.A01(X.BWU, java.lang.String, java.lang.String, boolean):int");
    }

    public static int A02(Object obj, Map map) {
        Number number = (Number) map.get(obj);
        return number != null ? number.intValue() : Process.WAIT_RESULT_STOPPED;
    }
}
