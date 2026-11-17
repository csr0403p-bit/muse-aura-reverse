package com.facebook.aura.ui.adaptive;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraPageHost {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraPageHost[] $VALUES;
    public static final AuraPageHost ModalFlowChild;
    public static final AuraPageHost ModalFlowRoot;
    public static final AuraPageHost Window;

    static {
        AuraPageHost auraPageHost = new AuraPageHost("Window", 0);
        Window = auraPageHost;
        AuraPageHost auraPageHost2 = new AuraPageHost("ModalFlowRoot", 1);
        ModalFlowRoot = auraPageHost2;
        AuraPageHost auraPageHost3 = new AuraPageHost("ModalFlowChild", 2);
        ModalFlowChild = auraPageHost3;
        AuraPageHost[] auraPageHostArr = {auraPageHost, auraPageHost2, auraPageHost3};
        $VALUES = auraPageHostArr;
        $ENTRIES = new F3w(auraPageHostArr);
    }

    public static Ey9<AuraPageHost> getEntries() {
        return $ENTRIES;
    }

    public static AuraPageHost valueOf(String str) {
        return (AuraPageHost) Enum.valueOf(AuraPageHost.class, str);
    }

    public static AuraPageHost[] values() {
        return (AuraPageHost[]) $VALUES.clone();
    }

    public AuraPageHost(String str, int i) {
    }
}
