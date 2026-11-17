package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AnonymousClass001;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ChatMessage {
    public static G50<ChatMessage> CONVERTER = C8921Ftd.A00(6);
    public static long sMcfTypeId;
    public final String content;
    public final int role;

    public static native ChatMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChatMessage) {
                ChatMessage chatMessage = (ChatMessage) obj;
                if (this.role != chatMessage.role || !this.content.equals(chatMessage.content)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.content, (527 + this.role) * 31);
    }

    public String toString() {
        return FGI.A09(this.role, "ChatMessage{role=", ",content=", this.content, "}");
    }

    public ChatMessage(int i, String str) {
        str.getClass();
        this.role = i;
        this.content = str;
    }
}
