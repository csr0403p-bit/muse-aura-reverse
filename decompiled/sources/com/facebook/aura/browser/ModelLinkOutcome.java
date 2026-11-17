package com.facebook.aura.browser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ModelLinkOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ModelLinkOutcome[] $VALUES;
    public static final ModelLinkOutcome NO_ACTIVITY_FOUND;
    public static final ModelLinkOutcome OPENED_BROWSER;
    public static final ModelLinkOutcome OPENED_DIALER;
    public static final ModelLinkOutcome OPENED_EMAIL;
    public static final ModelLinkOutcome OPENED_MAPS;
    public static final ModelLinkOutcome OPENED_NATIVE_APP;
    public static final ModelLinkOutcome OPENED_SMS;
    public static final ModelLinkOutcome UNSUPPORTED_SCHEME;

    static {
        ModelLinkOutcome modelLinkOutcome = new ModelLinkOutcome("OPENED_NATIVE_APP", 0);
        OPENED_NATIVE_APP = modelLinkOutcome;
        ModelLinkOutcome modelLinkOutcome2 = new ModelLinkOutcome("OPENED_BROWSER", 1);
        OPENED_BROWSER = modelLinkOutcome2;
        ModelLinkOutcome modelLinkOutcome3 = new ModelLinkOutcome("OPENED_EMAIL", 2);
        OPENED_EMAIL = modelLinkOutcome3;
        ModelLinkOutcome modelLinkOutcome4 = new ModelLinkOutcome("OPENED_DIALER", 3);
        OPENED_DIALER = modelLinkOutcome4;
        ModelLinkOutcome modelLinkOutcome5 = new ModelLinkOutcome("OPENED_SMS", 4);
        OPENED_SMS = modelLinkOutcome5;
        ModelLinkOutcome modelLinkOutcome6 = new ModelLinkOutcome("OPENED_MAPS", 5);
        OPENED_MAPS = modelLinkOutcome6;
        ModelLinkOutcome modelLinkOutcome7 = new ModelLinkOutcome("UNSUPPORTED_SCHEME", 6);
        UNSUPPORTED_SCHEME = modelLinkOutcome7;
        ModelLinkOutcome modelLinkOutcome8 = new ModelLinkOutcome("NO_ACTIVITY_FOUND", 7);
        NO_ACTIVITY_FOUND = modelLinkOutcome8;
        ModelLinkOutcome[] modelLinkOutcomeArr = {modelLinkOutcome, modelLinkOutcome2, modelLinkOutcome3, modelLinkOutcome4, modelLinkOutcome5, modelLinkOutcome6, modelLinkOutcome7, modelLinkOutcome8};
        $VALUES = modelLinkOutcomeArr;
        $ENTRIES = C3cG.A0w(modelLinkOutcomeArr);
    }

    public static Ey9<ModelLinkOutcome> getEntries() {
        return $ENTRIES;
    }

    public static ModelLinkOutcome valueOf(String str) {
        return (ModelLinkOutcome) Enum.valueOf(ModelLinkOutcome.class, str);
    }

    public static ModelLinkOutcome[] values() {
        return (ModelLinkOutcome[]) $VALUES.clone();
    }

    public ModelLinkOutcome(String str, int i) {
    }
}
