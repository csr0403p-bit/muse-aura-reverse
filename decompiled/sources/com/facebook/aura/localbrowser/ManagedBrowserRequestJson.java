package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cJ;
import X.C60N;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserRequestJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ManagedBrowserFenceJson fence;
    public final ManagedBrowserOperationJson operation;

    public final class Companion {
        public final C9hr<ManagedBrowserRequestJson> serializer() {
            return ManagedBrowserRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserRequestJson) {
                ManagedBrowserRequestJson managedBrowserRequestJson = (ManagedBrowserRequestJson) obj;
                if (!C7384Etj.areEqual(this.fence, managedBrowserRequestJson.fence) || !C7384Etj.areEqual(this.operation, managedBrowserRequestJson.operation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ManagedBrowserRequestJson copy$default(ManagedBrowserRequestJson managedBrowserRequestJson, ManagedBrowserFenceJson managedBrowserFenceJson, ManagedBrowserOperationJson managedBrowserOperationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            managedBrowserFenceJson = managedBrowserRequestJson.fence;
        }
        if ((i & 2) != 0) {
            managedBrowserOperationJson = managedBrowserRequestJson.operation;
        }
        AnonymousClass003.A0u(managedBrowserFenceJson, managedBrowserOperationJson);
        return new ManagedBrowserRequestJson(managedBrowserFenceJson, managedBrowserOperationJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserRequestJson managedBrowserRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(managedBrowserRequestJson.fence, ManagedBrowserFenceJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAQ(managedBrowserRequestJson.operation, ManagedBrowserOperationJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public final ManagedBrowserFenceJson component1() {
        return this.fence;
    }

    public final ManagedBrowserOperationJson component2() {
        return this.operation;
    }

    public final ManagedBrowserFenceJson getFence() {
        return this.fence;
    }

    public final ManagedBrowserOperationJson getOperation() {
        return this.operation;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.operation, AnonymousClass005.A0E(this.fence));
    }

    public String toString() {
        ManagedBrowserFenceJson managedBrowserFenceJson = this.fence;
        return C3cJ.A0L(this.operation, C60N.A00(10), C3cG.A0f(managedBrowserFenceJson, "ManagedBrowserRequestJson(fence="));
    }

    public ManagedBrowserRequestJson(ManagedBrowserFenceJson managedBrowserFenceJson, ManagedBrowserOperationJson managedBrowserOperationJson) {
        AnonymousClass003.A0u(managedBrowserFenceJson, managedBrowserOperationJson);
        this.fence = managedBrowserFenceJson;
        this.operation = managedBrowserOperationJson;
    }

    public final ManagedBrowserRequestJson copy(ManagedBrowserFenceJson managedBrowserFenceJson, ManagedBrowserOperationJson managedBrowserOperationJson) {
        AnonymousClass003.A0u(managedBrowserFenceJson, managedBrowserOperationJson);
        return new ManagedBrowserRequestJson(managedBrowserFenceJson, managedBrowserOperationJson);
    }

    public /* synthetic */ ManagedBrowserRequestJson(int i, ManagedBrowserFenceJson managedBrowserFenceJson, ManagedBrowserOperationJson managedBrowserOperationJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ManagedBrowserRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.fence = managedBrowserFenceJson;
        this.operation = managedBrowserOperationJson;
    }
}
