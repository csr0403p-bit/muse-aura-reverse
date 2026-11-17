package com.facebook.rsys.devxagent.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DevxLeadAdsContext {
    public static G50<DevxLeadAdsContext> CONVERTER = C8925Fth.A00(16);
    public static long sMcfTypeId;
    public final String businessId;
    public final String businessPhoneNumber;
    public final long leadId;
    public final String userPhoneNumber;

    public static native DevxLeadAdsContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevxLeadAdsContext) {
                DevxLeadAdsContext devxLeadAdsContext = (DevxLeadAdsContext) obj;
                if (this.leadId == devxLeadAdsContext.leadId) {
                    String str = this.businessPhoneNumber;
                    String str2 = devxLeadAdsContext.businessPhoneNumber;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.businessId;
                        String str4 = devxLeadAdsContext.businessId;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        String str5 = this.userPhoneNumber;
                        String str6 = devxLeadAdsContext.userPhoneNumber;
                        if (str5 == null) {
                            if (str6 != null) {
                                return false;
                            }
                        } else if (str5.equals(str6)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC7608F5v.A02(AnonymousClass002.A0A(this.leadId)) + AnonymousClass006.A0G(this.businessPhoneNumber)) * 31) + AnonymousClass006.A0G(this.businessId)) * 31) + AnonymousClass005.A0H(this.userPhoneNumber);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevxLeadAdsContext{leadId=");
        sbA0x.append(this.leadId);
        sbA0x.append(",businessPhoneNumber=");
        sbA0x.append(this.businessPhoneNumber);
        sbA0x.append(",businessId=");
        sbA0x.append(this.businessId);
        sbA0x.append(",userPhoneNumber=");
        return AbstractC7610F5x.A0w(this.userPhoneNumber, sbA0x);
    }

    public DevxLeadAdsContext(long j, String str, String str2, String str3) {
        this.leadId = j;
        this.businessPhoneNumber = str;
        this.businessId = str2;
        this.userPhoneNumber = str3;
    }
}
