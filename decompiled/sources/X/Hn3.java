package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes6.dex */
public final class Hn3 extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ FDW A01;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        boolean zA1b = AnonymousClass004.A1b(view, outline);
        outline.setRoundRect(zA1b ? 1 : 0, zA1b ? 1 : 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            FDW fdw = this.A01;
            background.getOutline(outline);
            outline.setAlpha(fdw.A06(65, 1.0f));
        }
    }

    public Hn3(FDW fdw, float f) {
        this.A00 = f;
        this.A01 = fdw;
    }
}
