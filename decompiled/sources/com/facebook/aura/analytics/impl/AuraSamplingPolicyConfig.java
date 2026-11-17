package com.facebook.aura.analytics.impl;

import X.BV5;
import X.C7384Etj;
import X.C7cU;
import android.content.Context;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.common.build.BuildConstants;
import com.facebook.flexiblesampling.QPLSupportedSamplingPolicyConfig;

/* loaded from: classes5.dex */
public final class AuraSamplingPolicyConfig extends QPLSupportedSamplingPolicyConfig {
    public final MetaAppInfoProvider appInfoProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSamplingPolicyConfig(Context context) {
        super(context, null);
        C7384Etj.A0Y(context, 0);
        this.appInfoProvider = new MetaAppInfoProvider();
    }

    @Override // com.facebook.flexiblesampling.DefaultSamplingPolicyConfig_DONOTUSE
    public C7cU getSharedPrefsFactory() {
        return AuraPrefsStorage.INSTANCE.getFactory();
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public String provideAppId() {
        return "4331325740476680";
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public String provideAppVersion() {
        return "16.0.0.11.159";
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public int provideAppVersionCode() {
        return BuildConstants.A01();
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public String provideLoggedInUserId() {
        return BV5.A0k();
    }
}
