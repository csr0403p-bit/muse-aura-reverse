package com.facebook.aura.vds.compose.buttongroup;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BRg;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1YL;
import X.C7384Etj;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ButtonContent extends C06G {
    public final int clickHaptic;
    public final String contentDescription;
    public final boolean enabled;
    public final Drawable icon;
    public final String id;
    public final boolean loading;
    public final int maxLines;
    public final BRg modifier;
    public final Function0<Unit> onClick;
    public final String onClickLabel;
    public AuraButtonStyle style;
    public final C1YL textAlign;
    public final TextHolder textHolder;

    /* renamed from: copy-qqXSYzA, reason: not valid java name */
    public final ButtonContent m2463copyqqXSYzA(TextHolder textHolder, String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, Function0<Unit> function0, String str2, String str3, C1YL c1yl, BRg bRg, int i, int i2) {
        C7384Etj.A0Y(textHolder, 0);
        AnonymousClass003.A0z(auraButtonStyle, function0);
        return new ButtonContent(textHolder, str, drawable, z, z2, auraButtonStyle, function0, str2, str3, c1yl, bRg, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ButtonContent) {
                ButtonContent buttonContent = (ButtonContent) obj;
                if (!C7384Etj.areEqual(this.textHolder, buttonContent.textHolder) || !C7384Etj.areEqual(this.id, buttonContent.id) || !C7384Etj.areEqual(this.icon, buttonContent.icon) || this.enabled != buttonContent.enabled || this.loading != buttonContent.loading || this.style != buttonContent.style || !C7384Etj.areEqual(this.onClick, buttonContent.onClick) || !C7384Etj.areEqual(this.onClickLabel, buttonContent.onClickLabel) || !C7384Etj.areEqual(this.contentDescription, buttonContent.contentDescription) || !C7384Etj.areEqual(this.textAlign, buttonContent.textAlign) || !C7384Etj.areEqual(this.modifier, buttonContent.modifier) || this.maxLines != buttonContent.maxLines || this.clickHaptic != buttonContent.clickHaptic) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setStyle(AuraButtonStyle auraButtonStyle) {
        C7384Etj.A0Y(auraButtonStyle, 0);
        this.style = auraButtonStyle;
    }

    public /* synthetic */ ButtonContent(TextHolder textHolder, String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, Function0 function0, String str2, String str3, C1YL c1yl, BRg bRg, int i, int i2, int i3, C06H c06h) {
        this(textHolder, str, drawable, z, z2, (i3 & 32) != 0 ? AuraButtonStyle.PRIMARY : auraButtonStyle, function0, str2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : c1yl, (i3 & 1024) != 0 ? BRg.A00 : bRg, (i3 & 2048) != 0 ? Integer.MAX_VALUE : i, (i3 & 4096) != 0 ? AuraHaptics.BUTTON_TAP : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-qqXSYzA$default, reason: not valid java name */
    public static /* synthetic */ ButtonContent m2460copyqqXSYzA$default(ButtonContent buttonContent, TextHolder textHolder, String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, Function0 function0, String str2, String str3, C1YL c1yl, BRg bRg, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            textHolder = buttonContent.textHolder;
        }
        if ((i3 & 2) != 0) {
            str = buttonContent.id;
        }
        if ((i3 & 4) != 0) {
            drawable = buttonContent.icon;
        }
        if ((i3 & 8) != 0) {
            z = buttonContent.enabled;
        }
        if ((i3 & 16) != 0) {
            z2 = buttonContent.loading;
        }
        if ((i3 & 32) != 0) {
            auraButtonStyle = buttonContent.style;
        }
        if ((i3 & 64) != 0) {
            function0 = buttonContent.onClick;
        }
        if ((i3 & 128) != 0) {
            str2 = buttonContent.onClickLabel;
        }
        if ((i3 & 256) != 0) {
            str3 = buttonContent.contentDescription;
        }
        if ((i3 & 512) != 0) {
            c1yl = buttonContent.textAlign;
        }
        if ((i3 & 1024) != 0) {
            bRg = buttonContent.modifier;
        }
        if ((i3 & 2048) != 0) {
            i = buttonContent.maxLines;
        }
        if ((i3 & 4096) != 0) {
            i2 = buttonContent.clickHaptic;
        }
        return buttonContent.m2463copyqqXSYzA(textHolder, str, drawable, z, z2, auraButtonStyle, function0, str2, str3, c1yl, bRg, i, i2);
    }

    public final TextHolder component1() {
        return this.textHolder;
    }

    /* renamed from: component10-buA522U, reason: not valid java name */
    public final C1YL m2461component10buA522U() {
        return this.textAlign;
    }

    public final BRg component11() {
        return this.modifier;
    }

    public final int component12() {
        return this.maxLines;
    }

    /* renamed from: component13-5zf0vsI, reason: not valid java name */
    public final int m2462component135zf0vsI() {
        return this.clickHaptic;
    }

    public final String component2() {
        return this.id;
    }

    public final Drawable component3() {
        return this.icon;
    }

    public final boolean component4() {
        return this.enabled;
    }

    public final boolean component5() {
        return this.loading;
    }

    public final AuraButtonStyle component6() {
        return this.style;
    }

    public final Function0<Unit> component7() {
        return this.onClick;
    }

    public final String component8() {
        return this.onClickLabel;
    }

    public final String component9() {
        return this.contentDescription;
    }

    /* renamed from: getClickHaptic-5zf0vsI, reason: not valid java name */
    public final int m2464getClickHaptic5zf0vsI() {
        return this.clickHaptic;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final BRg getModifier() {
        return this.modifier;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final String getOnClickLabel() {
        return this.onClickLabel;
    }

    public final AuraButtonStyle getStyle() {
        return this.style;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final C1YL m2465getTextAlignbuA522U() {
        return this.textAlign;
    }

    public final TextHolder getTextHolder() {
        return this.textHolder;
    }

    public int hashCode() {
        int iA0F = (((AnonymousClass005.A0F(this.onClick, AnonymousClass005.A0F(this.style, C0KA.A01(C0KA.A01((((AnonymousClass005.A0E(this.textHolder) + AnonymousClass006.A0G(this.id)) * 31) + AnonymousClass006.A0D(this.icon)) * 31, this.enabled), this.loading))) + AnonymousClass006.A0G(this.onClickLabel)) * 31) + AnonymousClass006.A0G(this.contentDescription)) * 31;
        C1YL c1yl = this.textAlign;
        return ((((((iA0F + (c1yl == null ? 0 : c1yl.A00)) * 31) + C06G.A04(this.modifier)) * 31) + this.maxLines) * 31) + this.clickHaptic;
    }

    public String toString() {
        return super.toString();
    }

    public ButtonContent(TextHolder textHolder, String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, Function0<Unit> function0, String str2, String str3, C1YL c1yl, BRg bRg, int i, int i2) {
        C7384Etj.A0Y(textHolder, 0);
        AnonymousClass003.A0z(auraButtonStyle, function0);
        this.textHolder = textHolder;
        this.id = str;
        this.icon = drawable;
        this.enabled = z;
        this.loading = z2;
        this.style = auraButtonStyle;
        this.onClick = function0;
        this.onClickLabel = str2;
        this.contentDescription = str3;
        this.textAlign = c1yl;
        this.modifier = bRg;
        this.maxLines = i;
        this.clickHaptic = i2;
    }

    public /* synthetic */ ButtonContent(TextHolder textHolder, String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, Function0 function0, String str2, String str3, C1YL c1yl, BRg bRg, int i, int i2, C06H c06h) {
        this(textHolder, str, drawable, z, z2, auraButtonStyle, function0, str2, str3, c1yl, bRg, i, i2);
    }
}
