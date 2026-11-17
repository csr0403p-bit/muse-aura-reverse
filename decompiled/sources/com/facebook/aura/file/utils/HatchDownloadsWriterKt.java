package com.facebook.aura.file.utils;

import X.AbstractC3422CMk;
import X.AnonymousClass005;
import X.C7384Etj;
import X.CFL;
import X.FGI;
import X.G0U;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class HatchDownloadsWriterKt {
    public static final String TAG = "HatchDownloadsWriter";

    public static final Uri writeToDownloads(Context context, String str, String str2, G0U<? super OutputStream, Unit> g0u) throws IOException {
        Uri uriInsert;
        Unit unit;
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(str, str2, g0u, 1);
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put(PhotosSearchHandlerKt.PARAM_MIME_TYPE, str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            contentValues.put("is_pending", (Integer) 1);
            uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                AbstractC3422CMk.A04(TAG, FGI.A0M("Could not create a Downloads entry for ", str));
                return null;
            }
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        g0u.invoke(outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.close();
                        unit = Unit.INSTANCE;
                    } finally {
                    }
                } else {
                    unit = null;
                }
                if (unit == null) {
                    rollBack(context, uriInsert);
                    return null;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("is_pending", (Integer) 0);
                contentResolver.update(uriInsert, contentValues2, null, null);
                return uriInsert;
            } catch (Exception e) {
                e = e;
                String strA0U = FGI.A0U("Failed to save ", str, " to Downloads");
                CFL cfl = AbstractC3422CMk.A00;
                if (cfl.AOg(5)) {
                    cfl.w(TAG, strA0U, e);
                }
                if (uriInsert != null) {
                    rollBack(context, uriInsert);
                }
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            uriInsert = null;
        }
    }

    public static final void rollBack(Context context, Uri uri) {
        try {
            context.getContentResolver().delete(uri, null, null);
        } catch (Exception e) {
            CFL cfl = AbstractC3422CMk.A00;
            if (cfl.AOg(5)) {
                cfl.w(TAG, "Failed to roll back a pending Downloads entry", e);
            }
        }
    }
}
