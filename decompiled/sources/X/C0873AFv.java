package X;

/* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
/* renamed from: X.AFv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0873AFv<Original, Saveable> implements AFt<Original, Saveable> {
    public final /* synthetic */ G0U<Saveable, Original> A00;
    public final /* synthetic */ G0V<C1bi, Original, Saveable> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C0873AFv(G0V<? super C1bi, ? super Original, ? extends Saveable> g0v, G0U<? super Saveable, ? extends Original> g0u) {
        this.A01 = g0v;
        this.A00 = g0u;
    }

    @Override // X.AFs
    public final Original Abb(Saveable saveable) {
        return this.A00.invoke(saveable);
    }

    @Override // X.AFs
    public final Saveable Ac1(C1bi c1bi, Original original) {
        return this.A01.invoke(c1bi, original);
    }
}
