package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CitationPayload {
    public final Integer displayNumber;
    public final String id;
    public final String resolvedUrl;

    public CitationPayload(String str, String str2, Integer num) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.resolvedUrl = str2;
        this.displayNumber = num;
    }

    public final CitationPayload copy(String str, String str2, Integer num) {
        C7384Etj.A0Y(str, 0);
        return new CitationPayload(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CitationPayload) {
                CitationPayload citationPayload = (CitationPayload) obj;
                if (!C7384Etj.areEqual(this.id, citationPayload.id) || !C7384Etj.areEqual(this.resolvedUrl, citationPayload.resolvedUrl) || !C7384Etj.areEqual(this.displayNumber, citationPayload.displayNumber)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CitationPayload copy$default(CitationPayload citationPayload, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = citationPayload.id;
        }
        if ((i & 2) != 0) {
            str2 = citationPayload.resolvedUrl;
        }
        if ((i & 4) != 0) {
            num = citationPayload.displayNumber;
        }
        return citationPayload.copy(str, str2, num);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.resolvedUrl;
    }

    public final Integer component3() {
        return this.displayNumber;
    }

    public final Integer getDisplayNumber() {
        return this.displayNumber;
    }

    public final String getId() {
        return this.id;
    }

    public final String getResolvedUrl() {
        return this.resolvedUrl;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.resolvedUrl)) * 31) + C3cH.A02(this.displayNumber);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.resolvedUrl;
        Integer num = this.displayNumber;
        StringBuilder sbA0x = C3cI.A0x("CitationPayload(id=", str);
        sbA0x.append(", resolvedUrl=");
        sbA0x.append(str2);
        return C3cJ.A0L(num, ", displayNumber=", sbA0x);
    }

    public /* synthetic */ CitationPayload(String str, String str2, Integer num, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
