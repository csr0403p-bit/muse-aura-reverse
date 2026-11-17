package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0U;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$ActivePermissionsList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ G0V<ActivePermission, ConnectorPermissionMode, Unit> $onModeSelected;
    public final /* synthetic */ Function0<Unit> $onReset;
    public final /* synthetic */ G0U<ActivePermission, Unit> $onRevoke;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ ActivePermissionsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivePermissionsScreenKt$ActivePermissionsList$2(ActivePermissionsUiState activePermissionsUiState, float f, float f2, Function0<Unit> function0, G0U<? super ActivePermission, Unit> g0u, Function0<Unit> function02, G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v, int i) {
        super(2);
        this.$uiState = activePermissionsUiState;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onLoadMore = function0;
        this.$onRevoke = g0u;
        this.$onReset = function02;
        this.$onModeSelected = g0v;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        ActivePermissionsScreenKt.m202ActivePermissionsListZUYZQmM(this.$uiState, this.$topPadding, this.$bottomPadding, this.$onLoadMore, this.$onRevoke, this.$onReset, this.$onModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
