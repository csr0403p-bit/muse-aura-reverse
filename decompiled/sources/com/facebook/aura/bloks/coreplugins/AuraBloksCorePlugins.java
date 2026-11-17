package com.facebook.aura.bloks.coreplugins;

import X.C4JM;
import X.C7851FHl;
import X.FAP;
import X.FDV;
import X.FJA;
import X.Hie;
import android.content.Context;
import com.facebook.aura.bloks.fonts.AuraBloksFontCreator;
import com.facebook.aura.bloks.registration.AuraBloksChildAttributeHelper;

/* loaded from: classes6.dex */
public class AuraBloksCorePlugins {
    public static final FAP CHILD_ATTRIBUTE_MAPPER = new AuraBloksChildAttributeHelper(null);
    public static final FJA TYPEFACE_CREATOR = new AuraBloksFontCreator();

    public static FAP provideChildAttributeMapper() {
        return CHILD_ATTRIBUTE_MAPPER;
    }

    public static C7851FHl provideComponentMapper() {
        return C7851FHl.A00;
    }

    public static Hie provideDrawableMapper() {
        return Hie.A00;
    }

    public static FDV provideEmojiParser() {
        return FDV.A00;
    }

    public static FJA provideTypefaceCreator() {
        return TYPEFACE_CREATOR;
    }

    public static Context provideApplicationContext() {
        return C4JM.A00();
    }
}
