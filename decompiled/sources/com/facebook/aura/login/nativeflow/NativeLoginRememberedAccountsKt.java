package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C31u;
import X.C7384Etj;
import X.C7462Ewq;
import X.InterfaceC7359EnW;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import com.facebook.aura.login.nativeflow.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes2.dex */
public abstract class NativeLoginRememberedAccountsKt {
    public static final String TAG = "NativeLoginRememberedAccounts";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(NativeLoginRememberedAccountsKt.class, "isRememberDeviceDisabled", "isRememberDeviceDisabled()Z", 1)};
    public static final C31u isRememberDeviceDisabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_login.disable_remember_device);

    public static final String pickerLabel(AuraRememberedAccount auraRememberedAccount) {
        C7384Etj.A0Y(auraRememberedAccount, 0);
        String str = auraRememberedAccount.name;
        if (str != null) {
            return str;
        }
        String str2 = auraRememberedAccount.username;
        return str2 == null ? auraRememberedAccount.contactPoint : str2;
    }

    public static final boolean isRememberDeviceDisabled() {
        return AnonymousClass001.A1X(C31u.A00(isRememberDeviceDisabled$delegate, $$delegatedProperties));
    }
}
