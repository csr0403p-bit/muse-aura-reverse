package com.facebook.aura.commands.photos;

import X.AII;
import X.AIM;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BqQ;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HxE;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import com.facebook.aura.commands.core.PhotoAccessUtils;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class DeviceMediaStoreReader {
    public static final DeviceMediaStoreReader INSTANCE = new DeviceMediaStoreReader();

    private final HxE<Double, Double> readLatLong(Context context, Uri uri) throws IOException {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(MediaStore.setRequireOriginal(uri));
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                double[] dArrA0f = new BqQ(inputStreamOpenInputStream).A0f();
                HxE<Double, Double> hxEA0r = dArrA0f != null ? C3cG.A0r(Double.valueOf(dArrA0f[0]), Double.valueOf(dArrA0f[1])) : null;
                inputStreamOpenInputStream.close();
                return hxEA0r;
            } finally {
            }
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static /* synthetic */ Object readPhotos$default(DeviceMediaStoreReader deviceMediaStoreReader, Context context, int i, int i2, String str, PhotoSource photoSource, boolean z, String str2, Long l, Long l2, HtJ htJ, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            str = null;
        }
        if ((i3 & 16) != 0) {
            photoSource = null;
        }
        if ((i3 & 32) != 0) {
            z = false;
        }
        if ((i3 & 64) != 0) {
            str2 = null;
        }
        if ((i3 & 128) != 0) {
            l = null;
        }
        if ((i3 & 256) != 0) {
            l2 = null;
        }
        return deviceMediaStoreReader.readPhotos(context, i, i2, str, photoSource, z, str2, l, l2, htJ);
    }

    public final Object readPhotos(Context context, int i, int i2, String str, PhotoSource photoSource, boolean z, String str2, Long l, Long l2, HtJ<? super PhotoSearchPayload> htJ) {
        Cursor cursorQuery;
        int i3;
        boolean z2;
        Double d;
        Double d2;
        List<String> relativePathPrefixes;
        PhotoAccessUtils photoAccessUtils = PhotoAccessUtils.INSTANCE;
        boolean zIsMediaLocationGranted = photoAccessUtils.isMediaLocationGranted(context);
        PhotoAccessScope photoAccessScope = photoAccessUtils.isFullLibraryGranted(context) ? PhotoAccessScope.FULL : PhotoAccessScope.SELECTED;
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = i4 >= 30;
        AII aiiA17 = AIM.A17();
        aiiA17.add("_id");
        aiiA17.add("_display_name");
        aiiA17.add(PhotosSearchHandlerKt.PARAM_MIME_TYPE);
        aiiA17.add("_size");
        aiiA17.add(HatchWebPageParserKt.WIDTH_ATTR);
        aiiA17.add(HatchWebPageParserKt.HEIGHT_ATTR);
        aiiA17.add("datetaken");
        aiiA17.add("date_modified");
        aiiA17.add("bucket_display_name");
        aiiA17.add("relative_path");
        if (z3) {
            aiiA17.add("is_favorite");
        }
        String[] strArr = (String[]) AIM.A18(aiiA17).toArray(new String[0]);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        if (str != null && !C7BY.A0j(str)) {
            arrayListA0h.add("bucket_display_name LIKE ? ESCAPE '\\'");
            arrayListA0h2.add(FGI.A0U("%", DeviceMediaStoreReaderKt.escapeLikeLiteral(str), "%"));
        }
        if (photoSource != null && (relativePathPrefixes = photoSource.getRelativePathPrefixes()) != null && !relativePathPrefixes.isEmpty()) {
            arrayListA0h.add(AbstractC0878AGe.A0L(" OR ", "(", ")", relativePathPrefixes, DeviceMediaStoreReader$readPhotos$3$1.INSTANCE));
            Iterator<String> it = relativePathPrefixes.iterator();
            while (it.hasNext()) {
                arrayListA0h2.add(FGI.A0M(it.next(), "%"));
            }
        }
        if (z) {
            arrayListA0h.add("is_favorite = 1");
        }
        if (str2 != null && !C7BY.A0j(str2)) {
            arrayListA0h.add("mime_type = ?");
            arrayListA0h2.add(str2);
        }
        if (l != null) {
            C60R.A1F(l, "COALESCE(datetaken, date_modified * 1000) >= ?", arrayListA0h, arrayListA0h2);
        }
        if (l2 != null) {
            C60R.A1F(l2, "COALESCE(datetaken, date_modified * 1000) <= ?", arrayListA0h, arrayListA0h2);
        }
        String strA01 = AbstractC06907md.A01(" AND ", arrayListA0h, null);
        if (strA01.length() == 0) {
            strA01 = null;
        }
        String[] strArr2 = !arrayListA0h2.isEmpty() ? (String[]) arrayListA0h2.toArray(new String[0]) : null;
        ArrayList arrayListA0h3 = C3cG.A0h();
        if (i4 >= 30) {
            Bundle bundle = new Bundle();
            if (strA01 != null) {
                bundle.putString("android:query-arg-sql-selection", strA01);
            }
            if (strArr2 != null) {
                bundle.putStringArray("android:query-arg-sql-selection-args", strArr2);
            }
            bundle.putString("android:query-arg-sql-sort-order", "COALESCE(datetaken, date_modified * 1000) DESC");
            bundle.putInt("android:query-arg-limit", i + 1);
            bundle.putInt("android:query-arg-offset", i2);
            cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, bundle, null);
            i3 = 0;
        } else {
            cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, strA01, strArr2, "COALESCE(datetaken, date_modified * 1000) DESC");
            i3 = i2;
        }
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(PhotosSearchHandlerKt.PARAM_MIME_TYPE);
                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("_size");
                int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow(HatchWebPageParserKt.WIDTH_ATTR);
                int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow(HatchWebPageParserKt.HEIGHT_ATTR);
                int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("datetaken");
                int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("date_modified");
                int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("bucket_display_name");
                int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("relative_path");
                int columnIndexOrThrow11 = z3 ? cursorQuery.getColumnIndexOrThrow("is_favorite") : -1;
                int i5 = 0;
                while (true) {
                    if (!cursorQuery.moveToNext()) {
                        z2 = false;
                        break;
                    }
                    if (i5 < i3) {
                        i5++;
                    } else {
                        if (arrayListA0h3.size() == i) {
                            z2 = true;
                            break;
                        }
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        boolean zIsNull = cursorQuery.isNull(columnIndexOrThrow7);
                        boolean z4 = !zIsNull;
                        long j2 = !zIsNull ? cursorQuery.getLong(columnIndexOrThrow7) : cursorQuery.getLong(columnIndexOrThrow8) * 1000;
                        String string = cursorQuery.getString(columnIndexOrThrow9);
                        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j);
                        C7384Etj.A0U(uriWithAppendedId);
                        HxE<Double, Double> latLong = zIsMediaLocationGranted ? INSTANCE.readLatLong(context, uriWithAppendedId) : null;
                        String string2 = uriWithAppendedId.toString();
                        C7384Etj.A0U(string2);
                        String string3 = cursorQuery.getString(columnIndexOrThrow2);
                        String string4 = cursorQuery.getString(columnIndexOrThrow3);
                        long j3 = cursorQuery.getLong(columnIndexOrThrow4);
                        int i6 = cursorQuery.getInt(columnIndexOrThrow5);
                        int i7 = cursorQuery.getInt(columnIndexOrThrow6);
                        long j4 = cursorQuery.getLong(columnIndexOrThrow8);
                        PhotoSource photoSourceFromRelativePath = PhotoSource.Companion.fromRelativePath(cursorQuery.getString(columnIndexOrThrow10));
                        Boolean boolValueOf = columnIndexOrThrow11 >= 0 ? Boolean.valueOf(AnonymousClass002.A1Q(cursorQuery.getInt(columnIndexOrThrow11), 1)) : null;
                        if (latLong != null) {
                            d = latLong.first;
                            d2 = latLong.second;
                        } else {
                            d = null;
                            d2 = null;
                        }
                        arrayListA0h3.add(new PhotoEntry(j, string2, string3, string4, j3, i6, i7, j2, z4, j4, string, photoSourceFromRelativePath, boolValueOf, d, d2));
                    }
                }
                cursorQuery.close();
            } finally {
            }
        } else {
            z2 = false;
        }
        StringBuilder sbA0y = C60O.A0y("photos.search read ", arrayListA0h3.size());
        sbA0y.append(" photos (offset=");
        sbA0y.append(i2);
        sbA0y.append(", hasMore=");
        sbA0y.append(z2);
        sbA0y.append(", scope=");
        sbA0y.append(photoAccessScope);
        CFK.A05(DeviceMediaStoreReaderKt.TAG, AnonymousClass001.A0v(")", sbA0y));
        return new PhotoSearchPayload("android", System.currentTimeMillis(), photoAccessScope, zIsMediaLocationGranted, z2, i2, arrayListA0h3);
    }
}
