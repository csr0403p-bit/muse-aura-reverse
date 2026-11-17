package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Boolean> $collapsing$delegate;
    public final /* synthetic */ AvatarTakeoverIdleMedia $current;
    public final /* synthetic */ boolean $isCallAvatar;
    public final /* synthetic */ MutableState<AvatarTakeoverIdleMedia> $previous$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$1$1(boolean z, AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, C1BO<Boolean> c1bo, MutableState<AvatarTakeoverIdleMedia> mutableState) {
        super(0);
        this.$isCallAvatar = z;
        this.$current = avatarTakeoverIdleMedia;
        this.$collapsing$delegate = c1bo;
        this.$previous$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$isCallAvatar) {
            C1BO<Boolean> c1bo = this.$collapsing$delegate;
            float f = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
            if (C1BO.A0F(c1bo)) {
                return;
            }
        }
        MutableState<AvatarTakeoverIdleMedia> mutableState = this.$previous$delegate;
        AvatarTakeoverIdleMedia avatarTakeoverIdleMedia = this.$current;
        float f2 = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
        mutableState.Af8(avatarTakeoverIdleMedia);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
