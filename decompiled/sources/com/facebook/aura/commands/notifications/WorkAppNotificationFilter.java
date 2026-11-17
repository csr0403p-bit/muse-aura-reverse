package com.facebook.aura.commands.notifications;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.aura.mdm.AuraManagedKey;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class WorkAppNotificationFilter implements NotificationFilter {
    public final Context appContext;
    public final String deviceOwnerPackage;
    public final boolean isManagedDevice;
    public final ConcurrentHashMap<String, Boolean> loggedDecisions;
    public final ConcurrentHashMap<String, Boolean> mdmInstalledCache;

    public WorkAppNotificationFilter(Context context) {
        C7384Etj.A0Y(context, 0);
        Context contextA0I = AnonymousClass001.A0I(context);
        this.appContext = contextA0I;
        WorkDeviceDetector workDeviceDetector = WorkDeviceDetector.INSTANCE;
        String strDeviceOwnerPackage = workDeviceDetector.deviceOwnerPackage(contextA0I);
        this.deviceOwnerPackage = strDeviceOwnerPackage;
        boolean zA1X = AnonymousClass002.A1X(strDeviceOwnerPackage);
        this.isManagedDevice = zA1X;
        this.mdmInstalledCache = C60O.A1C();
        this.loggedDecisions = C60O.A1C();
        boolean zHasWorkProfile = workDeviceDetector.hasWorkProfile(contextA0I);
        StringBuilder sbA0x = C3cI.A0x("init: deviceOwner=", strDeviceOwnerPackage);
        sbA0x.append(" managedDevice=");
        sbA0x.append(zA1X);
        CFK.A05(WorkAppNotificationFilterKt.TAG, C60P.A1P(" workProfile=", sbA0x, zHasWorkProfile));
    }

    @Override // com.facebook.aura.commands.notifications.NotificationFilter
    public boolean shouldBlock(StatusBarNotification statusBarNotification) {
        C7384Etj.A0Y(statusBarNotification, 0);
        String packageName = statusBarNotification.getPackageName();
        C7384Etj.A0U(packageName);
        return shouldBlock(packageName, WorkDeviceDetector.INSTANCE.isManagedProfileUser(this.appContext, statusBarNotification.getUser()));
    }

    @Override // com.facebook.aura.commands.notifications.NotificationFilter
    public boolean shouldBlockPackage(String str) {
        C7384Etj.A0Y(str, 0);
        return shouldBlock(str, false);
    }

    private final boolean isMdmInstalled(String str) {
        Boolean boolValueOf;
        String str2 = this.deviceOwnerPackage;
        if (str2 == null) {
            return false;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mdmInstalledCache;
        Boolean boolPutIfAbsent = concurrentHashMap.get(str);
        if (boolPutIfAbsent == null && (boolPutIfAbsent = concurrentHashMap.putIfAbsent(str, (boolValueOf = Boolean.valueOf(str2.equals(WorkDeviceDetector.INSTANCE.installerPackageOf(this.appContext, str)))))) == null) {
            boolPutIfAbsent = boolValueOf;
        }
        return AnonymousClass001.A1X(boolPutIfAbsent);
    }

    private final void logDecisionOnce(String str, AuraManagedKey auraManagedKey, boolean z, boolean z2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.loggedDecisions;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (C7384Etj.areEqual(concurrentHashMap.put(str, boolValueOf), boolValueOf)) {
            return;
        }
        String wireKey = auraManagedKey.getWireKey();
        boolean z3 = this.isManagedDevice;
        StringBuilder sbA0x = C3cI.A0x("shouldBlock ", str);
        sbA0x.append(": key=");
        sbA0x.append(wireKey);
        sbA0x.append(" managedDevice=");
        sbA0x.append(z3);
        sbA0x.append(" workProfile=");
        sbA0x.append(z2);
        CFK.A05(WorkAppNotificationFilterKt.TAG, C60P.A1P(JavaProcFileReader.LS_SYMLINK_ARROW, sbA0x, z));
    }

    private final boolean shouldBlock(String str, boolean z) {
        AuraManagedKey auraManagedKey;
        if (!this.isManagedDevice && !z) {
            return false;
        }
        if (WorkAppNotificationFilterKt.GCHAT_PKG.equals(str)) {
            auraManagedKey = AuraManagedKey.BLOCK_GCHAT;
        } else if (WorkAppNotificationFilterKt.MOBILEHOME_PKG.equals(str)) {
            auraManagedKey = AuraManagedKey.BLOCK_MOBILEHOME;
        } else if (WorkAppNotificationFilterKt.WORKPLACE_PKG.equals(str)) {
            auraManagedKey = AuraManagedKey.BLOCK_WORKPLACE;
        } else if (WorkAppNotificationFilterKt.GMAIL_PKG.equals(str)) {
            auraManagedKey = AuraManagedKey.BLOCK_WORK_GMAIL;
        } else if (WorkAppNotificationFilterKt.CALENDAR_PKG.equals(str)) {
            auraManagedKey = AuraManagedKey.BLOCK_WORK_CALENDAR;
        } else if (!AnonymousClass005.A1a(str, WorkAppNotificationFilterKt.META_NEST_PKG_PREFIX) && !isMdmInstalled(str)) {
            auraManagedKey = AuraManagedKey.BLOCK_UNLISTED_WORK_APPS;
        } else {
            auraManagedKey = AuraManagedKey.BLOCK_META_INTERNAL;
        }
        boolean zIsBlocked = WorkNotificationFilterConfig.INSTANCE.isBlocked(this.appContext, auraManagedKey);
        logDecisionOnce(str, auraManagedKey, zIsBlocked, z);
        return zIsBlocked;
    }
}
