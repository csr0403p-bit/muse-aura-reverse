package com.facebook.aura.devices.token;

import X.AnonymousClass002;
import X.C7384Etj;
import X.FGI;
import java.util.Base64;

/* loaded from: classes4.dex */
public abstract class LinkDeviceKeyRevocationQueueKt {
    public static final String KEY_REVOCATION_QUEUE = "link_device_key_revocation_queue";
    public static final String TAG = "LinkDeviceKeyRevocations";

    public static final String getLogTag(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson) {
        C7384Etj.A0Y(linkDeviceKeyPendingRevokeJson, 0);
        String str = linkDeviceKeyPendingRevokeJson.key_id;
        return str != null ? FGI.A0M("key_id_hint=", keyIdHintOf(str)) : "node";
    }

    public static final LinkDeviceKeyRevokeRequestJson getRequest(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson) {
        C7384Etj.A0Y(linkDeviceKeyPendingRevokeJson, 0);
        String str = linkDeviceKeyPendingRevokeJson.key_id;
        String str2 = linkDeviceKeyPendingRevokeJson.node_id;
        if (str != null) {
            str2 = null;
        }
        return new LinkDeviceKeyRevokeRequestJson(str, str2);
    }

    public static final boolean isFor(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        String str;
        boolean zA1a = AnonymousClass002.A1a(linkDeviceKeyPendingRevokeJson, linkDeviceKeyOwnerState);
        if (C7384Etj.areEqual(linkDeviceKeyPendingRevokeJson.host_label, linkDeviceKeyOwnerState.hatcheryVmId) || ((str = linkDeviceKeyPendingRevokeJson.vm_id) != null && str.length() > 0 && str.equals(linkDeviceKeyOwnerState.inventoryVmId))) {
            return zA1a;
        }
        return false;
    }

    public static final boolean isSame(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson2) {
        boolean zA1a = AnonymousClass002.A1a(linkDeviceKeyPendingRevokeJson, linkDeviceKeyPendingRevokeJson2);
        if (C7384Etj.areEqual(linkDeviceKeyPendingRevokeJson.host_label, linkDeviceKeyPendingRevokeJson2.host_label) && C7384Etj.areEqual(linkDeviceKeyPendingRevokeJson.key_id, linkDeviceKeyPendingRevokeJson2.key_id) && C7384Etj.areEqual(linkDeviceKeyPendingRevokeJson.node_id, linkDeviceKeyPendingRevokeJson2.node_id)) {
            return zA1a;
        }
        return false;
    }

    public static final String keyIdHintOf(String str) {
        try {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            C7384Etj.A0U(bArrDecode);
            return LinkDeviceKeyKt.linkDeviceKeyIdHint(bArrDecode);
        } catch (IllegalArgumentException unused) {
            return "invalid";
        }
    }
}
