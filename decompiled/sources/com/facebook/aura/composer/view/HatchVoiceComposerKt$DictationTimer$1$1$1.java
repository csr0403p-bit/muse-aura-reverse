package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchVoiceComposerKt$DictationTimer$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ boolean $isProcessing;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(AnonymousClass003.A02(this.$isProcessing ? 1 : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceComposerKt$DictationTimer$1$1$1(boolean z) {
        super(1);
        this.$isProcessing = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
