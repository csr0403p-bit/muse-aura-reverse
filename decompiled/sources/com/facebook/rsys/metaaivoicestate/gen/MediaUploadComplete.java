package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MediaUploadComplete {
    public static G50<MediaUploadComplete> CONVERTER = C8921Ftd.A00(31);
    public static long sMcfTypeId;
    public final ArrayList<String> failedToFetchMediaIds;

    public static native MediaUploadComplete createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaUploadComplete) {
                ArrayList<String> arrayList = this.failedToFetchMediaIds;
                ArrayList<String> arrayList2 = ((MediaUploadComplete) obj).failedToFetchMediaIds;
                if (arrayList != null ? !arrayList.equals(arrayList2) : arrayList2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0D(this.failedToFetchMediaIds);
    }

    public String toString() {
        return BV8.A0v(this.failedToFetchMediaIds, C60O.A0x("MediaUploadComplete{failedToFetchMediaIds="));
    }

    public MediaUploadComplete(ArrayList<String> arrayList) {
        this.failedToFetchMediaIds = arrayList;
    }
}
