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
import com.facebook.aura.navigation.AuraContentAreaNavKey;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LegalWebPageOverlayKey extends C06G implements AuraContentAreaNavKey, AuraOverlayNavKey {
    public static final Companion Companion = new Companion();
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<LegalWebPageOverlayKey> serializer() {
            return LegalWebPageOverlayKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(LegalWebPageOverlayKey legalWebPageOverlayKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(legalWebPageOverlayKey.url, c9iZ, 0);
        c9j5.AAV(legalWebPageOverlayKey.title, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalWebPageOverlayKey) {
                LegalWebPageOverlayKey legalWebPageOverlayKey = (LegalWebPageOverlayKey) obj;
                if (!C7384Etj.areEqual(this.url, legalWebPageOverlayKey.url) || !C7384Etj.areEqual(this.title, legalWebPageOverlayKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LegalWebPageOverlayKey copy$default(LegalWebPageOverlayKey legalWebPageOverlayKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalWebPageOverlayKey.url;
        }
        if ((i & 2) != 0) {
            str2 = legalWebPageOverlayKey.title;
        }
        AnonymousClass003.A0u(str, str2);
        return new LegalWebPageOverlayKey(str, str2);
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

    public LegalWebPageOverlayKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.title = str2;
    }

    public final LegalWebPageOverlayKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new LegalWebPageOverlayKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LegalWebPageOverlayKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LegalWebPageOverlayKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.url = str;
        this.title = str2;
    }
}
