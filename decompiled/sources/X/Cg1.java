package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class Cg1 implements F18 {
    public final F18<InterfaceC3770CeD> A00;
    public final F18<AbstractC3769CeC> A01;
    public final F18<Context> A02;
    public final F18<InterfaceC3891CgU> A03;

    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ Object AMN() {
        Context contextAMN = this.A02.AMN();
        InterfaceC3891CgU interfaceC3891CgUAMN = this.A03.AMN();
        AbstractC3769CeC abstractC3769CeCAMN = this.A01.AMN();
        this.A00.AMN();
        return new C3843CfW(contextAMN, abstractC3769CeCAMN, interfaceC3891CgUAMN);
    }

    public Cg1(F18<Context> f18, F18<InterfaceC3891CgU> f182, F18<AbstractC3769CeC> f183, F18<InterfaceC3770CeD> f184) {
        this.A02 = f18;
        this.A03 = f182;
        this.A01 = f183;
        this.A00 = f184;
    }
}
