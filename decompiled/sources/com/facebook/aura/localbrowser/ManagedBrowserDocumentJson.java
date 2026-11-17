package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserDocumentJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String document_id;
    public final String reference_scope;
    public final String target_id;

    public final class Companion {
        public final C9hr<ManagedBrowserDocumentJson> serializer() {
            return ManagedBrowserDocumentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserDocumentJson managedBrowserDocumentJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(managedBrowserDocumentJson.target_id, c9iZ, 0);
        c9j5.AAV(managedBrowserDocumentJson.document_id, c9iZ, 1);
        c9j5.AAV(managedBrowserDocumentJson.reference_scope, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserDocumentJson) {
                ManagedBrowserDocumentJson managedBrowserDocumentJson = (ManagedBrowserDocumentJson) obj;
                if (!C7384Etj.areEqual(this.target_id, managedBrowserDocumentJson.target_id) || !C7384Etj.areEqual(this.document_id, managedBrowserDocumentJson.document_id) || !C7384Etj.areEqual(this.reference_scope, managedBrowserDocumentJson.reference_scope)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ManagedBrowserDocumentJson copy$default(ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedBrowserDocumentJson.target_id;
        }
        if ((i & 2) != 0) {
            str2 = managedBrowserDocumentJson.document_id;
        }
        if ((i & 4) != 0) {
            str3 = managedBrowserDocumentJson.reference_scope;
        }
        return managedBrowserDocumentJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.target_id;
    }

    public final String component2() {
        return this.document_id;
    }

    public final String component3() {
        return this.reference_scope;
    }

    public final String getDocument_id() {
        return this.document_id;
    }

    public final String getReference_scope() {
        return this.reference_scope;
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reference_scope, AnonymousClass005.A0I(this.document_id, AnonymousClass001.A0G(this.target_id)));
    }

    public String toString() {
        return FGI.A0k("ManagedBrowserDocumentJson(target_id=", this.target_id, ", document_id=", this.document_id, ", reference_scope=", this.reference_scope, ")");
    }

    public ManagedBrowserDocumentJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.target_id = str;
        this.document_id = str2;
        this.reference_scope = str3;
    }

    public final ManagedBrowserDocumentJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ManagedBrowserDocumentJson(str, str2, str3);
    }

    public /* synthetic */ ManagedBrowserDocumentJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ManagedBrowserDocumentJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.target_id = str;
        this.document_id = str2;
        this.reference_scope = str3;
    }
}
