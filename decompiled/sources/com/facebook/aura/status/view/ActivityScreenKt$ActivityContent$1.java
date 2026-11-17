package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C1062ATq;
import X.C10G;
import X.C1DP;
import X.C1YY;
import X.C3cG;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import com.facebook.aura.status.viewmodel.HatchSubAgentUiModel;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityContent$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ AHD<ActivityViewModel.DayGroupUiModel> $dayGroups;
    public final /* synthetic */ boolean $hasMore;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ String $nextCursor;
    public final /* synthetic */ G0U<ActivityAction, Unit> $onActionClick;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ G0U<String, Unit> $onToggleDay;
    public final /* synthetic */ AHD<HatchSubAgentUiModel> $subAgents;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityScreenKt$ActivityContent$1(float f, float f2, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<ActivityViewModel.DayGroupUiModel> ahd, AHD<HatchSubAgentUiModel> ahd2, G0U<? super ActivityAction, Unit> g0u, G0U<? super String, Unit> g0u2, boolean z, String str, Function0<Unit> function0, boolean z2) {
        super(3);
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$header = g0v;
        this.$dayGroups = ahd;
        this.$subAgents = ahd2;
        this.$onActionClick = g0u;
        this.$onToggleDay = g0u2;
        this.$hasMore = z;
        this.$nextCursor = str;
        this.$onLoadMore = function0;
        this.$isLoadingMore = z2;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            bfm.Afo();
            return;
        }
        C1062ATq c1062ATq = C10G.A01;
        C1DP c1dp = new C1DP(0.0f, this.$topPadding, 0.0f, C3cG.A00(bfm, AuraTheme.INSTANCE) + this.$bottomPadding);
        boolean zA1U = AnonymousClass001.A1U(bfm, this.$isLoadingMore, AnonymousClass001.A1R(bfm, this.$onLoadMore, AnonymousClass001.A1R(bfm, this.$nextCursor, AnonymousClass001.A1U(bfm, this.$hasMore, AnonymousClass001.A1R(bfm, this.$onToggleDay, AnonymousClass001.A1R(bfm, this.$onActionClick, AnonymousClass001.A1T(bfm, this.$subAgents, AnonymousClass001.A1T(bfm, this.$dayGroups, bfm.A65(this.$header)))))))));
        G0V<BFM, Integer, Unit> g0v = this.$header;
        AHD<ActivityViewModel.DayGroupUiModel> ahd = this.$dayGroups;
        boolean z = this.$hasMore;
        AHD<HatchSubAgentUiModel> ahd2 = this.$subAgents;
        G0U<ActivityAction, Unit> g0u = this.$onActionClick;
        G0U<String, Unit> g0u2 = this.$onToggleDay;
        String str = this.$nextCursor;
        Function0<Unit> function0 = this.$onLoadMore;
        boolean z2 = this.$isLoadingMore;
        Object objAaT = bfm.AaT();
        if (zA1U || objAaT == C78N.A00) {
            objAaT = new ActivityScreenKt$ActivityContent$1$1$1(g0v, ahd, z, ahd2, g0u, g0u2, str, function0, z2);
            bfm.Ai0(objAaT);
        }
        C1YY.A01(null, null, null, c1dp, null, bfm, null, c1062ATq, (G0U) objAaT, 6, 506, false, false);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
