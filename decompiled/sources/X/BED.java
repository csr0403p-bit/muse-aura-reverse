package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class BED extends AbstractC6499E9g {
    public final /* synthetic */ MutableState<Boolean> A00;
    public final /* synthetic */ BEC A01;

    public BED(MutableState<Boolean> mutableState, BEC bec) {
        this.A00 = mutableState;
        this.A01 = bec;
    }

    @Override // X.AbstractC6499E9g
    public final void A00() {
        this.A01.A00 = BEF.A00;
    }

    @Override // X.AbstractC6499E9g
    public final void A01() {
        MutableState.A09(true, this.A00);
        this.A01.A00 = new BEE(true);
    }
}
