package com.facebook.aura.commands.photos;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BqQ;
import X.C3cG;
import X.C3cI;
import X.C60P;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class PhotoBitmaps {
    public static final PhotoBitmaps INSTANCE = new PhotoBitmaps();

    public final int exifRotationDegrees(Context context, Uri uri) throws IOException {
        int i;
        boolean zA1a = AnonymousClass002.A1a(context, uri);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    int iA0b = new BqQ(inputStreamOpenInputStream).A0b("Orientation", zA1a ? 1 : 0);
                    if (iA0b == 3) {
                        i = 180;
                    } else if (iA0b != 6) {
                        i = 270;
                        if (iA0b != 8) {
                            i = 0;
                        }
                    } else {
                        i = 90;
                    }
                    inputStreamOpenInputStream.close();
                    return i;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public final int sampleSizeFor$fbandroid_express_aura_java_com_facebook_aura_commands_photos_photos(int i, int i2, int i3) {
        int i4 = 1;
        while (true) {
            int i5 = i4 * 2;
            if (i / i5 < i3 && i2 / i5 < i3) {
                return i4;
            }
            i4 = i5;
        }
    }

    public static /* synthetic */ Bitmap centerCropSquare$default(PhotoBitmaps photoBitmaps, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 256;
        }
        return photoBitmaps.centerCropSquare(bitmap, i);
    }

    public static /* synthetic */ Bitmap decodeBounded$default(PhotoBitmaps photoBitmaps, Context context, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 512;
        }
        return photoBitmaps.decodeBounded(context, uri, i);
    }

    public static /* synthetic */ Bitmap loadThumbnail$default(PhotoBitmaps photoBitmaps, Context context, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 256;
        }
        return photoBitmaps.loadThumbnail(context, uri, i);
    }

    public final Bitmap centerCropSquare(Bitmap bitmap, int i) {
        String strA0M;
        C7384Etj.A0Y(bitmap, 0);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (iMin > 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
                C7384Etj.A0U(bitmapCreateBitmap);
                if (iMin <= i) {
                    return bitmapCreateBitmap;
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i, true);
                if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                    bitmapCreateBitmap.recycle();
                }
                C7384Etj.A0X(bitmapCreateScaledBitmap);
                return bitmapCreateScaledBitmap;
            } catch (OutOfMemoryError unused) {
                strA0M = "centerCropSquare ran out of memory";
                CFK.A06(PhotoBitmapsKt.TAG, strA0M);
                return bitmap;
            } catch (RuntimeException e) {
                strA0M = FGI.A0M("centerCropSquare failed: ", e.getMessage());
                CFK.A06(PhotoBitmapsKt.TAG, strA0M);
                return bitmap;
            }
        }
        return bitmap;
    }

    public final Bitmap decodeBounded(Context context, Uri uri, int i) throws IOException {
        boolean zA1Y = C60P.A1Y(context, uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = zA1Y;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    inputStreamOpenInputStream.close();
                } finally {
                }
            }
            if (options.outWidth > 0 && options.outHeight > 0) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = INSTANCE.sampleSizeFor$fbandroid_express_aura_java_com_facebook_aura_commands_photos_photos(options.outWidth, options.outHeight, i);
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                        inputStreamOpenInputStream.close();
                        return bitmapDecodeStream;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            CFK.A06(PhotoBitmapsKt.TAG, C60P.A1M(": ", e.getMessage(), C3cG.A0f(uri, "decodeBounded failed for ")));
            return null;
        } catch (OutOfMemoryError unused) {
            CFK.A06(PhotoBitmapsKt.TAG, AnonymousClass007.A0a("decodeBounded ran out of memory for ", uri));
            return null;
        }
    }

    public final Bitmap loadThumbnail(Context context, Uri uri, int i) throws IOException {
        AnonymousClass003.A0u(context, uri);
        Bitmap bitmapLoadThumbnail = null;
        try {
            bitmapLoadThumbnail = context.getContentResolver().loadThumbnail(uri, new Size(i, i), null);
            return bitmapLoadThumbnail;
        } catch (Exception e) {
            CFK.A06(PhotoBitmapsKt.TAG, FGI.A0U("loadThumbnail unavailable (", C3cI.A0Y(e), "); falling back to decode"));
            return bitmapLoadThumbnail;
        } catch (OutOfMemoryError unused) {
            CFK.A06(PhotoBitmapsKt.TAG, AnonymousClass007.A0a("loadThumbnail ran out of memory for ", uri));
            return bitmapLoadThumbnail;
        }
    }
}
