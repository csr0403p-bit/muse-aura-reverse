package com.facebook.rsys.filelogging.gen;

import X.BV8;
import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LogFileData {
    public static G50<LogFileData> CONVERTER = C8925Fth.A00(36);
    public static long sMcfTypeId;
    public final boolean isStreamValid;
    public final String line;

    public static native LogFileData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LogFileData) {
                LogFileData logFileData = (LogFileData) obj;
                if (!this.line.equals(logFileData.line) || this.isStreamValid != logFileData.isStreamValid) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.line) + (this.isStreamValid ? 1 : 0);
    }

    public String toString() {
        return FGI.A0n("LogFileData{line=", this.line, ",isStreamValid=", "}", this.isStreamValid);
    }

    public LogFileData(String str, boolean z) {
        str.getClass();
        this.line = str;
        this.isStreamValid = z;
    }
}
