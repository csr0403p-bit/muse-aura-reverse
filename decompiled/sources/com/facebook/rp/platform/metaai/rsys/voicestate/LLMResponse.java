package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass006;
import X.C06G;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class LLMResponse extends C06G {

    @SerializedName("genaiViewModels")
    public final GenAIViewModels genAIViewModels;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LLMResponse) && C7384Etj.areEqual(this.genAIViewModels, ((LLMResponse) obj).genAIViewModels));
    }

    public static /* synthetic */ LLMResponse copy$default(LLMResponse lLMResponse, GenAIViewModels genAIViewModels, int i, Object obj) {
        if ((i & 1) != 0) {
            genAIViewModels = lLMResponse.genAIViewModels;
        }
        return new LLMResponse(genAIViewModels);
    }

    public final GenAIViewModels component1() {
        return this.genAIViewModels;
    }

    public final LLMResponse copy(GenAIViewModels genAIViewModels) {
        return new LLMResponse(genAIViewModels);
    }

    public final GenAIViewModels getGenAIViewModels() {
        return this.genAIViewModels;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.genAIViewModels);
    }

    public String toString() {
        return C3cJ.A0M("LLMResponse(genAIViewModels=", this.genAIViewModels);
    }

    public LLMResponse(GenAIViewModels genAIViewModels) {
        this.genAIViewModels = genAIViewModels;
    }
}
