package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class MemoryDisclosure extends C06G {

    @SerializedName("disclosure_text")
    public final String disclosureText;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MemoryDisclosure) && C7384Etj.areEqual(this.disclosureText, ((MemoryDisclosure) obj).disclosureText));
    }

    public static /* synthetic */ MemoryDisclosure copy$default(MemoryDisclosure memoryDisclosure, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoryDisclosure.disclosureText;
        }
        return new MemoryDisclosure(str);
    }

    public final String component1() {
        return this.disclosureText;
    }

    public final MemoryDisclosure copy(String str) {
        return new MemoryDisclosure(str);
    }

    public final String getDisclosureText() {
        return this.disclosureText;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.disclosureText);
    }

    public String toString() {
        return FGI.A0U("MemoryDisclosure(disclosureText=", this.disclosureText, ")");
    }

    public MemoryDisclosure(String str) {
        this.disclosureText = str;
    }
}
