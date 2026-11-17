package com.facebook.aura.vds.compose.typegroup;

import X.AVy;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.vds.compose.icons.AuraIconSize;

/* loaded from: classes.dex */
public final class Icon extends C06G {
    public static final int $stable = 0;
    public final IconOrientation orientation;
    public final AVy painter;
    public final AuraIconSize size;
    public final B6A tint;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Icon) {
                Icon icon = (Icon) obj;
                if (!C7384Etj.areEqual(this.painter, icon.painter) || this.size != icon.size || this.orientation != icon.orientation || !C7384Etj.areEqual(this.tint, icon.tint)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-gP2Z1ig$default, reason: not valid java name */
    public static /* synthetic */ Icon m3107copygP2Z1ig$default(Icon icon, AVy aVy, AuraIconSize auraIconSize, IconOrientation iconOrientation, B6A b6a, int i, Object obj) {
        if ((i & 1) != 0) {
            aVy = icon.painter;
        }
        if ((i & 2) != 0) {
            auraIconSize = icon.size;
        }
        if ((i & 4) != 0) {
            iconOrientation = icon.orientation;
        }
        if ((i & 8) != 0) {
            b6a = icon.tint;
        }
        AnonymousClass005.A0x(aVy, auraIconSize, iconOrientation);
        return new Icon(aVy, auraIconSize, iconOrientation, b6a);
    }

    public final AVy component1() {
        return this.painter;
    }

    public final AuraIconSize component2() {
        return this.size;
    }

    public final IconOrientation component3() {
        return this.orientation;
    }

    /* renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final B6A m3108component4QN2ZGVo() {
        return this.tint;
    }

    public final IconOrientation getOrientation() {
        return this.orientation;
    }

    public final AVy getPainter() {
        return this.painter;
    }

    public final AuraIconSize getSize() {
        return this.size;
    }

    /* renamed from: getTint-QN2ZGVo, reason: not valid java name */
    public final B6A m3110getTintQN2ZGVo() {
        return this.tint;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.orientation, AnonymousClass005.A0F(this.size, AnonymousClass005.A0E(this.painter))) + AnonymousClass007.A07(this.tint);
    }

    public /* synthetic */ Icon(AVy aVy, AuraIconSize auraIconSize, IconOrientation iconOrientation, B6A b6a, C06H c06h) {
        this(aVy, auraIconSize, iconOrientation, b6a);
    }

    /* renamed from: copy-gP2Z1ig, reason: not valid java name */
    public final Icon m3109copygP2Z1ig(AVy aVy, AuraIconSize auraIconSize, IconOrientation iconOrientation, B6A b6a) {
        AnonymousClass005.A0x(aVy, auraIconSize, iconOrientation);
        return new Icon(aVy, auraIconSize, iconOrientation, b6a);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ Icon(AVy aVy, AuraIconSize auraIconSize, IconOrientation iconOrientation, B6A b6a, int i, C06H c06h) {
        this(aVy, (i & 2) != 0 ? AuraIconSize.SMALL : auraIconSize, (i & 4) != 0 ? IconOrientation.TOP : iconOrientation, (i & 8) != 0 ? null : b6a);
    }

    public Icon(AVy aVy, AuraIconSize auraIconSize, IconOrientation iconOrientation, B6A b6a) {
        AnonymousClass005.A0x(aVy, auraIconSize, iconOrientation);
        this.painter = aVy;
        this.size = auraIconSize;
        this.orientation = iconOrientation;
        this.tint = b6a;
    }
}
