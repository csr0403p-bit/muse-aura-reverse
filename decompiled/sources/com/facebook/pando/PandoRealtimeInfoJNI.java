package com.facebook.pando;

import X.C7384Etj;
import X.ETi;
import X.HZA;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class PandoRealtimeInfoJNI {
    public static final HZA Companion = new HZA();
    public final HybridData mHybridData;
    public final boolean shouldBatchStream;

    public static final PandoRealtimeInfoJNI forSubscription(String str) {
        C7384Etj.A0Y(str, 0);
        return new PandoRealtimeInfoJNI(str);
    }

    private final native HybridData initLiveQueryHybridData(String str, String str2);

    private final native HybridData initSubscriptionHybridData(String str);

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public static final PandoRealtimeInfoJNI forLiveQuery(String str) {
        return new PandoRealtimeInfoJNI(str, "");
    }

    public PandoRealtimeInfoJNI(String str) {
        this.mHybridData = initSubscriptionHybridData(str);
    }

    public PandoRealtimeInfoJNI(String str, String str2) {
        this.mHybridData = initLiveQueryHybridData(str, str2);
    }

    public static final PandoRealtimeInfoJNI forLiveQuery(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return new PandoRealtimeInfoJNI(str, str2);
    }
}
