package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class UpdateLinkedAccountsRequestJson extends C06G {
    public final List<String> account_ids;
    public final String provider;
    public final String session_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, UpdateLinkedAccountsRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<UpdateLinkedAccountsRequestJson> serializer() {
            return UpdateLinkedAccountsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpdateLinkedAccountsRequestJson) {
                UpdateLinkedAccountsRequestJson updateLinkedAccountsRequestJson = (UpdateLinkedAccountsRequestJson) obj;
                if (!C7384Etj.areEqual(this.provider, updateLinkedAccountsRequestJson.provider) || !C7384Etj.areEqual(this.account_ids, updateLinkedAccountsRequestJson.account_ids) || !C7384Etj.areEqual(this.session_id, updateLinkedAccountsRequestJson.session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateLinkedAccountsRequestJson copy$default(UpdateLinkedAccountsRequestJson updateLinkedAccountsRequestJson, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateLinkedAccountsRequestJson.provider;
        }
        if ((i & 2) != 0) {
            list = updateLinkedAccountsRequestJson.account_ids;
        }
        if ((i & 4) != 0) {
            str2 = updateLinkedAccountsRequestJson.session_id;
        }
        return updateLinkedAccountsRequestJson.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(UpdateLinkedAccountsRequestJson updateLinkedAccountsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(updateLinkedAccountsRequestJson.provider, c9iZ, 0);
        c9j5.AAQ(updateLinkedAccountsRequestJson.account_ids, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || updateLinkedAccountsRequestJson.session_id != null) {
            c9j5.AAP(updateLinkedAccountsRequestJson.session_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.provider;
    }

    public final List<String> component2() {
        return this.account_ids;
    }

    public final String component3() {
        return this.session_id;
    }

    public final List<String> getAccount_ids() {
        return this.account_ids;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.account_ids, AnonymousClass001.A0G(this.provider)) + AnonymousClass006.A0G(this.session_id);
    }

    public UpdateLinkedAccountsRequestJson(String str, List<String> list, String str2) {
        AnonymousClass003.A0u(str, list);
        this.provider = str;
        this.account_ids = list;
        this.session_id = str2;
    }

    public final UpdateLinkedAccountsRequestJson copy(String str, List<String> list, String str2) {
        AnonymousClass003.A0u(str, list);
        return new UpdateLinkedAccountsRequestJson(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ UpdateLinkedAccountsRequestJson(int i, String str, List list, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(UpdateLinkedAccountsRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.provider = str;
        this.account_ids = list;
        this.session_id = C3cI.A0W(i, str2);
    }

    public /* synthetic */ UpdateLinkedAccountsRequestJson(String str, List list, String str2, int i, C06H c06h) {
        this(str, list, AnonymousClass006.A0t(i, str2));
    }
}
