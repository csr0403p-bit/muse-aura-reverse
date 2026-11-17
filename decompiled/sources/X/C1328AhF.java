package X;

/* renamed from: X.AhF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1328AhF implements AT2 {
    public final /* synthetic */ InterfaceC1279AgP A00;

    public C1328AhF(InterfaceC1279AgP interfaceC1279AgP) {
        this.A00 = interfaceC1279AgP;
    }

    @Override // X.AT2
    public final void A6M(InterfaceC1068ATy interfaceC1068ATy, int i) {
        ((AaI) this.A00).A02.A02.A01.A6M(interfaceC1068ATy, i);
    }

    @Override // X.AT2
    public final void A6N(float f, float f2, float f3, float f4, int i) {
        ((AaI) this.A00).A02.A02.A01.A6N(f, f2, f3, f4, i);
    }

    @Override // X.AT2
    public final void ANn(float f, float f2, float f3, float f4) {
        InterfaceC1279AgP interfaceC1279AgP = this.A00;
        AW9 aw9 = ((AaI) interfaceC1279AgP).A02.A02;
        InterfaceC1327AhE interfaceC1327AhE = aw9.A01;
        long j = aw9.A00;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - (f3 + f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - (f4 + f2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        interfaceC1279AgP.Aeh(jFloatToRawIntBits);
        interfaceC1327AhE.AhL(f, f2);
    }

    @Override // X.AT2
    public final void Abq(float f, long j) {
        InterfaceC1327AhE interfaceC1327AhE = ((AaI) this.A00).A02.A02.A01;
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        interfaceC1327AhE.AhL(fA03, fA00);
        interfaceC1327AhE.Abp(f);
        interfaceC1327AhE.AhL(-fA03, -fA00);
    }

    @Override // X.AT2
    public final void Ac6(float f, float f2, long j) {
        InterfaceC1327AhE interfaceC1327AhE = ((AaI) this.A00).A02.A02.A01;
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        interfaceC1327AhE.AhL(fA03, fA00);
        interfaceC1327AhE.Ac5(f, f2);
        interfaceC1327AhE.AhL(-fA03, -fA00);
    }

    @Override // X.AT2
    public final void AhL(float f, float f2) {
        ((AaI) this.A00).A02.A02.A01.AhL(f, f2);
    }
}
