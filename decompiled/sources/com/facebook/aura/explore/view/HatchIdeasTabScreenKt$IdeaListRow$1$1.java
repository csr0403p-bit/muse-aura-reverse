package com.facebook.aura.explore.view;

import X.AOI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$IdeaListRow$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isDismissing;
    public final /* synthetic */ AOI<Boolean> $visibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$IdeaListRow$1$1(boolean z, AOI<Boolean> aoi) {
        super(1);
        this.$isDismissing = z;
        this.$visibleState = aoi;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isDismissing) {
            this.$visibleState.A0C(AnonymousClass001.A0h());
        }
        return new C78g() { // from class: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeaListRow$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
