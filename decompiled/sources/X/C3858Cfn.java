package X;

/* renamed from: X.Cfn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3858Cfn implements F18 {
    public final F18<InterfaceC3770CeD> A00;
    public final F18<Cg9> A01;
    public final F18<String> A02;
    public final F18<EJG> A03;
    public final F18<InterfaceC3770CeD> A04;

    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ Object AMN() {
        InterfaceC3770CeD interfaceC3770CeDAMN = this.A04.AMN();
        InterfaceC3770CeD interfaceC3770CeDAMN2 = this.A00.AMN();
        Cg9 cg9AMN = this.A01.AMN();
        EJG ejgAMN = this.A03.AMN();
        F18 f18 = this.A02;
        C3849Cfe c3849Cfe = new C3849Cfe();
        c3849Cfe.A00 = C3849Cfe.A02;
        c3849Cfe.A01 = f18;
        return new C3842CfV(c3849Cfe, cg9AMN, ejgAMN, interfaceC3770CeDAMN, interfaceC3770CeDAMN2);
    }

    public C3858Cfn(F18<InterfaceC3770CeD> f18, F18<InterfaceC3770CeD> f182, F18<Cg9> f183, F18<EJG> f184, F18<String> f185) {
        this.A04 = f18;
        this.A00 = f182;
        this.A01 = f183;
        this.A03 = f184;
        this.A02 = f185;
    }
}
