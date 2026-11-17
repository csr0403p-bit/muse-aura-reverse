package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import X.G2j;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ LocalDeviceConnector $localConnector;
    public final /* synthetic */ Function0<Unit> $onManageClick;
    public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSkillDetailScreenKt$LocalDeviceConnectorDetailContent$2(LocalDeviceConnector localDeviceConnector, float f, float f2, Function0<Unit> function0, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, int i) {
        super(2);
        this.$localConnector = localDeviceConnector;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onManageClick = function0;
        this.$onMethodModeSelected = g2j;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSkillDetailScreenKt.m2162LocalDeviceConnectorDetailContentdjqsMU(this.$localConnector, this.$topPadding, this.$bottomPadding, this.$onManageClick, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
