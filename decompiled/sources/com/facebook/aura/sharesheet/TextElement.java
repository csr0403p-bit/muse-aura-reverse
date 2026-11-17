package com.facebook.aura.sharesheet;

import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import android.graphics.Typeface;

/* loaded from: classes4.dex */
public final class TextElement implements ShareElement {
    public final int maxLines;
    public final CharSequence text;
    public final float textSize;
    public final Typeface typeface;

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public final TextElement scaledBy(float f) {
        return new TextElement(this.text, this.textSize * f, this.typeface, this.maxLines);
    }

    public TextElement(CharSequence charSequence, float f, Typeface typeface, int i) {
        AnonymousClass003.A0v(charSequence, typeface);
        this.text = charSequence;
        this.textSize = f;
        this.typeface = typeface;
        this.maxLines = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextElement(CharSequence charSequence, float f, Typeface typeface, int i, int i2, C06H c06h) {
        if ((i2 & 4) != 0) {
            typeface = Typeface.DEFAULT;
            C7384Etj.A0V(typeface);
        }
        this(charSequence, f, typeface, (i2 & 8) != 0 ? Integer.MAX_VALUE : i);
    }
}
