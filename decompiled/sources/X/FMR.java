package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.Switch;

/* loaded from: classes6.dex */
public final class FMR extends FrameLayout implements FJJ {
    public final Switch A00;

    @Override // X.FJJ
    public final void Aez(float f) {
        Drawable c8144FWi;
        Drawable thumbDrawable;
        C8144FWi c8144FWi2;
        Switch r3 = this.A00;
        Drawable thumbDrawable2 = r3.getThumbDrawable();
        if (f == 1.0f || (thumbDrawable2 instanceof C8144FWi)) {
            if (f == 1.0f && (thumbDrawable2 instanceof C8144FWi)) {
                c8144FWi = ((C8144FWi) thumbDrawable2).A01;
            }
            thumbDrawable = r3.getThumbDrawable();
            if ((thumbDrawable instanceof C8144FWi) || (c8144FWi2 = (C8144FWi) thumbDrawable) == null) {
            }
            boolean zA1M = AnonymousClass002.A1M((c8144FWi2.A00 > f ? 1 : (c8144FWi2.A00 == f ? 0 : -1)));
            c8144FWi2.A00 = f;
            if (zA1M) {
                return;
            }
            Rect bounds = c8144FWi2.getBounds();
            C7384Etj.A0U(bounds);
            c8144FWi2.onBoundsChange(bounds);
            return;
        }
        C7384Etj.A0X(thumbDrawable2);
        c8144FWi = new C8144FWi(thumbDrawable2);
        r3.setThumbDrawable(c8144FWi);
        thumbDrawable = r3.getThumbDrawable();
        if (thumbDrawable instanceof C8144FWi) {
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        this.A00.setTag(obj);
    }

    public FMR(Context context) {
        super(context);
        Switch r1 = new Switch(context);
        this.A00 = r1;
        addView(r1, -2, -2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }
}
