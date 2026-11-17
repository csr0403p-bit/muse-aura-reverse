package com.facebook.aura.file.utils;

import X.AbstractC3422CMk;
import X.AnonymousClass005;
import X.C7384Etj;
import X.FGI;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class MarkdownPdfRenderer {
    public static final int $stable = 0;
    public static final MarkdownPdfRenderer INSTANCE = new MarkdownPdfRenderer();
    public static final String TAG = "MarkdownPdfRenderer";

    public final Uri saveToDownloads(Context context, String str, String str2, byte[] bArr) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(str, str2, bArr, 1);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put(PhotosSearchHandlerKt.PARAM_MIME_TYPE, str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null || (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) == null) {
                return null;
            }
            try {
                outputStreamOpenOutputStream.write(bArr);
                outputStreamOpenOutputStream.close();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("is_pending", (Integer) 0);
                context.getContentResolver().update(uriInsert, contentValues2, null, null);
                return uriInsert;
            } finally {
            }
        } catch (Exception e) {
            AbstractC3422CMk.A05(TAG, FGI.A0M("Failed to save file to Downloads: ", e.getMessage()), e);
            return null;
        }
    }
}
