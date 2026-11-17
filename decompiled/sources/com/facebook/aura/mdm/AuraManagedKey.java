package com.facebook.aura.mdm;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraManagedKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraManagedKey[] $VALUES;
    public static final AuraManagedKey BLOCK_GCHAT;
    public static final AuraManagedKey BLOCK_META_INTERNAL;
    public static final AuraManagedKey BLOCK_MOBILEHOME;
    public static final AuraManagedKey BLOCK_UNLISTED_WORK_APPS;
    public static final AuraManagedKey BLOCK_WORKPLACE;
    public static final AuraManagedKey BLOCK_WORK_CALENDAR;
    public static final AuraManagedKey BLOCK_WORK_GMAIL;
    public static final AuraManagedKey DISABLE_NOTIFICATION_INGESTION;
    public final String wireKey;

    static {
        AuraManagedKey auraManagedKey = new AuraManagedKey("DISABLE_NOTIFICATION_INGESTION", 0, "disable_notification_ingestion");
        DISABLE_NOTIFICATION_INGESTION = auraManagedKey;
        AuraManagedKey auraManagedKey2 = new AuraManagedKey("BLOCK_GCHAT", 1, "block_gchat");
        BLOCK_GCHAT = auraManagedKey2;
        AuraManagedKey auraManagedKey3 = new AuraManagedKey("BLOCK_MOBILEHOME", 2, "block_mobilehome");
        BLOCK_MOBILEHOME = auraManagedKey3;
        AuraManagedKey auraManagedKey4 = new AuraManagedKey("BLOCK_WORKPLACE", 3, "block_workplace");
        BLOCK_WORKPLACE = auraManagedKey4;
        AuraManagedKey auraManagedKey5 = new AuraManagedKey("BLOCK_WORK_GMAIL", 4, "block_work_gmail");
        BLOCK_WORK_GMAIL = auraManagedKey5;
        AuraManagedKey auraManagedKey6 = new AuraManagedKey("BLOCK_WORK_CALENDAR", 5, "block_work_calendar");
        BLOCK_WORK_CALENDAR = auraManagedKey6;
        AuraManagedKey auraManagedKey7 = new AuraManagedKey("BLOCK_META_INTERNAL", 6, "block_meta_internal");
        BLOCK_META_INTERNAL = auraManagedKey7;
        AuraManagedKey auraManagedKey8 = new AuraManagedKey("BLOCK_UNLISTED_WORK_APPS", 7, "block_unlisted_work_apps");
        BLOCK_UNLISTED_WORK_APPS = auraManagedKey8;
        AuraManagedKey[] auraManagedKeyArr = {auraManagedKey, auraManagedKey2, auraManagedKey3, auraManagedKey4, auraManagedKey5, auraManagedKey6, auraManagedKey7, auraManagedKey8};
        $VALUES = auraManagedKeyArr;
        $ENTRIES = C3cG.A0w(auraManagedKeyArr);
    }

    public static Ey9<AuraManagedKey> getEntries() {
        return $ENTRIES;
    }

    public static AuraManagedKey valueOf(String str) {
        return (AuraManagedKey) Enum.valueOf(AuraManagedKey.class, str);
    }

    public static AuraManagedKey[] values() {
        return (AuraManagedKey[]) $VALUES.clone();
    }

    public final String getWireKey() {
        return this.wireKey;
    }

    public AuraManagedKey(String str, int i, String str2) {
        this.wireKey = str2;
    }
}
