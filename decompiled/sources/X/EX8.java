package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public final class EX8 {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;
    public final IdentityCredential A03;

    public final IdentityCredential A00() {
        return this.A03;
    }

    public EX8(IdentityCredential identityCredential) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = identityCredential;
    }

    public EX8(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public EX8(Mac mac) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = mac;
        this.A03 = null;
    }

    public EX8(Cipher cipher) {
        this.A00 = null;
        this.A01 = cipher;
        this.A02 = null;
        this.A03 = null;
    }
}
