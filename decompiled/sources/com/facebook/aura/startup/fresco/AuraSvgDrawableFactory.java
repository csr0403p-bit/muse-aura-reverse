package com.facebook.aura.startup.fresco;

import X.C7197Ei9;
import X.C7384Etj;
import X.InterfaceC7064EfB;
import X.InterfaceC7136Egs;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class AuraSvgDrawableFactory implements InterfaceC7136Egs {
    public static final AuraSvgDrawableFactory INSTANCE = new AuraSvgDrawableFactory();

    @Override // X.InterfaceC7136Egs
    public Drawable createDrawable(Resources resources, InterfaceC7064EfB interfaceC7064EfB, C7197Ei9 c7197Ei9) {
        AuraCloseableSvgImage auraCloseableSvgImage;
        C7384Etj.A0Y(interfaceC7064EfB, 1);
        if (!(interfaceC7064EfB instanceof AuraCloseableSvgImage) || (auraCloseableSvgImage = (AuraCloseableSvgImage) interfaceC7064EfB) == null) {
            return null;
        }
        return new AuraSvgPictureDrawable(auraCloseableSvgImage.svg);
    }
}
