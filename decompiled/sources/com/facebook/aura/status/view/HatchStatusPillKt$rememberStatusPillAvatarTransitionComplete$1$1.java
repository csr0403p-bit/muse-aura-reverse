package com.facebook.aura.status.view;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$rememberStatusPillAvatarTransitionComplete$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AT5<Float, AOW> $avatarSize;
    public final /* synthetic */ boolean $isCompactAvatar;
    public final /* synthetic */ C1BO<Float> $takeoverFramingFraction;
    public final /* synthetic */ float $targetAvatarSize;
    public final /* synthetic */ C1BO<Boolean> $waitingForIdle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$rememberStatusPillAvatarTransitionComplete$1$1(C1BO<Boolean> c1bo, AT5<Float, AOW> at5, float f, boolean z, C1BO<Float> c1bo2) {
        super(0);
        this.$waitingForIdle = c1bo;
        this.$avatarSize = at5;
        this.$targetAvatarSize = f;
        this.$isCompactAvatar = z;
        this.$takeoverFramingFraction = c1bo2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!C1BO.A0F(this.$waitingForIdle) && !this.$avatarSize.A05() && MutableState.A00(this.$avatarSize) == this.$targetAvatarSize && (this.$isCompactAvatar || C1BO.A01(this.$takeoverFramingFraction) == 1.0f));
    }
}
