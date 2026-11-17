package com.facebook.aura.vmbrowser.runtime;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.gateway.HatchVmRepositoryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserClipboardReasonDetail {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserClipboardReasonDetail[] $VALUES;
    public static final BrowserClipboardReasonDetail CLIPBOARD_READ_ERROR;
    public static final BrowserClipboardReasonDetail CLIPBOARD_WRITE_ERROR;
    public static final BrowserClipboardReasonDetail INVALID_REMOTE_RESPONSE;
    public static final BrowserClipboardReasonDetail INVALID_TEXT;
    public static final BrowserClipboardReasonDetail NO_SELECTION;
    public static final BrowserClipboardReasonDetail REMOTE_UNAVAILABLE;
    public static final BrowserClipboardReasonDetail TEXT_TOO_LARGE;
    public static final BrowserClipboardReasonDetail TRANSPORT_ERROR;
    public static final BrowserClipboardReasonDetail UNSUPPORTED_SELECTION;
    public final String value;

    static {
        BrowserClipboardReasonDetail browserClipboardReasonDetail = new BrowserClipboardReasonDetail("NO_SELECTION", 0, "no_selection");
        NO_SELECTION = browserClipboardReasonDetail;
        BrowserClipboardReasonDetail browserClipboardReasonDetail2 = new BrowserClipboardReasonDetail("TEXT_TOO_LARGE", 1, "text_too_large");
        TEXT_TOO_LARGE = browserClipboardReasonDetail2;
        BrowserClipboardReasonDetail browserClipboardReasonDetail3 = new BrowserClipboardReasonDetail("INVALID_TEXT", 2, "invalid_text");
        INVALID_TEXT = browserClipboardReasonDetail3;
        BrowserClipboardReasonDetail browserClipboardReasonDetail4 = new BrowserClipboardReasonDetail("UNSUPPORTED_SELECTION", 3, "unsupported_selection");
        UNSUPPORTED_SELECTION = browserClipboardReasonDetail4;
        BrowserClipboardReasonDetail browserClipboardReasonDetail5 = new BrowserClipboardReasonDetail("CLIPBOARD_READ_ERROR", 4, "clipboard_read_error");
        CLIPBOARD_READ_ERROR = browserClipboardReasonDetail5;
        BrowserClipboardReasonDetail browserClipboardReasonDetail6 = new BrowserClipboardReasonDetail("CLIPBOARD_WRITE_ERROR", 5, "clipboard_write_error");
        CLIPBOARD_WRITE_ERROR = browserClipboardReasonDetail6;
        BrowserClipboardReasonDetail browserClipboardReasonDetail7 = new BrowserClipboardReasonDetail("REMOTE_UNAVAILABLE", 6, "remote_unavailable");
        REMOTE_UNAVAILABLE = browserClipboardReasonDetail7;
        BrowserClipboardReasonDetail browserClipboardReasonDetail8 = new BrowserClipboardReasonDetail("INVALID_REMOTE_RESPONSE", 7, "invalid_remote_response");
        INVALID_REMOTE_RESPONSE = browserClipboardReasonDetail8;
        BrowserClipboardReasonDetail browserClipboardReasonDetail9 = new BrowserClipboardReasonDetail("TRANSPORT_ERROR", 8, HatchVmRepositoryKt.ERROR_MESSAGE_TRANSPORT_ERROR);
        TRANSPORT_ERROR = browserClipboardReasonDetail9;
        BrowserClipboardReasonDetail[] browserClipboardReasonDetailArr = {browserClipboardReasonDetail, browserClipboardReasonDetail2, browserClipboardReasonDetail3, browserClipboardReasonDetail4, browserClipboardReasonDetail5, browserClipboardReasonDetail6, browserClipboardReasonDetail7, browserClipboardReasonDetail8, browserClipboardReasonDetail9};
        $VALUES = browserClipboardReasonDetailArr;
        $ENTRIES = C3cG.A0w(browserClipboardReasonDetailArr);
    }

    public static Ey9<BrowserClipboardReasonDetail> getEntries() {
        return $ENTRIES;
    }

    public static BrowserClipboardReasonDetail valueOf(String str) {
        return (BrowserClipboardReasonDetail) Enum.valueOf(BrowserClipboardReasonDetail.class, str);
    }

    public static BrowserClipboardReasonDetail[] values() {
        return (BrowserClipboardReasonDetail[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public BrowserClipboardReasonDetail(String str, int i, String str2) {
        this.value = str2;
    }
}
