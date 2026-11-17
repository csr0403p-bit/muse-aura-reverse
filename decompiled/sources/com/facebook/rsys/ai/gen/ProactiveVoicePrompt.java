package com.facebook.rsys.ai.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ProactiveVoicePrompt {
    public static G50<ProactiveVoicePrompt> CONVERTER = C8923Ftf.A00(12);
    public static long sMcfTypeId;
    public final String fbPostId;
    public final String prompt;

    public class Builder {
        public String fbPostId;
        public String prompt;

        public ProactiveVoicePrompt build() {
            return new ProactiveVoicePrompt(this);
        }
    }

    public static native ProactiveVoicePrompt createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProactiveVoicePrompt) {
                ProactiveVoicePrompt proactiveVoicePrompt = (ProactiveVoicePrompt) obj;
                String str = this.fbPostId;
                String str2 = proactiveVoicePrompt.fbPostId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.prompt;
                    String str4 = proactiveVoicePrompt.prompt;
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
        return AbstractC7608F5v.A02(AnonymousClass006.A0G(this.fbPostId)) + AnonymousClass005.A0H(this.prompt);
    }

    public String toString() {
        return FGI.A0h("ProactiveVoicePrompt{fbPostId=", this.fbPostId, ",prompt=", this.prompt, "}");
    }

    public ProactiveVoicePrompt(Builder builder) {
        this.fbPostId = builder.fbPostId;
        this.prompt = builder.prompt;
    }
}
