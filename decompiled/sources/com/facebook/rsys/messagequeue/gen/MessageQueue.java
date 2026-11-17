package com.facebook.rsys.messagequeue.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MessageQueue {
    public static G50<MessageQueue> CONVERTER = C8921Ftd.A00(3);
    public static long sMcfTypeId;
    public final ArrayList<MessageQueueItem> items;
    public final String name;

    public static native MessageQueue createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageQueue) {
                MessageQueue messageQueue = (MessageQueue) obj;
                if (!this.name.equals(messageQueue.name) || !this.items.equals(messageQueue.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, BV8.A0B(this.name));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MessageQueue{name=");
        sbA0x.append(this.name);
        sbA0x.append(",items=");
        return BV8.A0v(this.items, sbA0x);
    }

    public MessageQueue(String str, ArrayList<MessageQueueItem> arrayList) {
        str.getClass();
        arrayList.getClass();
        this.name = str;
        this.items = arrayList;
    }
}
