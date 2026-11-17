package com.facebook.aura.agentpermission;

import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchNodeHitlGate;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorDefinition {
    public final String connectorId;
    public final int displayTitleRes;
    public final int iconRes;
    public final Function0<Boolean> isVisible;
    public final LocalDeviceConnectorPermissionRequirement permissionRequirement;
    public final List<LocalDeviceConnectorActionDefinition> readActionDefinitions;
    public final List<LocalDeviceConnectorActionDefinition> writeActionDefinitions;

    /* renamed from: com.facebook.aura.agentpermission.LocalDeviceConnectorDefinition$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    public /* synthetic */ LocalDeviceConnectorDefinition(String str, int i, int i2, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, List list, List list2, Function0 function0, int i3, C06H c06h) {
        this(str, i, i2, localDeviceConnectorPermissionRequirement, (i3 & 16) != 0 ? C0881AGi.A00 : list, (i3 & 32) != 0 ? C0881AGi.A00 : list2, (i3 & 64) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final int getDisplayTitleRes() {
        return this.displayTitleRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final LocalDeviceConnectorPermissionRequirement getPermissionRequirement() {
        return this.permissionRequirement;
    }

    public final List<LocalDeviceConnectorActionDefinition> getReadActionDefinitions() {
        return this.readActionDefinitions;
    }

    public final List<LocalDeviceConnectorActionDefinition> getWriteActionDefinitions() {
        return this.writeActionDefinitions;
    }

    public final boolean isManageable() {
        return true;
    }

    public final Function0<Boolean> isVisible() {
        return this.isVisible;
    }

    public final LocalDeviceConnector toLocalDeviceConnector(Context context, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Y = C60P.A1Y(context, abstractC3358CGz);
        HatchNodeHitlGate companion = HatchNodeHitlGate.Companion.getInstance(abstractC3358CGz);
        List<LocalDeviceConnectorActionDefinition> list = this.readActionDefinitions;
        ArrayList arrayListA0h = C3cG.A0h();
        for (LocalDeviceConnectorActionDefinition localDeviceConnectorActionDefinition : list) {
            if (AnonymousClass003.A1X(context, localDeviceConnectorActionDefinition.isVisible)) {
                arrayListA0h.add(localDeviceConnectorActionDefinition);
            }
        }
        List<LocalDeviceConnectorActionDefinition> list2 = this.writeActionDefinitions;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (LocalDeviceConnectorActionDefinition localDeviceConnectorActionDefinition2 : list2) {
            if (AnonymousClass003.A1X(context, localDeviceConnectorActionDefinition2.isVisible)) {
                arrayListA0h2.add(localDeviceConnectorActionDefinition2);
            }
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0h2, arrayListA0h);
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0P));
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            LocalDeviceConnectorActionDefinition localDeviceConnectorActionDefinition3 = (LocalDeviceConnectorActionDefinition) it.next();
            linkedHashMapA15.put(localDeviceConnectorActionDefinition3.key, LocalDeviceConnectorKt.toPermissionMode(companion.getMode(localDeviceConnectorActionDefinition3.spec)));
        }
        String string = context.getString(this.displayTitleRes);
        String string2 = context.getString(R.string._name_removed__res_0x7f120b6d);
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            arrayListA0m.add(((LocalDeviceConnectorActionDefinition) it2.next()).toAction(context));
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h2);
        Iterator it3 = arrayListA0h2.iterator();
        while (it3.hasNext()) {
            arrayListA0m2.add(((LocalDeviceConnectorActionDefinition) it3.next()).toAction(context));
        }
        AHD ahdA072 = AGI.A07(arrayListA0m2);
        ConnectorPermission connectorPermission = new ConnectorPermission(this.connectorId, string, null, zA1Y, ConnectorManagementKind.POLICY_ONLY, linkedHashMapA15, buildGroups(context, ahdA07, ahdA072, linkedHashMapA15));
        String str = this.connectorId;
        int i = this.iconRes;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement = this.permissionRequirement;
        return new LocalDeviceConnector(str, string, string2, i, localDeviceConnectorPermissionRequirement, ahdA07, ahdA072, zA1Y, LocalDeviceConnectorKt.isGranted(localDeviceConnectorPermissionRequirement, context), connectorPermission);
    }

    private final List<ConnectorPermissionGroup> buildGroups(Context context, List<LocalDeviceConnectorAction> list, List<LocalDeviceConnectorAction> list2, Map<String, ? extends ConnectorPermissionMode> map) {
        AII aiiA17 = AIM.A17();
        if (!list.isEmpty()) {
            aiiA17.add(LocalDeviceConnectorKt.buildGroup(BrowserOperationCatalogKt.READ, context.getString(R.string._name_removed__res_0x7f120b6c), list, map));
        }
        if (!list2.isEmpty()) {
            aiiA17.add(LocalDeviceConnectorKt.buildGroup("write", context.getString(R.string._name_removed__res_0x7f120b76), list2, map));
        }
        return AIM.A18(aiiA17);
    }

    public LocalDeviceConnectorDefinition(String str, int i, int i2, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, List<LocalDeviceConnectorActionDefinition> list, List<LocalDeviceConnectorActionDefinition> list2, Function0<Boolean> function0) {
        AnonymousClass005.A16(str, localDeviceConnectorPermissionRequirement, list, list2, 0);
        C7384Etj.A0Y(function0, 6);
        this.connectorId = str;
        this.displayTitleRes = i;
        this.iconRes = i2;
        this.permissionRequirement = localDeviceConnectorPermissionRequirement;
        this.readActionDefinitions = list;
        this.writeActionDefinitions = list2;
        this.isVisible = function0;
    }
}
