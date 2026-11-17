package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ConnectorPermission $connector;
    public final /* synthetic */ ConnectorPermissionGroup $group;
    public final /* synthetic */ String $menuGroupKey;
    public final /* synthetic */ String $menuMethodKey;
    public final /* synthetic */ ConnectorPermissionMethod $method;
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ G0V<String, String, Unit> $onMenuRequested;
    public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1(ConnectorPermissionMethod connectorPermissionMethod, String str, ConnectorPermissionGroup connectorPermissionGroup, String str2, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function0, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, ConnectorPermission connectorPermission) {
        super(3);
        this.$method = connectorPermissionMethod;
        this.$menuGroupKey = str;
        this.$group = connectorPermissionGroup;
        this.$menuMethodKey = str2;
        this.$onMenuRequested = g0v;
        this.$onDismissMenu = function0;
        this.$onMethodModeSelected = g2j;
        this.$connector = connectorPermission;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        boolean z = false;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        ConnectorPermissionMethod connectorPermissionMethod = this.$method;
        String str = connectorPermissionMethod.label;
        ConnectorPermissionMode connectorPermissionMode = connectorPermissionMethod.mode;
        if (C7384Etj.areEqual(this.$menuGroupKey, this.$group.key) && C7384Etj.areEqual(this.$menuMethodKey, this.$method.key)) {
            z = true;
        }
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$method, AnonymousClass001.A1T(bfm, this.$group, bfm.A65(this.$onMenuRequested)));
        G0V<String, String, Unit> g0v = this.$onMenuRequested;
        ConnectorPermissionGroup connectorPermissionGroup = this.$group;
        ConnectorPermissionMethod connectorPermissionMethod2 = this.$method;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1$1$1(g0v, connectorPermissionGroup, connectorPermissionMethod2);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        Function0<Unit> function02 = this.$onDismissMenu;
        boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$method, AnonymousClass001.A1T(bfm, this.$group, AnonymousClass001.A1T(bfm, this.$connector, bfm.A65(this.$onMethodModeSelected))));
        G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> g2j = this.$onMethodModeSelected;
        ConnectorPermission connectorPermission = this.$connector;
        ConnectorPermissionGroup connectorPermissionGroup2 = this.$group;
        ConnectorPermissionMethod connectorPermissionMethod3 = this.$method;
        Object objAaT2 = bfm.AaT();
        if (zA1T2 || objAaT2 == C78N.A00) {
            objAaT2 = new ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1$2$1(g2j, connectorPermission, connectorPermissionGroup2, connectorPermissionMethod3);
            bfm.Ai0(objAaT2);
        }
        ConnectorPermissionSectionsKt.ConnectorPermissionTargetWithContextMenu(str, connectorPermissionMode, null, z, true, false, function0, function02, (G0U) objAaT2, bfm, 221184, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
