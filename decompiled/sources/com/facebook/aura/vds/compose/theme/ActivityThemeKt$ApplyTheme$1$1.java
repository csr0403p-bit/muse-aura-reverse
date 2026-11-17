package com.facebook.aura.vds.compose.theme;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C1HY;
import X.C7384Etj;
import X.C78g;
import X.Dg3;
import X.EnumC3085Bxl;
import X.G0U;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;

/* loaded from: classes4.dex */
public final class ActivityThemeKt$ApplyTheme$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ ActivityTheme $activityTheme;
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ AuraThemeMode $modeOverride;
    public final /* synthetic */ int $resolvedNavBarColor;
    public final /* synthetic */ MutableState<Boolean> $themeWasApplied;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityThemeKt$ApplyTheme$1$1(C1HY c1hy, MutableState<Boolean> mutableState, int i, ActivityTheme activityTheme, Activity activity, AuraThemeMode auraThemeMode) {
        super(1);
        this.$lifecycleOwner = c1hy;
        this.$themeWasApplied = mutableState;
        this.$resolvedNavBarColor = i;
        this.$activityTheme = activityTheme;
        this.$activity = activity;
        this.$modeOverride = auraThemeMode;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final MutableState<Boolean> mutableState = this.$themeWasApplied;
        final int i = this.$resolvedNavBarColor;
        final ActivityTheme activityTheme = this.$activityTheme;
        final Activity activity = this.$activity;
        final AuraThemeMode auraThemeMode = this.$modeOverride;
        final Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.vds.compose.theme.ActivityThemeKt$ApplyTheme$1$1$observer$1
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
                C7384Etj.A0Y(enumC3085Bxl, 1);
                int iOrdinal = enumC3085Bxl.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ActivityThemeKt.applyTheme(mutableState, i, activityTheme, activity, auraThemeMode);
                    return;
                }
                if (iOrdinal == 4) {
                    if (MutableState.A0A((MutableState) mutableState)) {
                        ActivityTheme activityTheme2 = activityTheme;
                        if (activityTheme2.resetOnStop) {
                            ActivityThemeKt.applyActivityTheme(activity, activityTheme2.transparentStatusBar, false, null);
                        }
                    }
                    MutableState.A09(false, mutableState);
                }
            }

            /* loaded from: classes5.dex */
            public abstract /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC3085Bxl.values().length];
                    try {
                        AnonymousClass002.A13(EnumC3085Bxl.ON_CREATE, iArr);
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AnonymousClass002.A14(EnumC3085Bxl.ON_START, iArr);
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        AnonymousClass002.A15(EnumC3085Bxl.ON_STOP, iArr);
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
        this.$lifecycleOwner.getLifecycle().A04(dg3);
        final C1HY c1hy = this.$lifecycleOwner;
        return new C78g() { // from class: com.facebook.aura.vds.compose.theme.ActivityThemeKt$ApplyTheme$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                c1hy.getLifecycle().A05(dg3);
            }
        };
    }
}
