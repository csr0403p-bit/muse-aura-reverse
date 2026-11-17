package com.facebook.aura.network.state;

import X.AnonymousClass006;
import X.C06H;
import X.FGI;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NoNetworkException extends IOException {
    public /* synthetic */ NoNetworkException(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoNetworkException(String str) {
        String strA0M;
        if (str != null) {
            strA0M = FGI.A0M("No network: ", str);
        } else {
            strA0M = "No network";
        }
        super(strA0M);
    }

    public NoNetworkException() {
        super("No network");
    }
}
