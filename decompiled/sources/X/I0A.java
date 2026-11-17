package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes6.dex */
public final class I0A extends ViewOutlineProvider {
    public final int $t;
    public final Object A00;

    public I0A(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        FDW fdw;
        float fA06;
        switch (this.$t) {
            case 0:
                throw new NullPointerException("chipDrawable");
            case 1:
                AnonymousClass003.A0u(view, outline);
                Drawable background = view.getBackground();
                if (background != null) {
                    fdw = (FDW) this.A00;
                    background.getOutline(outline);
                    break;
                } else {
                    return;
                }
            default:
                boolean zA1b = AnonymousClass004.A1b(view, outline);
                Drawable background2 = view.getBackground();
                if (background2 == null) {
                    outline.setRect(zA1b ? 1 : 0, zA1b ? 1 : 0, view.getWidth(), view.getHeight());
                    fA06 = 0.0f;
                    outline.setAlpha(fA06);
                }
                background2.getOutline(outline);
                fdw = (FDW) this.A00;
                break;
        }
        fA06 = fdw.A06(65, 1.0f);
        outline.setAlpha(fA06);
    }
}
