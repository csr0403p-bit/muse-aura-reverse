package com.facebook.aura.network.acs;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class IssueAcsTokenRequestJson extends C06G {
    public final List<String> blinded_tokens;
    public final String config_id;
    public final boolean request_proof;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, IssueAcsTokenRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<IssueAcsTokenRequestJson> serializer() {
            return IssueAcsTokenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IssueAcsTokenRequestJson) {
                IssueAcsTokenRequestJson issueAcsTokenRequestJson = (IssueAcsTokenRequestJson) obj;
                if (!C7384Etj.areEqual(this.blinded_tokens, issueAcsTokenRequestJson.blinded_tokens) || !C7384Etj.areEqual(this.config_id, issueAcsTokenRequestJson.config_id) || this.request_proof != issueAcsTokenRequestJson.request_proof) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IssueAcsTokenRequestJson copy$default(IssueAcsTokenRequestJson issueAcsTokenRequestJson, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = issueAcsTokenRequestJson.blinded_tokens;
        }
        if ((i & 2) != 0) {
            str = issueAcsTokenRequestJson.config_id;
        }
        if ((i & 4) != 0) {
            z = issueAcsTokenRequestJson.request_proof;
        }
        return issueAcsTokenRequestJson.copy(list, str, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(IssueAcsTokenRequestJson issueAcsTokenRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(issueAcsTokenRequestJson.blinded_tokens, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AAV(issueAcsTokenRequestJson.config_id, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, issueAcsTokenRequestJson.request_proof);
    }

    public final List<String> component1() {
        return this.blinded_tokens;
    }

    public final String component2() {
        return this.config_id;
    }

    public final boolean component3() {
        return this.request_proof;
    }

    public final List<String> getBlinded_tokens() {
        return this.blinded_tokens;
    }

    public final String getConfig_id() {
        return this.config_id;
    }

    public final boolean getRequest_proof() {
        return this.request_proof;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.config_id, AnonymousClass005.A0E(this.blinded_tokens)), this.request_proof);
    }

    public IssueAcsTokenRequestJson(List<String> list, String str, boolean z) {
        AnonymousClass003.A0u(list, str);
        this.blinded_tokens = list;
        this.config_id = str;
        this.request_proof = z;
    }

    public final IssueAcsTokenRequestJson copy(List<String> list, String str, boolean z) {
        AnonymousClass003.A0u(list, str);
        return new IssueAcsTokenRequestJson(list, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IssueAcsTokenRequestJson(int i, List list, String str, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(IssueAcsTokenRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.blinded_tokens = list;
        this.config_id = str;
        this.request_proof = z;
    }
}
