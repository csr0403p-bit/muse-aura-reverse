package X;

import android.os.Trace;
import androidx.compose.ui.unit.Constraints;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: X.AjP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1456AjP {
    public InterfaceC1495Ak2 A00;
    public Constraints A01;
    public boolean A02;
    public boolean A03;
    public final C1453AjM A06;
    public final C1470Ajd A05 = new C1470Ajd();
    public final C1461AjU A07 = new C1461AjU();
    public final C0910AHm<InterfaceC1494Ak1> A08 = C0910AHm.A02(new InterfaceC1494Ak1[16], 0);
    public final C0910AHm<C1478Ajl> A04 = C0910AHm.A02(new C1478Ajl[16], 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.Aj8] */
    public static final void A03(C1456AjP c1456AjP) {
        C0910AHm<InterfaceC1494Ak1> c0910AHm = c1456AjP.A08;
        InterfaceC1494Ak1[] interfaceC1494Ak1Arr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            Ai8 ai8 = ((C1453AjM) interfaceC1494Ak1Arr[i2]).A0f.A07;
            AeA<Object> aeA = AbstractC1436Aj5.A00;
            C1241AfX c1241AfX = ai8.A01;
            for (AbstractC1439Aj8 abstractC1439Aj8A0C = AbstractC1387AiH.A0C(ai8, true); abstractC1439Aj8A0C != null && (abstractC1439Aj8A0C.aggregateChildKindSet & 4194304) != 0; abstractC1439Aj8A0C = abstractC1439Aj8A0C.child) {
                if ((abstractC1439Aj8A0C.kindSet & 4194304) != 0) {
                    AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8A0C;
                    C0910AHm c0910AHm2 = null;
                    do {
                        if (abstractC1437Aj6A00 instanceof InterfaceC1403AiY) {
                            ((InterfaceC1403AiY) abstractC1437Aj6A00).AUZ(ai8);
                        } else {
                            if ((abstractC1437Aj6A00.kindSet & 4194304) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                AbstractC1439Aj8 abstractC1439Aj8 = abstractC1437Aj6A00.A00;
                                int i3 = 0;
                                abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                while (abstractC1439Aj8 != null) {
                                    if ((abstractC1439Aj8.kindSet & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC1437Aj6A00 = abstractC1439Aj8;
                                        } else {
                                            if (c0910AHm2 == null) {
                                                c0910AHm2 = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                            }
                                            if (abstractC1437Aj6A00 != 0) {
                                                c0910AHm2.A0G(abstractC1437Aj6A00);
                                                abstractC1437Aj6A00 = 0;
                                            }
                                            c0910AHm2.A0G(abstractC1439Aj8);
                                        }
                                    }
                                    abstractC1439Aj8 = abstractC1439Aj8.child;
                                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                }
                                if (i3 == 1) {
                                }
                            }
                        }
                        abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm2);
                    } while (abstractC1437Aj6A00 != 0);
                }
                if (abstractC1439Aj8A0C != c1241AfX) {
                }
            }
        }
        c0910AHm.A09();
    }

    public static final void A04(C1456AjP c1456AjP) {
        C0910AHm<C1478Ajl> c0910AHm = c1456AjP.A04;
        int i = c0910AHm.A00;
        if (i != 0) {
            C1478Ajl[] c1478AjlArr = c0910AHm.A01;
            for (int i2 = 0; i2 < i; i2++) {
                C1478Ajl c1478Ajl = c1478AjlArr[i2];
                if (c1478Ajl.A00.A0D != null) {
                    boolean z = c1478Ajl.A02;
                    C1453AjM c1453AjM = c1478Ajl.A00;
                    if (z) {
                        C1453AjM.A0A(c1453AjM, c1478Ajl.A01, true, false);
                    } else {
                        C1453AjM.A0B(c1453AjM, c1478Ajl.A01, true, false);
                    }
                }
            }
            c0910AHm.A09();
        }
    }

    private final boolean A05(C1453AjM c1453AjM) {
        AbstractC1460AjT abstractC1460AjT;
        C1459AjS c1459AjS = c1453AjM.A0d;
        C1454AjN c1454AjN = c1459AjS.A0G;
        if (!c1454AjN.A0G && !c1454AjN.A0H && !A07(c1453AjM)) {
            Boolean bool = true;
            if (!bool.equals(c1453AjM.A0F()) && !A06(c1453AjM)) {
                AbstractC1460AjT abstractC1460AjT2 = c1454AjN.A0S;
                abstractC1460AjT2.A03();
                if (abstractC1460AjT2.A00 == null) {
                    C1455AjO c1455AjO = c1459AjS.A04;
                    if (c1455AjO == null || (abstractC1460AjT = c1455AjO.A0J) == null) {
                        return false;
                    }
                    abstractC1460AjT.A03();
                    if (abstractC1460AjT.A00 == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean A06(C1453AjM c1453AjM) {
        AbstractC1460AjT abstractC1460AjT;
        C1459AjS c1459AjS = c1453AjM.A0d;
        if (!c1459AjS.A0E) {
            return false;
        }
        C1455AjO c1455AjO = c1459AjS.A04;
        if ((c1455AjO != null ? c1455AjO.A07 : C79.A0C) == C79.A0C) {
            if (c1455AjO == null || (abstractC1460AjT = c1455AjO.A0J) == null) {
                return false;
            }
            abstractC1460AjT.A03();
            if (abstractC1460AjT.A00 == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A07(C1453AjM c1453AjM) {
        if (!c1453AjM.A0d.A0G.A0L) {
            return false;
        }
        do {
            if (c1453AjM.A0d.A0G.A0A == C79.A0C) {
                AbstractC1460AjT abstractC1460AjT = c1453AjM.A0d.A0G.A0S;
                abstractC1460AjT.A03();
                if (abstractC1460AjT.A00 == null) {
                    C1453AjM c1453AjMA0E = c1453AjM.A0E();
                    if ((c1453AjMA0E != null ? c1453AjMA0E.A0d.A05 : null) != C79.A00) {
                        return false;
                    }
                }
            }
            c1453AjM = c1453AjM.A0E();
            if (c1453AjM == null) {
                return false;
            }
        } while (!c1453AjM.A0d.A0G.A0G);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(X.C1453AjM r6, androidx.compose.ui.unit.Constraints r7) throws java.lang.Throwable {
        /*
            X.AjM r0 = r6.A0B
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            X.AjS r4 = r6.A0d
            X.AjO r0 = r4.A04
            if (r7 == 0) goto L40
            X.C7384Etj.A0X(r0)
        Lf:
            long r1 = r7.A00
            boolean r3 = r0.A0f(r1)
        L15:
            X.AjM r2 = r6.A0E()
            if (r3 == 0) goto L25
            if (r2 == 0) goto L25
            X.AjM r0 = r2.A0B
            if (r0 != 0) goto L26
            r0 = 1
            X.C1453AjM.A0B(r2, r5, r0, r5)
        L25:
            return r3
        L26:
            X.AjO r0 = r4.A04
            if (r0 == 0) goto L35
            java.lang.Integer r1 = r0.A07
        L2c:
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L38
            r0 = 1
            X.C1453AjM.A0A(r2, r5, r0, r5)
            return r3
        L35:
            java.lang.Integer r1 = X.C79.A0C
            goto L2c
        L38:
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L25
            r2.A0b(r5)
            return r3
        L40:
            if (r0 == 0) goto L47
            androidx.compose.ui.unit.Constraints r7 = r0.A05
            if (r7 == 0) goto L47
            goto Lf
        L47:
            r3 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456AjP.A08(X.AjM, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A09(X.C1453AjM r5, androidx.compose.ui.unit.Constraints r6) throws java.lang.Throwable {
        /*
            if (r6 != 0) goto L11
            X.AjS r0 = r5.A0d
            X.AjN r4 = r0.A0G
            boolean r0 = r4.A0M
            if (r0 == 0) goto L41
            long r0 = r4.A04
            androidx.compose.ui.unit.Constraints r6 = new androidx.compose.ui.unit.Constraints
            r6.<init>(r0)
        L11:
            java.lang.Integer r1 = r5.A0I
            java.lang.Integer r0 = X.C79.A0C
            if (r1 != r0) goto L1a
            r5.A0H()
        L1a:
            X.AjS r0 = r5.A0d
            X.AjN r4 = r0.A0G
            long r0 = r6.A00
            boolean r3 = r4.A0f(r0)
        L24:
            X.AjM r2 = r5.A0E()
            if (r3 == 0) goto L37
            if (r2 == 0) goto L37
            java.lang.Integer r1 = r4.A0A
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L38
            r1 = 0
            r0 = 1
            X.C1453AjM.A0B(r2, r1, r0, r1)
        L37:
            return r3
        L38:
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L37
            r0 = 0
            r2.A0c(r0)
            return r3
        L41:
            r3 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456AjP.A09(X.AjM, androidx.compose.ui.unit.Constraints):boolean");
    }

    private final boolean A0A(C1453AjM c1453AjM, boolean z) throws Throwable {
        Constraints constraints;
        boolean zA09 = false;
        if (!c1453AjM.A0R && A05(c1453AjM)) {
            if (c1453AjM == this.A06) {
                constraints = this.A01;
                C7384Etj.A0X(constraints);
            } else {
                constraints = null;
            }
            C1459AjS c1459AjS = c1453AjM.A0d;
            if (z) {
                if (c1459AjS.A0E) {
                    zA09 = A08(c1453AjM, constraints);
                }
            } else if (c1459AjS.A0G.A0L) {
                zA09 = A09(c1453AjM, constraints);
            }
            A04(this);
        }
        return zA09;
    }

    public final void A0B(C1453AjM c1453AjM, boolean z) {
        if (!this.A03) {
            ASP.A01("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw F60.createAndThrow();
        }
        C1459AjS c1459AjS = c1453AjM.A0d;
        if (z ? c1459AjS.A0E : c1459AjS.A0G.A0L) {
            throw C60O.A0i("node not yet measured");
        }
        A02(c1453AjM, z);
    }

    public final void A0C(boolean z) {
        if (z) {
            C1461AjU c1461AjU = this.A07;
            C1453AjM c1453AjM = this.A06;
            if (c1453AjM.A01 > 0) {
                C0910AHm<C1453AjM> c0910AHm = c1461AjU.A01;
                c0910AHm.A09();
                c0910AHm.A0G(c1453AjM);
                c1453AjM.A0U = true;
            }
        }
        C1461AjU c1461AjU2 = this.A07;
        C0910AHm<C1453AjM> c0910AHm2 = c1461AjU2.A01;
        if (c0910AHm2.A00 != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c0910AHm2.A0D(C1474Ajh.A00);
                int i = c0910AHm2.A00;
                C1453AjM[] c1453AjMArr = c1461AjU2.A00;
                if (c1453AjMArr == null || c1453AjMArr.length < i) {
                    c1453AjMArr = new C1453AjM[Math.max(16, i)];
                }
                c1461AjU2.A00 = null;
                for (int i2 = 0; i2 < i; i2++) {
                    c1453AjMArr[i2] = c0910AHm2.A01[i2];
                }
                c0910AHm2.A09();
                for (int i3 = i - 1; -1 < i3; i3--) {
                    C1453AjM c1453AjM2 = c1453AjMArr[i3];
                    C7384Etj.A0X(c1453AjM2);
                    if (c1453AjM2.A0U) {
                        C1461AjU.A00(c1453AjM2, c1461AjU2);
                    }
                    c1453AjMArr[i3] = null;
                }
                c1461AjU2.A00 = c1453AjMArr;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final boolean A0D(C1453AjM c1453AjM, boolean z) {
        C1459AjS c1459AjS = c1453AjM.A0d;
        int iIntValue = c1459AjS.A05.intValue();
        if (iIntValue != 1 && iIntValue != 0) {
            if (iIntValue == 3 || iIntValue == 2) {
                this.A04.A0G(new C1478Ajl(c1453AjM, false, z));
                return false;
            }
            if (iIntValue != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C1454AjN c1454AjN = c1459AjS.A0G;
            if (!c1454AjN.A0L || z) {
                c1454AjN.A0L = true;
                if (!c1453AjM.A0R && (c1454AjN.A0G || A07(c1453AjM))) {
                    C1453AjM c1453AjMA0E = c1453AjM.A0E();
                    if (c1453AjMA0E == null || !c1453AjMA0E.A0d.A0G.A0L) {
                        this.A05.A01(c1453AjM, C79.A0C);
                    }
                    if (!this.A02) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[Catch: all -> 0x0139, TryCatch #0 {all -> 0x0139, blocks: (B:16:0x0029, B:18:0x0034, B:20:0x003e, B:23:0x004d, B:25:0x0057, B:26:0x005c, B:28:0x0062, B:29:0x0069, B:31:0x0073, B:38:0x0096, B:40:0x009b, B:43:0x00a3, B:46:0x00ac, B:48:0x00b2, B:52:0x00bc, B:54:0x00ca, B:82:0x0129, B:50:0x00b8, B:55:0x00ce, B:57:0x00d6, B:58:0x00da, B:61:0x00e0, B:63:0x00e6, B:65:0x00ee, B:70:0x00f9, B:72:0x00ff, B:73:0x0102, B:75:0x0108, B:78:0x0119, B:79:0x011c, B:81:0x0122, B:77:0x0110, B:69:0x00f5, B:34:0x0082, B:36:0x008c, B:87:0x0135), top: B:96:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[Catch: all -> 0x0139, TryCatch #0 {all -> 0x0139, blocks: (B:16:0x0029, B:18:0x0034, B:20:0x003e, B:23:0x004d, B:25:0x0057, B:26:0x005c, B:28:0x0062, B:29:0x0069, B:31:0x0073, B:38:0x0096, B:40:0x009b, B:43:0x00a3, B:46:0x00ac, B:48:0x00b2, B:52:0x00bc, B:54:0x00ca, B:82:0x0129, B:50:0x00b8, B:55:0x00ce, B:57:0x00d6, B:58:0x00da, B:61:0x00e0, B:63:0x00e6, B:65:0x00ee, B:70:0x00f9, B:72:0x00ff, B:73:0x0102, B:75:0x0108, B:78:0x0119, B:79:0x011c, B:81:0x0122, B:77:0x0110, B:69:0x00f5, B:34:0x0082, B:36:0x008c, B:87:0x0135), top: B:96:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce A[Catch: all -> 0x0139, TryCatch #0 {all -> 0x0139, blocks: (B:16:0x0029, B:18:0x0034, B:20:0x003e, B:23:0x004d, B:25:0x0057, B:26:0x005c, B:28:0x0062, B:29:0x0069, B:31:0x0073, B:38:0x0096, B:40:0x009b, B:43:0x00a3, B:46:0x00ac, B:48:0x00b2, B:52:0x00bc, B:54:0x00ca, B:82:0x0129, B:50:0x00b8, B:55:0x00ce, B:57:0x00d6, B:58:0x00da, B:61:0x00e0, B:63:0x00e6, B:65:0x00ee, B:70:0x00f9, B:72:0x00ff, B:73:0x0102, B:75:0x0108, B:78:0x0119, B:79:0x011c, B:81:0x0122, B:77:0x0110, B:69:0x00f5, B:34:0x0082, B:36:0x008c, B:87:0x0135), top: B:96:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0E(kotlin.jvm.functions.Function0<kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456AjP.A0E(kotlin.jvm.functions.Function0):boolean");
    }

    public C1456AjP(C1453AjM c1453AjM) {
        this.A06 = c1453AjM;
    }

    public static final void A00(C1453AjM c1453AjM, C1456AjP c1456AjP) {
        C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM2 = c1453AjMArr[i2];
            if (AnonymousClass002.A1b(c1453AjM2.A0F(), true) && !c1453AjM2.A0R) {
                if (c1456AjP.A05.A02(c1453AjM2)) {
                    c1453AjM2.A0M();
                }
                A00(c1453AjM2, c1456AjP);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1453AjM r6, X.C1456AjP r7) throws java.lang.Throwable {
        /*
            X.AHm r0 = r6.A0D()
            T[] r6 = r0.A01
            int r5 = r0.A00
            r4 = 0
        L9:
            if (r4 >= r5) goto L41
            r3 = r6[r4]
            X.AjM r3 = (X.C1453AjM) r3
            X.AjS r0 = r3.A0d
            X.AjN r2 = r0.A0G
            java.lang.Integer r1 = r2.A0A
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto L22
            X.AjT r0 = r2.A0S
            r0.A03()
            X.Ajf r0 = r0.A00
            if (r0 == 0) goto L38
        L22:
            boolean r0 = X.AbstractC1475Aji.A00(r3)
            if (r0 == 0) goto L3d
            boolean r0 = r3.A0R
            if (r0 != 0) goto L38
            X.AjM r0 = r7.A06
            if (r3 != r0) goto L3b
            androidx.compose.ui.unit.Constraints r0 = r7.A01
            X.C7384Etj.A0X(r0)
        L35:
            A08(r3, r0)
        L38:
            int r4 = r4 + 1
            goto L9
        L3b:
            r0 = 0
            goto L35
        L3d:
            A01(r3, r7)
            goto L38
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456AjP.A01(X.AjM, X.AjP):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(X.C1453AjM r8, boolean r9) throws java.lang.Throwable {
        /*
            r7 = this;
            X.AHm r0 = r8.A0D()
            T[] r6 = r0.A01
            int r5 = r0.A00
            r4 = 0
        L9:
            if (r4 >= r5) goto L79
            r3 = r6[r4]
            X.AjM r3 = (X.C1453AjM) r3
            X.AjS r0 = r3.A0d
            if (r9 != 0) goto L65
            X.AjN r2 = r0.A0G
            java.lang.Integer r1 = r2.A0A
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto L24
            X.AjT r0 = r2.A0S
        L1d:
            r0.A03()
            X.Ajf r0 = r0.A00
            if (r0 == 0) goto L52
        L24:
            boolean r0 = X.AbstractC1475Aji.A00(r3)
            if (r0 == 0) goto L5e
            if (r9 != 0) goto L60
            X.AjS r0 = r3.A0d
            boolean r0 = r0.A0E
            r1 = 1
            if (r0 == 0) goto L5a
            X.Ajd r0 = r7.A05
            boolean r0 = r0.A02(r3)
            if (r0 == 0) goto L5a
            r7.A0A(r3, r1)
        L3e:
            X.AjS r1 = r3.A0d
            X.AjN r0 = r1.A0G
            boolean r0 = r0.A0L
        L44:
            if (r0 == 0) goto L49
            r7.A0A(r3, r9)
        L49:
            if (r9 == 0) goto L55
            boolean r0 = r1.A0E
        L4d:
            if (r0 != 0) goto L52
            r7.A02(r3, r9)
        L52:
            int r4 = r4 + 1
            goto L9
        L55:
            X.AjN r0 = r1.A0G
            boolean r0 = r0.A0L
            goto L4d
        L5a:
            r7.A0B(r3, r1)
            goto L3e
        L5e:
            if (r9 == 0) goto L3e
        L60:
            X.AjS r1 = r3.A0d
            boolean r0 = r1.A0E
            goto L44
        L65:
            X.AjO r2 = r0.A04
            if (r2 == 0) goto L76
            java.lang.Integer r1 = r2.A07
        L6b:
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto L24
            if (r2 == 0) goto L52
            X.AjT r0 = r2.A0J
            if (r0 == 0) goto L52
            goto L1d
        L76:
            java.lang.Integer r1 = X.C79.A0C
            goto L6b
        L79:
            X.AjS r0 = r8.A0d
            if (r9 == 0) goto L85
            boolean r0 = r0.A0E
        L7f:
            if (r0 == 0) goto L84
            r7.A0A(r8, r9)
        L84:
            return
        L85:
            X.AjN r0 = r0.A0G
            boolean r0 = r0.A0L
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456AjP.A02(X.AjM, boolean):void");
    }
}
