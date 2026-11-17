package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserFenceJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ManagedBrowserBindingJson binding;
    public final int capability_version;
    public final long deadline_at_ms;
    public final ManagedBrowserDocumentJson document;
    public final String operation_id;
    public final long state_revision;

    public final class Companion {
        public final C9hr<ManagedBrowserFenceJson> serializer() {
            return ManagedBrowserFenceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ManagedBrowserFenceJson copy$default(ManagedBrowserFenceJson managedBrowserFenceJson, ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, long j, long j2, int i, int i2, Object obj) {
        ManagedBrowserBindingJson managedBrowserBindingJson2 = managedBrowserBindingJson;
        ManagedBrowserDocumentJson managedBrowserDocumentJson2 = managedBrowserDocumentJson;
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        int i3 = i;
        if ((i2 & 1) != 0) {
            managedBrowserBindingJson2 = managedBrowserFenceJson.binding;
        }
        if ((i2 & 2) != 0) {
            managedBrowserDocumentJson2 = managedBrowserFenceJson.document;
        }
        if ((i2 & 4) != 0) {
            str2 = managedBrowserFenceJson.operation_id;
        }
        if ((i2 & 8) != 0) {
            j3 = managedBrowserFenceJson.state_revision;
        }
        if ((i2 & 16) != 0) {
            j4 = managedBrowserFenceJson.deadline_at_ms;
        }
        if ((i2 & 32) != 0) {
            i3 = managedBrowserFenceJson.capability_version;
        }
        AnonymousClass003.A0v(managedBrowserBindingJson2, str2);
        return new ManagedBrowserFenceJson(managedBrowserBindingJson2, managedBrowserDocumentJson2, str2, j3, j4, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserFenceJson) {
                ManagedBrowserFenceJson managedBrowserFenceJson = (ManagedBrowserFenceJson) obj;
                if (!C7384Etj.areEqual(this.binding, managedBrowserFenceJson.binding) || !C7384Etj.areEqual(this.document, managedBrowserFenceJson.document) || !C7384Etj.areEqual(this.operation_id, managedBrowserFenceJson.operation_id) || this.state_revision != managedBrowserFenceJson.state_revision || this.deadline_at_ms != managedBrowserFenceJson.deadline_at_ms || this.capability_version != managedBrowserFenceJson.capability_version) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserFenceJson(int i, ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, long j, long j2, int i2, C2hx c2hx) {
        if (61 != (i & 61)) {
            C9iI.A00(ManagedBrowserFenceJson$$serializer.descriptor, i, 61);
            throw F60.createAndThrow();
        }
        this.binding = managedBrowserBindingJson;
        if ((i & 2) == 0) {
            this.document = null;
        } else {
            this.document = managedBrowserDocumentJson;
        }
        this.operation_id = str;
        this.state_revision = j;
        this.deadline_at_ms = j2;
        this.capability_version = i2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserFenceJson managedBrowserFenceJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(managedBrowserFenceJson.binding, ManagedBrowserBindingJson$$serializer.INSTANCE, c9iZ, 0);
        if (c9j5.AfR() || managedBrowserFenceJson.document != null) {
            c9j5.AAP(managedBrowserFenceJson.document, ManagedBrowserDocumentJson$$serializer.INSTANCE, c9iZ, 1);
        }
        c9j5.AAV(managedBrowserFenceJson.operation_id, c9iZ, 2);
        c9j5.AAN(c9iZ, 3, managedBrowserFenceJson.state_revision);
        c9j5.AAN(c9iZ, 4, managedBrowserFenceJson.deadline_at_ms);
        c9j5.AAK(c9iZ, 5, managedBrowserFenceJson.capability_version);
    }

    public final ManagedBrowserBindingJson component1() {
        return this.binding;
    }

    public final ManagedBrowserDocumentJson component2() {
        return this.document;
    }

    public final String component3() {
        return this.operation_id;
    }

    public final long component4() {
        return this.state_revision;
    }

    public final long component5() {
        return this.deadline_at_ms;
    }

    public final int component6() {
        return this.capability_version;
    }

    public final ManagedBrowserBindingJson getBinding() {
        return this.binding;
    }

    public final int getCapability_version() {
        return this.capability_version;
    }

    public final long getDeadline_at_ms() {
        return this.deadline_at_ms;
    }

    public final ManagedBrowserDocumentJson getDocument() {
        return this.document;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public final long getState_revision() {
        return this.state_revision;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.deadline_at_ms, AnonymousClass006.A06(this.state_revision, AnonymousClass005.A0I(this.operation_id, (AnonymousClass005.A0E(this.binding) + AnonymousClass006.A0D(this.document)) * 31))) + this.capability_version;
    }

    public String toString() {
        ManagedBrowserBindingJson managedBrowserBindingJson = this.binding;
        ManagedBrowserDocumentJson managedBrowserDocumentJson = this.document;
        String str = this.operation_id;
        long j = this.state_revision;
        long j2 = this.deadline_at_ms;
        int i = this.capability_version;
        StringBuilder sbA0f = C3cG.A0f(managedBrowserBindingJson, "ManagedBrowserFenceJson(binding=");
        sbA0f.append(", document=");
        sbA0f.append(managedBrowserDocumentJson);
        sbA0f.append(", operation_id=");
        sbA0f.append(str);
        sbA0f.append(", state_revision=");
        sbA0f.append(j);
        sbA0f.append(", deadline_at_ms=");
        sbA0f.append(j2);
        sbA0f.append(", capability_version=");
        sbA0f.append(i);
        return AnonymousClass001.A0v(")", sbA0f);
    }

    public final ManagedBrowserFenceJson copy(ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, long j, long j2, int i) {
        AnonymousClass003.A0v(managedBrowserBindingJson, str);
        return new ManagedBrowserFenceJson(managedBrowserBindingJson, managedBrowserDocumentJson, str, j, j2, i);
    }

    public ManagedBrowserFenceJson(ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, long j, long j2, int i) {
        AnonymousClass003.A0v(managedBrowserBindingJson, str);
        this.binding = managedBrowserBindingJson;
        this.document = managedBrowserDocumentJson;
        this.operation_id = str;
        this.state_revision = j;
        this.deadline_at_ms = j2;
        this.capability_version = i;
    }

    public /* synthetic */ ManagedBrowserFenceJson(ManagedBrowserBindingJson managedBrowserBindingJson, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, long j, long j2, int i, int i2, C06H c06h) {
        this(managedBrowserBindingJson, (i2 & 2) != 0 ? null : managedBrowserDocumentJson, str, j, j2, i);
    }
}
