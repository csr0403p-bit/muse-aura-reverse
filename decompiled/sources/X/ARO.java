package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class ARO extends ARP {
    public final MutableState A00 = AbstractC1798ArH.A06(null);
    public final ARR<?> A01;

    public ARO(ARR<?> arr) {
        this.A01 = arr;
    }

    @Override // X.ARP
    public final <T> void A01(ARR<T> arr, T t) {
        if (arr == this.A01) {
            this.A00.Af8(t);
        } else {
            ASP.A01("Check failed.");
            throw F60.createAndThrow();
        }
    }

    @Override // X.ARP
    public final boolean A02(ARR<?> arr) {
        return AnonymousClass002.A1Z(arr, this.A01);
    }
}
