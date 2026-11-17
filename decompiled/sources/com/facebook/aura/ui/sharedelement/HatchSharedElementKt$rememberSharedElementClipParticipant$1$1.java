package com.facebook.aura.ui.sharedelement;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchSharedElementKt$rememberSharedElementClipParticipant$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SharedElementClipParticipant $participant;
    public final /* synthetic */ SharedElementClipRegistry $registry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedElementKt$rememberSharedElementClipParticipant$1$1(SharedElementClipRegistry sharedElementClipRegistry, SharedElementClipParticipant sharedElementClipParticipant) {
        super(1);
        this.$registry = sharedElementClipRegistry;
        this.$participant = sharedElementClipParticipant;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$registry.register(this.$participant);
        final SharedElementClipRegistry sharedElementClipRegistry = this.$registry;
        final SharedElementClipParticipant sharedElementClipParticipant = this.$participant;
        return new C78g() { // from class: com.facebook.aura.ui.sharedelement.HatchSharedElementKt$rememberSharedElementClipParticipant$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                sharedElementClipRegistry.unregister(sharedElementClipParticipant);
            }
        };
    }
}
