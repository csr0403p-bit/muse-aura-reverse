package com.facebook.rsys.messagequeue.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MessageQueueItem {
    public static G50<MessageQueueItem> CONVERTER = C8921Ftd.A00(4);
    public static long sMcfTypeId;
    public final int expiryTimeMsec;
    public final int id;
    public final McfReference message;

    public static native MessageQueueItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageQueueItem) {
                MessageQueueItem messageQueueItem = (MessageQueueItem) obj;
                if (this.id != messageQueueItem.id || this.expiryTimeMsec != messageQueueItem.expiryTimeMsec || !this.message.equals(messageQueueItem.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.message, (((527 + this.id) * 31) + this.expiryTimeMsec) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MessageQueueItem{id=");
        sbA0x.append(this.id);
        sbA0x.append(",expiryTimeMsec=");
        sbA0x.append(this.expiryTimeMsec);
        sbA0x.append(",message=");
        return BV8.A0v(this.message, sbA0x);
    }

    public MessageQueueItem(int i, int i2, McfReference mcfReference) {
        mcfReference.getClass();
        this.id = i;
        this.expiryTimeMsec = i2;
        this.message = mcfReference;
    }
}
