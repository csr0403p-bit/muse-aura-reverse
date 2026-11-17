package com.facebook.aura.deeplink;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class StructuredPromptJson extends C06G {
    public static final int $stable = 8;
    public final List<StructuredPromptAttachmentJson> attachments;
    public final String prompt;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, StructuredPromptJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<StructuredPromptJson> serializer() {
            return StructuredPromptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public StructuredPromptJson(String str, List<StructuredPromptAttachmentJson> list) {
        C7384Etj.A0Y(list, 1);
        this.prompt = str;
        this.attachments = list;
    }

    public final StructuredPromptJson copy(String str, List<StructuredPromptAttachmentJson> list) {
        C7384Etj.A0Y(list, 1);
        return new StructuredPromptJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StructuredPromptJson) {
                StructuredPromptJson structuredPromptJson = (StructuredPromptJson) obj;
                if (!C7384Etj.areEqual(this.prompt, structuredPromptJson.prompt) || !C7384Etj.areEqual(this.attachments, structuredPromptJson.attachments)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StructuredPromptJson copy$default(StructuredPromptJson structuredPromptJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = structuredPromptJson.prompt;
        }
        if ((i & 2) != 0) {
            list = structuredPromptJson.attachments;
        }
        C7384Etj.A0Y(list, 1);
        return new StructuredPromptJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(StructuredPromptJson structuredPromptJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || structuredPromptJson.prompt != null) {
            c9j5.AAP(structuredPromptJson.prompt, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(structuredPromptJson.attachments)) {
            c9j5.AAQ(structuredPromptJson.attachments, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.prompt;
    }

    public final List<StructuredPromptAttachmentJson> component2() {
        return this.attachments;
    }

    public final List<StructuredPromptAttachmentJson> getAttachments() {
        return this.attachments;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachments, AnonymousClass006.A0G(this.prompt) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StructuredPromptJson(int i, String str, List list, C2hx c2hx) {
        this.prompt = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.attachments = C0881AGi.A00;
        } else {
            this.attachments = list;
        }
    }

    public /* synthetic */ StructuredPromptJson(String str, List list, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), C3cI.A11(list, i));
    }

    public StructuredPromptJson() {
        this(null, C0881AGi.A00);
    }
}
