package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SecureStorageCustomConnectorDetailsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String host;
    public final String name;

    public final class Companion {
        public final C9hr<SecureStorageCustomConnectorDetailsScreenKey> serializer() {
            return SecureStorageCustomConnectorDetailsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(secureStorageCustomConnectorDetailsScreenKey.name, c9iZ, 0);
        c9j5.AAV(secureStorageCustomConnectorDetailsScreenKey.host, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageCustomConnectorDetailsScreenKey) {
                SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey = (SecureStorageCustomConnectorDetailsScreenKey) obj;
                if (!C7384Etj.areEqual(this.name, secureStorageCustomConnectorDetailsScreenKey.name) || !C7384Etj.areEqual(this.host, secureStorageCustomConnectorDetailsScreenKey.host)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey copy$default(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secureStorageCustomConnectorDetailsScreenKey.name;
        }
        if ((i & 2) != 0) {
            str2 = secureStorageCustomConnectorDetailsScreenKey.host;
        }
        AnonymousClass003.A0u(str, str2);
        return new SecureStorageCustomConnectorDetailsScreenKey(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.host;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.host, AnonymousClass001.A0G(this.name));
    }

    public SecureStorageCustomConnectorDetailsScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.host = str2;
    }

    public final SecureStorageCustomConnectorDetailsScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new SecureStorageCustomConnectorDetailsScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SecureStorageCustomConnectorDetailsScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.host = str2;
    }
}
