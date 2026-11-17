package com.facebook.imagepipeline.decoder;

import X.C6988Edo;

/* loaded from: classes5.dex */
public final class DecodeException extends RuntimeException {
    public final C6988Edo encodedImage;

    public DecodeException(C6988Edo c6988Edo, String str) {
        super(str);
        this.encodedImage = c6988Edo;
    }
}
