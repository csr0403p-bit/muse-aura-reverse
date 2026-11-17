package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.api.AvatarTakeover;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentityPill$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ AvatarTakeover $takeover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentityPill$2$1(AvatarTakeover avatarTakeover, Object obj) {
        super(1);
        this.$takeover = avatarTakeover;
        this.$owner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AvatarTakeover avatarTakeover = this.$takeover;
        final Object obj = this.$owner;
        return new C78g() { // from class: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentityPill$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                AvatarTakeover avatarTakeover2 = avatarTakeover;
                if (avatarTakeover2 != null) {
                    avatarTakeover2.updateVisibility(obj, false);
                }
            }
        };
    }
}
