package com.facebook.aura.markdown.render;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C1824Aro;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class AuraMarkdownInlineEntityRange {
    public static final int $stable = 0;
    public final int end;
    public final String inlineName;
    public final String key;
    public final int start;
    public final C1824Aro textStyle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMarkdownInlineEntityRange) {
                AuraMarkdownInlineEntityRange auraMarkdownInlineEntityRange = (AuraMarkdownInlineEntityRange) obj;
                if (!C7384Etj.areEqual(this.inlineName, auraMarkdownInlineEntityRange.inlineName) || !C7384Etj.areEqual(this.key, auraMarkdownInlineEntityRange.key) || this.start != auraMarkdownInlineEntityRange.start || this.end != auraMarkdownInlineEntityRange.end || !C7384Etj.areEqual(this.textStyle, auraMarkdownInlineEntityRange.textStyle)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AuraMarkdownInlineEntityRange(String str, String str2, int i, int i2, C1824Aro c1824Aro, int i3, C06H c06h) {
        this(str, str2, i, i2, (i3 & 16) != 0 ? null : c1824Aro);
    }

    public static /* synthetic */ AuraMarkdownInlineEntityRange copy$default(AuraMarkdownInlineEntityRange auraMarkdownInlineEntityRange, String str, String str2, int i, int i2, C1824Aro c1824Aro, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = auraMarkdownInlineEntityRange.inlineName;
        }
        if ((i3 & 2) != 0) {
            str2 = auraMarkdownInlineEntityRange.key;
        }
        if ((i3 & 4) != 0) {
            i = auraMarkdownInlineEntityRange.start;
        }
        if ((i3 & 8) != 0) {
            i2 = auraMarkdownInlineEntityRange.end;
        }
        if ((i3 & 16) != 0) {
            c1824Aro = auraMarkdownInlineEntityRange.textStyle;
        }
        return auraMarkdownInlineEntityRange.copy(str, str2, i, i2, c1824Aro);
    }

    public final String component1() {
        return this.inlineName;
    }

    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.start;
    }

    public final int component4() {
        return this.end;
    }

    public final C1824Aro component5() {
        return this.textStyle;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getInlineName() {
        return this.inlineName;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getStart() {
        return this.start;
    }

    public final C1824Aro getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.key, AnonymousClass001.A0G(this.inlineName)) + this.start) * 31) + this.end) * 31) + AnonymousClass006.A0D(this.textStyle);
    }

    public String toString() {
        String str = this.inlineName;
        String str2 = this.key;
        int i = this.start;
        int i2 = this.end;
        C1824Aro c1824Aro = this.textStyle;
        StringBuilder sbA0x = C3cI.A0x("AuraMarkdownInlineEntityRange(inlineName=", str);
        sbA0x.append(", key=");
        sbA0x.append(str2);
        sbA0x.append(", start=");
        sbA0x.append(i);
        sbA0x.append(", end=");
        sbA0x.append(i2);
        return C3cJ.A0L(c1824Aro, ", textStyle=", sbA0x);
    }

    public final AuraMarkdownInlineEntityRange copy(String str, String str2, int i, int i2, C1824Aro c1824Aro) {
        AnonymousClass003.A0u(str, str2);
        return new AuraMarkdownInlineEntityRange(str, str2, i, i2, c1824Aro);
    }

    public AuraMarkdownInlineEntityRange(String str, String str2, int i, int i2, C1824Aro c1824Aro) {
        AnonymousClass003.A0u(str, str2);
        this.inlineName = str;
        this.key = str2;
        this.start = i;
        this.end = i2;
        this.textStyle = c1824Aro;
    }
}
