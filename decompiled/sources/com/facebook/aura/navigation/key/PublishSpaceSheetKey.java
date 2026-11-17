package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PublishSpaceSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String previewUri;
    public final String slug;
    public final String title;

    public final class Companion {
        public final C9hr<PublishSpaceSheetKey> serializer() {
            return PublishSpaceSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PublishSpaceSheetKey(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
        this.title = str2;
        this.previewUri = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(PublishSpaceSheetKey publishSpaceSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(publishSpaceSheetKey.slug, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || publishSpaceSheetKey.title != null) {
            c9j5.AAP(publishSpaceSheetKey.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || publishSpaceSheetKey.previewUri != null) {
            c9j5.AAP(publishSpaceSheetKey.previewUri, C07779iq.A01, c9iZ, 2);
        }
    }

    public final PublishSpaceSheetKey copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new PublishSpaceSheetKey(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PublishSpaceSheetKey) {
                PublishSpaceSheetKey publishSpaceSheetKey = (PublishSpaceSheetKey) obj;
                if (!C7384Etj.areEqual(this.slug, publishSpaceSheetKey.slug) || !C7384Etj.areEqual(this.title, publishSpaceSheetKey.title) || !C7384Etj.areEqual(this.previewUri, publishSpaceSheetKey.previewUri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PublishSpaceSheetKey copy$default(PublishSpaceSheetKey publishSpaceSheetKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishSpaceSheetKey.slug;
        }
        if ((i & 2) != 0) {
            str2 = publishSpaceSheetKey.title;
        }
        if ((i & 4) != 0) {
            str3 = publishSpaceSheetKey.previewUri;
        }
        return publishSpaceSheetKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.previewUri;
    }

    public final String getPreviewUri() {
        return this.previewUri;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.slug) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass005.A0H(this.previewUri);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PublishSpaceSheetKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PublishSpaceSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.slug = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.previewUri = null;
        } else {
            this.previewUri = str3;
        }
    }

    public /* synthetic */ PublishSpaceSheetKey(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
