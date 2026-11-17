package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverIdleFrame;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $showsCallIdle;
    public final /* synthetic */ AvatarTakeover $takeover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$1$1(boolean z, AvatarTakeover avatarTakeover) {
        super(1);
        this.$showsCallIdle = z;
        this.$takeover = avatarTakeover;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AvatarTakeover avatarTakeover;
        if (this.$showsCallIdle && (avatarTakeover = this.$takeover) != null) {
            avatarTakeover.onIdleMediaShown(AvatarTakeoverIdleFrame.VIDEO);
        }
        return new C78g() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
