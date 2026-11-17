package com.facebook.rsys.devxagent.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VoiceAdContext {
    public static G50<VoiceAdContext> CONVERTER = C8925Fth.A00(19);
    public static long sMcfTypeId;
    public final String adId;
    public final String conversationStarterPrompt;
    public final String conversationStarterResponse;

    public static native VoiceAdContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceAdContext) {
                VoiceAdContext voiceAdContext = (VoiceAdContext) obj;
                if (this.adId.equals(voiceAdContext.adId)) {
                    String str = this.conversationStarterPrompt;
                    String str2 = voiceAdContext.conversationStarterPrompt;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.conversationStarterResponse;
                        String str4 = voiceAdContext.conversationStarterResponse;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((BV8.A0B(this.adId) + AnonymousClass006.A0G(this.conversationStarterPrompt)) * 31) + AnonymousClass005.A0H(this.conversationStarterResponse);
    }

    public String toString() {
        return FGI.A0k("VoiceAdContext{adId=", this.adId, ",conversationStarterPrompt=", this.conversationStarterPrompt, ",conversationStarterResponse=", this.conversationStarterResponse, "}");
    }

    public VoiceAdContext(String str, String str2, String str3) {
        str.getClass();
        this.adId = str;
        this.conversationStarterPrompt = str2;
        this.conversationStarterResponse = str3;
    }
}
