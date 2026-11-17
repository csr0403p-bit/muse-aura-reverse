package com.facebook.aura.devices.token;

import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import java.util.Arrays;
import java.util.Base64;

/* loaded from: classes4.dex */
public final class LinkDeviceKey {
    public final String encodedKeyId;
    public boolean isCleared;
    public final String keyIdHint;
    public final Object lock;
    public final byte[] secret;
    public final LinkDeviceKeyTarget target;

    public LinkDeviceKey(byte[] bArr, byte[] bArr2, LinkDeviceKeyTarget linkDeviceKeyTarget) {
        AnonymousClass005.A10(bArr, bArr2, linkDeviceKeyTarget);
        this.target = linkDeviceKeyTarget;
        this.lock = C3cG.A0T();
        this.secret = bArr2;
        this.keyIdHint = LinkDeviceKeyKt.linkDeviceKeyIdHint(bArr);
        String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
        C7384Etj.A0U(strEncodeToString);
        this.encodedKeyId = strEncodeToString;
        int length = bArr.length;
        if (length != 16 || bArr2.length != 32) {
            throw C60O.A0i("Failed requirement.");
        }
        Arrays.fill(bArr, 0, length, (byte) 0);
    }

    public final void clear() {
        synchronized (this.lock) {
            C8j4.A1T(this.secret);
            this.isCleared = true;
        }
    }

    public final String getEncodedKeyId() {
        return this.encodedKeyId;
    }

    public final String getKeyIdHint() {
        return this.keyIdHint;
    }

    public final LinkDeviceKeyTarget getTarget() {
        return this.target;
    }

    public final LinkDeviceKeyProvisionFields provisionFields() {
        LinkDeviceKeyProvisionFields linkDeviceKeyProvisionFields;
        synchronized (this.lock) {
            if (this.isCleared) {
                linkDeviceKeyProvisionFields = null;
            } else {
                String strEncodeToString = Base64.getEncoder().encodeToString(this.secret);
                C7384Etj.A0U(strEncodeToString);
                String str = this.encodedKeyId;
                LinkDeviceKeyTarget linkDeviceKeyTarget = this.target;
                linkDeviceKeyProvisionFields = new LinkDeviceKeyProvisionFields(strEncodeToString, str, linkDeviceKeyTarget.vmId, linkDeviceKeyTarget.vmKind.getWireValue());
            }
        }
        return linkDeviceKeyProvisionFields;
    }

    public String toString() {
        return C60O.A0r("LinkDeviceKey(key_id_hint=", this.keyIdHint);
    }
}
