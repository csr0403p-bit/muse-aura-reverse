package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SlidesManifestJson extends C06G {
    public final String main_title;
    public final List<SlideManifestEntryJson> slides;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, SlidesManifestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SlidesManifestJson> serializer() {
            return SlidesManifestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SlidesManifestJson) {
                SlidesManifestJson slidesManifestJson = (SlidesManifestJson) obj;
                if (!C7384Etj.areEqual(this.main_title, slidesManifestJson.main_title) || !C7384Etj.areEqual(this.slides, slidesManifestJson.slides)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SlidesManifestJson copy$default(SlidesManifestJson slidesManifestJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slidesManifestJson.main_title;
        }
        if ((i & 2) != 0) {
            list = slidesManifestJson.slides;
        }
        AnonymousClass003.A0u(str, list);
        return new SlidesManifestJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_file_view_view(SlidesManifestJson slidesManifestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(slidesManifestJson.main_title)) {
            c9j5.AAV(slidesManifestJson.main_title, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(slidesManifestJson.slides)) {
            c9j5.AAQ(slidesManifestJson.slides, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.main_title;
    }

    public final List<SlideManifestEntryJson> component2() {
        return this.slides;
    }

    public final String getMain_title() {
        return this.main_title;
    }

    public final List<SlideManifestEntryJson> getSlides() {
        return this.slides;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.slides, AnonymousClass001.A0G(this.main_title));
    }

    public SlidesManifestJson(String str, List<SlideManifestEntryJson> list) {
        AnonymousClass003.A0u(str, list);
        this.main_title = str;
        this.slides = list;
    }

    public final SlidesManifestJson copy(String str, List<SlideManifestEntryJson> list) {
        AnonymousClass003.A0u(str, list);
        return new SlidesManifestJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlidesManifestJson(int i, String str, List list, C2hx c2hx) {
        this.main_title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.slides = C0881AGi.A00;
        } else {
            this.slides = list;
        }
    }

    public /* synthetic */ SlidesManifestJson(String str, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i));
    }

    public SlidesManifestJson() {
        this("", C0881AGi.A00);
    }
}
