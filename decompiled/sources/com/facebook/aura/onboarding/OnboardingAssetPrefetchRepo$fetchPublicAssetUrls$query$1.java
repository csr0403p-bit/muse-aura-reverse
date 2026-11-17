package com.facebook.aura.onboarding;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public final class OnboardingAssetPrefetchRepo$fetchPublicAssetUrls$query$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final OnboardingAssetPrefetchRepo$fetchPublicAssetUrls$query$1 INSTANCE = new OnboardingAssetPrefetchRepo$fetchPublicAssetUrls$query$1();

    public OnboardingAssetPrefetchRepo$fetchPublicAssetUrls$query$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("asset_names=", URLEncoder.encode(str, HatchWebPageParserKt.UTF_8));
    }
}
