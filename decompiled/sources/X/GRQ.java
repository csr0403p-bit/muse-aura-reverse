package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [State] */
/* loaded from: classes6.dex */
public final class GRQ<State> implements GRU<State> {
    public G0U<Object, ? extends Object> A00;
    public final InterfaceC7353EnQ<State> A01;
    public final InterfaceC7353EnQ<Unit> A02;
    public final InterfaceC7353EnQ<Function0<Unit>> A03;

    @Override // X.GRU
    public final void AdI(G0U<Object, ? extends Object> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.A00 = g0u;
    }

    @Override // X.GRU
    public final G0U<Object, Object> AEo() {
        return this.A00;
    }

    @Override // X.GRU
    public final /* bridge */ /* synthetic */ Function0 AFy() {
        return (Function0) this.A01;
    }

    @Override // X.GRU
    public final /* bridge */ /* synthetic */ G0U AJZ() {
        return (G0U) this.A02;
    }

    @Override // X.GRU
    public final /* bridge */ /* synthetic */ G0U ALD() {
        return (G0U) this.A03;
    }

    public GRQ(F1F f1f, C10543Hqv<State> c10543Hqv, C10543Hqv<G0V<State, Object, State>> c10543Hqv2, C10543Hqv<List<Function0<Unit>>> c10543Hqv3, C10543Hqv<List<Function0<Unit>>> c10543Hqv4) {
        this.A01 = new HjU(f1f, c10543Hqv);
        this.A00 = new GRS(f1f, c10543Hqv, c10543Hqv2, c10543Hqv3, c10543Hqv4);
        this.A03 = new Hre(f1f, c10543Hqv3, c10543Hqv4);
        this.A02 = new GRR(f1f, c10543Hqv2, c10543Hqv, c10543Hqv3, c10543Hqv4);
    }
}
