package com.facebook.aura.devices.token;

import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyException extends RuntimeException {
    public final LinkDeviceKeyFailure failure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeyException(LinkDeviceKeyFailure linkDeviceKeyFailure) {
        super(linkDeviceKeyFailure.name());
        C7384Etj.A0Y(linkDeviceKeyFailure, 0);
        this.failure = linkDeviceKeyFailure;
    }

    public final LinkDeviceKeyFailure getFailure() {
        return this.failure;
    }
}
