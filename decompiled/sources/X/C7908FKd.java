package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.FKd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7908FKd implements FJA {
    public static final C7908FKd INSTANCE = new C7908FKd();

    @Override // X.FJA
    public /* synthetic */ Typeface getVariableFontFallbackTypeface(Context context) {
        return Typeface.DEFAULT;
    }

    @Override // X.FJA
    public Typeface createTypefaceFromFontFamily(Context context, String str, int i) {
        return Typeface.create(str, i);
    }

    @Override // X.FJA
    public FJK createTypefaceBuilderFromFontFamily(Context context, String str) {
        return null;
    }
}
