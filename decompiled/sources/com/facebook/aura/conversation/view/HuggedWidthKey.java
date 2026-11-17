package com.facebook.aura.conversation.view;

import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C1822Arm;
import X.C7384Etj;
import X.EnumC1820Arj;

/* loaded from: classes.dex */
public final class HuggedWidthKey extends C06G {
    public final int availableTextPx;
    public final AXN density;
    public final boolean isStreaming;
    public final EnumC1820Arj layoutDirection;
    public final boolean reflowSoftLineBreaks;
    public final C1822Arm style;
    public final String text;

    public HuggedWidthKey(String str, boolean z, boolean z2, int i, C1822Arm c1822Arm, AXN axn, EnumC1820Arj enumC1820Arj) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(c1822Arm, axn);
        C7384Etj.A0Y(enumC1820Arj, 6);
        this.text = str;
        this.reflowSoftLineBreaks = z;
        this.isStreaming = z2;
        this.availableTextPx = i;
        this.style = c1822Arm;
        this.density = axn;
        this.layoutDirection = enumC1820Arj;
    }

    public final HuggedWidthKey copy(String str, boolean z, boolean z2, int i, C1822Arm c1822Arm, AXN axn, EnumC1820Arj enumC1820Arj) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(c1822Arm, axn);
        C7384Etj.A0Y(enumC1820Arj, 6);
        return new HuggedWidthKey(str, z, z2, i, c1822Arm, axn, enumC1820Arj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HuggedWidthKey) {
                HuggedWidthKey huggedWidthKey = (HuggedWidthKey) obj;
                if (!C7384Etj.areEqual(this.text, huggedWidthKey.text) || this.reflowSoftLineBreaks != huggedWidthKey.reflowSoftLineBreaks || this.isStreaming != huggedWidthKey.isStreaming || this.availableTextPx != huggedWidthKey.availableTextPx || !C7384Etj.areEqual(this.style, huggedWidthKey.style) || !C7384Etj.areEqual(this.density, huggedWidthKey.density) || this.layoutDirection != huggedWidthKey.layoutDirection) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HuggedWidthKey copy$default(HuggedWidthKey huggedWidthKey, String str, boolean z, boolean z2, int i, C1822Arm c1822Arm, AXN axn, EnumC1820Arj enumC1820Arj, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = huggedWidthKey.text;
        }
        if ((i2 & 2) != 0) {
            z = huggedWidthKey.reflowSoftLineBreaks;
        }
        if ((i2 & 4) != 0) {
            z2 = huggedWidthKey.isStreaming;
        }
        if ((i2 & 8) != 0) {
            i = huggedWidthKey.availableTextPx;
        }
        if ((i2 & 16) != 0) {
            c1822Arm = huggedWidthKey.style;
        }
        if ((i2 & 32) != 0) {
            axn = huggedWidthKey.density;
        }
        if ((i2 & 64) != 0) {
            enumC1820Arj = huggedWidthKey.layoutDirection;
        }
        return huggedWidthKey.copy(str, z, z2, i, c1822Arm, axn, enumC1820Arj);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.reflowSoftLineBreaks;
    }

    public final boolean component3() {
        return this.isStreaming;
    }

    public final int component4() {
        return this.availableTextPx;
    }

    public final C1822Arm component5() {
        return this.style;
    }

    public final AXN component6() {
        return this.density;
    }

    public final EnumC1820Arj component7() {
        return this.layoutDirection;
    }

    public final int getAvailableTextPx() {
        return this.availableTextPx;
    }

    public final AXN getDensity() {
        return this.density;
    }

    public final EnumC1820Arj getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getReflowSoftLineBreaks() {
        return this.reflowSoftLineBreaks;
    }

    public final C1822Arm getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.layoutDirection, AnonymousClass005.A0F(this.density, AnonymousClass005.A0F(this.style, (C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.text), this.reflowSoftLineBreaks), this.isStreaming) + this.availableTextPx) * 31)));
    }

    public final boolean isStreaming() {
        return this.isStreaming;
    }

    public String toString() {
        return super.toString();
    }
}
