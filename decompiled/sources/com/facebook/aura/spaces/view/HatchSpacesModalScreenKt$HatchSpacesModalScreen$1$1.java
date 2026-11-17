package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C0861A6i;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.model.SpaceConstructionStatus;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$HatchSpacesModalScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
    public final /* synthetic */ boolean $isShared;
    public final /* synthetic */ C1BO<UnifiedArtifactsRepository.SpaceLookupResult> $lookup$delegate;
    public final /* synthetic */ ArtifactItem $navItem;
    public final /* synthetic */ SpaceRenderState $renderState;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ boolean $useNavigationArtifact;
    public final /* synthetic */ String $viewShortcode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesModalScreenKt$HatchSpacesModalScreen$1$1(String str, boolean z, ArtifactItem artifactItem, boolean z2, String str2, SpaceConstructionStatus spaceConstructionStatus, SpaceRenderState spaceRenderState, C1BO<? extends UnifiedArtifactsRepository.SpaceLookupResult> c1bo) {
        super(1);
        this.$slug = str;
        this.$useNavigationArtifact = z;
        this.$navItem = artifactItem;
        this.$isShared = z2;
        this.$viewShortcode = str2;
        this.$constructionStatus = spaceConstructionStatus;
        this.$renderState = spaceRenderState;
        this.$lookup$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        UnifiedArtifactsRepository.SpaceLookupResult value = this.$lookup$delegate.getValue();
        if (value != null) {
            C0861A6i.A01(value.getClass());
        }
        return new C78g() { // from class: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpacesModalScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
