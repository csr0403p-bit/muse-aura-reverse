package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$29$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $avatarVideoReady;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnAvatarVideoReadyChanged$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$29$1(boolean z, C1BO<? extends G0U<? super Boolean, Unit>> c1bo) {
        super(1);
        this.$avatarVideoReady = z;
        this.$currentOnAvatarVideoReadyChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AnonymousClass001.A1K(this.$avatarVideoReady, C1BO.A0B(this.$currentOnAvatarVideoReadyChanged$delegate));
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$29$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
