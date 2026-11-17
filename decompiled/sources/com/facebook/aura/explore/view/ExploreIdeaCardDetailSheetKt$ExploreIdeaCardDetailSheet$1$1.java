package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.explore.model.IdeaCardDetailViewModel;
import com.facebook.aura.explore.repo.IdeaCardDetail;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ IdeaCardDetailViewModel $detailViewModel;
    public final /* synthetic */ String $ideaCardId;
    public final /* synthetic */ IdeaCardDetail $seededDetail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$1$1(IdeaCardDetailViewModel ideaCardDetailViewModel, String str, IdeaCardDetail ideaCardDetail) {
        super(1);
        this.$detailViewModel = ideaCardDetailViewModel;
        this.$ideaCardId = str;
        this.$seededDetail = ideaCardDetail;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$detailViewModel.load(this.$ideaCardId, this.$seededDetail);
        return new C78g() { // from class: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
