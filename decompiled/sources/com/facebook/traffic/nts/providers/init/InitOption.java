package com.facebook.traffic.nts.providers.init;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class InitOption {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InitOption[] $VALUES;
    public static final InitOption APP_INIT;
    public static final InitOption APP_INIT_COMPLETE;
    public static final Companion Companion;
    public static final InitOption DISABLED;
    public static final InitOption ONE_SHOT_TASK;
    public static final InitOption POST_APP_INIT;
    public final String value;

    static {
        InitOption initOption = new InitOption("DISABLED", 0, "Disabled");
        DISABLED = initOption;
        InitOption initOption2 = new InitOption("APP_INIT", 1, "AppInit");
        APP_INIT = initOption2;
        InitOption initOption3 = new InitOption("POST_APP_INIT", 2, "PostAppInit");
        POST_APP_INIT = initOption3;
        InitOption initOption4 = new InitOption("APP_INIT_COMPLETE", 3, "AppInitComplete");
        APP_INIT_COMPLETE = initOption4;
        InitOption initOption5 = new InitOption("ONE_SHOT_TASK", 4, "OneShotTask");
        ONE_SHOT_TASK = initOption5;
        InitOption[] initOptionArr = {initOption, initOption2, initOption3, initOption4, initOption5};
        $VALUES = initOptionArr;
        $ENTRIES = C3cG.A0w(initOptionArr);
        Companion = new Companion();
    }

    public static Ey9<InitOption> getEntries() {
        return $ENTRIES;
    }

    public static InitOption valueOf(String str) {
        return (InitOption) Enum.valueOf(InitOption.class, str);
    }

    public static InitOption[] values() {
        return (InitOption[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final class Companion {
        public final InitOption fromString(String str) {
            InitOption next;
            C7384Etj.A0Y(str, 0);
            Iterator<InitOption> it = InitOption.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getValue())) {
                    break;
                }
            }
            InitOption initOption = next;
            return initOption == null ? InitOption.DISABLED : initOption;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public InitOption(String str, int i, String str2) {
        this.value = str2;
    }
}
