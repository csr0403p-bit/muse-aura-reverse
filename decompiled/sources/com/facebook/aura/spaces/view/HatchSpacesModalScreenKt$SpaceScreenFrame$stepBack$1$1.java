package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.HxE;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenFrame$stepBack$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBackClick;
    public final /* synthetic */ MutableState<HxE<Boolean, Function0<Unit>>> $webBackState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenFrame$stepBack$1$1(Function0<Unit> function0, MutableState<HxE<Boolean, Function0<Unit>>> mutableState) {
        super(0);
        this.$onBackClick = function0;
        this.$webBackState$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HxE<Boolean, Function0<Unit>> value = this.$webBackState$delegate.getValue();
        boolean zA1X = AnonymousClass001.A1X(value.first);
        Function0<Unit> function0 = value.second;
        if (!zA1X) {
            function0 = this.$onBackClick;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
