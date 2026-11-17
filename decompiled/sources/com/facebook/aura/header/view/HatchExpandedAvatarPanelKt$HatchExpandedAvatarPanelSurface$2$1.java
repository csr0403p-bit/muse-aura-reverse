package com.facebook.aura.header.view;

import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1D3;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ C1D3 $shape;
    public final /* synthetic */ AvatarTakeover $takeover;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        AvatarFullScreen fullScreen;
        AvatarFullScreen fullScreen2;
        C7384Etj.A0Y(c2av, 0);
        AvatarTakeover avatarTakeover = this.$takeover;
        float progress = 0.0f;
        c2av.Acj((avatarTakeover == null || (fullScreen2 = avatarTakeover.getFullScreen()) == null || !fullScreen2.getActive() || MutableState.A0A(this.$metrics.avatarExpanded$delegate)) ? ATD.A03((AnonymousClass003.A04(this.$progress) - 0.5f) * 2.0f, 0.0f, 1.0f) : 0.0f);
        c2av.Aeg(this.$shape);
        float fAh4 = c2av.Ah4(HatchExpandedAvatarPanelKt.ExpandedPanelShadowElevation);
        AvatarTakeover avatarTakeover2 = this.$takeover;
        if (avatarTakeover2 != null && (fullScreen = avatarTakeover2.getFullScreen()) != null) {
            progress = fullScreen.getProgress();
        }
        c2av.Aef(fAh4 * (1.0f - progress));
        long j = this.$colors.shadow;
        c2av.Acl(j);
        c2av.Aej(j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$2$1(AvatarTakeover avatarTakeover, HatchStatusPillMetrics hatchStatusPillMetrics, Function0<Float> function0, C1D3 c1d3, AuraColors auraColors) {
        super(1);
        this.$takeover = avatarTakeover;
        this.$metrics = hatchStatusPillMetrics;
        this.$progress = function0;
        this.$shape = c1d3;
        this.$colors = auraColors;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
