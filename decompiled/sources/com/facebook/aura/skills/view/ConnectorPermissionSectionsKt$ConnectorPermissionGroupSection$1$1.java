package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ ConnectorPermission $connector;
    public final /* synthetic */ ConnectorPermissionGroup $group;
    public final /* synthetic */ String $menuGroupKey;
    public final /* synthetic */ String $menuMethodKey;
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ G0V<String, String, Unit> $onMenuRequested;
    public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        ConnectorPermissionGroup connectorPermissionGroup = this.$group;
        List<ConnectorPermissionMethod> list = connectorPermissionGroup.methods;
        String str = this.$menuGroupKey;
        String str2 = this.$menuMethodKey;
        G0V<String, String, Unit> g0v = this.$onMenuRequested;
        Function0<Unit> function0 = this.$onDismissMenu;
        G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> g2j = this.$onMethodModeSelected;
        ConnectorPermission connectorPermission = this.$connector;
        Iterator<ConnectorPermissionMethod> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1(it.next(), str, connectorPermissionGroup, str2, g0v, function0, g2j, connectorPermission), -1323106408);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1(ConnectorPermissionGroup connectorPermissionGroup, String str, String str2, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function0, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, ConnectorPermission connectorPermission) {
        super(1);
        this.$group = connectorPermissionGroup;
        this.$menuGroupKey = str;
        this.$menuMethodKey = str2;
        this.$onMenuRequested = g0v;
        this.$onDismissMenu = function0;
        this.$onMethodModeSelected = g2j;
        this.$connector = connectorPermission;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
