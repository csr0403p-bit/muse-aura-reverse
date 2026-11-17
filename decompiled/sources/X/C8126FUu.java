package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.FUu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8126FUu extends Drawable {
    public final ActionBarContainer A00;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A04) {
            drawable = actionBarContainer.A01;
            if (drawable == null) {
                return;
            }
        } else {
            Drawable drawable2 = actionBarContainer.A00;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            drawable = actionBarContainer.A02;
            if (drawable == null || !actionBarContainer.A05) {
                return;
            }
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (!actionBarContainer.A04) {
            drawable = actionBarContainer.A00;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.A01 == null) {
            return;
        } else {
            drawable = actionBarContainer.A00;
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C8126FUu(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }
}
