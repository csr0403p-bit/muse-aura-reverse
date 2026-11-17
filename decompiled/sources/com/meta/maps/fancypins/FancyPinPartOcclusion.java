package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import X.FGI;
import X.Hr7;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinPartOcclusion {
    public final List<Source> sources;
    public static final Companion Companion = new Companion();
    public static final FancyPinPartOcclusion CLEAR = new FancyPinPartOcclusion(C0881AGi.A00);

    public final class Source {
        public final String partId;
        public final String pinId;
        public final String variantId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Source) {
                    Source source = (Source) obj;
                    if (!C7384Etj.areEqual(this.pinId, source.pinId) || !C7384Etj.areEqual(this.partId, source.partId) || !C7384Etj.areEqual(this.variantId, source.variantId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Source copy$default(Source source, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = source.pinId;
            }
            if ((i & 2) != 0) {
                str2 = source.partId;
            }
            if ((i & 4) != 0) {
                str3 = source.variantId;
            }
            return source.copy(str, str2, str3);
        }

        public final String component1() {
            return this.pinId;
        }

        public final String component2() {
            return this.partId;
        }

        public final String component3() {
            return this.variantId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final String getPinId() {
            return this.pinId;
        }

        public final String getVariantId() {
            return this.variantId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.variantId, AnonymousClass005.A0I(this.partId, AnonymousClass001.A0G(this.pinId)));
        }

        public String toString() {
            return FGI.A0k("Source(pinId=", this.pinId, ", partId=", this.partId, ", variantId=", this.variantId, ")");
        }

        public Source(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.pinId = str;
            this.partId = str2;
            this.variantId = str3;
        }

        public final Source copy(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            return new Source(str, str2, str3);
        }
    }

    public FancyPinPartOcclusion(List<Source> list) {
        C7384Etj.A0Y(list, 0);
        this.sources = Hr7.A1H(list);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FancyPinPartOcclusion) && C7384Etj.areEqual(this.sources, ((FancyPinPartOcclusion) obj).sources);
        }
        return true;
    }

    public final Source getSource() {
        return (Source) AbstractC0878AGe.A0G(this.sources);
    }

    public final List<Source> getSources() {
        return this.sources;
    }

    public int hashCode() {
        return this.sources.hashCode();
    }

    public final boolean isOccluded() {
        return !this.sources.isEmpty();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FancyPinPartOcclusion(Source source) {
        List listSingletonList;
        if (source != null) {
            listSingletonList = Collections.singletonList(source);
        } else {
            listSingletonList = C0881AGi.A00;
        }
        this((List<Source>) listSingletonList);
    }
}
