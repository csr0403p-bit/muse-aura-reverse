package com.facebook.rsys.voiceads.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C60R;
import X.C8924Ftg;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LeadAdsContext {
    public static G50<LeadAdsContext> CONVERTER = new C8924Ftg(12);
    public static long sMcfTypeId;
    public final String businessPhoneNumber;
    public final long leadId;
    public final String userPhoneNumber;

    public static native LeadAdsContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadAdsContext) {
                LeadAdsContext leadAdsContext = (LeadAdsContext) obj;
                if (this.businessPhoneNumber.equals(leadAdsContext.businessPhoneNumber) && this.leadId == leadAdsContext.leadId) {
                    String str = this.userPhoneNumber;
                    String str2 = leadAdsContext.userPhoneNumber;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C60R.A00(this.leadId, BV8.A0B(this.businessPhoneNumber)) + AnonymousClass006.A0G(this.userPhoneNumber);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("LeadAdsContext{businessPhoneNumber=");
        sbA0x.append(this.businessPhoneNumber);
        sbA0x.append(",leadId=");
        sbA0x.append(this.leadId);
        sbA0x.append(",userPhoneNumber=");
        return AbstractC7610F5x.A0w(this.userPhoneNumber, sbA0x);
    }

    public LeadAdsContext(String str, long j, String str2) {
        str.getClass();
        this.businessPhoneNumber = str;
        this.leadId = j;
        this.userPhoneNumber = str2;
    }
}
