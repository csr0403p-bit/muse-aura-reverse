package X;

import kotlin.Unit;

/* renamed from: X.Ain, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1418Ain extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1476Ajj {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public C1DM A0B;
    public G0U<? super C2av, Unit> A0C;
    public boolean A0D;

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        if (this.A0D) {
            interfaceC0857A6e.Aca(AbstractC1671Anw.A0Y, this.A0B);
        }
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final boolean AOU() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SimpleGraphicsLayerModifier(scaleX=");
        sbA0x.append(this.A03);
        sbA0x.append(", scaleY=");
        sbA0x.append(this.A04);
        sbA0x.append(", alpha = ");
        sbA0x.append(this.A00);
        sbA0x.append(", translationX=");
        sbA0x.append(0.0f);
        sbA0x.append(", translationY=");
        sbA0x.append(0.0f);
        sbA0x.append(", shadowElevation=");
        sbA0x.append(this.A05);
        sbA0x.append(", rotationX=");
        sbA0x.append(0.0f);
        sbA0x.append(", rotationY=");
        sbA0x.append(0.0f);
        sbA0x.append(", rotationZ=");
        sbA0x.append(this.A02);
        sbA0x.append(", cameraDistance=");
        sbA0x.append(this.A01);
        sbA0x.append(", transformOrigin=");
        long j = this.A0A;
        long j2 = C15k.A01;
        StringBuilder sb = new StringBuilder("TransformOrigin(packedValue=");
        sb.append(j);
        sbA0x.append((Object) AnonymousClass006.A0z(sb));
        sbA0x.append(", shape=");
        sbA0x.append(this.A0B);
        sbA0x.append(", clip=");
        sbA0x.append(this.A0D);
        C8j4.A1R(sbA0x, ", renderEffect=");
        sbA0x.append(", ambientShadowColor=");
        AnonymousClass005.A0m(this.A08, sbA0x);
        sbA0x.append(", spotShadowColor=");
        AnonymousClass005.A0m(this.A09, sbA0x);
        sbA0x.append(", compositingStrategy=");
        sbA0x.append((Object) FGI.A0G("CompositingStrategy(value=", ')', this.A07));
        sbA0x.append(", blendMode=");
        sbA0x.append((Object) C1422Air.A00(this.A06));
        C8j4.A1R(sbA0x, ", colorFilter=");
        return C8j3.A16(sbA0x, ')');
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(j);
        int i = azeAQW.A01;
        int i2 = azeAQW.A00;
        return axy.APV(C9jH.A00, new C2334BUi(12, azeAQW, this), i, i2);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
