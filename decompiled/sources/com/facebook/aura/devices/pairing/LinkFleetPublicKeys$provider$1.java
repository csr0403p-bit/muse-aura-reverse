package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LinkFleetPublicKeys$provider$1 extends AbstractC7559F3s implements Function0<String> {
    public static final LinkFleetPublicKeys$provider$1 INSTANCE = new LinkFleetPublicKeys$provider$1();

    public LinkFleetPublicKeys$provider$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        return LinkEncryptedPairingKt.getEncryptedPairingFleetPublicKeysJson();
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return LinkEncryptedPairingKt.getEncryptedPairingFleetPublicKeysJson();
    }
}
