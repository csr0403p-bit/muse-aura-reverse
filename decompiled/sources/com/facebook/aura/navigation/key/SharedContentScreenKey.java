package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
/* loaded from: classes3.dex */
public final class SharedContentScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String shareKey;
    public final String slug;

    public final class Companion {
        public final C9hr<SharedContentScreenKey> serializer() {
            return SharedContentScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SharedContentScreenKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
        this.shareKey = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SharedContentScreenKey sharedContentScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(sharedContentScreenKey.slug, c9iZ, 0);
        if (c9j5.AfR() || sharedContentScreenKey.shareKey != null) {
            c9j5.AAP(sharedContentScreenKey.shareKey, C07779iq.A01, c9iZ, 1);
        }
    }

    public final SharedContentScreenKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SharedContentScreenKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedContentScreenKey) {
                SharedContentScreenKey sharedContentScreenKey = (SharedContentScreenKey) obj;
                if (!C7384Etj.areEqual(this.slug, sharedContentScreenKey.slug) || !C7384Etj.areEqual(this.shareKey, sharedContentScreenKey.shareKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedContentScreenKey copy$default(SharedContentScreenKey sharedContentScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedContentScreenKey.slug;
        }
        if ((i & 2) != 0) {
            str2 = sharedContentScreenKey.shareKey;
        }
        C7384Etj.A0Y(str, 0);
        return new SharedContentScreenKey(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.shareKey;
    }

    public final String getShareKey() {
        return this.shareKey;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.slug) + AnonymousClass006.A0G(this.shareKey);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedContentScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SharedContentScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.slug = str;
        this.shareKey = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ SharedContentScreenKey(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
