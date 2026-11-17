package com.facebook.rsys.ai.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ConversationStarterPrompt {
    public static G50<ConversationStarterPrompt> CONVERTER = C8923Ftf.A00(3);
    public static long sMcfTypeId;
    public final String promptId;
    public final String text;

    public class Builder {
        public String promptId;
        public String text;

        public ConversationStarterPrompt build() {
            return new ConversationStarterPrompt(this);
        }
    }

    public static native ConversationStarterPrompt createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConversationStarterPrompt) {
                ConversationStarterPrompt conversationStarterPrompt = (ConversationStarterPrompt) obj;
                String str = this.text;
                String str2 = conversationStarterPrompt.text;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.promptId;
                    String str4 = conversationStarterPrompt.promptId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC7608F5v.A02(AnonymousClass006.A0G(this.text)) + AnonymousClass005.A0H(this.promptId);
    }

    public String toString() {
        return FGI.A0h("ConversationStarterPrompt{text=", this.text, ",promptId=", this.promptId, "}");
    }

    public ConversationStarterPrompt(Builder builder) {
        this.text = builder.text;
        this.promptId = builder.promptId;
    }
}
