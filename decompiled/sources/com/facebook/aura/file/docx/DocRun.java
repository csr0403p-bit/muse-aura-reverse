package com.facebook.aura.file.docx;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class DocRun extends C06G {
    public final Float fontSizePt;
    public final boolean isBold;
    public final boolean isItalic;
    public final boolean isStrikethrough;
    public final boolean isUnderline;
    public final String text;

    public DocRun(String str, boolean z, boolean z2, boolean z3, boolean z4, Float f) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.isBold = z;
        this.isItalic = z2;
        this.isUnderline = z3;
        this.isStrikethrough = z4;
        this.fontSizePt = f;
    }

    public final DocRun copy(String str, boolean z, boolean z2, boolean z3, boolean z4, Float f) {
        C7384Etj.A0Y(str, 0);
        return new DocRun(str, z, z2, z3, z4, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocRun) {
                DocRun docRun = (DocRun) obj;
                if (!C7384Etj.areEqual(this.text, docRun.text) || this.isBold != docRun.isBold || this.isItalic != docRun.isItalic || this.isUnderline != docRun.isUnderline || this.isStrikethrough != docRun.isStrikethrough || !C7384Etj.areEqual(this.fontSizePt, docRun.fontSizePt)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DocRun copy$default(DocRun docRun, String str, boolean z, boolean z2, boolean z3, boolean z4, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docRun.text;
        }
        if ((i & 2) != 0) {
            z = docRun.isBold;
        }
        if ((i & 4) != 0) {
            z2 = docRun.isItalic;
        }
        if ((i & 8) != 0) {
            z3 = docRun.isUnderline;
        }
        if ((i & 16) != 0) {
            z4 = docRun.isStrikethrough;
        }
        if ((i & 32) != 0) {
            f = docRun.fontSizePt;
        }
        return docRun.copy(str, z, z2, z3, z4, f);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isBold;
    }

    public final boolean component3() {
        return this.isItalic;
    }

    public final boolean component4() {
        return this.isUnderline;
    }

    public final boolean component5() {
        return this.isStrikethrough;
    }

    public final Float component6() {
        return this.fontSizePt;
    }

    public final Float getFontSizePt() {
        return this.fontSizePt;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.text), this.isBold), this.isItalic), this.isUnderline), this.isStrikethrough) + AnonymousClass006.A0D(this.fontSizePt);
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final boolean isItalic() {
        return this.isItalic;
    }

    public final boolean isStrikethrough() {
        return this.isStrikethrough;
    }

    public final boolean isUnderline() {
        return this.isUnderline;
    }

    public String toString() {
        return super.toString();
    }
}
