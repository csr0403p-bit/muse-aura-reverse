package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaLoginEventCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaLoginEventCategory[] $VALUES;
    public static final HatchCaaLoginEventCategory ACCOUNT_SELECTOR_PAGE_INTERACTION;
    public static final HatchCaaLoginEventCategory CONTACTPOINT_PAGE_INTERACTION;
    public static final HatchCaaLoginEventCategory GOOGLE_CREDENTIAL_MANAGER;
    public static final HatchCaaLoginEventCategory IMPRESSION;
    public static final HatchCaaLoginEventCategory INTERACTION;
    public static final HatchCaaLoginEventCategory LANDING_PAGE_INIT;
    public static final HatchCaaLoginEventCategory LOGIN_ATTEMPT;
    public static final HatchCaaLoginEventCategory LOGIN_FAILURE;
    public static final HatchCaaLoginEventCategory LOGIN_HOME_PAGE_INIT;
    public static final HatchCaaLoginEventCategory LOGIN_HOME_PAGE_INTERACTION;
    public static final HatchCaaLoginEventCategory LOGIN_SUCCESS;
    public static final HatchCaaLoginEventCategory PASSKEY;
    public final String value;

    static {
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory = new HatchCaaLoginEventCategory("CONTACTPOINT_PAGE_INTERACTION", 0, "contactpoint_page_interaction");
        CONTACTPOINT_PAGE_INTERACTION = hatchCaaLoginEventCategory;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory2 = new HatchCaaLoginEventCategory("ACCOUNT_SELECTOR_PAGE_INTERACTION", 1, "account_selector_page_interaction");
        ACCOUNT_SELECTOR_PAGE_INTERACTION = hatchCaaLoginEventCategory2;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory3 = new HatchCaaLoginEventCategory("LOGIN_HOME_PAGE_INIT", 2, "login_home_page_init");
        LOGIN_HOME_PAGE_INIT = hatchCaaLoginEventCategory3;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory4 = new HatchCaaLoginEventCategory("LOGIN_HOME_PAGE_INTERACTION", 3, "login_home_page_interaction");
        LOGIN_HOME_PAGE_INTERACTION = hatchCaaLoginEventCategory4;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory5 = new HatchCaaLoginEventCategory("LOGIN_SUCCESS", 4, "login_success");
        LOGIN_SUCCESS = hatchCaaLoginEventCategory5;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory6 = new HatchCaaLoginEventCategory("LOGIN_FAILURE", 5, "login_failure");
        LOGIN_FAILURE = hatchCaaLoginEventCategory6;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory7 = new HatchCaaLoginEventCategory("LANDING_PAGE_INIT", 6, "landing_page_init");
        LANDING_PAGE_INIT = hatchCaaLoginEventCategory7;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory8 = new HatchCaaLoginEventCategory("LOGIN_ATTEMPT", 7, "login_attempt");
        LOGIN_ATTEMPT = hatchCaaLoginEventCategory8;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory9 = new HatchCaaLoginEventCategory("IMPRESSION", 8, "impression");
        IMPRESSION = hatchCaaLoginEventCategory9;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory10 = new HatchCaaLoginEventCategory("INTERACTION", 9, "interaction");
        INTERACTION = hatchCaaLoginEventCategory10;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory11 = new HatchCaaLoginEventCategory("GOOGLE_CREDENTIAL_MANAGER", 10, "google_credential_manager");
        GOOGLE_CREDENTIAL_MANAGER = hatchCaaLoginEventCategory11;
        HatchCaaLoginEventCategory hatchCaaLoginEventCategory12 = new HatchCaaLoginEventCategory("PASSKEY", 11, "passkey");
        PASSKEY = hatchCaaLoginEventCategory12;
        HatchCaaLoginEventCategory[] hatchCaaLoginEventCategoryArr = {hatchCaaLoginEventCategory, hatchCaaLoginEventCategory2, hatchCaaLoginEventCategory3, hatchCaaLoginEventCategory4, hatchCaaLoginEventCategory5, hatchCaaLoginEventCategory6, hatchCaaLoginEventCategory7, hatchCaaLoginEventCategory8, hatchCaaLoginEventCategory9, hatchCaaLoginEventCategory10, hatchCaaLoginEventCategory11, hatchCaaLoginEventCategory12};
        $VALUES = hatchCaaLoginEventCategoryArr;
        $ENTRIES = C3cG.A0w(hatchCaaLoginEventCategoryArr);
    }

    public static Ey9<HatchCaaLoginEventCategory> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaLoginEventCategory valueOf(String str) {
        return (HatchCaaLoginEventCategory) Enum.valueOf(HatchCaaLoginEventCategory.class, str);
    }

    public static HatchCaaLoginEventCategory[] values() {
        return (HatchCaaLoginEventCategory[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaLoginEventCategory(String str, int i, String str2) {
        this.value = str2;
    }
}
