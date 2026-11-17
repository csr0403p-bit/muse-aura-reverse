package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1DG;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillAvatarPanelKt$rememberStatusPillMediaSize$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ float $mediaSize;
    public final /* synthetic */ MutableState<C1DG> $retainedSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillAvatarPanelKt$rememberStatusPillMediaSize$1$1(float f, MutableState<C1DG> mutableState) {
        super(0);
        this.$mediaSize = f;
        this.$retainedSize$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1DG.A06(this.$mediaSize, this.$retainedSize$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
