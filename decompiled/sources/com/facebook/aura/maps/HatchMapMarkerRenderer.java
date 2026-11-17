package com.facebook.aura.maps;

import X.AbstractC7607F5u;
import X.AnonymousClass003;
import X.C06H;
import X.C10467HkR;
import X.C7384Etj;
import X.C8524Ffa;
import X.C8526Ffd;
import X.C8527Ffe;
import X.C8528Fff;
import X.C8531Ffi;
import X.C8532Ffj;
import X.C8j3;
import X.HxS;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.facebook.aura.vds.compose.theme.BaseColors;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class HatchMapMarkerRenderer {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final float MARKER_RENDER_SCALE = 2.0f;

    @Deprecated
    public static final float NORMAL_FALLBACK_DOT_DIAMETER = 14.0f;

    @Deprecated
    public static final float SELECTED_FALLBACK_DOT_DIAMETER = 22.0f;
    public final HatchMapDisplayMode displayMode;
    public final C8528Fff renderer;

    /* renamed from: com.facebook.aura.maps.HatchMapMarkerRenderer$fallbackGlyph$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final /* synthetic */ float $diameter;
        public final /* synthetic */ Paint $paint;

        public AnonymousClass1(float f, Paint paint) {
            this.$diameter = f;
            this.$paint = paint;
        }

        public final void draw(Canvas canvas, RectF rectF) {
            AnonymousClass003.A0u(canvas, rectF);
            float f = this.$diameter / 2.0f;
            canvas.drawOval(new RectF(rectF.centerX() - f, rectF.centerY() - f, rectF.centerX() + f, rectF.centerY() + f), this.$paint);
        }
    }

    public HatchMapMarkerRenderer(HatchMapDisplayMode hatchMapDisplayMode) {
        C7384Etj.A0Y(hatchMapDisplayMode, 0);
        this.displayMode = hatchMapDisplayMode;
        this.renderer = new C8528Fff();
    }

    private final C8532Ffj markerLayout(boolean z, boolean z2) {
        return C8528Fff.A01(background(z, z2, null), markerRenderOptions(z));
    }

    public final SizeF getSelectedMarkerSize() {
        RectF rectF = markerLayout(true, false).A03;
        return new SizeF(rectF.width(), rectF.height());
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final C8526Ffd background(boolean z, boolean z2, Bitmap bitmap) {
        C8524Ffa c8524Ffa = new C8524Ffa();
        c8524Ffa.A03 = markerFillColor(z2);
        c8524Ffa.A04 = markerSurfaceColor(z2);
        c8524Ffa.A00 = strokeWidth(z);
        c8524Ffa.A01 = 0.8f;
        c8524Ffa.A02 = 0.2f;
        c8524Ffa.A05 = bitmap;
        return new C8526Ffd(c8524Ffa, Collections.singletonList(new C8527Ffe(new C8531Ffi(new PointF(0.0f, 2.0f), Color.argb(z2 ? 128 : 64, 0, 0, 0)))));
    }

    public static /* synthetic */ C8526Ffd background$default(HatchMapMarkerRenderer hatchMapMarkerRenderer, boolean z, boolean z2, Bitmap bitmap, int i, Object obj) {
        if ((i & 4) != 0) {
            bitmap = null;
        }
        return hatchMapMarkerRenderer.background(z, z2, bitmap);
    }

    private final AnonymousClass1 fallbackGlyph(boolean z, boolean z2) {
        float f = z ? 22.0f : 14.0f;
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        paintA0U.setColor(markerSurfaceColor(z2));
        AbstractC7607F5u.A1G(paintA0U);
        return new AnonymousClass1(f, paintA0U);
    }

    private final int markerFillColor(boolean z) {
        return HxS.A01(z ? BaseColors.GRAY_400 : BaseColors.GRAY_1000);
    }

    private final C10467HkR markerRenderOptions(boolean z) {
        Integer num;
        int i;
        Integer numValueOf;
        if (!z) {
            num = 36;
            i = 43;
        } else {
            if (this.displayMode == HatchMapDisplayMode.INLINE) {
                num = 50;
                numValueOf = 60;
                int iIntValue = num.intValue();
                int iIntValue2 = numValueOf.intValue();
                float fStrokeWidth = strokeWidth(z);
                return new C10467HkR(C8j3.A08(iIntValue + fStrokeWidth), C8j3.A08(iIntValue2 + fStrokeWidth));
            }
            num = 60;
            i = 73;
        }
        numValueOf = Integer.valueOf(i);
        int iIntValue3 = num.intValue();
        int iIntValue22 = numValueOf.intValue();
        float fStrokeWidth2 = strokeWidth(z);
        return new C10467HkR(C8j3.A08(iIntValue3 + fStrokeWidth2), C8j3.A08(iIntValue22 + fStrokeWidth2));
    }

    private final int markerSurfaceColor(boolean z) {
        return HxS.A01(z ? BaseColors.GRAY_1050 : BaseColors.WHITE);
    }

    public static /* synthetic */ Bitmap render$default(HatchMapMarkerRenderer hatchMapMarkerRenderer, boolean z, boolean z2, Bitmap bitmap, int i, Object obj) {
        if ((i & 4) != 0) {
            bitmap = null;
        }
        return hatchMapMarkerRenderer.render(z, z2, bitmap);
    }

    private final float strokeWidth(boolean z) {
        return z ? 3.0f : 2.5f;
    }

    public final float getImagePixelRatio() {
        return 2.0f;
    }

    public final PointF iconOffset(boolean z, boolean z2) {
        C8532Ffj c8532FfjMarkerLayout = markerLayout(z, z2);
        RectF rectF = c8532FfjMarkerLayout.A02;
        float width = new Size((int) rectF.width(), (int) rectF.height()).getWidth() / 2.0f;
        PointF pointF = c8532FfjMarkerLayout.A00;
        return new PointF(width - pointF.x, (new Size((int) rectF.width(), (int) rectF.height()).getHeight() / 2.0f) - pointF.y);
    }

    public final Bitmap render(boolean z, boolean z2, Bitmap bitmap) {
        C8526Ffd c8526FfdBackground = background(z, z2, bitmap);
        AnonymousClass1 anonymousClass1FallbackGlyph = bitmap == null ? fallbackGlyph(z, z2) : null;
        C8532Ffj c8532FfjA01 = C8528Fff.A01(c8526FfdBackground, markerRenderOptions(z));
        RectF rectF = c8532FfjA01.A02;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (rectF.width() * 2.0f), (int) (rectF.height() * 2.0f), Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(2.0f, 2.0f);
        c8526FfdBackground.A9G(canvas, c8532FfjA01.A03);
        if (anonymousClass1FallbackGlyph != null) {
            anonymousClass1FallbackGlyph.draw(canvas, c8532FfjA01.A01);
        }
        return bitmapCreateBitmap;
    }
}
