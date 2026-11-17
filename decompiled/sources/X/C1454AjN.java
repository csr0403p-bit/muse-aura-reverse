package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AjN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1454AjN extends AZE implements C3TG, InterfaceC1472Ajf, AYV {
    public float A00;
    public float A01;
    public float A02;
    public GraphicsLayer A08;
    public GraphicsLayer A09;
    public Object A0B;
    public G0U<? super C2av, Unit> A0C;
    public G0U<? super C2av, Unit> A0D;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final C1459AjS A0T;
    public int A04 = Integer.MAX_VALUE;
    public int A03 = Integer.MAX_VALUE;
    public Integer A0A = C79.A0C;
    public long A05 = 0;
    public boolean A0O = true;
    public final AbstractC1460AjT A0S = new C1386AiG(this);
    public final C0910AHm<C1454AjN> A0V = new C0910AHm<>(0, new C1454AjN[16]);
    public boolean A0E = true;
    public long A06 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final Function0<Unit> A0U = new C2328BUc(this, 21);
    public final Function0<Unit> A0W = new C2328BUc(this, 20);
    public long A07 = 0;
    public final Function0<Unit> A0X = new C2328BUc(this, 22);

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V */
    private final void A06(GraphicsLayer graphicsLayer, G0U g0u, float f, long j) throws Throwable {
        AYU c1465AjY;
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        try {
            this.A0H = true;
            if ((!(j == this.A05) || g0u != this.A0C || this.A0R) && (c1459AjS.A06 || c1459AjS.A07 || this.A0R)) {
                this.A0J = true;
                this.A0R = false;
            }
            C1455AjO c1455AjO = c1459AjS.A04;
            if (c1455AjO != null) {
                if (c1455AjO.A06 == C79.A0C) {
                    C1459AjS c1459AjS2 = c1455AjO.A0K;
                    if (!AbstractC1475Aji.A00(c1459AjS2.A0F)) {
                        c1459AjS2.A09 = true;
                    }
                }
                C1459AjS c1459AjS3 = c1455AjO.A0K;
                if (AbstractC1475Aji.A00(c1459AjS3.A0F) || c1459AjS3.A09) {
                    AbstractC1387AiH abstractC1387AiH = c1453AjM.A0f.A04.A09;
                    if (abstractC1387AiH == null || (c1465AjY = ((AbstractC1424Ait) abstractC1387AiH).A08) == null) {
                        c1465AjY = new C1465AjY(AbstractC1333AhK.A00(c1453AjM));
                    }
                    C1453AjM c1453AjMA0E = c1453AjM.A0E();
                    if (c1453AjMA0E != null) {
                        c1453AjMA0E.A0d.A02 = 0;
                    }
                    c1455AjO.A00 = Integer.MAX_VALUE;
                    c1465AjY.A0A(c1455AjO, 0.0f, (int) (j >> 32), AnonymousClass002.A09(j));
                }
            }
            C1455AjO c1455AjO2 = c1459AjS.A04;
            if (c1455AjO2 == null || c1455AjO2.A0F) {
                A05(graphicsLayer, this, g0u, f, j);
            } else {
                ASP.A01("Error: Placement happened before lookahead.");
                throw F60.createAndThrow();
            }
        } catch (Throwable th) {
            c1453AjM.A0a(th);
            throw F60.createAndThrow();
        }
    }

    @Override // X.AZE
    public final void A0a(GraphicsLayer graphicsLayer, float f, long j) throws Throwable {
        A06(graphicsLayer, null, f, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    @Override // X.AZE
    public final void A0b(G0U g0u, float f, long j) throws Throwable {
        A06(null, g0u, f, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0d() {
        /*
            r6 = this;
            r0 = 1
            r6.A0N = r0
            X.AjS r0 = r6.A0T
            X.AjM r0 = r0.A0F
            X.AjM r4 = r0.A0E()
            X.Ai8 r5 = r6.AGV()
            float r2 = r5.A00
            X.Aj7 r0 = r0.A0f
            X.AiH r1 = r0.A04
            X.Ai8 r3 = r0.A07
        L17:
            if (r1 == r3) goto L24
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            X.C7384Etj.A0Z(r1, r0)
            float r0 = r1.A00
            float r2 = r2 + r0
            X.AiH r1 = r1.A08
            goto L17
        L24:
            float r0 = r6.A02
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L34
            r6.A02 = r2
            if (r4 == 0) goto L34
            r4.A0N()
            r4.A0I()
        L34:
            boolean r0 = r5.A05
            r2 = 0
            if (r0 != 0) goto L7a
            boolean r1 = r6.A0G
            if (r1 == 0) goto L45
            X.AjT r0 = r6.A0S
            boolean r0 = r0.A04()
            if (r0 == 0) goto L77
        L45:
            r6.A02()
            if (r1 != 0) goto L77
            if (r4 == 0) goto L4f
            r4.A0I()
        L4f:
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L7a
            if (r4 == 0) goto L7d
            r4.A0c(r2)
        L58:
            boolean r0 = r6.A0Q
            if (r0 != 0) goto L73
            X.AjS r2 = r4.A0d
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.C79.A0C
            if (r1 != r0) goto L73
            int r1 = r6.A03
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L80
            int r0 = r2.A03
            r6.A03 = r0
            int r0 = r0 + 1
            r2.A03 = r0
        L73:
            r6.APY()
            return
        L77:
            r3.A0p()
        L7a:
            if (r4 == 0) goto L7d
            goto L58
        L7d:
            r6.A03 = r2
            goto L73
        L80:
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454AjN.A0d():void");
    }

    @Override // X.InterfaceC1472Ajf
    public final void APY() {
        this.A0I = true;
        AbstractC1460AjT abstractC1460AjT = this.A0S;
        abstractC1460AjT.A03();
        if (this.A0J) {
            C1453AjM c1453AjM = this.A0T.A0F;
            C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i = c0910AHmA0D.A00;
            for (int i2 = 0; i2 < i; i2++) {
                C1453AjM c1453AjM2 = c1453AjMArr[i2];
                if (c1453AjM2.A0d.A0G.A0L && c1453AjM2.A0d.A0G.A0A == C79.A00) {
                    C1454AjN c1454AjN = c1453AjM2.A0d.A0G;
                    if (c1454AjN.A0M) {
                        Constraints constraints = new Constraints(((AZE) c1454AjN).A04);
                        if (c1453AjM2.A0I == C79.A0C) {
                            c1453AjM2.A0H();
                        }
                        if (c1453AjM2.A0d.A0G.A0f(constraints.A00)) {
                            C1453AjM.A0B(c1453AjM, false, true, true);
                        }
                    }
                }
            }
        }
        if (this.A0K || (!this.A0F && !((AbstractC1424Ait) AGV()).A05 && this.A0J)) {
            this.A0J = false;
            C1459AjS c1459AjS = this.A0T;
            Integer num = c1459AjS.A05;
            c1459AjS.A05 = C79.A0C;
            if (c1459AjS.A07) {
                c1459AjS.A07 = false;
                if (!c1459AjS.A06) {
                    c1459AjS.A03(c1459AjS.A00 - 1);
                }
            }
            C1453AjM c1453AjM3 = c1459AjS.A0F;
            C1481Ajo c1481Ajo = ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM3)).A0q;
            c1481Ajo.A00.A03(c1453AjM3, this.A0W, c1481Ajo.A01);
            c1459AjS.A05 = num;
            this.A0K = false;
        }
        if (abstractC1460AjT.A05) {
            abstractC1460AjT.A02 = true;
        }
        if (abstractC1460AjT.A01) {
            abstractC1460AjT.A03();
            if (abstractC1460AjT.A00 != null) {
                abstractC1460AjT.A02();
            }
        }
        this.A0I = false;
    }

    private final void A02() {
        boolean z = this.A0G;
        this.A0G = true;
        C1453AjM c1453AjM = this.A0T.A0F;
        if (!z) {
            c1453AjM.A0f.A07.A0p();
            ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM)).A12.A06(c1453AjM);
            C1459AjS c1459AjS = c1453AjM.A0d;
            if (c1459AjS.A0G.A0L) {
                C1453AjM.A0B(c1453AjM, true, true, true);
            } else if (c1459AjS.A0E) {
                C1453AjM.A0A(c1453AjM, true, true, true);
            }
        }
        C1438Aj7 c1438Aj7 = c1453AjM.A0f;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1438Aj7.A07).A08;
        for (AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A04; !C7384Etj.areEqual(abstractC1387AiH2, abstractC1387AiH) && abstractC1387AiH2 != null; abstractC1387AiH2 = abstractC1387AiH2.A08) {
            if (abstractC1387AiH2.A0I) {
                abstractC1387AiH2.A0n();
            }
        }
        C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM2 = c1453AjMArr[i2];
            if (c1453AjM2.A0d.A0G.A03 != Integer.MAX_VALUE) {
                c1453AjM2.A0d.A0G.A02();
                C1453AjM.A09(c1453AjM2);
            }
        }
    }

    private final void A04() {
        C1453AjM c1453AjM = this.A0T.A0F;
        C1453AjM.A0B(c1453AjM, false, true, true);
        C1453AjM c1453AjMA0E = c1453AjM.A0E();
        if (c1453AjMA0E == null || c1453AjM.A0I != C79.A0C) {
            return;
        }
        int iIntValue = c1453AjMA0E.A0d.A05.intValue();
        c1453AjM.A0I = iIntValue != 0 ? iIntValue != 2 ? c1453AjMA0E.A0I : C79.A01 : C79.A00;
    }

    public static final void A05(GraphicsLayer graphicsLayer, C1454AjN c1454AjN, G0U g0u, float f, long j) {
        C1459AjS c1459AjS = c1454AjN.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        if (c1453AjM.A0R) {
            throw C60O.A0i("place is called on a deactivated node");
        }
        c1459AjS.A05 = C79.A0C;
        c1454AjN.A05 = j;
        c1454AjN.A00 = f;
        c1454AjN.A0C = g0u;
        c1454AjN.A08 = graphicsLayer;
        c1454AjN.A0N = false;
        InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(c1453AjM);
        if (c1454AjN.A0J || !c1454AjN.A0G) {
            c1454AjN.A0S.A03 = false;
            if (c1459AjS.A06) {
                c1459AjS.A06 = false;
                if (!c1459AjS.A07) {
                    c1459AjS.A03(c1459AjS.A00 - 1);
                }
            }
            c1454AjN.A0D = g0u;
            c1454AjN.A07 = j;
            c1454AjN.A01 = f;
            c1454AjN.A09 = graphicsLayer;
            C1481Ajo c1481Ajo = ((AndroidComposeView) interfaceC1464AjXA00).A0q;
            c1481Ajo.A00.A03(c1453AjM, c1454AjN.A0X, c1481Ajo.A02);
        } else {
            AbstractC1387AiH abstractC1387AiH = c1453AjM.A0f.A04;
            AbstractC1387AiH.A0L(graphicsLayer, abstractC1387AiH, g0u, f, C2ae.A02(j, ((AZE) abstractC1387AiH).A02));
            c1454AjN.A0d();
        }
        c1459AjS.A05 = C79.A0P;
        if (((AbstractC1424Ait) c1453AjM.A0f.A04).A05 && (c1459AjS.A06 || c1459AjS.A07)) {
            c1454AjN.requestLayout();
        }
        c1454AjN.A0P = true;
    }

    public static final void A07(C1454AjN c1454AjN) {
        if (c1454AjN.A0G) {
            c1454AjN.A0G = false;
            C1453AjM c1453AjM = c1454AjN.A0T.A0F;
            ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM)).A12.A07(c1453AjM);
            C1438Aj7 c1438Aj7 = c1453AjM.A0f;
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1438Aj7.A07).A08;
            for (AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A04; !C7384Etj.areEqual(abstractC1387AiH2, abstractC1387AiH) && abstractC1387AiH2 != null; abstractC1387AiH2 = abstractC1387AiH2.A08) {
                abstractC1387AiH2.A0q();
                abstractC1387AiH2.A0r();
            }
            C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i = c0910AHmA0D.A00;
            for (int i2 = 0; i2 < i; i2++) {
                A07(c1453AjMArr[i2].A0d.A0G);
            }
        }
    }

    @Override // X.AZE
    public final int A0Y() {
        return this.A0T.A0F.A0f.A04.A0Y();
    }

    @Override // X.AZE
    public final int A0Z() {
        return this.A0T.A0F.A0f.A04.A0Z();
    }

    public final List<C1454AjN> A0c() {
        C1453AjM c1453AjM = this.A0T.A0F;
        c1453AjM.A0R();
        boolean z = this.A0E;
        C0910AHm<C1454AjN> c0910AHm = this.A0V;
        if (z) {
            C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i = c0910AHmA0D.A00;
            for (int i2 = 0; i2 < i; i2++) {
                C1453AjM c1453AjM2 = c1453AjMArr[i2];
                int i3 = c0910AHm.A00;
                C1454AjN c1454AjN = c1453AjM2.A0d.A0G;
                if (i3 <= i2) {
                    c0910AHm.A0G(c1454AjN);
                } else {
                    c0910AHm.A01[i2] = c1454AjN;
                }
            }
            c0910AHm.A0A(c1453AjM.A0D().A08().size(), c0910AHm.A00);
            this.A0E = false;
        }
        return c0910AHm.A08();
    }

    public final void A0e() {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        C1459AjS c1459AjS2 = c1453AjM.A0d;
        C1454AjN c1454AjN = c1459AjS2.A0G;
        if (!c1454AjN.A0G || c1459AjS.A00 <= 0) {
            return;
        }
        if ((c1459AjS2.A07 || c1459AjS2.A06) && !c1454AjN.A0J) {
            c1453AjM.A0c(false);
        }
        C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            c1453AjMArr[i2].A0d.A0G.A0e();
        }
    }

    public final boolean A0f(long j) throws Throwable {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        try {
            if (c1453AjM.A0R) {
                throw C60O.A0i("measure is called on a deactivated node");
            }
            InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(c1453AjM);
            C1453AjM c1453AjMA0E = c1453AjM.A0E();
            boolean z = true;
            c1453AjM.A0M = c1453AjM.A0M || (c1453AjMA0E != null && c1453AjMA0E.A0M);
            if (!c1453AjM.A0d.A0G.A0L && super.A04 == j) {
                interfaceC1464AjXA00.ABm(c1453AjM, false);
                c1453AjM.A0Q();
                return false;
            }
            this.A0S.A04 = false;
            ABj(new BUT(31));
            this.A0M = true;
            C1438Aj7 c1438Aj7 = c1453AjM.A0f;
            long j2 = ((AZE) c1438Aj7.A04).A03;
            A0X(j);
            Integer num = c1459AjS.A05;
            Integer num2 = C79.A0P;
            if (num != num2) {
                ASP.A01("layout state is not idle before measure starts");
                throw F60.createAndThrow();
            }
            this.A06 = j;
            Integer num3 = C79.A00;
            c1459AjS.A05 = num3;
            this.A0L = false;
            C1481Ajo c1481Ajo = ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM)).A0q;
            c1481Ajo.A00.A03(c1453AjM, this.A0U, c1481Ajo.A06);
            if (c1459AjS.A05 == num3) {
                this.A0J = true;
                this.A0K = true;
                c1459AjS.A05 = num2;
            }
            AbstractC1387AiH abstractC1387AiH = c1438Aj7.A04;
            if (((AZE) abstractC1387AiH).A03 == j2 && ((AZE) abstractC1387AiH).A01 == super.A01 && ((AZE) abstractC1387AiH).A00 == super.A00) {
                z = false;
            }
            A0W((((AZE) abstractC1387AiH).A00 & 4294967295L) | (((AZE) abstractC1387AiH).A01 << 32));
            return z;
        } catch (Throwable th) {
            c1453AjM.A0a(th);
            throw F60.createAndThrow();
        }
    }

    @Override // X.InterfaceC1472Ajf
    public final void ABj(G0U<? super InterfaceC1472Ajf, Unit> g0u) {
        C0910AHm<C1453AjM> c0910AHmA0D = this.A0T.A0F.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            g0u.invoke(c1453AjMArr[i2].A0d.A0G);
        }
    }

    @Override // X.C3Tw
    public final int ABt(AbstractC1493Ak0 abstractC1493Ak0) {
        C1453AjM c1453AjM = this.A0T.A0F;
        C1453AjM c1453AjMA0E = c1453AjM.A0E();
        if ((c1453AjMA0E != null ? c1453AjMA0E.A0d.A05 : null) == C79.A00) {
            this.A0S.A06 = true;
        } else {
            if ((c1453AjMA0E != null ? c1453AjMA0E.A0d.A05 : null) == C79.A0C) {
                this.A0S.A05 = true;
            }
        }
        this.A0F = true;
        int iABt = c1453AjM.A0f.A04.ABt(abstractC1493Ak0);
        this.A0F = false;
        return iABt;
    }

    @Override // X.InterfaceC1472Ajf
    public final AbstractC1460AjT ACI() {
        return this.A0S;
    }

    @Override // X.InterfaceC1472Ajf
    public final Ai8 AGV() {
        return this.A0T.A0F.A0f.A07;
    }

    @Override // X.InterfaceC1472Ajf
    public final InterfaceC1472Ajf AIV() {
        C1459AjS c1459AjS;
        C1453AjM c1453AjMA0E = this.A0T.A0F.A0E();
        if (c1453AjMA0E == null || (c1459AjS = c1453AjMA0E.A0d) == null) {
            return null;
        }
        return c1459AjS.A0G;
    }

    @Override // X.AZE, X.C3Tr
    public final Object AIX() {
        return this.A0B;
    }

    @Override // X.InterfaceC1472Ajf
    public final int AIh() {
        return this.A03;
    }

    @Override // X.C3Tr
    public final int AQM(int i) {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        if (!AbstractC1475Aji.A00(c1453AjM)) {
            A04();
            return c1453AjM.A0f.A04.AQM(i);
        }
        C1455AjO c1455AjO = c1459AjS.A04;
        C7384Etj.A0X(c1455AjO);
        return c1455AjO.AQM(i);
    }

    @Override // X.C3Tr
    public final int AQO(int i) {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        if (!AbstractC1475Aji.A00(c1453AjM)) {
            A04();
            return c1453AjM.A0f.A04.AQO(i);
        }
        C1455AjO c1455AjO = c1459AjS.A04;
        C7384Etj.A0X(c1455AjO);
        return c1455AjO.AQO(i);
    }

    @Override // X.C3TG
    public final AZE AQW(long j) throws Throwable {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        Integer num = c1453AjM.A0I;
        Integer num2 = C79.A0C;
        if (num == num2) {
            c1453AjM.A0H();
        }
        if (AbstractC1475Aji.A00(c1453AjM)) {
            C1455AjO c1455AjO = c1459AjS.A04;
            C7384Etj.A0X(c1455AjO);
            c1455AjO.A07 = num2;
            c1455AjO.AQW(j);
        }
        C1453AjM c1453AjMA0E = c1453AjM.A0E();
        if (c1453AjMA0E != null) {
            if (this.A0A != num2 && !c1453AjM.A0M) {
                ASP.A01("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw F60.createAndThrow();
            }
            Integer num3 = c1453AjMA0E.A0d.A05;
            int iIntValue = num3.intValue();
            if (iIntValue == 0) {
                num2 = C79.A00;
            } else {
                if (iIntValue != 2) {
                    throw new IllegalStateException(FGI.A0M("Measurable could be only measured from the parent's measure or layout block. Parents state is ", AbstractC1477Ajk.A00(num3)));
                }
                num2 = C79.A01;
            }
        }
        this.A0A = num2;
        A0f(j);
        return this;
    }

    @Override // X.C3Tr
    public final int AQo(int i) {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        if (!AbstractC1475Aji.A00(c1453AjM)) {
            A04();
            return c1453AjM.A0f.A04.AQo(i);
        }
        C1455AjO c1455AjO = c1459AjS.A04;
        C7384Etj.A0X(c1455AjO);
        return c1455AjO.AQo(i);
    }

    @Override // X.C3Tr
    public final int AQq(int i) {
        C1459AjS c1459AjS = this.A0T;
        C1453AjM c1453AjM = c1459AjS.A0F;
        if (!AbstractC1475Aji.A00(c1453AjM)) {
            A04();
            return c1453AjM.A0f.A04.AQq(i);
        }
        C1455AjO c1455AjO = c1459AjS.A04;
        C7384Etj.A0X(c1455AjO);
        return c1455AjO.AQq(i);
    }

    @Override // X.InterfaceC1472Ajf
    public final void AbA() {
        C1453AjM.A0B(this.A0T.A0F, false, true, true);
    }

    @Override // X.AYV
    public final void Ahz(boolean z) {
        AbstractC1387AiH abstractC1387AiH = this.A0T.A0F.A0f.A04;
        if (z != ((AbstractC1424Ait) abstractC1387AiH).A04) {
            ((AbstractC1424Ait) abstractC1387AiH).A04 = z;
            this.A0R = true;
        }
    }

    @Override // X.InterfaceC1472Ajf
    public final void requestLayout() {
        this.A0T.A0F.A0c(false);
    }

    public C1454AjN(C1459AjS c1459AjS) {
        this.A0T = c1459AjS;
    }
}
