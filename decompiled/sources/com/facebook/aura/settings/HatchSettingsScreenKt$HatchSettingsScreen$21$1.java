package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.pause.HatchPauseViewModel;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$21$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchPauseViewModel $pauseViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchSettingsScreen$21$1(HatchPauseViewModel hatchPauseViewModel) {
        super(1);
        this.$pauseViewModel = hatchPauseViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$pauseViewModel.onSettingsVisibilityChanged(true);
        final HatchPauseViewModel hatchPauseViewModel = this.$pauseViewModel;
        return new C78g() { // from class: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$21$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchPauseViewModel.onSettingsVisibilityChanged(false);
            }
        };
    }
}
