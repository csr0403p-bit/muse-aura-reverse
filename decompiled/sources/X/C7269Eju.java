package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Eju, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7269Eju implements InterfaceC7278Ek4 {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public C7292EkJ A04;
    public final Matrix A05;
    public final Paint A06;
    public final Path A07;
    public final InterfaceC7288EkF A08;
    public final InterfaceC7274Ejz A09;
    public final C7178Ehn A0A;
    public final C7434Evs A0B;
    public final C7177Ehm A0C;
    public final boolean A0D;
    public final float[] A0E;
    public final Bitmap.Config A0F;
    public final InterfaceC7275Ek1 A0G;
    public final InterfaceC7176Ehl A0H;
    public final AbstractC7151EhM A0I;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7269Eju(X.InterfaceC7288EkF r5, X.InterfaceC7275Ek1 r6, X.InterfaceC7274Ejz r7, X.InterfaceC7176Ehl r8, X.C7178Ehn r9, X.C7434Evs r10, X.C7177Ehm r11, X.AbstractC7151EhM r12, boolean r13) {
        /*
            r4 = this;
            r3 = 0
            r4.<init>()
            r4.A0I = r12
            r4.A0G = r6
            r4.A08 = r5
            r4.A0A = r9
            r4.A0D = r13
            r4.A09 = r7
            r4.A0H = r8
            r4.A0C = r11
            r4.A0B = r10
            if (r11 == 0) goto L48
            float r2 = r11.A00
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L48
            r0 = 8
            float[] r1 = new float[r0]
            java.util.Arrays.fill(r1, r3, r0, r2)
        L26:
            r4.A0E = r1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r4.A0F = r0
            r1 = 6
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.A06 = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.A07 = r0
            android.graphics.Matrix r0 = X.BV4.A08()
            r4.A05 = r0
            r0 = -1
            r4.A02 = r0
            r4.A00()
            return
        L48:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7269Eju.<init>(X.EkF, X.Ek1, X.Ejz, X.Ehl, X.Ehn, X.Evs, X.Ehm, X.EhM, boolean):void");
    }

    private final boolean A02(Canvas canvas, int i, int i2) {
        EfF efFADC;
        AutoCloseable autoCloseable = null;
        try {
            boolean zA03 = false;
            int i3 = 1;
            if (this.A0D) {
                InterfaceC7274Ejz interfaceC7274Ejz = this.A09;
                if (interfaceC7274Ejz != null) {
                    EfF<Bitmap> efFACp = interfaceC7274Ejz.ACp(i, canvas.getWidth(), canvas.getHeight());
                    if (efFACp != null && efFACp.A05()) {
                        A01(BV6.A0M(efFACp), canvas, i);
                        efFACp.close();
                        return true;
                    }
                    interfaceC7274Ejz.AYR(canvas.getWidth(), canvas.getHeight());
                    if (efFACp != null) {
                        efFACp.close();
                    }
                }
            } else {
                if (i2 == 0) {
                    efFADC = this.A0G.ADC(i);
                    zA03 = A03(canvas, efFADC, i, 0);
                } else if (i2 == 1) {
                    efFADC = this.A0G.ACq();
                    if (efFADC != null && efFADC.A05()) {
                        if (!this.A0A.A00(BV6.A0M(efFADC), i)) {
                            efFADC.close();
                        } else if (A03(canvas, efFADC, i, 1)) {
                            zA03 = true;
                        }
                    }
                    i3 = 2;
                } else if (i2 != 2) {
                    efFADC = this.A0G.AFX();
                    zA03 = A03(canvas, efFADC, i, 3);
                    i3 = -1;
                } else {
                    try {
                        efFADC = this.A0I.A00(this.A0F, this.A01, this.A00);
                        if (efFADC.A05()) {
                            if (!this.A0A.A00(BV6.A0M(efFADC), i)) {
                                efFADC.close();
                            } else if (A03(canvas, efFADC, i, 2)) {
                                zA03 = true;
                            }
                        }
                        i3 = 3;
                    } catch (RuntimeException e) {
                        AbstractC3422CMk.A01(C7269Eju.class, "Failed to create frame bitmap", e);
                        return false;
                    }
                }
                if (efFADC != null) {
                    efFADC.close();
                }
                if (!zA03 && i3 != -1) {
                    return A02(canvas, i, i3);
                }
            }
            return zA03;
        } catch (Throwable th) {
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th;
        }
    }

    @Override // X.InterfaceC7278Ek4
    public final boolean A9P(Canvas canvas, Drawable drawable, int i) {
        InterfaceC7176Ehl interfaceC7176Ehl;
        InterfaceC7274Ejz interfaceC7274Ejz;
        C7384Etj.A0Y(canvas, 1);
        boolean zA02 = A02(canvas, i, 0);
        if (!zA02) {
            this.A08.toString();
            System.currentTimeMillis();
        }
        if (!this.A0D && (interfaceC7176Ehl = this.A0H) != null && (interfaceC7274Ejz = this.A09) != null) {
            interfaceC7274Ejz.AYQ(this, this.A0G, interfaceC7176Ehl, null, i);
        }
        return zA02;
    }

    private final void A00() {
        C7178Ehn c7178Ehn = this.A0A;
        int width = c7178Ehn.A00.A06.getWidth();
        this.A01 = width;
        if (width == -1) {
            Rect rect = this.A03;
            this.A01 = rect != null ? rect.width() : -1;
        }
        int height = c7178Ehn.A00.A06.getHeight();
        this.A00 = height;
        if (height == -1) {
            Rect rect2 = this.A03;
            this.A00 = rect2 != null ? rect2.height() : -1;
        }
    }

    private final void A01(Bitmap bitmap, Canvas canvas, int i) {
        Rect rect = this.A03;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A06);
            return;
        }
        float fWidth = rect.width();
        float fHeight = rect.height();
        float[] fArr = this.A0E;
        if (fArr == null) {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.A06);
            return;
        }
        if (i != this.A02) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            RectF rectF = new RectF(0.0f, 0.0f, this.A01, this.A00);
            RectF rectF2 = new RectF(0.0f, 0.0f, fWidth, fHeight);
            Matrix matrix = this.A05;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            bitmapShader.setLocalMatrix(matrix);
            Paint paint = this.A06;
            paint.setShader(bitmapShader);
            paint.setAntiAlias(false);
            Path path = this.A07;
            path.reset();
            path.addRoundRect(new RectF(0.0f, 0.0f, fWidth, fHeight), fArr, Path.Direction.CW);
            this.A02 = i;
        }
        canvas.drawPath(this.A07, this.A06);
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/EfF<Landroid/graphics/Bitmap;>;Landroid/graphics/Canvas;I)Z */
    private final boolean A03(Canvas canvas, EfF efF, int i, int i2) {
        if (efF == null || !EfF.A01(efF)) {
            return false;
        }
        A01(BV6.A0M(efF), canvas, i);
        if (i2 == 3 || this.A0D) {
            return true;
        }
        this.A0G.ATU(efF, i);
        return true;
    }

    @Override // X.InterfaceC7288EkF
    public final int AFs(int i) {
        return this.A08.AFs(i);
    }

    @Override // X.InterfaceC7278Ek4
    public final int AGg() {
        return this.A00;
    }

    @Override // X.InterfaceC7278Ek4
    public final int AGh() {
        return this.A01;
    }

    @Override // X.InterfaceC7288EkF
    public final int AHK() {
        return this.A08.AHK();
    }

    @Override // X.InterfaceC7288EkF
    public final int ANN() {
        return this.A08.ANN();
    }

    @Override // X.InterfaceC7278Ek4
    public final void Ack(int i) {
        this.A06.setAlpha(i);
    }

    @Override // X.InterfaceC7278Ek4
    public final void Acx(Rect rect) {
        this.A03 = rect;
        C7178Ehn c7178Ehn = this.A0A;
        C7270Ejv c7270Ejv = c7178Ehn.A00;
        if (!C7270Ejv.A01(rect, c7270Ejv.A06).equals(c7270Ejv.A05)) {
            c7270Ejv = new C7270Ejv(rect, c7270Ejv.A07, c7270Ejv.A08, c7270Ejv.A09);
        }
        if (c7270Ejv != c7178Ehn.A00) {
            c7178Ehn.A00 = c7270Ejv;
            c7178Ehn.A01 = new C7271Ejw(c7270Ejv, c7178Ehn.A03, c7178Ehn.A04);
        }
        A00();
    }

    @Override // X.InterfaceC7278Ek4
    public final void Ad5(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC7288EkF
    public final int AiQ() {
        return this.A08.AiQ();
    }

    @Override // X.InterfaceC7278Ek4
    public final void clear() {
        if (!this.A0D) {
            this.A0G.clear();
            return;
        }
        InterfaceC7274Ejz interfaceC7274Ejz = this.A09;
        if (interfaceC7274Ejz != null) {
            interfaceC7274Ejz.A6I();
        }
    }

    @Override // X.InterfaceC7288EkF
    public final int getFrameCount() {
        return this.A08.getFrameCount();
    }

    @Override // X.InterfaceC7288EkF
    public final int getLoopCount() {
        C7434Evs c7434Evs = this.A0B;
        if (c7434Evs == null) {
            return this.A08.getLoopCount();
        }
        int i = c7434Evs.A00;
        if (i == 0) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC7278Ek4
    public final void Acm(C7292EkJ c7292EkJ) {
        this.A04 = c7292EkJ;
    }
}
