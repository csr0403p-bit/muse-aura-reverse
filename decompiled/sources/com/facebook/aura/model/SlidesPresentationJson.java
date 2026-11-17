package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SlidesPresentationJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentFileJson deck;
    public final String slug;

    public final class Companion {
        public final C9hr<SlidesPresentationJson> serializer() {
            return SlidesPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SlidesPresentationJson slidesPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || slidesPresentationJson.deck != null) {
            c9j5.AAP(slidesPresentationJson.deck, HatchAttachmentFileJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || slidesPresentationJson.slug != null) {
            c9j5.AAP(slidesPresentationJson.slug, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SlidesPresentationJson) {
                SlidesPresentationJson slidesPresentationJson = (SlidesPresentationJson) obj;
                if (!C7384Etj.areEqual(this.deck, slidesPresentationJson.deck) || !C7384Etj.areEqual(this.slug, slidesPresentationJson.slug)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SlidesPresentationJson copy$default(SlidesPresentationJson slidesPresentationJson, HatchAttachmentFileJson hatchAttachmentFileJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentFileJson = slidesPresentationJson.deck;
        }
        if ((i & 2) != 0) {
            str = slidesPresentationJson.slug;
        }
        return new SlidesPresentationJson(hatchAttachmentFileJson, str);
    }

    public final HatchAttachmentFileJson component1() {
        return this.deck;
    }

    public final String component2() {
        return this.slug;
    }

    public final SlidesPresentationJson copy(HatchAttachmentFileJson hatchAttachmentFileJson, String str) {
        return new SlidesPresentationJson(hatchAttachmentFileJson, str);
    }

    public final HatchAttachmentFileJson getDeck() {
        return this.deck;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.deck) * 31) + AnonymousClass005.A0H(this.slug);
    }

    public final SlidesPresentationData toDomain() {
        HatchAttachmentFile domain;
        String strA0l;
        HatchAttachmentFileJson hatchAttachmentFileJson = this.deck;
        String str = null;
        if (hatchAttachmentFileJson == null || (domain = hatchAttachmentFileJson.toDomain()) == null) {
            return null;
        }
        String str2 = this.slug;
        if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            str = strA0l;
        }
        return new SlidesPresentationData(domain, str);
    }

    public SlidesPresentationJson(HatchAttachmentFileJson hatchAttachmentFileJson, String str) {
        this.deck = hatchAttachmentFileJson;
        this.slug = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlidesPresentationJson(int i, HatchAttachmentFileJson hatchAttachmentFileJson, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.deck = null;
        } else {
            this.deck = hatchAttachmentFileJson;
        }
        if ((i & 2) == 0) {
            this.slug = null;
        } else {
            this.slug = str;
        }
    }

    public /* synthetic */ SlidesPresentationJson(HatchAttachmentFileJson hatchAttachmentFileJson, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchAttachmentFileJson, (i & 2) != 0 ? null : str);
    }

    public SlidesPresentationJson() {
        this(null, null);
    }
}
