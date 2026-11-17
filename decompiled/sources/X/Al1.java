package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes4.dex */
public final class Al1 extends Ab8<Al0> {
    public final /* synthetic */ AndroidComposeView A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
    }

    public Al1(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new Al0(this.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "rootModifier";
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(obj, this);
    }
}
