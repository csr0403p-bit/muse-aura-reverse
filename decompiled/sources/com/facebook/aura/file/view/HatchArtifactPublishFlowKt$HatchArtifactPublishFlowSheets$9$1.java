package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import com.facebook.aura.file.view.PublishState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchArtifactPublishFlow $flow;
    public final /* synthetic */ PublishState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchArtifactPublishFlowKt$HatchArtifactPublishFlowSheets$9$1(HatchArtifactPublishFlow hatchArtifactPublishFlow, PublishState publishState) {
        super(0);
        this.$flow = hatchArtifactPublishFlow;
        this.$state = publishState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$flow.sharePublishedUrl$fbandroid_express_aura_java_com_facebook_aura_file_view_view(((PublishState.Success) this.$state).url);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
