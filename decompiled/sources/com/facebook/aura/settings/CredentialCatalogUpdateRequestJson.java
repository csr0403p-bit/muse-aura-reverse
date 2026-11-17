package com.facebook.aura.settings;

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
public final class CredentialCatalogUpdateRequestJson extends C06G {
    public static final int $stable = 8;
    public final String agent_permission;
    public final List<CredentialCatalogUpdateFieldJson> fields;
    public final String id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, CredentialCatalogUpdateRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CredentialCatalogUpdateRequestJson> serializer() {
            return CredentialCatalogUpdateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCatalogUpdateRequestJson) {
                CredentialCatalogUpdateRequestJson credentialCatalogUpdateRequestJson = (CredentialCatalogUpdateRequestJson) obj;
                if (!C7384Etj.areEqual(this.id, credentialCatalogUpdateRequestJson.id) || !C7384Etj.areEqual(this.fields, credentialCatalogUpdateRequestJson.fields) || !C7384Etj.areEqual(this.agent_permission, credentialCatalogUpdateRequestJson.agent_permission)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CredentialCatalogUpdateRequestJson copy$default(CredentialCatalogUpdateRequestJson credentialCatalogUpdateRequestJson, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCatalogUpdateRequestJson.id;
        }
        if ((i & 2) != 0) {
            list = credentialCatalogUpdateRequestJson.fields;
        }
        if ((i & 4) != 0) {
            str2 = credentialCatalogUpdateRequestJson.agent_permission;
        }
        return credentialCatalogUpdateRequestJson.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogUpdateRequestJson credentialCatalogUpdateRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(credentialCatalogUpdateRequestJson.id, c9iZ, 0);
        c9j5.AAQ(credentialCatalogUpdateRequestJson.fields, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || credentialCatalogUpdateRequestJson.agent_permission != null) {
            c9j5.AAP(credentialCatalogUpdateRequestJson.agent_permission, C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final List<CredentialCatalogUpdateFieldJson> component2() {
        return this.fields;
    }

    public final String component3() {
        return this.agent_permission;
    }

    public final String getAgent_permission() {
        return this.agent_permission;
    }

    public final List<CredentialCatalogUpdateFieldJson> getFields() {
        return this.fields;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.fields, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.agent_permission);
    }

    public CredentialCatalogUpdateRequestJson(String str, List<CredentialCatalogUpdateFieldJson> list, String str2) {
        AnonymousClass003.A0u(str, list);
        this.id = str;
        this.fields = list;
        this.agent_permission = str2;
    }

    public final CredentialCatalogUpdateRequestJson copy(String str, List<CredentialCatalogUpdateFieldJson> list, String str2) {
        AnonymousClass003.A0u(str, list);
        return new CredentialCatalogUpdateRequestJson(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCatalogUpdateRequestJson(int i, String str, List list, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CredentialCatalogUpdateRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.fields = list;
        this.agent_permission = C3cI.A0W(i, str2);
    }

    public /* synthetic */ CredentialCatalogUpdateRequestJson(String str, List list, String str2, int i, C06H c06h) {
        this(str, list, AnonymousClass006.A0t(i, str2));
    }
}
