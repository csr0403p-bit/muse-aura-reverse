package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.GR9;
import X.GTH;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class AccessoryCallDelegate$startSession$call$1 extends AbstractC7559F3s implements G0U<GR9, Unit> {
    public final /* synthetic */ VoiceCallAccessory $accessory;
    public final /* synthetic */ GTH $startSessionParams;
    public final /* synthetic */ AccessoryCallDelegate this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GR9 gr9) {
        C7384Etj.A0Y(gr9, 0);
        this.this$0.bind(this.$startSessionParams.A09, gr9, this.$accessory);
        this.$startSessionParams.A0H.invoke(gr9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessoryCallDelegate$startSession$call$1(AccessoryCallDelegate accessoryCallDelegate, GTH gth, VoiceCallAccessory voiceCallAccessory) {
        super(1);
        this.this$0 = accessoryCallDelegate;
        this.$startSessionParams = gth;
        this.$accessory = voiceCallAccessory;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(GR9 gr9) {
        invoke2(gr9);
        return Unit.INSTANCE;
    }
}
