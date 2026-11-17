package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BO6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ LocationSharingMode $locationMode;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $onPermissionClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onRunInBackgroundChange;
    public final /* synthetic */ BO6<PermissionDestination, Boolean> $permissionStates;
    public final /* synthetic */ List<PermissionSummaryRowModel> $rows;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        List<PermissionSummaryRowModel> list = this.$rows;
        BO6<PermissionDestination, Boolean> bo6 = this.$permissionStates;
        LocationSharingMode locationSharingMode = this.$locationMode;
        G0U<PermissionDestination, Unit> g0u = this.$managePermission;
        G0U<PermissionDestination, Unit> g0u2 = this.$onPermissionClick;
        G0U<Boolean, Unit> g0u3 = this.$onRunInBackgroundChange;
        for (PermissionSummaryRowModel permissionSummaryRowModel : list) {
            if (permissionSummaryRowModel.isVisible) {
                AnonymousClass006.A1E(hatchSectionScope, new HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1$1$1(permissionSummaryRowModel, bo6, locationSharingMode, g0u, g0u2, g0u3), 850984951);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1(List<PermissionSummaryRowModel> list, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, G0U<? super PermissionDestination, Unit> g0u, G0U<? super PermissionDestination, Unit> g0u2, G0U<? super Boolean, Unit> g0u3) {
        super(1);
        this.$rows = list;
        this.$permissionStates = bo6;
        this.$locationMode = locationSharingMode;
        this.$managePermission = g0u;
        this.$onPermissionClick = g0u2;
        this.$onRunInBackgroundChange = g0u3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
