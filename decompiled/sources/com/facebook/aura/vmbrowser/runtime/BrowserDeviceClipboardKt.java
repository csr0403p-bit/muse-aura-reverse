package com.facebook.aura.vmbrowser.runtime;

/* loaded from: classes2.dex */
public abstract class BrowserDeviceClipboardKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult decodeBrowserClipboardCopyReceipt(java.lang.String r1, com.facebook.aura.vmbrowser.runtime.BrowserClipboardCopyReceiptJson r2) {
        /*
            X.AnonymousClass003.A0u(r1, r2)
            java.lang.String r0 = r2.operation_id
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
            java.lang.String r1 = r2.outcome
            java.lang.String r0 = "unavailable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            java.lang.String r0 = r2.text
            if (r0 != 0) goto L31
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardUnavailableReason$Companion r1 = com.facebook.aura.vmbrowser.runtime.BrowserClipboardUnavailableReason.Companion
            java.lang.String r0 = r2.reason
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardUnavailableReason r1 = r1.fromWire(r0)
            if (r1 == 0) goto L29
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardReasonDetail r0 = r1.getReasonDetail()
            if (r0 != 0) goto L2b
        L29:
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardReasonDetail r0 = com.facebook.aura.vmbrowser.runtime.BrowserClipboardReasonDetail.REMOTE_UNAVAILABLE
        L2b:
            com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult$Unavailable r2 = new com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult$Unavailable
            r2.<init>(r1, r0)
            return r2
        L31:
            r1 = 0
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardReasonDetail r0 = com.facebook.aura.vmbrowser.runtime.BrowserClipboardReasonDetail.INVALID_REMOTE_RESPONSE
            goto L2b
        L35:
            java.lang.String r0 = "available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r2.text
            if (r0 == 0) goto L4f
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardUnavailableReason r0 = com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboardFeedbackKt.browserClipboardTextError(r0)
            if (r0 != 0) goto L4f
            java.lang.String r0 = r2.text
            com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult$Available r2 = new com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult$Available
            r2.<init>(r0)
            goto L51
        L4f:
            com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult$OutcomeUnknown r2 = com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult.OutcomeUnknown.INSTANCE
        L51:
            com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult r2 = (com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboardKt.decodeBrowserClipboardCopyReceipt(java.lang.String, com.facebook.aura.vmbrowser.runtime.BrowserClipboardCopyReceiptJson):com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult");
    }
}
