package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes4.dex */
public final class B1R extends RippleDrawable {
    public B6A A00;
    public Integer A01;
    public boolean A02;
    public final boolean A03;

    public B1R(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.A03 = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.A03) {
            this.A02 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.A02 = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.A02;
    }
}
