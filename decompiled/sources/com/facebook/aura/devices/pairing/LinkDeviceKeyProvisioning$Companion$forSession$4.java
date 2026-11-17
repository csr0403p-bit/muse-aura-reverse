package com.facebook.aura.devices.pairing;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.devices.token.LinkDeviceKey;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class LinkDeviceKeyProvisioning$Companion$forSession$4 extends C7438Evz implements G0U<LinkDeviceKey, Unit> {
    public LinkDeviceKeyProvisioning$Companion$forSession$4(Object obj) {
        super(1, obj, LinkDeviceKeys.class, "revokeDetached", "revokeDetached(Lcom/facebook/aura/devices/token/LinkDeviceKey;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinkDeviceKey linkDeviceKey) {
        ((LinkDeviceKeys) AnonymousClass006.A0o(linkDeviceKey, this)).revokeDetached(linkDeviceKey);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceKey linkDeviceKey) {
        invoke2(linkDeviceKey);
        return Unit.INSTANCE;
    }
}
