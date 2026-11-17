package X;

import android.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: X.AhC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1325AhC implements AT3 {
    public InterfaceC1330AhH A00;
    public InterfaceC1330AhH A01;
    public final AW9 A02;
    public final InterfaceC1279AgP A03;

    @Override // X.AT3
    public final void A9K(C1423Ais c1423Ais, C16b c16b, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        float fA00 = AnonymousClass001.A00(j2);
        float fA01 = AnonymousClass001.A01(j2, 4294967295L);
        interfaceC1327AhE.A9J(A01(c1423Ais, c16b, f3, i, j), fA00, fA01, fA00 + AnonymousClass001.A00(j3), fA01 + AnonymousClass001.A01(j3, 4294967295L), f, f2, z);
    }

    @Override // X.AT3
    public final void A9M(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, float f2, int i, long j) {
        this.A02.A01.A9L(A00(c1eq, c1423Ais, c16b, f2, i, 1), f, j);
    }

    @Override // X.AT3
    public final void A9N(C1423Ais c1423Ais, C16b c16b, float f, float f2, int i, long j, long j2) {
        this.A02.A01.A9L(A01(c1423Ais, c16b, f2, i, j), f, j2);
    }

    @Override // X.AT3
    public final void A9Q(C1423Ais c1423Ais, InterfaceC2178B0w interfaceC2178B0w, C16b c16b, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A02.A01.A9T(interfaceC2178B0w, A00(null, c1423Ais, c16b, f, i, i2), j, j2, j3, j4);
    }

    @Override // X.AT3
    public final void A9S(C1423Ais c1423Ais, InterfaceC2178B0w interfaceC2178B0w, C16b c16b, float f, int i, long j) {
        this.A02.A01.A9R(interfaceC2178B0w, A00(null, c1423Ais, c16b, f, i, 1), j);
    }

    @Override // X.AT3
    public final void A9c(C1EQ c1eq, C1423Ais c1423Ais, InterfaceC1068ATy interfaceC1068ATy, C16b c16b, float f, int i) {
        this.A02.A01.A9b(A00(c1eq, c1423Ais, c16b, f, i, 1), interfaceC1068ATy);
    }

    @Override // X.AT3
    public final void A9d(C1423Ais c1423Ais, InterfaceC1068ATy interfaceC1068ATy, C16b c16b, float f, int i, long j) {
        this.A02.A01.A9b(A01(c1423Ais, c16b, f, i, j), interfaceC1068ATy);
    }

    @Override // X.AT3
    public final /* synthetic */ void AZj(GraphicsLayer graphicsLayer, G0U g0u, long j) {
        graphicsLayer.A0C(this, this.A02.A03, new C2334BUi(13, g0u, this), j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / AEm();
    }

    private final InterfaceC1330AhH A02(C16b c16b) {
        if (C7384Etj.areEqual(c16b, C16a.A00)) {
            InterfaceC1330AhH interfaceC1330AhH = this.A00;
            if (interfaceC1330AhH != null) {
                return interfaceC1330AhH;
            }
            C1776AqX c1776AqX = new C1776AqX();
            c1776AqX.A01.setStyle(Paint.Style.FILL);
            this.A00 = c1776AqX;
            return c1776AqX;
        }
        if (!(c16b instanceof AaJ)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC1330AhH interfaceC1330AhH2 = this.A01;
        InterfaceC1330AhH interfaceC1330AhH3 = interfaceC1330AhH2;
        if (interfaceC1330AhH2 == null) {
            C1776AqX c1776AqX2 = new C1776AqX();
            c1776AqX2.A01.setStyle(Paint.Style.STROKE);
            this.A01 = c1776AqX2;
            interfaceC1330AhH3 = c1776AqX2;
        }
        C1776AqX c1776AqX3 = (C1776AqX) interfaceC1330AhH3;
        float strokeWidth = c1776AqX3.A01.getStrokeWidth();
        AaJ aaJ = (AaJ) c16b;
        float f = aaJ.A01;
        if (strokeWidth != f) {
            c1776AqX3.A01.setStrokeWidth(f);
        }
        int iALB = interfaceC1330AhH3.ALB();
        int i = aaJ.A02;
        if (iALB != i) {
            interfaceC1330AhH3.Aen(i);
        }
        float strokeMiter = c1776AqX3.A01.getStrokeMiter();
        float f2 = aaJ.A00;
        if (strokeMiter != f2) {
            c1776AqX3.A01.setStrokeMiter(f2);
        }
        int iALC = interfaceC1330AhH3.ALC();
        int i2 = aaJ.A03;
        if (iALC != i2) {
            interfaceC1330AhH3.Aeo(i2);
        }
        C0zF c0zF = c1776AqX3.A04;
        C0zF c0zF2 = aaJ.A04;
        if (C7384Etj.areEqual(c0zF, c0zF2)) {
            return interfaceC1330AhH3;
        }
        interfaceC1330AhH3.Adz(c0zF2);
        return interfaceC1330AhH3;
    }

    @Override // X.AT3
    public final void A9W(C1EQ c1eq, C1423Ais c1423Ais, C0zF c0zF, float f, float f2, int i, int i2, long j, long j2) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        InterfaceC1330AhH interfaceC1330AhH = this.A01;
        InterfaceC1330AhH interfaceC1330AhH2 = interfaceC1330AhH;
        if (interfaceC1330AhH == null) {
            C1776AqX c1776AqX = new C1776AqX();
            c1776AqX.A01.setStyle(Paint.Style.STROKE);
            this.A01 = c1776AqX;
            interfaceC1330AhH2 = c1776AqX;
        }
        if (c1eq != null) {
            c1eq.A07(interfaceC1330AhH2, f2, AKb());
        } else if (((C1776AqX) interfaceC1330AhH2).A01.getAlpha() / 255.0f != f2) {
            interfaceC1330AhH2.Acj(f2);
        }
        C1776AqX c1776AqX2 = (C1776AqX) interfaceC1330AhH2;
        if (!C7384Etj.areEqual(c1776AqX2.A03, c1423Ais)) {
            interfaceC1330AhH2.Ad6(c1423Ais);
        }
        if (c1776AqX2.A00 != i2) {
            interfaceC1330AhH2.Acu(i2);
        }
        if (c1776AqX2.A01.getStrokeWidth() != f) {
            c1776AqX2.A01.setStrokeWidth(f);
        }
        if (c1776AqX2.A01.getStrokeMiter() != 4.0f) {
            c1776AqX2.A01.setStrokeMiter(4.0f);
        }
        if (interfaceC1330AhH2.ALB() != i) {
            interfaceC1330AhH2.Aen(i);
        }
        if (interfaceC1330AhH2.ALC() != 0) {
            interfaceC1330AhH2.Aeo(0);
        }
        if (!C7384Etj.areEqual(c1776AqX2.A04, c0zF)) {
            interfaceC1330AhH2.Adz(c0zF);
        }
        if (!c1776AqX2.A01.isFilterBitmap()) {
            c1776AqX2.A01.setFilterBitmap(true);
        }
        interfaceC1327AhE.A9Y(interfaceC1330AhH2, j, j2);
    }

    @Override // X.AT3
    public final void A9X(C1423Ais c1423Ais, C0zF c0zF, float f, float f2, int i, int i2, long j, long j2, long j3) {
        long jA04 = j;
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        InterfaceC1330AhH interfaceC1330AhH = this.A01;
        InterfaceC1330AhH interfaceC1330AhH2 = interfaceC1330AhH;
        if (interfaceC1330AhH == null) {
            C1776AqX c1776AqX = new C1776AqX();
            c1776AqX.A01.setStyle(Paint.Style.STROKE);
            this.A01 = c1776AqX;
            interfaceC1330AhH2 = c1776AqX;
        }
        if (f2 != 1.0f) {
            jA04 = HxS.A04(HDi.A0O[(int) (jA04 & 63)], B6A.A03(jA04), B6A.A02(jA04), B6A.A01(jA04), B6A.A00(jA04) * f2);
        }
        C1776AqX c1776AqX2 = (C1776AqX) interfaceC1330AhH2;
        if (C8j3.A0U(c1776AqX2.A01.getColor()) != jA04) {
            interfaceC1330AhH2.Ad4(jA04);
        }
        if (c1776AqX2.A02 != null) {
            c1776AqX2.A02 = null;
            c1776AqX2.A01.setShader(null);
        }
        if (!C7384Etj.areEqual(c1776AqX2.A03, c1423Ais)) {
            interfaceC1330AhH2.Ad6(c1423Ais);
        }
        if (c1776AqX2.A00 != i2) {
            interfaceC1330AhH2.Acu(i2);
        }
        if (c1776AqX2.A01.getStrokeWidth() != f) {
            c1776AqX2.A01.setStrokeWidth(f);
        }
        if (c1776AqX2.A01.getStrokeMiter() != 4.0f) {
            c1776AqX2.A01.setStrokeMiter(4.0f);
        }
        if (interfaceC1330AhH2.ALB() != i) {
            interfaceC1330AhH2.Aen(i);
        }
        if (interfaceC1330AhH2.ALC() != 0) {
            interfaceC1330AhH2.Aeo(0);
        }
        if (!C7384Etj.areEqual(c1776AqX2.A04, c0zF)) {
            interfaceC1330AhH2.Adz(c0zF);
        }
        if (!c1776AqX2.A01.isFilterBitmap()) {
            c1776AqX2.A01.setFilterBitmap(true);
        }
        interfaceC1327AhE.A9Y(interfaceC1330AhH2, j2, j3);
    }

    @Override // X.AT3
    public final void A9a(C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        float fA00 = AnonymousClass001.A00(j2);
        float fA01 = AnonymousClass001.A01(j2, 4294967295L);
        interfaceC1327AhE.A9Z(A01(c1423Ais, c16b, f, i, j), fA00, fA01, fA00 + AnonymousClass001.A00(j3), fA01 + AnonymousClass001.A01(j3, 4294967295L));
    }

    @Override // X.AT3
    public final void A9f(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        float fA00 = AnonymousClass001.A00(j);
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        interfaceC1327AhE.A9e(A00(c1eq, c1423Ais, c16b, f, i, 1), fA00, fA01, fA00 + AnonymousClass001.A00(j2), fA01 + AnonymousClass001.A01(j2, 4294967295L));
    }

    @Override // X.AT3
    public final void A9g(C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        interfaceC1327AhE.A9e(A01(c1423Ais, c16b, f, i, j), fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat + Float.intBitsToFloat((int) (j3 >> 32)), fIntBitsToFloat2 + Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    @Override // X.AT3
    public final void A9i(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        float fA00 = AnonymousClass001.A00(j);
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        interfaceC1327AhE.A9h(A00(c1eq, c1423Ais, c16b, f, i, 1), fA00, fA01, fA00 + AnonymousClass001.A00(j2), fA01 + AnonymousClass001.A01(j2, 4294967295L), AnonymousClass001.A00(j3), AnonymousClass001.A01(j3, 4294967295L));
    }

    @Override // X.AT3
    public final void A9j(C1423Ais c1423Ais, C16b c16b, float f, int i, long j, long j2, long j3, long j4) {
        InterfaceC1327AhE interfaceC1327AhE = this.A02.A01;
        float fA00 = AnonymousClass001.A00(j2);
        float fA01 = AnonymousClass001.A01(j2, 4294967295L);
        interfaceC1327AhE.A9h(A01(c1423Ais, c16b, f, i, j), fA00, fA01, fA00 + AnonymousClass001.A00(j3), fA01 + AnonymousClass001.A01(j3, 4294967295L), AnonymousClass001.A00(j4), AnonymousClass001.A01(j4, 4294967295L));
    }

    @Override // X.AT3
    public final /* synthetic */ long ADU() {
        return C1Wv.A01(((AaI) this.A03).A02.A02.A00);
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A02.A02.AEm();
    }

    @Override // X.AT3
    public final InterfaceC1279AgP AEq() {
        return this.A03;
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A02.A02.AFo();
    }

    @Override // X.AT3
    public final /* synthetic */ long AKb() {
        return ((AaI) this.A03).A02.A02.A00;
    }

    @Override // X.AT3
    public final EnumC1820Arj getLayoutDirection() {
        return this.A02.A03;
    }

    public C1325AhC() {
        AXN axn = AbstractC1331AhI.A00;
        EnumC1820Arj enumC1820Arj = EnumC1820Arj.A02;
        ATC atc = ATC.A00;
        AW9 aw9 = new AW9();
        aw9.A02 = axn;
        aw9.A03 = enumC1820Arj;
        aw9.A01 = atc;
        aw9.A00 = 0L;
        this.A02 = aw9;
        this.A03 = new AaI(this);
    }

    private final InterfaceC1330AhH A00(C1EQ c1eq, C1423Ais c1423Ais, C16b c16b, float f, int i, int i2) {
        InterfaceC1330AhH interfaceC1330AhHA02 = A02(c16b);
        if (c1eq != null) {
            c1eq.A07(interfaceC1330AhHA02, f, AKb());
        } else {
            C1776AqX c1776AqX = (C1776AqX) interfaceC1330AhHA02;
            if (c1776AqX.A02 != null) {
                c1776AqX.A02 = null;
                c1776AqX.A01.setShader(null);
            }
            long color = c1776AqX.A01.getColor() << 32;
            long j = B6A.A01;
            if (color != j) {
                interfaceC1330AhHA02.Ad4(j);
            }
            if (c1776AqX.A01.getAlpha() / 255.0f != f) {
                interfaceC1330AhHA02.Acj(f);
            }
        }
        C1776AqX c1776AqX2 = (C1776AqX) interfaceC1330AhHA02;
        if (!C7384Etj.areEqual(c1776AqX2.A03, c1423Ais)) {
            interfaceC1330AhHA02.Ad6(c1423Ais);
        }
        if (c1776AqX2.A00 != i) {
            interfaceC1330AhHA02.Acu(i);
        }
        if (C8j3.A1S(c1776AqX2.A01.isFilterBitmap() ? 1 : 0) != i2) {
            c1776AqX2.A01.setFilterBitmap(!AnonymousClass002.A1Q(i2, 0));
        }
        return interfaceC1330AhHA02;
    }

    private final InterfaceC1330AhH A01(C1423Ais c1423Ais, C16b c16b, float f, int i, long j) {
        InterfaceC1330AhH interfaceC1330AhHA02 = A02(c16b);
        if (f != 1.0f) {
            j = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * f);
        }
        C1776AqX c1776AqX = (C1776AqX) interfaceC1330AhHA02;
        long color = c1776AqX.A01.getColor() << 32;
        long j2 = B6A.A01;
        if (color != j) {
            interfaceC1330AhHA02.Ad4(j);
        }
        if (c1776AqX.A02 != null) {
            c1776AqX.A02 = null;
            c1776AqX.A01.setShader(null);
        }
        if (!C7384Etj.areEqual(c1776AqX.A03, c1423Ais)) {
            interfaceC1330AhHA02.Ad6(c1423Ais);
        }
        if (c1776AqX.A00 != i) {
            interfaceC1330AhHA02.Acu(i);
        }
        if (!c1776AqX.A01.isFilterBitmap()) {
            c1776AqX.A01.setFilterBitmap(true);
        }
        return interfaceC1330AhHA02;
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
