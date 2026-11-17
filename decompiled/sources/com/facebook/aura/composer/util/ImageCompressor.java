package com.facebook.aura.composer.util;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BqQ;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.CFP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.file.core.HatchLocalFileStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ImageCompressor {
    public static final int DEFAULT_MAX_LONG_EDGE_PX = 2048;
    public static final int IMAGE_COMPRESSION_QUALITY = 85;
    public static final int MIN_COMPRESSION_QUALITY = 40;
    public static final int MIN_LONG_EDGE_PX = 512;
    public static final ImageCompressor INSTANCE = new ImageCompressor();
    public static final String[] EXIF_TAGS_TO_PRESERVE = {"GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSAltitude", "GPSAltitudeRef", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "Make", "Model", "LensModel", "FocalLength", "FNumber", "ApertureValue", "ExposureTime", "PhotographicSensitivity", "ImageUniqueID", "Artist", "Copyright", "UserComment"};

    private final int exifRotationDegrees(Context context, Uri uri) throws IOException {
        int i;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    int iA0b = new BqQ(inputStreamOpenInputStream).A0b("Orientation", 1);
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

    private final Bitmap rotate(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrixA08 = BV4.A08();
        matrixA08.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrixA08, true);
        C7384Etj.A0U(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public final Bitmap bytesToBitmap(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public final byte[] compressToTarget(Bitmap bitmap, long j, int i) {
        C7384Etj.A0Y(bitmap, 0);
        Bitmap bitmapDownscaleLongEdge = downscaleLongEdge(bitmap, i);
        int i2 = 85;
        byte[] bArrEncodeJpeg = encodeJpeg(bitmapDownscaleLongEdge, 85);
        while (bArrEncodeJpeg.length > j && Math.max(bitmapDownscaleLongEdge.getWidth(), bitmapDownscaleLongEdge.getHeight()) > 512) {
            Bitmap bitmapScaleBy = scaleBy(bitmapDownscaleLongEdge, 0.8f);
            if (bitmapDownscaleLongEdge != bitmap) {
                bitmapDownscaleLongEdge.recycle();
            }
            bArrEncodeJpeg = encodeJpeg(bitmapScaleBy, 85);
            bitmapDownscaleLongEdge = bitmapScaleBy;
        }
        while (bArrEncodeJpeg.length > j && i2 > 40) {
            i2 -= 10;
            bArrEncodeJpeg = encodeJpeg(bitmapDownscaleLongEdge, i2);
        }
        if (bitmapDownscaleLongEdge != bitmap) {
            bitmapDownscaleLongEdge.recycle();
        }
        return bArrEncodeJpeg;
    }

    public static /* synthetic */ byte[] compressToTarget$default(ImageCompressor imageCompressor, Bitmap bitmap, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2048;
        }
        return imageCompressor.compressToTarget(bitmap, j, i);
    }

    public static /* synthetic */ byte[] compressUriToTarget$default(ImageCompressor imageCompressor, Context context, Uri uri, long j, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 2048;
        }
        return imageCompressor.compressUriToTarget(context, uri, j, i);
    }

    public static /* synthetic */ Bitmap decodeBounded$default(ImageCompressor imageCompressor, Context context, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2048;
        }
        return imageCompressor.decodeBounded(context, uri, i);
    }

    private final Bitmap downscaleLongEdge(Bitmap bitmap, int i) {
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        return iMax > i ? scaleBy(bitmap, i / iMax) : bitmap;
    }

    private final byte[] encodeJpeg(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStreamA0F);
        return C7384Etj.A0d(byteArrayOutputStreamA0F);
    }

    private final Bitmap scaleBy(Bitmap bitmap, float f) {
        int width = (int) (bitmap.getWidth() * f);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmap.getHeight() * f);
        if (height < 1) {
            height = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    public final byte[] compressUriToTarget(Context context, Uri uri, long j, int i) throws IOException {
        AnonymousClass003.A0u(context, uri);
        Map<String, String> exifFromUri = readExifFromUri(context, uri);
        int iExifRotationDegrees = exifRotationDegrees(context, uri);
        Bitmap bitmapDecodeBounded = decodeBounded(context, uri, i);
        if (bitmapDecodeBounded == null) {
            return null;
        }
        Bitmap bitmapRotate = rotate(bitmapDecodeBounded, iExifRotationDegrees);
        byte[] bArrCompressToTarget = compressToTarget(bitmapRotate, j, i);
        if (bitmapRotate != bitmapDecodeBounded) {
            bitmapRotate.recycle();
        }
        return writeExifToBytes(context, bArrCompressToTarget, exifFromUri);
    }

    public final int computeInSampleSize$fbandroid_express_aura_java_com_facebook_aura_composer_util_util(int i, int i2, int i3) {
        int iMax = Math.max(i, i2);
        int i4 = 1;
        while (true) {
            iMax /= 2;
            if (iMax < i3) {
                return i4;
            }
            i4 *= 2;
        }
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
                options2.inSampleSize = INSTANCE.computeInSampleSize$fbandroid_express_aura_java_com_facebook_aura_composer_util_util(options.outWidth, options.outHeight, i);
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
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    public final Map<String, String> readExifFromUri(Context context, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        AnonymousClass003.A0u(context, uri);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        try {
            try {
                context = context.getContentResolver().openInputStream(MediaStore.setRequireOriginal(uri));
                inputStreamOpenInputStream = context;
            } catch (UnsupportedOperationException unused) {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            }
        } catch (Exception unused2) {
        }
        if (inputStreamOpenInputStream != null) {
            try {
                BqQ bqQ = new BqQ(inputStreamOpenInputStream);
                String[] strArr = EXIF_TAGS_TO_PRESERVE;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str = strArr[i];
                    String strA0c = bqQ.A0c(str);
                    if (strA0c != null) {
                        String str2 = C7BY.A0j(strA0c) ? null : strA0c;
                        if (str2 != null) {
                            linkedHashMapA0j.put(str, str2);
                        }
                    }
                    i++;
                }
                inputStreamOpenInputStream.close();
                if (!linkedHashMapA0j.containsKey("GPSLatitude") || !linkedHashMapA0j.containsKey("GPSLatitudeRef") || !linkedHashMapA0j.containsKey("GPSLongitude") || !linkedHashMapA0j.containsKey("GPSLongitudeRef")) {
                    linkedHashMapA0j.remove("GPSLatitude");
                    linkedHashMapA0j.remove("GPSLatitudeRef");
                    linkedHashMapA0j.remove("GPSLongitude");
                    linkedHashMapA0j.remove("GPSLongitudeRef");
                    linkedHashMapA0j.remove("GPSAltitude");
                    linkedHashMapA0j.remove("GPSAltitudeRef");
                    return linkedHashMapA0j;
                }
            } finally {
            }
        }
        return linkedHashMapA0j;
    }

    public final byte[] writeExifToBytes(Context context, byte[] bArr, Map<String, String> map) {
        AnonymousClass005.A0x(context, bArr, map);
        if (map.isEmpty()) {
            return bArr;
        }
        HatchLocalFileStore hatchLocalFileStore = HatchLocalFileStore.INSTANCE;
        File fileNewCacheTempFile = hatchLocalFileStore.newCacheTempFile(context, "exif", "hatch_exif_", AuraBugReportSender.DEFAULT_IMAGE_EXTENSION);
        try {
            hatchLocalFileStore.writeBytes(fileNewCacheTempFile, bArr);
            boolean z = BqQ.A0M;
            BqQ bqQ = new BqQ(fileNewCacheTempFile.getAbsolutePath());
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                bqQ.A0e(C60O.A0t(entryA0l), (String) entryA0l.getValue());
            }
            bqQ.A0d();
            return CFP.A07(fileNewCacheTempFile);
        } finally {
            fileNewCacheTempFile.delete();
        }
    }
}
