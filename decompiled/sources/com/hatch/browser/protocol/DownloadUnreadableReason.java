package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DownloadUnreadableReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DownloadUnreadableReason[] $VALUES;
    public static final Companion Companion;
    public static final DownloadUnreadableReason DISCARDED;
    public static final DownloadUnreadableReason UNCAPTURED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        DownloadUnreadableReason downloadUnreadableReason = new DownloadUnreadableReason("DISCARDED", 0);
        DISCARDED = downloadUnreadableReason;
        DownloadUnreadableReason downloadUnreadableReason2 = new DownloadUnreadableReason("UNCAPTURED", 1);
        UNCAPTURED = downloadUnreadableReason2;
        DownloadUnreadableReason[] downloadUnreadableReasonArr = {downloadUnreadableReason, downloadUnreadableReason2};
        $VALUES = downloadUnreadableReasonArr;
        $ENTRIES = C3cG.A0w(downloadUnreadableReasonArr);
        Companion = new Companion();
    }

    public static Ey9<DownloadUnreadableReason> getEntries() {
        return $ENTRIES;
    }

    public static DownloadUnreadableReason valueOf(String str) {
        return (DownloadUnreadableReason) Enum.valueOf(DownloadUnreadableReason.class, str);
    }

    public static DownloadUnreadableReason[] values() {
        return (DownloadUnreadableReason[]) $VALUES.clone();
    }

    public DownloadUnreadableReason(String str, int i) {
    }
}
