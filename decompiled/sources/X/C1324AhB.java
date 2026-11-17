package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.AhB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1324AhB implements AT3, C16Z {
    public InterfaceC1332AhJ A00;
    public final C1325AhC A01 = new C1325AhC();

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLX/G0U<-LX/AT3;Lkotlin/Unit;>;)V */
    @Override // X.AT3
    public final void AZj(GraphicsLayer graphicsLayer, G0U g0u, long j) {
        graphicsLayer.A0C(this, this.A01.A02.A03, new C2339BUn(this.A00, g0u, this, 9), j);
    }

    public /* synthetic */ C1324AhB(C1325AhC c1325AhC, C06H c06h, int i) {
    }

    public static final void A00(InterfaceC1327AhE interfaceC1327AhE, GraphicsLayer graphicsLayer, InterfaceC1332AhJ interfaceC1332AhJ, C1324AhB c1324AhB, AbstractC1387AiH abstractC1387AiH, long j) {
        InterfaceC1332AhJ interfaceC1332AhJ2 = c1324AhB.A00;
        c1324AhB.A00 = interfaceC1332AhJ;
        C1325AhC c1325AhC = c1324AhB.A01;
        EnumC1820Arj enumC1820Arj = abstractC1387AiH.A0P.A0G;
        InterfaceC1279AgP interfaceC1279AgP = c1325AhC.A03;
        AaI aaI = (AaI) interfaceC1279AgP;
        AW9 aw9 = aaI.A02.A02;
        AXN axn = aw9.A02;
        EnumC1820Arj enumC1820Arj2 = aw9.A03;
        InterfaceC1327AhE interfaceC1327AhE2 = aw9.A01;
        long j2 = aw9.A00;
        GraphicsLayer graphicsLayer2 = aaI.A00;
        interfaceC1279AgP.AdH(abstractC1387AiH);
        aw9.A03 = enumC1820Arj;
        aw9.A01 = interfaceC1327AhE;
        interfaceC1279AgP.Aeh(j);
        aaI.A00 = graphicsLayer;
        interfaceC1327AhE.Ac2();
        try {
            interfaceC1332AhJ.draw(c1324AhB);
            interfaceC1327AhE.Abc();
            interfaceC1279AgP.AdH(axn);
            aw9.A03 = enumC1820Arj2;
            aw9.A01 = interfaceC1327AhE2;
            interfaceC1279AgP.Aeh(j2);
            aaI.A00 = graphicsLayer2;
            c1324AhB.A00 = interfaceC1332AhJ2;
        } catch (Throwable th) {
            interfaceC1327AhE.Abc();
            interfaceC1279AgP.AdH(axn);
            aw9.A03 = enumC1820Arj2;
            aw9.A01 = interfaceC1327AhE2;
            interfaceC1279AgP.Aeh(j2);
            aaI.A00 = graphicsLayer2;
            throw th;
        }
    }

    @Override // X.AT3
    public final void A9K(C1423Ais c1423Ais, C16b c16b, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        this.A01.A9K(c1423Ais, c16b, f, f2, f3, i, j, j2, j3, z);
    }

    @Override // X.AT3
    public final void A9M(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, float f2, int i, long j) {
        this.A01.A9M(c1eq, c1423Ais, c16b, f, f2, i, j);
    }

    @Override // X.AT3
    public final void A9N(C1423Ais c1423Ais, C16b c16b, float f, float f2, int i, long j, long j2) {
        this.A01.A9N(c1423Ais, c16b, f, f2, i, j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r10v11, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.Aj8] */
    @Override // X.C16Z
    public final void A9O() {
        AaI aaI = (AaI) this.A01.A03;
        InterfaceC1327AhE interfaceC1327AhE = aaI.A02.A02.A01;
        C1Z3 c1z3 = this.A00;
        if (c1z3 == null) {
            throw C3cG.A0Q("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC1437Aj6 abstractC1437Aj6A00 = ((AbstractC1439Aj8) c1z3).node.child;
        if (abstractC1437Aj6A00 != 0 && (abstractC1437Aj6A00.aggregateChildKindSet & 4) != 0) {
            while ((abstractC1437Aj6A00.kindSet & 2) == 0) {
                if ((abstractC1437Aj6A00.kindSet & 4) == 0) {
                    abstractC1437Aj6A00 = abstractC1437Aj6A00.child;
                    if (abstractC1437Aj6A00 == 0) {
                        break;
                    }
                } else {
                    C0910AHm c0910AHm = null;
                    do {
                        if (abstractC1437Aj6A00 instanceof InterfaceC1332AhJ) {
                            InterfaceC1332AhJ interfaceC1332AhJ = (InterfaceC1332AhJ) abstractC1437Aj6A00;
                            GraphicsLayer graphicsLayer = aaI.A00;
                            AbstractC1387AiH abstractC1387AiHA06 = AbstractC1414Aij.A06(interfaceC1332AhJ, 4);
                            A00(interfaceC1327AhE, graphicsLayer, interfaceC1332AhJ, ((AndroidComposeView) AbstractC1333AhK.A00(abstractC1387AiHA06.A0P)).A0o, abstractC1387AiHA06, AQY.A01(((AZE) abstractC1387AiHA06).A03));
                        } else if ((abstractC1437Aj6A00.kindSet & 4) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                            AbstractC1439Aj8 abstractC1439Aj8 = abstractC1437Aj6A00.A00;
                            int i = 0;
                            abstractC1437Aj6A00 = abstractC1437Aj6A00;
                            while (abstractC1439Aj8 != null) {
                                if ((abstractC1439Aj8.kindSet & 4) != 0) {
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
                    return;
                }
            }
        }
        AbstractC1387AiH abstractC1387AiHA062 = AbstractC1414Aij.A06(c1z3, 4);
        if (abstractC1387AiHA062.A0j() == ((AbstractC1439Aj8) c1z3).node) {
            abstractC1387AiHA062 = abstractC1387AiHA062.A08;
            C7384Etj.A0X(abstractC1387AiHA062);
        }
        abstractC1387AiHA062.A0u(interfaceC1327AhE, aaI.A00);
    }

    @Override // X.AT3
    public final void A9Q(C1423Ais c1423Ais, InterfaceC2178B0w interfaceC2178B0w, C16b c16b, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A01.A9Q(c1423Ais, interfaceC2178B0w, c16b, f, i, i2, j, j2, j3, j4);
    }

    @Override // X.AT3
    public final void A9S(C1423Ais c1423Ais, InterfaceC2178B0w interfaceC2178B0w, C16b c16b, float f, int i, long j) {
        this.A01.A9S(c1423Ais, interfaceC2178B0w, c16b, f, i, j);
    }

    @Override // X.AT3
    public final void A9W(C1EQ c1eq, C1423Ais c1423Ais, C0zF c0zF, float f, float f2, int i, int i2, long j, long j2) {
        this.A01.A9W(c1eq, c1423Ais, c0zF, f, f2, i, i2, j, j2);
    }

    @Override // X.AT3
    public final void A9X(C1423Ais c1423Ais, C0zF c0zF, float f, float f2, int i, int i2, long j, long j2, long j3) {
        this.A01.A9X(c1423Ais, c0zF, f, f2, i, i2, j, j2, j3);
    }

    @Override // X.AT3
    public final void A9a(C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3) {
        this.A01.A9a(c1423Ais, c16b, f, i, j, j2, j3);
    }

    @Override // X.AT3
    public final void A9c(C1EQ c1eq, C1423Ais c1423Ais, InterfaceC1068ATy interfaceC1068ATy, C16b c16b, float f, int i) {
        this.A01.A9c(c1eq, c1423Ais, interfaceC1068ATy, c16b, f, i);
    }

    @Override // X.AT3
    public final void A9d(C1423Ais c1423Ais, InterfaceC1068ATy interfaceC1068ATy, C16b c16b, float f, int i, long j) {
        this.A01.A9d(c1423Ais, interfaceC1068ATy, c16b, f, i, j);
    }

    @Override // X.AT3
    public final void A9f(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2) {
        this.A01.A9f(c1eq, c1423Ais, c16b, f, i, j, j2);
    }

    @Override // X.AT3
    public final void A9g(C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3) {
        this.A01.A9g(c1423Ais, c16b, f, i, j, j2, j3);
    }

    @Override // X.AT3
    public final void A9i(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3) {
        this.A01.A9i(c1eq, c1423Ais, c16b, f, i, j, j2, j3);
    }

    @Override // X.AT3
    public final void A9j(C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3, long j4) {
        this.A01.A9j(c1423Ais, c16b, f, i, j, j2, j3, j4);
    }

    @Override // X.AT3
    public final long ADU() {
        return this.A01.ADU();
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A01.AEm();
    }

    @Override // X.AT3
    public final InterfaceC1279AgP AEq() {
        return this.A01.A03;
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A01.AFo();
    }

    @Override // X.AT3
    public final long AKb() {
        return this.A01.AKb();
    }

    @Override // X.AXN
    public final int Abr(float f) {
        return ASU.A01(this.A01, f);
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        return AbstractC1499Ak6.A00(this.A01, j);
    }

    @Override // X.AXN
    public final float Agx(float f) {
        return f / this.A01.AEm();
    }

    @Override // X.AXN
    public final float Agy(int i) {
        return i / this.A01.AEm();
    }

    @Override // X.AXN
    public final long Agz(long j) {
        return ASU.A02(this.A01, j);
    }

    @Override // X.AXN
    public final float Ah3(long j) {
        return ASU.A00(j, this.A01);
    }

    @Override // X.AXN
    public final float Ah4(float f) {
        return f * this.A01.AEm();
    }

    @Override // X.AXN
    public final long Ah6(long j) {
        return ASU.A03(this.A01, j);
    }

    @Override // X.C0dm
    public final long Ah7(float f) {
        return AbstractC1499Ak6.A01(this.A01, f);
    }

    @Override // X.AXN
    public final long Ah8(float f) {
        return AXN.A02(this.A01, f);
    }

    @Override // X.AXN
    public final long Ah9(int i) {
        return AXN.A03(this.A01, i);
    }

    @Override // X.AT3
    public final EnumC1820Arj getLayoutDirection() {
        return this.A01.A02.A03;
    }

    public C1324AhB() {
    }
}
