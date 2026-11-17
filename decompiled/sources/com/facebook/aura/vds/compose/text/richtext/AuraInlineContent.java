package com.facebook.aura.vds.compose.text.richtext;

import X.AHD;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class AuraInlineContent extends C06G {
    public static final int $stable = 0;
    public final AHD<AuraInlineContentItem> contentData;

    public AuraInlineContent(AHD<AuraInlineContentItem> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.contentData = ahd;
    }

    public final AuraInlineContent copy(AHD<AuraInlineContentItem> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new AuraInlineContent(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraInlineContent) && C7384Etj.areEqual(this.contentData, ((AuraInlineContent) obj).contentData));
    }

    public static /* synthetic */ AuraInlineContent copy$default(AuraInlineContent auraInlineContent, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = auraInlineContent.contentData;
        }
        C7384Etj.A0Y(ahd, 0);
        return new AuraInlineContent(ahd);
    }

    public final AHD<AuraInlineContentItem> component1() {
        return this.contentData;
    }

    public final AHD<AuraInlineContentItem> getContentData() {
        return this.contentData;
    }

    public int hashCode() {
        return this.contentData.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
