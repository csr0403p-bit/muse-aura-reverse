package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class Conversation {
    public static G50<Conversation> CONVERTER = C8921Ftd.A00(7);
    public static long sMcfTypeId;
    public final String conversationId;
    public final String conversationName;
    public final String conversationProfilePicUrls;
    public final boolean isE2ee;
    public final boolean isSelfConversation;
    public final ArrayList<RelevantMessage> messages;

    public static native Conversation createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Conversation) {
                Conversation conversation = (Conversation) obj;
                if (!this.conversationName.equals(conversation.conversationName) || !this.conversationId.equals(conversation.conversationId) || !this.conversationProfilePicUrls.equals(conversation.conversationProfilePicUrls) || !this.messages.equals(conversation.messages) || this.isSelfConversation != conversation.isSelfConversation || this.isE2ee != conversation.isE2ee) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.messages, AnonymousClass005.A0I(this.conversationProfilePicUrls, AnonymousClass005.A0I(this.conversationId, BV8.A0B(this.conversationName)))) + (this.isSelfConversation ? 1 : 0)) * 31) + (this.isE2ee ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("Conversation{conversationName=");
        sbA0x.append(this.conversationName);
        sbA0x.append(",conversationId=");
        sbA0x.append(this.conversationId);
        sbA0x.append(",conversationProfilePicUrls=");
        sbA0x.append(this.conversationProfilePicUrls);
        sbA0x.append(",messages=");
        sbA0x.append(this.messages);
        sbA0x.append(",isSelfConversation=");
        sbA0x.append(this.isSelfConversation);
        sbA0x.append(",isE2ee=");
        return AbstractC7610F5x.A0y(sbA0x, this.isE2ee);
    }

    public Conversation(String str, String str2, String str3, ArrayList<RelevantMessage> arrayList, boolean z, boolean z2) {
        AbstractC7609F5w.A1H(str, str2, str3);
        arrayList.getClass();
        this.conversationName = str;
        this.conversationId = str2;
        this.conversationProfilePicUrls = str3;
        this.messages = arrayList;
        this.isSelfConversation = z;
        this.isE2ee = z2;
    }
}
