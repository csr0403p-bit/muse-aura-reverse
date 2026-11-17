package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$closeWithButton$1$1 extends AbstractC7559F3s implements G0U<HatchScreen, Unit> {
    public final /* synthetic */ AtomicBoolean $buttonClosed;
    public final /* synthetic */ PublishArtifactSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchScreen hatchScreen) {
        C7384Etj.A0Y(hatchScreen, 0);
        HatchPublishArtifactSheetKt.logPublishClick(this.$navKey.surface, hatchScreen, HatchComponent.CLOSE_BUTTON);
        this.$buttonClosed.set(true);
        this.$navigator.back();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$closeWithButton$1$1(PublishArtifactSheetKey publishArtifactSheetKey, AtomicBoolean atomicBoolean, AuraNavigator auraNavigator) {
        super(1);
        this.$navKey = publishArtifactSheetKey;
        this.$buttonClosed = atomicBoolean;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchScreen hatchScreen) {
        invoke2(hatchScreen);
        return Unit.INSTANCE;
    }
}
