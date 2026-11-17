package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import com.facebook.aura.status.viewmodel.HatchSubAgentUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ AHD<ActivityViewModel.DayGroupUiModel> $dayGroups;
    public final /* synthetic */ boolean $hasMore;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $nextCursor;
    public final /* synthetic */ G0U<ActivityAction, Unit> $onActionClick;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ G0U<String, Unit> $onToggleDay;
    public final /* synthetic */ AHD<HatchSubAgentUiModel> $subAgents;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityScreenKt$ActivityContent$2(AHD<ActivityViewModel.DayGroupUiModel> ahd, boolean z, String str, boolean z2, boolean z3, AHD<HatchSubAgentUiModel> ahd2, Function0<Unit> function0, Function0<Unit> function02, G0U<? super ActivityAction, Unit> g0u, float f, float f2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u2, int i, int i2, int i3) {
        super(2);
        this.$dayGroups = ahd;
        this.$hasMore = z;
        this.$nextCursor = str;
        this.$isLoadingMore = z2;
        this.$isRefreshing = z3;
        this.$subAgents = ahd2;
        this.$onRefresh = function0;
        this.$onLoadMore = function02;
        this.$onActionClick = g0u;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$header = g0v;
        this.$onToggleDay = g0u2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        ActivityScreenKt.m2209ActivityContent_UijJhE(this.$dayGroups, this.$hasMore, this.$nextCursor, this.$isLoadingMore, this.$isRefreshing, this.$subAgents, this.$onRefresh, this.$onLoadMore, this.$onActionClick, this.$topPadding, this.$bottomPadding, this.$modifier, this.$header, this.$onToggleDay, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
