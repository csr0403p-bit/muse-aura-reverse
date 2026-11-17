package X;

/* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
/* renamed from: X.AFu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0872AFu<Original, Saveable> implements AFs<Original, Saveable> {
    public final /* synthetic */ G0U<Saveable, Original> A00;
    public final /* synthetic */ G0V<C1bi, Original, Saveable> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C0872AFu(G0V<? super C1bi, ? super Original, ? extends Saveable> g0v, G0U<? super Saveable, ? extends Original> g0u) {
        this.A01 = g0v;
        this.A00 = g0u;
    }

    public static C0872AFu A00(G0V g0v, int i) {
        return new C0872AFu(g0v, new C2276BSc(i));
    }

    public static C0872AFu A01(G0V g0v, int i) {
        return new C0872AFu(g0v, new C2279BSf(i));
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
