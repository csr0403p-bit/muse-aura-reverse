package com.facebook.traffic.nts.providers.user_details;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class UserDetailsProviderImplHolder {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public UserDetailsProviderImplHolder(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public static final native UserDetailsProviderImplHolder getInstance();

    public final native UserDetailsProviderAppLayer getUserDetailsProviderAppLayer();

    public final native void setUpcallImpl(UserDetailsProviderAppLayerUpcalls userDetailsProviderAppLayerUpcalls);

    public final class Companion {
        public Companion() {
        }

        public final UserDetailsProviderImplHolder getInstance() {
            return UserDetailsProviderImplHolder.getInstance();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("user_details_provider");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
