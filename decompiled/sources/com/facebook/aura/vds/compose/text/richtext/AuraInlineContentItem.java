package com.facebook.aura.vds.compose.text.richtext;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class AuraInlineContentItem extends C06G {
    public static final int $stable = 0;
    public final String contentId;

    public AuraInlineContentItem(String str) {
        C7384Etj.A0Y(str, 0);
        this.contentId = str;
    }

    public final AuraInlineContentItem copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AuraInlineContentItem(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraInlineContentItem) && C7384Etj.areEqual(this.contentId, ((AuraInlineContentItem) obj).contentId));
    }

    public static /* synthetic */ AuraInlineContentItem copy$default(AuraInlineContentItem auraInlineContentItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraInlineContentItem.contentId;
        }
        C7384Etj.A0Y(str, 0);
        return new AuraInlineContentItem(str);
    }

    public final String component1() {
        return this.contentId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public int hashCode() {
        return this.contentId.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
