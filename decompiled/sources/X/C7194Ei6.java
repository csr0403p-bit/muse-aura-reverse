package X;

import java.util.Map;

/* renamed from: X.Ei6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7194Ei6 implements InterfaceC7027EeY, InterfaceC7251EjV {
    public final InterfaceC7027EeY A00;
    public final InterfaceC7208EiR A01;
    public final InterfaceC7251EjV A02;
    public final InterfaceC7250EjU A03;

    @Override // X.InterfaceC7027EeY
    public final void AUy(InterfaceC7029Eea interfaceC7029Eea, String str, String str2) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A01.AUz(((C7185Ehv) interfaceC7029Eea).A09, str, str2);
        this.A00.AUy(interfaceC7029Eea, str, str2);
    }

    @Override // X.InterfaceC7027EeY
    public final void AV0(InterfaceC7029Eea interfaceC7029Eea, String str, Map<String, String> map) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A01.AV1(((C7185Ehv) interfaceC7029Eea).A09, str, map);
        this.A00.AV0(interfaceC7029Eea, str, map);
    }

    @Override // X.InterfaceC7027EeY
    public final void AV2(InterfaceC7029Eea interfaceC7029Eea, String str, Throwable th, Map<String, String> map) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A01.AV3(((C7185Ehv) interfaceC7029Eea).A09, str, th, map);
        this.A00.AV2(interfaceC7029Eea, str, th, map);
    }

    @Override // X.InterfaceC7027EeY
    public final void AV4(InterfaceC7029Eea interfaceC7029Eea, String str, Map<String, String> map) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A01.AV5(((C7185Ehv) interfaceC7029Eea).A09, str, map);
        this.A00.AV4(interfaceC7029Eea, str, map);
    }

    @Override // X.InterfaceC7027EeY
    public final void AV6(InterfaceC7029Eea interfaceC7029Eea, String str) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A01.AV7(((C7185Ehv) interfaceC7029Eea).A09, str);
        this.A00.AV6(interfaceC7029Eea, str);
    }

    @Override // X.InterfaceC7251EjV
    public final void AVM(InterfaceC7029Eea interfaceC7029Eea) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A03.AVN(((C7185Ehv) interfaceC7029Eea).A09);
        this.A02.AVM(interfaceC7029Eea);
    }

    @Override // X.InterfaceC7251EjV
    public final void AVO(InterfaceC7029Eea interfaceC7029Eea, Throwable th) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        this.A03.AVP(c7185Ehv.A07, c7185Ehv.A09, th, interfaceC7029Eea.AOu());
        this.A02.AVO(interfaceC7029Eea, th);
    }

    @Override // X.InterfaceC7251EjV
    public final void AVS(InterfaceC7029Eea interfaceC7029Eea) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        this.A03.AVT(c7185Ehv.A07, c7185Ehv.A09, interfaceC7029Eea.AOu());
        this.A02.AVS(interfaceC7029Eea);
    }

    @Override // X.InterfaceC7027EeY
    public final void AWt(InterfaceC7029Eea interfaceC7029Eea, String str, boolean z) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        this.A01.AWu(((C7185Ehv) interfaceC7029Eea).A09, str, z);
        this.A00.AWt(interfaceC7029Eea, str, z);
    }

    @Override // X.InterfaceC7027EeY
    public final boolean AbE(InterfaceC7029Eea interfaceC7029Eea, String str) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        Boolean boolValueOf = Boolean.valueOf(this.A01.AbF(((C7185Ehv) interfaceC7029Eea).A09));
        if (!AnonymousClass002.A1b(boolValueOf, true)) {
            boolValueOf = Boolean.valueOf(this.A00.AbE(interfaceC7029Eea, str));
        }
        return boolValueOf.booleanValue();
    }

    @Override // X.InterfaceC7251EjV
    public final void AVQ(InterfaceC7029Eea interfaceC7029Eea) {
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        this.A03.AVR(c7185Ehv.A07, c7185Ehv.A08, c7185Ehv.A09, interfaceC7029Eea.AOu());
        this.A02.AVQ(interfaceC7029Eea);
    }

    public C7194Ei6(InterfaceC7251EjV interfaceC7251EjV, InterfaceC7250EjU interfaceC7250EjU) {
        this.A01 = interfaceC7250EjU;
        this.A00 = interfaceC7251EjV;
        this.A03 = interfaceC7250EjU;
        this.A02 = interfaceC7251EjV;
    }
}
