package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C7384Etj;
import android.content.Intent;

/* loaded from: classes2.dex */
public interface NativeLoginViewEffect {

    public final class CloseCheckpointWeb implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final CloseCheckpointWeb INSTANCE = new CloseCheckpointWeb();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseCheckpointWeb);
        }

        public String toString() {
            return "CloseCheckpointWeb";
        }

        public int hashCode() {
            return 2048395694;
        }
    }

    public final class LaunchSmsConsent extends C06G implements NativeLoginViewEffect {
        public static final int $stable = 8;
        public final Intent intent;

        public LaunchSmsConsent(Intent intent) {
            C7384Etj.A0Y(intent, 0);
            this.intent = intent;
        }

        public final LaunchSmsConsent copy(Intent intent) {
            C7384Etj.A0Y(intent, 0);
            return new LaunchSmsConsent(intent);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LaunchSmsConsent) && C7384Etj.areEqual(this.intent, ((LaunchSmsConsent) obj).intent));
        }

        public static /* synthetic */ LaunchSmsConsent copy$default(LaunchSmsConsent launchSmsConsent, Intent intent, int i, Object obj) {
            if ((i & 1) != 0) {
                intent = launchSmsConsent.intent;
            }
            C7384Etj.A0Y(intent, 0);
            return new LaunchSmsConsent(intent);
        }

        public final Intent component1() {
            return this.intent;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NavigateToAccountSelection implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToAccountSelection INSTANCE = new NavigateToAccountSelection();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToAccountSelection);
        }

        public String toString() {
            return "NavigateToAccountSelection";
        }

        public int hashCode() {
            return -1605556251;
        }
    }

    public final class NavigateToBirthday implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToBirthday INSTANCE = new NavigateToBirthday();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToBirthday);
        }

        public String toString() {
            return "NavigateToBirthday";
        }

        public int hashCode() {
            return 1501087363;
        }
    }

    public final class NavigateToCheckpoint implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToCheckpoint INSTANCE = new NavigateToCheckpoint();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToCheckpoint);
        }

        public String toString() {
            return "NavigateToCheckpoint";
        }

        public int hashCode() {
            return 2054869006;
        }
    }

    public final class NavigateToCheckpointWeb implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToCheckpointWeb INSTANCE = new NavigateToCheckpointWeb();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToCheckpointWeb);
        }

        public String toString() {
            return "NavigateToCheckpointWeb";
        }

        public int hashCode() {
            return 433774694;
        }
    }

    public final class NavigateToChosenTwoFactor implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToChosenTwoFactor INSTANCE = new NavigateToChosenTwoFactor();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToChosenTwoFactor);
        }

        public String toString() {
            return "NavigateToChosenTwoFactor";
        }

        public int hashCode() {
            return 1727677603;
        }
    }

    public final class NavigateToItemizedConsent implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToItemizedConsent INSTANCE = new NavigateToItemizedConsent();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToItemizedConsent);
        }

        public String toString() {
            return "NavigateToItemizedConsent";
        }

        public int hashCode() {
            return -1304954703;
        }
    }

    public final class NavigateToLinkingDisclosure implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToLinkingDisclosure INSTANCE = new NavigateToLinkingDisclosure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToLinkingDisclosure);
        }

        public String toString() {
            return "NavigateToLinkingDisclosure";
        }

        public int hashCode() {
            return 1048462447;
        }
    }

    public final class NavigateToName implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToName INSTANCE = new NavigateToName();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToName);
        }

        public String toString() {
            return "NavigateToName";
        }

        public int hashCode() {
            return -1801596527;
        }
    }

    public final class NavigateToNtpUpsell implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToNtpUpsell INSTANCE = new NavigateToNtpUpsell();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToNtpUpsell);
        }

        public String toString() {
            return "NavigateToNtpUpsell";
        }

        public int hashCode() {
            return -1589177039;
        }
    }

    public final class NavigateToNtpUpsellChoice implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToNtpUpsellChoice INSTANCE = new NavigateToNtpUpsellChoice();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToNtpUpsellChoice);
        }

        public String toString() {
            return "NavigateToNtpUpsellChoice";
        }

        public int hashCode() {
            return -885590478;
        }
    }

    public final class NavigateToOtp implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToOtp INSTANCE = new NavigateToOtp();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToOtp);
        }

        public String toString() {
            return "NavigateToOtp";
        }

        public int hashCode() {
            return 218980197;
        }
    }

    public final class NavigateToPassword implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToPassword INSTANCE = new NavigateToPassword();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToPassword);
        }

        public String toString() {
            return "NavigateToPassword";
        }

        public int hashCode() {
            return 1648696993;
        }
    }

    public final class NavigateToPhoneEntry implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToPhoneEntry INSTANCE = new NavigateToPhoneEntry();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToPhoneEntry);
        }

        public String toString() {
            return "NavigateToPhoneEntry";
        }

        public int hashCode() {
            return 709528106;
        }
    }

    public final class NavigateToReactivation implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToReactivation INSTANCE = new NavigateToReactivation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToReactivation);
        }

        public String toString() {
            return "NavigateToReactivation";
        }

        public int hashCode() {
            return -356606833;
        }
    }

    public final class NavigateToTwoFactor implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToTwoFactor INSTANCE = new NavigateToTwoFactor();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToTwoFactor);
        }

        public String toString() {
            return "NavigateToTwoFactor";
        }

        public int hashCode() {
            return 53205877;
        }
    }

    public final class NavigateToTwoFactorMethod implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final NavigateToTwoFactorMethod INSTANCE = new NavigateToTwoFactorMethod();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToTwoFactorMethod);
        }

        public String toString() {
            return "NavigateToTwoFactorMethod";
        }

        public int hashCode() {
            return 1644129462;
        }
    }

    public final class OpenCheckpointBrowser extends C06G implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public final String url;

        public OpenCheckpointBrowser(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final OpenCheckpointBrowser copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenCheckpointBrowser(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenCheckpointBrowser) && C7384Etj.areEqual(this.url, ((OpenCheckpointBrowser) obj).url));
        }

        public static /* synthetic */ OpenCheckpointBrowser copy$default(OpenCheckpointBrowser openCheckpointBrowser, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openCheckpointBrowser.url;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenCheckpointBrowser(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PopToLanding implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final PopToLanding INSTANCE = new PopToLanding();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PopToLanding);
        }

        public String toString() {
            return "PopToLanding";
        }

        public int hashCode() {
            return 1808808805;
        }
    }

    public final class PopToPhoneEntry implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final PopToPhoneEntry INSTANCE = new PopToPhoneEntry();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PopToPhoneEntry);
        }

        public String toString() {
            return "PopToPhoneEntry";
        }

        public int hashCode() {
            return -1409031274;
        }
    }

    public final class ReplaceOfferWithBirthday implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final ReplaceOfferWithBirthday INSTANCE = new ReplaceOfferWithBirthday();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReplaceOfferWithBirthday);
        }

        public String toString() {
            return "ReplaceOfferWithBirthday";
        }

        public int hashCode() {
            return -1042974171;
        }
    }

    public final class ReturnToBirthday implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final ReturnToBirthday INSTANCE = new ReturnToBirthday();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReturnToBirthday);
        }

        public String toString() {
            return "ReturnToBirthday";
        }

        public int hashCode() {
            return 361257474;
        }
    }

    public final class ReturnToLinkingDisclosure implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final ReturnToLinkingDisclosure INSTANCE = new ReturnToLinkingDisclosure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReturnToLinkingDisclosure);
        }

        public String toString() {
            return "ReturnToLinkingDisclosure";
        }

        public int hashCode() {
            return -5034032;
        }
    }

    public final class ReturnToNtpUpsell implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final ReturnToNtpUpsell INSTANCE = new ReturnToNtpUpsell();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReturnToNtpUpsell);
        }

        public String toString() {
            return "ReturnToNtpUpsell";
        }

        public int hashCode() {
            return 1730802066;
        }
    }

    public final class ShowProfileRemoved implements NativeLoginViewEffect {
        public static final int $stable = 0;
        public static final ShowProfileRemoved INSTANCE = new ShowProfileRemoved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowProfileRemoved);
        }

        public String toString() {
            return "ShowProfileRemoved";
        }

        public int hashCode() {
            return -940481810;
        }
    }
}
