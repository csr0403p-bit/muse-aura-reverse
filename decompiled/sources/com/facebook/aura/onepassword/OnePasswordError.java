package com.facebook.aura.onepassword;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnePasswordError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OnePasswordError[] $VALUES;
    public static final OnePasswordError ACCESS_REQUESTS_OFF;
    public static final OnePasswordError ACCOUNT_NOT_SIGNED_IN;
    public static final OnePasswordError EXPIRED;
    public static final OnePasswordError FAILED;
    public static final OnePasswordError INSTALL_REQUIRED;
    public static final OnePasswordError REQUEST_ENDED;
    public static final OnePasswordError TRY_LATER;
    public static final OnePasswordError UNAVAILABLE;
    public static final OnePasswordError UPDATE_REQUIRED;
    public final int bodyRes;
    public final boolean opensPlayStore;
    public final int titleRes;

    public static Ey9<OnePasswordError> getEntries() {
        return $ENTRIES;
    }

    public static OnePasswordError valueOf(String str) {
        return (OnePasswordError) Enum.valueOf(OnePasswordError.class, str);
    }

    public static OnePasswordError[] values() {
        return (OnePasswordError[]) $VALUES.clone();
    }

    public final int getBodyRes$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword() {
        return this.bodyRes;
    }

    public final boolean getOpensPlayStore$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword() {
        return this.opensPlayStore;
    }

    public final int getTitleRes$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword() {
        return this.titleRes;
    }

    static {
        OnePasswordError onePasswordError = new OnePasswordError("INSTALL_REQUIRED", 0, R.string._name_removed__res_0x7f120c49, R.string._name_removed__res_0x7f120c48, true);
        INSTALL_REQUIRED = onePasswordError;
        OnePasswordError onePasswordError2 = new OnePasswordError("UPDATE_REQUIRED", 1, R.string._name_removed__res_0x7f120c4d, R.string._name_removed__res_0x7f120c4c, true);
        UPDATE_REQUIRED = onePasswordError2;
        int i = 4;
        C06H c06h = null;
        boolean z = false;
        OnePasswordError onePasswordError3 = new OnePasswordError("ACCOUNT_NOT_SIGNED_IN", 2, R.string._name_removed__res_0x7f120c40, R.string._name_removed__res_0x7f120c3f, z, i, c06h);
        ACCOUNT_NOT_SIGNED_IN = onePasswordError3;
        OnePasswordError onePasswordError4 = new OnePasswordError("ACCESS_REQUESTS_OFF", 3, R.string._name_removed__res_0x7f120c42, R.string._name_removed__res_0x7f120c41, z, i, c06h);
        ACCESS_REQUESTS_OFF = onePasswordError4;
        int i2 = R.string._name_removed__res_0x7f120c44;
        C06H c06h2 = null;
        OnePasswordError onePasswordError5 = new OnePasswordError("REQUEST_ENDED", i, i2, R.string._name_removed__res_0x7f120c43, z, i, c06h2);
        REQUEST_ENDED = onePasswordError5;
        OnePasswordError onePasswordError6 = new OnePasswordError("TRY_LATER", 5, i2, R.string._name_removed__res_0x7f120c4a, z, i, c06h2);
        TRY_LATER = onePasswordError6;
        OnePasswordError onePasswordError7 = new OnePasswordError("UNAVAILABLE", 6, i2, R.string._name_removed__res_0x7f120c4b, z, i, c06h2);
        UNAVAILABLE = onePasswordError7;
        OnePasswordError onePasswordError8 = new OnePasswordError("EXPIRED", 7, i2, R.string._name_removed__res_0x7f120c45, z, i, c06h2);
        EXPIRED = onePasswordError8;
        OnePasswordError onePasswordError9 = new OnePasswordError(CvmMigrationStatusJson.STAGE_FAILED, 8, R.string._name_removed__res_0x7f120c47, R.string._name_removed__res_0x7f120c46, z, i, c06h2);
        FAILED = onePasswordError9;
        OnePasswordError[] onePasswordErrorArr = {onePasswordError, onePasswordError2, onePasswordError3, onePasswordError4, onePasswordError5, onePasswordError6, onePasswordError7, onePasswordError8, onePasswordError9};
        $VALUES = onePasswordErrorArr;
        $ENTRIES = C3cG.A0w(onePasswordErrorArr);
    }

    public OnePasswordError(String str, int i, int i2, int i3, boolean z) {
        this.titleRes = i2;
        this.bodyRes = i3;
        this.opensPlayStore = z;
    }

    public /* synthetic */ OnePasswordError(String str, int i, int i2, int i3, boolean z, int i4, C06H c06h) {
        this(str, i, i2, i3, C3cG.A1K(i4 & 4, z));
    }
}
