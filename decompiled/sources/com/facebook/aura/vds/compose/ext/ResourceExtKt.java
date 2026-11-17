package com.facebook.aura.vds.compose.ext;

import X.AnonymousClass002;
import X.BFM;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class ResourceExtKt {
    public static final Drawable drawableResource(int i, BFM bfm, int i2) {
        Drawable drawable = AnonymousClass002.A0H(bfm).getDrawable(i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
