package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$PublishSheetDismissLogging$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AtomicBoolean $buttonClosed;
    public final /* synthetic */ C1BO<HatchPublishBottomSheetState> $latestState$delegate;
    public final /* synthetic */ PublishArtifactSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPublishArtifactSheetKt$PublishSheetDismissLogging$1$1(AuraNavigator auraNavigator, PublishArtifactSheetKey publishArtifactSheetKey, AtomicBoolean atomicBoolean, C1BO<? extends HatchPublishBottomSheetState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$navKey = publishArtifactSheetKey;
        this.$buttonClosed = atomicBoolean;
        this.$latestState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AuraNavigator auraNavigator = this.$navigator;
        final PublishArtifactSheetKey publishArtifactSheetKey = this.$navKey;
        final AtomicBoolean atomicBoolean = this.$buttonClosed;
        final C1BO<HatchPublishBottomSheetState> c1bo = this.$latestState$delegate;
        return new C78g() { // from class: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$PublishSheetDismissLogging$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (auraNavigator.isInBackStack(publishArtifactSheetKey) || atomicBoolean.get()) {
                    return;
                }
                HatchInteractionLogger.INSTANCE.logDismiss(publishArtifactSheetKey.surface, HatchSubsurface.PUBLISH_SHEET, HatchPublishArtifactSheetKt.publishScreen((HatchPublishBottomSheetState) c1bo.getValue()), HatchComponent.CLOSE_BUTTON, null, null);
            }
        };
    }
}
