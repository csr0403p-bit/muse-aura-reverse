package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class ASc extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1448AjH, InterfaceC1332AhJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public GraphicsLayer A04;
    public HoC A05;
    public final AT5<Float, AOW> A06;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final C1BO A0C;
    public final C00r A08 = new ParcelableSnapshotMutableIntState(0);
    public final C00r A07 = new ParcelableSnapshotMutableIntState(0);

    public static final void A00(ASc aSc) {
        HoC hoC = aSc.A05;
        HtJ htJA13 = AnonymousClass006.A13(hoC);
        if (aSc.isAttached) {
            aSc.A05 = AnonymousClass001.A11(BU6.A0M(aSc, hoC, htJA13, 12), aSc.getCoroutineScope());
        }
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        float fAGd;
        float fA00;
        int iAGd;
        int iA01 = C1DG.A01(this.A00, 0.0f);
        int iOrdinal = c16z.getLayoutDirection().ordinal();
        if (iA01 > 0) {
            if (iOrdinal == 0) {
                fAGd = MutableState.A00(this.A06);
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                fA00 = (-MutableState.A00(this.A06)) + (this.A08.AGd() * 2);
                iAGd = C1BO.A02(this.A0C);
                fAGd = (fA00 + iAGd) - this.A07.AGd();
            }
        } else if (iOrdinal == 0) {
            fAGd = (-MutableState.A00(this.A06)) + this.A08.AGd() + C1BO.A02(this.A0C);
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            fA00 = MutableState.A00(this.A06);
            iAGd = this.A08.AGd();
            fAGd = (fA00 + iAGd) - this.A07.AGd();
        }
        C00r c00r = this.A08;
        boolean zA1R = C8j3.A1R((fAGd > c00r.AGd() ? 1 : (fAGd == c00r.AGd() ? 0 : -1)));
        C00r c00r2 = this.A07;
        float fAGd2 = c00r2.AGd() + fAGd;
        int iAGd2 = c00r.AGd();
        C1BO c1bo = this.A0C;
        boolean z = fAGd2 > ((float) (iAGd2 + C1BO.A02(c1bo)));
        float fAGd3 = c00r.AGd() + C1BO.A02(c1bo);
        float fA01 = AnonymousClass001.A01(c16z.AKb(), 4294967295L);
        GraphicsLayer graphicsLayer = this.A04;
        if (graphicsLayer != null) {
            c16z.AZj(graphicsLayer, C2295BSv.A00(c16z, 7), (c00r.AGd() << 32) | (Ab3.A01(fA01) & 4294967295L));
        }
        float fAGd4 = c00r2.AGd();
        float fA012 = AnonymousClass001.A01(4294967295L, c16z.AKb());
        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            AT2 at2 = aaI.A01;
            at2.A6N(0.0f, 0.0f, fAGd4, fA012, 1);
            float f = -fAGd;
            at2.AhL(f, 0.0f);
            try {
                GraphicsLayer graphicsLayer2 = this.A04;
                try {
                    if (graphicsLayer2 != null) {
                        if (zA1R) {
                            ATI.A00(c16z, graphicsLayer2);
                        }
                        if (z) {
                            at2.AhL(fAGd3, 0.0f);
                            ATI.A00(c16z, graphicsLayer2);
                            at2.AhL(-fAGd3, -0.0f);
                        }
                    } else {
                        if (zA1R) {
                            c16z.A9O();
                        }
                        if (z) {
                            at2.AhL(fAGd3, 0.0f);
                            c16z.A9O();
                            at2.AhL(-fAGd3, -0.0f);
                        }
                    }
                } catch (Throwable th) {
                    at2.AhL(-fAGd3, -0.0f);
                    throw th;
                }
            } finally {
                at2.AhL(-f, -0.0f);
            }
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        GraphicsLayer graphicsLayer = this.A04;
        ASQ asqA02 = AbstractC1414Aij.A02(this);
        if (graphicsLayer != null) {
            asqA02.AaE(graphicsLayer);
        }
        this.A04 = asqA02.A7n();
        A00(this);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        HoC hoC = this.A05;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.A05 = null;
        GraphicsLayer graphicsLayer = this.A04;
        if (graphicsLayer != null) {
            AbstractC1414Aij.A02(this).AaE(graphicsLayer);
            this.A04 = null;
        }
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public ASc(C06m c06m, float f, int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
        AGE age = AGE.A00;
        this.A0A = C3cG.A08(age, false);
        this.A0B = C3cG.A08(age, c06m);
        this.A09 = C3cG.A08(age, new C1037ASe());
        this.A06 = AT8.A00(0.0f);
        this.A0C = BBP.A0A(new BTB(4, c06m, this));
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return c3Tr.AQM(Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return c3Tr.AQO(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(AnonymousClass004.A0x(j, Constraints.A03(j), Integer.MAX_VALUE));
        int iA02 = AYL.A02(j, azeAQW.A01);
        C00r c00r = this.A07;
        c00r.AdX(iA02);
        this.A08.AdX(azeAQW.A01);
        return AXY.A00(axy, azeAQW, 8, c00r.AGd(), azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return c3Tr.AQo(Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC1448AjH
    public final void ATP(C2Um c2Um) {
        MutableState.A09(c2Um.AG5(), this.A0A);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return 0;
    }
}
