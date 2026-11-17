package com.facebook.aura.subscription.model;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CheckoutNotice {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CheckoutNotice[] $VALUES;
    public static final CheckoutNotice CANCELED;
    public static final CheckoutNotice FAILED;

    static {
        CheckoutNotice checkoutNotice = new CheckoutNotice("CANCELED", 0);
        CANCELED = checkoutNotice;
        CheckoutNotice checkoutNotice2 = new CheckoutNotice(CvmMigrationStatusJson.STAGE_FAILED, 1);
        FAILED = checkoutNotice2;
        CheckoutNotice[] checkoutNoticeArr = {checkoutNotice, checkoutNotice2};
        $VALUES = checkoutNoticeArr;
        $ENTRIES = C3cG.A0w(checkoutNoticeArr);
    }

    public static Ey9<CheckoutNotice> getEntries() {
        return $ENTRIES;
    }

    public static CheckoutNotice valueOf(String str) {
        return (CheckoutNotice) Enum.valueOf(CheckoutNotice.class, str);
    }

    public static CheckoutNotice[] values() {
        return (CheckoutNotice[]) $VALUES.clone();
    }

    public CheckoutNotice(String str, int i) {
    }
}
