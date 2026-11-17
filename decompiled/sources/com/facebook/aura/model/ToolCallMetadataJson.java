package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
public final class ToolCallMetadataJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<String> file_paths;
    public final String file_type;
    public final List<ToolCallCitationJson> results;

    public final class Companion {
        public final C9hr<ToolCallMetadataJson> serializer() {
            return ToolCallMetadataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, null, AbstractC5321DgF.A02(num, ToolCallMetadataJson$Companion$$childSerializers$1.INSTANCE), ToolCallMetadataJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToolCallMetadataJson) {
                ToolCallMetadataJson toolCallMetadataJson = (ToolCallMetadataJson) obj;
                if (!C7384Etj.areEqual(this.file_type, toolCallMetadataJson.file_type) || !C7384Etj.areEqual(this.file_paths, toolCallMetadataJson.file_paths) || !C7384Etj.areEqual(this.results, toolCallMetadataJson.results)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolCallMetadataJson copy$default(ToolCallMetadataJson toolCallMetadataJson, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolCallMetadataJson.file_type;
        }
        if ((i & 2) != 0) {
            list = toolCallMetadataJson.file_paths;
        }
        if ((i & 4) != 0) {
            list2 = toolCallMetadataJson.results;
        }
        return toolCallMetadataJson.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ToolCallMetadataJson toolCallMetadataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || toolCallMetadataJson.file_type != null) {
            c9j5.AAP(toolCallMetadataJson.file_type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(toolCallMetadataJson.file_paths)) {
            c9j5.AAQ(toolCallMetadataJson.file_paths, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(toolCallMetadataJson.results)) {
            c9j5.AAQ(toolCallMetadataJson.results, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.file_type;
    }

    public final List<String> component2() {
        return this.file_paths;
    }

    public final List<ToolCallCitationJson> component3() {
        return this.results;
    }

    public final List<String> getFile_paths() {
        return this.file_paths;
    }

    public final String getFile_type() {
        return this.file_type;
    }

    public final List<ToolCallCitationJson> getResults() {
        return this.results;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.results, AnonymousClass005.A0F(this.file_paths, AnonymousClass006.A0G(this.file_type) * 31));
    }

    public ToolCallMetadataJson(String str, List<String> list, List<ToolCallCitationJson> list2) {
        AnonymousClass003.A0x(list, list2);
        this.file_type = str;
        this.file_paths = list;
        this.results = list2;
    }

    public final ToolCallMetadataJson copy(String str, List<String> list, List<ToolCallCitationJson> list2) {
        AnonymousClass003.A0x(list, list2);
        return new ToolCallMetadataJson(str, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ToolCallMetadataJson(int i, String str, List list, List list2, C2hx c2hx) {
        this.file_type = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.file_paths = C0881AGi.A00;
        } else {
            this.file_paths = list;
        }
        if ((i & 4) == 0) {
            this.results = C0881AGi.A00;
        } else {
            this.results = list2;
        }
    }

    public /* synthetic */ ToolCallMetadataJson(String str, List list, List list2, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), C3cI.A11(list, i), C3cI.A12(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToolCallMetadataJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, c0881AGi);
    }
}
