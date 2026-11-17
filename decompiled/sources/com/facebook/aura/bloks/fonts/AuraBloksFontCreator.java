package com.facebook.aura.bloks.fonts;

import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.C7908FKd;
import X.FJK;
import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes6.dex */
public final class AuraBloksFontCreator extends C7908FKd {
    public static final Companion Companion = new Companion();
    public static final String OPTIMISTIC_AI = "Optimistic AI";

    @Override // X.C7908FKd, X.FJA
    public Typeface getVariableFontFallbackTypeface(Context context) {
        C7384Etj.A0Y(context, 0);
        Typeface typefaceCreateTypefaceFromFontFamily = AuraTypefaceCreator.INSTANCE.createTypefaceFromFontFamily(context, OPTIMISTIC_AI, 0);
        C7384Etj.A0U(typefaceCreateTypefaceFromFontFamily);
        return typefaceCreateTypefaceFromFontFamily;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @Override // X.C7908FKd, X.FJA
    public FJK createTypefaceBuilderFromFontFamily(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return AuraTypefaceCreator.INSTANCE.createTypefaceBuilderFromFontFamily(context, str);
    }

    @Override // X.C7908FKd, X.FJA
    public Typeface createTypefaceFromFontFamily(Context context, String str, int i) {
        AnonymousClass003.A0u(context, str);
        Typeface typefaceCreateTypefaceFromFontFamily = AuraTypefaceCreator.INSTANCE.createTypefaceFromFontFamily(context, str, i);
        C7384Etj.A0U(typefaceCreateTypefaceFromFontFamily);
        return typefaceCreateTypefaceFromFontFamily;
    }
}
