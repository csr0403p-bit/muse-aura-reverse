package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class PsiToolData {
    public static G50<PsiToolData> CONVERTER = C8921Ftd.A00(11);
    public static long sMcfTypeId;
    public final ChatHistory chatHistory;
    public final ArrayList<Conversation> conversations;
    public final String originalPrompt;
    public final String queryType;
    public final String requestId;
    public final String turnId;

    public static native PsiToolData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PsiToolData) {
                PsiToolData psiToolData = (PsiToolData) obj;
                if (!this.turnId.equals(psiToolData.turnId) || !this.requestId.equals(psiToolData.requestId) || !this.originalPrompt.equals(psiToolData.originalPrompt) || !this.conversations.equals(psiToolData.conversations) || !this.chatHistory.equals(psiToolData.chatHistory) || !this.queryType.equals(psiToolData.queryType)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.queryType, AnonymousClass005.A0F(this.chatHistory, AnonymousClass005.A0F(this.conversations, AnonymousClass005.A0I(this.originalPrompt, AnonymousClass005.A0I(this.requestId, BV8.A0B(this.turnId))))));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PsiToolData{turnId=");
        sbA0x.append(this.turnId);
        sbA0x.append(",requestId=");
        sbA0x.append(this.requestId);
        sbA0x.append(",originalPrompt=");
        sbA0x.append(this.originalPrompt);
        sbA0x.append(",conversations=");
        sbA0x.append(this.conversations);
        sbA0x.append(",chatHistory=");
        sbA0x.append(this.chatHistory);
        sbA0x.append(",queryType=");
        return AbstractC7610F5x.A0w(this.queryType, sbA0x);
    }

    public PsiToolData(String str, String str2, String str3, ArrayList<Conversation> arrayList, ChatHistory chatHistory, String str4) {
        AbstractC7609F5w.A1H(str, str2, str3);
        AbstractC7609F5w.A1H(arrayList, chatHistory, str4);
        this.turnId = str;
        this.requestId = str2;
        this.originalPrompt = str3;
        this.conversations = arrayList;
        this.chatHistory = chatHistory;
        this.queryType = str4;
    }
}
