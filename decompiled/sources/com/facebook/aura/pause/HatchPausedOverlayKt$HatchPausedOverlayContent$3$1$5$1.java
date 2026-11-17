package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPausedOverlayKt$HatchPausedOverlayContent$3$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchPauseViewModel $pauseViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPausedOverlayKt$HatchPausedOverlayContent$3$1$5$1(HatchPauseViewModel hatchPauseViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$pauseViewModel = hatchPauseViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pauseViewModel.onSettingsVisibilityChanged(true);
        this.$navigator.navigate((AuraNavKey) new HatchSettingsPushScreenKey(null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
