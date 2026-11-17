package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$8$5$3$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ boolean $isTakeoverAvatar;
    public final /* synthetic */ AvatarTakeoverIdleMedia $takeoverIdleMedia;
    public final /* synthetic */ C1BO<Boolean> $transitionComplete;
    public final /* synthetic */ C1BO<Boolean> $waitingForIdle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$8$5$3$1(C1BO<Boolean> c1bo, AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, boolean z, C1BO<Boolean> c1bo2) {
        super(0);
        this.$waitingForIdle = c1bo;
        this.$takeoverIdleMedia = avatarTakeoverIdleMedia;
        this.$isTakeoverAvatar = z;
        this.$transitionComplete = c1bo2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AvatarTakeoverIdleMedia avatarTakeoverIdleMedia;
        boolean z = true;
        if (!C1BO.A0F(this.$waitingForIdle) ? !this.$isTakeoverAvatar || C1BO.A0F(this.$transitionComplete) : (avatarTakeoverIdleMedia = this.$takeoverIdleMedia) != null && avatarTakeoverIdleMedia.videoUri != null && !avatarTakeoverIdleMedia.imageIsVideoPoster) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
