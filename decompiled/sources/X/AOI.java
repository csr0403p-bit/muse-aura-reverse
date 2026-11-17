package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public final class AOI<S> extends AOH<S> {
    public final MutableState A00;
    public final MutableState A01;

    @Override // X.AOH
    public final void A0B(AOP<S> aop) {
    }

    @Override // X.AOH
    public final S A09() {
        return (S) this.A00.getValue();
    }

    @Override // X.AOH
    public final S A0A() {
        return (S) this.A01.getValue();
    }

    public final void A0C(S s) {
        this.A01.Af8(s);
    }

    public final boolean A0D() {
        return MutableState.A0B(this.A01, this.A00.getValue()) && !MutableState.A0A(super.A00);
    }

    public AOI(S s) {
        AGE age = AGE.A00;
        this.A00 = new ParcelableSnapshotMutableState(age, s);
        this.A01 = new ParcelableSnapshotMutableState(age, s);
    }
}
