package X;

import android.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AiH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1387AiH extends AbstractC1424Ait implements InterfaceC1497Ak4, C3TG, AnW {
    public float A00;
    public C1393AiO A02;
    public InterfaceC1327AhE A03;
    public GraphicsLayer A05;
    public GraphicsLayer A06;
    public InterfaceC1134Abi A07;
    public AbstractC1387AiH A08;
    public AbstractC1387AiH A09;
    public InterfaceC1402AiX A0A;
    public AXN A0B;
    public G0U<? super C2av, Unit> A0C;
    public G0V<? super InterfaceC1327AhE, ? super GraphicsLayer, Unit> A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public AeA<AbstractC1493Ak0> A0M;
    public C1395AiQ A0N;
    public EnumC1820Arj A0O;
    public final C1453AjM A0P;
    public static final G0U<AbstractC1387AiH, Unit> A0W = BUT.A00(33);
    public static final G0U<AbstractC1387AiH, Unit> A0U = BUT.A00(32);
    public static final C1390AiL A0R = new C1390AiL();
    public static final C1395AiQ A0V = new C1395AiQ();
    public static final float[] A0X = C1392AiN.A06();
    public static final InterfaceC1382AiC A0S = new C1347AhY();
    public static final InterfaceC1382AiC A0T = new C1467Aja();
    public float A0L = 0.8f;
    public long A01 = 0;
    public C1DM A04 = C1OM.A00;
    public final Function0<Unit> A0Q = new C2328BUc(this, 24);

    private final void A0E(AbstractC1439Aj8 abstractC1439Aj8, C0923AHz c0923AHz, InterfaceC1382AiC interfaceC1382AiC, float f, int i, long j, boolean z) {
        if (abstractC1439Aj8 == null) {
            A0w(c0923AHz, interfaceC1382AiC, i, j, z);
            return;
        }
        if (!interfaceC1382AiC.AfT(abstractC1439Aj8)) {
            A0E(AbstractC1401AiW.A00(abstractC1439Aj8, interfaceC1382AiC.AAm()), c0923AHz, interfaceC1382AiC, f, i, j, z);
            return;
        }
        int i2 = c0923AHz.A00;
        A0M(c0923AHz, abstractC1439Aj8, i2 + 1, c0923AHz.size());
        A0H(A0B(c0923AHz.A01, abstractC1439Aj8, interfaceC1382AiC, A05(f, z, false)), c0923AHz, interfaceC1382AiC, this, f, i, j, z, true);
        c0923AHz.A00 = i2;
    }

    private final void A0G(AbstractC1439Aj8 abstractC1439Aj8, C0923AHz c0923AHz, InterfaceC1382AiC interfaceC1382AiC, int i, long j, boolean z) {
        if (abstractC1439Aj8 == null) {
            A0w(c0923AHz, interfaceC1382AiC, i, j, z);
            return;
        }
        if (!interfaceC1382AiC.AfT(abstractC1439Aj8)) {
            A0G(AbstractC1401AiW.A00(abstractC1439Aj8, interfaceC1382AiC.AAm()), c0923AHz, interfaceC1382AiC, i, j, z);
            return;
        }
        int i2 = c0923AHz.A00;
        A0M(c0923AHz, abstractC1439Aj8, i2 + 1, c0923AHz.size());
        A0G(A0B(c0923AHz.A01, abstractC1439Aj8, interfaceC1382AiC, A05(-1.0f, z, false)), c0923AHz, interfaceC1382AiC, i, j, z);
        c0923AHz.A00 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0J(X.C1393AiO r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A0J(X.AiO, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.Aj8] */
    public static final void A0K(InterfaceC1327AhE interfaceC1327AhE, GraphicsLayer graphicsLayer, AbstractC1387AiH abstractC1387AiH) {
        AbstractC1437Aj6 abstractC1437Aj6A0A = abstractC1387AiH.A0A(4);
        if (abstractC1437Aj6A0A == 0) {
            abstractC1387AiH.A0u(interfaceC1327AhE, graphicsLayer);
            return;
        }
        C1324AhB c1324AhB = ((AndroidComposeView) AbstractC1333AhK.A00(abstractC1387AiH.A0P)).A0o;
        long jA01 = AQY.A01(((AZE) abstractC1387AiH).A03);
        C0910AHm c0910AHm = null;
        do {
            if (abstractC1437Aj6A0A instanceof InterfaceC1332AhJ) {
                C1324AhB.A00(interfaceC1327AhE, graphicsLayer, (InterfaceC1332AhJ) abstractC1437Aj6A0A, c1324AhB, abstractC1387AiH, jA01);
            } else if ((abstractC1437Aj6A0A.kindSet & 4) != 0 && (abstractC1437Aj6A0A instanceof AbstractC1437Aj6)) {
                AbstractC1439Aj8 abstractC1439Aj8 = abstractC1437Aj6A0A.A00;
                int i = 0;
                abstractC1437Aj6A0A = abstractC1437Aj6A0A;
                while (abstractC1439Aj8 != null) {
                    if ((abstractC1439Aj8.kindSet & 4) != 0) {
                        i++;
                        if (i == 1) {
                            abstractC1437Aj6A0A = abstractC1439Aj8;
                        } else {
                            if (c0910AHm == null) {
                                c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                            }
                            if (abstractC1437Aj6A0A != 0) {
                                c0910AHm.A0G(abstractC1437Aj6A0A);
                                abstractC1437Aj6A0A = 0;
                            }
                            c0910AHm.A0G(abstractC1439Aj8);
                        }
                    }
                    abstractC1439Aj8 = abstractC1439Aj8.child;
                    abstractC1437Aj6A0A = abstractC1437Aj6A0A;
                }
                if (i == 1) {
                }
            }
            abstractC1437Aj6A0A = AbstractC1414Aij.A00(c0910AHm);
        } while (abstractC1437Aj6A0A != 0);
    }

    public static final void A0L(GraphicsLayer graphicsLayer, AbstractC1387AiH abstractC1387AiH, G0U g0u, float f, long j) {
        if (graphicsLayer == null) {
            if (abstractC1387AiH.A06 != null) {
                abstractC1387AiH.A06 = null;
                abstractC1387AiH.A0y(null, false);
            }
            abstractC1387AiH.A0y(g0u, false);
        } else {
            if (g0u != null) {
                throw C60O.A0i("both ways to create layers shouldn't be used together");
            }
            if (abstractC1387AiH.A06 != graphicsLayer) {
                abstractC1387AiH.A06 = null;
                abstractC1387AiH.A0y(null, false);
                abstractC1387AiH.A06 = graphicsLayer;
            }
            if (abstractC1387AiH.A0A == null) {
                C1453AjM c1453AjM = abstractC1387AiH.A0P;
                InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(c1453AjM);
                G0V c2336BUk = abstractC1387AiH.A0D;
                if (c2336BUk == null) {
                    c2336BUk = new C2336BUk(2, abstractC1387AiH, new C2328BUc(abstractC1387AiH, 23));
                    abstractC1387AiH.A0D = c2336BUk;
                }
                Function0<Unit> function0 = abstractC1387AiH.A0Q;
                C1388AiI c1388AiI = new C1388AiI(null, graphicsLayer, (AndroidComposeView) interfaceC1464AjXA00, function0, c2336BUk);
                c1388AiI.AbU(((AZE) abstractC1387AiH).A03);
                c1388AiI.AQu(j);
                abstractC1387AiH.A0A = c1388AiI;
                c1453AjM.A0P = true;
                function0.invoke();
            }
        }
        if (abstractC1387AiH.A01 != j) {
            C1453AjM c1453AjM2 = abstractC1387AiH.A0P;
            AbstractC1333AhK.A00(c1453AjM2).AiM(-4.0f);
            abstractC1387AiH.A01 = j;
            InterfaceC1402AiX interfaceC1402AiX = abstractC1387AiH.A0A;
            if (interfaceC1402AiX != null) {
                interfaceC1402AiX.AQu(j);
            } else {
                AbstractC1387AiH abstractC1387AiH2 = abstractC1387AiH.A09;
                if (abstractC1387AiH2 != null) {
                    abstractC1387AiH2.A0n();
                }
            }
            c1453AjM2.A0W(abstractC1387AiH);
            AbstractC1424Ait.A0V(abstractC1387AiH);
            InterfaceC1464AjX interfaceC1464AjX = c1453AjM2.A0D;
            if (interfaceC1464AjX != null) {
                interfaceC1464AjX.ATn(c1453AjM2);
            }
        }
        abstractC1387AiH.A00 = f;
        C1453AjM c1453AjM3 = abstractC1387AiH.A0P;
        if (abstractC1387AiH == c1453AjM3.A0f.A04) {
            ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM3)).A12.A06(c1453AjM3);
        }
        if (((AbstractC1424Ait) abstractC1387AiH).A05) {
            return;
        }
        abstractC1387AiH.A0g(abstractC1387AiH.A0e());
    }

    public static final boolean A0Q(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        return ((f5 * f5) / (fA03 * fA03)) + ((f6 * f6) / (fA00 * fA00)) <= 1.0f;
    }

    @Override // X.AZE
    public void A0a(GraphicsLayer graphicsLayer, float f, long j) {
        G0U g0u;
        long j2;
        if (this.A0F) {
            j2 = AZE.A01(this).A00;
            g0u = null;
        } else {
            g0u = null;
            j2 = j;
        }
        A0L(graphicsLayer, this, g0u, f, j2);
    }

    public abstract AbstractC1439Aj8 A0j();

    public abstract AbstractC1383AiD A0l();

    public abstract void A0s();

    public abstract void A0u(InterfaceC1327AhE interfaceC1327AhE, GraphicsLayer graphicsLayer);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0y(X.G0U<? super X.C2av, kotlin.Unit> r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A0y(X.G0U, boolean):void");
    }

    @Override // X.InterfaceC1497Ak4
    public final long APm(InterfaceC1497Ak4 interfaceC1497Ak4, long j) {
        return APn(interfaceC1497Ak4, j, true);
    }

    private final long A07(AbstractC1387AiH abstractC1387AiH, long j, boolean z) {
        if (abstractC1387AiH == this) {
            return j;
        }
        AbstractC1387AiH abstractC1387AiH2 = this.A09;
        return (abstractC1387AiH2 == null || abstractC1387AiH.equals(abstractC1387AiH2)) ? A08(this, j, z) : A08(this, abstractC1387AiH2.A07(abstractC1387AiH, j, z), z);
    }

    public static final long A08(AbstractC1387AiH abstractC1387AiH, long j, boolean z) {
        if (z || !((AbstractC1424Ait) abstractC1387AiH).A04) {
            long j2 = abstractC1387AiH.A01;
            j = AnonymousClass005.A0L(AnonymousClass001.A00(j) - ((int) (j2 >> 32)), AnonymousClass001.A01(j, 4294967295L) - AnonymousClass002.A09(j2));
        }
        InterfaceC1402AiX interfaceC1402AiX = abstractC1387AiH.A0A;
        if (interfaceC1402AiX == null) {
            return j;
        }
        C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
        float[] fArrA02 = C1388AiI.A02(c1388AiI);
        if (fArrA02 == null) {
            return 9187343241974906880L;
        }
        return !c1388AiI.A09 ? C1392AiN.A00(fArrA02, j) : j;
    }

    public static final long A09(AbstractC1387AiH abstractC1387AiH, long j, boolean z) {
        InterfaceC1402AiX interfaceC1402AiX = abstractC1387AiH.A0A;
        if (interfaceC1402AiX != null) {
            C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
            C1388AiI.A00(c1388AiI);
            float[] fArr = c1388AiI.A0J;
            if (!c1388AiI.A09) {
                j = C1392AiN.A00(fArr, j);
            }
        }
        if (!z && ((AbstractC1424Ait) abstractC1387AiH).A04) {
            return j;
        }
        long j2 = abstractC1387AiH.A01;
        return AnonymousClass005.A0L(AnonymousClass001.A00(j) + ((int) (j2 >> 32)), AnonymousClass001.A01(j, 4294967295L) + AnonymousClass002.A09(j2));
    }

    private final AbstractC1439Aj8 A0A(int i) {
        AeA<Object> aeA = AbstractC1436Aj5.A00;
        boolean z = ((128 & i) != 0) | ((4194304 & i) != 0);
        AbstractC1439Aj8 abstractC1439Aj8A0j = A0j();
        if (z || (abstractC1439Aj8A0j = abstractC1439Aj8A0j.parent) != null) {
            for (AbstractC1439Aj8 abstractC1439Aj8A0C = A0C(this, z); abstractC1439Aj8A0C != null && (abstractC1439Aj8A0C.aggregateChildKindSet & i) != 0; abstractC1439Aj8A0C = abstractC1439Aj8A0C.child) {
                if ((abstractC1439Aj8A0C.kindSet & i) != 0) {
                    return abstractC1439Aj8A0C;
                }
                if (abstractC1439Aj8A0C == abstractC1439Aj8A0j) {
                    break;
                }
            }
        }
        return null;
    }

    public static final AbstractC1439Aj8 A0C(AbstractC1387AiH abstractC1387AiH, boolean z) {
        AbstractC1439Aj8 abstractC1439Aj8A0j;
        C1438Aj7 c1438Aj7 = abstractC1387AiH.A0P.A0f;
        if (c1438Aj7.A04 == abstractC1387AiH) {
            return c1438Aj7.A02;
        }
        AbstractC1387AiH abstractC1387AiH2 = abstractC1387AiH.A09;
        if (!z) {
            if (abstractC1387AiH2 != null) {
                return abstractC1387AiH2.A0j();
            }
            return null;
        }
        if (abstractC1387AiH2 == null || (abstractC1439Aj8A0j = abstractC1387AiH2.A0j()) == null) {
            return null;
        }
        return abstractC1439Aj8A0j.child;
    }

    public static final AbstractC1387AiH A0D(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C1384AiE c1384AiE;
        AbstractC1387AiH abstractC1387AiH;
        if ((interfaceC1497Ak4 instanceof C1384AiE) && (c1384AiE = (C1384AiE) interfaceC1497Ak4) != null && (abstractC1387AiH = c1384AiE.A00.A05) != null) {
            return abstractC1387AiH;
        }
        C7384Etj.A0Z(interfaceC1497Ak4, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC1387AiH) interfaceC1497Ak4;
    }

    private final void A0F(AbstractC1439Aj8 abstractC1439Aj8, C0923AHz c0923AHz, InterfaceC1382AiC interfaceC1382AiC, float f, int i, long j, boolean z) {
        int i2;
        int i3;
        if (abstractC1439Aj8 == null) {
            A0w(c0923AHz, interfaceC1382AiC, i, j, z);
            return;
        }
        if (!interfaceC1382AiC.AfT(abstractC1439Aj8)) {
            A0F(AbstractC1401AiW.A00(abstractC1439Aj8, interfaceC1382AiC.AAm()), c0923AHz, interfaceC1382AiC, f, i, j, z);
            return;
        }
        if (!interfaceC1382AiC.ANr(abstractC1439Aj8)) {
            A0H(AbstractC1401AiW.A00(abstractC1439Aj8, interfaceC1382AiC.AAm()), c0923AHz, interfaceC1382AiC, this, f, i, j, z, false);
            return;
        }
        int i4 = c0923AHz.A00;
        int size = c0923AHz.size();
        if (i4 == size - 1) {
            int i5 = i4 + 1;
            C0923AHz.A01(c0923AHz, i5, size);
            c0923AHz.A00++;
            C0912AHo<Object> c0912AHo = c0923AHz.A02;
            c0912AHo.A09(abstractC1439Aj8);
            AI1 ai1 = c0923AHz.A01;
            A0H(A0B(ai1, abstractC1439Aj8, interfaceC1382AiC, A05(f, z, false)), c0923AHz, interfaceC1382AiC, this, f, i, j, z, false);
            c0923AHz.A00 = i4;
            if (i5 == c0923AHz.size() - 1 || (C0923AHz.A00(c0923AHz) & 2) != 0) {
                int i6 = c0923AHz.A00 + 1;
                c0912AHo.A05(i6);
                if (i6 < 0 || i6 >= (i3 = ai1.A00)) {
                    throw new IndexOutOfBoundsException("Index must be between 0 and size");
                }
                long[] jArr = ai1.A01;
                if (i6 != i3 - 1) {
                    int i7 = i6 + 1;
                    System.arraycopy(jArr, i7, jArr, i6, i3 - i7);
                }
                ai1.A00--;
                return;
            }
            return;
        }
        long jA00 = C0923AHz.A00(c0923AHz);
        int i8 = c0923AHz.A00;
        int size2 = c0923AHz.size();
        int i9 = size2 - 1;
        c0923AHz.A00 = i9;
        A0M(c0923AHz, abstractC1439Aj8, i9 + 1, size2);
        A0H(A0B(c0923AHz.A01, abstractC1439Aj8, interfaceC1382AiC, A05(f, z, false)), c0923AHz, interfaceC1382AiC, this, f, i, j, z, false);
        c0923AHz.A00 = i9;
        long jA002 = C0923AHz.A00(c0923AHz);
        int i10 = c0923AHz.A00;
        int i11 = i10 + 1;
        int size3 = c0923AHz.size();
        if (i11 >= size3 - 1 || AI2.A00(jA00, jA002) <= 0) {
            i2 = i11;
            i11 = size3;
        } else {
            i2 = i8 + 1;
            if (AnonymousClass002.A1L(((jA002 & 2) > 0L ? 1 : ((jA002 & 2) == 0L ? 0 : -1)))) {
                i11 = i10 + 2;
            }
        }
        C0923AHz.A01(c0923AHz, i2, i11);
        c0923AHz.A00 = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b A[PHI: r11
  0x015b: PHI (r11v9 X.AHm) = (r11v1 X.AHm), (r11v1 X.AHm), (r11v11 X.AHm) binds: [B:48:0x0130, B:50:0x0134, B:60:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163 A[EDGE_INSN: B:72:0x0163->B:65:0x0163 BREAK  A[LOOP:0: B:15:0x0042->B:75:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[LOOP:0: B:15:0x0042->B:75:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0H(X.AbstractC1439Aj8 r18, X.C0923AHz r19, X.InterfaceC1382AiC r20, X.AbstractC1387AiH r21, float r22, int r23, long r24, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A0H(X.Aj8, X.AHz, X.AiC, X.AiH, float, int, long, boolean, boolean):void");
    }

    private final void A0I(C1393AiO c1393AiO, AbstractC1387AiH abstractC1387AiH, boolean z) {
        if (abstractC1387AiH != this) {
            AbstractC1387AiH abstractC1387AiH2 = this.A09;
            if (abstractC1387AiH2 != null) {
                abstractC1387AiH2.A0I(c1393AiO, abstractC1387AiH, z);
            }
            long j = this.A01;
            float f = (int) (j >> 32);
            c1393AiO.A01 -= f;
            c1393AiO.A02 -= f;
            float fA09 = AnonymousClass002.A09(j);
            c1393AiO.A03 -= fA09;
            c1393AiO.A00 -= fA09;
            InterfaceC1402AiX interfaceC1402AiX = this.A0A;
            if (interfaceC1402AiX != null) {
                C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
                float[] fArrA02 = C1388AiI.A02(c1388AiI);
                if (!c1388AiI.A09) {
                    if (fArrA02 == null) {
                        c1393AiO.A01 = 0.0f;
                        c1393AiO.A03 = 0.0f;
                        c1393AiO.A02 = 0.0f;
                        c1393AiO.A00 = 0.0f;
                    } else {
                        C1392AiN.A01(c1393AiO, fArrA02);
                    }
                }
                if (this.A0G && z) {
                    long j2 = ((AZE) this).A03;
                    c1393AiO.A00(0.0f, 0.0f, (int) (j2 >> 32), AnonymousClass002.A09(j2));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0N(X.AbstractC1387AiH r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A0N(X.AiH, boolean):void");
    }

    private final void A0w(C0923AHz c0923AHz, InterfaceC1382AiC interfaceC1382AiC, int i, long j, boolean z) {
        if (!(this instanceof Ai8)) {
            AbstractC1387AiH abstractC1387AiH = this.A08;
            if (abstractC1387AiH != null) {
                abstractC1387AiH.A0x(c0923AHz, interfaceC1382AiC, i, A08(abstractC1387AiH, j, true), z);
                return;
            }
            return;
        }
        C1453AjM c1453AjM = this.A0P;
        boolean z2 = false;
        if (interfaceC1382AiC.AfU(c1453AjM)) {
            if (A10(j)) {
                z2 = z;
            } else if (i != 1 || (Float.floatToRawIntBits(A0i(j, this.A0B.Ah6(c1453AjM.A0E.AHo()))) & Integer.MAX_VALUE) >= 2139095040) {
                return;
            }
            int i2 = c0923AHz.A00;
            C0910AHm<C1453AjM> c0910AHmA0C = c1453AjM.A0C();
            C1453AjM[] c1453AjMArr = c0910AHmA0C.A01;
            for (int i3 = c0910AHmA0C.A00 - 1; i3 >= 0; i3--) {
                C1453AjM c1453AjM2 = c1453AjMArr[i3];
                if (c1453AjM2.A0d.A0G.A0G) {
                    interfaceC1382AiC.A6E(c0923AHz, c1453AjM2, i, j, z2);
                    long jA00 = C0923AHz.A00(c0923AHz);
                    if (AnonymousClass003.A03(jA00) < 0.0f && (jA00 & 1) != 0 && (jA00 & 2) == 0 && !interfaceC1382AiC.AfL(c0923AHz, c1453AjM2)) {
                        break;
                    }
                }
            }
            c0923AHz.A00 = i2;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    @Override // X.AZE
    public void A0b(G0U g0u, float f, long j) {
        if (this.A0F) {
            AbstractC1383AiD abstractC1383AiDA0l = A0l();
            C7384Etj.A0X(abstractC1383AiDA0l);
            j = abstractC1383AiDA0l.A00;
        }
        A0L(null, this, g0u, f, j);
    }

    @Override // X.AbstractC1424Ait
    public final InterfaceC1497Ak4 A0d() {
        return this;
    }

    @Override // X.AbstractC1424Ait
    public final InterfaceC1134Abi A0e() {
        InterfaceC1134Abi interfaceC1134Abi = this.A07;
        if (interfaceC1134Abi != null) {
            return interfaceC1134Abi;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // X.AbstractC1424Ait
    public final AbstractC1424Ait A0f() {
        return this.A09;
    }

    public final AbstractC1387AiH A0m(AbstractC1387AiH abstractC1387AiH) {
        C1453AjM c1453AjM = abstractC1387AiH.A0P;
        C1453AjM c1453AjMA0E = c1453AjM;
        C1453AjM c1453AjM2 = this.A0P;
        C1453AjM c1453AjMA0E2 = c1453AjM2;
        if (c1453AjM == c1453AjM2) {
            AbstractC1439Aj8 abstractC1439Aj8A0j = abstractC1387AiH.A0j();
            AbstractC1439Aj8 abstractC1439Aj8 = A0j().node;
            if (!abstractC1439Aj8.isAttached) {
                ASP.A01("visitLocalAncestors called on an unattached node");
                throw F60.createAndThrow();
            }
            while (true) {
                abstractC1439Aj8 = abstractC1439Aj8.parent;
                if (abstractC1439Aj8 == null) {
                    break;
                }
                if ((abstractC1439Aj8.kindSet & 2) != 0 && abstractC1439Aj8 == abstractC1439Aj8A0j) {
                    break;
                }
            }
            return abstractC1387AiH;
        }
        while (c1453AjMA0E.A00 > c1453AjM2.A00) {
            c1453AjMA0E = c1453AjMA0E.A0E();
            C7384Etj.A0X(c1453AjMA0E);
        }
        while (c1453AjMA0E2.A00 > c1453AjMA0E.A00) {
            c1453AjMA0E2 = c1453AjMA0E2.A0E();
            C7384Etj.A0X(c1453AjMA0E2);
        }
        while (c1453AjMA0E != c1453AjMA0E2) {
            c1453AjMA0E = c1453AjMA0E.A0E();
            c1453AjMA0E2 = c1453AjMA0E2.A0E();
            if (c1453AjMA0E == null || c1453AjMA0E2 == null) {
                throw C60O.A0i("layouts are not part of the same hierarchy");
            }
        }
        if (c1453AjMA0E2 != c1453AjM2) {
            if (c1453AjMA0E != c1453AjM) {
                return c1453AjMA0E.A0f.A07;
            }
            return abstractC1387AiH;
        }
        return this;
    }

    public final void A0n() {
        InterfaceC1402AiX interfaceC1402AiX = this.A0A;
        if (interfaceC1402AiX != null) {
            interfaceC1402AiX.invalidate();
            return;
        }
        AbstractC1387AiH abstractC1387AiH = this.A09;
        if (abstractC1387AiH != null) {
            abstractC1387AiH.A0n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[LOOP:1: B:18:0x003a->B:41:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083 A[EDGE_INSN: B:54:0x0083->B:42:0x0083 BREAK  A[LOOP:1: B:18:0x003a->B:41:0x0082], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0o() {
        /*
            r14 = this;
            r13 = 128(0x80, float:1.794E-43)
            X.AeA<java.lang.Object> r0 = X.AbstractC1436Aj5.A00
            r10 = 1
            X.Aj8 r0 = A0C(r14, r10)
            if (r0 == 0) goto L90
            X.Aj8 r0 = r0.node
            int r0 = r0.aggregateChildKindSet
            r0 = r0 & r13
            if (r0 == 0) goto L90
            androidx.compose.runtime.snapshots.Snapshot r9 = androidx.compose.runtime.snapshots.Snapshot.A03()
            r12 = 0
            if (r9 == 0) goto L22
            X.G0U r8 = r9.A0D()
        L1d:
            androidx.compose.runtime.snapshots.Snapshot r7 = androidx.compose.runtime.snapshots.Snapshot.A04(r9)
            goto L24
        L22:
            r8 = r12
            goto L1d
        L24:
            X.Aj8 r6 = r14.A0j()     // Catch: java.lang.Throwable -> L88
            X.Aj8 r5 = A0C(r14, r10)     // Catch: java.lang.Throwable -> L88
        L2c:
            if (r5 == 0) goto L8d
            int r0 = r5.aggregateChildKindSet     // Catch: java.lang.Throwable -> L88
            r0 = r0 & r13
            if (r0 == 0) goto L8d
            int r0 = r5.kindSet     // Catch: java.lang.Throwable -> L88
            r0 = r0 & r13
            if (r0 == 0) goto L83
            r11 = r12
            r4 = r5
        L3a:
            boolean r0 = r4 instanceof X.InterfaceC1407Aic     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L4a
            X.Aic r4 = (X.InterfaceC1407Aic) r4     // Catch: java.lang.Throwable -> L88
            long r0 = r14.A03     // Catch: java.lang.Throwable -> L88
            r4.AVH(r0)     // Catch: java.lang.Throwable -> L88
        L45:
            X.Aj8 r4 = X.AbstractC1414Aij.A00(r11)     // Catch: java.lang.Throwable -> L88
            goto L80
        L4a:
            int r0 = r4.kindSet     // Catch: java.lang.Throwable -> L88
            r0 = r0 & r13
            if (r0 == 0) goto L45
            boolean r0 = r4 instanceof X.AbstractC1437Aj6     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L45
            r0 = r4
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0     // Catch: java.lang.Throwable -> L88
            X.Aj8 r3 = r0.A00     // Catch: java.lang.Throwable -> L88
            r2 = 0
            r1 = 0
        L5a:
            if (r3 == 0) goto L7e
            int r0 = r3.kindSet     // Catch: java.lang.Throwable -> L88
            r0 = r0 & r13
            if (r0 == 0) goto L7b
            int r1 = r1 + 1
            if (r1 != r10) goto L67
            r4 = r3
            goto L7b
        L67:
            if (r11 != 0) goto L72
            r0 = 16
            X.Aj8[] r0 = new X.AbstractC1439Aj8[r0]     // Catch: java.lang.Throwable -> L88
            X.AHm r11 = new X.AHm     // Catch: java.lang.Throwable -> L88
            r11.<init>(r2, r0)     // Catch: java.lang.Throwable -> L88
        L72:
            if (r4 == 0) goto L78
            r11.A0G(r4)     // Catch: java.lang.Throwable -> L88
            r4 = r12
        L78:
            r11.A0G(r3)     // Catch: java.lang.Throwable -> L88
        L7b:
            X.Aj8 r3 = r3.child     // Catch: java.lang.Throwable -> L88
            goto L5a
        L7e:
            if (r1 != r10) goto L45
        L80:
            if (r4 == 0) goto L83
            goto L3a
        L83:
            if (r5 == r6) goto L8d
            X.Aj8 r5 = r5.child     // Catch: java.lang.Throwable -> L88
            goto L2c
        L88:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A07(r9, r7, r8)
            throw r0
        L8d:
            androidx.compose.runtime.snapshots.Snapshot.A07(r9, r7, r8)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A0o():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.Aj8] */
    public final void A0p() {
        AeA<Object> aeA = AbstractC1436Aj5.A00;
        AbstractC1439Aj8 abstractC1439Aj8A0j = A0j();
        for (AbstractC1439Aj8 abstractC1439Aj8A0C = A0C(this, true); abstractC1439Aj8A0C != null && (abstractC1439Aj8A0C.aggregateChildKindSet & 4194304) != 0; abstractC1439Aj8A0C = abstractC1439Aj8A0C.child) {
            if ((abstractC1439Aj8A0C.kindSet & 4194304) != 0) {
                AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8A0C;
                C0910AHm c0910AHm = null;
                do {
                    if (abstractC1437Aj6A00 instanceof InterfaceC1403AiY) {
                        ((InterfaceC1403AiY) abstractC1437Aj6A00).AUZ(this);
                    } else if ((abstractC1437Aj6A00.kindSet & 4194304) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                        AbstractC1439Aj8 abstractC1439Aj8 = abstractC1437Aj6A00.A00;
                        int i = 0;
                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                        while (abstractC1439Aj8 != null) {
                            if ((abstractC1439Aj8.kindSet & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC1437Aj6A00 = abstractC1439Aj8;
                                } else {
                                    if (c0910AHm == null) {
                                        c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                    }
                                    if (abstractC1437Aj6A00 != 0) {
                                        c0910AHm.A0G(abstractC1437Aj6A00);
                                        abstractC1437Aj6A00 = 0;
                                    }
                                    c0910AHm.A0G(abstractC1439Aj8);
                                }
                            }
                            abstractC1439Aj8 = abstractC1439Aj8.child;
                            abstractC1437Aj6A00 = abstractC1437Aj6A00;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                } while (abstractC1437Aj6A00 != 0);
            }
            if (abstractC1439Aj8A0C == abstractC1439Aj8A0j) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.Aj8] */
    public final void A0q() {
        AbstractC1439Aj8 abstractC1439Aj8;
        AeA<Object> aeA = AbstractC1436Aj5.A00;
        AbstractC1439Aj8 abstractC1439Aj8A0C = A0C(this, false);
        if (abstractC1439Aj8A0C == null || (abstractC1439Aj8A0C.node.aggregateChildKindSet & 1048576) == 0 || (abstractC1439Aj8 = A0j().parent) == null) {
            return;
        }
        while ((abstractC1439Aj8A0C.aggregateChildKindSet & 1048576) != 0) {
            if ((abstractC1439Aj8A0C.kindSet & 1048576) != 0) {
                AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8A0C;
                C0910AHm c0910AHm = null;
                do {
                    if (abstractC1437Aj6A00 instanceof InterfaceC1413Aii) {
                        C1432Aj1 c1432Aj1 = (C1432Aj1) ((InterfaceC1413Aii) abstractC1437Aj6A00);
                        c1432Aj1.A06 = C3cI.A15(c1432Aj1.A06);
                        C1432Aj1.A01(c1432Aj1);
                    } else if ((abstractC1437Aj6A00.kindSet & 1048576) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A00.A00;
                        int i = 0;
                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                        while (abstractC1439Aj82 != null) {
                            if ((abstractC1439Aj82.kindSet & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC1437Aj6A00 = abstractC1439Aj82;
                                } else {
                                    if (c0910AHm == null) {
                                        c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                    }
                                    if (abstractC1437Aj6A00 != 0) {
                                        c0910AHm.A0G(abstractC1437Aj6A00);
                                        abstractC1437Aj6A00 = 0;
                                    }
                                    c0910AHm.A0G(abstractC1439Aj82);
                                }
                            }
                            abstractC1439Aj82 = abstractC1439Aj82.child;
                            abstractC1437Aj6A00 = abstractC1437Aj6A00;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                } while (abstractC1437Aj6A00 != 0);
            }
            if (abstractC1439Aj8A0C == abstractC1439Aj8 || (abstractC1439Aj8A0C = abstractC1439Aj8A0C.child) == null) {
                return;
            }
        }
    }

    public final void A0r() {
        if (this.A0A != null) {
            if (this.A06 != null) {
                this.A06 = null;
            }
            A0y(null, false);
            this.A0P.A0c(false);
        }
    }

    public final void A0t(InterfaceC1327AhE interfaceC1327AhE, GraphicsLayer graphicsLayer) {
        InterfaceC1402AiX interfaceC1402AiX = this.A0A;
        if (interfaceC1402AiX == null) {
            long j = this.A01;
            float f = (int) (j >> 32);
            float fA09 = AnonymousClass002.A09(j);
            interfaceC1327AhE.AhL(f, fA09);
            A0K(interfaceC1327AhE, graphicsLayer, this);
            interfaceC1327AhE.AhL(-f, -fA09);
            return;
        }
        C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
        c1388AiI.Ahs();
        GraphicsLayer graphicsLayer2 = c1388AiI.A04;
        c1388AiI.A07 = ((C1391AiM) graphicsLayer2.A0M).A06 > 0.0f;
        C1325AhC c1325AhC = c1388AiI.A0H;
        AaI aaI = (AaI) c1325AhC.A03;
        aaI.A02.A02.A01 = interfaceC1327AhE;
        aaI.A00 = graphicsLayer;
        ATI.A00(c1325AhC, graphicsLayer2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.Aj8] */
    public final void A0v(InterfaceC1134Abi interfaceC1134Abi) {
        AbstractC1387AiH abstractC1387AiH;
        InterfaceC1134Abi interfaceC1134Abi2 = this.A07;
        if (interfaceC1134Abi != interfaceC1134Abi2) {
            this.A07 = interfaceC1134Abi;
            if (interfaceC1134Abi2 == null || interfaceC1134Abi.getWidth() != interfaceC1134Abi2.getWidth() || interfaceC1134Abi.getHeight() != interfaceC1134Abi2.getHeight()) {
                int width = interfaceC1134Abi.getWidth();
                int height = interfaceC1134Abi.getHeight();
                InterfaceC1402AiX interfaceC1402AiX = this.A0A;
                if (interfaceC1402AiX != null) {
                    interfaceC1402AiX.AbU((width << 32) | (height & 4294967295L));
                } else if (this.A0P.A0d.A0G.A0G && (abstractC1387AiH = this.A09) != null) {
                    abstractC1387AiH.A0n();
                }
                A0W((height & 4294967295L) | (width << 32));
                if (this.A0C != null) {
                    A0N(this, false);
                }
                AeA<Object> aeA = AbstractC1436Aj5.A00;
                AbstractC1439Aj8 abstractC1439Aj8 = A0j().parent;
                if (abstractC1439Aj8 != null) {
                    for (AbstractC1439Aj8 abstractC1439Aj8A0C = A0C(this, false); abstractC1439Aj8A0C != null && (abstractC1439Aj8A0C.aggregateChildKindSet & 4) != 0; abstractC1439Aj8A0C = abstractC1439Aj8A0C.child) {
                        if ((abstractC1439Aj8A0C.kindSet & 4) != 0) {
                            AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8A0C;
                            C0910AHm c0910AHm = null;
                            do {
                                if (abstractC1437Aj6A00 instanceof InterfaceC1332AhJ) {
                                    ((InterfaceC1332AhJ) abstractC1437Aj6A00).onMeasureResultChanged();
                                } else if ((abstractC1437Aj6A00.kindSet & 4) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                    AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A00.A00;
                                    int i = 0;
                                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                    while (abstractC1439Aj82 != null) {
                                        if ((abstractC1439Aj82.kindSet & 4) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC1437Aj6A00 = abstractC1439Aj82;
                                            } else {
                                                if (c0910AHm == null) {
                                                    c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                                }
                                                if (abstractC1437Aj6A00 != 0) {
                                                    c0910AHm.A0G(abstractC1437Aj6A00);
                                                    abstractC1437Aj6A00 = 0;
                                                }
                                                c0910AHm.A0G(abstractC1439Aj82);
                                            }
                                        }
                                        abstractC1439Aj82 = abstractC1439Aj82.child;
                                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                            } while (abstractC1437Aj6A00 != 0);
                        }
                        if (abstractC1439Aj8A0C == abstractC1439Aj8) {
                            break;
                        }
                    }
                }
                C1453AjM c1453AjM = this.A0P;
                InterfaceC1464AjX interfaceC1464AjX = c1453AjM.A0D;
                if (interfaceC1464AjX != null) {
                    interfaceC1464AjX.ATn(c1453AjM);
                }
                c1453AjM.A0W(this);
            }
            AeA<AbstractC1493Ak0> aeA2 = this.A0M;
            if ((aeA2 == null || aeA2.A01 == 0) && interfaceC1134Abi.ACJ().isEmpty()) {
                return;
            }
            AeA<AbstractC1493Ak0> aeA3 = this.A0M;
            Map<AbstractC1493Ak0, Integer> mapACJ = interfaceC1134Abi.ACJ();
            if (aeA3 != null && aeA3.A01 == mapACJ.size()) {
                Object[] objArr = aeA3.A04;
                int[] iArr = aeA3.A02;
                long[] jArr = aeA3.A03;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i2 = 0;
                loop0: while (true) {
                    long j = jArr[i2];
                    if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                int i6 = iArr[i5];
                                Integer num = mapACJ.get(obj);
                                if (num == null || num.intValue() != i6) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            return;
                        }
                    }
                    if (i2 == length) {
                        return;
                    } else {
                        i2++;
                    }
                }
            }
            this.A0P.A0d.A0G.A0S.A01();
            AeA<AbstractC1493Ak0> aeA4 = this.A0M;
            if (aeA4 == null) {
                AeA<Object> aeA5 = AbstractC1189Ads.A00;
                aeA4 = new AeA<>(6);
                this.A0M = aeA4;
            }
            aeA4.A05();
            for (Map.Entry<AbstractC1493Ak0, Integer> entry : mapACJ.entrySet()) {
                aeA4.A07(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0x(X.C0923AHz r17, X.InterfaceC1382AiC r18, int r19, long r20, boolean r22) {
        /*
            r16 = this;
            r8 = r18
            int r0 = r8.AAm()
            r9 = r16
            X.Aj8 r6 = r9.A0A(r0)
            r12 = r20
            boolean r0 = r9.A10(r12)
            r2 = 2139095040(0x7f800000, float:Infinity)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r7 = r17
            r11 = r19
            if (r0 != 0) goto L5e
            r0 = 1
            if (r11 != r0) goto L5d
            X.AXN r3 = r9.A0B
            X.AjM r0 = r9.A0P
            X.AXi r0 = r0.A0E
            long r0 = r0.AHo()
            long r0 = r3.Ah6(r0)
            float r18 = r9.A0i(r12, r0)
            int r3 = java.lang.Float.floatToRawIntBits(r18)
            r0 = r3 & r5
            if (r0 >= r2) goto L5d
            r22 = 0
            int r1 = r7.A00
            int r0 = r7.size()
            int r0 = r0 + (-1)
            if (r1 == r0) goto L54
            long r0 = (long) r3
            r2 = 32
            long r0 = r0 << r2
            long r2 = X.C0923AHz.A00(r7)
            int r0 = X.AI2.A00(r2, r0)
            if (r0 <= 0) goto L5d
        L54:
            r14 = r9
            r15 = r6
            r16 = r7
            r17 = r8
            r14.A0E(r15, r16, r17, r18, r19, r20, r22)
        L5d:
            return
        L5e:
            r14 = r22
            if (r6 != 0) goto L6c
            r0 = r9
            r1 = r7
            r2 = r8
            r3 = r11
            r4 = r12
            r6 = r14
            r0.A0w(r1, r2, r3, r4, r6)
            return
        L6c:
            float r4 = X.AnonymousClass003.A03(r12)
            float r3 = X.AnonymousClass004.A00(r12)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L9a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L9a
            int r0 = r9.A0Z()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9a
            int r0 = r9.A0Y()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9a
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r5 = r12
            r7 = r14
            r0.A0G(r1, r2, r3, r4, r5, r7)
            return
        L9a:
            r0 = 1
            if (r11 != r0) goto Ld6
            X.AXN r3 = r9.A0B
            X.AjM r0 = r9.A0P
            X.AXi r0 = r0.A0E
            long r0 = r0.AHo()
            long r0 = r3.Ah6(r0)
            float r10 = r9.A0i(r12, r0)
        Laf:
            int r0 = java.lang.Float.floatToRawIntBits(r10)
            r0 = r0 & r5
            if (r0 >= r2) goto Ld4
            int r1 = r7.A00
            int r0 = r7.size()
            int r0 = r0 + (-1)
            if (r1 == r0) goto Lcf
            r0 = 0
            long r2 = A05(r10, r14, r0)
            long r0 = X.C0923AHz.A00(r7)
            int r0 = X.AI2.A00(r0, r2)
            if (r0 <= 0) goto Ld4
        Lcf:
            r15 = 1
        Ld0:
            A0H(r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return
        Ld4:
            r15 = 0
            goto Ld0
        Ld6:
            r10 = 2139095040(0x7f800000, float:Infinity)
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A0x(X.AHz, X.AiC, int, long, boolean):void");
    }

    public final boolean A0z() {
        if (this.A0A != null && this.A0L <= 0.0f) {
            return true;
        }
        AbstractC1387AiH abstractC1387AiH = this.A09;
        if (abstractC1387AiH != null) {
            return abstractC1387AiH.A0z();
        }
        return false;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A0P.A0F.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A0P.A0F.AFo();
    }

    @Override // X.InterfaceC1497Ak4
    public final boolean AGi() {
        return ((AbstractC1424Ait) this).A04;
    }

    @Override // X.AbstractC1424Ait, X.InterfaceC1351Ahc
    public final C1453AjM AGz() {
        return this.A0P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.Aj8] */
    @Override // X.AZE, X.C3Tr
    public final Object AIX() {
        C1438Aj7 c1438Aj7 = this.A0P.A0f;
        if (!c1438Aj7.A09(64)) {
            return null;
        }
        Object objAQs = null;
        for (AbstractC1439Aj8 abstractC1439Aj8 = c1438Aj7.A06; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.parent) {
            if ((abstractC1439Aj8.kindSet & 64) != 0) {
                C0910AHm c0910AHm = null;
                AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8;
                do {
                    if (abstractC1437Aj6A00 instanceof InterfaceC1411Aig) {
                        objAQs = ((InterfaceC1411Aig) abstractC1437Aj6A00).AQs(objAQs);
                    } else if ((abstractC1437Aj6A00.kindSet & 64) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A00.A00;
                        int i = 0;
                        abstractC1437Aj6A00 = abstractC1437Aj6A00;
                        while (abstractC1439Aj82 != null) {
                            if ((abstractC1439Aj82.kindSet & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC1437Aj6A00 = abstractC1439Aj82;
                                } else {
                                    if (c0910AHm == null) {
                                        c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                    }
                                    if (abstractC1437Aj6A00 != 0) {
                                        c0910AHm.A0G(abstractC1437Aj6A00);
                                        abstractC1437Aj6A00 = 0;
                                    }
                                    c0910AHm.A0G(abstractC1439Aj82);
                                }
                            }
                            abstractC1439Aj82 = abstractC1439Aj82.child;
                            abstractC1437Aj6A00 = abstractC1437Aj6A00;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                } while (abstractC1437Aj6A00 != 0);
            }
        }
        return objAQs;
    }

    @Override // X.InterfaceC1497Ak4
    public final long AKd() {
        return ((AZE) this).A03;
    }

    @Override // X.AnW
    public final boolean APE() {
        return (this.A0A == null || this.A0J || this.A0P.A0D == null) ? false : true;
    }

    @Override // X.InterfaceC1497Ak4
    public final long APn(InterfaceC1497Ak4 interfaceC1497Ak4, long j, boolean z) {
        if (interfaceC1497Ak4 instanceof C1384AiE) {
            C1384AiE c1384AiE = (C1384AiE) interfaceC1497Ak4;
            c1384AiE.A00.A05.A0P.A0d.A01();
            return c1384AiE.APn(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        AbstractC1387AiH abstractC1387AiHA0D = A0D(interfaceC1497Ak4);
        abstractC1387AiHA0D.A0P.A0d.A01();
        AbstractC1387AiH abstractC1387AiHA0m = A0m(abstractC1387AiHA0D);
        while (abstractC1387AiHA0D != abstractC1387AiHA0m) {
            j = A09(abstractC1387AiHA0D, j, z);
            abstractC1387AiHA0D = abstractC1387AiHA0D.A09;
            C7384Etj.A0X(abstractC1387AiHA0D);
        }
        return A07(abstractC1387AiHA0m, j, z);
    }

    @Override // X.InterfaceC1497Ak4
    public final void AhK(float[] fArr) {
        InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(this.A0P);
        AbstractC1387AiH abstractC1387AiHA0D = A0D(AbstractC1496Ak3.A01(this));
        A0P(abstractC1387AiHA0D, fArr);
        if (interfaceC1464AjXA00 instanceof InterfaceC1406Aib) {
            ((InterfaceC1406Aib) interfaceC1464AjXA00).APp(fArr);
            return;
        }
        long jAPq = abstractC1387AiHA0D.APq(0L);
        if ((9223372034707292159L & jAPq) != 9205357640488583168L) {
            C1392AiN.A04(fArr, AnonymousClass003.A03(jAPq), AnonymousClass004.A00(jAPq));
        }
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A0P.A0G;
    }

    public AbstractC1387AiH(C1453AjM c1453AjM) {
        this.A0P = c1453AjM;
        this.A0B = c1453AjM.A0F;
        this.A0O = c1453AjM.A0G;
    }

    public static final long A05(float f, boolean z, boolean z2) {
        return AnonymousClass002.A0G((z ? 1L : 0L) | (z2 ? 2L : 0L), C8j3.A0P(f) << 32);
    }

    private final long A06(long j) {
        return AnonymousClass005.A0M(Math.max(0.0f, (AnonymousClass001.A00(j) - A0Z()) / 2.0f), Math.max(0.0f, (AnonymousClass001.A01(j, 4294967295L) - A0Y()) / 2.0f));
    }

    public static AbstractC1439Aj8 A0B(AI1 ai1, C1Z3 c1z3, InterfaceC1382AiC interfaceC1382AiC, long j) {
        ai1.A00(j);
        return AbstractC1401AiW.A00(c1z3, interfaceC1382AiC.AAm());
    }

    public static void A0M(C0923AHz c0923AHz, Object obj, int i, int i2) {
        C0923AHz.A01(c0923AHz, i, i2);
        c0923AHz.A00++;
        c0923AHz.A02.A09(obj);
    }

    private final void A0O(AbstractC1387AiH abstractC1387AiH, float[] fArr) {
        float[] fArrA02;
        if (abstractC1387AiH.equals(this)) {
            return;
        }
        AbstractC1387AiH abstractC1387AiH2 = this.A09;
        C7384Etj.A0X(abstractC1387AiH2);
        abstractC1387AiH2.A0O(abstractC1387AiH, fArr);
        if (this.A01 != 0) {
            float[] fArr2 = A0X;
            C1392AiN.A03(fArr2);
            C1392AiN.A04(fArr2, -C8j3.A0G(r2), -AnonymousClass002.A09(r2));
            C1392AiN.A05(fArr, fArr2);
        }
        InterfaceC1402AiX interfaceC1402AiX = this.A0A;
        if (interfaceC1402AiX == null || (fArrA02 = C1388AiI.A02((C1388AiI) interfaceC1402AiX)) == null) {
            return;
        }
        C1392AiN.A05(fArr, fArrA02);
    }

    private final void A0P(AbstractC1387AiH abstractC1387AiH, float[] fArr) {
        while (!this.equals(abstractC1387AiH)) {
            InterfaceC1402AiX interfaceC1402AiX = this.A0A;
            if (interfaceC1402AiX != null) {
                C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
                C1388AiI.A00(c1388AiI);
                C1392AiN.A05(fArr, c1388AiI.A0J);
            }
            if (this.A01 != 0) {
                float[] fArr2 = A0X;
                C1392AiN.A03(fArr2);
                C1392AiN.A04(fArr2, C8j3.A0G(r2), AnonymousClass002.A09(r2));
                C1392AiN.A05(fArr, fArr2);
            }
            this = this.A09;
            C7384Etj.A0X(this);
        }
    }

    public static final boolean A0R(InterfaceC1068ATy interfaceC1068ATy, float f, float f2) {
        AaC aaCA0f = C8j3.A0f(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        c1710AotA00.A3r(aaCA0f);
        C1710Aot c1710AotA002 = AbstractC1561Alb.A00();
        c1710AotA002.AXR(interfaceC1068ATy, c1710AotA00, 1);
        Path path = c1710AotA002.A03;
        boolean zIsEmpty = path.isEmpty();
        path.reset();
        c1710AotA00.A03.reset();
        return !zIsEmpty;
    }

    private final float A0i(long j, long j2) {
        if (A0Z() < AnonymousClass001.A00(j2) || A0Y() < AnonymousClass001.A01(j2, 4294967295L)) {
            long jA06 = A06(j2);
            float fA00 = AnonymousClass001.A00(jA06);
            float fA01 = AnonymousClass001.A01(jA06, 4294967295L);
            float fA002 = AnonymousClass001.A00(j);
            float fMax = Math.max(0.0f, fA002 < 0.0f ? -fA002 : fA002 - A0Z());
            float fA012 = AnonymousClass001.A01(j, 4294967295L);
            long jA0M = AnonymousClass005.A0M(fMax, Math.max(0.0f, fA012 < 0.0f ? -fA012 : fA012 - A0Y()));
            if ((fA00 > 0.0f || fA01 > 0.0f) && AnonymousClass001.A00(jA0M) <= fA00 && AnonymousClass001.A01(jA0M, 4294967295L) <= fA01) {
                float fA03 = AnonymousClass003.A03(jA0M);
                float fA003 = AnonymousClass004.A00(jA0M);
                return (fA03 * fA03) + (fA003 * fA003);
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final AaC A0k() {
        if (AZE.A03(this)) {
            InterfaceC1497Ak4 interfaceC1497Ak4A01 = AbstractC1496Ak3.A01(this);
            C1393AiO c1393AiO = this.A02;
            if (c1393AiO == null) {
                c1393AiO = new C1393AiO();
                c1393AiO.A01 = 0.0f;
                c1393AiO.A03 = 0.0f;
                c1393AiO.A02 = 0.0f;
                c1393AiO.A00 = 0.0f;
                this.A02 = c1393AiO;
            }
            long jA06 = A06(this.A0B.Ah6(this.A0P.A0E.AHo()));
            float fA03 = AnonymousClass003.A03(jA06);
            c1393AiO.A01 = -fA03;
            float fA00 = AnonymousClass004.A00(jA06);
            c1393AiO.A03 = -fA00;
            c1393AiO.A02 = A0Z() + fA03;
            c1393AiO.A00 = A0Y() + fA00;
            while (this != interfaceC1497Ak4A01) {
                this.A0J(c1393AiO, false, true);
                if (!c1393AiO.A02()) {
                    this = this.A09;
                    C7384Etj.A0X(this);
                }
            }
            return C8j3.A0f(c1393AiO.A01, c1393AiO.A03, c1393AiO.A02, c1393AiO.A00);
        }
        return AaC.A04;
    }

    @Override // X.InterfaceC1497Ak4
    public final InterfaceC1497Ak4 AIW() {
        if (AZE.A03(this)) {
            this.A0P.A0d.A01();
            return this.A09;
        }
        ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1497Ak4
    public final InterfaceC1497Ak4 AIa() {
        if (A0j().isAttached) {
            C1453AjM c1453AjM = this.A0P;
            c1453AjM.A0d.A01();
            return c1453AjM.A0f.A04.A09;
        }
        StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
        for (C1453AjM c1453AjMA0E = this.A0P; c1453AjMA0E != null; c1453AjMA0E = c1453AjMA0E.A0E()) {
            sb.append("\n|");
            sb.append(c1453AjMA0E);
            sb.append(" isAttached=");
            boolean z = false;
            if (c1453AjMA0E.A0D != null) {
                z = true;
            }
            sb.append(z);
            sb.append(" modifier=");
            sb.append(c1453AjMA0E.A06);
            sb.append(" tail=");
            sb.append(A0j());
        }
        ASP.A01(sb.toString());
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1497Ak4
    public final AaC APk(InterfaceC1497Ak4 interfaceC1497Ak4, boolean z) {
        String strA0v;
        if (!AZE.A03(this)) {
            strA0v = "LayoutCoordinate operations are only valid when isAttached is true";
        } else {
            if (interfaceC1497Ak4.isAttached()) {
                AbstractC1387AiH abstractC1387AiHA0D = A0D(interfaceC1497Ak4);
                abstractC1387AiHA0D.A0P.A0d.A01();
                AbstractC1387AiH abstractC1387AiHA0m = A0m(abstractC1387AiHA0D);
                C1393AiO c1393AiO = this.A02;
                if (c1393AiO == null) {
                    c1393AiO = new C1393AiO();
                    c1393AiO.A01 = 0.0f;
                    c1393AiO.A03 = 0.0f;
                    c1393AiO.A02 = 0.0f;
                    c1393AiO.A00 = 0.0f;
                    this.A02 = c1393AiO;
                }
                c1393AiO.A01 = 0.0f;
                c1393AiO.A03 = 0.0f;
                long jAKd = interfaceC1497Ak4.AKd();
                c1393AiO.A02 = C8j3.A0G(jAKd);
                c1393AiO.A00 = AnonymousClass002.A09(jAKd);
                while (abstractC1387AiHA0D != abstractC1387AiHA0m) {
                    abstractC1387AiHA0D.A0J(c1393AiO, z, false);
                    if (c1393AiO.A02()) {
                        return AaC.A04;
                    }
                    abstractC1387AiHA0D = abstractC1387AiHA0D.A09;
                    C7384Etj.A0X(abstractC1387AiHA0D);
                }
                A0I(c1393AiO, abstractC1387AiHA0m, z);
                return C8j3.A0f(c1393AiO.A01, c1393AiO.A03, c1393AiO.A02, c1393AiO.A00);
            }
            strA0v = AnonymousClass001.A0v(" is not attached!", C3cG.A0f(interfaceC1497Ak4, "LayoutCoordinates "));
        }
        ASP.A01(strA0v);
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1497Ak4
    public final long APo(long j) {
        if (!AZE.A03(this)) {
            ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw F60.createAndThrow();
        }
        this.A0P.A0d.A01();
        do {
            C1453AjM c1453AjM = this.A0P;
            if (this == c1453AjM.A0f.A04 && !c1453AjM.A0N) {
                if (((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM)).A12.A04(c1453AjM) != 9223372034707292159L) {
                    return AnonymousClass005.A0L(AnonymousClass001.A00(j) + ((int) (r4 >> 32)), AnonymousClass001.A01(j, 4294967295L) + AnonymousClass002.A09(r4));
                }
            }
            j = A09(this, j, true);
            this = this.A09;
        } while (this != null);
        return j;
    }

    @Override // X.InterfaceC1497Ak4
    public final long APq(long j) {
        if (AZE.A03(this)) {
            return AbstractC1333AhK.A00(this.A0P).APq(APo(j));
        }
        ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1497Ak4
    public final long APr(long j) {
        long jAPo = APo(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC1333AhK.A00(this.A0P);
        AndroidComposeView.A0E(androidComposeView);
        return C1392AiN.A00(androidComposeView.A16, jAPo);
    }

    @Override // X.InterfaceC1497Ak4
    public final long AcE(long j) {
        if (AZE.A03(this)) {
            return APn(AbstractC1496Ak3.A01(this), AbstractC1333AhK.A00(this.A0P).AcE(j), true);
        }
        ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC1497Ak4
    public final void AhI(InterfaceC1497Ak4 interfaceC1497Ak4, float[] fArr) {
        AbstractC1387AiH abstractC1387AiHA0D = A0D(interfaceC1497Ak4);
        abstractC1387AiHA0D.A0P.A0d.A01();
        AbstractC1387AiH abstractC1387AiHA0m = A0m(abstractC1387AiHA0D);
        C1392AiN.A03(fArr);
        abstractC1387AiHA0D.A0P(abstractC1387AiHA0m, fArr);
        A0O(abstractC1387AiHA0m, fArr);
    }

    @Override // X.InterfaceC1497Ak4
    public final long AiR(long j) {
        if (!AZE.A03(this)) {
            ASP.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw F60.createAndThrow();
        }
        InterfaceC1497Ak4 interfaceC1497Ak4A01 = AbstractC1496Ak3.A01(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) AbstractC1333AhK.A00(this.A0P);
        AndroidComposeView.A0E(androidComposeView);
        return APn(interfaceC1497Ak4A01, AWx.A04(C1392AiN.A00(androidComposeView.A17, j), InterfaceC1497Ak4.A00(interfaceC1497Ak4A01)), true);
    }

    @Override // X.InterfaceC1497Ak4
    public final boolean isAttached() {
        return AZE.A03(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A10(long r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1387AiH.A10(long):boolean");
    }
}
