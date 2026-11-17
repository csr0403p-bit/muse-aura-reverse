package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DownloadNotStartedReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DownloadNotStartedReason[] $VALUES;
    public static final Companion Companion;
    public static final DownloadNotStartedReason NAVIGATED;
    public static final DownloadNotStartedReason NO_DOWNLOAD;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        DownloadNotStartedReason downloadNotStartedReason = new DownloadNotStartedReason("NAVIGATED", 0);
        NAVIGATED = downloadNotStartedReason;
        DownloadNotStartedReason downloadNotStartedReason2 = new DownloadNotStartedReason("NO_DOWNLOAD", 1);
        NO_DOWNLOAD = downloadNotStartedReason2;
        DownloadNotStartedReason[] downloadNotStartedReasonArr = {downloadNotStartedReason, downloadNotStartedReason2};
        $VALUES = downloadNotStartedReasonArr;
        $ENTRIES = C3cG.A0w(downloadNotStartedReasonArr);
        Companion = new Companion();
    }

    public static Ey9<DownloadNotStartedReason> getEntries() {
        return $ENTRIES;
    }

    public static DownloadNotStartedReason valueOf(String str) {
        return (DownloadNotStartedReason) Enum.valueOf(DownloadNotStartedReason.class, str);
    }

    public static DownloadNotStartedReason[] values() {
        return (DownloadNotStartedReason[]) $VALUES.clone();
    }

    public DownloadNotStartedReason(String str, int i) {
    }
}
