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
/* loaded from: classes4.dex */
public final class LegalWebPageScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<LegalWebPageScreenKey> serializer() {
            return LegalWebPageScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(LegalWebPageScreenKey legalWebPageScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(legalWebPageScreenKey.url, c9iZ, 0);
        c9j5.AAV(legalWebPageScreenKey.title, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalWebPageScreenKey) {
                LegalWebPageScreenKey legalWebPageScreenKey = (LegalWebPageScreenKey) obj;
                if (!C7384Etj.areEqual(this.url, legalWebPageScreenKey.url) || !C7384Etj.areEqual(this.title, legalWebPageScreenKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LegalWebPageScreenKey copy$default(LegalWebPageScreenKey legalWebPageScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalWebPageScreenKey.url;
        }
        if ((i & 2) != 0) {
            str2 = legalWebPageScreenKey.title;
        }
        AnonymousClass003.A0u(str, str2);
        return new LegalWebPageScreenKey(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass001.A0G(this.url));
    }

    public LegalWebPageScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.title = str2;
    }

    public final LegalWebPageScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new LegalWebPageScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LegalWebPageScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LegalWebPageScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.url = str;
        this.title = str2;
    }
}
