package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass006;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UgcBotChangeResult {
    public static G50<UgcBotChangeResult> CONVERTER = C8922Fte.A00(5);
    public static long sMcfTypeId;
    public final String error;
    public final int reqId;
    public final int statusCode;

    public static native UgcBotChangeResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UgcBotChangeResult) {
                UgcBotChangeResult ugcBotChangeResult = (UgcBotChangeResult) obj;
                if (this.reqId == ugcBotChangeResult.reqId && this.statusCode == ugcBotChangeResult.statusCode) {
                    String str = this.error;
                    String str2 = ugcBotChangeResult.error;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.reqId) * 31) + this.statusCode) * 31) + AnonymousClass006.A0G(this.error);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("UgcBotChangeResult{reqId=");
        sbA0x.append(this.reqId);
        sbA0x.append(",statusCode=");
        sbA0x.append(this.statusCode);
        sbA0x.append(",error=");
        return AbstractC7610F5x.A0w(this.error, sbA0x);
    }

    public UgcBotChangeResult(int i, int i2, String str) {
        this.reqId = i;
        this.statusCode = i2;
        this.error = str;
    }
}
