package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FVb implements FVc {
    public final /* synthetic */ FW1 A00;

    public FVb(FW1 fw1) {
        this.A00 = fw1;
    }

    @Override // X.FVc
    public final void ASY(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.A00.A04(0);
    }
}
