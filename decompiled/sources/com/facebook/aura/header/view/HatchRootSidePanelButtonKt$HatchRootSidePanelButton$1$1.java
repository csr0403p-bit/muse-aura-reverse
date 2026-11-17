package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class HatchRootSidePanelButtonKt$HatchRootSidePanelButton$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<AuraNavKey> $topKey$delegate;
    public final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRootSidePanelButtonKt$HatchRootSidePanelButton$1$1(boolean z, C1BO<? extends AuraNavKey> c1bo) {
        super(1);
        this.$visible = z;
        this.$topKey$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$topKey$delegate.getValue();
        return new C78g() { // from class: com.facebook.aura.header.view.HatchRootSidePanelButtonKt$HatchRootSidePanelButton$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
