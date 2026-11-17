package com.facebook.aura.library.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$2$1 extends C7438Evz implements G0U<ArtifactFile, Unit> {
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$2$1(Object obj) {
        super(1, obj, HatchLibraryViewModel.class, "onTogglePin", "onTogglePin(Lcom/facebook/aura/library/model/ArtifactFile;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ArtifactFile artifactFile) {
        ((HatchLibraryViewModel) AnonymousClass006.A0o(artifactFile, this)).onTogglePin(artifactFile);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ArtifactFile artifactFile) {
        invoke2(artifactFile);
        return Unit.INSTANCE;
    }
}
