package com.facebook.rsys.devxagent.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DumpappResult {
    public static G50<DumpappResult> CONVERTER = C8925Fth.A00(18);
    public static long sMcfTypeId;
    public final int exitCode;
    public final String stdErr;
    public final String stdOut;

    public static native DumpappResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DumpappResult) {
                DumpappResult dumpappResult = (DumpappResult) obj;
                if (!this.stdOut.equals(dumpappResult.stdOut) || !this.stdErr.equals(dumpappResult.stdErr) || this.exitCode != dumpappResult.exitCode) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.stdErr, BV8.A0B(this.stdOut)) + this.exitCode;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DumpappResult{stdOut=");
        sbA0x.append(this.stdOut);
        sbA0x.append(",stdErr=");
        sbA0x.append(this.stdErr);
        sbA0x.append(",exitCode=");
        return BV8.A0z(sbA0x, this.exitCode);
    }

    public DumpappResult(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.stdOut = str;
        this.stdErr = str2;
        this.exitCode = i;
    }
}
