package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import android.graphics.Bitmap;
import com.facebook.aura.navigation.key.HatchStatusTab;
import com.facebook.aura.status.viewmodel.HatchStatusUiState;
import com.facebook.aura.status.viewmodel.HatchStatusViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$StatusTabContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isTasksInActivity;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, Bitmap, Unit> $onNavigateToConversation;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ HatchStatusTab $tab;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchStatusUiState $uiState;
    public final /* synthetic */ HatchStatusViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusScreenKt$StatusTabContent$3(HatchStatusTab hatchStatusTab, boolean z, HatchStatusUiState hatchStatusUiState, HatchStatusViewModel hatchStatusViewModel, String str, G0V<? super String, ? super Bitmap, Unit> g0v, float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$tab = hatchStatusTab;
        this.$isTasksInActivity = z;
        this.$uiState = hatchStatusUiState;
        this.$viewModel = hatchStatusViewModel;
        this.$sessionId = str;
        this.$onNavigateToConversation = g0v;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchStatusScreenKt.m2241StatusTabContentEQC0FA8(this.$tab, this.$isTasksInActivity, this.$uiState, this.$viewModel, this.$sessionId, this.$onNavigateToConversation, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
