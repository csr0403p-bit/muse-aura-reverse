package com.facebook.aura.vmbrowser.runtime;

import X.C7384Etj;
import X.C7BY;
import X.DCl;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class BrowserDeviceClipboardFeedbackKt {
    public static final int MAX_DEVICE_CLIPBOARD_BYTES = 61440;

    public static final BrowserClipboardUnavailableReason browserClipboardTextError(String str) {
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        if (length == 0) {
            return BrowserClipboardUnavailableReason.NO_SELECTION;
        }
        if (length <= 61440) {
            if (!C7BY.A0k(str, (char) 0)) {
                Charset charset = DCl.A05;
                byte[] bytes = str.getBytes(charset);
                if (bytes.length <= 61440) {
                    if (new String(bytes, charset).equals(str)) {
                        return null;
                    }
                }
            }
            return BrowserClipboardUnavailableReason.INVALID_TEXT;
        }
        return BrowserClipboardUnavailableReason.TEXT_TOO_LARGE;
    }
}
