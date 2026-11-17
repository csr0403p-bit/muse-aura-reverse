package com.facebook.aura.skills.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface Consent {

    public final class HatchManaged extends C06G implements Consent {
        public final AHD<ConsentBullet> bullets;
        public final AHD<String> calloutParagraphs;
        public final String calloutTitle;
        public final AHD<String> footerParagraphs;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HatchManaged) {
                    HatchManaged hatchManaged = (HatchManaged) obj;
                    if (!C7384Etj.areEqual(this.bullets, hatchManaged.bullets) || !C7384Etj.areEqual(this.footerParagraphs, hatchManaged.footerParagraphs) || !C7384Etj.areEqual(this.calloutParagraphs, hatchManaged.calloutParagraphs) || !C7384Etj.areEqual(this.calloutTitle, hatchManaged.calloutTitle)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ HatchManaged copy$default(HatchManaged hatchManaged, AHD ahd, AHD ahd2, AHD ahd3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = hatchManaged.bullets;
            }
            if ((i & 2) != 0) {
                ahd2 = hatchManaged.footerParagraphs;
            }
            if ((i & 4) != 0) {
                ahd3 = hatchManaged.calloutParagraphs;
            }
            if ((i & 8) != 0) {
                str = hatchManaged.calloutTitle;
            }
            AnonymousClass005.A0x(ahd, ahd2, ahd3);
            return new HatchManaged(ahd, ahd2, ahd3, str);
        }

        public final AHD<ConsentBullet> component1() {
            return this.bullets;
        }

        public final AHD<String> component2() {
            return this.footerParagraphs;
        }

        public final AHD<String> component3() {
            return this.calloutParagraphs;
        }

        public final String component4() {
            return this.calloutTitle;
        }

        public final AHD<ConsentBullet> getBullets() {
            return this.bullets;
        }

        public final AHD<String> getCalloutParagraphs() {
            return this.calloutParagraphs;
        }

        public final String getCalloutTitle() {
            return this.calloutTitle;
        }

        public final AHD<String> getFooterParagraphs() {
            return this.footerParagraphs;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.calloutParagraphs, AnonymousClass005.A0F(this.footerParagraphs, AnonymousClass005.A0E(this.bullets))) + AnonymousClass006.A0G(this.calloutTitle);
        }

        public HatchManaged(AHD<ConsentBullet> ahd, AHD<String> ahd2, AHD<String> ahd3, String str) {
            AnonymousClass005.A0x(ahd, ahd2, ahd3);
            this.bullets = ahd;
            this.footerParagraphs = ahd2;
            this.calloutParagraphs = ahd3;
            this.calloutTitle = str;
        }

        public final HatchManaged copy(AHD<ConsentBullet> ahd, AHD<String> ahd2, AHD<String> ahd3, String str) {
            AnonymousClass005.A0x(ahd, ahd2, ahd3);
            return new HatchManaged(ahd, ahd2, ahd3, str);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ HatchManaged(AHD ahd, AHD ahd2, AHD ahd3, String str, int i, C06H c06h) {
            this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, (i & 4) != 0 ? AHI.A01 : ahd3, AnonymousClass006.A0u(i, str));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public HatchManaged() {
            AHI ahi = AHI.A01;
            this(ahi, ahi, ahi, null);
        }
    }
}
