package com.facebook.aura.partners.voice.avatar;

import X.FGI;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AuthRejectedException extends IOException {
    public AuthRejectedException(int i) {
        super(FGI.A0H("HTTP ", i));
    }
}
