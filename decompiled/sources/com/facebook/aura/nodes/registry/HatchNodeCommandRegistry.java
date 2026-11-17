package com.facebook.aura.nodes.registry;

import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7380Etd;
import X.C7384Etj;
import X.F0C;
import android.content.Context;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;
import com.facebook.aura.commands.core.NotificationAccessUtils;
import com.facebook.aura.commands.core.PhotoAccessUtils;
import com.facebook.aura.commands.core.TelephonyFeatureUtils;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import com.facebook.aura.nodes.core.NodeCommandAvailabilityCatalog;
import com.facebook.aura.nodes.core.NodeCommandAvailabilityKt;
import com.facebook.aura.nodes.core.NodeCommandDeviceRequirement;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public final class HatchNodeCommandRegistry {
    public static final String PSEUDO_PERMISSION_HEALTH_CONNECT = "@health_connect";
    public static final String PSEUDO_PERMISSION_NOTIFICATIONS_POST = "@notifications_post";
    public static final String PSEUDO_PERMISSION_NOTIFICATION_LISTENER = "@notification_listener";
    public static final String PSEUDO_PERMISSION_PHOTOS = "@photos";
    public final Context context;
    public final F0C handlers$delegate;
    public volatile Set<String> lastEnvironmentSnapshot;
    public final Object snapshotLock;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final List<String> WATCHED_PERMISSIONS = Arrays.asList("android.permission.READ_CONTACTS", "android.permission.CAMERA", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR", "android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.POST_NOTIFICATIONS", "android.permission.WRITE_CONTACTS");

    public final class Companion {
        public final List<String> getWATCHED_PERMISSIONS() {
            return HatchNodeCommandRegistry.WATCHED_PERMISSIONS;
        }

        public final HatchNodeCommandRegistry getInstance(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            return (HatchNodeCommandRegistry) abstractC3358CGz.A03(HatchNodeCommandRegistry.class, new HatchNodeCommandRegistry$Companion$getInstance$1(abstractC3358CGz, context));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchNodeCommandHandler find(NodeCommandId nodeCommandId) {
        C7384Etj.A0Y(nodeCommandId, 0);
        HatchNodeCommandHandler hatchNodeCommandHandler = getHandlers().get(nodeCommandId);
        if (hatchNodeCommandHandler == null || !hatchNodeCommandHandler.isEnabled()) {
            return null;
        }
        return hatchNodeCommandHandler;
    }

    public final HatchNodeCommandHandler findByWireId(String str) {
        C7384Etj.A0Y(str, 0);
        NodeCommandId nodeCommandIdFromId = NodeCommandId.Companion.fromId(str);
        if (nodeCommandIdFromId != null) {
            return find(nodeCommandIdFromId);
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeCommandDeviceRequirement.values().length];
            try {
                AnonymousClass002.A13(NodeCommandDeviceRequirement.NONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeCommandDeviceRequirement.TELEPHONY_MESSAGING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeCommandDeviceRequirement.TELEPHONY_CALLING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Map<NodeCommandId, HatchNodeCommandHandler> getHandlers() {
        return (Map) this.handlers$delegate.getValue();
    }

    public HatchNodeCommandRegistry(AbstractC3358CGz abstractC3358CGz, Context context) {
        AnonymousClass003.A0u(abstractC3358CGz, context);
        this.userSession = abstractC3358CGz;
        this.context = context;
        this.handlers$delegate = AbstractC5321DgF.A03(HatchNodeCommandRegistry$handlers$2.INSTANCE);
        this.snapshotLock = C3cG.A0T();
    }

    private final Set<String> currentEnvironmentSnapshot() {
        Set<String> setA0f = AbstractC0878AGe.A0f(currentGrantedSet());
        if (HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(this.context)) {
            setA0f.add(HatchNodeCommandRegistryKt.DEFAULT_ASSISTANT_TOKEN);
        }
        return setA0f;
    }

    private final boolean isMet(NodeCommandDeviceRequirement nodeCommandDeviceRequirement) {
        int iOrdinal = nodeCommandDeviceRequirement.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return TelephonyFeatureUtils.INSTANCE.hasMessaging(this.context);
        }
        if (iOrdinal == 2) {
            return TelephonyFeatureUtils.INSTANCE.hasCalling(this.context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Set<String> currentGrantedSet() {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (String str : WATCHED_PERMISSIONS) {
            if (this.context.checkSelfPermission(str) == 0) {
                linkedHashSetA0k.add(str);
            }
        }
        if (NotificationAccessUtils.INSTANCE.isNotificationAccessGranted(this.context)) {
            linkedHashSetA0k.add("@notification_listener");
        }
        if (new C7380Etd(this.context).A00.areNotificationsEnabled()) {
            linkedHashSetA0k.add(PSEUDO_PERMISSION_NOTIFICATIONS_POST);
        }
        if (HealthConnectPermissionUtils.granted.get()) {
            linkedHashSetA0k.add("@health_connect");
        }
        if (PhotoAccessUtils.INSTANCE.isReadGranted(this.context)) {
            linkedHashSetA0k.add(PSEUDO_PERMISSION_PHOTOS);
        }
        return linkedHashSetA0k;
    }

    public final Map<NodeCommandId, NodeCommandSpec> getAllCommandSpecs() {
        Map<NodeCommandId, HatchNodeCommandHandler> handlers = getHandlers();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(handlers.size()));
        Iterator itA0n = AnonymousClass002.A0n(handlers);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            linkedHashMapA15.put(entryA0l.getKey(), ((HatchNodeCommandHandlerRegistration) entryA0l.getValue()).getSpec());
        }
        return linkedHashMapA15;
    }

    public final Map<String, NodeCommandSpec> getEnabledCommandSpecs(boolean z) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(getHandlers());
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            NodeCommandId nodeCommandId = (NodeCommandId) entry.getKey();
            HatchNodeCommandHandler hatchNodeCommandHandler = (HatchNodeCommandHandler) entry.getValue();
            NodeCommandAvailabilityCatalog nodeCommandAvailabilityCatalog = NodeCommandAvailabilityCatalog.INSTANCE;
            if (NodeCommandAvailabilityKt.isAvailable(nodeCommandAvailabilityCatalog.forCommand(nodeCommandId), z) && (hatchNodeCommandHandler.getOnlySendsCard() || isMet(nodeCommandAvailabilityCatalog.deviceRequirementForCommand(nodeCommandId)))) {
                if (hatchNodeCommandHandler.isEnabled()) {
                    linkedHashMapA0j.put(nodeCommandId.getCommandId(), hatchNodeCommandHandler.getSpec());
                }
            }
        }
        return linkedHashMapA0j;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNodeEnvironmentChanged() {
        /*
            r3 = this;
            java.util.Set r1 = r3.currentEnvironmentSnapshot()
            java.lang.Object r2 = r3.snapshotLock
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r3.lastEnvironmentSnapshot     // Catch: java.lang.Throwable -> L17
            r3.lastEnvironmentSnapshot = r1     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r1 != 0) goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.registry.HatchNodeCommandRegistry.hasNodeEnvironmentChanged():boolean");
    }

    public final void seedEnvironmentBaseline() {
        Set<String> setCurrentEnvironmentSnapshot = currentEnvironmentSnapshot();
        synchronized (this.snapshotLock) {
            this.lastEnvironmentSnapshot = setCurrentEnvironmentSnapshot;
        }
    }

    public final Map<String, NodeCommandSpec> getEnabledCommandSpecs() {
        Set<Map.Entry<NodeCommandId, HatchNodeCommandHandler>> setEntrySet = getHandlers().entrySet();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Map.Entry<NodeCommandId, HatchNodeCommandHandler> entry : setEntrySet) {
            if (entry.getValue().isEnabled()) {
                arrayListA0h.add(entry);
            }
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0h));
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMapA15.put(((NodeCommandId) entryA0l.getKey()).getCommandId(), ((HatchNodeCommandHandlerRegistration) entryA0l.getValue()).getSpec());
        }
        return linkedHashMapA15;
    }
}
