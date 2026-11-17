package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes4.dex */
public final class BSA extends ViewOutlineProvider {
    public final int $t;

    public BSA(int i) {
        this.$t = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
            case 2:
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                C7384Etj.A0Z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                ViewOutlineProvider viewOutlineProvider = AbstractC1715Aoy.A00;
                throw new NullPointerException("outlineResolver");
            default:
                super.getOutline(view, outline);
                return;
        }
    }
}
