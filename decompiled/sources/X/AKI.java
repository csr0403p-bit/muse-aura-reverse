package X;

/* loaded from: classes4.dex */
public final class AKI<T> implements AKP<T> {
    public final G0U<AKR, T> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AKI) && this.A00.equals(((AKI) obj).A00));
    }

    @Override // X.AKP
    public final T AZc(AKQ akq) {
        return this.A00.invoke(akq);
    }

    @Override // X.AKP
    public final AKJ<T> Ah2(AKN<T> akn) {
        return new AKJ<>(akn, null, null, null, this.A00, false, false);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("ComputedValueHolder(compute="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AKI(G0U<? super AKR, ? extends T> g0u) {
        this.A00 = g0u;
    }
}
