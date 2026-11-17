package com.facebook.aura.agentpermission;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7462Ewq;
import X.FGI;
import X.G0U;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.LocalDeviceConnectorDefinition;
import com.facebook.aura.agentpermission.repository.MC;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.gateway.HatchNodeHitlGate;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeHitlAccess;
import com.facebook.aura.nodes.core.NodeHitlGroup;
import com.facebook.aura.nodes.core.NodeHitlMode;
import com.facebook.aura.nodes.core.NodeHitlSpec;
import com.facebook.aura.nodes.hitldisplay.NodeHitlCapability;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class LocalDeviceConnectorKt {
    public static final Map<String, NodeHitlSpec> LOCAL_DEVICE_CONNECTOR_ACTION_SPECS;
    public static final List<LocalDeviceConnectorDefinition> LOCAL_DEVICE_CONNECTOR_DEFINITIONS;
    public static final String LOCAL_DEVICE_CONNECTOR_PREFIX = "local_device_";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(LocalDeviceConnectorKt.class, "healthConnectConnectorEnabled", "getHealthConnectConnectorEnabled()Z", 1), new C7462Ewq(LocalDeviceConnectorKt.class, "isNodesMediaEnabled", "isNodesMediaEnabled()Z", 1)};
    public static final C31u healthConnectConnectorEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.health_connect_connector_enabled);
    public static final C31u isNodesMediaEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_media_sync.is_nodes_media_enabled);

    public static final List<PermissionDestination> devicePermissionDestinations(LocalDeviceConnector localDeviceConnector) {
        PermissionDestination permissionDestination;
        C7384Etj.A0Y(localDeviceConnector, 0);
        switch (localDeviceConnector.permissionRequirement.ordinal()) {
            case 0:
                permissionDestination = PermissionDestination.CALENDAR;
                break;
            case 1:
                permissionDestination = PermissionDestination.CONTACTS;
                break;
            case 2:
                permissionDestination = PermissionDestination.MESSAGES;
                break;
            case 3:
                permissionDestination = PermissionDestination.PHONE;
                break;
            case 4:
                permissionDestination = PermissionDestination.PHONE_NOTIFICATIONS;
                break;
            case 5:
                permissionDestination = PermissionDestination.CALL_LOG;
                break;
            case 6:
                permissionDestination = PermissionDestination.HEALTH;
                break;
            case 7:
                permissionDestination = PermissionDestination.PHOTOS;
                break;
            default:
                throw C3cG.A0q();
        }
        return Collections.singletonList(permissionDestination);
    }

    public static final boolean isLocalDeviceConnectorId(String str) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith(LOCAL_DEVICE_CONNECTOR_PREFIX);
    }

    public static final boolean shouldShowHitlControls(LocalDeviceConnector localDeviceConnector) {
        C7384Etj.A0Y(localDeviceConnector, 0);
        switch (localDeviceConnector.permissionRequirement.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                return !localDeviceConnector.connectorPermission.groups.isEmpty();
            case 4:
                return false;
            default:
                throw C3cG.A0q();
        }
    }

    public static final boolean shouldShowNotificationAccessControls(LocalDeviceConnector localDeviceConnector) {
        C7384Etj.A0Y(localDeviceConnector, 0);
        return localDeviceConnector.permissionRequirement == LocalDeviceConnectorPermissionRequirement.NOTIFICATIONS && localDeviceConnector.isConnected;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[LocalDeviceConnectorPermissionRequirement.values().length];
            try {
                AnonymousClass005.A0v(LocalDeviceConnectorPermissionRequirement.NOTIFICATIONS, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(LocalDeviceConnectorPermissionRequirement.CALENDAR, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(LocalDeviceConnectorPermissionRequirement.CALL_LOG, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LocalDeviceConnectorPermissionRequirement.CONTACTS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LocalDeviceConnectorPermissionRequirement.HEALTH, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(LocalDeviceConnectorPermissionRequirement.SMS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(LocalDeviceConnectorPermissionRequirement.PHONE_CALL, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(LocalDeviceConnectorPermissionRequirement.PHOTOS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NodeHitlMode.values().length];
            try {
                AnonymousClass005.A0v(NodeHitlMode.ALLOW, iArr2, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlMode.ASK, iArr2, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlMode.DENY, iArr2, 3);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConnectorPermissionMode.values().length];
            try {
                AnonymousClass005.A0v(ConnectorPermissionMode.ALLOW, iArr3, 1);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(ConnectorPermissionMode.ASK, iArr3, 2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(ConnectorPermissionMode.DENY, iArr3, 3);
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LocalDeviceConnectorKt$action$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Context, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Context context) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Context context) {
            return AnonymousClass001.A0i();
        }
    }

    static {
        String strA0M = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, "calendar");
        NodeHitlCapability nodeHitlCapability = NodeHitlCapability.CALENDAR;
        int displayTitleRes = nodeHitlCapability.getDisplayTitleRes();
        int iconRes = nodeHitlCapability.getIconRes();
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement = LocalDeviceConnectorPermissionRequirement.CALENDAR;
        NodeHitlGroup nodeHitlGroup = NodeHitlGroup.CALENDAR;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        List listA0u = C60Q.A0u(nodeHitlGroup, "calendar", BrowserOperationCatalogKt.READ, anonymousClass1, R.string._name_removed__res_0x7f120b64);
        List listA0u2 = C60Q.A0u(nodeHitlGroup, "calendar", "write", anonymousClass1, R.string._name_removed__res_0x7f120b5e);
        LocalDeviceConnectorDefinition.AnonymousClass1 anonymousClass12 = LocalDeviceConnectorDefinition.AnonymousClass1.INSTANCE;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition = new LocalDeviceConnectorDefinition(strA0M, displayTitleRes, iconRes, localDeviceConnectorPermissionRequirement, listA0u, listA0u2, anonymousClass12);
        String strA0M2 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, HatchNodeCardJsonKt.TYPE_CONTACTS);
        NodeHitlCapability nodeHitlCapability2 = NodeHitlCapability.CONTACTS;
        int displayTitleRes2 = nodeHitlCapability2.getDisplayTitleRes();
        int iconRes2 = nodeHitlCapability2.getIconRes();
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement2 = LocalDeviceConnectorPermissionRequirement.CONTACTS;
        NodeHitlGroup nodeHitlGroup2 = NodeHitlGroup.CONTACTS;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition2 = new LocalDeviceConnectorDefinition(strA0M2, displayTitleRes2, iconRes2, localDeviceConnectorPermissionRequirement2, C60Q.A0u(nodeHitlGroup2, HatchNodeCardJsonKt.TYPE_CONTACTS, BrowserOperationCatalogKt.READ, anonymousClass1, R.string._name_removed__res_0x7f120b63), C60Q.A0u(nodeHitlGroup2, HatchNodeCardJsonKt.TYPE_CONTACTS, "write", anonymousClass1, R.string._name_removed__res_0x7f120b5d), anonymousClass12);
        String strA0M3 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, "messages");
        NodeHitlCapability nodeHitlCapability3 = NodeHitlCapability.MESSAGES;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition3 = new LocalDeviceConnectorDefinition(strA0M3, nodeHitlCapability3.getDisplayTitleRes(), nodeHitlCapability3.getIconRes(), LocalDeviceConnectorPermissionRequirement.SMS, C60Q.A0u(NodeHitlGroup.SMS, "sms", BrowserOperationCatalogKt.READ, anonymousClass1, R.string._name_removed__res_0x7f120b60), C60Q.A0u(NodeHitlGroup.SMS_SEND, "sms_send", "write", LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$1.INSTANCE, R.string._name_removed__res_0x7f120b67), LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$2.INSTANCE);
        String strA0M4 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, HatchLinkOrderSheetKt.PHONE);
        NodeHitlCapability nodeHitlCapability4 = NodeHitlCapability.PHONE;
        int displayTitleRes3 = nodeHitlCapability4.getDisplayTitleRes();
        int iconRes3 = nodeHitlCapability4.getIconRes();
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement3 = LocalDeviceConnectorPermissionRequirement.PHONE_CALL;
        NodeHitlGroup nodeHitlGroup3 = NodeHitlGroup.PHONE_CALL;
        AnonymousClass1 anonymousClass13 = AnonymousClass1.INSTANCE;
        List listA0u3 = C60Q.A0u(nodeHitlGroup3, "phone_call", "write", anonymousClass13, R.string._name_removed__res_0x7f120b5c);
        LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$3 localDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$3 = LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$3.INSTANCE;
        C0881AGi c0881AGi = C0881AGi.A00;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition4 = new LocalDeviceConnectorDefinition(strA0M4, displayTitleRes3, iconRes3, localDeviceConnectorPermissionRequirement3, c0881AGi, listA0u3, localDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$3);
        String strA0M5 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, "notifications");
        NodeHitlCapability nodeHitlCapability5 = NodeHitlCapability.NOTIFICATIONS;
        int displayTitleRes4 = nodeHitlCapability5.getDisplayTitleRes();
        int iconRes4 = nodeHitlCapability5.getIconRes();
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement4 = LocalDeviceConnectorPermissionRequirement.NOTIFICATIONS;
        NodeHitlGroup nodeHitlGroup4 = NodeHitlGroup.NOTIFICATIONS;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition5 = new LocalDeviceConnectorDefinition(strA0M5, displayTitleRes4, iconRes4, localDeviceConnectorPermissionRequirement4, C60Q.A0u(nodeHitlGroup4, "notifications", BrowserOperationCatalogKt.READ, anonymousClass13, R.string._name_removed__res_0x7f120b61), C60Q.A0u(nodeHitlGroup4, "notifications", "write", anonymousClass13, R.string._name_removed__res_0x7f120b5f), LocalDeviceConnectorDefinition.AnonymousClass1.INSTANCE);
        String strA0M6 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, "call_log");
        NodeHitlCapability nodeHitlCapability6 = NodeHitlCapability.CALL_HISTORY;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition6 = new LocalDeviceConnectorDefinition(strA0M6, nodeHitlCapability6.getDisplayTitleRes(), nodeHitlCapability6.getIconRes(), LocalDeviceConnectorPermissionRequirement.CALL_LOG, C60Q.A0u(NodeHitlGroup.CALL_LOG, "call_log", BrowserOperationCatalogKt.READ, anonymousClass13, R.string._name_removed__res_0x7f120b62), c0881AGi, LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$4.INSTANCE);
        String strA0M7 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, "health");
        NodeHitlCapability nodeHitlCapability7 = NodeHitlCapability.HEALTH;
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition7 = new LocalDeviceConnectorDefinition(strA0M7, nodeHitlCapability7.getDisplayTitleRes(), nodeHitlCapability7.getIconRes(), LocalDeviceConnectorPermissionRequirement.HEALTH, C60Q.A0u(NodeHitlGroup.HEALTH, "health", BrowserOperationCatalogKt.READ, anonymousClass13, R.string._name_removed__res_0x7f120b65), c0881AGi, LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$5.INSTANCE);
        String strA0M8 = FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, "photos");
        NodeHitlCapability nodeHitlCapability8 = NodeHitlCapability.PHOTOS;
        List<LocalDeviceConnectorDefinition> listAsList = Arrays.asList(localDeviceConnectorDefinition, localDeviceConnectorDefinition2, localDeviceConnectorDefinition3, localDeviceConnectorDefinition4, localDeviceConnectorDefinition5, localDeviceConnectorDefinition6, localDeviceConnectorDefinition7, new LocalDeviceConnectorDefinition(strA0M8, nodeHitlCapability8.getDisplayTitleRes(), nodeHitlCapability8.getIconRes(), LocalDeviceConnectorPermissionRequirement.PHOTOS, C60Q.A0u(NodeHitlGroup.PHOTOS, "photos", BrowserOperationCatalogKt.READ, anonymousClass13, R.string._name_removed__res_0x7f120b66), c0881AGi, LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$6.INSTANCE));
        LOCAL_DEVICE_CONNECTOR_DEFINITIONS = listAsList;
        ArrayList<LocalDeviceConnectorActionDefinition> arrayListA0h = C3cG.A0h();
        for (LocalDeviceConnectorDefinition localDeviceConnectorDefinition8 : listAsList) {
            AbstractC0882AGj.A0r(AbstractC0878AGe.A0P(localDeviceConnectorDefinition8.writeActionDefinitions, localDeviceConnectorDefinition8.readActionDefinitions), arrayListA0h);
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0h));
        for (LocalDeviceConnectorActionDefinition localDeviceConnectorActionDefinition : arrayListA0h) {
            linkedHashMapA15.put(localDeviceConnectorActionDefinition.key, localDeviceConnectorActionDefinition.spec);
        }
        LOCAL_DEVICE_CONNECTOR_ACTION_SPECS = linkedHashMapA15;
    }

    public static final LocalDeviceConnectorActionDefinition action(String str, String str2, int i, NodeHitlGroup nodeHitlGroup, G0U<? super Context, Boolean> g0u) {
        return new LocalDeviceConnectorActionDefinition(FGI.A0d(LOCAL_DEVICE_CONNECTOR_PREFIX, str, ".", str2), i, new NodeHitlSpec(nodeHitlGroup, BrowserOperationCatalogKt.READ.equals(str2) ? NodeHitlAccess.READ : NodeHitlAccess.WRITE), g0u);
    }

    public static /* synthetic */ LocalDeviceConnectorActionDefinition action$default(String str, String str2, int i, NodeHitlGroup nodeHitlGroup, G0U g0u, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            g0u = AnonymousClass1.INSTANCE;
        }
        return action(str, str2, i, nodeHitlGroup, g0u);
    }

    public static final boolean getHealthConnectConnectorEnabled() {
        return AnonymousClass001.A1X(C31u.A00(healthConnectConnectorEnabled$delegate, $$delegatedProperties));
    }

    public static final boolean isNodesMediaEnabled() {
        return AnonymousClass001.A1X(isNodesMediaEnabled$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final String localConnectorId(String str) {
        return FGI.A0M(LOCAL_DEVICE_CONNECTOR_PREFIX, str);
    }

    public static final List<LocalDeviceConnectorDefinition> visibleLocalDeviceConnectorDefinitions() {
        List<LocalDeviceConnectorDefinition> list = LOCAL_DEVICE_CONNECTOR_DEFINITIONS;
        ArrayList arrayListA0h = C3cG.A0h();
        for (LocalDeviceConnectorDefinition localDeviceConnectorDefinition : list) {
            if (AnonymousClass003.A1Y(localDeviceConnectorDefinition.isVisible)) {
                arrayListA0h.add(localDeviceConnectorDefinition);
            }
        }
        return arrayListA0h;
    }

    public static final ConnectorPermissionGroup buildGroup(String str, String str2, List<LocalDeviceConnectorAction> list, Map<String, ? extends ConnectorPermissionMode> map) {
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (LocalDeviceConnectorAction localDeviceConnectorAction : list) {
            String str3 = localDeviceConnectorAction.key;
            String str4 = localDeviceConnectorAction.label;
            ConnectorPermissionMode connectorPermissionMode = map.get(str3);
            if (connectorPermissionMode == null) {
                connectorPermissionMode = ConnectorPermissionMode.ASK;
            }
            arrayListA0m.add(new ConnectorPermissionMethod(str3, str4, connectorPermissionMode));
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0m);
        Iterator it = arrayListA0m.iterator();
        while (it.hasNext()) {
            arrayListA0m2.add(((ConnectorPermissionMethod) it.next()).mode);
        }
        return new ConnectorPermissionGroup(str, str2, arrayListA0m, (ConnectorPermissionMode) AbstractC0878AGe.A0K(C3cG.A0m(arrayListA0m2)));
    }

    public static final boolean isGranted(LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, Context context) {
        List<PermissionDestination> listDevicePermissionDestinations = devicePermissionDestinations(localDeviceConnectorPermissionRequirement);
        if (!(listDevicePermissionDestinations instanceof Collection) || !listDevicePermissionDestinations.isEmpty()) {
            Iterator<PermissionDestination> it = listDevicePermissionDestinations.iterator();
            while (it.hasNext()) {
                if (!DevicePermissionStateKt.isDevicePermissionGranted(context, it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final LocalDeviceConnector localDeviceConnectorById(Context context, AbstractC3358CGz abstractC3358CGz, String str) {
        LocalDeviceConnectorDefinition next;
        AnonymousClass005.A0x(context, abstractC3358CGz, str);
        Iterator<LocalDeviceConnectorDefinition> it = visibleLocalDeviceConnectorDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.connectorId)) {
                break;
            }
        }
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition = next;
        if (localDeviceConnectorDefinition != null) {
            return localDeviceConnectorDefinition.toLocalDeviceConnector(context, abstractC3358CGz);
        }
        return null;
    }

    public static final List<LocalDeviceConnectorMetadata> localDeviceConnectorMetadata() {
        List<LocalDeviceConnectorDefinition> listVisibleLocalDeviceConnectorDefinitions = visibleLocalDeviceConnectorDefinitions();
        ArrayList arrayListA0m = AnonymousClass002.A0m(listVisibleLocalDeviceConnectorDefinitions);
        for (LocalDeviceConnectorDefinition localDeviceConnectorDefinition : listVisibleLocalDeviceConnectorDefinitions) {
            String str = localDeviceConnectorDefinition.connectorId;
            int i = localDeviceConnectorDefinition.displayTitleRes;
            int i2 = localDeviceConnectorDefinition.iconRes;
            LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement = localDeviceConnectorDefinition.permissionRequirement;
            List<LocalDeviceConnectorActionDefinition> list = localDeviceConnectorDefinition.readActionDefinitions;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
            Iterator<LocalDeviceConnectorActionDefinition> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0m2.add(it.next().toMetadata());
            }
            AHD ahdA07 = AGI.A07(arrayListA0m2);
            List<LocalDeviceConnectorActionDefinition> list2 = localDeviceConnectorDefinition.writeActionDefinitions;
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(list2);
            Iterator<LocalDeviceConnectorActionDefinition> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayListA0m3.add(it2.next().toMetadata());
            }
            arrayListA0m.add(new LocalDeviceConnectorMetadata(str, i, R.string._name_removed__res_0x7f120b6d, i2, localDeviceConnectorPermissionRequirement, ahdA07, AGI.A07(arrayListA0m3), true));
        }
        return arrayListA0m;
    }

    public static final List<LocalDeviceConnector> localDeviceConnectors(Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        List<LocalDeviceConnectorDefinition> listVisibleLocalDeviceConnectorDefinitions = visibleLocalDeviceConnectorDefinitions();
        ArrayList arrayListA0i = AnonymousClass003.A0i(listVisibleLocalDeviceConnectorDefinitions);
        Iterator<LocalDeviceConnectorDefinition> it = listVisibleLocalDeviceConnectorDefinitions.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toLocalDeviceConnector(context, abstractC3358CGz));
        }
        return arrayListA0i;
    }

    public static final void resetLocalDeviceConnectorModes(AbstractC3358CGz abstractC3358CGz, String str) {
        LocalDeviceConnectorDefinition next;
        AnonymousClass003.A0u(abstractC3358CGz, str);
        Iterator<LocalDeviceConnectorDefinition> it = visibleLocalDeviceConnectorDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (str.equals(next.connectorId)) {
                    break;
                }
            }
        }
        LocalDeviceConnectorDefinition localDeviceConnectorDefinition = next;
        if (localDeviceConnectorDefinition != null) {
            HatchNodeHitlGate companion = HatchNodeHitlGate.Companion.getInstance(abstractC3358CGz);
            Iterator it2 = AbstractC0878AGe.A0P(localDeviceConnectorDefinition.writeActionDefinitions, localDeviceConnectorDefinition.readActionDefinitions).iterator();
            while (it2.hasNext()) {
                companion.clearOverride(((LocalDeviceConnectorActionDefinition) it2.next()).spec);
            }
        }
    }

    public static final void setLocalDeviceConnectorMode(AbstractC3358CGz abstractC3358CGz, String str, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass005.A0x(abstractC3358CGz, str, connectorPermissionMode);
        NodeHitlSpec nodeHitlSpec = LOCAL_DEVICE_CONNECTOR_ACTION_SPECS.get(str);
        if (nodeHitlSpec != null) {
            HatchNodeHitlGate.Companion.getInstance(abstractC3358CGz).setMode(nodeHitlSpec, toNodeHitlMode(connectorPermissionMode));
        }
    }

    public static final NodeHitlMode toNodeHitlMode(ConnectorPermissionMode connectorPermissionMode) {
        int iOrdinal = connectorPermissionMode.ordinal();
        if (iOrdinal == 0) {
            return NodeHitlMode.ALLOW;
        }
        if (iOrdinal == 1) {
            return NodeHitlMode.ASK;
        }
        if (iOrdinal == 2) {
            return NodeHitlMode.DENY;
        }
        throw C3cG.A0q();
    }

    public static final ConnectorPermissionMode toPermissionMode(NodeHitlMode nodeHitlMode) {
        int iOrdinal = nodeHitlMode.ordinal();
        if (iOrdinal == 0) {
            return ConnectorPermissionMode.ALLOW;
        }
        if (iOrdinal == 1) {
            return ConnectorPermissionMode.ASK;
        }
        if (iOrdinal == 2) {
            return ConnectorPermissionMode.DENY;
        }
        throw C3cG.A0q();
    }

    public static final List<PermissionDestination> devicePermissionDestinations(LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement) {
        PermissionDestination permissionDestination;
        switch (localDeviceConnectorPermissionRequirement.ordinal()) {
            case 0:
                permissionDestination = PermissionDestination.CALENDAR;
                break;
            case 1:
                permissionDestination = PermissionDestination.CONTACTS;
                break;
            case 2:
                permissionDestination = PermissionDestination.MESSAGES;
                break;
            case 3:
                permissionDestination = PermissionDestination.PHONE;
                break;
            case 4:
                permissionDestination = PermissionDestination.PHONE_NOTIFICATIONS;
                break;
            case 5:
                permissionDestination = PermissionDestination.CALL_LOG;
                break;
            case 6:
                permissionDestination = PermissionDestination.HEALTH;
                break;
            case 7:
                permissionDestination = PermissionDestination.PHOTOS;
                break;
            default:
                throw C3cG.A0q();
        }
        return Collections.singletonList(permissionDestination);
    }
}
