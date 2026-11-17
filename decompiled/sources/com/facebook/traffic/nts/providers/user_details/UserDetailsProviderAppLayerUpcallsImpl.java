package com.facebook.traffic.nts.providers.user_details;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class UserDetailsProviderAppLayerUpcallsImpl extends UserDetailsProviderAppLayerUpcalls {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDetailsProviderAppLayerUpcallsImpl(HybridData hybridData) {
        super(hybridData);
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.providers.user_details.UserDetailsProviderAppLayerUpcalls
    public native UserDetails getUserDetails();

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("user_details_provider");
    }
}
