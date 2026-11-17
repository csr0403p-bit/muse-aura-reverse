package com.facebook.aura.nodes;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.nodes.snapshot.HatchPermissionCatalogKt;
import com.facebook.aura.nodes.snapshot.NodeCommandDevicePermissionsKt;
import com.facebook.aura.nodes.snapshot.PermissionEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class NodePermissionGate {
    public final Context context;

    public NodePermissionGate(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
    }

    public final PermissionEntry missingCommandDevicePermission(HatchNodeCommandHandler hatchNodeCommandHandler, String str) {
        Object next;
        C7384Etj.A0Y(hatchNodeCommandHandler, 0);
        PermissionEntry permissionEntryMissingDevicePermissionEntry = missingDevicePermissionEntry(NodeCommandDevicePermissionsKt.preHitlDevicePermissionsToVerify(hatchNodeCommandHandler.getCommandId(), str));
        if (permissionEntryMissingDevicePermissionEntry != null) {
            return permissionEntryMissingDevicePermissionEntry;
        }
        List<String> list = hatchNodeCommandHandler.getSpec().permissionRequired;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            PermissionEntry permissionEntryPermissionEntryForTag = HatchPermissionCatalogKt.permissionEntryForTag(AnonymousClass005.A0j(it));
            if (permissionEntryPermissionEntryForTag != null) {
                arrayListA0h.add(permissionEntryPermissionEntryForTag);
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!AnonymousClass003.A1X(this.context, ((PermissionEntry) next).isGranted)) {
                break;
            }
        }
        return (PermissionEntry) next;
    }

    public final PermissionEntry missingDevicePermissionEntry(List<String> list) {
        PermissionEntry permissionEntryPermissionEntryForDevicePermission;
        String next;
        C7384Etj.A0Y(list, 0);
        Iterator<String> it = list.iterator();
        while (true) {
            permissionEntryPermissionEntryForDevicePermission = null;
            if (!it.hasNext() || ((permissionEntryPermissionEntryForDevicePermission = permissionEntryForDevicePermission((next = it.next()))) != null && !isDevicePermissionGranted(next))) {
                break;
            }
        }
        return permissionEntryPermissionEntryForDevicePermission;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isDevicePermissionGranted(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r3 = 1
            r2 = 0
            switch(r0) {
                case -1077307833: goto L15;
                case 1272354024: goto L12;
                case 1616506184: goto L18;
                default: goto L9;
            }
        L9:
            android.content.Context r0 = r4.context
            int r0 = r0.checkSelfPermission(r5)
            if (r0 != 0) goto L31
            return r3
        L12:
            java.lang.String r0 = "notifications"
            goto L1a
        L15:
            java.lang.String r0 = "@health_connect"
            goto L1a
        L18:
            java.lang.String r0 = "@notification_listener"
        L1a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L9
            com.facebook.aura.nodes.snapshot.PermissionEntry r0 = r4.permissionEntryForDevicePermission(r5)
            if (r0 == 0) goto L31
            X.G0U<android.content.Context, java.lang.Boolean> r1 = r0.isGranted
            android.content.Context r0 = r4.context
            boolean r0 = X.AnonymousClass003.A1X(r0, r1)
            if (r0 != r3) goto L31
            return r3
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.NodePermissionGate.isDevicePermissionGranted(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.nodes.snapshot.PermissionEntry permissionEntryForDevicePermission(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            java.lang.String r1 = "notifications"
            switch(r0) {
                case -2062386608: goto Le;
                case -1928411001: goto L11;
                case -1921431796: goto L14;
                case -1888586689: goto L1f;
                case -1142799244: goto L22;
                case -1077307833: goto L25;
                case -406040016: goto L30;
                case -63024214: goto L33;
                case 52602690: goto L36;
                case 112197485: goto L41;
                case 175802396: goto L4c;
                case 214526995: goto L57;
                case 603653886: goto L5a;
                case 1272354024: goto L65;
                case 1616506184: goto L6a;
                case 1977429404: goto L77;
                case 2024715147: goto L82;
                default: goto L9;
            }
        L9:
            com.facebook.aura.nodes.snapshot.PermissionEntry r0 = com.facebook.aura.nodes.snapshot.HatchPermissionCatalogKt.permissionEntryForTag(r2)
            return r0
        Le:
            java.lang.String r0 = "android.permission.READ_SMS"
            goto L38
        L11:
            java.lang.String r0 = "android.permission.READ_CALENDAR"
            goto L5c
        L14:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "call_log"
            goto L9
        L1f:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            goto L84
        L22:
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            goto L4e
        L25:
            java.lang.String r0 = "@health_connect"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "health"
            goto L9
        L30:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            goto L4e
        L33:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            goto L84
        L36:
            java.lang.String r0 = "android.permission.SEND_SMS"
        L38:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "sms"
            goto L9
        L41:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "phone"
            goto L9
        L4c:
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
        L4e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "photos"
            goto L9
        L57:
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            goto L79
        L5a:
            java.lang.String r0 = "android.permission.WRITE_CALENDAR"
        L5c:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "calendar"
            goto L9
        L65:
            boolean r0 = r2.equals(r1)
            goto L70
        L6a:
            java.lang.String r0 = "@notification_listener"
            boolean r0 = r2.equals(r0)
        L70:
            if (r0 == 0) goto L9
            com.facebook.aura.nodes.snapshot.PermissionEntry r0 = com.facebook.aura.nodes.snapshot.HatchPermissionCatalogKt.permissionEntryForTag(r1)
            return r0
        L77:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
        L79:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "contacts"
            goto L9
        L82:
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
        L84:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "location"
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.NodePermissionGate.permissionEntryForDevicePermission(java.lang.String):com.facebook.aura.nodes.snapshot.PermissionEntry");
    }
}
