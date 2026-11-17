package com.facebook.traffic.nts.providers.user_details;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public abstract class UserDetailsProviderAppLayerUpcalls {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid0();

    private final native void initializeSelfReference(UserDetailsProviderAppLayerUpcalls userDetailsProviderAppLayerUpcalls);

    public abstract UserDetails getUserDetails();

    public final class Companion {
        public Companion() {
        }

        private final HybridData initHybrid0() {
            return UserDetailsProviderAppLayerUpcalls.initHybrid0();
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

    public UserDetailsProviderAppLayerUpcalls() {
        this(initHybrid0());
    }

    public UserDetailsProviderAppLayerUpcalls(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
        initializeSelfReference(this);
    }
}
