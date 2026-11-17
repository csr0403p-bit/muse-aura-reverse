package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $spaceId;
    public final /* synthetic */ HatchPublishSpaceViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$11$1(String str, HatchPublishSpaceViewModel hatchPublishSpaceViewModel) {
        super(0);
        this.$spaceId = str;
        this.$viewModel = hatchPublishSpaceViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPublishSpaceSheetKt.logSpacePublishClick(this.$spaceId, null, HatchComponent.CANCEL_BUTTON);
        this.$viewModel.cancelUnpublish();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
