package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$22$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnVideoCoveringChanged$delegate;
    public final /* synthetic */ boolean $visibleVideoCovering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$22$1(boolean z, C1BO<? extends G0U<? super Boolean, Unit>> c1bo) {
        super(1);
        this.$visibleVideoCovering = z;
        this.$currentOnVideoCoveringChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AnonymousClass001.A1K(this.$visibleVideoCovering, C1BO.A0B(this.$currentOnVideoCoveringChanged$delegate));
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$22$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
