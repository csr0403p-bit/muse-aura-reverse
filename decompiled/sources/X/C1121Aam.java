package X;

import X.AOd;

/* renamed from: X.Aam, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1121Aam<V extends AOd> implements InterfaceC1044ASn<V> {
    public final int A00;
    public final int A01;
    public final C28s A02;
    public final C1122Aan<V> A03;

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ AOd getEndVelocity(AOd aOd, AOd aOd2, AOd aOd3) {
        return getVelocityFromNanos(getDurationNanos(aOd, aOd2, aOd3), aOd, aOd2, aOd3);
    }

    @Override // X.InterfaceC1044ASn
    public final int AEl() {
        return this.A00;
    }

    @Override // X.InterfaceC1044ASn
    public final int AEr() {
        return this.A01;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ long getDurationNanos(AOd aOd, AOd aOd2, AOd aOd3) {
        return (this.A00 + this.A01) * 1000000;
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        return (V) this.A03.getValueFromNanos(j, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return (V) this.A03.getVelocityFromNanos(j, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ boolean isInfinite() {
        return false;
    }

    public C1121Aam(C28s c28s, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c28s;
        this.A03 = new C1122Aan<>(new Aax(new Aap(c28s, i, i2)));
    }

    public C1121Aam() {
        this(C2HU.A01, 300, 0);
    }
}
