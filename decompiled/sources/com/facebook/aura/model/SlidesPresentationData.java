package com.facebook.aura.model;

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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class SlidesPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentFile deck;
    public final String slug;

    public final class Companion {
        public final C9hr<SlidesPresentationData> serializer() {
            return SlidesPresentationData$$serializer.INSTANCE;
        }

        public final SlidesPresentationData fromJson(JsonElement jsonElement) {
            return HatchAttachmentPresentationJsonKt.parseSlidesPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SlidesPresentationData(HatchAttachmentFile hatchAttachmentFile, String str) {
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        this.deck = hatchAttachmentFile;
        this.slug = str;
    }

    public final SlidesPresentationData copy(HatchAttachmentFile hatchAttachmentFile, String str) {
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        return new SlidesPresentationData(hatchAttachmentFile, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SlidesPresentationData) {
                SlidesPresentationData slidesPresentationData = (SlidesPresentationData) obj;
                if (!C7384Etj.areEqual(this.deck, slidesPresentationData.deck) || !C7384Etj.areEqual(this.slug, slidesPresentationData.slug)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SlidesPresentationData copy$default(SlidesPresentationData slidesPresentationData, HatchAttachmentFile hatchAttachmentFile, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentFile = slidesPresentationData.deck;
        }
        if ((i & 2) != 0) {
            str = slidesPresentationData.slug;
        }
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        return new SlidesPresentationData(hatchAttachmentFile, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SlidesPresentationData slidesPresentationData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(slidesPresentationData.deck, HatchAttachmentFile$$serializer.INSTANCE, c9iZ, 0);
        if (c9j5.AfR() || slidesPresentationData.slug != null) {
            c9j5.AAP(slidesPresentationData.slug, C07779iq.A01, c9iZ, 1);
        }
    }

    public final HatchAttachmentFile component1() {
        return this.deck;
    }

    public final String component2() {
        return this.slug;
    }

    public final HatchAttachmentFile getDeck() {
        return this.deck;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.deck) + AnonymousClass006.A0G(this.slug);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SlidesPresentationData(int i, HatchAttachmentFile hatchAttachmentFile, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SlidesPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.deck = hatchAttachmentFile;
        this.slug = (i & 2) == 0 ? null : str;
    }

    public /* synthetic */ SlidesPresentationData(HatchAttachmentFile hatchAttachmentFile, String str, int i, C06H c06h) {
        this(hatchAttachmentFile, AnonymousClass006.A0s(i, str));
    }
}
