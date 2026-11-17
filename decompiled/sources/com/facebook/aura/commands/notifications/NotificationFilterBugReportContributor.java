package com.facebook.aura.commands.notifications;

import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.FGI;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.devices.intf.BugReportSectionContributor;
import com.facebook.aura.mdm.AuraManagedConfig;
import com.facebook.aura.mdm.AuraManagedKey;
import java.io.File;
import java.time.Instant;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class NotificationFilterBugReportContributor implements BugReportSectionContributor {
    public static final NotificationFilterBugReportContributor INSTANCE = new NotificationFilterBugReportContributor();

    @Override // com.facebook.aura.devices.intf.BugReportSectionContributor
    public String summarySection(Context context, AbstractC3358CGz abstractC3358CGz) {
        Object objOfEpochMilli;
        List<StatusBarNotification> activeNotifications;
        AnonymousClass003.A0u(context, abstractC3358CGz);
        StringBuilder sbA0x = C60O.A0x("=== Notification Filters ===\n");
        WorkDeviceDetector workDeviceDetector = WorkDeviceDetector.INSTANCE;
        String strDeviceOwnerPackage = workDeviceDetector.deviceOwnerPackage(context);
        sbA0x.append(FGI.A0M("Device Owner: ", strDeviceOwnerPackage == null ? "(none)" : strDeviceOwnerPackage));
        sbA0x.append('\n');
        C3cI.A1M("Managed Device: ", sbA0x, AnonymousClass002.A1X(strDeviceOwnerPackage));
        C3cI.A1M("Work Profile: ", sbA0x, workDeviceDetector.hasWorkProfile(context));
        AuraManagedConfig auraManagedConfig = AuraManagedConfig.INSTANCE;
        Bundle bundleRestrictions = auraManagedConfig.restrictions(context);
        Long lLastReceivedAtMs = auraManagedConfig.lastReceivedAtMs(context);
        if (lLastReceivedAtMs == null || (objOfEpochMilli = Instant.ofEpochMilli(lLastReceivedAtMs.longValue())) == null) {
            objOfEpochMilli = "(never)";
        }
        C3cJ.A0k(objOfEpochMilli, "Managed Config Received At: ", sbA0x);
        Set<String> setKeySet = bundleRestrictions.keySet();
        C7384Etj.A0U(setKeySet);
        String strA01 = AbstractC06907md.A01(", ", AbstractC0878AGe.A0W(setKeySet), new NotificationFilterBugReportContributor$summarySection$1$2(bundleRestrictions));
        if (strA01.length() == 0) {
            strA01 = "(empty)";
        }
        C3cJ.A0k(strA01, "Managed Config Raw: ", sbA0x);
        AuraManagedKey[] auraManagedKeyArrValues = AuraManagedKey.values();
        int length = auraManagedKeyArrValues.length;
        for (int i = 0; i < length; i++) {
            AuraManagedKey auraManagedKey = auraManagedKeyArrValues[i];
            boolean zIsNotificationIngestionDisabled = auraManagedKey == AuraManagedKey.DISABLE_NOTIFICATION_INGESTION ? auraManagedConfig.isNotificationIngestionDisabled(context) : WorkNotificationFilterConfig.INSTANCE.isBlocked(context, auraManagedKey);
            String str = bundleRestrictions.containsKey(auraManagedKey.getWireKey()) ? "managed" : "default";
            StringBuilder sbA0g = C3cG.A0g(auraManagedKey.getWireKey());
            sbA0g.append(": ");
            sbA0g.append(zIsNotificationIngestionDisabled);
            sbA0x.append(C3cJ.A0N(" (", str, sbA0g));
            sbA0x.append('\n');
        }
        NotificationRepoImpl notificationRepoImpl = NotificationRepoHolder.repo;
        C3cI.A1M("Listener Connected: ", sbA0x, notificationRepoImpl != null);
        C3cJ.A0k((notificationRepoImpl == null || (activeNotifications = notificationRepoImpl.activeProvider.getActiveNotifications()) == null) ? "-" : C60Q.A0W(activeNotifications), "Tray After Filters: ", sbA0x);
        return sbA0x.toString();
    }

    @Override // com.facebook.aura.devices.intf.BugReportSectionContributor
    public File collectAttachment(Context context, AbstractC3358CGz abstractC3358CGz, File file) {
        return null;
    }
}
