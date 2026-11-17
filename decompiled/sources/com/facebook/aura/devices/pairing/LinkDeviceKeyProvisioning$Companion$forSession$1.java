package com.facebook.aura.devices.pairing;

import X.C7438Evz;
import X.G0U;
import X.HtJ;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import com.facebook.aura.devices.token.LinkDeviceVmKind;

/* loaded from: classes4.dex */
public final /* synthetic */ class LinkDeviceKeyProvisioning$Companion$forSession$1 extends C7438Evz implements G0U {
    public LinkDeviceKeyProvisioning$Companion$forSession$1(Object obj) {
        super(1, obj, LinkDeviceKeys.class, "selectedVmKind", "selectedVmKind(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super LinkDeviceVmKind> htJ) {
        return ((LinkDeviceKeys) this.receiver).selectedVmKind(htJ);
    }
}
