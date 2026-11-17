package com.facebook.imagepipeline.request;

import X.FGI;

/* loaded from: classes5.dex */
public class ImageRequestBuilder$BuilderException extends RuntimeException {
    public static final long serialVersionUID = 1;

    public ImageRequestBuilder$BuilderException(String str) {
        super(FGI.A0M("Invalid request builder: ", str));
    }
}
