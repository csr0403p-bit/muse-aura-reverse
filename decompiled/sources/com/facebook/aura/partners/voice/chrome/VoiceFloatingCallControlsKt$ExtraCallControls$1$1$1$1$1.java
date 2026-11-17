package com.facebook.aura.partners.voice.chrome;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.BHP;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceFloatingCallControlsKt$ExtraCallControls$1$1$1$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ List<BHP> $moveActions;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0C(interfaceC0857A6e, this.$moveActions);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$ExtraCallControls$1$1$1$1$1(List<BHP> list) {
        super(1);
        this.$moveActions = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
