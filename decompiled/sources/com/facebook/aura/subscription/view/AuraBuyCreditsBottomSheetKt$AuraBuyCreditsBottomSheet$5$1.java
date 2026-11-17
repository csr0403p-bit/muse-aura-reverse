package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C0Yr;
import X.C78g;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $didLogPacksImpression$delegate;
    public final /* synthetic */ C98f $entrypoint;
    public final /* synthetic */ boolean $hasPacks;
    public final /* synthetic */ String $prevSurface;
    public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$5$1(boolean z, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, String str, MutableState<Boolean> mutableState) {
        super(1);
        this.$hasPacks = z;
        this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
        this.$entrypoint = c98f;
        this.$prevSurface = str;
        this.$didLogPacksImpression$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$hasPacks && !MutableState.A0A((MutableState) this.$didLogPacksImpression$delegate)) {
            MutableState.A09(true, this.$didLogPacksImpression$delegate);
            this.$waterfallLogger.logEvent(C98e.CONSUMABLE_PAYMENT_SCREEN, C98d.MANAGEMENT, C98b.IMPRESSION, this.$entrypoint, AnonymousClass006.A10("prev_surface", this.$prevSurface), C98c.WHOLE_SCREEN, null);
        }
        return new C78g() { // from class: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
