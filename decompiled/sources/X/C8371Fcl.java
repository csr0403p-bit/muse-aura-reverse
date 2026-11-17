package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;

/* renamed from: X.Fcl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8371Fcl extends Drawable {
    public final int A00;
    public final Paint A01;
    public final Paint A02;
    public final Path A03;
    public final C8374Fco A04;
    public final C8374Fco A05;
    public final C8374Fco A06;
    public final C8376Fcq A07;
    public final boolean A08;
    public final float[] A09;

    public C8371Fcl(float[] fArr, int i) {
        this.A00 = i;
        this.A09 = fArr;
        boolean z = false;
        int length = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (fArr[i2] > 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        this.A08 = z;
        this.A03 = AbstractC7607F5u.A0V();
        this.A01 = AbstractC7607F5u.A0T();
        this.A06 = new C8374Fco(-11695, 100);
        this.A04 = new C8374Fco(-44416, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN);
        this.A05 = new C8374Fco(-6278145, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS);
        this.A07 = new C8376Fcq();
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A02 = paintA0T;
        paintA0T.setAntiAlias(true);
        AbstractC7607F5u.A1G(paintA0T);
        paintA0T.setDither(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        int iSave = canvas.save();
        try {
            try {
                if (this.A08) {
                    canvas.clipPath(this.A03);
                }
                canvas.drawColor(this.A00);
                int iHeight = getBounds().height();
                float fWidth = getBounds().width();
                canvas.drawRect(0.0f, 0.0f, fWidth, iHeight, this.A01);
                canvas.drawCircle(fWidth, 0.0f, (int) AbstractC7611F5y.A01(r0, iHeight), this.A02);
                C8376Fcq c8376Fcq = this.A07;
                canvas.drawPath(c8376Fcq.A01, c8376Fcq.A00);
                C8374Fco c8374Fco = this.A05;
                canvas.drawPath(c8374Fco.A01, c8374Fco.A00);
                C8374Fco c8374Fco2 = this.A04;
                canvas.drawPath(c8374Fco2.A01, c8374Fco2.A00);
                C8374Fco c8374Fco3 = this.A06;
                canvas.drawPath(c8374Fco3.A01, c8374Fco3.A00);
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
        if (this.A08) {
            Path path = this.A03;
            path.reset();
            path.addRoundRect(new RectF(rect), this.A09, Path.Direction.CW);
            path.close();
        }
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
        C8376Fcq c8376Fcq = this.A07;
        C8378Fcs c8378Fcs = c8376Fcq.A03;
        c8378Fcs.A00 = f5;
        c8378Fcs.A01 = f6;
        C8378Fcs c8378Fcs2 = c8376Fcq.A04;
        c8378Fcs2.A00 = f5;
        c8378Fcs2.A01 = 0.55f * f;
        C8378Fcs c8378Fcs3 = c8376Fcq.A02;
        c8378Fcs3.A00 = (-0.37f) * f2;
        c8378Fcs3.A01 = f6;
        C8374Fco c8374Fco = this.A06;
        C8378Fcs c8378Fcs4 = c8374Fco.A05;
        c8378Fcs4.A00 = f3;
        c8378Fcs4.A01 = f4;
        C8378Fcs c8378Fcs5 = c8374Fco.A06;
        c8378Fcs5.A00 = 0.032f * f2;
        c8378Fcs5.A01 = f4;
        C8378Fcs c8378Fcs6 = c8374Fco.A04;
        c8378Fcs6.A00 = f3;
        c8378Fcs6.A01 = 1.078f * f;
        C8378Fcs c8378Fcs7 = c8374Fco.A02;
        c8378Fcs7.A00 = 0.122f * f2;
        c8378Fcs7.A01 = 0.415f * f;
        C8378Fcs c8378Fcs8 = c8374Fco.A03;
        c8378Fcs8.A00 = (-0.01f) * f2;
        c8378Fcs8.A01 = 0.753f * f;
        C8374Fco c8374Fco2 = this.A04;
        C8378Fcs c8378Fcs9 = c8374Fco2.A05;
        c8378Fcs9.A00 = f3;
        c8378Fcs9.A01 = f4;
        C8378Fcs c8378Fcs10 = c8374Fco2.A06;
        c8378Fcs10.A00 = 0.19f * f2;
        c8378Fcs10.A01 = f4;
        C8378Fcs c8378Fcs11 = c8374Fco2.A04;
        c8378Fcs11.A00 = f3;
        c8378Fcs11.A01 = 1.087f * f;
        C8378Fcs c8378Fcs12 = c8374Fco2.A02;
        c8378Fcs12.A00 = 0.197f * f2;
        c8378Fcs12.A01 = 0.473f * f;
        C8378Fcs c8378Fcs13 = c8374Fco2.A03;
        c8378Fcs13.A00 = 0.025f * f2;
        c8378Fcs13.A01 = 0.803f * f;
        C8374Fco c8374Fco3 = this.A05;
        C8378Fcs c8378Fcs14 = c8374Fco3.A05;
        c8378Fcs14.A00 = f3;
        c8378Fcs14.A01 = f4;
        C8378Fcs c8378Fcs15 = c8374Fco3.A06;
        c8378Fcs15.A00 = 0.355f * f2;
        c8378Fcs15.A01 = f4;
        C8378Fcs c8378Fcs16 = c8374Fco3.A04;
        c8378Fcs16.A00 = f3;
        c8378Fcs16.A01 = 1.043f * f;
        C8378Fcs c8378Fcs17 = c8374Fco3.A02;
        c8378Fcs17.A00 = 0.27f * f2;
        c8378Fcs17.A01 = 0.49f * f;
        C8378Fcs c8378Fcs18 = c8374Fco3.A03;
        c8378Fcs18.A00 = 0.057f * f2;
        c8378Fcs18.A01 = f * 0.807f;
        this.A02.setShader(HyN.A01(tileMode, AbstractC7611F5y.A01(iWidth, iHeight), f2));
        Path path2 = c8376Fcq.A01;
        path2.reset();
        path2.moveTo(c8378Fcs2.A00, c8378Fcs2.A01);
        path2.lineTo(c8378Fcs3.A00, c8378Fcs3.A01);
        path2.lineTo(c8378Fcs.A00, c8378Fcs.A01);
        path2.close();
        c8374Fco3.A00();
        c8374Fco2.A00();
        c8374Fco.A00();
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
        this.A07.A00.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }
}
