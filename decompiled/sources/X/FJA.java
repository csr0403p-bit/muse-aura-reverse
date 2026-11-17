package X;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes6.dex */
public interface FJA {
    FJK createTypefaceBuilderFromFontFamily(Context context, String str);

    Typeface createTypefaceFromFontFamily(Context context, String str, int i);

    Typeface getVariableFontFallbackTypeface(Context context);
}
