package com.facebook.aura.vmbrowser.runtime;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserDeviceClipboardAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserDeviceClipboardAction[] $VALUES;
    public static final BrowserDeviceClipboardAction COPY;
    public static final BrowserDeviceClipboardAction PASTE;

    static {
        BrowserDeviceClipboardAction browserDeviceClipboardAction = new BrowserDeviceClipboardAction("COPY", 0);
        COPY = browserDeviceClipboardAction;
        BrowserDeviceClipboardAction browserDeviceClipboardAction2 = new BrowserDeviceClipboardAction("PASTE", 1);
        PASTE = browserDeviceClipboardAction2;
        BrowserDeviceClipboardAction[] browserDeviceClipboardActionArr = {browserDeviceClipboardAction, browserDeviceClipboardAction2};
        $VALUES = browserDeviceClipboardActionArr;
        $ENTRIES = C3cG.A0w(browserDeviceClipboardActionArr);
    }

    public static Ey9<BrowserDeviceClipboardAction> getEntries() {
        return $ENTRIES;
    }

    public static BrowserDeviceClipboardAction valueOf(String str) {
        return (BrowserDeviceClipboardAction) Enum.valueOf(BrowserDeviceClipboardAction.class, str);
    }

    public static BrowserDeviceClipboardAction[] values() {
        return (BrowserDeviceClipboardAction[]) $VALUES.clone();
    }

    public BrowserDeviceClipboardAction(String str, int i) {
    }
}
