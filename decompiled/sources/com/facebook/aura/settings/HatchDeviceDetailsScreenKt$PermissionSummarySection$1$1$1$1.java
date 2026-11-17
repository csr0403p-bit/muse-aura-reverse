package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BO6;
import X.C07C;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.navigation.key.PermissionDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ LocationSharingMode $locationMode;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $onPermissionClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onRunInBackgroundChange;
    public final /* synthetic */ BO6<PermissionDestination, Boolean> $permissionStates;
    public final /* synthetic */ PermissionSummaryRowModel $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1$1$1(PermissionSummaryRowModel permissionSummaryRowModel, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, G0U<? super PermissionDestination, Unit> g0u, G0U<? super PermissionDestination, Unit> g0u2, G0U<? super Boolean, Unit> g0u3) {
        super(3);
        this.$row = permissionSummaryRowModel;
        this.$permissionStates = bo6;
        this.$locationMode = locationSharingMode;
        this.$managePermission = g0u;
        this.$onPermissionClick = g0u2;
        this.$onRunInBackgroundChange = g0u3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            PermissionSummaryRowModel permissionSummaryRowModel = this.$row;
            BO6<PermissionDestination, Boolean> bo6 = this.$permissionStates;
            LocationSharingMode locationSharingMode = this.$locationMode;
            G0U<PermissionDestination, Unit> g0u = this.$managePermission;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$row, bfm.A65(this.$onPermissionClick));
            G0U<PermissionDestination, Unit> g0u2 = this.$onPermissionClick;
            PermissionSummaryRowModel permissionSummaryRowModel2 = this.$row;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1$1$1$1$1(g0u2, permissionSummaryRowModel2);
                bfm.Ai0(objAaT);
            }
            HatchDeviceDetailsScreenKt.PermissionSummaryRow(permissionSummaryRowModel, bo6, locationSharingMode, g0u, (Function0) objAaT, this.$onRunInBackgroundChange, bfm, 0);
            return;
        }
        bfm.Afo();
    }
}
