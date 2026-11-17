package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCaptionOverlayKt$CaptionStyleCrossfade$1$2$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $it;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(AnonymousClass003.A04(this.$it));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$CaptionStyleCrossfade$1$2$1$1(Function0<Float> function0) {
        super(1);
        this.$it = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
