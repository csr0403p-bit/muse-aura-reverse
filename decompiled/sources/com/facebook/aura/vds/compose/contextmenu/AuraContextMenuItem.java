package com.facebook.aura.vds.compose.contextmenu;

import X.AVy;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B6A;
import X.BRg;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraContextMenuItem extends C06G {
    public static final int $stable = 0;
    public final String description;
    public final int descriptionMaxLines;
    public final int id;
    public final boolean isDestructive;
    public final boolean isDivider;
    public final boolean isEnabled;
    public final boolean isSelected;
    public final boolean isStaticText;
    public final String label;
    public final int labelMaxLines;
    public final BRg modifier;
    public final AVy startIconPainter;
    public final B6A startIconTint;
    public final AVy trailingIconPainter;

    /* renamed from: copy-cfkD8xA, reason: not valid java name */
    public final AuraContextMenuItem m2514copycfkD8xA(int i, String str, String str2, AVy aVy, B6A b6a, AVy aVy2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BRg bRg, int i2, int i3) {
        AnonymousClass002.A1G(str, 1, bRg);
        return new AuraContextMenuItem(i, str, str2, aVy, b6a, aVy2, z, z2, z3, z4, z5, bRg, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraContextMenuItem) {
                AuraContextMenuItem auraContextMenuItem = (AuraContextMenuItem) obj;
                if (this.id != auraContextMenuItem.id || !C7384Etj.areEqual(this.label, auraContextMenuItem.label) || !C7384Etj.areEqual(this.description, auraContextMenuItem.description) || !C7384Etj.areEqual(this.startIconPainter, auraContextMenuItem.startIconPainter) || !C7384Etj.areEqual(this.startIconTint, auraContextMenuItem.startIconTint) || !C7384Etj.areEqual(this.trailingIconPainter, auraContextMenuItem.trailingIconPainter) || this.isSelected != auraContextMenuItem.isSelected || this.isDivider != auraContextMenuItem.isDivider || this.isStaticText != auraContextMenuItem.isStaticText || this.isEnabled != auraContextMenuItem.isEnabled || this.isDestructive != auraContextMenuItem.isDestructive || !C7384Etj.areEqual(this.modifier, auraContextMenuItem.modifier) || this.descriptionMaxLines != auraContextMenuItem.descriptionMaxLines || this.labelMaxLines != auraContextMenuItem.labelMaxLines) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-cfkD8xA$default, reason: not valid java name */
    public static /* synthetic */ AuraContextMenuItem m2512copycfkD8xA$default(AuraContextMenuItem auraContextMenuItem, int i, String str, String str2, AVy aVy, B6A b6a, AVy aVy2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BRg bRg, int i2, int i3, int i4, Object obj) {
        String str3 = str;
        String str4 = str2;
        AVy aVy3 = aVy;
        B6A b6a2 = b6a;
        AVy aVy4 = aVy2;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        boolean z10 = z5;
        BRg bRg2 = bRg;
        int i5 = i2;
        int i6 = i3;
        if ((i4 & 1) != 0) {
            i = auraContextMenuItem.id;
        }
        if ((i4 & 2) != 0) {
            str3 = auraContextMenuItem.label;
        }
        if ((i4 & 4) != 0) {
            str4 = auraContextMenuItem.description;
        }
        if ((i4 & 8) != 0) {
            aVy3 = auraContextMenuItem.startIconPainter;
        }
        if ((i4 & 16) != 0) {
            b6a2 = auraContextMenuItem.startIconTint;
        }
        if ((i4 & 32) != 0) {
            aVy4 = auraContextMenuItem.trailingIconPainter;
        }
        if ((i4 & 64) != 0) {
            z6 = auraContextMenuItem.isSelected;
        }
        if ((i4 & 128) != 0) {
            z7 = auraContextMenuItem.isDivider;
        }
        if ((i4 & 256) != 0) {
            z8 = auraContextMenuItem.isStaticText;
        }
        if ((i4 & 512) != 0) {
            z9 = auraContextMenuItem.isEnabled;
        }
        if ((i4 & 1024) != 0) {
            z10 = auraContextMenuItem.isDestructive;
        }
        if ((i4 & 2048) != 0) {
            bRg2 = auraContextMenuItem.modifier;
        }
        if ((i4 & 4096) != 0) {
            i5 = auraContextMenuItem.descriptionMaxLines;
        }
        if ((i4 & 8192) != 0) {
            i6 = auraContextMenuItem.labelMaxLines;
        }
        return auraContextMenuItem.m2514copycfkD8xA(i, str3, str4, aVy3, b6a2, aVy4, z6, z7, z8, z9, z10, bRg2, i5, i6);
    }

    public final int component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isEnabled;
    }

    public final boolean component11() {
        return this.isDestructive;
    }

    public final BRg component12() {
        return this.modifier;
    }

    public final int component13() {
        return this.descriptionMaxLines;
    }

    public final int component14() {
        return this.labelMaxLines;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.description;
    }

    public final AVy component4() {
        return this.startIconPainter;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final B6A m2513component5QN2ZGVo() {
        return this.startIconTint;
    }

    public final AVy component6() {
        return this.trailingIconPainter;
    }

    public final boolean component7() {
        return this.isSelected;
    }

    public final boolean component8() {
        return this.isDivider;
    }

    public final boolean component9() {
        return this.isStaticText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDescriptionMaxLines() {
        return this.descriptionMaxLines;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getLabelMaxLines() {
        return this.labelMaxLines;
    }

    public final BRg getModifier() {
        return this.modifier;
    }

    public final AVy getStartIconPainter() {
        return this.startIconPainter;
    }

    /* renamed from: getStartIconTint-QN2ZGVo, reason: not valid java name */
    public final B6A m2515getStartIconTintQN2ZGVo() {
        return this.startIconTint;
    }

    public final AVy getTrailingIconPainter() {
        return this.trailingIconPainter;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.modifier, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((((((((AnonymousClass005.A0I(this.label, this.id * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0D(this.startIconPainter)) * 31) + AnonymousClass007.A07(this.startIconTint)) * 31) + C06G.A04(this.trailingIconPainter)) * 31, this.isSelected), this.isDivider), this.isStaticText), this.isEnabled), this.isDestructive)) + this.descriptionMaxLines) * 31) + this.labelMaxLines;
    }

    public final boolean isDestructive() {
        return this.isDestructive;
    }

    public final boolean isDivider() {
        return this.isDivider;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isStaticText() {
        return this.isStaticText;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraContextMenuItem(int i, String str, String str2, AVy aVy, B6A b6a, AVy aVy2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BRg bRg, int i2, int i3, C06H c06h) {
        this(i, str, str2, aVy, b6a, aVy2, z, z2, z3, z4, z5, bRg, i2, i3);
    }

    public /* synthetic */ AuraContextMenuItem(int i, String str, String str2, AVy aVy, B6A b6a, AVy aVy2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BRg bRg, int i2, int i3, int i4, C06H c06h) {
        this(i, str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : aVy, (i4 & 16) != 0 ? null : b6a, (i4 & 32) != 0 ? null : aVy2, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? false : z2, (i4 & 256) != 0 ? false : z3, (i4 & 512) != 0 ? true : z4, (i4 & 1024) != 0 ? false : z5, (i4 & 2048) != 0 ? BRg.A00 : bRg, (i4 & 4096) != 0 ? 1 : i2, (i4 & 8192) != 0 ? 1 : i3);
    }

    public AuraContextMenuItem(int i, String str, String str2, AVy aVy, B6A b6a, AVy aVy2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BRg bRg, int i2, int i3) {
        AnonymousClass002.A1G(str, 1, bRg);
        this.id = i;
        this.label = str;
        this.description = str2;
        this.startIconPainter = aVy;
        this.startIconTint = b6a;
        this.trailingIconPainter = aVy2;
        this.isSelected = z;
        this.isDivider = z2;
        this.isStaticText = z3;
        this.isEnabled = z4;
        this.isDestructive = z5;
        this.modifier = bRg;
        this.descriptionMaxLines = i2;
        this.labelMaxLines = i3;
    }
}
