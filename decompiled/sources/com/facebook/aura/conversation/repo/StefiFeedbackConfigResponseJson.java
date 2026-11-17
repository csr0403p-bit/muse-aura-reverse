package com.facebook.aura.conversation.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final class StefiFeedbackConfigResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> bad_feedback_options;
    public final String bad_response_label;
    public final boolean enable_bad_feedback;
    public final boolean enable_good_feedback;
    public final List<String> good_feedback_options;
    public final String good_response_label;

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<StefiFeedbackConfigResponseJson> serializer() {
            return StefiFeedbackConfigResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, StefiFeedbackConfigResponseJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, StefiFeedbackConfigResponseJson$Companion$$childSerializers$2.INSTANCE)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StefiFeedbackConfigResponseJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(false, false, null, null, c0881AGi, c0881AGi);
    }

    public static /* synthetic */ StefiFeedbackConfigResponseJson copy$default(StefiFeedbackConfigResponseJson stefiFeedbackConfigResponseJson, boolean z, boolean z2, String str, String str2, List list, List list2, int i, Object obj) {
        boolean z3 = z;
        boolean z4 = z2;
        String str3 = str;
        String str4 = str2;
        List list3 = list;
        List list4 = list2;
        if ((i & 1) != 0) {
            z3 = stefiFeedbackConfigResponseJson.enable_good_feedback;
        }
        if ((i & 2) != 0) {
            z4 = stefiFeedbackConfigResponseJson.enable_bad_feedback;
        }
        if ((i & 4) != 0) {
            str3 = stefiFeedbackConfigResponseJson.good_response_label;
        }
        if ((i & 8) != 0) {
            str4 = stefiFeedbackConfigResponseJson.bad_response_label;
        }
        if ((i & 16) != 0) {
            list3 = stefiFeedbackConfigResponseJson.good_feedback_options;
        }
        if ((i & 32) != 0) {
            list4 = stefiFeedbackConfigResponseJson.bad_feedback_options;
        }
        AnonymousClass003.A0y(list3, list4);
        return new StefiFeedbackConfigResponseJson(z3, z4, str3, str4, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StefiFeedbackConfigResponseJson) {
                StefiFeedbackConfigResponseJson stefiFeedbackConfigResponseJson = (StefiFeedbackConfigResponseJson) obj;
                if (this.enable_good_feedback != stefiFeedbackConfigResponseJson.enable_good_feedback || this.enable_bad_feedback != stefiFeedbackConfigResponseJson.enable_bad_feedback || !C7384Etj.areEqual(this.good_response_label, stefiFeedbackConfigResponseJson.good_response_label) || !C7384Etj.areEqual(this.bad_response_label, stefiFeedbackConfigResponseJson.bad_response_label) || !C7384Etj.areEqual(this.good_feedback_options, stefiFeedbackConfigResponseJson.good_feedback_options) || !C7384Etj.areEqual(this.bad_feedback_options, stefiFeedbackConfigResponseJson.bad_feedback_options)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(StefiFeedbackConfigResponseJson stefiFeedbackConfigResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || stefiFeedbackConfigResponseJson.enable_good_feedback) {
            c9j5.AA7(c9iZ, 0, stefiFeedbackConfigResponseJson.enable_good_feedback);
        }
        if (zAfR || stefiFeedbackConfigResponseJson.enable_bad_feedback) {
            c9j5.AA7(c9iZ, 1, stefiFeedbackConfigResponseJson.enable_bad_feedback);
        }
        if (zAfR || stefiFeedbackConfigResponseJson.good_response_label != null) {
            c9j5.AAP(stefiFeedbackConfigResponseJson.good_response_label, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || stefiFeedbackConfigResponseJson.bad_response_label != null) {
            c9j5.AAP(stefiFeedbackConfigResponseJson.bad_response_label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(stefiFeedbackConfigResponseJson.good_feedback_options)) {
            c9j5.AAQ(stefiFeedbackConfigResponseJson.good_feedback_options, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(stefiFeedbackConfigResponseJson.bad_feedback_options)) {
            c9j5.AAQ(stefiFeedbackConfigResponseJson.bad_feedback_options, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final boolean component1() {
        return this.enable_good_feedback;
    }

    public final boolean component2() {
        return this.enable_bad_feedback;
    }

    public final String component3() {
        return this.good_response_label;
    }

    public final String component4() {
        return this.bad_response_label;
    }

    public final List<String> component5() {
        return this.good_feedback_options;
    }

    public final List<String> component6() {
        return this.bad_feedback_options;
    }

    public final List<String> getBad_feedback_options() {
        return this.bad_feedback_options;
    }

    public final String getBad_response_label() {
        return this.bad_response_label;
    }

    public final boolean getEnable_bad_feedback() {
        return this.enable_bad_feedback;
    }

    public final boolean getEnable_good_feedback() {
        return this.enable_good_feedback;
    }

    public final List<String> getGood_feedback_options() {
        return this.good_feedback_options;
    }

    public final String getGood_response_label() {
        return this.good_response_label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.bad_feedback_options, AnonymousClass005.A0F(this.good_feedback_options, (((C0KA.A01(C0KA.A02(this.enable_good_feedback), this.enable_bad_feedback) + AnonymousClass006.A0G(this.good_response_label)) * 31) + AnonymousClass005.A0H(this.bad_response_label)) * 31));
    }

    public final StefiFeedbackConfigResponseJson copy(boolean z, boolean z2, String str, String str2, List<String> list, List<String> list2) {
        AnonymousClass003.A0y(list, list2);
        return new StefiFeedbackConfigResponseJson(z, z2, str, str2, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public StefiFeedbackConfigResponseJson(boolean z, boolean z2, String str, String str2, List<String> list, List<String> list2) {
        AnonymousClass003.A0y(list, list2);
        this.enable_good_feedback = z;
        this.enable_bad_feedback = z2;
        this.good_response_label = str;
        this.bad_response_label = str2;
        this.good_feedback_options = list;
        this.bad_feedback_options = list2;
    }

    public /* synthetic */ StefiFeedbackConfigResponseJson(boolean z, boolean z2, String str, String str2, List list, List list2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? C0881AGi.A00 : list2);
    }

    public /* synthetic */ StefiFeedbackConfigResponseJson(int i, boolean z, boolean z2, String str, String str2, List list, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.enable_good_feedback = false;
        } else {
            this.enable_good_feedback = z;
        }
        if ((i & 2) == 0) {
            this.enable_bad_feedback = false;
        } else {
            this.enable_bad_feedback = z2;
        }
        if ((i & 4) == 0) {
            this.good_response_label = null;
        } else {
            this.good_response_label = str;
        }
        if ((i & 8) == 0) {
            this.bad_response_label = null;
        } else {
            this.bad_response_label = str2;
        }
        if ((i & 16) == 0) {
            this.good_feedback_options = C0881AGi.A00;
        } else {
            this.good_feedback_options = list;
        }
        if ((i & 32) == 0) {
            this.bad_feedback_options = C0881AGi.A00;
        } else {
            this.bad_feedback_options = list2;
        }
    }
}
