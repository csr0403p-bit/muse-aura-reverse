package X;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: X.Cfm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3857Cfm implements InterfaceC3924Ch5 {
    public static final Logger A05 = BV5.A1B(C3847Cfc.class);
    public final InterfaceC3902Cgg A00;
    public final InterfaceC3899Cgd A01;
    public final InterfaceC3891CgU A02;
    public final InterfaceC3922Ch3 A03;
    public final Executor A04;

    public C3857Cfm(InterfaceC3902Cgg interfaceC3902Cgg, InterfaceC3899Cgd interfaceC3899Cgd, InterfaceC3891CgU interfaceC3891CgU, InterfaceC3922Ch3 interfaceC3922Ch3, Executor executor) {
        this.A04 = executor;
        this.A00 = interfaceC3902Cgg;
        this.A01 = interfaceC3899Cgd;
        this.A02 = interfaceC3891CgU;
        this.A03 = interfaceC3922Ch3;
    }
}
