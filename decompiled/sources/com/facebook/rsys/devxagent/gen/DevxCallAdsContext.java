package com.facebook.rsys.devxagent.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DevxCallAdsContext {
    public static G50<DevxCallAdsContext> CONVERTER = C8925Fth.A00(14);
    public static long sMcfTypeId;
    public final String businessPhoneNumber;
    public final String userPhoneNumber;

    public static native DevxCallAdsContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevxCallAdsContext) {
                DevxCallAdsContext devxCallAdsContext = (DevxCallAdsContext) obj;
                if (this.businessPhoneNumber.equals(devxCallAdsContext.businessPhoneNumber)) {
                    String str = this.userPhoneNumber;
                    String str2 = devxCallAdsContext.userPhoneNumber;
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
        return FGI.A0h("DevxCallAdsContext{businessPhoneNumber=", this.businessPhoneNumber, ",userPhoneNumber=", this.userPhoneNumber, "}");
    }

    public DevxCallAdsContext(String str, String str2) {
        str.getClass();
        this.businessPhoneNumber = str;
        this.userPhoneNumber = str2;
    }
}
