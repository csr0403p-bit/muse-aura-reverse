package com.facebook.aura.startup.fresco;

import X.C7384Etj;
import X.HBA;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;

/* loaded from: classes6.dex */
public final class AuraSvgPictureDrawable extends PictureDrawable {
    public final int documentHeight;
    public final int documentWidth;
    public final HBA svg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSvgPictureDrawable(HBA hba) {
        super(null);
        C7384Etj.A0Y(hba, 0);
        this.svg = hba;
        int iDocumentSize = AuraSvgSupportKt.documentSize(hba, true);
        Integer numValueOf = iDocumentSize <= 0 ? null : Integer.valueOf(iDocumentSize);
        this.documentWidth = numValueOf != null ? numValueOf.intValue() : -1;
        int iDocumentSize2 = AuraSvgSupportKt.documentSize(hba, false);
        this.documentHeight = iDocumentSize2 > 0 ? iDocumentSize2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        Picture pictureA02 = null;
        try {
            pictureA02 = this.svg.A02(rect.width(), rect.height());
        } catch (Exception | StackOverflowError unused) {
        }
        setPicture(pictureA02);
    }

    @Override // android.graphics.drawable.PictureDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.documentHeight;
    }

    @Override // android.graphics.drawable.PictureDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.documentWidth;
    }
}
