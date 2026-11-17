package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AvO extends Ab8<AvP> {
    public final EnumC1108AYu A00;
    public final InterfaceC2046AxI A01;
    public final Function0<InterfaceC1129Abd> A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvO) {
                AvO avO = (AvO) obj;
                if (this.A02 != avO.A02 || !C7384Etj.areEqual(this.A01, avO.A01) || this.A00 != avO.A00 || this.A04 != avO.A04 || this.A03 != avO.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Function0<InterfaceC1129Abd> function0 = this.A02;
        return new AvP(this.A00, this.A01, function0, this.A04, this.A03);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02))), this.A04), this.A03);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AvP avP = (AvP) abstractC1439Aj8;
        Function0<InterfaceC1129Abd> function0 = this.A02;
        InterfaceC2046AxI interfaceC2046AxI = this.A01;
        EnumC1108AYu enumC1108AYu = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A03;
        avP.A02 = function0;
        avP.A01 = interfaceC2046AxI;
        if (avP.A00 != enumC1108AYu) {
            avP.A00 = enumC1108AYu;
            AaW.A00(avP);
        }
        if (avP.A04 == z && avP.A03 == z2) {
            return;
        }
        avP.A04 = z;
        avP.A03 = z2;
        AvP.A00(avP);
        AaW.A00(avP);
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+LX/Abd;>;LX/AxI;LX/AYu;ZZ)V */
    public AvO(EnumC1108AYu enumC1108AYu, InterfaceC2046AxI interfaceC2046AxI, Function0 function0, boolean z, boolean z2) {
        this.A02 = function0;
        this.A01 = interfaceC2046AxI;
        this.A00 = enumC1108AYu;
        this.A04 = z;
        this.A03 = z2;
    }
}
