package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$SpacePublishSheetDismissLogging$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AtomicBoolean $buttonClosed;
    public final /* synthetic */ C1BO<HatchPublishSpaceState> $latestState$delegate;
    public final /* synthetic */ PublishSpaceSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $spaceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPublishSpaceSheetKt$SpacePublishSheetDismissLogging$1$1(AuraNavigator auraNavigator, PublishSpaceSheetKey publishSpaceSheetKey, AtomicBoolean atomicBoolean, String str, C1BO<? extends HatchPublishSpaceState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$navKey = publishSpaceSheetKey;
        this.$buttonClosed = atomicBoolean;
        this.$spaceId = str;
        this.$latestState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AuraNavigator auraNavigator = this.$navigator;
        final PublishSpaceSheetKey publishSpaceSheetKey = this.$navKey;
        final AtomicBoolean atomicBoolean = this.$buttonClosed;
        final String str = this.$spaceId;
        final C1BO<HatchPublishSpaceState> c1bo = this.$latestState$delegate;
        return new C78g() { // from class: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$SpacePublishSheetDismissLogging$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (auraNavigator.isInBackStack(publishSpaceSheetKey) || atomicBoolean.get()) {
                    return;
                }
                HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SPACES, HatchSubsurface.PUBLISH_SHEET, HatchPublishSpaceSheetKt.publishScreen((HatchPublishSpaceState) c1bo.getValue()), HatchComponent.CLOSE_BUTTON, null, HatchPublishSpaceSheetKt.spaceIdMetadata(str));
            }
        };
    }
}
