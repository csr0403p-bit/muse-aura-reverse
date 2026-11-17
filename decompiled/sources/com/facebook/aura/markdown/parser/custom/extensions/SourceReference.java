package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SourceReference {
    public final int index;
    public final String title;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SourceReference) {
                SourceReference sourceReference = (SourceReference) obj;
                if (this.index != sourceReference.index || !C7384Etj.areEqual(this.title, sourceReference.title) || !C7384Etj.areEqual(this.url, sourceReference.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SourceReference copy$default(SourceReference sourceReference, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sourceReference.index;
        }
        if ((i2 & 2) != 0) {
            str = sourceReference.title;
        }
        if ((i2 & 4) != 0) {
            str2 = sourceReference.url;
        }
        return new SourceReference(i, str, str2);
    }

    public final int component1() {
        return this.index;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.url;
    }

    public final SourceReference copy(int i, String str, String str2) {
        return new SourceReference(i, str, str2);
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.index * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass005.A0H(this.url);
    }

    public String toString() {
        int i = this.index;
        String str = this.title;
        String str2 = this.url;
        StringBuilder sbA0y = C60O.A0y("SourceReference(index=", i);
        sbA0y.append(", title=");
        sbA0y.append(str);
        return C3cJ.A0N(", url=", str2, sbA0y);
    }

    public SourceReference(int i, String str, String str2) {
        this.index = i;
        this.title = str;
        this.url = str2;
    }
}
