package com.facebook.aura.nodes.snapshot;

import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.F0C;
import X.G0U;
import android.content.Context;
import android.os.Build;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;
import com.facebook.aura.commands.alarm.ReminderAlarmReceiver;
import com.facebook.aura.conversation.widget.api.ConversationWidgetKinds;
import com.facebook.aura.model.HatchRenderingCapabilities;
import com.facebook.aura.nodes.core.DeviceDisplayNameKt;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodePinReminderKt;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.json.ArgSpecJson;
import com.facebook.aura.nodes.json.CapabilitiesJson;
import com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson;
import com.facebook.aura.nodes.json.DataSourceCapabilityJson;
import com.facebook.aura.nodes.json.DeviceCommandCapabilityJson;
import com.facebook.aura.nodes.json.DeviceMetadataJson;
import com.facebook.aura.nodes.json.RenderingCapabilitiesJson;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistry;
import com.facebook.aura.nodes.registry.HatchNodeCommandRegistry;
import com.facebook.aura.uicontrol.UiCommandRegistry;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCapabilitiesSnapshot {
    public final HatchNodeCommandRegistry commandRegistry;
    public final Context context;
    public final G0U<ClientRegisterCapabilitiesParamsJson, ClientRegisterCapabilitiesParamsJson> contributeRegistration;
    public final HatchDataSourceRegistry dataSourceRegistry;
    public final String deliveryApp;
    public final HatchCommandDescriptionResolver descriptionResolver;
    public final Function0<Boolean> pinReminderSupported;
    public final UiCommandRegistry uiCommandRegistry;
    public final AbstractC3358CGz userSession;

    /* renamed from: com.facebook.aura.nodes.snapshot.HatchCapabilitiesSnapshot$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeArgType.values().length];
            try {
                AnonymousClass002.A13(NodeArgType.STRING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeArgType.INTEGER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeArgType.NUMBER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NodeArgType.BOOLEAN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NodeArgType.ARRAY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ClientRegisterCapabilitiesParamsJson build$default(HatchCapabilitiesSnapshot hatchCapabilitiesSnapshot, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(hatchCapabilitiesSnapshot.context);
        }
        return hatchCapabilitiesSnapshot.build(z);
    }

    private final boolean dataSourcePermissionGranted(List<String> list) {
        String str;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if ("@notification_listener".equals(str2)) {
                    str = "notifications";
                } else if ("@health_connect".equals(str2)) {
                    str = "health";
                } else if (this.context.checkSelfPermission(str2) != 0) {
                    return false;
                }
                if (!tokenGranted(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final DeviceCommandCapabilityJson pinReminderCapability() {
        F0C<C9hr<Object>>[] f0cArr = DeviceCommandCapabilityJson.$childSerializers;
        return new DeviceCommandCapabilityJson("Ask the user to confirm they still remember their recovery PIN.", C3cH.A0n("reminder_interval_days", new ArgSpecJson(2, null), C3cG.A0r(ReminderAlarmReceiver.EXTRA_REMINDER_ID, new ArgSpecJson(1, null)), C3cG.A0r("update_id", new ArgSpecJson(1, null)), C3cG.A0r("state_revision", new ArgSpecJson(2, null))), AGH.A0E(), C0881AGi.A00, 0L, null);
    }

    private final ArgSpecJson toArgSpecJson(NodeArgSpec nodeArgSpec) {
        return new ArgSpecJson(toWireInt(nodeArgSpec.type), nodeArgSpec.description);
    }

    private final boolean tokenGranted(String str) {
        G0U<Context, Boolean> g0u = HatchPermissionCatalogKt.NODE_PERMISSION_TOKENS.get(str);
        return g0u != null && AnonymousClass003.A1X(this.context, g0u);
    }

    public final ClientRegisterCapabilitiesParamsJson build(boolean z) {
        String strResolveCommand;
        String str = "unknown";
        try {
            String str2 = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception unused) {
        }
        List<DataSource> enabledSources = this.dataSourceRegistry.getEnabledSources();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(enabledSources));
        for (DataSource dataSource : enabledSources) {
            linkedHashMapA15.put(dataSource.getSourceId(), new DataSourceCapabilityJson(this.descriptionResolver.resolveDataSource(dataSource.getSourceId(), dataSource.getDescription()), dataSource.getEmitsProactively(), dataSource.getSupportsBackfill(), dataSourcePermissionGranted(dataSource.getPermissionRequired())));
        }
        Map<String, NodeCommandSpec> enabledCommandSpecs = this.commandRegistry.getEnabledCommandSpecs(z);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(enabledCommandSpecs);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            if (HatchCapabilitiesSnapshotKt.DEVICE_COMMAND_IDS.contains(entry.getKey())) {
                linkedHashMapA0j.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMapA152 = C60O.A15(AIW.A0H(linkedHashMapA0j.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itA0i.next();
            Object key = entry2.getKey();
            String str3 = (String) entry2.getKey();
            NodeCommandSpec nodeCommandSpec = (NodeCommandSpec) entry2.getValue();
            NodeCommandId nodeCommandIdFromId = NodeCommandId.Companion.fromId(str3);
            if (nodeCommandIdFromId == null || (strResolveCommand = this.descriptionResolver.resolveCommand(nodeCommandIdFromId, nodeCommandSpec.description)) == null) {
                strResolveCommand = nodeCommandSpec.description;
            }
            Map<String, NodeArgSpec> map = nodeCommandSpec.required;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(map.size()));
            for (Map.Entry<String, NodeArgSpec> entry3 : map.entrySet()) {
                linkedHashMap.put(entry3.getKey(), toArgSpecJson(entry3.getValue()));
            }
            Map<String, NodeArgSpec> map2 = nodeCommandSpec.optional;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AIW.A0H(map2.size()));
            for (Map.Entry<String, NodeArgSpec> entry4 : map2.entrySet()) {
                linkedHashMap2.put(entry4.getKey(), toArgSpecJson(entry4.getValue()));
            }
            linkedHashMapA152.put(key, new DeviceCommandCapabilityJson(strResolveCommand, linkedHashMap, linkedHashMap2, nodeCommandSpec.permissionRequired, NodeCommandTimeoutsKt.advertisedCommandTimeoutMs(nodeCommandIdFromId, nodeCommandSpec), null));
        }
        C0924AIa c0924AIaA0u = C3cG.A0u();
        Iterator itA0n2 = AnonymousClass002.A0n(this.uiCommandRegistry.specs());
        while (itA0n2.hasNext()) {
            Map.Entry entry5 = (Map.Entry) itA0n2.next();
            Object key2 = entry5.getKey();
            NodeCommandSpec nodeCommandSpec2 = (NodeCommandSpec) entry5.getValue();
            String str4 = nodeCommandSpec2.description;
            Map<String, NodeArgSpec> map3 = nodeCommandSpec2.required;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AIW.A0H(map3.size()));
            for (Map.Entry<String, NodeArgSpec> entry6 : map3.entrySet()) {
                linkedHashMap3.put(entry6.getKey(), toArgSpecJson(entry6.getValue()));
            }
            Map<String, NodeArgSpec> map4 = nodeCommandSpec2.optional;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(AIW.A0H(map4.size()));
            for (Map.Entry<String, NodeArgSpec> entry7 : map4.entrySet()) {
                linkedHashMap4.put(entry7.getKey(), toArgSpecJson(entry7.getValue()));
            }
            c0924AIaA0u.put(key2, new DeviceCommandCapabilityJson(str4, linkedHashMap3, linkedHashMap4, nodeCommandSpec2.permissionRequired, nodeCommandSpec2.timeoutMs, null));
        }
        if (AnonymousClass003.A1Y(this.pinReminderSupported)) {
            c0924AIaA0u.put(NodePinReminderKt.PIN_REMINDER_COMMAND_ID, pinReminderCapability());
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        String strA0l = C60O.A0l();
        String strLocalDeviceDisplayName = DeviceDisplayNameKt.localDeviceDisplayName(this.context);
        String str5 = Build.MODEL;
        C7384Etj.A0V(str5);
        String str6 = this.deliveryApp;
        F0C<C9hr<Object>>[] f0cArr = DeviceMetadataJson.$childSerializers;
        DeviceMetadataJson deviceMetadataJson = new DeviceMetadataJson(str5, str5, false, str6, null);
        List<String> listComputeEnabledPermissionTokens$fbandroid_express_aura_java_com_facebook_aura_nodes_snapshot_snapshot = computeEnabledPermissionTokens$fbandroid_express_aura_java_com_facebook_aura_nodes_snapshot_snapshot();
        List listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(ConversationWidgetKinds.INSTANCE.standalonePresentations(this.userSession), HatchRenderingCapabilities.INSTANCE.getSupportedPresentations()));
        List<String> list = HatchRenderingCapabilities.supportedInlinePresentations;
        List<String> list2 = HatchRenderingCapabilities.supportedTextEntities;
        if (!HatchCapabilitiesSnapshotKt.getProductEntityChipsEnabled()) {
            list2 = null;
        }
        return this.contributeRegistration.invoke(new ClientRegisterCapabilitiesParamsJson(strA0l, "android", strLocalDeviceDisplayName, str, deviceMetadataJson, listComputeEnabledPermissionTokens$fbandroid_express_aura_java_com_facebook_aura_nodes_snapshot_snapshot, new CapabilitiesJson(linkedHashMapA15, linkedHashMapA152, c0924AIaA0K, new RenderingCapabilitiesJson(listA0T, list, list2), null)));
    }

    public final List<String> computeEnabledPermissionTokens$fbandroid_express_aura_java_com_facebook_aura_nodes_snapshot_snapshot() {
        Map<String, G0U<Context, Boolean>> map = HatchPermissionCatalogKt.NODE_PERMISSION_TOKENS;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            if (((Boolean) ((G0U) entry.getValue()).invoke(this.context)).booleanValue()) {
                linkedHashMapA0j.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0878AGe.A0X(linkedHashMapA0j.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchCapabilitiesSnapshot(Context context, AbstractC3358CGz abstractC3358CGz, HatchNodeCommandRegistry hatchNodeCommandRegistry, HatchDataSourceRegistry hatchDataSourceRegistry, UiCommandRegistry uiCommandRegistry, Function0<Boolean> function0, String str, HatchCommandDescriptionResolver hatchCommandDescriptionResolver, G0U<? super ClientRegisterCapabilitiesParamsJson, ClientRegisterCapabilitiesParamsJson> g0u) {
        AnonymousClass005.A17(context, abstractC3358CGz, hatchNodeCommandRegistry, hatchDataSourceRegistry, uiCommandRegistry);
        AnonymousClass005.A13(function0, hatchCommandDescriptionResolver, g0u, 5);
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.commandRegistry = hatchNodeCommandRegistry;
        this.dataSourceRegistry = hatchDataSourceRegistry;
        this.uiCommandRegistry = uiCommandRegistry;
        this.pinReminderSupported = function0;
        this.deliveryApp = str;
        this.descriptionResolver = hatchCommandDescriptionResolver;
        this.contributeRegistration = g0u;
    }

    private final int toWireInt(NodeArgType nodeArgType) {
        int iOrdinal = nodeArgType.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            i = 2;
            if (iOrdinal != 1) {
                i = 3;
                if (iOrdinal != 2) {
                    i = 4;
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            return 6;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: com.facebook.aura.nodes.snapshot.HatchCapabilitiesSnapshot$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ClientRegisterCapabilitiesParamsJson, ClientRegisterCapabilitiesParamsJson> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ClientRegisterCapabilitiesParamsJson invoke2(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson) {
            C7384Etj.A0Y(clientRegisterCapabilitiesParamsJson, 0);
            return clientRegisterCapabilitiesParamsJson;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ ClientRegisterCapabilitiesParamsJson invoke(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson) {
            C7384Etj.A0Y(clientRegisterCapabilitiesParamsJson, 0);
            return clientRegisterCapabilitiesParamsJson;
        }
    }

    public /* synthetic */ HatchCapabilitiesSnapshot(Context context, AbstractC3358CGz abstractC3358CGz, HatchNodeCommandRegistry hatchNodeCommandRegistry, HatchDataSourceRegistry hatchDataSourceRegistry, UiCommandRegistry uiCommandRegistry, Function0 function0, String str, HatchCommandDescriptionResolver hatchCommandDescriptionResolver, G0U g0u, int i, C06H c06h) {
        this(context, abstractC3358CGz, hatchNodeCommandRegistry, hatchDataSourceRegistry, uiCommandRegistry, (i & 32) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 64) != 0 ? null : str, (i & 128) != 0 ? DefaultHatchCommandDescriptionResolver.INSTANCE : hatchCommandDescriptionResolver, (i & 256) != 0 ? AnonymousClass2.INSTANCE : g0u);
    }
}
