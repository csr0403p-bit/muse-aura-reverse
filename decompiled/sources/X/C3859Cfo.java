package X;

import java.util.concurrent.Executor;

/* renamed from: X.Cfo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3859Cfo implements F18 {
    public final F18<InterfaceC3902Cgg> A00;
    public final F18<InterfaceC3891CgU> A01;
    public final F18<Executor> A02;
    public final F18<InterfaceC3922Ch3> A03;
    public final F18<InterfaceC3899Cgd> A04;

    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ Object AMN() {
        return new C3857Cfm(this.A00.AMN(), this.A04.AMN(), this.A01.AMN(), this.A03.AMN(), this.A02.AMN());
    }

    public C3859Cfo(F18<Executor> f18, F18<InterfaceC3902Cgg> f182, F18<InterfaceC3899Cgd> f183, F18<InterfaceC3891CgU> f184, F18<InterfaceC3922Ch3> f185) {
        this.A02 = f18;
        this.A00 = f182;
        this.A04 = f183;
        this.A01 = f184;
        this.A03 = f185;
    }
}
