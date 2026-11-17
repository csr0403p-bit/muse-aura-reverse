package com.facebook.aura.nodes.snapshot;

import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C0924AIa;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.navigation.key.DevicePermissionRowId;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class HatchPermissionCatalogKt {
    public static final Map<String, G0U<Context, Boolean>> NODE_PERMISSION_TOKENS;
    public static final List<PermissionEntry> PERMISSION_ENTRIES;
    public static final Map<String, PermissionEntry> PERMISSION_ENTRIES_BY_TAG;

    public static final PermissionEntry permissionEntryForTag(String str) {
        C7384Etj.A0Y(str, 0);
        return PERMISSION_ENTRIES_BY_TAG.get(str);
    }

    static {
        PermissionEntry permissionEntry = new PermissionEntry(HatchNodeCardJsonKt.TYPE_CONTACTS, DevicePermissionRowId.CONTACTS, "Contacts", HatchPermissionCatalogKt$PERMISSION_ENTRIES$1.INSTANCE);
        PermissionEntry permissionEntry2 = new PermissionEntry(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, DevicePermissionRowId.LOCATION, "Location", HatchPermissionCatalogKt$PERMISSION_ENTRIES$2.INSTANCE);
        PermissionEntry permissionEntry3 = new PermissionEntry("calendar", DevicePermissionRowId.CALENDAR, "Calendar", HatchPermissionCatalogKt$PERMISSION_ENTRIES$3.INSTANCE);
        DevicePermissionRowId devicePermissionRowId = DevicePermissionRowId.SMS;
        List<PermissionEntry> listAsList = Arrays.asList(permissionEntry, permissionEntry2, permissionEntry3, new PermissionEntry("sms", devicePermissionRowId, "Text Messages", HatchPermissionCatalogKt$PERMISSION_ENTRIES$4.INSTANCE), new PermissionEntry("sms_send", devicePermissionRowId, "Text Messages", HatchPermissionCatalogKt$PERMISSION_ENTRIES$5.INSTANCE), new PermissionEntry("call_log", DevicePermissionRowId.CALL_LOG, "Call Log", HatchPermissionCatalogKt$PERMISSION_ENTRIES$6.INSTANCE), new PermissionEntry(HatchLinkOrderSheetKt.PHONE, DevicePermissionRowId.PHONE, "Phone", HatchPermissionCatalogKt$PERMISSION_ENTRIES$7.INSTANCE), new PermissionEntry("notifications", DevicePermissionRowId.NOTIFICATIONS, "Notifications", HatchPermissionCatalogKt$PERMISSION_ENTRIES$8.INSTANCE), new PermissionEntry("health", DevicePermissionRowId.HEALTH, "Health", HatchPermissionCatalogKt$PERMISSION_ENTRIES$9.INSTANCE), new PermissionEntry("photos", DevicePermissionRowId.PHOTOS, "Photos", HatchPermissionCatalogKt$PERMISSION_ENTRIES$10.INSTANCE));
        PERMISSION_ENTRIES = listAsList;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(listAsList));
        for (PermissionEntry permissionEntry4 : listAsList) {
            linkedHashMapA15.put(permissionEntry4.tag, permissionEntry4);
        }
        PERMISSION_ENTRIES_BY_TAG = linkedHashMapA15;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        for (PermissionEntry permissionEntry5 : PERMISSION_ENTRIES) {
            c0924AIaA0u.put(permissionEntry5.tag, permissionEntry5.isGranted);
        }
        c0924AIaA0u.put("location_always", HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$2.INSTANCE);
        c0924AIaA0u.put("camera", HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$3.INSTANCE);
        c0924AIaA0u.put("notifications_post", HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$4.INSTANCE);
        NODE_PERMISSION_TOKENS = AIW.A0K(c0924AIaA0u);
    }

    public static final Map<String, G0U<Context, Boolean>> getNODE_PERMISSION_TOKENS() {
        return NODE_PERMISSION_TOKENS;
    }

    public static final boolean hasRuntimePermission(Context context, String str) {
        return AnonymousClass002.A1M(context.checkSelfPermission(str));
    }
}
