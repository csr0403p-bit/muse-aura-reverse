package X;

import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;

/* renamed from: X.AkD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1506AkD extends AbstractC1439Aj8 implements InterfaceC1219Aex, InterfaceC1403AiY, InterfaceC1214Aes, InterfaceC1451AjK, C1Z2 {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final boolean A03;
    public final G0V<C2Um, C2Um, Unit> A04;

    @Override // X.InterfaceC1403AiY
    public final void AUZ(InterfaceC1497Ak4 interfaceC1497Ak4) {
    }

    @Override // X.InterfaceC1403AiY, X.InterfaceC1407Aic
    public final /* synthetic */ void AVH(long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061 A[EDGE_INSN: B:60:0x0061->B:24:0x0061 BREAK  A[LOOP:0: B:16:0x004c->B:63:0x004c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1519AkT A02() {
        /*
            r14 = this;
            X.AkT r9 = new X.AkT
            r9.<init>()
            int r1 = r14.A00
            r0 = 1
            if (r1 == r0) goto L28
            r0 = 0
            if (r1 != r0) goto L40
            X.AKH<X.AkL> r0 = X.Am0.A09
            java.lang.Object r0 = X.ARZ.A01(r0, r14)
            X.AkL r0 = (X.InterfaceC1514AkL) r0
            X.AkI r0 = (X.C1511AkI) r0
            androidx.compose.runtime.MutableState r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.AkH r0 = (X.C1510AkH) r0
            int r1 = r0.A00
            r0 = 1
            boolean r0 = X.AnonymousClass002.A1Q(r1, r0)
            r0 = r0 ^ 1
        L28:
            r9.A0B = r0
            r13 = 2048(0x800, float:2.87E-42)
            r12 = 1024(0x400, float:1.435E-42)
            X.Aj8 r8 = r14.node
            r7 = 3072(0xc00, float:4.305E-42)
            boolean r0 = r8.isAttached
            if (r0 != 0) goto L45
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L40:
            r0 = 2
            if (r1 != r0) goto Lb7
            r0 = 0
            goto L28
        L45:
            r0 = r8
            X.AjM r10 = X.AbstractC1414Aij.A04(r14)
            if (r10 == 0) goto L61
        L4c:
            int r1 = X.C1438Aj7.A00(r10, r7)
            r11 = 0
            if (r1 == 0) goto La8
        L53:
            if (r0 == 0) goto La8
            int r2 = r0.kindSet
            r1 = r2 & r7
            if (r1 == 0) goto La5
            if (r0 == r8) goto L62
            r1 = r2 & r12
            if (r1 == 0) goto L62
        L61:
            return r9
        L62:
            r2 = r2 & r13
            if (r2 == 0) goto La5
            r6 = r0
            r5 = r11
        L67:
            boolean r1 = r6 instanceof X.InterfaceC1449AjI
            if (r1 == 0) goto L77
            X.AjI r6 = (X.InterfaceC1449AjI) r6
            r6.A4V(r9)
        L70:
            X.Aj8 r6 = X.AbstractC1414Aij.A00(r5)
        L74:
            if (r6 == 0) goto La5
            goto L67
        L77:
            int r1 = r6.kindSet
            r1 = r1 & r13
            if (r1 == 0) goto L70
            boolean r1 = r6 instanceof X.AbstractC1437Aj6
            if (r1 == 0) goto L70
            r1 = r6
            X.Aj6 r1 = (X.AbstractC1437Aj6) r1
            X.Aj8 r4 = r1.A00
            r3 = 0
        L86:
            r2 = 1
            if (r4 == 0) goto La2
            int r1 = r4.kindSet
            r1 = r1 & r13
            if (r1 == 0) goto L93
            int r3 = r3 + 1
            if (r3 != r2) goto L96
            r6 = r4
        L93:
            X.Aj8 r4 = r4.child
            goto L86
        L96:
            X.AHm r5 = X.C8j5.A0K(r5)
            X.Aj8 r6 = X.C8j4.A0X(r5, r6)
            r5.A0G(r4)
            goto L93
        La2:
            if (r3 != r2) goto L70
            goto L74
        La5:
            X.Aj8 r0 = r0.parent
            goto L53
        La8:
            X.AjM r10 = r10.A0E()
            if (r10 == 0) goto L61
            X.Aj7 r0 = r10.A0f
            if (r0 == 0) goto Lb5
            X.Aj8 r0 = r0.A06
            goto L4c
        Lb5:
            r0 = r11
            goto L4c
        Lb7:
            java.lang.String r0 = "Unknown Focusability"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1506AkD.A02():X.AkT");
    }

    public final EnumC1443AjC A03() {
        C1506AkD c1506AkDACD;
        if (this.isAttached && (c1506AkDACD = ((AndroidComposeView) AbstractC1414Aij.A07(this)).A0h.ACD()) != null) {
            if (this == c1506AkDACD) {
                return EnumC1443AjC.A02;
            }
            if (c1506AkDACD.isAttached) {
                AbstractC1439Aj8 abstractC1439Aj8 = c1506AkDACD.node;
                if (!abstractC1439Aj8.isAttached) {
                    ASP.A01("visitAncestors called on an unattached node");
                    throw F60.createAndThrow();
                }
                AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
                C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1506AkDACD);
                if (c1453AjMA04 != null) {
                    while (true) {
                        if ((c1453AjMA04.A0f.A02.aggregateChildKindSet & 1024) != 0) {
                            while (abstractC1439Aj82 != null) {
                                if ((abstractC1439Aj82.kindSet & 1024) != 0) {
                                    AbstractC1439Aj8 abstractC1439Aj8A00 = abstractC1439Aj82;
                                    C0910AHm c0910AHm = null;
                                    do {
                                        if (abstractC1439Aj8A00 instanceof C1506AkD) {
                                            if (this == abstractC1439Aj8A00) {
                                                return EnumC1443AjC.A03;
                                            }
                                        } else if ((abstractC1439Aj8A00.kindSet & 1024) != 0 && (abstractC1439Aj8A00 instanceof AbstractC1437Aj6)) {
                                            int i = 0;
                                            for (AbstractC1439Aj8 abstractC1439Aj83 = ((AbstractC1437Aj6) abstractC1439Aj8A00).A00; abstractC1439Aj83 != null; abstractC1439Aj83 = abstractC1439Aj83.child) {
                                                if ((abstractC1439Aj83.kindSet & 1024) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        abstractC1439Aj8A00 = abstractC1439Aj83;
                                                    } else {
                                                        if (c0910AHm == null) {
                                                            c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                                        }
                                                        if (abstractC1439Aj8A00 != null) {
                                                            c0910AHm.A0G(abstractC1439Aj8A00);
                                                            abstractC1439Aj8A00 = null;
                                                        }
                                                        c0910AHm.A0G(abstractC1439Aj83);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        abstractC1439Aj8A00 = AbstractC1414Aij.A00(c0910AHm);
                                    } while (abstractC1439Aj8A00 != null);
                                }
                                abstractC1439Aj82 = abstractC1439Aj82.parent;
                            }
                        }
                        c1453AjMA04 = c1453AjMA04.A0E();
                        if (c1453AjMA04 == null) {
                            break;
                        }
                        C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
                        abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
                    }
                }
            }
        }
        return EnumC1443AjC.A04;
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ ARP AJE() {
        return ARN.A00;
    }

    @Override // X.InterfaceC1214Aes
    public final boolean Ab9(int i) {
        boolean zA06;
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (A02().A0B) {
                int iIntValue = A01(this, i).intValue();
                if (iIntValue == 0) {
                    zA06 = AbstractC1507AkE.A01(this);
                } else if (iIntValue == 2) {
                    zA06 = true;
                } else {
                    if (iIntValue != 1 && iIntValue != 3) {
                        throw C3cG.A0q();
                    }
                    zA06 = false;
                }
            } else {
                zA06 = AbstractC1504AkB.A06(this, new BUW(i, 5), i);
            }
            return zA06;
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public C1506AkD(boolean z, G0V g0v, int i) {
        this.A03 = z;
        this.A04 = g0v;
        this.A00 = i;
    }

    public static int A00(C1506AkD c1506AkD) {
        return c1506AkD.A03().ordinal();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[PHI: r6
  0x0065: PHI (r6v2 X.AHm) = (r6v1 X.AHm), (r6v1 X.AHm), (r6v4 X.AHm) binds: [B:21:0x003b, B:23:0x003f, B:33:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[LOOP:2: B:18:0x0034->B:92:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A01(X.C1506AkD r10, int r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1506AkD.A01(X.AkD, int):java.lang.Integer");
    }

    public final AaC A04(InterfaceC1497Ak4 interfaceC1497Ak4) {
        AaC aaCAPk;
        AaC aaC = A02().A08;
        return aaC != C1509AkG.A00 ? interfaceC1497Ak4 == null ? aaC : aaC.A03(interfaceC1497Ak4.APn(AbstractC1414Aij.A05(this), 0L, true)) : (interfaceC1497Ak4 == null || (aaCAPk = interfaceC1497Ak4.APk(AbstractC1414Aij.A05(this), false)) == null) ? C2J7.A00(0L, AQY.A01(((AZE) AbstractC1414Aij.A05(this)).A03)) : aaCAPk;
    }

    public final void A05() {
        if (A00(this) == 0) {
            C10543Hqv c10543HqvA0z = C3cG.A0z();
            AbstractC1441AjA.A00(this, new C2335BUj(3, c10543HqvA0z, this));
            T t = c10543HqvA0z.element;
            if (t == 0) {
                C7384Etj.A0b("focusProperties");
                throw F60.createAndThrow();
            }
            if (((AkZ) t).ADM()) {
                return;
            }
            AbstractC1414Aij.A01(this).A6G(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.Aj8] */
    public final void A06(C2Um c2Um, C2Um c2Um2) {
        G0V<C2Um, C2Um, Unit> g0v;
        InterfaceC1536Aks interfaceC1536AksA01 = AbstractC1414Aij.A01(this);
        C1506AkD c1506AkDACD = interfaceC1536AksA01.ACD();
        if (!c2Um.equals(c2Um2) && (g0v = this.A04) != null) {
            g0v.invoke(c2Um, c2Um2);
        }
        AbstractC1439Aj8 abstractC1439Aj8 = this.node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitAncestors called on an unattached node");
            throw F60.createAndThrow();
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8;
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(this);
        if (c1453AjMA04 == null) {
            return;
        }
        while (true) {
            if (C1438Aj7.A00(c1453AjMA04, 5120) != 0) {
                while (abstractC1439Aj82 != null) {
                    int i = abstractC1439Aj82.kindSet;
                    if ((i & 5120) != 0) {
                        if (abstractC1439Aj82 != abstractC1439Aj8 && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj82;
                            C0910AHm c0910AHmA0K = null;
                            do {
                                if (abstractC1437Aj6A00 instanceof InterfaceC1448AjH) {
                                    InterfaceC1448AjH interfaceC1448AjH = (InterfaceC1448AjH) abstractC1437Aj6A00;
                                    if (c1506AkDACD == interfaceC1536AksA01.ACD()) {
                                        interfaceC1448AjH.ATP(c2Um2);
                                    }
                                } else if ((abstractC1437Aj6A00.kindSet & 4096) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                    AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6A00.A00;
                                    int i2 = 0;
                                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                    while (abstractC1439Aj83 != null) {
                                        if ((abstractC1439Aj83.kindSet & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                abstractC1437Aj6A00 = abstractC1439Aj83;
                                            } else {
                                                c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                                abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                                if (abstractC1437Aj6A00 != 0) {
                                                    c0910AHmA0K.A0G(abstractC1437Aj6A00);
                                                    abstractC1437Aj6A00 = 0;
                                                }
                                                c0910AHmA0K.A0G(abstractC1439Aj83);
                                            }
                                        }
                                        abstractC1439Aj83 = abstractC1439Aj83.child;
                                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHmA0K);
                            } while (abstractC1437Aj6A00 != 0);
                        }
                    }
                    abstractC1439Aj82 = abstractC1439Aj82.parent;
                }
            }
            c1453AjMA04 = c1453AjMA04.A0E();
            if (c1453AjMA04 == null) {
                return;
            }
            C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
            abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
        }
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ Object AEO(ARR arr) {
        return AbstractC1218Aew.A00(this, arr);
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        A05();
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        InterfaceC1536Aks interfaceC1536AksA01;
        int iA00 = A00(this);
        if (iA00 == 0) {
            interfaceC1536AksA01 = AbstractC1414Aij.A01(this);
            interfaceC1536AksA01.A6H(8, true, true, false);
            if (this.A03) {
            }
            ((C1517AkR) interfaceC1536AksA01).A05.A00();
        }
        if (iA00 != 1) {
            return;
        }
        interfaceC1536AksA01 = AbstractC1414Aij.A01(this);
        C1506AkD c1506AkDA00 = AbstractC1485Ajs.A00(this);
        if (c1506AkDA00 == null || !c1506AkDA00.A03) {
            return;
        }
        ((C1517AkR) interfaceC1536AksA01).A06.AbB(null, null);
        ((C1517AkR) interfaceC1536AksA01).A05.A00();
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        if (A03().AOS()) {
            AbstractC1414Aij.A01(this).A6H(8, true, true, true);
        }
    }
}
