package com.facebook.aura.devices.pairing;

import java.security.interfaces.ECPublicKey;

/* loaded from: classes4.dex */
public interface LinkFleetPublicKeyProvider {
    ECPublicKey publicKeyForEpoch(int i);
}
