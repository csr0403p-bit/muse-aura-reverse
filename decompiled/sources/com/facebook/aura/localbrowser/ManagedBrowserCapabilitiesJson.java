package com.facebook.aura.localbrowser;

import X.A65;
import X.AnonymousClass005;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserCapabilitiesJson {
    public static final int $stable = 8;
    public final Set<String> capabilities;
    public final int protocol_version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, new Function0() { // from class: com.facebook.aura.localbrowser.ManagedBrowserCapabilitiesJson$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = ManagedBrowserCapabilitiesJson.$stable;
            return new A65(C07779iq.A01);
        }
    });

    public final class Companion {
        public final C9hr<ManagedBrowserCapabilitiesJson> serializer() {
            return ManagedBrowserCapabilitiesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ManagedBrowserCapabilitiesJson(int i, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        this.protocol_version = i;
        this.capabilities = set;
    }

    public final ManagedBrowserCapabilitiesJson copy(int i, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        return new ManagedBrowserCapabilitiesJson(i, set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserCapabilitiesJson) {
                ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = (ManagedBrowserCapabilitiesJson) obj;
                if (this.protocol_version != managedBrowserCapabilitiesJson.protocol_version || !C7384Etj.areEqual(this.capabilities, managedBrowserCapabilitiesJson.capabilities)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C9hr $r8$lambda$JgEjStWX4h5qgGWWSsRwZk_LB_Y() {
        return new A65(C07779iq.A01);
    }

    public static final /* synthetic */ C9hr _childSerializers$_anonymous_() {
        return new A65(C07779iq.A01);
    }

    public static /* synthetic */ ManagedBrowserCapabilitiesJson copy$default(ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, int i, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = managedBrowserCapabilitiesJson.protocol_version;
        }
        if ((i2 & 2) != 0) {
            set = managedBrowserCapabilitiesJson.capabilities;
        }
        C7384Etj.A0Y(set, 1);
        return new ManagedBrowserCapabilitiesJson(i, set);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAK(c9iZ, 0, managedBrowserCapabilitiesJson.protocol_version);
        c9j5.AAQ(managedBrowserCapabilitiesJson.capabilities, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final int component1() {
        return this.protocol_version;
    }

    public final Set<String> component2() {
        return this.capabilities;
    }

    public final Set<String> getCapabilities() {
        return this.capabilities;
    }

    public final int getProtocol_version() {
        return this.protocol_version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.capabilities, this.protocol_version * 31);
    }

    public String toString() {
        return C3cJ.A0L(this.capabilities, ", capabilities=", C60O.A0y("ManagedBrowserCapabilitiesJson(protocol_version=", this.protocol_version));
    }

    public /* synthetic */ ManagedBrowserCapabilitiesJson(int i, int i2, Set set, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ManagedBrowserCapabilitiesJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.protocol_version = i2;
        this.capabilities = set;
    }
}
