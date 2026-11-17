package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes5.dex */
public abstract class CM2 {
    public static Paint A00;
    public static final C7523EzA<String, Typeface> A01;
    public static final CMC A02;

    public static Typeface A02(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    static {
        AbstractC3136BzG.A00("TypefaceCompat static init");
        A02 = Build.VERSION.SDK_INT >= 31 ? new CM3() : new CM1();
        A01 = new C7523EzA<>(16);
        Trace.endSection();
    }

    public static Typeface A01(Context context, CLt[] cLtArr, int i) {
        AbstractC3136BzG.A00("TypefaceCompat.createFromFontInfo");
        try {
            CM1 cm1 = (CM1) A02;
            ContentResolver contentResolver = context.getContentResolver();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyA01 = CM1.A01(contentResolver, cm1, cLtArr);
                if (fontFamilyA01 != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyA01).setStyle(CM1.A00(fontFamilyA01, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typefaceBuild;
        } finally {
            Trace.endSection();
        }
    }

    public static Font A03(Typeface typeface) {
        Paint paint = A00;
        if (paint == null) {
            paint = new Paint();
            A00 = paint;
        }
        paint.setTextSize(10.0f);
        A00.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) InviteCodeScratcherKt.CODE_SEPARATOR, 0, 1, 0, 1, 0.0f, 0.0f, false, A00);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    public static String A04(Resources resources, String str, int i, int i2, int i3) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(resources.getResourcePackageName(i));
        sbA0w.append('-');
        sbA0w.append(str);
        sbA0w.append('-');
        sbA0w.append(i2);
        sbA0w.append('-');
        sbA0w.append(i);
        sbA0w.append('-');
        return BV4.A0l(sbA0w, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r3
  0x002a: PHI (r3v6 android.graphics.Typeface) = (r3v4 android.graphics.Typeface), (r3v7 android.graphics.Typeface), (r3v11 android.graphics.Typeface) binds: [B:76:0x01a5, B:10:0x001e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface A00(android.content.Context r14, android.content.res.Resources r15, X.CML r16, X.CM9 r17, java.lang.String r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CM2.A00(android.content.Context, android.content.res.Resources, X.CML, X.CM9, java.lang.String, int, int, int, boolean):android.graphics.Typeface");
    }
}
