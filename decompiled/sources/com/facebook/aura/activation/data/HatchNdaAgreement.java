package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchNdaAgreement extends C06G {
    public final String agreementStatus;
    public final String companyName;
    public final String email;
    public final String mode;
    public final String name;
    public final String recipientViewId;
    public final List<String> requiredFields;
    public final String termText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNdaAgreement) {
                HatchNdaAgreement hatchNdaAgreement = (HatchNdaAgreement) obj;
                if (!C7384Etj.areEqual(this.recipientViewId, hatchNdaAgreement.recipientViewId) || !C7384Etj.areEqual(this.agreementStatus, hatchNdaAgreement.agreementStatus) || !C7384Etj.areEqual(this.mode, hatchNdaAgreement.mode) || !C7384Etj.areEqual(this.termText, hatchNdaAgreement.termText) || !C7384Etj.areEqual(this.requiredFields, hatchNdaAgreement.requiredFields) || !C7384Etj.areEqual(this.name, hatchNdaAgreement.name) || !C7384Etj.areEqual(this.email, hatchNdaAgreement.email) || !C7384Etj.areEqual(this.companyName, hatchNdaAgreement.companyName)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchNdaAgreement copy$default(HatchNdaAgreement hatchNdaAgreement, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchNdaAgreement.recipientViewId;
        }
        if ((i & 2) != 0) {
            str2 = hatchNdaAgreement.agreementStatus;
        }
        if ((i & 4) != 0) {
            str3 = hatchNdaAgreement.mode;
        }
        if ((i & 8) != 0) {
            str4 = hatchNdaAgreement.termText;
        }
        if ((i & 16) != 0) {
            list = hatchNdaAgreement.requiredFields;
        }
        if ((i & 32) != 0) {
            str5 = hatchNdaAgreement.name;
        }
        if ((i & 64) != 0) {
            str6 = hatchNdaAgreement.email;
        }
        if ((i & 128) != 0) {
            str7 = hatchNdaAgreement.companyName;
        }
        return hatchNdaAgreement.copy(str, str2, str3, str4, list, str5, str6, str7);
    }

    public final String component1() {
        return this.recipientViewId;
    }

    public final String component2() {
        return this.agreementStatus;
    }

    public final String component3() {
        return this.mode;
    }

    public final String component4() {
        return this.termText;
    }

    public final List<String> component5() {
        return this.requiredFields;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.email;
    }

    public final String component8() {
        return this.companyName;
    }

    public final String getAgreementStatus() {
        return this.agreementStatus;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRecipientViewId() {
        return this.recipientViewId;
    }

    public final List<String> getRequiredFields() {
        return this.requiredFields;
    }

    public final String getTermText() {
        return this.termText;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.requiredFields, AnonymousClass005.A0I(this.termText, AnonymousClass005.A0I(this.mode, AnonymousClass005.A0I(this.agreementStatus, AnonymousClass001.A0G(this.recipientViewId))))) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.email)) * 31) + AnonymousClass005.A0H(this.companyName);
    }

    public HatchNdaAgreement(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7) {
        AnonymousClass005.A17(str, str2, str3, str4, list);
        this.recipientViewId = str;
        this.agreementStatus = str2;
        this.mode = str3;
        this.termText = str4;
        this.requiredFields = list;
        this.name = str5;
        this.email = str6;
        this.companyName = str7;
    }

    public final HatchNdaAgreement copy(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7) {
        AnonymousClass005.A17(str, str2, str3, str4, list);
        return new HatchNdaAgreement(str, str2, str3, str4, list, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }
}
