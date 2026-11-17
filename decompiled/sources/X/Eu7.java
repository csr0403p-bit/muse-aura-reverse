package X;

import java.security.KeyPair;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public final class Eu7 {
    public final long A00;
    public final KeyPair A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Eu7)) {
            return false;
        }
        Eu7 eu7 = (Eu7) obj;
        if (this.A00 != eu7.A00) {
            return false;
        }
        KeyPair keyPair = this.A01;
        PublicKey publicKey = keyPair.getPublic();
        KeyPair keyPair2 = eu7.A01;
        if (publicKey.equals(keyPair2.getPublic())) {
            return BV7.A1X(keyPair.getPrivate(), keyPair2.getPrivate(), false);
        }
        return false;
    }

    public final int hashCode() {
        KeyPair keyPair = this.A01;
        return BV7.A0E(keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.A00));
    }

    public Eu7(KeyPair keyPair, long j) {
        this.A01 = keyPair;
        this.A00 = j;
    }
}
