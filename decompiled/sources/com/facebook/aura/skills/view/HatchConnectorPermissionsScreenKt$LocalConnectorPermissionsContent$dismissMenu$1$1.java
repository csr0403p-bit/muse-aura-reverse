package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$dismissMenu$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $menuGroupKey$delegate;
    public final /* synthetic */ MutableState<String> $menuMethodKey$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$dismissMenu$1$1(MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$menuGroupKey$delegate = mutableState;
        this.$menuMethodKey$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$menuGroupKey$delegate.Af8(null);
        this.$menuMethodKey$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
