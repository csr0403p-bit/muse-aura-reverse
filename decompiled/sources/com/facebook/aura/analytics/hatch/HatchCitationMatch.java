package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchCitationMatch {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCitationMatch[] $VALUES;
    public static final HatchCitationMatch NONE;
    public static final HatchCitationMatch RESOURCE;
    public final String value;

    static {
        HatchCitationMatch hatchCitationMatch = new HatchCitationMatch("RESOURCE", 0, "resource");
        RESOURCE = hatchCitationMatch;
        HatchCitationMatch hatchCitationMatch2 = new HatchCitationMatch(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 1, "none");
        NONE = hatchCitationMatch2;
        HatchCitationMatch[] hatchCitationMatchArr = {hatchCitationMatch, hatchCitationMatch2};
        $VALUES = hatchCitationMatchArr;
        $ENTRIES = new F3w(hatchCitationMatchArr);
    }

    public static Ey9<HatchCitationMatch> getEntries() {
        return $ENTRIES;
    }

    public static HatchCitationMatch valueOf(String str) {
        return (HatchCitationMatch) Enum.valueOf(HatchCitationMatch.class, str);
    }

    public static HatchCitationMatch[] values() {
        return (HatchCitationMatch[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCitationMatch(String str, int i, String str2) {
        this.value = str2;
    }
}
