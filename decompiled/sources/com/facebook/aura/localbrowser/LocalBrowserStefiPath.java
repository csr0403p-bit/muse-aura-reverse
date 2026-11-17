package com.facebook.aura.localbrowser;

import X.AnonymousClass006;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface LocalBrowserStefiPath extends StefiHatchPath.Extension {

    public final class BrowserBlocklistCheck implements LocalBrowserStefiPath {
        public static final int $stable = 0;
        public static final BrowserBlocklistCheck INSTANCE = new BrowserBlocklistCheck();
        public static final String value = "/hatch/browser/blocklist/check";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowserBlocklistCheck);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BrowserBlocklistCheck";
        }

        public int hashCode() {
            return 438875749;
        }
    }

    public final class BrowserBlocklistFilter implements LocalBrowserStefiPath {
        public static final int $stable = 0;
        public final String have;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BrowserBlocklistFilter) && C7384Etj.areEqual(this.have, ((BrowserBlocklistFilter) obj).have));
        }

        public static /* synthetic */ BrowserBlocklistFilter copy$default(BrowserBlocklistFilter browserBlocklistFilter, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserBlocklistFilter.have;
            }
            return new BrowserBlocklistFilter(str);
        }

        public final String component1() {
            return this.have;
        }

        public final BrowserBlocklistFilter copy(String str) {
            return new BrowserBlocklistFilter(str);
        }

        public final String getHave() {
            return this.have;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            String str = this.have;
            return FGI.A0M("/hatch/browser/blocklist/filter", str != null ? FGI.A0M("?have=", Uri.encode(str)) : "");
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.have);
        }

        public String toString() {
            return C60O.A0r("BrowserBlocklistFilter(have=", this.have);
        }

        public BrowserBlocklistFilter(String str) {
            this.have = str;
        }
    }
}
