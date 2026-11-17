package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AjO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1455AjO extends AZE implements C3TG, InterfaceC1472Ajf, AYV {
    public long A02;
    public long A03;
    public GraphicsLayer A04;
    public Constraints A05;
    public Integer A06;
    public Integer A07;
    public Object A08;
    public G0U<? super C2av, Unit> A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final C0910AHm<C1455AjO> A0I;
    public final AbstractC1460AjT A0J;
    public final C1459AjS A0K;
    public final Function0<Unit> A0L;
    public final Function0<Unit> A0M;
    public final Function0<Unit> A0N;
    public int A01 = Integer.MAX_VALUE;
    public int A00 = Integer.MAX_VALUE;

    @Override // X.AZE
    public final void A0a(GraphicsLayer graphicsLayer, float f, long j) throws Throwable {
        A05(graphicsLayer, this, null, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    @Override // X.AZE
    public final void A0b(G0U g0u, float f, long j) throws Throwable {
        A05(null, this, g0u, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0d() {
        /*
            r4 = this;
            r0 = 1
            r4.A0D = r0
            X.AjS r3 = r4.A0K
            X.AjM r0 = r3.A0F
            X.AjM r2 = r0.A0E()
            java.lang.Integer r1 = r4.A06
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto L15
            boolean r0 = r3.A09
            if (r0 == 0) goto L1d
        L15:
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto L4d
            boolean r0 = r3.A09
            if (r0 == 0) goto L4d
        L1d:
            r4.A02()
            boolean r0 = r4.A0G
            if (r0 == 0) goto L4d
            if (r2 == 0) goto L50
            r0 = 0
            r2.A0b(r0)
        L2a:
            boolean r0 = r4.A0G
            if (r0 != 0) goto L49
            X.AjS r2 = r2.A0d
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L3a
            java.lang.Integer r0 = X.C79.A0K
            if (r1 != r0) goto L49
        L3a:
            int r1 = r4.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L54
            int r0 = r2.A02
            r4.A00 = r0
            int r0 = r0 + 1
            r2.A02 = r0
        L49:
            r4.APY()
            return
        L4d:
            if (r2 == 0) goto L50
            goto L2a
        L50:
            r0 = 0
            r4.A00 = r0
            goto L49
        L54:
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455AjO.A0d():void");
    }

    @Override // X.InterfaceC1472Ajf
    public final void APY() {
        this.A0C = true;
        AbstractC1460AjT abstractC1460AjT = this.A0J;
        abstractC1460AjT.A03();
        C1459AjS c1459AjS = this.A0K;
        if (c1459AjS.A0C) {
            C1453AjM c1453AjM = c1459AjS.A0F;
            C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i = c0910AHmA0D.A00;
            for (int i2 = 0; i2 < i; i2++) {
                C1453AjM c1453AjM2 = c1453AjMArr[i2];
                if (c1453AjM2.A0d.A0E) {
                    C1455AjO c1455AjO = c1453AjM2.A0d.A04;
                    if ((c1455AjO != null ? c1455AjO.A07 : C79.A0C) == C79.A00) {
                        C1459AjS c1459AjS2 = c1453AjM2.A0d;
                        C1455AjO c1455AjO2 = c1459AjS2.A04;
                        C7384Etj.A0X(c1455AjO2);
                        C1455AjO c1455AjO3 = c1459AjS2.A04;
                        Constraints constraints = c1455AjO3 != null ? c1455AjO3.A05 : null;
                        C7384Etj.A0X(constraints);
                        if (c1455AjO2.A0f(constraints.A00)) {
                            C1453AjM.A0A(c1453AjM, false, true, true);
                        }
                    }
                }
            }
        }
        AbstractC1383AiD abstractC1383AiDA0l = AGV().A0l();
        C7384Etj.A0X(abstractC1383AiDA0l);
        if (c1459AjS.A0D || (!this.A0B && !((AbstractC1424Ait) abstractC1383AiDA0l).A05 && c1459AjS.A0C)) {
            c1459AjS.A0C = false;
            Integer num = c1459AjS.A05;
            c1459AjS.A05 = C79.A0K;
            if (c1459AjS.A0B) {
                c1459AjS.A0B = false;
                if (!c1459AjS.A0A) {
                    C1459AjS.A00(c1459AjS, c1459AjS.A01 - 1);
                }
            }
            C1453AjM c1453AjM3 = c1459AjS.A0F;
            C1481Ajo c1481Ajo = ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM3)).A0q;
            c1481Ajo.A00.A03(c1453AjM3, this.A0M, c1481Ajo.A04);
            c1459AjS.A05 = num;
            if (c1459AjS.A0B && ((AbstractC1424Ait) abstractC1383AiDA0l).A05) {
                requestLayout();
            }
            c1459AjS.A0D = false;
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
        this.A0C = false;
    }

    private final void A02() {
        Integer num = this.A06;
        C1459AjS c1459AjS = this.A0K;
        this.A06 = c1459AjS.A09 ? C79.A01 : C79.A00;
        if (num != C79.A00 && c1459AjS.A0E) {
            C1453AjM.A0A(c1459AjS.A0F, true, true, true);
        }
        C0910AHm<C1453AjM> c0910AHmA0D = c1459AjS.A0F.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM = c1453AjMArr[i2];
            C1455AjO c1455AjO = c1453AjM.A0d.A04;
            if (c1455AjO == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c1455AjO.A00 != Integer.MAX_VALUE) {
                c1455AjO.A02();
                C1453AjM.A09(c1453AjM);
            }
        }
    }

    private final void A04() {
        C1453AjM c1453AjM = this.A0K.A0F;
        C1453AjM.A0A(c1453AjM, false, true, true);
        C1453AjM c1453AjMA0E = c1453AjM.A0E();
        if (c1453AjMA0E == null || c1453AjM.A0I != C79.A0C) {
            return;
        }
        int iIntValue = c1453AjMA0E.A0d.A05.intValue();
        c1453AjM.A0I = iIntValue != 0 ? iIntValue != 2 ? c1453AjMA0E.A0I : C79.A01 : C79.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V */
    public static final void A05(GraphicsLayer graphicsLayer, C1455AjO c1455AjO, G0U g0u, long j) throws Throwable {
        C1459AjS c1459AjS = c1455AjO.A0K;
        C1453AjM c1453AjM = c1459AjS.A0F;
        try {
            C1453AjM c1453AjMA0E = c1453AjM.A0E();
            Integer num = c1453AjMA0E != null ? c1453AjMA0E.A0d.A05 : null;
            Integer num2 = C79.A0K;
            if (num == num2) {
                c1459AjS.A09 = false;
            }
            if (c1453AjM.A0R) {
                throw C60O.A0i("place is called on a deactivated node");
            }
            c1459AjS.A05 = num2;
            c1455AjO.A0F = true;
            c1455AjO.A0D = false;
            if (j != c1455AjO.A02) {
                if (c1459AjS.A0A || c1459AjS.A0B) {
                    c1459AjS.A0C = true;
                }
                c1455AjO.A0c();
            }
            InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(c1453AjM);
            c1455AjO.A02 = j;
            if (c1459AjS.A0C || c1455AjO.A06 == C79.A0C) {
                if (c1459AjS.A0A) {
                    c1459AjS.A0A = false;
                    if (!c1459AjS.A0B) {
                        C1459AjS.A00(c1459AjS, c1459AjS.A01 - 1);
                    }
                }
                c1455AjO.A0J.A03 = false;
                C1481Ajo c1481Ajo = ((AndroidComposeView) interfaceC1464AjXA00).A0q;
                c1481Ajo.A00.A03(c1453AjM, c1455AjO.A0N, c1481Ajo.A03);
            } else {
                AbstractC1383AiD abstractC1383AiDA0l = c1453AjM.A0f.A04.A0l();
                C7384Etj.A0X(abstractC1383AiDA0l);
                AbstractC1383AiD.A04(abstractC1383AiDA0l, C2ae.A02(j, ((AZE) abstractC1383AiDA0l).A02));
                c1455AjO.A0d();
            }
            c1455AjO.A09 = g0u;
            c1455AjO.A04 = graphicsLayer;
            c1459AjS.A05 = C79.A0P;
        } catch (Throwable th) {
            c1453AjM.A0a(th);
            throw F60.createAndThrow();
        }
    }

    public final void A0c() {
        C1459AjS c1459AjS = this.A0K;
        if (c1459AjS.A01 > 0) {
            C0910AHm<C1453AjM> c0910AHmA0D = c1459AjS.A0F.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i = c0910AHmA0D.A00;
            for (int i2 = 0; i2 < i; i2++) {
                C1453AjM c1453AjM = c1453AjMArr[i2];
                C1459AjS c1459AjS2 = c1453AjM.A0d;
                if ((c1459AjS2.A0B || c1459AjS2.A0A) && !c1459AjS2.A0C) {
                    c1453AjM.A0b(false);
                }
                C1455AjO c1455AjO = c1459AjS2.A04;
                if (c1455AjO != null) {
                    c1455AjO.A0c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0e(boolean r4) {
        /*
            r3 = this;
            X.AjS r1 = r3.A0K
            X.AjM r2 = r1.A0F
            boolean r0 = X.AbstractC1475Aji.A00(r2)
            if (r0 != 0) goto Lf
            boolean r1 = r1.A09
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            if (r4 == 0) goto L35
            if (r0 != 0) goto L37
        L14:
            java.lang.Integer r0 = X.C79.A0C
            r3.A06 = r0
            X.AHm r0 = r2.A0D()
            T[] r4 = r0.A01
            int r3 = r0.A00
            r2 = 0
        L21:
            if (r2 >= r3) goto L37
            r0 = r4[r2]
            X.AjM r0 = (X.C1453AjM) r0
            X.AjS r0 = r0.A0d
            X.AjO r1 = r0.A04
            X.C7384Etj.A0X(r1)
            r0 = 1
            r1.A0e(r0)
            int r2 = r2 + 1
            goto L21
        L35:
            if (r0 != 0) goto L14
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455AjO.A0e(boolean):void");
    }

    public final boolean A0f(long j) throws Throwable {
        Constraints constraints;
        C1459AjS c1459AjS = this.A0K;
        C1453AjM c1453AjM = c1459AjS.A0F;
        try {
            if (c1453AjM.A0R) {
                throw C60O.A0i("measure is called on a deactivated node");
            }
            C1453AjM c1453AjMA0E = c1453AjM.A0E();
            c1453AjM.A0M = c1453AjM.A0M || (c1453AjMA0E != null && c1453AjMA0E.A0M);
            if (!c1453AjM.A0d.A0E && (constraints = this.A05) != null && constraints.A00 == j) {
                InterfaceC1464AjX interfaceC1464AjX = c1453AjM.A0D;
                if (interfaceC1464AjX != null) {
                    interfaceC1464AjX.ABm(c1453AjM, true);
                }
                c1453AjM.A0Q();
                return false;
            }
            this.A05 = new Constraints(j);
            A0X(j);
            this.A0J.A04 = false;
            ABj(new BUT(28));
            long j2 = this.A0H ? super.A03 : 2147483648L | (AuraImpressionTimeTracker.UNKNOWN_TIME << 32);
            this.A0H = true;
            AbstractC1383AiD abstractC1383AiDA0l = c1453AjM.A0f.A04.A0l();
            if (abstractC1383AiDA0l == null) {
                ASP.A01("Lookahead result from lookaheadRemeasure cannot be null");
                throw F60.createAndThrow();
            }
            C1455AjO c1455AjO = c1459AjS.A04;
            if (c1455AjO != null) {
                Integer num = C79.A01;
                C1459AjS c1459AjS2 = c1455AjO.A0K;
                c1459AjS2.A05 = num;
                c1459AjS2.A0E = false;
                c1455AjO.A03 = j;
                C1453AjM c1453AjM2 = c1459AjS2.A0F;
                C1481Ajo c1481Ajo = ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM2)).A0q;
                c1481Ajo.A00.A03(c1453AjM2, c1455AjO.A0L, c1481Ajo.A05);
                c1459AjS2.A0C = true;
                c1459AjS2.A0D = true;
                boolean zA00 = AbstractC1475Aji.A00(c1453AjM2);
                C1454AjN c1454AjN = c1459AjS2.A0G;
                if (zA00) {
                    c1454AjN.A0J = true;
                    c1454AjN.A0K = true;
                } else {
                    c1454AjN.A0L = true;
                }
                c1459AjS2.A05 = C79.A0P;
            }
            A0W((((AZE) abstractC1383AiDA0l).A00 & 4294967295L) | (((AZE) abstractC1383AiDA0l).A01 << 32));
            return (((int) (j2 >> 32)) == ((AZE) abstractC1383AiDA0l).A01 && ((int) (j2 & 4294967295L)) == ((AZE) abstractC1383AiDA0l).A00) ? false : true;
        } catch (Throwable th) {
            c1453AjM.A0a(th);
            throw F60.createAndThrow();
        }
    }

    @Override // X.InterfaceC1472Ajf
    public final void ABj(G0U<? super InterfaceC1472Ajf, Unit> g0u) {
        C0910AHm<C1453AjM> c0910AHmA0D = this.A0K.A0F.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1455AjO c1455AjO = c1453AjMArr[i2].A0d.A04;
            C7384Etj.A0X(c1455AjO);
            g0u.invoke(c1455AjO);
        }
    }

    @Override // X.C3Tw
    public final int ABt(AbstractC1493Ak0 abstractC1493Ak0) {
        C1453AjM c1453AjM = this.A0K.A0F;
        C1453AjM c1453AjMA0E = c1453AjM.A0E();
        if ((c1453AjMA0E != null ? c1453AjMA0E.A0d.A05 : null) == C79.A01) {
            this.A0J.A06 = true;
        } else {
            if ((c1453AjMA0E != null ? c1453AjMA0E.A0d.A05 : null) == C79.A0K) {
                this.A0J.A05 = true;
            }
        }
        this.A0B = true;
        int iABt = AZE.A01(c1453AjM.A0f.A04).ABt(abstractC1493Ak0);
        this.A0B = false;
        return iABt;
    }

    @Override // X.InterfaceC1472Ajf
    public final AbstractC1460AjT ACI() {
        return this.A0J;
    }

    @Override // X.InterfaceC1472Ajf
    public final Ai8 AGV() {
        return this.A0K.A0F.A0f.A07;
    }

    @Override // X.InterfaceC1472Ajf
    public final InterfaceC1472Ajf AIV() {
        C1459AjS c1459AjS;
        C1453AjM c1453AjMA0E = this.A0K.A0F.A0E();
        if (c1453AjMA0E == null || (c1459AjS = c1453AjMA0E.A0d) == null) {
            return null;
        }
        return c1459AjS.A04;
    }

    @Override // X.AZE, X.C3Tr
    public final Object AIX() {
        return this.A08;
    }

    @Override // X.InterfaceC1472Ajf
    public final int AIh() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // X.C3TG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AZE AQW(long r8) {
        /*
            r7 = this;
            X.AjS r3 = r7.A0K
            X.AjM r5 = r3.A0F
            X.AjM r2 = r5.A0E()
            r1 = 0
            if (r2 == 0) goto L37
            X.AjS r0 = r2.A0d
            java.lang.Integer r0 = r0.A05
        Lf:
            java.lang.Integer r6 = X.C79.A01
            if (r0 == r6) goto L1d
            if (r2 == 0) goto L19
            X.AjS r0 = r2.A0d
            java.lang.Integer r1 = r0.A05
        L19:
            java.lang.Integer r0 = X.C79.A0K
            if (r1 != r0) goto L20
        L1d:
            r0 = 0
            r3.A08 = r0
        L20:
            if (r2 == 0) goto L5f
            java.lang.Integer r0 = r7.A07
            java.lang.Integer r4 = X.C79.A0C
            r3 = 1
            if (r0 == r4) goto L39
            boolean r0 = r5.A0M
            if (r0 != 0) goto L39
            java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L37:
            r0 = r1
            goto Lf
        L39:
            X.AjS r0 = r2.A0d
            java.lang.Integer r2 = r0.A05
            int r1 = r2.intValue()
            if (r1 == r3) goto L5c
            r0 = 0
            if (r1 == r0) goto L5c
            r0 = 2
            if (r1 == r0) goto L62
            r0 = 3
            if (r1 == r0) goto L62
            java.lang.String r1 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            java.lang.String r0 = X.AbstractC1477Ajk.A00(r2)
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L5c:
            java.lang.Integer r6 = X.C79.A00
            goto L62
        L5f:
            java.lang.Integer r6 = X.C79.A0C
            r4 = r6
        L62:
            r7.A07 = r6
            java.lang.Integer r0 = r5.A0I
            if (r0 != r4) goto L6b
            r5.A0H()
        L6b:
            r7.A0f(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455AjO.AQW(long):X.AZE");
    }

    @Override // X.InterfaceC1472Ajf
    public final void AbA() {
        C1453AjM.A0A(this.A0K.A0F, false, true, true);
    }

    @Override // X.AYV
    public final void Ahz(boolean z) {
        AbstractC1383AiD abstractC1383AiDA0l;
        C1438Aj7 c1438Aj7 = this.A0K.A0F.A0f;
        AbstractC1383AiD abstractC1383AiDA0l2 = c1438Aj7.A04.A0l();
        if (Boolean.valueOf(z).equals(abstractC1383AiDA0l2 != null ? Boolean.valueOf(((AbstractC1424Ait) abstractC1383AiDA0l2).A04) : null) || (abstractC1383AiDA0l = c1438Aj7.A04.A0l()) == null) {
            return;
        }
        ((AbstractC1424Ait) abstractC1383AiDA0l).A04 = z;
    }

    @Override // X.InterfaceC1472Ajf
    public final void requestLayout() {
        this.A0K.A0F.A0b(false);
    }

    public C1455AjO(C1459AjS c1459AjS) {
        this.A0K = c1459AjS;
        Integer num = C79.A0C;
        this.A07 = num;
        this.A02 = 0L;
        this.A06 = num;
        this.A0J = new C1385AiF(this);
        this.A0I = new C0910AHm<>(0, new C1455AjO[16]);
        this.A0A = true;
        this.A0M = new C2328BUc(this, 17);
        this.A0E = true;
        this.A08 = c1459AjS.A0G.A0B;
        this.A03 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0L = new C2328BUc(this, 19);
        this.A0N = new C2328BUc(this, 18);
    }

    @Override // X.AZE
    public final int A0Y() {
        return AZE.A00(this).A0Y();
    }

    @Override // X.AZE
    public final int A0Z() {
        return AZE.A00(this).A0Z();
    }

    @Override // X.C3Tr
    public final int AQM(int i) {
        A04();
        return AZE.A00(this).AQM(i);
    }

    @Override // X.C3Tr
    public final int AQO(int i) {
        A04();
        return AZE.A00(this).AQO(i);
    }

    @Override // X.C3Tr
    public final int AQo(int i) {
        A04();
        return AZE.A00(this).AQo(i);
    }

    @Override // X.C3Tr
    public final int AQq(int i) {
        A04();
        return AZE.A00(this).AQq(i);
    }
}
