package com.facebook.aura.commands.photos;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7BY;
import X.CFK;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.nodes.HatchNodeClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PhotoUploadEnqueuer {
    public static final PhotoUploadEnqueuer INSTANCE = new PhotoUploadEnqueuer();

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotoUploadEnqueuer", f = "PhotoUploadEnqueuer.kt", l = {52, LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "enqueue", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotoUploadEnqueuer$enqueue$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoUploadEnqueuer.this.enqueue(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c7 -> B:12:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f5 -> B:12:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object enqueue(android.content.Context r25, java.util.List<java.lang.Long> r26, java.lang.String r27, X.HtJ<? super com.facebook.aura.commands.photos.PhotoEnqueueResult> r28) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotoUploadEnqueuer.enqueue(android.content.Context, java.util.List, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final PhotoFileIdentity readFileIdentity(Context context, Uri uri) {
        AnonymousClass003.A0u(context, uri);
        try {
            PhotoFileIdentity photoFileIdentity = null;
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name", PhotosSearchHandlerKt.PARAM_MIME_TYPE, "_size", "date_modified"}, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    String strA0c = C60Q.A0c(cursorQuery, "_display_name");
                    if (strA0c == null || C7BY.A0j(strA0c)) {
                        strA0c = "photo.jpg";
                    }
                    photoFileIdentity = new PhotoFileIdentity(strA0c, C60Q.A0c(cursorQuery, PhotosSearchHandlerKt.PARAM_MIME_TYPE), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified")));
                }
                cursorQuery.close();
                return photoFileIdentity;
            } finally {
            }
        } catch (Exception e) {
            CFK.A06(PhotoUploadEnqueuerKt.TAG, C60P.A1M(": ", e.getMessage(), C3cG.A0f(uri, "Could not read ")));
            return null;
        }
    }

    public final String nodeIdentifier(AbstractC3358CGz abstractC3358CGz, Context context) {
        Object objA0s;
        AnonymousClass003.A0u(abstractC3358CGz, context);
        try {
            HatchNodeClient.Companion.getInstance(abstractC3358CGz, context);
            objA0s = C60O.A0l();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (String) objA0s;
    }
}
