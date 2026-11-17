package com.facebook.rsys.metaaivoicestate.api.gen;

import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ChatHistory {
    public static G50<ChatHistory> CONVERTER = C8921Ftd.A00(5);
    public static long sMcfTypeId;
    public final ArrayList<ChatMessage> messages;

    public static native ChatHistory createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatHistory) {
            return this.messages.equals(((ChatHistory) obj).messages);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.messages.hashCode();
    }

    public String toString() {
        return BV8.A0v(this.messages, C60O.A0x("ChatHistory{messages="));
    }

    public ChatHistory(ArrayList<ChatMessage> arrayList) {
        arrayList.getClass();
        this.messages = arrayList;
    }
}
