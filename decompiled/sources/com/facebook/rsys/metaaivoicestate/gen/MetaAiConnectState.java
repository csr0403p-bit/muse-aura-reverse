package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiConnectState {
    public static G50<MetaAiConnectState> CONVERTER = C8921Ftd.A00(34);
    public static long sMcfTypeId;
    public final String modelTier;
    public final String selectedModel;
    public final String sessionId;
    public final String sharedCallId;

    public static native MetaAiConnectState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiConnectState) {
                MetaAiConnectState metaAiConnectState = (MetaAiConnectState) obj;
                String str = this.selectedModel;
                String str2 = metaAiConnectState.selectedModel;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.modelTier;
                    String str4 = metaAiConnectState.modelTier;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    String str5 = this.sessionId;
                    String str6 = metaAiConnectState.sessionId;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                    String str7 = this.sharedCallId;
                    String str8 = metaAiConnectState.sharedCallId;
                    if (str7 == null) {
                        if (str8 != null) {
                            return false;
                        }
                    } else if (str7.equals(str8)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.selectedModel)) + AnonymousClass006.A0G(this.modelTier)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass005.A0H(this.sharedCallId);
    }

    public String toString() {
        return FGI.A0m("MetaAiConnectState{selectedModel=", this.selectedModel, ",modelTier=", this.modelTier, ",sessionId=", this.sessionId, ",sharedCallId=", this.sharedCallId, "}");
    }

    public MetaAiConnectState(String str, String str2, String str3, String str4) {
        this.selectedModel = str;
        this.modelTier = str2;
        this.sessionId = str3;
        this.sharedCallId = str4;
    }
}
