package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
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
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ManagedBrowserSensitiveSitePolicyJson {
    public static final int $stable = 8;
    public final List<String> hosts;
    public final String policy_digest;
    public final int schema_version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, new Function0() { // from class: com.facebook.aura.localbrowser.ManagedBrowserSensitiveSitePolicyJson$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = ManagedBrowserSensitiveSitePolicyJson.$stable;
            return AnonymousClass001.A13();
        }
    });

    public final class Companion {
        public final C9hr<ManagedBrowserSensitiveSitePolicyJson> serializer() {
            return ManagedBrowserSensitiveSitePolicyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserSensitiveSitePolicyJson) {
                ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson = (ManagedBrowserSensitiveSitePolicyJson) obj;
                if (this.schema_version != managedBrowserSensitiveSitePolicyJson.schema_version || !C7384Etj.areEqual(this.hosts, managedBrowserSensitiveSitePolicyJson.hosts) || !C7384Etj.areEqual(this.policy_digest, managedBrowserSensitiveSitePolicyJson.policy_digest)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManagedBrowserSensitiveSitePolicyJson copy$default(ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, int i, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = managedBrowserSensitiveSitePolicyJson.schema_version;
        }
        if ((i2 & 2) != 0) {
            list = managedBrowserSensitiveSitePolicyJson.hosts;
        }
        if ((i2 & 4) != 0) {
            str = managedBrowserSensitiveSitePolicyJson.policy_digest;
        }
        return managedBrowserSensitiveSitePolicyJson.copy(i, list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAK(c9iZ, 0, managedBrowserSensitiveSitePolicyJson.schema_version);
        c9j5.AAQ(managedBrowserSensitiveSitePolicyJson.hosts, C3cH.A15(f0cArr, 1), c9iZ, 1);
        c9j5.AAV(managedBrowserSensitiveSitePolicyJson.policy_digest, c9iZ, 2);
    }

    public final int component1() {
        return this.schema_version;
    }

    public final List<String> component2() {
        return this.hosts;
    }

    public final String component3() {
        return this.policy_digest;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getPolicy_digest() {
        return this.policy_digest;
    }

    public final int getSchema_version() {
        return this.schema_version;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.policy_digest, AnonymousClass005.A0F(this.hosts, this.schema_version * 31));
    }

    public String toString() {
        int i = this.schema_version;
        List<String> list = this.hosts;
        String str = this.policy_digest;
        StringBuilder sbA0y = C60O.A0y("ManagedBrowserSensitiveSitePolicyJson(schema_version=", i);
        sbA0y.append(", hosts=");
        sbA0y.append(list);
        return C3cJ.A0N(", policy_digest=", str, sbA0y);
    }

    public ManagedBrowserSensitiveSitePolicyJson(int i, List<String> list, String str) {
        AnonymousClass003.A0x(list, str);
        this.schema_version = i;
        this.hosts = list;
        this.policy_digest = str;
    }

    public final ManagedBrowserSensitiveSitePolicyJson copy(int i, List<String> list, String str) {
        AnonymousClass003.A0x(list, str);
        return new ManagedBrowserSensitiveSitePolicyJson(i, list, str);
    }

    public /* synthetic */ ManagedBrowserSensitiveSitePolicyJson(int i, int i2, List list, String str, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ManagedBrowserSensitiveSitePolicyJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.schema_version = i2;
        this.hosts = list;
        this.policy_digest = str;
    }
}
