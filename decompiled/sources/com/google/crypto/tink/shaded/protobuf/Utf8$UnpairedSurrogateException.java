package com.google.crypto.tink.shaded.protobuf;

import X.FGI;

/* loaded from: classes6.dex */
public class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int index, int length) {
        super(FGI.A0T("Unpaired surrogate at index ", " of ", index, length));
    }
}
