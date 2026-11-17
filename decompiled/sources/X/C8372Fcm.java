package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;

/* renamed from: X.Fcm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8372Fcm extends Drawable {
    public Paint A00;
    public final Paint A01;
    public final Paint A02;
    public final C8373Fcn A03;
    public final C8373Fcn A04;
    public final C8373Fcn A05;
    public final C8375Fcp A06;
    public final int A07;
    public final Path A08;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        int iSave = canvas.save();
        try {
            try {
                canvas.drawColor(this.A07);
                int iHeight = getBounds().height();
                int iWidth = getBounds().width();
                Paint paint = this.A00;
                if (paint != null) {
                    canvas.drawRect(0.0f, 0.0f, iWidth, iHeight, paint);
                }
                float f = iWidth;
                canvas.drawRect(0.0f, 0.0f, f, iHeight, this.A01);
                canvas.drawCircle(f, 0.0f, (int) AbstractC7611F5y.A01(iWidth, iHeight), this.A02);
                C8375Fcp c8375Fcp = this.A06;
                canvas.drawPath(c8375Fcp.A01, c8375Fcp.A00);
                C8373Fcn c8373Fcn = this.A04;
                canvas.drawPath(c8373Fcn.A01, c8373Fcn.A00);
                C8373Fcn c8373Fcn2 = this.A03;
                canvas.drawPath(c8373Fcn2.A01, c8373Fcn2.A00);
                C8373Fcn c8373Fcn3 = this.A05;
                canvas.drawPath(c8373Fcn3.A01, c8373Fcn3.A00);
            } catch (Exception unused) {
                FFI.A01(null, "Exception when drawing CDSHarmonizationCompanyGradientDrawable", null);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        float f = iHeight;
        float f2 = iWidth;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A01.setShader(new LinearGradient(0.0f, f, f2, 0.0f, -16751392, -16743685, tileMode));
        float f3 = f2 * (-0.333f);
        float f4 = (-0.333f) * f;
        float f5 = f2 * 1.333f;
        float f6 = 1.333f * f;
        C8375Fcp c8375Fcp = this.A06;
        C8377Fcr c8377Fcr = c8375Fcp.A03;
        c8377Fcr.A00 = f5;
        c8377Fcr.A01 = f6;
        C8377Fcr c8377Fcr2 = c8375Fcp.A04;
        c8377Fcr2.A00 = f5;
        c8377Fcr2.A01 = 0.55f * f;
        C8377Fcr c8377Fcr3 = c8375Fcp.A02;
        c8377Fcr3.A00 = (-0.37f) * f2;
        c8377Fcr3.A01 = f6;
        C8373Fcn c8373Fcn = this.A05;
        C8377Fcr c8377Fcr4 = c8373Fcn.A05;
        c8377Fcr4.A00 = f3;
        c8377Fcr4.A01 = f4;
        C8377Fcr c8377Fcr5 = c8373Fcn.A06;
        c8377Fcr5.A00 = 0.032f * f2;
        c8377Fcr5.A01 = f4;
        C8377Fcr c8377Fcr6 = c8373Fcn.A04;
        c8377Fcr6.A00 = f3;
        c8377Fcr6.A01 = 1.078f * f;
        C8377Fcr c8377Fcr7 = c8373Fcn.A02;
        c8377Fcr7.A00 = 0.122f * f2;
        c8377Fcr7.A01 = 0.415f * f;
        C8377Fcr c8377Fcr8 = c8373Fcn.A03;
        c8377Fcr8.A00 = (-0.01f) * f2;
        c8377Fcr8.A01 = 0.753f * f;
        C8373Fcn c8373Fcn2 = this.A03;
        C8377Fcr c8377Fcr9 = c8373Fcn2.A05;
        c8377Fcr9.A00 = f3;
        c8377Fcr9.A01 = f4;
        C8377Fcr c8377Fcr10 = c8373Fcn2.A06;
        c8377Fcr10.A00 = 0.19f * f2;
        c8377Fcr10.A01 = f4;
        C8377Fcr c8377Fcr11 = c8373Fcn2.A04;
        c8377Fcr11.A00 = f3;
        c8377Fcr11.A01 = 1.087f * f;
        C8377Fcr c8377Fcr12 = c8373Fcn2.A02;
        c8377Fcr12.A00 = 0.197f * f2;
        c8377Fcr12.A01 = 0.473f * f;
        C8377Fcr c8377Fcr13 = c8373Fcn2.A03;
        c8377Fcr13.A00 = 0.025f * f2;
        c8377Fcr13.A01 = 0.803f * f;
        C8373Fcn c8373Fcn3 = this.A04;
        C8377Fcr c8377Fcr14 = c8373Fcn3.A05;
        c8377Fcr14.A00 = f3;
        c8377Fcr14.A01 = f4;
        C8377Fcr c8377Fcr15 = c8373Fcn3.A06;
        c8377Fcr15.A00 = 0.355f * f2;
        c8377Fcr15.A01 = f4;
        C8377Fcr c8377Fcr16 = c8373Fcn3.A04;
        c8377Fcr16.A00 = f3;
        c8377Fcr16.A01 = 1.043f * f;
        C8377Fcr c8377Fcr17 = c8373Fcn3.A02;
        c8377Fcr17.A00 = 0.27f * f2;
        c8377Fcr17.A01 = 0.49f * f;
        C8377Fcr c8377Fcr18 = c8373Fcn3.A03;
        c8377Fcr18.A00 = 0.057f * f2;
        c8377Fcr18.A01 = f * 0.807f;
        this.A02.setShader(HyN.A01(tileMode, AbstractC7611F5y.A01(iWidth, iHeight), f2));
        Path path = c8375Fcp.A01;
        path.reset();
        path.moveTo(c8377Fcr2.A00, c8377Fcr2.A01);
        path.lineTo(c8377Fcr3.A00, c8377Fcr3.A01);
        path.lineTo(c8377Fcr.A00, c8377Fcr.A01);
        path.close();
        c8373Fcn3.A00();
        c8373Fcn2.A00();
        c8373Fcn.A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A03.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C8372Fcm() {
    }

    public C8372Fcm(int i, float f) {
        this.A07 = 268435455;
        this.A08 = AbstractC7607F5u.A0V();
        this.A01 = AbstractC7607F5u.A0T();
        this.A05 = new C8373Fcn(-11695, 100);
        this.A03 = new C8373Fcn(-44416, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN);
        this.A04 = new C8373Fcn(-6278145, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS);
        this.A06 = new C8375Fcp();
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A02 = paintA0T;
        AbstractC7610F5x.A17(paintA0T);
    }
}
