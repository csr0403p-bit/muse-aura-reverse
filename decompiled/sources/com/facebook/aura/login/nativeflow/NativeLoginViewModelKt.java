package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C31u;
import X.C3cG;
import X.C7462Ewq;
import X.InterfaceC7359EnW;
import android.os.Build;
import com.facebook.aura.login.nativeflow.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class NativeLoginViewModelKt {
    public static final long PASSKEY_OFFER_TIMEOUT_MS = 3000;
    public static final long SAVED_ACCOUNTS_REUSE_MS = 60000;
    public static final String TAG = "NativeLoginViewModel";
    public static final boolean canCheckGoogleAccount;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(NativeLoginViewModelKt.class, "isPasskeyLoginEnabled", "isPasskeyLoginEnabled()Z", 1), new C7462Ewq(NativeLoginViewModelKt.class, "isGoogleSignInButtonKillswitched", "isGoogleSignInButtonKillswitched()Z", 1)};
    public static final C31u isPasskeyLoginEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_login.enable_passkey_login);
    public static final C31u isGoogleSignInButtonKillswitched$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_login.google_sign_in_button_killswitch);

    static {
        canCheckGoogleAccount = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean isGoogleSignInButtonKillswitched() {
        return AnonymousClass001.A1X(isGoogleSignInButtonKillswitched$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final boolean isPasskeyLoginEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isPasskeyLoginEnabled$delegate, $$delegatedProperties));
    }

    public static final NativeLoginRowSource rowSource(GroupedSsoRow groupedSsoRow, Map<String, NativeLoginSsoAccount> map) {
        HatchSsoSourceApp hatchSsoSourceApp;
        Set<String> set = groupedSsoRow.memberRefs;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            NativeLoginSsoAccount nativeLoginSsoAccount = map.get(it.next());
            if (nativeLoginSsoAccount != null && (hatchSsoSourceApp = nativeLoginSsoAccount.sourceApp) != null) {
                arrayListA0h.add(hatchSsoSourceApp);
            }
        }
        return new NativeLoginRowSource(arrayListA0h, groupedSsoRow.supersedesSavedAccount);
    }
}
