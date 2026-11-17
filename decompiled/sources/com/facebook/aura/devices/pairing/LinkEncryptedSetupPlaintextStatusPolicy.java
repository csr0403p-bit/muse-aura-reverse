package com.facebook.aura.devices.pairing;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetupPlaintextStatusPolicy {
    public static final int $stable = 0;
    public static final LinkEncryptedSetupPlaintextStatusPolicy INSTANCE = new LinkEncryptedSetupPlaintextStatusPolicy();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean allowsBeforeSession(java.lang.String r2) {
        /*
            r1 = this;
            r1 = 0
            X.C7384Etj.A0Y(r2, r1)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2009916380: goto Lc;
                case -541760350: goto Lf;
                case 1335353055: goto L1b;
                case 2066585692: goto L12;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "error_encryption_required"
            goto L14
        Lf:
            java.lang.String r0 = "error_pairing_unavailable"
            goto L14
        L12:
            java.lang.String r0 = "error_pairing_invalid_hello"
        L14:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L23
            return r1
        L1b:
            java.lang.String r0 = "error_pairing_decrypt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
        L23:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupPlaintextStatusPolicy.allowsBeforeSession(java.lang.String):boolean");
    }
}
