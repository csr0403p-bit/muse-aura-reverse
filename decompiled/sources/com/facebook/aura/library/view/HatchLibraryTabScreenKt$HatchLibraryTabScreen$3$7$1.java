package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.repo.ArtifactSortMode;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$7$1 extends AbstractC7559F3s implements G0U<ArtifactSortMode, Unit> {
    public final /* synthetic */ HatchLibraryViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ArtifactSortMode artifactSortMode) {
        C7384Etj.A0Y(artifactSortMode, 0);
        HatchLibraryTabScreenKt.logLibraryMenuOption(HatchComponent.LIBRARY_SORT_OPTION, HatchMetadataKey.LIBRARY_SORT, AnonymousClass006.A0x(artifactSortMode));
        this.$viewModel.onSelectSort(artifactSortMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$7$1(HatchLibraryViewModel hatchLibraryViewModel) {
        super(1);
        this.$viewModel = hatchLibraryViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ArtifactSortMode artifactSortMode) {
        invoke2(artifactSortMode);
        return Unit.INSTANCE;
    }
}
