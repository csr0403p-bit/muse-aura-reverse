package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class PromptData {
    public static G50<PromptData> CONVERTER = C8921Ftd.A00(45);
    public static long sMcfTypeId;
    public final String text;

    public static native PromptData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromptData) {
            return this.text.equals(((PromptData) obj).text);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.text.hashCode();
    }

    public String toString() {
        return FGI.A0U("PromptData{text=", this.text, "}");
    }

    public PromptData(String str) {
        str.getClass();
        this.text = str;
    }
}
