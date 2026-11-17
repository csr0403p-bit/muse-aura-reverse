package com.facebook.aura.startup.appjob;

import X.C3cG;
import X.C60O;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AppJobId implements AppJobKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AppJobId[] $VALUES;
    public static final AppJobId ABRA_TOKEN_EXCHANGE;
    public static final AppJobId AGENTIC_RUNTIME;
    public static final AppJobId ALARM_REREGISTER;
    public static final AppJobId ANALYTICS_IDENTITY;
    public static final AppJobId ANALYTICS_MODE_STATE;
    public static final AppJobId APP_LOCK_STATE;
    public static final AppJobId APP_UPDATE_CHECK;
    public static final AppJobId BACKGROUND_REFRESH_USER_DATA;
    public static final AppJobId BATTERY_METRICS;
    public static final AppJobId CAR_APP_SETUP;
    public static final AppJobId CHAT_THEMES_FETCH;
    public static final AppJobId CHECKPOINT_STATUS_PROBE;
    public static final AppJobId CLEANUP_UPLOADS_CACHE;
    public static final AppJobId CONNECTIONS_TAB;
    public static final AppJobId CONVERSATION_PREFETCH;
    public static final AppJobId CRASH_MANAGER_LATE;
    public static final AppJobId DEFERRED_DEEPLINK_SUBMISSION;
    public static final AppJobId DEVX_AGENT;
    public static final AppJobId DUMPAPP;
    public static final AppJobId FAMILY_DEVICE_ID_SYNC;
    public static final AppJobId FETCH_MOBILE_CONFIGS;
    public static final AppJobId FETCH_PERMISSION_DEFAULTS;
    public static final AppJobId FETCH_SESSIONLESS_MOBILE_CONFIGS;
    public static final AppJobId FETCH_USER_DATA;
    public static final AppJobId FETCH_VMS;
    public static final AppJobId FIRST_RUN_STATE;
    public static final AppJobId FLIPPER;
    public static final AppJobId FRESCO;
    public static final AppJobId GATEWAY_CONNECT;
    public static final AppJobId GEOFENCE_REREGISTER;
    public static final AppJobId GRADUATION_FETCH;
    public static final AppJobId HEALTH_SYNC;
    public static final AppJobId HOME_SCREEN_WIDGETS_SETUP;
    public static final AppJobId INVITE_BADGE_FETCH;
    public static final AppJobId INVITE_CODE_SILENT_REDEEM;
    public static final AppJobId IN_APP_REVIEW_DAY_COUNT;
    public static final AppJobId NATIVE_LOGIN_PREFETCH;
    public static final AppJobId NETWORK_MONITOR;
    public static final AppJobId NON_BLOCKING_ONBOARDING;
    public static final AppJobId PAID_ADS_ATTRIBUTION;
    public static final AppJobId PREFETCH_ONBOARDING_ASSETS;
    public static final AppJobId PRELOADS_FPP_REPORT;
    public static final AppJobId PRELOADS_TOS_ACCEPT;
    public static final AppJobId PRIMARY_SESSION_FETCH;
    public static final AppJobId PROACTIVE_SYNC_CATCH_UP;
    public static final AppJobId PROCESS_TEXT_SETUP;
    public static final AppJobId PUSH_TOKEN_REGISTRATION;
    public static final AppJobId QPL;
    public static final AppJobId QPL_STARTUP_COMPLETE;
    public static final AppJobId REFRESH_TOKEN_MIGRATION;
    public static final AppJobId REMINDER_REREGISTER;
    public static final AppJobId RUN_IN_BACKGROUND_SERVICE;
    public static final AppJobId SESSION_INIT;
    public static final AppJobId SHARE_RECIPIENTS_PREFETCH;
    public static final AppJobId SURVEY_CHECK;
    public static final AppJobId TAB_PREFETCH_COORDINATOR;
    public static final AppJobId TRAFFIC_NTS;
    public static final AppJobId VIDEO_STACK_PREWARM;
    public static final AppJobId WAKE_VM;
    public static final AppJobId WATCH_SESSION_SYNC;

    static {
        AppJobId appJobIdA0B = C60O.A0B("FRESCO", 0);
        FRESCO = appJobIdA0B;
        AppJobId appJobIdA0B2 = C60O.A0B("FLIPPER", 1);
        FLIPPER = appJobIdA0B2;
        AppJobId appJobIdA0B3 = C60O.A0B("FETCH_MOBILE_CONFIGS", 2);
        FETCH_MOBILE_CONFIGS = appJobIdA0B3;
        AppJobId appJobIdA0B4 = C60O.A0B("SESSION_INIT", 3);
        SESSION_INIT = appJobIdA0B4;
        AppJobId appJobIdA0B5 = C60O.A0B("CRASH_MANAGER_LATE", 4);
        CRASH_MANAGER_LATE = appJobIdA0B5;
        AppJobId appJobIdA0B6 = C60O.A0B("QPL", 5);
        QPL = appJobIdA0B6;
        AppJobId appJobIdA0B7 = C60O.A0B("QPL_STARTUP_COMPLETE", 6);
        QPL_STARTUP_COMPLETE = appJobIdA0B7;
        AppJobId appJobIdA0B8 = C60O.A0B("PUSH_TOKEN_REGISTRATION", 7);
        PUSH_TOKEN_REGISTRATION = appJobIdA0B8;
        AppJobId appJobIdA0B9 = C60O.A0B("APP_UPDATE_CHECK", 8);
        APP_UPDATE_CHECK = appJobIdA0B9;
        AppJobId appJobIdA0B10 = C60O.A0B("ABRA_TOKEN_EXCHANGE", 9);
        ABRA_TOKEN_EXCHANGE = appJobIdA0B10;
        AppJobId appJobIdA0B11 = C60O.A0B("FETCH_USER_DATA", 10);
        FETCH_USER_DATA = appJobIdA0B11;
        AppJobId appJobIdA0B12 = C60O.A0B("BACKGROUND_REFRESH_USER_DATA", 11);
        BACKGROUND_REFRESH_USER_DATA = appJobIdA0B12;
        AppJobId appJobIdA0B13 = C60O.A0B("ANALYTICS_IDENTITY", 12);
        ANALYTICS_IDENTITY = appJobIdA0B13;
        AppJobId appJobIdA0B14 = C60O.A0B("ANALYTICS_MODE_STATE", 13);
        ANALYTICS_MODE_STATE = appJobIdA0B14;
        AppJobId appJobIdA0B15 = C60O.A0B("PROCESS_TEXT_SETUP", 14);
        PROCESS_TEXT_SETUP = appJobIdA0B15;
        AppJobId appJobIdA0B16 = C60O.A0B("FETCH_SESSIONLESS_MOBILE_CONFIGS", 15);
        FETCH_SESSIONLESS_MOBILE_CONFIGS = appJobIdA0B16;
        AppJobId appJobIdA0B17 = C60O.A0B("APP_LOCK_STATE", 16);
        APP_LOCK_STATE = appJobIdA0B17;
        AppJobId appJobIdA0B18 = C60O.A0B("PREFETCH_ONBOARDING_ASSETS", 17);
        PREFETCH_ONBOARDING_ASSETS = appJobIdA0B18;
        AppJobId appJobIdA0B19 = C60O.A0B("GEOFENCE_REREGISTER", 18);
        GEOFENCE_REREGISTER = appJobIdA0B19;
        AppJobId appJobIdA0B20 = C60O.A0B("FETCH_VMS", 19);
        FETCH_VMS = appJobIdA0B20;
        AppJobId appJobIdA0B21 = C60O.A0B("AGENTIC_RUNTIME", 20);
        AGENTIC_RUNTIME = appJobIdA0B21;
        AppJobId appJobIdA0B22 = C60O.A0B("WAKE_VM", 21);
        WAKE_VM = appJobIdA0B22;
        AppJobId appJobIdA0B23 = C60O.A0B("GATEWAY_CONNECT", 22);
        GATEWAY_CONNECT = appJobIdA0B23;
        AppJobId appJobIdA0B24 = C60O.A0B("CHAT_THEMES_FETCH", 23);
        CHAT_THEMES_FETCH = appJobIdA0B24;
        AppJobId appJobIdA0B25 = C60O.A0B("FETCH_PERMISSION_DEFAULTS", 24);
        FETCH_PERMISSION_DEFAULTS = appJobIdA0B25;
        AppJobId appJobIdA0B26 = C60O.A0B("CONVERSATION_PREFETCH", 25);
        CONVERSATION_PREFETCH = appJobIdA0B26;
        AppJobId appJobIdA0B27 = C60O.A0B("TAB_PREFETCH_COORDINATOR", 26);
        TAB_PREFETCH_COORDINATOR = appJobIdA0B27;
        AppJobId appJobIdA0B28 = C60O.A0B("NON_BLOCKING_ONBOARDING", 27);
        NON_BLOCKING_ONBOARDING = appJobIdA0B28;
        AppJobId appJobIdA0B29 = C60O.A0B("NETWORK_MONITOR", 28);
        NETWORK_MONITOR = appJobIdA0B29;
        AppJobId appJobIdA0B30 = C60O.A0B("CLEANUP_UPLOADS_CACHE", 29);
        CLEANUP_UPLOADS_CACHE = appJobIdA0B30;
        AppJobId appJobIdA0B31 = C60O.A0B("REMINDER_REREGISTER", 30);
        REMINDER_REREGISTER = appJobIdA0B31;
        AppJobId appJobIdA0B32 = C60O.A0B("ALARM_REREGISTER", 31);
        ALARM_REREGISTER = appJobIdA0B32;
        AppJobId appJobIdA0B33 = C60O.A0B("PROACTIVE_SYNC_CATCH_UP", 32);
        PROACTIVE_SYNC_CATCH_UP = appJobIdA0B33;
        AppJobId appJobIdA0B34 = C60O.A0B("RUN_IN_BACKGROUND_SERVICE", 33);
        RUN_IN_BACKGROUND_SERVICE = appJobIdA0B34;
        AppJobId appJobIdA0B35 = C60O.A0B("PRIMARY_SESSION_FETCH", 34);
        PRIMARY_SESSION_FETCH = appJobIdA0B35;
        AppJobId appJobIdA0B36 = C60O.A0B("BATTERY_METRICS", 35);
        BATTERY_METRICS = appJobIdA0B36;
        AppJobId appJobIdA0B37 = C60O.A0B("TRAFFIC_NTS", 36);
        TRAFFIC_NTS = appJobIdA0B37;
        AppJobId appJobIdA0B38 = C60O.A0B("SURVEY_CHECK", 37);
        SURVEY_CHECK = appJobIdA0B38;
        AppJobId appJobIdA0B39 = C60O.A0B("HEALTH_SYNC", 38);
        HEALTH_SYNC = appJobIdA0B39;
        AppJobId appJobIdA0B40 = C60O.A0B("SHARE_RECIPIENTS_PREFETCH", 39);
        SHARE_RECIPIENTS_PREFETCH = appJobIdA0B40;
        AppJobId appJobIdA0B41 = C60O.A0B("NATIVE_LOGIN_PREFETCH", 40);
        NATIVE_LOGIN_PREFETCH = appJobIdA0B41;
        AppJobId appJobIdA0B42 = C60O.A0B("PAID_ADS_ATTRIBUTION", 41);
        PAID_ADS_ATTRIBUTION = appJobIdA0B42;
        AppJobId appJobIdA0B43 = C60O.A0B("PRELOADS_FPP_REPORT", 42);
        PRELOADS_FPP_REPORT = appJobIdA0B43;
        AppJobId appJobIdA0B44 = C60O.A0B("PRELOADS_TOS_ACCEPT", 43);
        PRELOADS_TOS_ACCEPT = appJobIdA0B44;
        AppJobId appJobIdA0B45 = C60O.A0B("DEFERRED_DEEPLINK_SUBMISSION", 44);
        DEFERRED_DEEPLINK_SUBMISSION = appJobIdA0B45;
        AppJobId appJobIdA0B46 = C60O.A0B("FAMILY_DEVICE_ID_SYNC", 45);
        FAMILY_DEVICE_ID_SYNC = appJobIdA0B46;
        AppJobId appJobIdA0B47 = C60O.A0B("DEVX_AGENT", 46);
        DEVX_AGENT = appJobIdA0B47;
        AppJobId appJobIdA0B48 = C60O.A0B("DUMPAPP", 47);
        DUMPAPP = appJobIdA0B48;
        AppJobId appJobIdA0B49 = C60O.A0B("INVITE_BADGE_FETCH", 48);
        INVITE_BADGE_FETCH = appJobIdA0B49;
        AppJobId appJobIdA0B50 = C60O.A0B("CHECKPOINT_STATUS_PROBE", 49);
        CHECKPOINT_STATUS_PROBE = appJobIdA0B50;
        AppJobId appJobIdA0B51 = C60O.A0B("GRADUATION_FETCH", 50);
        GRADUATION_FETCH = appJobIdA0B51;
        AppJobId appJobIdA0B52 = C60O.A0B("IN_APP_REVIEW_DAY_COUNT", 51);
        IN_APP_REVIEW_DAY_COUNT = appJobIdA0B52;
        AppJobId appJobIdA0B53 = C60O.A0B("FIRST_RUN_STATE", 52);
        FIRST_RUN_STATE = appJobIdA0B53;
        AppJobId appJobIdA0B54 = C60O.A0B("VIDEO_STACK_PREWARM", 53);
        VIDEO_STACK_PREWARM = appJobIdA0B54;
        AppJobId appJobIdA0B55 = C60O.A0B("INVITE_CODE_SILENT_REDEEM", 54);
        INVITE_CODE_SILENT_REDEEM = appJobIdA0B55;
        AppJobId appJobIdA0B56 = C60O.A0B("WATCH_SESSION_SYNC", 55);
        WATCH_SESSION_SYNC = appJobIdA0B56;
        AppJobId appJobIdA0B57 = C60O.A0B("CAR_APP_SETUP", 56);
        CAR_APP_SETUP = appJobIdA0B57;
        AppJobId appJobIdA0B58 = C60O.A0B("CONNECTIONS_TAB", 57);
        CONNECTIONS_TAB = appJobIdA0B58;
        AppJobId appJobIdA0B59 = C60O.A0B("REFRESH_TOKEN_MIGRATION", 58);
        REFRESH_TOKEN_MIGRATION = appJobIdA0B59;
        AppJobId appJobIdA0B60 = C60O.A0B("HOME_SCREEN_WIDGETS_SETUP", 59);
        HOME_SCREEN_WIDGETS_SETUP = appJobIdA0B60;
        AppJobId[] appJobIdArr = new AppJobId[60];
        System.arraycopy(new AppJobId[]{appJobIdA0B, appJobIdA0B2, appJobIdA0B3, appJobIdA0B4, appJobIdA0B5, appJobIdA0B6, appJobIdA0B7, appJobIdA0B8, appJobIdA0B9, appJobIdA0B10, appJobIdA0B11, appJobIdA0B12, appJobIdA0B13, appJobIdA0B14, appJobIdA0B15, appJobIdA0B16, appJobIdA0B17, appJobIdA0B18, appJobIdA0B19, appJobIdA0B20, appJobIdA0B21, appJobIdA0B22, appJobIdA0B23, appJobIdA0B24, appJobIdA0B25, appJobIdA0B26, appJobIdA0B27}, 0, appJobIdArr, 0, 27);
        System.arraycopy(new AppJobId[]{appJobIdA0B28, appJobIdA0B29, appJobIdA0B30, appJobIdA0B31, appJobIdA0B32, appJobIdA0B33, appJobIdA0B34, appJobIdA0B35, appJobIdA0B36, appJobIdA0B37, appJobIdA0B38, appJobIdA0B39, appJobIdA0B40, appJobIdA0B41, appJobIdA0B42, appJobIdA0B43, appJobIdA0B44, appJobIdA0B45, appJobIdA0B46, appJobIdA0B47, appJobIdA0B48, appJobIdA0B49, appJobIdA0B50, appJobIdA0B51, appJobIdA0B52, appJobIdA0B53, appJobIdA0B54}, 0, appJobIdArr, 27, 27);
        System.arraycopy(new AppJobId[]{appJobIdA0B55, appJobIdA0B56, appJobIdA0B57, appJobIdA0B58, appJobIdA0B59, appJobIdA0B60}, 0, appJobIdArr, 54, 6);
        $VALUES = appJobIdArr;
        $ENTRIES = C3cG.A0w(appJobIdArr);
    }

    public static Ey9<AppJobId> getEntries() {
        return $ENTRIES;
    }

    public static AppJobId valueOf(String str) {
        return (AppJobId) Enum.valueOf(AppJobId.class, str);
    }

    public static AppJobId[] values() {
        return (AppJobId[]) $VALUES.clone();
    }

    public AppJobId(String str, int i) {
    }

    @Override // com.facebook.aura.startup.appjob.AppJobKey
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
