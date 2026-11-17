package X;

import java.util.concurrent.Executor;

/* renamed from: X.Cg0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3871Cg0 implements F18 {
    public final F18<Executor> A00;
    public final F18<InterfaceC3922Ch3> A01;
    public final F18<InterfaceC3899Cgd> A02;
    public final F18<InterfaceC3891CgU> A03;

    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ Object AMN() {
        Executor executorAMN = this.A00.AMN();
        return new C3881CgI(this.A02.AMN(), this.A03.AMN(), this.A01.AMN(), executorAMN);
    }

    public C3871Cg0(F18<Executor> f18, F18<InterfaceC3891CgU> f182, F18<InterfaceC3899Cgd> f183, F18<InterfaceC3922Ch3> f184) {
        this.A00 = f18;
        this.A03 = f182;
        this.A02 = f183;
        this.A01 = f184;
    }
}
