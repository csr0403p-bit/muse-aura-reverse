package com.facebook.aura.nodes.json;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
/* loaded from: classes2.dex */
public final class RenderingCapabilitiesJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> supported_inline_presentations;
    public final List<String> supported_presentations;
    public final List<String> supported_text_entities;

    public final class Companion {
        public final C9hr<RenderingCapabilitiesJson> serializer() {
            return RenderingCapabilitiesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RenderingCapabilitiesJson) {
                RenderingCapabilitiesJson renderingCapabilitiesJson = (RenderingCapabilitiesJson) obj;
                if (!C7384Etj.areEqual(this.supported_presentations, renderingCapabilitiesJson.supported_presentations) || !C7384Etj.areEqual(this.supported_inline_presentations, renderingCapabilitiesJson.supported_inline_presentations) || !C7384Etj.areEqual(this.supported_text_entities, renderingCapabilitiesJson.supported_text_entities)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, AbstractC5321DgF.A02(num, RenderingCapabilitiesJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, RenderingCapabilitiesJson$Companion$$childSerializers$2.INSTANCE), RenderingCapabilitiesJson$Companion$$childSerializers$3.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderingCapabilitiesJson copy$default(RenderingCapabilitiesJson renderingCapabilitiesJson, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = renderingCapabilitiesJson.supported_presentations;
        }
        if ((i & 2) != 0) {
            list2 = renderingCapabilitiesJson.supported_inline_presentations;
        }
        if ((i & 4) != 0) {
            list3 = renderingCapabilitiesJson.supported_text_entities;
        }
        return renderingCapabilitiesJson.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(RenderingCapabilitiesJson renderingCapabilitiesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(renderingCapabilitiesJson.supported_presentations)) {
            c9j5.AAQ(renderingCapabilitiesJson.supported_presentations, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(renderingCapabilitiesJson.supported_inline_presentations)) {
            c9j5.AAQ(renderingCapabilitiesJson.supported_inline_presentations, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || renderingCapabilitiesJson.supported_text_entities != null) {
            c9j5.AAP(renderingCapabilitiesJson.supported_text_entities, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final List<String> component1() {
        return this.supported_presentations;
    }

    public final List<String> component2() {
        return this.supported_inline_presentations;
    }

    public final List<String> component3() {
        return this.supported_text_entities;
    }

    public final List<String> getSupported_inline_presentations() {
        return this.supported_inline_presentations;
    }

    public final List<String> getSupported_presentations() {
        return this.supported_presentations;
    }

    public final List<String> getSupported_text_entities() {
        return this.supported_text_entities;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.supported_inline_presentations, AnonymousClass005.A0E(this.supported_presentations)) + AnonymousClass006.A0D(this.supported_text_entities);
    }

    public RenderingCapabilitiesJson(List<String> list, List<String> list2, List<String> list3) {
        AnonymousClass003.A0u(list, list2);
        this.supported_presentations = list;
        this.supported_inline_presentations = list2;
        this.supported_text_entities = list3;
    }

    public final RenderingCapabilitiesJson copy(List<String> list, List<String> list2, List<String> list3) {
        AnonymousClass003.A0u(list, list2);
        return new RenderingCapabilitiesJson(list, list2, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RenderingCapabilitiesJson(int i, List list, List list2, List list3, C2hx c2hx) {
        this.supported_presentations = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.supported_inline_presentations = C0881AGi.A00;
        } else {
            this.supported_inline_presentations = list2;
        }
        if ((i & 4) == 0) {
            this.supported_text_entities = null;
        } else {
            this.supported_text_entities = list3;
        }
    }

    public /* synthetic */ RenderingCapabilitiesJson(List list, List list2, List list3, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), (i & 4) != 0 ? null : list3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RenderingCapabilitiesJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, null);
    }
}
