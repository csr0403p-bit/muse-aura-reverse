package X;

import X.InterfaceC9011Fwo;
import java.time.temporal.Temporal;

/* loaded from: classes6.dex */
public final class Fx1<T extends InterfaceC9011Fwo, U extends Temporal> implements InterfaceC9032FxD<T, C8990FwS> {
    public final InterfaceC9026Fx4<T> A00;
    public final Fx6<U> A01;

    @Override // X.InterfaceC9032FxD
    public final void ABO(T t) {
        C7384Etj.A0Y(t, 0);
        if (C9019Fww.A00.A03(this.A01, t)) {
            this.A00.AYb(t);
        }
    }

    @Override // X.InterfaceC9032FxD
    public final /* bridge */ /* synthetic */ C8990FwS AJm() {
        return this.A00.AJ8();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Fx6<TU;>;LX/Fx4<TT;>;)V */
    public Fx1(InterfaceC9026Fx4 interfaceC9026Fx4, Fx6 fx6) {
        this.A01 = fx6;
        this.A00 = interfaceC9026Fx4;
    }
}
