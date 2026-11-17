package com.facebook.aura.devices.pairing;

import X.C7384Etj;
import com.facebook.aura.devices.pairing.LinkDeviceKeyPlan;

/* loaded from: classes4.dex */
public abstract class LinkDeviceKeyProvisioningKt {
    public static final int LINK_DEVICE_FAMILY_MAX_LENGTH = 32;
    public static final String LINK_STATUS_AUTH_OK = "auth_ok";

    public static final boolean getMintsTokens(LinkDeviceKeyPlan linkDeviceKeyPlan) {
        LinkDeviceKeyPlan.OtaRound otaRound;
        C7384Etj.A0Y(linkDeviceKeyPlan, 0);
        if (!(linkDeviceKeyPlan instanceof LinkDeviceKeyPlan.OtaRound) || (otaRound = (LinkDeviceKeyPlan.OtaRound) linkDeviceKeyPlan) == null) {
            return true;
        }
        return otaRound.mintsTokens;
    }
}
