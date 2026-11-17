package com.facebook.aura.notifications.push;

import X.AbstractC3358CGz;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.aura.identity.provider.HatchIcon;
import com.facebook.aura.identity.provider.HatchIdentityProvider;

/* loaded from: classes5.dex */
public final class HatchAgentAvatarLoader {
    public static final HatchAgentAvatarLoader INSTANCE = new HatchAgentAvatarLoader();
    public static final LruCache<String, Bitmap> cache = new LruCache<>(4);

    private final Bitmap loadSourceAvatar(AbstractC3358CGz abstractC3358CGz) {
        Uri uri;
        Bitmap bitmap;
        Bitmap bitmapDecodeFile;
        try {
            HatchIcon hatchIcon = HatchIdentityProvider.Companion.getInstance(abstractC3358CGz).hatchIcon();
            HatchIcon.LocalImage localImage = hatchIcon instanceof HatchIcon.LocalImage ? (HatchIcon.LocalImage) hatchIcon : null;
            if (localImage == null || (uri = localImage.uri) == null) {
                return null;
            }
            String strA0o = C60O.A0o(uri);
            LruCache<String, Bitmap> lruCache = cache;
            synchronized (lruCache) {
                bitmap = lruCache.get(strA0o);
            }
            if (bitmap != null) {
                return bitmap;
            }
            String path = uri.getPath();
            if (path == null || (bitmapDecodeFile = BitmapFactory.decodeFile(path)) == null) {
                return null;
            }
            synchronized (lruCache) {
                lruCache.put(strA0o, bitmapDecodeFile);
            }
            return bitmapDecodeFile;
        } catch (Exception e) {
            C3cG.A1G("Failed to load agent avatar: ", e.getMessage(), HatchAgentAvatarLoaderKt.TAG);
            return null;
        }
    }

    public final Bitmap loadCircularAvatar(AbstractC3358CGz abstractC3358CGz, int i) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        Bitmap bitmapLoadSourceAvatar = loadSourceAvatar(abstractC3358CGz);
        if (bitmapLoadSourceAvatar == null) {
            return null;
        }
        return toCircularBitmap$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(bitmapLoadSourceAvatar, i);
    }

    public final Bitmap toCircularBitmap$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(Bitmap bitmap, int i) {
        C7384Etj.A0Y(bitmap, 0);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        float f = i / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        return bitmapCreateBitmap;
    }
}
