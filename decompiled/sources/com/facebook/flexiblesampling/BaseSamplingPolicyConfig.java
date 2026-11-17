package com.facebook.flexiblesampling;

import X.BV5;
import X.C3341CFl;
import X.C7384Etj;
import X.InterfaceC4071ClJ;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class BaseSamplingPolicyConfig implements SamplingPolicyConfig {
    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    public abstract void invalidateChecksum();

    public abstract String provideAppId();

    public abstract String provideAppVersion();

    public abstract int provideAppVersionCode();

    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    public void provideBaseSamplingConfigParams(C3341CFl c3341CFl) {
        C7384Etj.A0Y(c3341CFl, 0);
        C3341CFl.A00(c3341CFl, provideConfigChecksum(), "config_checksum");
        provideConfigVersions(c3341CFl);
    }

    public abstract String provideConfigChecksum();

    public abstract void provideConfigVersions(C3341CFl c3341CFl);

    public abstract String provideLoggedInUserId();

    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    public void provideUserAndAppSamplingConfigParams(C3341CFl c3341CFl) {
        C7384Etj.A0Y(c3341CFl, 0);
        C3341CFl.A00(c3341CFl, "16.0.0.11.159", "app_ver");
        C3341CFl.A00(c3341CFl, BV5.A0k(), ErrorReportingConstants.USER_ID_KEY);
    }

    @Override // com.facebook.flexiblesampling.SamplingPolicyConfig
    public abstract void updatePolicyFromServer(InputStream inputStream, InterfaceC4071ClJ interfaceC4071ClJ);

    public /* synthetic */ void updateUserId(String str) {
    }
}
