package com.facebook.aura.accountcenter;

import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7462Ewq;
import X.FGI;
import X.InterfaceC7359EnW;
import android.net.Uri;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.login.nativeflow.HatchCheckpointUrlPolicy;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.sandbox.AuraSandbox;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class AuraAccountsCenterActivityKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(AuraAccountsCenterActivityKt.class, "ssoUrl", "getSsoUrl()Ljava/lang/String;", 1), new C7462Ewq(AuraAccountsCenterActivityKt.class, "profilesUrl", "getProfilesUrl()Ljava/lang/String;", 1), new C7462Ewq(AuraAccountsCenterActivityKt.class, "accountsCenterUrl", "getAccountsCenterUrl()Ljava/lang/String;", 1), new C7462Ewq(AuraAccountsCenterActivityKt.class, "authUrlsBase", "getAuthUrlsBase()Ljava/lang/String;", 1), new C7462Ewq(AuraAccountsCenterActivityKt.class, "extraAuthUrls", "getExtraAuthUrls()Ljava/lang/String;", 1), new C7462Ewq(AuraAccountsCenterActivityKt.class, "externalDomainsRaw", "getExternalDomainsRaw()Ljava/lang/String;", 1)};
    public static final C31u ssoUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_accounts_center_settings.sso_url);
    public static final C31u profilesUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_accounts_center_settings.profiles_url);
    public static final C31u accountsCenterUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_accounts_center_settings.accountscenter_url);
    public static final C31u authUrlsBase$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_accounts_center_settings.auth_urls);
    public static final C31u extraAuthUrls$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_accounts_center_3p_link.android_extra_auth_urls);
    public static final C31u externalDomainsRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.mwa_accounts_center_3p_link.android_external_domains);
    public static final Set<String> sandboxableAccountsCenterHosts = C60O.A19("accountscenter.meta.com", HatchCheckpointUrlPolicy.AUTH_HOST);

    public static final String sandboxAccountsCenterUrl(String str) {
        Uri uri;
        String host;
        C7384Etj.A0Y(str, 0);
        String graphqlHost = AuraSandbox.INSTANCE.getGraphqlHost();
        if (graphqlHost.length() == 0 || (host = (uri = Uri.parse(str)).getHost()) == null) {
            return str;
        }
        String strA0u = AnonymousClass001.A0u(host);
        String scheme = uri.getScheme();
        return (scheme != null && scheme.equalsIgnoreCase("https") && uri.getUserInfo() == null && uri.getPort() == -1 && sandboxableAccountsCenterHosts.contains(strA0u)) ? C60R.A0b(uri.buildUpon().authority(FGI.A0U(graphqlHost, ".", strA0u))) : str;
    }

    public static final String getAccountsCenterUrl() {
        return C60R.A0j(accountsCenterUrl$delegate, $$delegatedProperties, 2);
    }

    public static final String getAuthUrlsBase() {
        return C60R.A0j(authUrlsBase$delegate, $$delegatedProperties, 3);
    }

    public static final String getExternalDomainsRaw() {
        return C60R.A0j(externalDomainsRaw$delegate, $$delegatedProperties, 5);
    }

    public static final String getExtraAuthUrls() {
        return C60R.A0j(extraAuthUrls$delegate, $$delegatedProperties, 4);
    }

    public static final String getProfilesUrl() {
        return C60R.A0j(profilesUrl$delegate, $$delegatedProperties, 1);
    }

    public static final String getSsoUrl() {
        return (String) C31u.A00(ssoUrl$delegate, $$delegatedProperties);
    }
}
