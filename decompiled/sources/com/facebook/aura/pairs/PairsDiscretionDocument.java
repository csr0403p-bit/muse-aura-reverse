package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class PairsDiscretionDocument {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final String MANAGED_SECTION_END = "<!-- default-discretion:end -->";
    public static final int MAXIMUM_BYTES = 16384;
    public static final String OWNER_SEPARATOR = "\n\n";
    public static final String TERMINATOR = "\n";
    public final String managedPrefix;
    public final String ownerText;

    public PairsDiscretionDocument(String str) {
        C7384Etj.A0Y(str, 0);
        int iA0B = C7BY.A0B(str, MANAGED_SECTION_END, 0, false);
        if (iA0B < 0) {
            this.managedPrefix = str;
            this.ownerText = null;
        } else {
            int i = iA0B + 31;
            this.managedPrefix = str.substring(0, i);
            this.ownerText = AnonymousClass002.A0l(str.substring(i));
        }
    }

    public final boolean fits(String str) {
        C7384Etj.A0Y(str, 0);
        return C3cG.A1S(AnonymousClass002.A0l(str)).length <= getMaxOwnerBytes();
    }

    public final boolean isSaved(String str) {
        C7384Etj.A0Y(str, 0);
        return C7384Etj.areEqual(this.ownerText, AnonymousClass002.A0l(str));
    }

    public final String proposedContent(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.ownerText == null || !fits(str)) {
            return null;
        }
        return replacingOwnerText(str);
    }

    public final String replacingOwnerText(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        String str2 = this.managedPrefix;
        StringBuilder sbA0w = C60O.A0w();
        if (length == 0) {
            sbA0w.append(str2);
        } else {
            sbA0w.append(str2);
            sbA0w.append(OWNER_SEPARATOR);
            sbA0w.append(strA0l);
        }
        return AnonymousClass001.A0v(TERMINATOR, sbA0w);
    }

    public final boolean savesWithoutApproval(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.ownerText != null) {
            return !PairsGuidanceChanges.INSTANCE.addsLines(r2, AnonymousClass002.A0l(str));
        }
        return false;
    }

    public final String getManagedPrefix() {
        return this.managedPrefix;
    }

    public final int getMaxOwnerBytes() {
        return 16381 - C3cG.A1S(this.managedPrefix).length;
    }

    public final String getOwnerText() {
        return this.ownerText;
    }

    public final class Companion {
        public final String normalizedOwnerText(String str) {
            C7384Etj.A0Y(str, 0);
            return AnonymousClass002.A0l(str);
        }

        public final String path(String str) {
            boolean zEqualsIgnoreCase;
            C7384Etj.A0Y(str, 0);
            try {
                zEqualsIgnoreCase = UUID.fromString(str).toString().equalsIgnoreCase(str);
            } catch (IllegalArgumentException unused) {
                zEqualsIgnoreCase = false;
            }
            if (zEqualsIgnoreCase) {
                return FGI.A0U("side-chats/", str, "/DISCRETION.md");
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
