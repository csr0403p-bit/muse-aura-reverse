package X;

import com.instagram.common.lispy.lang.BloksScriptingException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FDL {
    public static final ThreadLocal<Boolean> A01 = new ThreadLocal<>();
    public static final ThreadLocal<FDJ> A00 = new ThreadLocal<>();
    public static final ThreadLocal<FDJ> A02 = new ThreadLocal<>();

    public static Object A03(Hj6 hj6, FDJ fdj, F6L f6l, List list) {
        return A02(hj6, fdj, f6l, list.get(0));
    }

    public static Object A04(Hj6 hj6, FDJ fdj, F6L f6l, List list) {
        return A02(hj6, fdj, f6l, list.get(1));
    }

    public static boolean A07(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return AnonymousClass001.A1X(obj);
        }
        if (obj instanceof String) {
            return !((String) obj).isEmpty();
        }
        if (obj instanceof Long) {
            if (C3cG.A05(obj) == 0) {
                return false;
            }
        } else if (obj instanceof Number) {
            double dA00 = BV6.A00(obj);
            return (dA00 == 0.0d || Double.isNaN(dA00)) ? false : true;
        }
        return true;
    }

    public static boolean A08(Object obj) {
        if (obj == null || !(obj instanceof Number)) {
            return false;
        }
        double dA00 = AbstractC10477Hkr.A00(obj);
        int i = (int) dA00;
        return ((double) i) == dA00 && i >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A09(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = 1
            r5 = 0
            if (r7 != 0) goto L7
            if (r8 != 0) goto Lae
            return r6
        L7:
            if (r8 == 0) goto Lae
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L1c
            boolean r0 = r8 instanceof java.lang.Boolean
            if (r0 == 0) goto L46
            boolean r1 = X.AnonymousClass001.A1X(r7)
            boolean r0 = X.AnonymousClass001.A1X(r8)
            if (r1 != r0) goto Lae
            return r6
        L1c:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L31
            boolean r0 = r8 instanceof java.lang.Long
            if (r0 == 0) goto L46
            long r2 = X.C3cG.A05(r7)
            long r0 = X.C3cG.A05(r8)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L2e:
            if (r4 != 0) goto Lae
            return r6
        L31:
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 == 0) goto L89
            boolean r0 = r8 instanceof java.lang.Number
            if (r0 == 0) goto L46
            double r2 = X.BV6.A00(r7)
            java.lang.Number r8 = (java.lang.Number) r8
        L3f:
            double r0 = r8.doubleValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L2e
        L46:
            if (r1 == 0) goto L7e
            boolean r0 = X.AnonymousClass001.A1X(r7)
            if (r0 == 0) goto L7b
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L50:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L54:
            boolean r0 = r8 instanceof java.lang.Boolean
            if (r0 == 0) goto L70
            boolean r0 = X.AnonymousClass001.A1X(r8)
            if (r0 == 0) goto L6d
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L60:
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
        L64:
            if (r2 == 0) goto Lae
            if (r8 == 0) goto Lae
            double r2 = r2.doubleValue()
            goto L3f
        L6d:
            r0 = 0
            goto L60
        L70:
            boolean r0 = r8 instanceof java.lang.Number
            if (r0 == 0) goto L79
            double r0 = X.BV6.A00(r8)
            goto L60
        L79:
            r8 = 0
            goto L64
        L7b:
            r0 = 0
            goto L50
        L7e:
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 == 0) goto L87
            double r0 = X.BV6.A00(r7)
            goto L50
        L87:
            r2 = 0
            goto L54
        L89:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L9a
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lae
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto Lae
            return r6
        L9a:
            boolean r0 = r7 instanceof java.util.List
            if (r0 != 0) goto Lab
            boolean r0 = r7 instanceof java.util.Map
            if (r0 != 0) goto Lab
            boolean r0 = r7 instanceof X.HsM
            if (r0 != 0) goto Lab
            boolean r5 = r7.equals(r8)
            return r5
        Lab:
            if (r7 != r8) goto Lae
            return r6
        Lae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDL.A09(java.lang.Object, java.lang.Object):boolean");
    }

    public static final Object A01(Hj6 hj6, FDJ fdj, F6L f6l, FDK fdk, Object obj, int i) throws Exception {
        F6L f6l2 = f6l;
        if (fdk != null) {
            C7648F8p c7648F8p = fdk.A01;
            F9H f9h = fdk.A00;
            F6D f6dA00 = (F6D) f6l;
            if ((c7648F8p != null && !c7648F8p.equals(((F6L) f6dA00).A02) && c7648F8p.A01.length != 0) || (f9h != null && f9h != ((F6L) f6dA00).A00)) {
                f6dA00 = F6D.A00(f9h, f6dA00, c7648F8p);
            }
            C7384Etj.A0U(f6dA00);
            f6l2 = f6dA00;
        }
        try {
            F9H f9h2 = f6l2.A00;
            List<FDN> list = fdj.A01;
            FDN fdn = new FDN();
            fdn.A02 = hj6;
            fdn.A01 = f9h2;
            fdn.A00 = i;
            list.add(fdn);
            try {
                Object objA02 = A02(hj6, fdj, f6l2, obj);
                list.remove(C60O.A00(list));
                return objA02;
            } catch (BloksScriptingException e) {
                throw new BloksScriptingException(fdk != null ? fdk.A00 : null, e.mException);
            }
        } catch (BloksScriptingException e2) {
            throw BV4.A0e(e2);
        }
    }

    public static boolean A06(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Number);
    }

    public static int A00(Object obj) {
        return (int) AbstractC10477Hkr.A00(obj);
    }

    public static Object A05(Hj6 hj6, FDJ fdj, F6L f6l, List list, int i) {
        return A02(hj6, fdj, f6l, list.get(i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023b, code lost:
    
        if (A06(r7) == false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0260, code lost:
    
        if (X.FDM.A0C(r6, r7, r4) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0262, code lost:
    
        r8 = X.FDM.A01(r25, r3, r6) - X.FDM.A01(r25, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0779, code lost:
    
        if (r4 >= r1.size()) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x07ac, code lost:
    
        if ((r1 instanceof java.util.Map) != false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0b98, code lost:
    
        if (A06(r7) == false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0bbd, code lost:
    
        if (X.FDM.A0C(r6, r7, r4) != false) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0bbf, code lost:
    
        r8 = X.FDM.A01(r25, r3, r6) + X.FDM.A01(r25, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x0d06, code lost:
    
        if (A06(r5) == false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0eaa, code lost:
    
        X.FDM.A08(r25, r1, r5, r0, "lambda");
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x10db, code lost:
    
        if (A06(r7) == false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:916:0x1106, code lost:
    
        if (X.FDM.A0C(r6, r7, r4) != false) goto L917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x1108, code lost:
    
        r8 = X.FDM.A01(r25, r3, r6) * X.FDM.A01(r25, r3, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0a24 A[PHI: r2
  0x0a24: PHI (r2v15 java.lang.Object) = (r2v14 java.lang.Object), (r2v14 java.lang.Object), (r2v18 java.lang.Object) binds: [B:558:0x09fa, B:566:0x0a16, B:569:0x0a1c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0da5 A[Catch: Exception -> 0x0e0f, LispyException -> 0x0e54, TRY_ENTER, TryCatch #9 {LispyException -> 0x0e54, Exception -> 0x0e0f, blocks: (B:781:0x0df7, B:764:0x0da5, B:765:0x0daa, B:767:0x0db0, B:768:0x0dba, B:769:0x0dc1, B:771:0x0dc5, B:773:0x0dd3, B:775:0x0de5, B:776:0x0ded, B:777:0x0dee, B:779:0x0df2, B:788:0x0e05, B:790:0x0e09, B:791:0x0e0e), top: B:930:0x0063, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017c  */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.Hj6 r24, X.FDJ r25, X.F6L r26, java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 4674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDL.A02(X.Hj6, X.FDJ, X.F6L, java.lang.Object):java.lang.Object");
    }
}
