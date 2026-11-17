package com.facebook.aura.ccv.nativeflow;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface CcvStefiPath extends StefiHatchPath.Extension {

    public final class AgeConfirmationLinkingOptions implements CcvStefiPath {
        public static final AgeConfirmationLinkingOptions INSTANCE = new AgeConfirmationLinkingOptions();
        public static final String value = "/hatch/age_confirmation/linking_options";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AgeConfirmationLinkingOptions);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AgeConfirmationLinkingOptions";
        }

        public int hashCode() {
            return -926581005;
        }
    }

    public final class AgeConfirmationLinkingWebAuth extends C06G implements CcvStefiPath {
        public final String accountType;

        public AgeConfirmationLinkingWebAuth(String str) {
            C7384Etj.A0Y(str, 0);
            this.accountType = str;
        }

        public final AgeConfirmationLinkingWebAuth copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new AgeConfirmationLinkingWebAuth(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AgeConfirmationLinkingWebAuth) && C7384Etj.areEqual(this.accountType, ((AgeConfirmationLinkingWebAuth) obj).accountType));
        }

        public static /* synthetic */ AgeConfirmationLinkingWebAuth copy$default(AgeConfirmationLinkingWebAuth ageConfirmationLinkingWebAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ageConfirmationLinkingWebAuth.accountType;
            }
            C7384Etj.A0Y(str, 0);
            return new AgeConfirmationLinkingWebAuth(str);
        }

        public final String component1() {
            return this.accountType;
        }

        public final String getAccountType() {
            return this.accountType;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/age_confirmation/linking_web_auth?account_type=", this.accountType);
        }

        public int hashCode() {
            return this.accountType.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class AgeConfirmationLinkingWebAuthCompletion implements CcvStefiPath {
        public static final AgeConfirmationLinkingWebAuthCompletion INSTANCE = new AgeConfirmationLinkingWebAuthCompletion();
        public static final String value = "/hatch/age_confirmation/linking_web_auth_completion";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AgeConfirmationLinkingWebAuthCompletion);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AgeConfirmationLinkingWebAuthCompletion";
        }

        public int hashCode() {
            return 696463917;
        }
    }

    public final class CheckoutCardProcessingInfo implements CcvStefiPath {
        public static final CheckoutCardProcessingInfo INSTANCE = new CheckoutCardProcessingInfo();
        public static final String value = "/hatch/checkout/card-processing-info";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutCardProcessingInfo);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CheckoutCardProcessingInfo";
        }

        public int hashCode() {
            return 1387024110;
        }
    }

    public final class CheckoutCredential implements CcvStefiPath {
        public static final CheckoutCredential INSTANCE = new CheckoutCredential();
        public static final String value = "/hatch/checkout/credential";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutCredential);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CheckoutCredential";
        }

        public int hashCode() {
            return 1197208244;
        }
    }

    public final class CheckoutFinalize implements CcvStefiPath {
        public static final CheckoutFinalize INSTANCE = new CheckoutFinalize();
        public static final String value = "/hatch/checkout/finalize";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutFinalize);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CheckoutFinalize";
        }

        public int hashCode() {
            return -607790661;
        }
    }

    public final class CheckoutInit implements CcvStefiPath {
        public static final CheckoutInit INSTANCE = new CheckoutInit();
        public static final String value = "/hatch/checkout/init";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutInit);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CheckoutInit";
        }

        public int hashCode() {
            return -1136412371;
        }
    }
}
