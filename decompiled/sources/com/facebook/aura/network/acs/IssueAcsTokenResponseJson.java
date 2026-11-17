package com.facebook.aura.network.acs;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
/* loaded from: classes4.dex */
public final class IssueAcsTokenResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<AcsEvaluationJson> evaluation;
    public final List<AcsProofJson> proof;

    public final class Companion {
        public final C9hr<IssueAcsTokenResponseJson> serializer() {
            return IssueAcsTokenResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IssueAcsTokenResponseJson) {
                IssueAcsTokenResponseJson issueAcsTokenResponseJson = (IssueAcsTokenResponseJson) obj;
                if (!C7384Etj.areEqual(this.evaluation, issueAcsTokenResponseJson.evaluation) || !C7384Etj.areEqual(this.proof, issueAcsTokenResponseJson.proof)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1W(num, AbstractC5321DgF.A02(num, IssueAcsTokenResponseJson$Companion$$childSerializers$1.INSTANCE), IssueAcsTokenResponseJson$Companion$$childSerializers$2.INSTANCE);
    }

    public static /* synthetic */ IssueAcsTokenResponseJson copy$default(IssueAcsTokenResponseJson issueAcsTokenResponseJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = issueAcsTokenResponseJson.evaluation;
        }
        if ((i & 2) != 0) {
            list2 = issueAcsTokenResponseJson.proof;
        }
        AnonymousClass003.A0u(list, list2);
        return new IssueAcsTokenResponseJson(list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(IssueAcsTokenResponseJson issueAcsTokenResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(issueAcsTokenResponseJson.evaluation)) {
            c9j5.AAQ(issueAcsTokenResponseJson.evaluation, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(issueAcsTokenResponseJson.proof)) {
            c9j5.AAQ(issueAcsTokenResponseJson.proof, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final List<AcsEvaluationJson> component1() {
        return this.evaluation;
    }

    public final List<AcsProofJson> component2() {
        return this.proof;
    }

    public final List<AcsEvaluationJson> getEvaluation() {
        return this.evaluation;
    }

    public final List<AcsProofJson> getProof() {
        return this.proof;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.proof, AnonymousClass005.A0E(this.evaluation));
    }

    public IssueAcsTokenResponseJson(List<AcsEvaluationJson> list, List<AcsProofJson> list2) {
        AnonymousClass003.A0u(list, list2);
        this.evaluation = list;
        this.proof = list2;
    }

    public final IssueAcsTokenResponseJson copy(List<AcsEvaluationJson> list, List<AcsProofJson> list2) {
        AnonymousClass003.A0u(list, list2);
        return new IssueAcsTokenResponseJson(list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IssueAcsTokenResponseJson(int i, List list, List list2, C2hx c2hx) {
        this.evaluation = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.proof = C0881AGi.A00;
        } else {
            this.proof = list2;
        }
    }

    public /* synthetic */ IssueAcsTokenResponseJson(List list, List list2, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IssueAcsTokenResponseJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi);
    }
}
