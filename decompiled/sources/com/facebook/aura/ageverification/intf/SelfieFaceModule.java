package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SelfieFaceModule {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SelfieFaceModule[] $VALUES;
    public static final SelfieFaceModule DOWNLOADED;
    public static final SelfieFaceModule INSTALLED;

    static {
        SelfieFaceModule selfieFaceModule = new SelfieFaceModule("INSTALLED", 0);
        INSTALLED = selfieFaceModule;
        SelfieFaceModule selfieFaceModule2 = new SelfieFaceModule("DOWNLOADED", 1);
        DOWNLOADED = selfieFaceModule2;
        SelfieFaceModule[] selfieFaceModuleArr = {selfieFaceModule, selfieFaceModule2};
        $VALUES = selfieFaceModuleArr;
        $ENTRIES = C3cG.A0w(selfieFaceModuleArr);
    }

    public static Ey9<SelfieFaceModule> getEntries() {
        return $ENTRIES;
    }

    public static SelfieFaceModule valueOf(String str) {
        return (SelfieFaceModule) Enum.valueOf(SelfieFaceModule.class, str);
    }

    public static SelfieFaceModule[] values() {
        return (SelfieFaceModule[]) $VALUES.clone();
    }

    public SelfieFaceModule(String str, int i) {
    }
}
