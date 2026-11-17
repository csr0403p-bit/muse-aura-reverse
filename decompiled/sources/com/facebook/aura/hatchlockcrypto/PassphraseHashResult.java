package com.facebook.aura.hatchlockcrypto;

import X.AnonymousClass005;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class PassphraseHashResult {
    public final KDFAlgorithm algorithm;
    public final byte[] hash;
    public final byte[] salt;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PassphraseHashResult) {
                PassphraseHashResult passphraseHashResult = (PassphraseHashResult) obj;
                if (!Arrays.equals(this.hash, passphraseHashResult.hash) || !Arrays.equals(this.salt, passphraseHashResult.salt) || this.algorithm != passphraseHashResult.algorithm) {
                }
            }
            return false;
        }
        return true;
    }

    public final KDFAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public final byte[] getHash() {
        return this.hash;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.algorithm, ((Arrays.hashCode(this.hash) * 31) + Arrays.hashCode(this.salt)) * 31);
    }

    public PassphraseHashResult(byte[] bArr, byte[] bArr2, KDFAlgorithm kDFAlgorithm) {
        AnonymousClass005.A0x(bArr, bArr2, kDFAlgorithm);
        this.hash = bArr;
        this.salt = bArr2;
        this.algorithm = kDFAlgorithm;
    }
}
