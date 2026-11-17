package com.facebook.aura.settings;

import X.AGI;
import X.AHD;
import X.AbstractC0882AGj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C0881AGi;
import X.C7384Etj;
import X.EnumC06837l4;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import com.facebook.aura.devices.intf.MuseGadgetNamesKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.nodes.json.DevicePresence;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchConnectedDeviceSectionsKt {
    public static final long INACTIVE_AFTER_MS = 2592000000L;
    public static final C06827l3 REAL_HOME_LINK_NAME = new C06827l3("^(?:homelink|hatchlink)-[0-9a-f]{6}$", EnumC06837l4.A03);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer appPlatformNameRes(java.lang.String r1) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            java.lang.String r0 = X.AnonymousClass002.A0l(r1)
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1338956761: goto L54;
                case -1182263643: goto L48;
                case -861391249: goto L3c;
                case 104461: goto L39;
                case 107855: goto L36;
                case 3238794: goto L33;
                case 102977780: goto L27;
                case 103652211: goto L24;
                case 113134395: goto L18;
                case 1349493379: goto L15;
                default: goto L13;
            }
        L13:
            r0 = 0
            return r0
        L15:
            java.lang.String r0 = "windows"
            goto L1a
        L18:
            java.lang.String r0 = "win32"
        L1a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131888059(0x7f1207bb, float:1.9410743E38)
            goto L5f
        L24:
            java.lang.String r0 = "macos"
            goto L56
        L27:
            java.lang.String r0 = "linux"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131888057(0x7f1207b9, float:1.9410739E38)
            goto L5f
        L33:
            java.lang.String r0 = "ipad"
            goto L4a
        L36:
            java.lang.String r0 = "mac"
            goto L56
        L39:
            java.lang.String r0 = "ios"
            goto L4a
        L3c:
            java.lang.String r0 = "android"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131888055(0x7f1207b7, float:1.9410735E38)
            goto L5f
        L48:
            java.lang.String r0 = "iphone"
        L4a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131888056(0x7f1207b8, float:1.9410737E38)
            goto L5f
        L54:
            java.lang.String r0 = "darwin"
        L56:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 2131888058(0x7f1207ba, float:1.941074E38)
        L5f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDeviceSectionsKt.appPlatformNameRes(java.lang.String):java.lang.Integer");
    }

    public static final GadgetKind getGadgetKind(NodeListEntry nodeListEntry) {
        String strA0l;
        C7384Etj.A0Y(nodeListEntry, 0);
        if (nodeListEntry.isWearable()) {
            return GadgetKind.GLASSES;
        }
        if (nodeListEntry.isHatchLinkDevice() && REAL_HOME_LINK_NAME.A08(AnonymousClass002.A0l(nodeListEntry.displayName))) {
            return GadgetKind.HOME_LINK;
        }
        String str = nodeListEntry.deviceFamily;
        if ("homehub".equals((str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? null : AnonymousClass001.A0u(strA0l)) || (nodeListEntry.isHatchLinkDevice() && AnonymousClass001.A0u(AnonymousClass002.A0l(nodeListEntry.platform)).equals("linux"))) {
            return GadgetKind.LINUX_GADGET;
        }
        if (nodeListEntry.isHatchLinkDevice()) {
            return GadgetKind.WIFI_GADGET;
        }
        return null;
    }

    public static final HomeLinkOffer homeLinkOffer(SubscriptionManagementCta subscriptionManagementCta, AuraNavKey auraNavKey) {
        if (subscriptionManagementCta == null || auraNavKey == null) {
            return null;
        }
        String str = subscriptionManagementCta.shortLabel;
        if (str == null) {
            str = subscriptionManagementCta.label;
        }
        return new HomeLinkOffer(str, subscriptionManagementCta.subtitle, auraNavKey);
    }

    public static final ConnectedDeviceSections connectedDeviceSectionsOf(List<NodeListEntry> list, String str, boolean z, List<ConnectedDeviceRow> list2, long j) {
        AnonymousClass003.A0w(list, list2);
        ArrayList arrayList = new ArrayList();
        for (NodeListEntry nodeListEntry : list) {
            NodeListEntry nodeListEntry2 = nodeListEntry;
            if (z || !nodeListEntry2.isHatchLinkDevice()) {
                arrayList.add(nodeListEntry);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (C7384Etj.areEqual(HatchConnectedDevicesViewModelKt.normalizeNodeId(((NodeListEntry) obj).nodeId), str)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            NodeListEntry nodeListEntry3 = (NodeListEntry) obj2;
            GadgetKind gadgetKind = HatchConnectedDeviceClassificationKt.isMuseCharm(nodeListEntry3) ? GadgetKind.GLASSES : getGadgetKind(nodeListEntry3);
            Object arrayList4 = linkedHashMap.get(gadgetKind);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(gadgetKind, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        List listAsList = Arrays.asList(GadgetKind.HOME_LINK, GadgetKind.WIFI_GADGET, GadgetKind.LINUX_GADGET);
        ArrayList<NodeListEntry> arrayList5 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) linkedHashMap.get(it.next());
            if (iterable == null) {
                iterable = C0881AGi.A00;
            }
            AbstractC0882AGj.A0r(iterable, arrayList5);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList5);
        for (NodeListEntry nodeListEntry4 : arrayList5) {
            arrayListA0i.add(new GadgetRow(nodeListEntry4, MuseGadgetNamesKt.museGadgetIdentifier(AnonymousClass002.A0l(nodeListEntry4.displayName))));
        }
        List list3 = (List) linkedHashMap.get(null);
        if (list3 == null) {
            list3 = C0881AGi.A00;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : list3) {
            if (!AnonymousClass001.A0u(AnonymousClass002.A0l(((NodeListEntry) obj3).platform)).equals("web")) {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj4 : arrayList6) {
            if (isInactiveApp((NodeListEntry) obj4, j)) {
                arrayList7.add(obj4);
            } else {
                arrayList8.add(obj4);
            }
        }
        AHD ahdA07 = AGI.A07(arrayList2);
        Iterable iterable2 = (Iterable) linkedHashMap.get(GadgetKind.GLASSES);
        if (iterable2 == null) {
            iterable2 = C0881AGi.A00;
        }
        return new ConnectedDeviceSections(ahdA07, AGI.A07(iterable2), AGI.A07(arrayList8), AGI.A07(arrayList7), AGI.A07(arrayListA0i), AGI.A07(list2));
    }

    public static final boolean isInactiveApp(NodeListEntry nodeListEntry, long j) {
        Long lastSeenMs;
        return nodeListEntry.getPresence() == DevicePresence.OFFLINE && (lastSeenMs = nodeListEntry.getLastSeenMs()) != null && j - lastSeenMs.longValue() > INACTIVE_AFTER_MS;
    }
}
