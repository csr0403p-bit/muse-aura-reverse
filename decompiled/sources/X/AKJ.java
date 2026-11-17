package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AKJ<T> {
    public boolean A00 = true;
    public final AKN<T> A01;
    public final MutableState<T> A02;
    public final ATF<T> A03;
    public final T A04;
    public final G0U<AKR, T> A05;
    public final boolean A06;
    public final boolean A07;

    public final T A00() {
        if (this.A06) {
            return null;
        }
        MutableState<T> mutableState = this.A02;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        T t = this.A04;
        if (t != null) {
            return t;
        }
        BBL.A02("Unexpected form of a provided value");
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AKN<TT;>;TT;ZLX/ATF<TT;>;Landroidx/compose/runtime/MutableState<TT;>;LX/G0U<-LX/AKR;+TT;>;Z)V */
    /* JADX WARN: Multi-variable type inference failed */
    public AKJ(AKN akn, MutableState mutableState, ATF atf, Object obj, G0U g0u, boolean z, boolean z2) {
        this.A01 = akn;
        this.A06 = z;
        this.A03 = atf;
        this.A02 = mutableState;
        this.A05 = g0u;
        this.A07 = z2;
        this.A04 = obj;
    }
}
