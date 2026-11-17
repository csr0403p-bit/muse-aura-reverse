package com.facebook.aura.opengraph;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes5.dex */
public interface HatchWebPageParseResult {

    public final class NeedsCharset extends C06G implements HatchWebPageParseResult {
        public final String charset;

        public NeedsCharset(String str) {
            C7384Etj.A0Y(str, 0);
            this.charset = str;
        }

        public final NeedsCharset copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NeedsCharset(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NeedsCharset) && C7384Etj.areEqual(this.charset, ((NeedsCharset) obj).charset));
        }

        public static /* synthetic */ NeedsCharset copy$default(NeedsCharset needsCharset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = needsCharset.charset;
            }
            C7384Etj.A0Y(str, 0);
            return new NeedsCharset(str);
        }

        public final String component1() {
            return this.charset;
        }

        public final String getCharset() {
            return this.charset;
        }

        public int hashCode() {
            return this.charset.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Parsed extends C06G implements HatchWebPageParseResult {
        public final HatchWebPageMetadata metadata;

        public Parsed(HatchWebPageMetadata hatchWebPageMetadata) {
            C7384Etj.A0Y(hatchWebPageMetadata, 0);
            this.metadata = hatchWebPageMetadata;
        }

        public final Parsed copy(HatchWebPageMetadata hatchWebPageMetadata) {
            C7384Etj.A0Y(hatchWebPageMetadata, 0);
            return new Parsed(hatchWebPageMetadata);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Parsed) && C7384Etj.areEqual(this.metadata, ((Parsed) obj).metadata));
        }

        public static /* synthetic */ Parsed copy$default(Parsed parsed, HatchWebPageMetadata hatchWebPageMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchWebPageMetadata = parsed.metadata;
            }
            C7384Etj.A0Y(hatchWebPageMetadata, 0);
            return new Parsed(hatchWebPageMetadata);
        }

        public final HatchWebPageMetadata component1() {
            return this.metadata;
        }

        public final HatchWebPageMetadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return this.metadata.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
