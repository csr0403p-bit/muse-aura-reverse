package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchFullscreenMapScreenKt$HatchFullscreenMapPresentationEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isLeaving;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ HatchMapPresentationState $presentationState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFullscreenMapScreenKt$HatchFullscreenMapPresentationEffect$1$1(boolean z, HatchMapPresentationState hatchMapPresentationState, String str) {
        super(1);
        this.$isLeaving = z;
        this.$presentationState = hatchMapPresentationState;
        this.$presentationId = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        boolean z = this.$isLeaving;
        HatchMapPresentationState hatchMapPresentationState = this.$presentationState;
        String str = this.$presentationId;
        if (z) {
            hatchMapPresentationState.endFullscreenPresentation(str);
        } else {
            hatchMapPresentationState.beginFullscreenPresentation(str);
        }
        final HatchMapPresentationState hatchMapPresentationState2 = this.$presentationState;
        final String str2 = this.$presentationId;
        return new C78g() { // from class: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapPresentationEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchMapPresentationState2.endFullscreenPresentation(str2);
            }
        };
    }
}
