package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.status.view.HatchStatusPillStateHolder;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isEditorRevealed;
    public final /* synthetic */ HatchStatusPillStateHolder $statusPill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$2$1(HatchStatusPillStateHolder hatchStatusPillStateHolder, boolean z) {
        super(1);
        this.$statusPill = hatchStatusPillStateHolder;
        this.$isEditorRevealed = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$statusPill.setHidden(this.$isEditorRevealed);
        final HatchStatusPillStateHolder hatchStatusPillStateHolder = this.$statusPill;
        return new C78g() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchStatusPillStateHolder.setHidden(false);
            }
        };
    }
}
