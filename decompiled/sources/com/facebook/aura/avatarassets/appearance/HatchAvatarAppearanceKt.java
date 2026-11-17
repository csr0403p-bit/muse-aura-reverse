package com.facebook.aura.avatarassets.appearance;

import X.BFM;
import X.C3O5;

/* loaded from: classes.dex */
public abstract class HatchAvatarAppearanceKt {
    public static final boolean isAvatarDark(BFM bfm, int i) {
        return C3O5.A00(bfm) && HatchAvatarAppearance.INSTANCE.isDarkAvatarEnabled();
    }
}
