package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC2269BPv;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$8$1 extends AbstractC7559F3s implements G0U<InterfaceC2269BPv, Unit> {
    public final /* synthetic */ DragHandleLook $look;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC2269BPv interfaceC2269BPv) {
        C7384Etj.A0Y(interfaceC2269BPv, 0);
        interfaceC2269BPv.Ad4(this.$look.m1726shadow0d7_KjU());
        interfaceC2269BPv.AeL(interfaceC2269BPv.Ah4(3.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$8$1(DragHandleLook dragHandleLook) {
        super(1);
        this.$look = dragHandleLook;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC2269BPv interfaceC2269BPv) {
        invoke2(interfaceC2269BPv);
        return Unit.INSTANCE;
    }
}
