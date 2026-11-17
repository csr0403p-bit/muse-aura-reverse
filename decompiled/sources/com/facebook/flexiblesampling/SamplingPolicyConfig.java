package com.facebook.flexiblesampling;

import X.C3341CFl;
import X.InterfaceC4071ClJ;
import java.io.InputStream;

/* loaded from: classes5.dex */
public interface SamplingPolicyConfig {
    void invalidateChecksum();

    void provideBaseSamplingConfigParams(C3341CFl c3341CFl);

    void provideUserAndAppSamplingConfigParams(C3341CFl c3341CFl);

    void updatePolicyFromServer(InputStream inputStream, InterfaceC4071ClJ interfaceC4071ClJ);
}
