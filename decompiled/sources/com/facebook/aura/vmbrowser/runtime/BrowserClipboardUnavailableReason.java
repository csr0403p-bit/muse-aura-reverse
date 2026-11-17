package com.facebook.aura.vmbrowser.runtime;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserClipboardUnavailableReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserClipboardUnavailableReason[] $VALUES;
    public static final Companion Companion;
    public static final BrowserClipboardUnavailableReason INVALID_TEXT;
    public static final BrowserClipboardUnavailableReason NO_SELECTION;
    public static final BrowserClipboardUnavailableReason TEXT_TOO_LARGE;
    public static final BrowserClipboardUnavailableReason UNSUPPORTED_SELECTION;
    public final BrowserClipboardReasonDetail reasonDetail;

    public final class Companion {
        public final BrowserClipboardUnavailableReason fromWire(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1888088062:
                    if (str.equals("unsupported_selection")) {
                        return BrowserClipboardUnavailableReason.UNSUPPORTED_SELECTION;
                    }
                    return null;
                case -32703490:
                    if (str.equals("text_too_large")) {
                        return BrowserClipboardUnavailableReason.TEXT_TOO_LARGE;
                    }
                    return null;
                case 511179918:
                    if (str.equals("no_selection")) {
                        return BrowserClipboardUnavailableReason.NO_SELECTION;
                    }
                    return null;
                case 527216245:
                    if (str.equals("invalid_text")) {
                        return BrowserClipboardUnavailableReason.INVALID_TEXT;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        BrowserClipboardUnavailableReason browserClipboardUnavailableReason = new BrowserClipboardUnavailableReason("NO_SELECTION", 0, BrowserClipboardReasonDetail.NO_SELECTION);
        NO_SELECTION = browserClipboardUnavailableReason;
        BrowserClipboardUnavailableReason browserClipboardUnavailableReason2 = new BrowserClipboardUnavailableReason("TEXT_TOO_LARGE", 1, BrowserClipboardReasonDetail.TEXT_TOO_LARGE);
        TEXT_TOO_LARGE = browserClipboardUnavailableReason2;
        BrowserClipboardUnavailableReason browserClipboardUnavailableReason3 = new BrowserClipboardUnavailableReason("INVALID_TEXT", 2, BrowserClipboardReasonDetail.INVALID_TEXT);
        INVALID_TEXT = browserClipboardUnavailableReason3;
        BrowserClipboardUnavailableReason browserClipboardUnavailableReason4 = new BrowserClipboardUnavailableReason("UNSUPPORTED_SELECTION", 3, BrowserClipboardReasonDetail.UNSUPPORTED_SELECTION);
        UNSUPPORTED_SELECTION = browserClipboardUnavailableReason4;
        BrowserClipboardUnavailableReason[] browserClipboardUnavailableReasonArr = {browserClipboardUnavailableReason, browserClipboardUnavailableReason2, browserClipboardUnavailableReason3, browserClipboardUnavailableReason4};
        $VALUES = browserClipboardUnavailableReasonArr;
        $ENTRIES = C3cG.A0w(browserClipboardUnavailableReasonArr);
        Companion = new Companion();
    }

    public static Ey9<BrowserClipboardUnavailableReason> getEntries() {
        return $ENTRIES;
    }

    public static BrowserClipboardUnavailableReason valueOf(String str) {
        return (BrowserClipboardUnavailableReason) Enum.valueOf(BrowserClipboardUnavailableReason.class, str);
    }

    public static BrowserClipboardUnavailableReason[] values() {
        return (BrowserClipboardUnavailableReason[]) $VALUES.clone();
    }

    public final BrowserClipboardReasonDetail getReasonDetail() {
        return this.reasonDetail;
    }

    public BrowserClipboardUnavailableReason(String str, int i, BrowserClipboardReasonDetail browserClipboardReasonDetail) {
        this.reasonDetail = browserClipboardReasonDetail;
    }
}
