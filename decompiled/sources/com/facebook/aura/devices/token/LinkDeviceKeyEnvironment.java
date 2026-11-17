package com.facebook.aura.devices.token;

import X.HsJ;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes4.dex */
public interface LinkDeviceKeyEnvironment {
    Object awaitGatewayConnected(long j, HtJ<? super Unit> htJ);

    LinkDeviceKeyRevocationQueue getRevocations();

    LinkDeviceKeyOwnerState ownerState();

    /* renamed from: register-0E7RQCE, reason: not valid java name */
    Object mo731register0E7RQCE(String str, LinkDeviceKeyRegisterRequestJson linkDeviceKeyRegisterRequestJson, HtJ<? super HsJ<LinkDeviceKeyRegisterResponseJson>> htJ);

    /* renamed from: revoke-0E7RQCE, reason: not valid java name */
    Object mo732revoke0E7RQCE(String str, LinkDeviceKeyRevokeRequestJson linkDeviceKeyRevokeRequestJson, HtJ<? super HsJ<LinkDeviceKeyRevokeResponseJson>> htJ);
}
