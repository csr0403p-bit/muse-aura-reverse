package com.facebook.aura.hatchlockcrypto;

/* loaded from: classes6.dex */
public interface HatchPassphraseHasher {
    KDFAlgorithm getAlgorithm();

    PassphraseHashResult hash(byte[] bArr, byte[] bArr2);
}
