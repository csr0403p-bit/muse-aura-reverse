package com.facebook.rsys.metaaivoicestate.gen;

import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class GenAiTextPromptViewModel {
    public static G50<GenAiTextPromptViewModel> CONVERTER = C8921Ftd.A00(29);
    public static long sMcfTypeId;
    public final ArrayList<PromptData> prompts;

    public static native GenAiTextPromptViewModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenAiTextPromptViewModel) {
            return this.prompts.equals(((GenAiTextPromptViewModel) obj).prompts);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.prompts.hashCode();
    }

    public String toString() {
        return BV8.A0v(this.prompts, C60O.A0x("GenAiTextPromptViewModel{prompts="));
    }

    public GenAiTextPromptViewModel(ArrayList<PromptData> arrayList) {
        arrayList.getClass();
        this.prompts = arrayList;
    }
}
