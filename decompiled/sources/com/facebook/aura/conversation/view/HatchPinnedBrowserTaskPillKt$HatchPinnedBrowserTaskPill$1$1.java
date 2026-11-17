package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnVisibilityChanged$delegate;
    public final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$1$1(boolean z, C1BO<? extends G0U<? super Boolean, Unit>> c1bo) {
        super(1);
        this.$visible = z;
        this.$currentOnVisibilityChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO<G0U<Boolean, Unit>> c1bo = this.$currentOnVisibilityChanged$delegate;
        float f = HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnailHeight;
        AnonymousClass001.A1K(this.$visible, C1BO.A0B(c1bo));
        final C1BO<G0U<Boolean, Unit>> c1bo2 = this.$currentOnVisibilityChanged$delegate;
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                C1BO c1bo3 = c1bo2;
                float f2 = HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnailHeight;
                AnonymousClass001.A1K(false, C1BO.A0B(c1bo3));
            }
        };
    }
}
