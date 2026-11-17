package com.facebook.aura.watchhandoff;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class WatchSessionLinkStoreKt {
    public static final String RETIRED_CREDENTIAL_FINGERPRINT = "";

    public static final void skipRetiredCredentialFingerprint(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readUTF();
    }
}
