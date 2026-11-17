package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.FXv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8179FXv {
    public int A00 = 0;
    public C8142FWg A01;
    public final ImageView A02;

    public final void A00() {
        ImageView imageView = this.A02;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            FWU.A01(drawable);
            C8142FWg c8142FWg = this.A01;
            if (c8142FWg != null) {
                C8137FWa.A01(drawable, c8142FWg, imageView.getDrawableState());
            }
        }
    }

    public final void A01(AttributeSet attributeSet, int i) {
        ImageView imageView = this.A02;
        Context context = imageView.getContext();
        int[] iArr = FYT.A05;
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        imageView.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                FWU.A01(drawable);
            } else {
                int resourceId = typedArray.getResourceId(1, -1);
                if (resourceId != -1 && (drawable = FWf.A00(context, resourceId)) != null) {
                    imageView.setImageDrawable(drawable);
                    FWU.A01(drawable);
                }
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c8140FWdA00.A01(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(FWU.A00(null, typedArray.getInt(3, -1)));
            }
        } finally {
            typedArray.recycle();
        }
    }

    public C8179FXv(ImageView imageView) {
        this.A02 = imageView;
    }
}
