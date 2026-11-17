package com.facebook.aura.navigation.key;

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
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SecureStorageCredentialDetailsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String displayName;
    public final String id;
    public final boolean openedFromChat;

    public final class Companion {
        public final C9hr<SecureStorageCredentialDetailsScreenKey> serializer() {
            return SecureStorageCredentialDetailsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(secureStorageCredentialDetailsScreenKey.id, c9iZ, 0);
        c9j5.AAV(secureStorageCredentialDetailsScreenKey.displayName, c9iZ, 1);
        if (c9j5.AfR() || secureStorageCredentialDetailsScreenKey.openedFromChat) {
            c9j5.AA7(c9iZ, 2, secureStorageCredentialDetailsScreenKey.openedFromChat);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageCredentialDetailsScreenKey) {
                SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey = (SecureStorageCredentialDetailsScreenKey) obj;
                if (!C7384Etj.areEqual(this.id, secureStorageCredentialDetailsScreenKey.id) || !C7384Etj.areEqual(this.displayName, secureStorageCredentialDetailsScreenKey.displayName) || this.openedFromChat != secureStorageCredentialDetailsScreenKey.openedFromChat) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SecureStorageCredentialDetailsScreenKey copy$default(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secureStorageCredentialDetailsScreenKey.id;
        }
        if ((i & 2) != 0) {
            str2 = secureStorageCredentialDetailsScreenKey.displayName;
        }
        if ((i & 4) != 0) {
            z = secureStorageCredentialDetailsScreenKey.openedFromChat;
        }
        return secureStorageCredentialDetailsScreenKey.copy(str, str2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final boolean component3() {
        return this.openedFromChat;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOpenedFromChat() {
        return this.openedFromChat;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.id)), this.openedFromChat);
    }

    public SecureStorageCredentialDetailsScreenKey(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.displayName = str2;
        this.openedFromChat = z;
    }

    public final SecureStorageCredentialDetailsScreenKey copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new SecureStorageCredentialDetailsScreenKey(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SecureStorageCredentialDetailsScreenKey(String str, String str2, boolean z, int i, C06H c06h) {
        this(str, str2, AnonymousClass005.A1O(i, z));
    }

    public /* synthetic */ SecureStorageCredentialDetailsScreenKey(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SecureStorageCredentialDetailsScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.displayName = str2;
        this.openedFromChat = (i & 4) == 0 ? false : z;
    }
}
