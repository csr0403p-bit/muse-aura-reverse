package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ C00q $scrubFraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$1$1(C00q c00q) {
        super(1);
        this.$scrubFraction = c00q;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        this.$scrubFraction.AdS(f);
    }
}
