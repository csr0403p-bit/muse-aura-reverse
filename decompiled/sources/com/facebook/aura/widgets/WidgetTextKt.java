package com.facebook.aura.widgets;

import X.Ab3;
import X.AbstractC060773g;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C71G;
import X.C72S;
import X.C72V;
import X.C7384Etj;
import X.C76B;
import X.C76X;
import X.C78N;
import X.C7VW;
import X.C8j3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.font.api.AuraAppTypeface;
import com.facebook.common.dextricks.RuntimeInternals;

/* loaded from: classes6.dex */
public abstract class WidgetTextKt {
    /* renamed from: WidgetText--b7W0Lw, reason: not valid java name */
    public static final void m3163WidgetTextb7W0Lw(String str, WidgetTextStyle widgetTextStyle, C76X c76x, float f, C76B c76b, int i, boolean z, BFM bfm, int i2, int i3) {
        int i4;
        C76B c76b2 = c76b;
        int i5 = i;
        boolean zA1K = z;
        AnonymousClass005.A10(str, widgetTextStyle, c76x);
        bfm.AgG(870656476);
        if ((i2 & 6) == 0) {
            i4 = (bfm.A65(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bfm.A63(widgetTextStyle.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? bfm.A65(c76x) : bfm.A67(c76x) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bfm.A62(f) ? 2048 : 1024;
        }
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= bfm.A65(c76b2) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        int i8 = 196608;
        if (i7 != 0) {
            i4 |= i8;
        } else if ((196608 & i2) == 0) {
            i8 = 65536;
            if (bfm.A63(i5)) {
                i8 = 131072;
            }
            i4 |= i8;
        }
        int i9 = i3 & 64;
        int i10 = 1572864;
        if (i9 != 0) {
            i4 |= i10;
        } else if ((i2 & 1572864) == 0) {
            i10 = 524288;
            if (bfm.A66(zA1K)) {
                i10 = 1048576;
            }
            i4 |= i10;
        }
        if (bfm.AfS(i4 & 1, AnonymousClass002.A1P(i4 & 599187, 599186))) {
            if (i6 != 0) {
                c76b2 = C76B.A00;
            }
            if (i7 != 0) {
                i5 = 1;
            }
            zA1K = C3cG.A1K(i9, zA1K);
            Context context = (Context) bfm.A6v(C7VW.A00);
            boolean zA1Q = AnonymousClass002.A1Q(i4 & 14, 4) | AnonymousClass002.A1Q(i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 32) | AnonymousClass002.A1Q(i4 & 7168, 2048) | AnonymousClass002.A1Q(458752 & i4, 131072) | ((3670016 & i4) == 1048576);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = m3164renderWidgetTextgwO9Abs(context, str, widgetTextStyle, f, i5, zA1K);
                bfm.Ai0(objAaT);
            }
            AbstractC060773g.A01(bfm, new C72S(new C72V(c76x)), c76b2, new C71G((Bitmap) objAaT), str, 0, ((i4 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((i4 >> 6) & 896) | 32768, 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WidgetTextKt$WidgetText$1(str, widgetTextStyle, c76x, f, c76b2, i5, zA1K, i2, i3);
        }
    }

    /* renamed from: renderWidgetText-gwO9Abs, reason: not valid java name */
    public static final Bitmap m3164renderWidgetTextgwO9Abs(Context context, String str, WidgetTextStyle widgetTextStyle, float f, int i, boolean z) {
        DisplayMetrics displayMetricsA0B = C60Q.A0B(context);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(context.getResources().getFont(AuraAppTypeface.INSTANCE.getOptimisticAi()));
        textPaint.setTextSize(TypedValue.applyDimension(2, widgetTextStyle.getSizeSp(), displayMetricsA0B));
        int weight = widgetTextStyle.getWeight();
        float sizeSp = widgetTextStyle.getSizeSp();
        StringBuilder sbA0y = C60O.A0y("'wght' ", weight);
        sbA0y.append(", 'opsz' ");
        sbA0y.append(sizeSp);
        textPaint.setFontVariationSettings(sbA0y.toString());
        textPaint.setLetterSpacing(widgetTextStyle.getLetterSpacing());
        textPaint.setColor(-1);
        int iA02 = Ab3.A02(f, displayMetricsA0B.density);
        if (iA02 < 1) {
            iA02 = 1;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, iA02).setAlignment(z ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setMaxLines(i).setEllipsize(TextUtils.TruncateAt.END).build();
        C7384Etj.A0U(staticLayoutBuild);
        boolean z2 = false;
        if (staticLayoutBuild.getLineCount() == 1) {
            z2 = true;
            iA02 = C8j3.A08(staticLayoutBuild.getLineWidth(0));
            if (iA02 < 1) {
                iA02 = 1;
            }
        }
        int height = staticLayoutBuild.getHeight();
        if (height < 1) {
            height = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA02, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z2) {
            canvas.translate(-staticLayoutBuild.getLineLeft(0), 0.0f);
        }
        staticLayoutBuild.draw(canvas);
        C7384Etj.A0U(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
