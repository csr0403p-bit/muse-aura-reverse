package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ComposerMode $composerMode;
    public final /* synthetic */ MutableState<ComposerMode> $slideMode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$2$1(ComposerMode composerMode, MutableState<ComposerMode> mutableState) {
        super(0);
        this.$composerMode = composerMode;
        this.$slideMode$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$slideMode$delegate.Af8(this.$composerMode);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
