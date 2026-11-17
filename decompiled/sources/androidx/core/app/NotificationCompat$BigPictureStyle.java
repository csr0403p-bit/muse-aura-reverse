package androidx.core.app;

import X.AnonymousClass007;
import X.BV4;
import X.C3cG;
import X.EFo;
import X.EG2;
import X.EG5;
import X.EG8;
import X.EGI;
import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes5.dex */
public final class NotificationCompat$BigPictureStyle extends EG8 {
    public IconCompat A00;
    public boolean A01;
    public IconCompat A02;
    public boolean A03;

    @Override // X.EG8
    public final void A05(EG2 eg2) {
        Bitmap bitmapCreateBitmap;
        Object obj;
        EG5 eg5 = (EG5) eg2;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(eg5.A01).setBigContentTitle(super.A01);
        IconCompat iconCompat = this.A02;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                EGI.A01(bigContentTitle, EFo.A00(eg2 instanceof EG5 ? eg5.A02 : null, iconCompat));
            } else {
                int type = iconCompat.A02;
                if (type == -1) {
                    type = ((Icon) iconCompat.A06).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.A02;
                    int i = iconCompat2.A02;
                    if (i == -1) {
                        obj = iconCompat2.A06;
                        bitmapCreateBitmap = !(obj instanceof Bitmap) ? null : (Bitmap) obj;
                        bigContentTitle = bigContentTitle.bigPicture(bitmapCreateBitmap);
                    } else if (i == 1) {
                        obj = iconCompat2.A06;
                        bigContentTitle = bigContentTitle.bigPicture(bitmapCreateBitmap);
                    } else {
                        if (i != 5) {
                            throw C3cG.A0Q(AnonymousClass007.A0a("called getBitmap() on ", iconCompat2));
                        }
                        Bitmap bitmap = (Bitmap) iconCompat2.A06;
                        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                        bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f = iMin;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        Matrix matrixA08 = BV4.A08();
                        matrixA08.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrixA08);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bigContentTitle = bigContentTitle.bigPicture(bitmapCreateBitmap);
                    }
                }
            }
        }
        if (this.A01) {
            IconCompat iconCompat3 = this.A00;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(EFo.A00(eg2 instanceof EG5 ? eg5.A02 : null, iconCompat3));
            }
        }
        if (super.A03) {
            bigContentTitle.setSummaryText(super.A02);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            EGI.A02(bigContentTitle, this.A03);
            EGI.A00(bigContentTitle);
        }
    }

    public final void A06(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            iconCompat = new IconCompat(1);
            iconCompat.A06 = bitmap;
        }
        this.A02 = iconCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    @Override // X.EG8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A04(r4)
            java.lang.String r1 = "android.largeIcon.big"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L1e
            android.os.Parcelable r2 = r4.getParcelable(r1)
            if (r2 == 0) goto L5d
            boolean r0 = r2 instanceof android.graphics.drawable.Icon
            if (r0 == 0) goto L50
            androidx.core.graphics.drawable.IconCompat r1 = X.EFo.A01(r2)
        L19:
            r3.A00 = r1
            r0 = 1
            r3.A01 = r0
        L1e:
            java.lang.String r0 = "android.picture"
            android.os.Parcelable r2 = r4.getParcelable(r0)
            if (r2 != 0) goto L2e
            java.lang.String r0 = "android.pictureIcon"
            android.os.Parcelable r2 = r4.getParcelable(r0)
            if (r2 == 0) goto L4e
        L2e:
            boolean r0 = r2 instanceof android.graphics.drawable.Icon
            if (r0 == 0) goto L41
            androidx.core.graphics.drawable.IconCompat r1 = X.EFo.A01(r2)
        L36:
            r3.A02 = r1
            java.lang.String r0 = "android.showBigPictureWhenCollapsed"
            boolean r0 = r4.getBoolean(r0)
            r3.A03 = r0
            return
        L41:
            boolean r0 = r2 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L4e
            r0 = 1
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r1.<init>(r0)
            r1.A06 = r2
            goto L36
        L4e:
            r1 = 0
            goto L36
        L50:
            boolean r0 = r2 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L5d
            r0 = 1
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r1.<init>(r0)
            r1.A06 = r2
            goto L19
        L5d:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$BigPictureStyle.A04(android.os.Bundle):void");
    }
}
