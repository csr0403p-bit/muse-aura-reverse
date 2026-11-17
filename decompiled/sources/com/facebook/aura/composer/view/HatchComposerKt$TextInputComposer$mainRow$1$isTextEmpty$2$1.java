package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1890At8;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$isTextEmpty$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1890At8 $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$isTextEmpty$2$1(C1890At8 c1890At8) {
        super(0);
        this.$state = c1890At8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1M(this.$state.A07().length()));
    }
}
