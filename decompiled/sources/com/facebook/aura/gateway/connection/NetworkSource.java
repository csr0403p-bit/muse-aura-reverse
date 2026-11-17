package com.facebook.aura.gateway.connection;

import X.C1BN;

/* loaded from: classes6.dex */
public interface NetworkSource {
    C1BN<String> getValidatedTransport();

    C1BN<Boolean> isOnline();
}
