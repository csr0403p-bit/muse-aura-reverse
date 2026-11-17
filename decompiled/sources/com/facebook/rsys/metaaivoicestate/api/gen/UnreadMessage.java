package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UnreadMessage {
    public static G50<UnreadMessage> CONVERTER = C8921Ftd.A00(15);
    public static long sMcfTypeId;
    public final String messageText;
    public final String senderName;
    public final String threadName;
    public final long timestampMs;

    public static native UnreadMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnreadMessage) {
                UnreadMessage unreadMessage = (UnreadMessage) obj;
                if (!this.threadName.equals(unreadMessage.threadName) || !this.senderName.equals(unreadMessage.senderName) || !this.messageText.equals(unreadMessage.messageText) || this.timestampMs != unreadMessage.timestampMs) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.timestampMs, AnonymousClass005.A0I(this.messageText, AnonymousClass005.A0I(this.senderName, BV8.A0B(this.threadName))));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("UnreadMessage{threadName=");
        sbA0x.append(this.threadName);
        sbA0x.append(",senderName=");
        sbA0x.append(this.senderName);
        sbA0x.append(",messageText=");
        sbA0x.append(this.messageText);
        sbA0x.append(",timestampMs=");
        sbA0x.append(this.timestampMs);
        return BV7.A11(sbA0x);
    }

    public UnreadMessage(String str, String str2, String str3, long j) {
        AbstractC7609F5w.A1H(str, str2, str3);
        this.threadName = str;
        this.senderName = str2;
        this.messageText = str3;
        this.timestampMs = j;
    }
}
