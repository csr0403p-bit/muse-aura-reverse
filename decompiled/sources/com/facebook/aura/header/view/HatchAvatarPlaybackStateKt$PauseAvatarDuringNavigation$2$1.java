package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ HatchAvatarPlaybackState $playback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$2$1(HatchAvatarPlaybackState hatchAvatarPlaybackState, Object obj) {
        super(1);
        this.$playback = hatchAvatarPlaybackState;
        this.$owner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchAvatarPlaybackState hatchAvatarPlaybackState = this.$playback;
        final Object obj = this.$owner;
        return new C78g() { // from class: com.facebook.aura.header.view.HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchAvatarPlaybackState.setPaused$fbandroid_express_aura_java_com_facebook_aura_header_view_view(obj, false);
            }
        };
    }
}
