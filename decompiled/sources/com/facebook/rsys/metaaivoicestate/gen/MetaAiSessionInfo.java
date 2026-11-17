package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiSessionInfo {
    public static G50<MetaAiSessionInfo> CONVERTER = C8921Ftd.A00(36);
    public static long sMcfTypeId;
    public final AipRecordingResult aipRecordingResult;
    public final String errorMsg;
    public final MediaUploadComplete mediaUploadComplete;
    public final String threadId;

    public static native MetaAiSessionInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiSessionInfo) {
                MetaAiSessionInfo metaAiSessionInfo = (MetaAiSessionInfo) obj;
                String str = this.threadId;
                String str2 = metaAiSessionInfo.threadId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.errorMsg;
                    String str4 = metaAiSessionInfo.errorMsg;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    AipRecordingResult aipRecordingResult = this.aipRecordingResult;
                    AipRecordingResult aipRecordingResult2 = metaAiSessionInfo.aipRecordingResult;
                    if (aipRecordingResult == null) {
                        if (aipRecordingResult2 != null) {
                            return false;
                        }
                    } else if (aipRecordingResult.equals(aipRecordingResult2)) {
                    }
                    MediaUploadComplete mediaUploadComplete = this.mediaUploadComplete;
                    MediaUploadComplete mediaUploadComplete2 = metaAiSessionInfo.mediaUploadComplete;
                    if (mediaUploadComplete == null) {
                        if (mediaUploadComplete2 != null) {
                            return false;
                        }
                    } else if (mediaUploadComplete.equals(mediaUploadComplete2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.threadId)) + AnonymousClass006.A0G(this.errorMsg)) * 31) + AnonymousClass006.A0D(this.aipRecordingResult)) * 31) + C3cH.A02(this.mediaUploadComplete);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiSessionInfo{threadId=");
        sbA0x.append(this.threadId);
        sbA0x.append(",errorMsg=");
        sbA0x.append(this.errorMsg);
        sbA0x.append(",aipRecordingResult=");
        sbA0x.append(this.aipRecordingResult);
        sbA0x.append(",mediaUploadComplete=");
        return BV8.A0v(this.mediaUploadComplete, sbA0x);
    }

    public MetaAiSessionInfo(String str, String str2, AipRecordingResult aipRecordingResult, MediaUploadComplete mediaUploadComplete) {
        this.threadId = str;
        this.errorMsg = str2;
        this.aipRecordingResult = aipRecordingResult;
        this.mediaUploadComplete = mediaUploadComplete;
    }
}
