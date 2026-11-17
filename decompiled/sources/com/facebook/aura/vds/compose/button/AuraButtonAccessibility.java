package com.facebook.aura.vds.compose.button;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraButtonAccessibility extends C06G {
    public static final int $stable = 0;
    public final boolean drawFocusRectangleForKeyboardUsers;
    public final String overrideContentDescription;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraButtonAccessibility) {
                AuraButtonAccessibility auraButtonAccessibility = (AuraButtonAccessibility) obj;
                if (this.drawFocusRectangleForKeyboardUsers != auraButtonAccessibility.drawFocusRectangleForKeyboardUsers || !C7384Etj.areEqual(this.overrideContentDescription, auraButtonAccessibility.overrideContentDescription)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraButtonAccessibility copy$default(AuraButtonAccessibility auraButtonAccessibility, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = auraButtonAccessibility.drawFocusRectangleForKeyboardUsers;
        }
        if ((i & 2) != 0) {
            str = auraButtonAccessibility.overrideContentDescription;
        }
        return new AuraButtonAccessibility(z, str);
    }

    public final boolean component1() {
        return this.drawFocusRectangleForKeyboardUsers;
    }

    public final String component2() {
        return this.overrideContentDescription;
    }

    public final AuraButtonAccessibility copy(boolean z, String str) {
        return new AuraButtonAccessibility(z, str);
    }

    public final boolean getDrawFocusRectangleForKeyboardUsers() {
        return this.drawFocusRectangleForKeyboardUsers;
    }

    public final String getOverrideContentDescription() {
        return this.overrideContentDescription;
    }

    public int hashCode() {
        return C0KA.A02(this.drawFocusRectangleForKeyboardUsers) + AnonymousClass006.A0G(this.overrideContentDescription);
    }

    public AuraButtonAccessibility(boolean z, String str) {
        this.drawFocusRectangleForKeyboardUsers = z;
        this.overrideContentDescription = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraButtonAccessibility(boolean z, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, AnonymousClass006.A0s(i, str));
    }

    public AuraButtonAccessibility() {
        this(true, null);
    }
}
