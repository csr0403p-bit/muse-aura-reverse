package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HostCapability {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HostCapability[] $VALUES;
    public static final Companion Companion;
    public static final HostCapability DOWNLOADS;
    public static final HostCapability FILES;
    public static final HostCapability PDF;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        HostCapability hostCapability = new HostCapability("PDF", 0);
        PDF = hostCapability;
        HostCapability hostCapability2 = new HostCapability("FILES", 1);
        FILES = hostCapability2;
        HostCapability hostCapability3 = new HostCapability("DOWNLOADS", 2);
        DOWNLOADS = hostCapability3;
        HostCapability[] hostCapabilityArr = {hostCapability, hostCapability2, hostCapability3};
        $VALUES = hostCapabilityArr;
        $ENTRIES = C3cG.A0w(hostCapabilityArr);
        Companion = new Companion();
    }

    public static Ey9<HostCapability> getEntries() {
        return $ENTRIES;
    }

    public static HostCapability valueOf(String str) {
        return (HostCapability) Enum.valueOf(HostCapability.class, str);
    }

    public static HostCapability[] values() {
        return (HostCapability[]) $VALUES.clone();
    }

    public HostCapability(String str, int i) {
    }
}
