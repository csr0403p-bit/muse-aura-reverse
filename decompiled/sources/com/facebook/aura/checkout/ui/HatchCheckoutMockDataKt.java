package com.facebook.aura.checkout.ui;

import X.AGI;
import X.AHD;

/* loaded from: classes4.dex */
public abstract class HatchCheckoutMockDataKt {
    public static final HatchAddress mockCheckoutAddress;
    public static final AHD<HatchSelectableOption> mockCheckoutAddresses;
    public static final AHD<HatchSelectableOption> mockCheckoutDeliveryOptions;
    public static final AHD<HatchSelectableOption> mockCheckoutEmails;
    public static final AHD<HatchSelectableOption> mockCheckoutPhoneNumbers;

    static {
        HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle = HatchSelectableLeadingIconStyle.DEFAULT;
        mockCheckoutEmails = AGI.A0E(new HatchSelectableOption("email-meta", "jozhouzheng@meta.com", null, null, null, true, true, hatchSelectableLeadingIconStyle, false), new HatchSelectableOption("email-gmail", "jojo@gmail.com", null, null, null, true, true, hatchSelectableLeadingIconStyle, false));
        mockCheckoutAddresses = AGI.A0E(mockOption("addr-menlo", "Jo Zhouzheng", "1 Hacker Way, Menlo Park, CA 94025", null), mockOption("addr-sf", "Jo Zhouzheng", "23 Folsom St, San Francisco, CA 94103", null));
        mockCheckoutDeliveryOptions = AGI.A0E(mockOption("ship-standard", "Monday, January 19", "Standard (Arrives 3 - 5 days)", "Free"), mockOption("ship-express", "Friday, January 16", "Express (Arrives 1 - 2 days)", "$6.99"));
        mockCheckoutPhoneNumbers = AGI.A0E(new HatchSelectableOption("phone-mobile", "+1 (415) 555-0132", null, null, null, true, true, hatchSelectableLeadingIconStyle, false), new HatchSelectableOption("phone-home", "+1 (650) 555-0186", null, null, null, true, true, hatchSelectableLeadingIconStyle, false));
        mockCheckoutAddress = new HatchAddress("Jo Zhouzheng", "1 Hacker Way, Menlo Park, CA 94025");
    }

    public static final HatchSelectableOption mockOption(String str, String str2, String str3, String str4) {
        return new HatchSelectableOption(str, str2, str3, null, str4, true, true, HatchSelectableLeadingIconStyle.DEFAULT, false);
    }

    public static final HatchAddress getMockCheckoutAddress() {
        return mockCheckoutAddress;
    }

    public static final AHD<HatchSelectableOption> getMockCheckoutAddresses() {
        return mockCheckoutAddresses;
    }

    public static final AHD<HatchSelectableOption> getMockCheckoutDeliveryOptions() {
        return mockCheckoutDeliveryOptions;
    }

    public static final AHD<HatchSelectableOption> getMockCheckoutEmails() {
        return mockCheckoutEmails;
    }

    public static final AHD<HatchSelectableOption> getMockCheckoutPhoneNumbers() {
        return mockCheckoutPhoneNumbers;
    }

    public static /* synthetic */ HatchSelectableOption mockOption$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return mockOption(str, str2, str3, str4);
    }
}
