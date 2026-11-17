package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsRenameRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean create_parent;
    public final String destination;
    public final String source;

    public final class Companion {
        public final C9hr<FsRenameRequestJson> serializer() {
            return FsRenameRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsRenameRequestJson fsRenameRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsRenameRequestJson.source, c9iZ, 0);
        c9j5.AAV(fsRenameRequestJson.destination, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, fsRenameRequestJson.create_parent);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsRenameRequestJson) {
                FsRenameRequestJson fsRenameRequestJson = (FsRenameRequestJson) obj;
                if (!C7384Etj.areEqual(this.source, fsRenameRequestJson.source) || !C7384Etj.areEqual(this.destination, fsRenameRequestJson.destination) || this.create_parent != fsRenameRequestJson.create_parent) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsRenameRequestJson copy$default(FsRenameRequestJson fsRenameRequestJson, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsRenameRequestJson.source;
        }
        if ((i & 2) != 0) {
            str2 = fsRenameRequestJson.destination;
        }
        if ((i & 4) != 0) {
            z = fsRenameRequestJson.create_parent;
        }
        return fsRenameRequestJson.copy(str, str2, z);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.destination;
    }

    public final boolean component3() {
        return this.create_parent;
    }

    public final boolean getCreate_parent() {
        return this.create_parent;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.destination, AnonymousClass001.A0G(this.source)), this.create_parent);
    }

    public FsRenameRequestJson(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.source = str;
        this.destination = str2;
        this.create_parent = z;
    }

    public final FsRenameRequestJson copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new FsRenameRequestJson(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsRenameRequestJson(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(FsRenameRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.source = str;
        this.destination = str2;
        this.create_parent = z;
    }
}
