package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceMenuSheetKt$SpaceMenuActions$7$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceMenuViewModel $model;
    public final /* synthetic */ ArtifactPlacementRequest $request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuSheetKt$SpaceMenuActions$7$1$1(SpaceMenuViewModel spaceMenuViewModel, ArtifactPlacementRequest artifactPlacementRequest) {
        super(0);
        this.$model = spaceMenuViewModel;
        this.$request = artifactPlacementRequest;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.move(this.$request);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
