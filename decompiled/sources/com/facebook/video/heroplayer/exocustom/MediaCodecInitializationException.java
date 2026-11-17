package com.facebook.video.heroplayer.exocustom;

import X.C7384Etj;

/* loaded from: classes5.dex */
public final class MediaCodecInitializationException extends Exception {
    public final String codecName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecInitializationException(String str, Throwable th) {
        super(th);
        C7384Etj.A0Y(str, 0);
        this.codecName = str;
    }
}
