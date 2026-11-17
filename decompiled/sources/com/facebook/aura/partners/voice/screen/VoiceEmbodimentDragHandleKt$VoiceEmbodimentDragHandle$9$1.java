package com.facebook.aura.partners.voice.screen;

import X.ART;
import X.AT3;
import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C16a;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$9$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ DragHandleLook $look;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long jM1725fill0d7_KjU = this.$look.m1725fill0d7_KjU();
        long jAKb = at3.AKb();
        long jA0N = AnonymousClass003.A0N(C8j3.A0P(AWA.A01(jAKb) / 2.0f));
        at3.A9j(null, C16a.A00, 1.0f, 3, jM1725fill0d7_KjU, 0L, ART.A00(jAKb, 0L), jA0N);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$9$1(DragHandleLook dragHandleLook) {
        super(1);
        this.$look = dragHandleLook;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
