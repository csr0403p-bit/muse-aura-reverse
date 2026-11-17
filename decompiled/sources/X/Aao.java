package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class Aao<V extends AOd> implements AOX<V> {
    public final /* synthetic */ C1122Aan<V> A00;

    /* JADX WARN: Incorrect types in method signature: (FFTV;)V */
    public Aao(AOd aOd, float f, float f2) {
        Aaq aaq = Aas.A00;
        this.A00 = new C1122Aan<>(aOd != null ? new C1123Aat(aOd, f, f2) : new C1125Aaw(f, f2));
    }

    @Override // X.InterfaceC0999AOh
    public final long getDurationNanos(V v, V v2, V v3) {
        return this.A00.getDurationNanos(v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getEndVelocity(V v, V v2, V v3) {
        return (V) this.A00.getEndVelocity(v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        return (V) this.A00.getValueFromNanos(j, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return (V) this.A00.getVelocityFromNanos(j, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final boolean isInfinite() {
        return false;
    }
}
