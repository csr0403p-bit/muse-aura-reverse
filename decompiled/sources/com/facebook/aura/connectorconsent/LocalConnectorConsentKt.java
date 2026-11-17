package com.facebook.aura.connectorconsent;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AHI;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7462Ewq;
import X.C7BY;
import X.FGI;
import X.InterfaceC7359EnW;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.connectorconsent.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes3.dex */
public abstract class LocalConnectorConsentKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(LocalConnectorConsentKt.class, "privacyPolicyUrl", "getPrivacyPolicyUrl()Ljava/lang/String;", 1), new C7462Ewq(LocalConnectorConsentKt.class, "learnMoreUrl", "getLearnMoreUrl()Ljava/lang/String;", 1), new C7462Ewq(LocalConnectorConsentKt.class, "healthPolicyUrl", "getHealthPolicyUrl()Ljava/lang/String;", 1)};
    public static final C31u privacyPolicyUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_meta_privacy_url);
    public static final C31u learnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_gen_ai_privacy_url);
    public static final C31u healthPolicyUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_health_policy_url);

    public static final ConnectorConsentUiModel localConnectorConsentModel(LocalConnectorConsentType localConnectorConsentType, BFM bfm, int i) {
        C7384Etj.A0Y(localConnectorConsentType, 0);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        LocalConnectorConsent localConnectorConsent = LocalConnectorConsent.INSTANCE;
        ConnectorConsentSyncCategory connectorConsentSyncCategoryCategoryFor$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent = localConnectorConsent.categoryFor$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(localConnectorConsentType);
        String strA01 = AbstractC2271BQs.A01(bfm, localConnectorConsent.titleRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(localConnectorConsentType));
        return new ConnectorConsentUiModel(null, Integer.valueOf(localConnectorConsent.iconRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(localConnectorConsentType)), AnonymousClass002.A1Z(localConnectorConsentType, LocalConnectorConsentType.LOCATION), strA01, AnonymousClass001.A0t(bfm, localDeviceDisplayName(contextA0H), localConnectorConsent.descriptionRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(localConnectorConsentType)), AGI.A0E(new ConnectorConsentBullet(R.drawable.standings_outline_24_wght400, AbstractC2271BQs.A01(bfm, localConnectorConsent.accessBulletRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(localConnectorConsentType)), AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f120aea)), new ConnectorConsentBullet(R.drawable.toggles_outline_24_wght400, AbstractC2271BQs.A01(bfm, localConnectorConsent.manageBulletRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(localConnectorConsentType)), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120aec)), new ConnectorConsentBullet(R.drawable.eye_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ae9), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120aeb))), localConnectorFooterParagraphs(localConnectorConsentType, connectorConsentSyncCategoryCategoryFor$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent, strA01, bfm, i & 14), AHI.A01, null);
    }

    public static final String getHealthPolicyUrl() {
        return C60R.A0j(healthPolicyUrl$delegate, $$delegatedProperties, 2);
    }

    public static final String getLearnMoreUrl() {
        return C60R.A0j(learnMoreUrl$delegate, $$delegatedProperties, 1);
    }

    public static final String getPrivacyPolicyUrl() {
        return (String) C31u.A00(privacyPolicyUrl$delegate, $$delegatedProperties);
    }

    public static final AHD<String> localConnectorFooterParagraphs(LocalConnectorConsentType localConnectorConsentType, ConnectorConsentSyncCategory connectorConsentSyncCategory, String str, BFM bfm, int i) {
        BBI bbiA0M;
        AHH ahhA0E;
        bfm.AgE(-1057444974);
        if (localConnectorConsentType == LocalConnectorConsentType.HEALTH) {
            bfm.AgE(1242121036);
            ahhA0E = AGI.A0E(AbstractC2271BQs.A02(bfm, new Object[]{str, getPrivacyPolicyUrl(), getHealthPolicyUrl(), HatchAppName.value}, R.string._name_removed__res_0x7f120af7));
            bbiA0M = C3cG.A07(bfm);
        } else {
            bbiA0M = AnonymousClass002.A0M(bfm, 1242370896);
            ahhA0E = AGI.A0E(AbstractC2271BQs.A02(bfm, new Object[]{str, getLearnMoreUrl(), HatchAppName.value}, LocalConnectorConsent.INSTANCE.footerRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(connectorConsentSyncCategory)));
        }
        BBI.A0R(bbiA0M, false);
        return ahhA0E;
    }

    public static final String localDeviceDisplayName(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "device_name");
        } catch (Exception unused) {
            string = null;
        }
        if (string != null && !C7BY.A0j(string)) {
            return string;
        }
        String strA0v = Build.MANUFACTURER;
        C7384Etj.A0V(strA0v);
        if (strA0v.length() > 0) {
            StringBuilder sbA0w = C60O.A0w();
            strA0v = AnonymousClass001.A0v(C60P.A1N(strA0v, sbA0w), sbA0w);
        }
        return FGI.A0U(strA0v, InviteCodeScratcherKt.CODE_SEPARATOR, Build.MODEL);
    }
}
