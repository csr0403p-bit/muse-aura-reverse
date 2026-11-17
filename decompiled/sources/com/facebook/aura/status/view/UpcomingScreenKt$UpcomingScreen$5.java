package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$UpcomingScreen$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isConnected;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onRemoveTask;
    public final /* synthetic */ TasksViewModel $tasksViewModel;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ AHD<HatchUpcomingTaskUiModel> $upcomingTasks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpcomingScreenKt$UpcomingScreen$5(AHD<HatchUpcomingTaskUiModel> ahd, G0U<? super String, Unit> g0u, boolean z, float f, float f2, BRg bRg, TasksViewModel tasksViewModel, int i, int i2) {
        super(2);
        this.$upcomingTasks = ahd;
        this.$onRemoveTask = g0u;
        this.$isConnected = z;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$tasksViewModel = tasksViewModel;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        UpcomingScreenKt.m2254UpcomingScreenYlGCr2M(this.$upcomingTasks, this.$onRemoveTask, this.$isConnected, this.$topPadding, this.$bottomPadding, this.$modifier, this.$tasksViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
