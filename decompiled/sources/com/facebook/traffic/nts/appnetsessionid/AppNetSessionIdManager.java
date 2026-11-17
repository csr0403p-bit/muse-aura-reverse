package com.facebook.traffic.nts.appnetsessionid;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class AppNetSessionIdManager {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public AppNetSessionIdManager(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public final native AppNetSessionIdManagerAppNetSessionId getAppNetSessionId();

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("trafficntsappnetsessionid");
    }
}
