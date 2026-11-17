package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceMenuSheetKt$SpaceMenuActions$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceMenuViewModel $model;
    public final /* synthetic */ MutableState<String> $renameText$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuSheetKt$SpaceMenuActions$9$1(SpaceMenuViewModel spaceMenuViewModel, MutableState<String> mutableState) {
        super(0);
        this.$model = spaceMenuViewModel;
        this.$renameText$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.rename(MutableState.A06((MutableState) this.$renameText$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
