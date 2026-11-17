package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.shopping.model.ShoppingFeaturedProduct;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes.dex */
public final class HatchAttachmentFile extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentAudio audio;
    public final Long byteLen;
    public final List<ShoppingFeaturedProduct> featuredProducts;
    public final HatchAttachmentKind kind;
    public final String label;
    public final String mime;
    public final boolean missing;
    public final String originalUrl;
    public final String path;

    public final class Companion {
        public final C9hr<HatchAttachmentFile> serializer() {
            return HatchAttachmentFile$$serializer.INSTANCE;
        }

        public final HatchAttachmentFile fromJson(JsonElement jsonElement) {
            return HatchAttachmentPresentationJsonKt.parseAttachmentFile(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(num, HatchAttachmentFile$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, HatchAttachmentFile$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAttachmentFile) {
                HatchAttachmentFile hatchAttachmentFile = (HatchAttachmentFile) obj;
                if (!C7384Etj.areEqual(this.path, hatchAttachmentFile.path) || !C7384Etj.areEqual(this.label, hatchAttachmentFile.label) || !C7384Etj.areEqual(this.mime, hatchAttachmentFile.mime) || !C7384Etj.areEqual(this.byteLen, hatchAttachmentFile.byteLen) || this.missing != hatchAttachmentFile.missing || !C7384Etj.areEqual(this.originalUrl, hatchAttachmentFile.originalUrl) || this.kind != hatchAttachmentFile.kind || !C7384Etj.areEqual(this.audio, hatchAttachmentFile.audio) || !C7384Etj.areEqual(this.featuredProducts, hatchAttachmentFile.featuredProducts)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchAttachmentFile(int i, String str, String str2, String str3, Long l, boolean z, String str4, HatchAttachmentKind hatchAttachmentKind, HatchAttachmentAudio hatchAttachmentAudio, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchAttachmentFile$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.label = str2;
        if ((i & 4) == 0) {
            this.mime = null;
        } else {
            this.mime = str3;
        }
        if ((i & 8) == 0) {
            this.byteLen = null;
        } else {
            this.byteLen = l;
        }
        if ((i & 16) == 0) {
            this.missing = false;
        } else {
            this.missing = z;
        }
        if ((i & 32) == 0) {
            this.originalUrl = null;
        } else {
            this.originalUrl = str4;
        }
        if ((i & 64) == 0) {
            this.kind = null;
        } else {
            this.kind = hatchAttachmentKind;
        }
        if ((i & 128) == 0) {
            this.audio = null;
        } else {
            this.audio = hatchAttachmentAudio;
        }
        if ((i & 256) == 0) {
            this.featuredProducts = C0881AGi.A00;
        } else {
            this.featuredProducts = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchAttachmentFile copy$default(HatchAttachmentFile hatchAttachmentFile, String str, String str2, String str3, Long l, boolean z, String str4, HatchAttachmentKind hatchAttachmentKind, HatchAttachmentAudio hatchAttachmentAudio, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAttachmentFile.path;
        }
        if ((i & 2) != 0) {
            str2 = hatchAttachmentFile.label;
        }
        if ((i & 4) != 0) {
            str3 = hatchAttachmentFile.mime;
        }
        if ((i & 8) != 0) {
            l = hatchAttachmentFile.byteLen;
        }
        if ((i & 16) != 0) {
            z = hatchAttachmentFile.missing;
        }
        if ((i & 32) != 0) {
            str4 = hatchAttachmentFile.originalUrl;
        }
        if ((i & 64) != 0) {
            hatchAttachmentKind = hatchAttachmentFile.kind;
        }
        if ((i & 128) != 0) {
            hatchAttachmentAudio = hatchAttachmentFile.audio;
        }
        if ((i & 256) != 0) {
            list = hatchAttachmentFile.featuredProducts;
        }
        return hatchAttachmentFile.copy(str, str2, str3, l, z, str4, hatchAttachmentKind, hatchAttachmentAudio, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchAttachmentFile hatchAttachmentFile, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchAttachmentFile.path, c9iZ, 0);
        c9j5.AAV(hatchAttachmentFile.label, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchAttachmentFile.mime != null) {
            c9j5.AAP(hatchAttachmentFile.mime, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAttachmentFile.byteLen != null) {
            c9j5.AAP(hatchAttachmentFile.byteLen, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || hatchAttachmentFile.missing) {
            c9j5.AA7(c9iZ, 4, hatchAttachmentFile.missing);
        }
        if (zAfR || hatchAttachmentFile.originalUrl != null) {
            c9j5.AAP(hatchAttachmentFile.originalUrl, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || hatchAttachmentFile.kind != null) {
            c9j5.AAP(hatchAttachmentFile.kind, C06G.A0e(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || hatchAttachmentFile.audio != null) {
            c9j5.AAP(hatchAttachmentFile.audio, HatchAttachmentAudio$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || !C7384Etj.areEqual(hatchAttachmentFile.featuredProducts, C0881AGi.A00)) {
            c9j5.AAQ(hatchAttachmentFile.featuredProducts, C06G.A0e(f0cArr, 8), c9iZ, 8);
        }
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.mime;
    }

    public final Long component4() {
        return this.byteLen;
    }

    public final boolean component5() {
        return this.missing;
    }

    public final String component6() {
        return this.originalUrl;
    }

    public final HatchAttachmentKind component7() {
        return this.kind;
    }

    public final HatchAttachmentAudio component8() {
        return this.audio;
    }

    public final List<ShoppingFeaturedProduct> component9() {
        return this.featuredProducts;
    }

    public final HatchAttachmentAudio getAudio() {
        return this.audio;
    }

    public final Long getByteLen() {
        return this.byteLen;
    }

    public final List<ShoppingFeaturedProduct> getFeaturedProducts() {
        return this.featuredProducts;
    }

    public final HatchAttachmentKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMime() {
        return this.mime;
    }

    public final boolean getMissing() {
        return this.missing;
    }

    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.featuredProducts, (((((C0KA.A01((((AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.path)) + AnonymousClass006.A0G(this.mime)) * 31) + AnonymousClass006.A0D(this.byteLen)) * 31, this.missing) + AnonymousClass006.A0G(this.originalUrl)) * 31) + AnonymousClass006.A0D(this.kind)) * 31) + C06G.A04(this.audio)) * 31);
    }

    public final HatchAttachmentFile copy(String str, String str2, String str3, Long l, boolean z, String str4, HatchAttachmentKind hatchAttachmentKind, HatchAttachmentAudio hatchAttachmentAudio, List<ShoppingFeaturedProduct> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 8);
        return new HatchAttachmentFile(str, str2, str3, l, z, str4, hatchAttachmentKind, hatchAttachmentAudio, list);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAttachmentFile(String str, String str2, String str3, Long l, boolean z, String str4, HatchAttachmentKind hatchAttachmentKind, HatchAttachmentAudio hatchAttachmentAudio, List<ShoppingFeaturedProduct> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 8);
        this.path = str;
        this.label = str2;
        this.mime = str3;
        this.byteLen = l;
        this.missing = z;
        this.originalUrl = str4;
        this.kind = hatchAttachmentKind;
        this.audio = hatchAttachmentAudio;
        this.featuredProducts = list;
    }

    public /* synthetic */ HatchAttachmentFile(String str, String str2, String str3, Long l, boolean z, String str4, HatchAttachmentKind hatchAttachmentKind, HatchAttachmentAudio hatchAttachmentAudio, List list, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : hatchAttachmentKind, (i & 128) != 0 ? null : hatchAttachmentAudio, (i & 256) != 0 ? C0881AGi.A00 : list);
    }
}
