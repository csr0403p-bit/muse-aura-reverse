package com.facebook.aura.status.viewmodel;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchToolName {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchToolName[] $VALUES;
    public static final HatchToolName BROWSER;
    public static final Companion Companion;
    public static final HatchToolName EMAIL;
    public static final HatchToolName EXEC;
    public static final HatchToolName MESSAGE;
    public static final HatchToolName READ;
    public static final HatchToolName WEB_FETCH;
    public static final HatchToolName WEB_SEARCH;
    public static final HatchToolName WRITE;
    public static final Map<String, HatchToolName> byToolId;
    public final int displayNameRes;
    public final String toolId;

    public final class Companion {
        public final Integer displayNameRes(String str) {
            int displayNameRes;
            if (str == null) {
                displayNameRes = R.string._name_removed__res_0x7f121075;
            } else {
                HatchToolName hatchToolName = (HatchToolName) HatchToolName.byToolId.get(str);
                if (hatchToolName == null) {
                    return null;
                }
                displayNameRes = hatchToolName.getDisplayNameRes();
            }
            return Integer.valueOf(displayNameRes);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchToolName hatchToolName = new HatchToolName("EXEC", 0, "exec", R.string._name_removed__res_0x7f121112);
        EXEC = hatchToolName;
        HatchToolName hatchToolName2 = new HatchToolName("READ", 1, BrowserOperationCatalogKt.READ, R.string._name_removed__res_0x7f121111);
        READ = hatchToolName2;
        HatchToolName hatchToolName3 = new HatchToolName("WRITE", 2, "write", R.string._name_removed__res_0x7f121117);
        WRITE = hatchToolName3;
        HatchToolName hatchToolName4 = new HatchToolName("WEB_SEARCH", 3, "web_search", R.string._name_removed__res_0x7f121113);
        WEB_SEARCH = hatchToolName4;
        HatchToolName hatchToolName5 = new HatchToolName("WEB_FETCH", 4, "web_fetch", R.string._name_removed__res_0x7f121110);
        WEB_FETCH = hatchToolName5;
        HatchToolName hatchToolName6 = new HatchToolName("BROWSER", 5, "browser", R.string._name_removed__res_0x7f121116);
        BROWSER = hatchToolName6;
        HatchToolName hatchToolName7 = new HatchToolName("MESSAGE", 6, ReplyAttributionSerializer.TYPE_MESSAGE, R.string._name_removed__res_0x7f121115);
        MESSAGE = hatchToolName7;
        HatchToolName hatchToolName8 = new HatchToolName("EMAIL", 7, "email", R.string._name_removed__res_0x7f121114);
        EMAIL = hatchToolName8;
        HatchToolName[] hatchToolNameArr = {hatchToolName, hatchToolName2, hatchToolName3, hatchToolName4, hatchToolName5, hatchToolName6, hatchToolName7, hatchToolName8};
        $VALUES = hatchToolNameArr;
        $ENTRIES = C3cG.A0w(hatchToolNameArr);
        Companion = new Companion();
        Ey9<HatchToolName> entries = getEntries();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(entries));
        for (HatchToolName hatchToolName9 : entries) {
            linkedHashMapA15.put(hatchToolName9.toolId, hatchToolName9);
        }
        byToolId = linkedHashMapA15;
    }

    public static Ey9<HatchToolName> getEntries() {
        return $ENTRIES;
    }

    public static HatchToolName valueOf(String str) {
        return (HatchToolName) Enum.valueOf(HatchToolName.class, str);
    }

    public static HatchToolName[] values() {
        return (HatchToolName[]) $VALUES.clone();
    }

    public final int getDisplayNameRes() {
        return this.displayNameRes;
    }

    public final String getToolId() {
        return this.toolId;
    }

    public HatchToolName(String str, int i, String str2, int i2) {
        this.toolId = str2;
        this.displayNameRes = i2;
    }
}
