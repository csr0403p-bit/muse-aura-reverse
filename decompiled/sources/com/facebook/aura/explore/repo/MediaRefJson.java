package com.facebook.aura.explore.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class MediaRefJson extends C06G {
    public final String altText;
    public final List<MediaVariantJson> variants;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, MediaRefJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<MediaRefJson> serializer() {
            return MediaRefJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MediaRefJson(String str, List<MediaVariantJson> list) {
        C7384Etj.A0Y(list, 1);
        this.altText = str;
        this.variants = list;
    }

    public final MediaRefJson copy(String str, List<MediaVariantJson> list) {
        C7384Etj.A0Y(list, 1);
        return new MediaRefJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaRefJson) {
                MediaRefJson mediaRefJson = (MediaRefJson) obj;
                if (!C7384Etj.areEqual(this.altText, mediaRefJson.altText) || !C7384Etj.areEqual(this.variants, mediaRefJson.variants)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MediaRefJson copy$default(MediaRefJson mediaRefJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaRefJson.altText;
        }
        if ((i & 2) != 0) {
            list = mediaRefJson.variants;
        }
        C7384Etj.A0Y(list, 1);
        return new MediaRefJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(MediaRefJson mediaRefJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || mediaRefJson.altText != null) {
            c9j5.AAP(mediaRefJson.altText, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(mediaRefJson.variants)) {
            c9j5.AAQ(mediaRefJson.variants, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.altText;
    }

    public final List<MediaVariantJson> component2() {
        return this.variants;
    }

    public final MediaVariantJson firstVariant() {
        MediaVariantJson next;
        Iterator<MediaVariantJson> it = this.variants.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.url.length() > 0) {
                break;
            }
        }
        return next;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final List<MediaVariantJson> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.variants, AnonymousClass006.A0G(this.altText) * 31);
    }

    public final String firstUrl() {
        MediaVariantJson mediaVariantJsonFirstVariant = firstVariant();
        if (mediaVariantJsonFirstVariant != null) {
            return mediaVariantJsonFirstVariant.url;
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MediaRefJson(int i, String str, List list, C2hx c2hx) {
        this.altText = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.variants = C0881AGi.A00;
        } else {
            this.variants = list;
        }
    }

    public /* synthetic */ MediaRefJson(String str, List list, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), C3cI.A11(list, i));
    }

    public MediaRefJson() {
        this(null, C0881AGi.A00);
    }
}
