package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AipRecordingResult {
    public static G50<AipRecordingResult> CONVERTER = C8921Ftd.A00(17);
    public static long sMcfTypeId;
    public final int currentSection;
    public final int status;

    public static native AipRecordingResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AipRecordingResult) {
                AipRecordingResult aipRecordingResult = (AipRecordingResult) obj;
                if (this.status != aipRecordingResult.status || this.currentSection != aipRecordingResult.currentSection) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.status) * 31) + this.currentSection;
    }

    public String toString() {
        return FGI.A0Y("AipRecordingResult{status=", ",currentSection=", "}", this.status, this.currentSection);
    }

    public AipRecordingResult(int i, int i2) {
        this.status = i;
        this.currentSection = i2;
    }
}
