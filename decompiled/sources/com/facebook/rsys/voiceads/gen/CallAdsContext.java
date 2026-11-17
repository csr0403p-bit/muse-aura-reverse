package com.facebook.rsys.voiceads.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C8924Ftg;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallAdsContext {
    public static G50<CallAdsContext> CONVERTER = new C8924Ftg(11);
    public static long sMcfTypeId;
    public final String businessPhoneNumber;
    public final String userPhoneNumber;

    public static native CallAdsContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallAdsContext) {
                CallAdsContext callAdsContext = (CallAdsContext) obj;
                if (this.businessPhoneNumber.equals(callAdsContext.businessPhoneNumber)) {
                    String str = this.userPhoneNumber;
                    String str2 = callAdsContext.userPhoneNumber;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.businessPhoneNumber) + AnonymousClass006.A0G(this.userPhoneNumber);
    }

    public String toString() {
        return FGI.A0h("CallAdsContext{businessPhoneNumber=", this.businessPhoneNumber, ",userPhoneNumber=", this.userPhoneNumber, "}");
    }

    public CallAdsContext(String str, String str2) {
        str.getClass();
        this.businessPhoneNumber = str;
        this.userPhoneNumber = str2;
    }
}
