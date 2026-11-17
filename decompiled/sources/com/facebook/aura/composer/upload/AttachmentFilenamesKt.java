package com.facebook.aura.composer.upload;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7BY;
import X.FGI;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class AttachmentFilenamesKt {
    public static final String queryDisplayName(Context context, Uri uri) {
        int columnIndex;
        AnonymousClass003.A0u(context, uri);
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    String string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) ? null : cursorQuery.getString(columnIndex);
                    cursorQuery.close();
                    return string;
                } finally {
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (RuntimeException unused) {
        }
        return null;
    }

    public static final String resolveAttachmentFilename(Context context, Uri uri, String str) {
        String extensionFromMimeType;
        AnonymousClass005.A0x(context, uri, str);
        String strQueryDisplayName = queryDisplayName(context, uri);
        if (strQueryDisplayName == null) {
            strQueryDisplayName = "file";
        }
        return (C7BY.A0k(strQueryDisplayName, '.') || (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str)) == null || extensionFromMimeType.length() == 0) ? strQueryDisplayName : FGI.A0U(strQueryDisplayName, ".", extensionFromMimeType);
    }
}
