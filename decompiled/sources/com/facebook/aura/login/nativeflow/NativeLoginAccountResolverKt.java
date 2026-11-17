package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.BFI;
import X.BV6;
import X.C31u;
import X.C60O;
import X.C7384Etj;
import X.EP0;
import X.EPL;
import X.EPM;
import X.F0C;
import X.InterfaceC7359EnW;
import com.facebook.aura.login.nativeflow.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class NativeLoginAccountResolverKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(NativeLoginAccountResolverKt.class, "isWhatsAppSsoEnabled", "isWhatsAppSsoEnabled()Z", 1);
    public static final String ACTIVE_CREDENTIAL_SOURCE;
    public static final String INACTIVE_CREDENTIAL_SOURCE;
    public static final List<EPL> LEGACY_ACCOUNT_SWITCHER_SSO_SOURCES;
    public static final Set<EPL> LEGACY_CONTENT_PROVIDER_SSO_SOURCES;
    public static final String LOG_LOCATION = "hatch_native_login";
    public static final String TAG = "NativeLoginAccountResolver";
    public static final long WHATSAPP_AUTH_BUNDLE_FETCH_TIMEOUT_MS = 1750;
    public static final String WHATSAPP_USER_ID = "whatsapp";
    public static final String XAPP_E2E_TOKENS_KEY = "xapp.e2e.tokens";
    public static final C31u isWhatsAppSsoEnabled$delegate;
    public static final F0C whatsAppReadExecutor$delegate;

    static {
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        ACTIVE_CREDENTIAL_SOURCE = "ACTIVE_ACCOUNT".toLowerCase(locale);
        INACTIVE_CREDENTIAL_SOURCE = "INACTIVE_LOGGED_IN_ACCOUNTS".toLowerCase(locale);
        whatsAppReadExecutor$delegate = AbstractC5321DgF.A03(NativeLoginAccountResolverKt$whatsAppReadExecutor$2.INSTANCE);
        isWhatsAppSsoEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_enable_wa_into_hatch_sso_device_id.enable);
        EPL epl = EPL.A05;
        EPL epl2 = EPL.A06;
        EPL epl3 = EPL.A08;
        EPL epl4 = EPL.A0G;
        EPL epl5 = EPL.A0D;
        LEGACY_CONTENT_PROVIDER_SSO_SOURCES = BFI.A0H(new EPL[]{epl, epl2, epl3, epl4, epl5, EPL.A0E, EPL.A0J, EPL.A0K});
        LEGACY_ACCOUNT_SWITCHER_SSO_SOURCES = Collections.singletonList(epl5);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EPM.values().length];
            try {
                BV6.A1T(iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[10] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[13] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[14] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Executor getWhatsAppReadExecutor() {
        return F0C.A06(whatsAppReadExecutor$delegate);
    }

    public static final boolean isWhatsAppSsoEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isWhatsAppSsoEnabled$delegate, $$delegatedProperties));
    }

    public static final HatchSsoSourceApp toSsoSourceApp(EP0 ep0) {
        if (EP0.A01.contains(ep0)) {
            return HatchSsoSourceApp.FACEBOOK;
        }
        if (EP0.A03.contains(ep0)) {
            return HatchSsoSourceApp.INSTAGRAM;
        }
        if (ep0 == EP0.A0D) {
            return HatchSsoSourceApp.META;
        }
        return null;
    }

    public static final HatchSsoSourceApp toSsoSourceApp(EPM epm) {
        switch (epm.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 10:
                return HatchSsoSourceApp.FACEBOOK;
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            default:
                return null;
            case 5:
            case 7:
                return HatchSsoSourceApp.INSTAGRAM;
            case 13:
            case 14:
                return HatchSsoSourceApp.META;
        }
    }
}
