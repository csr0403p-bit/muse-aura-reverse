package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;

/* loaded from: classes5.dex */
public final class PandoToken implements IPandoGraphQLService.Token {
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    @Override // X.InterfaceC5106DYe
    public native void cancel();

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public PandoToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
