package X;

/* loaded from: classes4.dex */
public final class AKG<T> implements AKP<T> {
    public final T A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AKG) && C7384Etj.areEqual(this.A00, ((AKG) obj).A00));
    }

    @Override // X.AKP
    public final AKJ<T> Ah2(AKN<T> akn) {
        T t = this.A00;
        return new AKJ<>(akn, null, null, t, null, t == null, false);
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("StaticValueHolder(value="));
    }

    public AKG(T t) {
        this.A00 = t;
    }

    @Override // X.AKP
    public final T AZc(AKQ akq) {
        return this.A00;
    }
}
