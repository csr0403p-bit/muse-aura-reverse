package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.DJo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4973DJo implements Serializable {
    public final int bytes;
    public final MessageDigest prototype;
    public final boolean supportsClone;
    public final String toString;

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final String toString() {
        return this.toString;
    }

    public Object writeReplace() {
        return new C4976DJs(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    public C4973DJo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4973DJo(java.lang.String r5, int r6, java.lang.String r7) throws java.security.NoSuchAlgorithmException, java.lang.CloneNotSupportedException {
        /*
            r4 = this;
            r4.<init>()
            r7.getClass()
            r4.toString = r7
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r5)     // Catch: java.security.NoSuchAlgorithmException -> L31
            r4.prototype = r3
            int r2 = r3.getDigestLength()
            r0 = 4
            if (r6 < r0) goto L18
            r0 = 1
            if (r6 <= r2) goto L19
        L18:
            r0 = 0
        L19:
            java.lang.String r1 = "bytes (%s) must be >= 4 and < %s"
            if (r0 == 0) goto L28
            r4.bytes = r6
            r3.clone()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            r4.supportsClone = r0
            return
        L28:
            java.lang.Object[] r0 = X.BV5.A1Z(r6, r2)
            java.lang.IllegalArgumentException r0 = X.BV7.A0k(r1, r0)
            throw r0
        L31:
            r0 = move-exception
            java.lang.AssertionError r0 = X.BV4.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4973DJo.<init>(java.lang.String, int, java.lang.String):void");
    }

    public C4973DJo(String algorithmName, String toString) throws NoSuchAlgorithmException, CloneNotSupportedException {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
            this.prototype = messageDigest;
            this.bytes = messageDigest.getDigestLength();
            this.toString = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.supportsClone = z;
        } catch (NoSuchAlgorithmException e) {
            throw BV4.A0N(e);
        }
    }
}
