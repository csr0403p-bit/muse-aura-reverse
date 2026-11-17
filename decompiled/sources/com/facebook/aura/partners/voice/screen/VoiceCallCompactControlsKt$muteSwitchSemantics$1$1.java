package com.facebook.aura.partners.voice.screen;

import X.AY3;
import X.AbstractC1564Ale;
import X.AbstractC1671Anw;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceCallCompactControlsKt$muteSwitchSemantics$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $muted;
    public final /* synthetic */ String $stateLabel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A06(interfaceC0857A6e, 2);
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0g, this.$muted ? AY3.A03 : AY3.A02);
        AbstractC1564Ale.A09(interfaceC0857A6e, this.$stateLabel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCompactControlsKt$muteSwitchSemantics$1$1(boolean z, String str) {
        super(1);
        this.$muted = z;
        this.$stateLabel = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
