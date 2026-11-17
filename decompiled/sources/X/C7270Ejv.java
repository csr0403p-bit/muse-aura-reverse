package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* renamed from: X.Ejv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7270Ejv {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Rect A05;
    public final InterfaceC7173Ehi A06;
    public final EhK A07;
    public final EhF A08;
    public final boolean A09;
    public final int[] A0A;
    public final C7285EkC[] A0B;
    public final Rect A04 = new Rect();
    public final Rect A03 = new Rect();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 X.Ejv) */
    public static synchronized Bitmap A00(C7270Ejv c7270Ejv, int i, int i2) {
        Bitmap bitmap;
        synchronized (c7270Ejv) {
            Bitmap bitmap2 = c7270Ejv.A00;
            if (bitmap2 != null && (bitmap2.getWidth() < i || c7270Ejv.A00.getHeight() < i2)) {
                Bitmap bitmap3 = c7270Ejv.A00;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    c7270Ejv.A00 = null;
                }
            }
            Bitmap bitmapCreateBitmap = c7270Ejv.A00;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                c7270Ejv.A00 = bitmapCreateBitmap;
            }
            bitmapCreateBitmap.eraseColor(0);
            bitmap = c7270Ejv.A00;
        }
        return bitmap;
    }

    public static Rect A01(Rect rect, InterfaceC7173Ehi interfaceC7173Ehi) {
        int iMin;
        int iMin2;
        if (rect == null) {
            iMin = interfaceC7173Ehi.getWidth();
            iMin2 = interfaceC7173Ehi.getHeight();
        } else {
            iMin = Math.min(rect.width(), interfaceC7173Ehi.getWidth());
            iMin2 = Math.min(rect.height(), interfaceC7173Ehi.getHeight());
        }
        return new Rect(0, 0, iMin, iMin2);
    }

    public static void A02(Canvas canvas, C7285EkC c7285EkC, C7270Ejv c7270Ejv, float f, float f2) {
        if (c7285EkC.A04 == EnumC2379BWs.DISPOSE_TO_BACKGROUND) {
            int iA04 = BV7.A04(c7285EkC.A01, f);
            int iA042 = BV7.A04(c7285EkC.A00, f2);
            int iA043 = BV7.A04(c7285EkC.A02, f);
            int iA044 = BV7.A04(c7285EkC.A03, f2);
            canvas.drawRect(new Rect(iA043, iA044, iA04 + iA043, iA042 + iA044), c7270Ejv.A02);
        }
    }

    public final void A03(Canvas canvas, int i) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        InterfaceC7173Ehi interfaceC7173Ehi = this.A06;
        InterfaceC7287EkE frame = interfaceC7173Ehi.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (interfaceC7173Ehi.doesRenderSupportScaling()) {
                    Rect rect = this.A05;
                    double dWidth = rect.width() / interfaceC7173Ehi.getWidth();
                    double dHeight = rect.height() / interfaceC7173Ehi.getHeight();
                    int iA0G = (int) BV6.A0G(frame.getWidth(), dWidth);
                    int iA0G2 = (int) BV6.A0G(frame.getHeight(), dHeight);
                    int xOffset2 = (int) (frame.getXOffset() * dWidth);
                    int yOffset2 = (int) (frame.getYOffset() * dHeight);
                    synchronized (this) {
                        try {
                            int iWidth = rect.width();
                            int iHeight = rect.height();
                            A00(this, iWidth, iHeight);
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                frame.renderFrame(iA0G, iA0G2, bitmap);
                            }
                            Rect rect2 = this.A04;
                            rect2.set(0, 0, iWidth, iHeight);
                            Rect rect3 = this.A03;
                            rect3.set(xOffset2, yOffset2, iWidth + xOffset2, iHeight + yOffset2);
                            Bitmap bitmap2 = this.A00;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (this.A09) {
                        float fMax = Math.max(frame.getWidth() / Math.min(frame.getWidth(), canvas.getWidth()), frame.getHeight() / Math.min(frame.getHeight(), canvas.getHeight()));
                        width = (int) (frame.getWidth() / fMax);
                        height = (int) (frame.getHeight() / fMax);
                        xOffset = (int) (frame.getXOffset() / fMax);
                        yOffset = (int) (frame.getYOffset() / fMax);
                    } else {
                        width = frame.getWidth();
                        height = frame.getHeight();
                        xOffset = frame.getXOffset();
                        yOffset = frame.getYOffset();
                    }
                    synchronized (this) {
                        try {
                            Bitmap bitmapA00 = A00(this, width, height);
                            this.A00 = bitmapA00;
                            frame.renderFrame(width, height, bitmapA00);
                            canvas.save();
                            canvas.translate(xOffset, yOffset);
                            canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }

    public C7270Ejv(Rect rect, EhK ehK, EhF ehF, boolean z) {
        this.A08 = ehF;
        this.A07 = ehK;
        InterfaceC7173Ehi interfaceC7173Ehi = ehK.A02;
        this.A06 = interfaceC7173Ehi;
        int[] frameDurations = interfaceC7173Ehi.getFrameDurations();
        this.A0A = frameDurations;
        C7384Etj.A0Y(frameDurations, 0);
        int length = frameDurations.length;
        for (int i = 0; i < length; i++) {
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
        }
        int i2 = 0;
        for (int i3 : frameDurations) {
            i2 += i3;
        }
        this.A01 = i2;
        for (int i4 = 0; i4 < length; i4++) {
        }
        this.A05 = A01(rect, interfaceC7173Ehi);
        this.A09 = z;
        this.A0B = new C7285EkC[interfaceC7173Ehi.getFrameCount()];
        for (int i5 = 0; i5 < this.A06.getFrameCount(); i5++) {
            this.A0B[i5] = this.A06.getFrameInfo(i5);
        }
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
