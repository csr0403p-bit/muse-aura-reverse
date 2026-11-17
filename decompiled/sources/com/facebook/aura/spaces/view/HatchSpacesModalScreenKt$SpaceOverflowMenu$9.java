package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.model.SpaceConstructionStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ boolean $isShared;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ArtifactPlacementRequest $moveToLibraryRequest;
    public final /* synthetic */ ArtifactPlacementRequest $moveToSpacesRequest;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ G0U<String, Unit> $onRenamed;
    public final /* synthetic */ boolean $showPinAction;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ String $spaceId;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$9(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, boolean z3, SpaceConstructionStatus spaceConstructionStatus, String str4, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, G0U<? super String, Unit> g0u, BRg bRg, long j, int i, int i2, int i3) {
        super(2);
        this.$slug = str;
        this.$spaceId = str2;
        this.$title = str3;
        this.$expanded = z;
        this.$onDismiss = function0;
        this.$onDeleted = function02;
        this.$showPinAction = z2;
        this.$isShared = z3;
        this.$constructionStatus = spaceConstructionStatus;
        this.$imageUrl = str4;
        this.$moveToLibraryRequest = artifactPlacementRequest;
        this.$moveToSpacesRequest = artifactPlacementRequest2;
        this.$onRenamed = g0u;
        this.$modifier = bRg;
        this.$offset = j;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSpacesModalScreenKt.m2192SpaceOverflowMenuWHI4liM(this.$slug, this.$spaceId, this.$title, this.$expanded, this.$onDismiss, this.$onDeleted, this.$showPinAction, this.$isShared, this.$constructionStatus, this.$imageUrl, this.$moveToLibraryRequest, this.$moveToSpacesRequest, this.$onRenamed, this.$modifier, this.$offset, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
