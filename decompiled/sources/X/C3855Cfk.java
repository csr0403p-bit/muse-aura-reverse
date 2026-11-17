package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.Cfk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3855Cfk implements F18 {
    public final F18<InterfaceC3902Cgg> A00;
    public final F18<InterfaceC3897Cgb> A01;
    public final F18<InterfaceC3770CeD> A02;
    public final F18<Context> A03;
    public final F18<InterfaceC3891CgU> A04;
    public final F18<Executor> A05;
    public final F18<InterfaceC3922Ch3> A06;
    public final F18<InterfaceC3770CeD> A07;
    public final F18<InterfaceC3899Cgd> A08;

    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ Object AMN() {
        Context contextAMN = this.A03.AMN();
        InterfaceC3902Cgg interfaceC3902CggAMN = this.A00.AMN();
        InterfaceC3891CgU interfaceC3891CgUAMN = this.A04.AMN();
        InterfaceC3899Cgd interfaceC3899CgdAMN = this.A08.AMN();
        Executor executorAMN = this.A05.AMN();
        return new C3856Cfl(contextAMN, interfaceC3902CggAMN, interfaceC3899CgdAMN, this.A01.AMN(), interfaceC3891CgUAMN, this.A06.AMN(), this.A02.AMN(), this.A07.AMN(), executorAMN);
    }

    public C3855Cfk(F18<Context> f18, F18<InterfaceC3902Cgg> f182, F18<InterfaceC3891CgU> f183, F18<InterfaceC3899Cgd> f184, F18<Executor> f185, F18<InterfaceC3922Ch3> f186, F18<InterfaceC3770CeD> f187, F18<InterfaceC3770CeD> f188, F18<InterfaceC3897Cgb> f189) {
        this.A03 = f18;
        this.A00 = f182;
        this.A04 = f183;
        this.A08 = f184;
        this.A05 = f185;
        this.A06 = f186;
        this.A02 = f187;
        this.A07 = f188;
        this.A01 = f189;
    }
}
