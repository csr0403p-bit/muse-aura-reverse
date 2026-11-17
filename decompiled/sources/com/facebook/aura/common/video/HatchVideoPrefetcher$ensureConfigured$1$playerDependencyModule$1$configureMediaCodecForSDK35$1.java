package com.facebook.aura.common.video;

import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.Ht9;
import X.InterfaceC2349BUy;
import X.InterfaceC2983Bqs;
import android.media.MediaCodec;

/* loaded from: classes5.dex */
public final /* synthetic */ class HatchVideoPrefetcher$ensureConfigured$1$playerDependencyModule$1$configureMediaCodecForSDK35$1 implements InterfaceC2349BUy, InterfaceC2983Bqs {
    public static final HatchVideoPrefetcher$ensureConfigured$1$playerDependencyModule$1$configureMediaCodecForSDK35$1 INSTANCE = new HatchVideoPrefetcher$ensureConfigured$1$playerDependencyModule$1$configureMediaCodecForSDK35$1();

    @Override // X.InterfaceC2983Bqs
    public final void accept(MediaCodec mediaCodec) {
        C7384Etj.A0Y(mediaCodec, 0);
        mediaCodec.detachOutputSurface();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2983Bqs) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(1, MediaCodec.class, "detachOutputSurface", "detachOutputSurface()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
