package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PublishArtifactSheetKey $navKey;
    public final /* synthetic */ HatchPublishArtifactViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$5$1(PublishArtifactSheetKey publishArtifactSheetKey, HatchPublishArtifactViewModel hatchPublishArtifactViewModel) {
        super(0);
        this.$navKey = publishArtifactSheetKey;
        this.$viewModel = hatchPublishArtifactViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPublishArtifactSheetKt.logPublishClick(this.$navKey.surface, HatchScreen.PUBLISH_CONFIRM, HatchComponent.PUBLISH_UNPUBLISH_BUTTON);
        this.$viewModel.unpublishArtifact();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
