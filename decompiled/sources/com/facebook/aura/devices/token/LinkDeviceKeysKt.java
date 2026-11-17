package com.facebook.aura.devices.token;

import X.AnonymousClass002;
import X.BFI;
import X.C06827l3;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.HatchVmHostsKt;
import com.facebook.aura.network.http.HatchHttpApi;
import java.net.URI;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class LinkDeviceKeysKt {
    public static final String ERROR_NODE_EXISTS = "device_node_exists";
    public static final String ERROR_NODE_ROLE_CONFLICT = "device_node_role_conflict";
    public static final String HTTPS_SCHEME = "https";
    public static final int HTTP_CONFLICT = 409;
    public static final int MAX_DEVICE_FAMILY_LENGTH = 32;
    public static final int MAX_LABEL_LENGTH = 64;
    public static final int MAX_NODE_ID_LENGTH = 64;
    public static final int MAX_VM_ID_LENGTH = 64;
    public static final long OWNER_CONNECT_TIMEOUT_MS = 15000;
    public static final long PRE_REGISTER_DRAIN_TIMEOUT_MS = 5000;
    public static final long REMOVAL_CONNECT_TIMEOUT_MS = 5000;
    public static final long REVOKE_TIMEOUT_MS = 45000;
    public static final String TAG = "LinkDeviceKeys";
    public static final Set<Integer> SETTLED_REVOKE_FAILURE_CODES = BFI.A0H(new Integer[]{400, 404});
    public static final C06827l3 NODE_ID_REGEX = C06827l3.A02("[A-Za-z0-9._:-]+");
    public static final C06827l3 VM_HOST_LABEL_REGEX = C06827l3.A02("[A-Za-z0-9-]+");

    public static final String firmwareDerivedVmId(String str) {
        String strA0U;
        if (str != null && (strA0U = C7BY.A0U(str, "://", "")) != null && C7BY.A0k(strA0U, '.')) {
            String strA0S = C7BY.A0S(strA0U, strA0U, '.');
            if (VM_HOST_LABEL_REGEX.A08(strA0S)) {
                return strA0S;
            }
        }
        return null;
    }

    public static final boolean mayRevoke(LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJson, LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        String str;
        boolean zA1a = AnonymousClass002.A1a(linkDeviceKeyPendingRevokeJson, linkDeviceKeyOwnerState);
        if (LinkDeviceKeyRevocationQueueKt.isFor(linkDeviceKeyPendingRevokeJson, linkDeviceKeyOwnerState) && (str = linkDeviceKeyOwnerState.hatcheryVmId) != null && str.length() != 0 && isLiveOwnerSession(linkDeviceKeyOwnerState)) {
            if (!linkDeviceKeyOwnerState.privateAuthActive) {
                String str2 = linkDeviceKeyPendingRevokeJson.vm_kind;
                if ((str2 == null || str2.equals(LinkDeviceVmKind.SVM.getWireValue())) && vmKindOf(linkDeviceKeyOwnerState) == LinkDeviceVmKind.SVM) {
                    return zA1a;
                }
            } else if (linkDeviceKeyOwnerState.cvmAuthenticationReady) {
                return zA1a;
            }
        }
        return false;
    }

    public static final boolean ownerSessionQualifies(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState, LinkDeviceKeyTarget linkDeviceKeyTarget) {
        boolean zA1a = AnonymousClass002.A1a(linkDeviceKeyOwnerState, linkDeviceKeyTarget);
        if (C7384Etj.areEqual(targetFor(linkDeviceKeyOwnerState), linkDeviceKeyTarget) && isLiveOwnerSession(linkDeviceKeyOwnerState)) {
            int iOrdinal = linkDeviceKeyTarget.vmKind.ordinal();
            if (iOrdinal != zA1a) {
                if (iOrdinal != 0) {
                    throw C3cG.A0q();
                }
                if (!linkDeviceKeyOwnerState.privateAuthActive) {
                    return zA1a;
                }
            } else if (linkDeviceKeyOwnerState.cvmAuthenticationReady) {
                return zA1a;
            }
        }
        return false;
    }

    public static final LinkDeviceKeyTarget targetFor(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        LinkDeviceVmKind linkDeviceVmKindVmKindOf;
        String strProvisionVmIdOf;
        C7384Etj.A0Y(linkDeviceKeyOwnerState, 0);
        String str = linkDeviceKeyOwnerState.hatcheryVmId;
        if (str == null || str.length() <= 0 || (linkDeviceVmKindVmKindOf = vmKindOf(linkDeviceKeyOwnerState)) == null || (strProvisionVmIdOf = provisionVmIdOf(linkDeviceKeyOwnerState, str)) == null) {
            return null;
        }
        return new LinkDeviceKeyTarget(strProvisionVmIdOf, linkDeviceVmKindVmKindOf, str, linkDeviceKeyOwnerState.gatewayUrl);
    }

    public static final LinkDeviceVmKind vmKindOf(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        C7384Etj.A0Y(linkDeviceKeyOwnerState, 0);
        String str = linkDeviceKeyOwnerState.hatcheryVmId;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (linkDeviceKeyOwnerState.handshakeConfidential || linkDeviceKeyOwnerState.handshakeProvenCvm) {
            return LinkDeviceVmKind.CVM;
        }
        if (linkDeviceKeyOwnerState.handshakeStandard) {
            return LinkDeviceVmKind.SVM;
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkDeviceVmKind.values().length];
            try {
                AnonymousClass002.A13(LinkDeviceVmKind.CVM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkDeviceVmKind.SVM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LinkDeviceKeyFailure failureOf(Throwable th) {
        NetworkException networkException;
        int i;
        return th instanceof LinkDeviceKeyException ? ((LinkDeviceKeyException) th).failure : (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null || 400 > (i = networkException.httpResponseCode) || i >= 600) ? LinkDeviceKeyFailure.TRANSPORT_FAILED : LinkDeviceKeyFailure.REJECTED;
    }

    public static final boolean isLiveOwnerSession(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        return C7384Etj.areEqual(linkDeviceKeyOwnerState.connectedGatewayUrl, linkDeviceKeyOwnerState.gatewayUrl) && linkDeviceKeyOwnerState.vmHttpRoutedOverNoise && isNoiseRoutedVmHttpBase(linkDeviceKeyOwnerState.gatewayUrl);
    }

    public static final boolean isNoiseRoutedVmHttpBase(String str) {
        URI uri;
        String strJarvisHttpBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(str);
        if (strJarvisHttpBaseUrl == null) {
            return false;
        }
        try {
            uri = new URI(strJarvisHttpBaseUrl);
        } catch (Exception unused) {
        }
        return "https".equals(uri.getScheme()) && HatchVmHostsKt.isMetaAiVmHost(uri.getHost());
    }

    public static final LinkDeviceKeyPendingRevokeJson nodeRevoke(String str, LinkDeviceKeyOwnerState linkDeviceKeyOwnerState) {
        String str2 = linkDeviceKeyOwnerState.hatcheryVmId;
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        String str3 = linkDeviceKeyOwnerState.inventoryVmId;
        if (str3 == null || str3.length() <= 0) {
            str3 = null;
        }
        LinkDeviceVmKind linkDeviceVmKindVmKindOf = vmKindOf(linkDeviceKeyOwnerState);
        return new LinkDeviceKeyPendingRevokeJson(str2, str3, linkDeviceVmKindVmKindOf != null ? linkDeviceVmKindVmKindOf.getWireValue() : null, null, str, 0);
    }

    public static final String provisionVmIdOf(LinkDeviceKeyOwnerState linkDeviceKeyOwnerState, String str) {
        String strFirmwareDerivedVmId;
        int length;
        if (linkDeviceKeyOwnerState.inventoryListsSelectedVm && ((((strFirmwareDerivedVmId = linkDeviceKeyOwnerState.inventoryVmId) != null && strFirmwareDerivedVmId.length() > 0) || ((strFirmwareDerivedVmId = firmwareDerivedVmId(linkDeviceKeyOwnerState.inventoryVmUrl)) != null && strFirmwareDerivedVmId.equals(str))) && 1 <= (length = strFirmwareDerivedVmId.length()) && length < 65)) {
            for (int i = 0; i < length; i++) {
                char cCharAt = strFirmwareDerivedVmId.charAt(i);
                if ('!' <= cCharAt && cCharAt < '\u007f') {
                }
            }
            return strFirmwareDerivedVmId;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult registerFailureOf(java.lang.Throwable r6, com.facebook.aura.devices.token.LinkDeviceKeyRegisterRequestJson r7) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.json.NetworkException
            r5 = 0
            if (r0 == 0) goto L37
            r4 = r6
            com.facebook.aura.json.NetworkException r4 = (com.facebook.aura.json.NetworkException) r4
            if (r4 == 0) goto L38
            int r0 = r4.httpResponseCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.errorCode
            if (r0 != 0) goto L16
        L14:
            java.lang.String r0 = "none"
        L16:
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "LinkDeviceKeys"
            java.lang.String r0 = "register rejected: status=%s code=%s"
            X.CFK.A0F(r1, r0, r2)
            com.facebook.aura.devices.token.LinkDeviceKeyFailure r0 = failureOf(r6)
            com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult$Failed r1 = new com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult$Failed
            r1.<init>(r0)
            if (r4 == 0) goto L8d
            int r2 = r4.httpResponseCode
            r0 = 409(0x199, float:5.73E-43)
            if (r2 != r0) goto L8d
            kotlinx.serialization.json.JsonElement r3 = r4.errorBody
            if (r3 == 0) goto L8d
            goto L3a
        L37:
            r4 = r5
        L38:
            r1 = r5
            goto L14
        L3a:
            X.9sU r2 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L45
            com.facebook.aura.devices.token.LinkDeviceKeyConflictResponseJson$$serializer r0 = com.facebook.aura.devices.token.LinkDeviceKeyConflictResponseJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = X.C3cI.A0T(r0, r2, r3)     // Catch: java.lang.Throwable -> L45
            com.facebook.aura.devices.token.LinkDeviceKeyConflictResponseJson r2 = (com.facebook.aura.devices.token.LinkDeviceKeyConflictResponseJson) r2     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r0 = move-exception
            X.Hud r2 = X.C3cG.A0s(r0)
        L4a:
            boolean r0 = r2 instanceof X.C10571Hud
            if (r0 == 0) goto L4f
            r2 = r5
        L4f:
            com.facebook.aura.devices.token.LinkDeviceKeyConflictResponseJson r2 = (com.facebook.aura.devices.token.LinkDeviceKeyConflictResponseJson) r2
            if (r2 == 0) goto L8d
            com.facebook.aura.devices.token.LinkDeviceKeyRecordJson r3 = r2.existing
            if (r3 == 0) goto L8d
            java.lang.String r2 = r3.node_id
            java.lang.String r0 = r7.node_id
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto L8d
            java.lang.String r2 = r3.key_id
            r0 = 16
            byte[] r0 = com.facebook.aura.devices.token.LinkDeviceKeyKt.decodeLinkDeviceKeyBase64(r2, r0)
            if (r0 == 0) goto L8d
            X.C8j4.A1T(r0)
            com.facebook.aura.devices.token.LinkDeviceKeyRecord r3 = toRecord(r3)
            java.lang.String r2 = r4.errorCode
            java.lang.String r0 = "device_node_exists"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8e
            java.lang.String r1 = r3.role
            java.lang.String r0 = r7.role
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L96
            com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult$NodeExists r1 = new com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult$NodeExists
            r1.<init>(r3)
        L8b:
            com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult r1 = (com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult) r1
        L8d:
            return r1
        L8e:
            java.lang.String r0 = "device_node_role_conflict"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8b
        L96:
            com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult$NodeRoleConflict r1 = new com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult$NodeRoleConflict
            r1.<init>(r3)
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeysKt.registerFailureOf(java.lang.Throwable, com.facebook.aura.devices.token.LinkDeviceKeyRegisterRequestJson):com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult");
    }

    public static final LinkDeviceKeyRecord toRecord(LinkDeviceKeyRecordJson linkDeviceKeyRecordJson) {
        return new LinkDeviceKeyRecord(linkDeviceKeyRecordJson.key_id, linkDeviceKeyRecordJson.role, linkDeviceKeyRecordJson.label, linkDeviceKeyRecordJson.node_id, linkDeviceKeyRecordJson.device_family, linkDeviceKeyRecordJson.last_seen_at_ms);
    }

    public static final LinkDeviceKeyRegisterRequestJson toRequestJson(LinkDeviceKeyRegistration linkDeviceKeyRegistration, String str) {
        String str2;
        int length;
        String str3 = linkDeviceKeyRegistration.nodeId;
        int length2 = str3.length();
        if (1 > length2 || length2 >= 65 || !NODE_ID_REGEX.A08(str3) || 1 > (length = (str2 = linkDeviceKeyRegistration.label).length()) || length >= 65) {
            return null;
        }
        String str4 = linkDeviceKeyRegistration.deviceFamily;
        if (str4.length() <= 32) {
            return new LinkDeviceKeyRegisterRequestJson(linkDeviceKeyRegistration.role.getWireValue(), str2, linkDeviceKeyRegistration.nodeId, str4, str);
        }
        return null;
    }
}
