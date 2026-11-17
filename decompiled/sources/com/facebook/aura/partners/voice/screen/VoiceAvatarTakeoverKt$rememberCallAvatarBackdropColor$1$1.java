package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$rememberCallAvatarBackdropColor$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Boolean> $collapsing$delegate;
    public final /* synthetic */ Integer $current;
    public final /* synthetic */ MutableState<Integer> $previous$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$rememberCallAvatarBackdropColor$1$1(Integer num, C1BO<Boolean> c1bo, MutableState<Integer> mutableState) {
        super(0);
        this.$current = num;
        this.$collapsing$delegate = c1bo;
        this.$previous$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$current == null) {
            C1BO<Boolean> c1bo = this.$collapsing$delegate;
            float f = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
            if (C1BO.A0F(c1bo)) {
                return;
            }
        }
        MutableState<Integer> mutableState = this.$previous$delegate;
        Integer num = this.$current;
        float f2 = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
        mutableState.Af8(num);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
