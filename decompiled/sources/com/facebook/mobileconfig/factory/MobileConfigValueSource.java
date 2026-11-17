package com.facebook.mobileconfig.factory;

import X.BV4;
import X.CFK;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MobileConfigValueSource {
    public static final /* synthetic */ MobileConfigValueSource[] $VALUES;
    public static final MobileConfigValueSource DEFAULT__ACCESSED_AFTER_MC_DISPOSE;
    public static final MobileConfigValueSource DEFAULT__ACCESSED_BEFORE_MC_INIT;
    public static final MobileConfigValueSource DEFAULT__FROM_FALLBACK_CLIENT;
    public static final MobileConfigValueSource DEFAULT__FROM_SILENT_PUSH_FALLBACK;
    public static final MobileConfigValueSource DEFAULT__INVALID_CONFIG_INDEX;
    public static final MobileConfigValueSource DEFAULT__INVALID_CONFIG_PARAM_NAME;
    public static final MobileConfigValueSource DEFAULT__MISMATCH_PARAM_TYPE;
    public static final MobileConfigValueSource DEFAULT__MISMATCH_STABLE_ID;
    public static final MobileConfigValueSource DEFAULT__MISMATCH_UNIT_TYPE;
    public static final MobileConfigValueSource DEFAULT__MISMATCH_UNIVERSE_TYPE;
    public static final MobileConfigValueSource DEFAULT__MISSING_SERVER_VALUE;
    public static final MobileConfigValueSource DEFAULT__MISSING_SERVER_VALUE_INVALID_SLOT_ID;
    public static final MobileConfigValueSource DEFAULT__MISSING_SERVER_VALUE_INVALID_TYPE;
    public static final MobileConfigValueSource DEFAULT__NO_DATA_ON_DISK;
    public static final MobileConfigValueSource DEFAULT__RN_INVALID_SPECIFIER_METAMAP_COMPLETE;
    public static final MobileConfigValueSource DEFAULT__RN_INVALID_SPECIFIER_METAMAP_INCOMPLETE;
    public static final MobileConfigValueSource DEFAULT__RN_INVALID_SPECIFIER_MISSING_IN_RNMAP;
    public static final MobileConfigValueSource DEFAULT__RN_INVALID_SPECIFIER_SCHEMAHASH_MISMATCH;
    public static final MobileConfigValueSource DEFAULT__RN_INVALID_STABLE_SPECIFIER;
    public static final MobileConfigValueSource DEFAULT__SERVER_RETURNED_NULL;
    public static final MobileConfigValueSource DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID;
    public static final MobileConfigValueSource DEFAULT__SERVICE_NOT_FOUND;
    public static final MobileConfigValueSource INVALID_SPECIFIER_MISSING_IN_WA_LOOKUP_MAP;
    public static final MobileConfigValueSource MCS_CLIENT_OVERRIDE;
    public static final MobileConfigValueSource MCS_FORCE_DEFAULT;
    public static final MobileConfigValueSource OVERRIDE;
    public static final MobileConfigValueSource SERVER;
    public static final MobileConfigValueSource SILENT_PUSH_VALUE;
    public static final String TAG = "MobileConfigValueSource";
    public static final MobileConfigValueSource UNKNOWN;
    public static final Map<Integer, MobileConfigValueSource> intToSource;
    public int source;

    static {
        MobileConfigValueSource mobileConfigValueSource = new MobileConfigValueSource("UNKNOWN", 0, -1);
        UNKNOWN = mobileConfigValueSource;
        MobileConfigValueSource mobileConfigValueSource2 = new MobileConfigValueSource("SERVER", 1, 0);
        SERVER = mobileConfigValueSource2;
        MobileConfigValueSource mobileConfigValueSource3 = new MobileConfigValueSource("OVERRIDE", 2, 1);
        OVERRIDE = mobileConfigValueSource3;
        MobileConfigValueSource mobileConfigValueSource4 = new MobileConfigValueSource("DEFAULT__SERVER_RETURNED_NULL", 3, 2);
        DEFAULT__SERVER_RETURNED_NULL = mobileConfigValueSource4;
        MobileConfigValueSource mobileConfigValueSource5 = new MobileConfigValueSource("DEFAULT__ACCESSED_BEFORE_MC_INIT", 4, 3);
        DEFAULT__ACCESSED_BEFORE_MC_INIT = mobileConfigValueSource5;
        MobileConfigValueSource mobileConfigValueSource6 = new MobileConfigValueSource("DEFAULT__NO_DATA_ON_DISK", 5, 4);
        DEFAULT__NO_DATA_ON_DISK = mobileConfigValueSource6;
        MobileConfigValueSource mobileConfigValueSource7 = new MobileConfigValueSource("DEFAULT__ACCESSED_AFTER_MC_DISPOSE", 6, 5);
        DEFAULT__ACCESSED_AFTER_MC_DISPOSE = mobileConfigValueSource7;
        MobileConfigValueSource mobileConfigValueSource8 = new MobileConfigValueSource("DEFAULT__MISSING_SERVER_VALUE", 7, 6);
        DEFAULT__MISSING_SERVER_VALUE = mobileConfigValueSource8;
        MobileConfigValueSource mobileConfigValueSource9 = new MobileConfigValueSource("DEFAULT__INVALID_CONFIG_PARAM_NAME", 8, 7);
        DEFAULT__INVALID_CONFIG_PARAM_NAME = mobileConfigValueSource9;
        MobileConfigValueSource mobileConfigValueSource10 = new MobileConfigValueSource("DEFAULT__SERVICE_NOT_FOUND", 9, 8);
        DEFAULT__SERVICE_NOT_FOUND = mobileConfigValueSource10;
        MobileConfigValueSource mobileConfigValueSource11 = new MobileConfigValueSource("MCS_CLIENT_OVERRIDE", 10, 9);
        MCS_CLIENT_OVERRIDE = mobileConfigValueSource11;
        MobileConfigValueSource mobileConfigValueSource12 = new MobileConfigValueSource("DEFAULT__MISMATCH_UNIT_TYPE", 11, 10);
        DEFAULT__MISMATCH_UNIT_TYPE = mobileConfigValueSource12;
        MobileConfigValueSource mobileConfigValueSource13 = new MobileConfigValueSource("DEFAULT__MISMATCH_PARAM_TYPE", 12, 11);
        DEFAULT__MISMATCH_PARAM_TYPE = mobileConfigValueSource13;
        MobileConfigValueSource mobileConfigValueSource14 = new MobileConfigValueSource("DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID", 13, 12);
        DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID = mobileConfigValueSource14;
        MobileConfigValueSource mobileConfigValueSource15 = new MobileConfigValueSource("DEFAULT__MISMATCH_UNIVERSE_TYPE", 14, 13);
        DEFAULT__MISMATCH_UNIVERSE_TYPE = mobileConfigValueSource15;
        MobileConfigValueSource mobileConfigValueSource16 = new MobileConfigValueSource("DEFAULT__MISMATCH_STABLE_ID", 15, 14);
        DEFAULT__MISMATCH_STABLE_ID = mobileConfigValueSource16;
        MobileConfigValueSource mobileConfigValueSource17 = new MobileConfigValueSource("DEFAULT__RN_INVALID_SPECIFIER_METAMAP_INCOMPLETE", 16, 15);
        DEFAULT__RN_INVALID_SPECIFIER_METAMAP_INCOMPLETE = mobileConfigValueSource17;
        MobileConfigValueSource mobileConfigValueSource18 = new MobileConfigValueSource("DEFAULT__RN_INVALID_SPECIFIER_METAMAP_COMPLETE", 17, 16);
        DEFAULT__RN_INVALID_SPECIFIER_METAMAP_COMPLETE = mobileConfigValueSource18;
        MobileConfigValueSource mobileConfigValueSource19 = new MobileConfigValueSource("DEFAULT__RN_INVALID_SPECIFIER_SCHEMAHASH_MISMATCH", 18, 17);
        DEFAULT__RN_INVALID_SPECIFIER_SCHEMAHASH_MISMATCH = mobileConfigValueSource19;
        MobileConfigValueSource mobileConfigValueSource20 = new MobileConfigValueSource("DEFAULT__RN_INVALID_SPECIFIER_MISSING_IN_RNMAP", 19, 18);
        DEFAULT__RN_INVALID_SPECIFIER_MISSING_IN_RNMAP = mobileConfigValueSource20;
        MobileConfigValueSource mobileConfigValueSource21 = new MobileConfigValueSource("DEFAULT__FROM_FALLBACK_CLIENT", 20, 19);
        DEFAULT__FROM_FALLBACK_CLIENT = mobileConfigValueSource21;
        MobileConfigValueSource mobileConfigValueSource22 = new MobileConfigValueSource("DEFAULT__RN_INVALID_STABLE_SPECIFIER", 21, 20);
        DEFAULT__RN_INVALID_STABLE_SPECIFIER = mobileConfigValueSource22;
        MobileConfigValueSource mobileConfigValueSource23 = new MobileConfigValueSource("DEFAULT__MISSING_SERVER_VALUE_INVALID_TYPE", 22, 21);
        DEFAULT__MISSING_SERVER_VALUE_INVALID_TYPE = mobileConfigValueSource23;
        MobileConfigValueSource mobileConfigValueSource24 = new MobileConfigValueSource("DEFAULT__MISSING_SERVER_VALUE_INVALID_SLOT_ID", 23, 22);
        DEFAULT__MISSING_SERVER_VALUE_INVALID_SLOT_ID = mobileConfigValueSource24;
        MobileConfigValueSource mobileConfigValueSource25 = new MobileConfigValueSource("INVALID_SPECIFIER_MISSING_IN_WA_LOOKUP_MAP", 24, 23);
        INVALID_SPECIFIER_MISSING_IN_WA_LOOKUP_MAP = mobileConfigValueSource25;
        MobileConfigValueSource mobileConfigValueSource26 = new MobileConfigValueSource("DEFAULT__INVALID_CONFIG_INDEX", 25, 24);
        DEFAULT__INVALID_CONFIG_INDEX = mobileConfigValueSource26;
        MobileConfigValueSource mobileConfigValueSource27 = new MobileConfigValueSource("DEFAULT__FROM_SILENT_PUSH_FALLBACK", 26, 25);
        DEFAULT__FROM_SILENT_PUSH_FALLBACK = mobileConfigValueSource27;
        MobileConfigValueSource mobileConfigValueSource28 = new MobileConfigValueSource("MCS_FORCE_DEFAULT", 27, 26);
        MCS_FORCE_DEFAULT = mobileConfigValueSource28;
        MobileConfigValueSource mobileConfigValueSource29 = new MobileConfigValueSource("SILENT_PUSH_VALUE", 28, 27);
        SILENT_PUSH_VALUE = mobileConfigValueSource29;
        MobileConfigValueSource[] mobileConfigValueSourceArr = new MobileConfigValueSource[29];
        System.arraycopy(new MobileConfigValueSource[]{mobileConfigValueSource, mobileConfigValueSource2, mobileConfigValueSource3, mobileConfigValueSource4, mobileConfigValueSource5, mobileConfigValueSource6, mobileConfigValueSource7, mobileConfigValueSource8, mobileConfigValueSource9, mobileConfigValueSource10, mobileConfigValueSource11, mobileConfigValueSource12, mobileConfigValueSource13, mobileConfigValueSource14, mobileConfigValueSource15, mobileConfigValueSource16, mobileConfigValueSource17, mobileConfigValueSource18, mobileConfigValueSource19, mobileConfigValueSource20, mobileConfigValueSource21, mobileConfigValueSource22, mobileConfigValueSource23, mobileConfigValueSource24, mobileConfigValueSource25, mobileConfigValueSource26, mobileConfigValueSource27}, 0, mobileConfigValueSourceArr, 0, 27);
        System.arraycopy(new MobileConfigValueSource[]{mobileConfigValueSource28, mobileConfigValueSource29}, 0, mobileConfigValueSourceArr, 27, 2);
        $VALUES = mobileConfigValueSourceArr;
        intToSource = buildIntToSourceMap();
    }

    public static MobileConfigValueSource fromInt(int i) {
        Map<Integer, MobileConfigValueSource> map = intToSource;
        Integer numValueOf = Integer.valueOf(i);
        MobileConfigValueSource mobileConfigValueSource = map.get(numValueOf);
        if (mobileConfigValueSource != null) {
            return mobileConfigValueSource;
        }
        CFK.A0F(TAG, "Could not convert source from int '%s'", numValueOf);
        return UNKNOWN;
    }

    public static MobileConfigValueSource valueOf(String str) {
        return (MobileConfigValueSource) Enum.valueOf(MobileConfigValueSource.class, str);
    }

    public static MobileConfigValueSource[] values() {
        return (MobileConfigValueSource[]) $VALUES.clone();
    }

    public int getSource() {
        return this.source;
    }

    public String getSourceAsString() {
        return String.valueOf(this.source);
    }

    public MobileConfigValueSource(String str, int i, int i2) {
        this.source = i2;
    }

    public static Map<Integer, MobileConfigValueSource> buildIntToSourceMap() {
        HashMap mapA0u = BV4.A0u();
        for (MobileConfigValueSource mobileConfigValueSource : values()) {
            mapA0u.put(Integer.valueOf(mobileConfigValueSource.source), mobileConfigValueSource);
        }
        return mapA0u;
    }

    public static MobileConfigValueSource fromStringOfInt(String str) {
        try {
            return fromInt(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            CFK.A0F(TAG, "Invalid integer string '%s'", str);
            return UNKNOWN;
        }
    }
}
