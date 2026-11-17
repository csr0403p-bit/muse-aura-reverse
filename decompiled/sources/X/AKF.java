package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AKF<T> implements AKP<T> {
    public final MutableState<T> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AKF) && this.A00.equals(((AKF) obj).A00));
    }

    @Override // X.AKP
    public final T AZc(AKQ akq) {
        return this.A00.getValue();
    }

    @Override // X.AKP
    public final AKJ<T> Ah2(AKN<T> akn) {
        return new AKJ<>(akn, this.A00, null, null, null, false, true);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("DynamicValueHolder(state="));
    }

    public AKF(MutableState<T> mutableState) {
        this.A00 = mutableState;
    }
}
