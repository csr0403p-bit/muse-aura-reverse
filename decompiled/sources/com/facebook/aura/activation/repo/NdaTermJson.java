package com.facebook.aura.activation.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class NdaTermJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> additional_questions;
    public final List<String> required_fields;
    public final String text;

    public final class Companion {
        public final C9hr<NdaTermJson> serializer() {
            return NdaTermJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, null, AbstractC5321DgF.A02(num, NdaTermJson$Companion$$childSerializers$1.INSTANCE), NdaTermJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NdaTermJson) {
                NdaTermJson ndaTermJson = (NdaTermJson) obj;
                if (!C7384Etj.areEqual(this.text, ndaTermJson.text) || !C7384Etj.areEqual(this.required_fields, ndaTermJson.required_fields) || !C7384Etj.areEqual(this.additional_questions, ndaTermJson.additional_questions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NdaTermJson copy$default(NdaTermJson ndaTermJson, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ndaTermJson.text;
        }
        if ((i & 2) != 0) {
            list = ndaTermJson.required_fields;
        }
        if ((i & 4) != 0) {
            list2 = ndaTermJson.additional_questions;
        }
        return ndaTermJson.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(NdaTermJson ndaTermJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(ndaTermJson.text)) {
            c9j5.AAV(ndaTermJson.text, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(ndaTermJson.required_fields)) {
            c9j5.AAQ(ndaTermJson.required_fields, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(ndaTermJson.additional_questions)) {
            c9j5.AAQ(ndaTermJson.additional_questions, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.text;
    }

    public final List<String> component2() {
        return this.required_fields;
    }

    public final List<String> component3() {
        return this.additional_questions;
    }

    public final List<String> getAdditional_questions() {
        return this.additional_questions;
    }

    public final List<String> getRequired_fields() {
        return this.required_fields;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.additional_questions, AnonymousClass005.A0F(this.required_fields, AnonymousClass001.A0G(this.text)));
    }

    public NdaTermJson(String str, List<String> list, List<String> list2) {
        AnonymousClass005.A0x(str, list, list2);
        this.text = str;
        this.required_fields = list;
        this.additional_questions = list2;
    }

    public final NdaTermJson copy(String str, List<String> list, List<String> list2) {
        AnonymousClass005.A0x(str, list, list2);
        return new NdaTermJson(str, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NdaTermJson(int i, String str, List list, List list2, C2hx c2hx) {
        this.text = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.required_fields = C0881AGi.A00;
        } else {
            this.required_fields = list;
        }
        if ((i & 4) == 0) {
            this.additional_questions = C0881AGi.A00;
        } else {
            this.additional_questions = list2;
        }
    }

    public /* synthetic */ NdaTermJson(String str, List list, List list2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i), C3cI.A12(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NdaTermJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", c0881AGi, c0881AGi);
    }
}
