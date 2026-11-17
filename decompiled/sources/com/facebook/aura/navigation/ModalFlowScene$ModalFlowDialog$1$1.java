package com.facebook.aura.navigation;

import X.AOI;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class ModalFlowScene$ModalFlowDialog$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AOI<Boolean> $visibility;
    public final /* synthetic */ ModalFlowScene<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalFlowScene$ModalFlowDialog$1$1(ModalFlowScene<T> modalFlowScene, AOI<Boolean> aoi) {
        super(1);
        this.this$0 = modalFlowScene;
        this.$visibility = aoi;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final ModalFlowScene<T> modalFlowScene = this.this$0;
        final AOI<Boolean> aoi = this.$visibility;
        modalFlowScene.shownVisibility = aoi;
        return new C78g() { // from class: com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                ModalFlowScene modalFlowScene2 = modalFlowScene;
                if (modalFlowScene2.shownVisibility == aoi) {
                    modalFlowScene2.shownVisibility = null;
                }
            }
        };
    }
}
