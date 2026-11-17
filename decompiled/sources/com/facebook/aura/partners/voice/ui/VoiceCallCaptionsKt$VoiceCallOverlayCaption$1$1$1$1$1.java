package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C15k;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$VoiceCallOverlayCaption$1$1$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $originX;
    public final /* synthetic */ Function0<Float> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA04 = AnonymousClass003.A04(this.$progress);
        c2av.AeX(fA04);
        c2av.Acj(fA04);
        long jA0J = AnonymousClass005.A0J(this.$originX, 1.0f);
        long j = C15k.A01;
        c2av.Af4(jA0J);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$VoiceCallOverlayCaption$1$1$1$1$1(Function0<Float> function0, float f) {
        super(1);
        this.$progress = function0;
        this.$originX = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
