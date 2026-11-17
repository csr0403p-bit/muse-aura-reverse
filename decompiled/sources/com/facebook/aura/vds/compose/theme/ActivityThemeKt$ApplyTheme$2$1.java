package com.facebook.aura.vds.compose.theme;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;

/* loaded from: classes4.dex */
public final class ActivityThemeKt$ApplyTheme$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ ActivityTheme $activityTheme;
    public final /* synthetic */ AuraThemeMode $modeOverride;
    public final /* synthetic */ int $resolvedNavBarColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityThemeKt$ApplyTheme$2$1(Activity activity, ActivityTheme activityTheme, AuraThemeMode auraThemeMode, int i) {
        super(1);
        this.$activity = activity;
        this.$activityTheme = activityTheme;
        this.$modeOverride = auraThemeMode;
        this.$resolvedNavBarColor = i;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        ActivityThemeKt.applyActivityTheme(this.$activity, this.$activityTheme.transparentStatusBar, Boolean.valueOf(AnonymousClass002.A1Z(this.$modeOverride, AuraThemeMode.DARK)), Integer.valueOf(this.$resolvedNavBarColor));
        return new C78g() { // from class: com.facebook.aura.vds.compose.theme.ActivityThemeKt$ApplyTheme$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
