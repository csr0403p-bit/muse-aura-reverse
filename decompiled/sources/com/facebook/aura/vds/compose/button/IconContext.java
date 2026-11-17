package com.facebook.aura.vds.compose.button;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IconContext extends C06G {
    public static final int $stable = 0;
    public final AuraButtonSize size;
    public final AuraLabelButtonStyle style;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IconContext) {
                IconContext iconContext = (IconContext) obj;
                if (!C7384Etj.areEqual(this.style, iconContext.style) || this.size != iconContext.size || !C7384Etj.areEqual(this.text, iconContext.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IconContext copy$default(IconContext iconContext, AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            auraLabelButtonStyle = iconContext.style;
        }
        if ((i & 2) != 0) {
            auraButtonSize = iconContext.size;
        }
        if ((i & 4) != 0) {
            str = iconContext.text;
        }
        return iconContext.copy(auraLabelButtonStyle, auraButtonSize, str);
    }

    public final AuraLabelButtonStyle component1() {
        return this.style;
    }

    public final AuraButtonSize component2() {
        return this.size;
    }

    public final String component3() {
        return this.text;
    }

    public final AuraButtonSize getSize() {
        return this.size;
    }

    public final AuraLabelButtonStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.size, AnonymousClass005.A0E(this.style)) + AnonymousClass006.A0G(this.text);
    }

    public IconContext(AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, String str) {
        AnonymousClass003.A0u(auraLabelButtonStyle, auraButtonSize);
        this.style = auraLabelButtonStyle;
        this.size = auraButtonSize;
        this.text = str;
    }

    public final IconContext copy(AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, String str) {
        AnonymousClass003.A0u(auraLabelButtonStyle, auraButtonSize);
        return new IconContext(auraLabelButtonStyle, auraButtonSize, str);
    }

    public String toString() {
        return super.toString();
    }
}
