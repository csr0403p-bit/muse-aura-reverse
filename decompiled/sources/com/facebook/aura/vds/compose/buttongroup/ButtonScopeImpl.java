package com.facebook.aura.vds.compose.buttongroup;

import X.AnonymousClass002;
import X.BRg;
import X.C7384Etj;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ButtonScopeImpl implements AuraButtonGroupScope {
    public final List<ButtonContent> buttons = new ArrayList();

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void button(String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, String str2, Function0<Unit> function0, String str3, BRg bRg) {
        AnonymousClass002.A1C(str, 0, auraButtonStyle);
        C7384Etj.A0Y(function0, 6);
        this.buttons.add(new ButtonContent(new StringTextHolder(str), str2, drawable, z, z2, auraButtonStyle, function0, str3, null, null, bRg, Integer.MAX_VALUE, AuraHaptics.BUTTON_TAP));
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void destructiveButton(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, BRg bRg) {
        C7384Etj.A0Y(function0, 6);
        button(i, objArr, drawable, z, z2, AuraButtonStyle.DESTRUCTIVE, str, function0, str2, bRg);
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void primaryButton(String str, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, int i, BRg bRg) {
        AnonymousClass002.A1D(str, 0, function0);
        this.buttons.add(new ButtonContent(new StringTextHolder(str), str2, drawable, z, z2, AuraButtonStyle.PRIMARY, function0, str3, null, null, bRg, i, AuraHaptics.BUTTON_TAP));
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void secondaryButton(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, BRg bRg) {
        C7384Etj.A0Y(function0, 6);
        button(i, objArr, drawable, z, z2, AuraButtonStyle.SECONDARY, str, function0, str2, bRg);
    }

    public final List<ButtonContent> getButtons() {
        return this.buttons;
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void button(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, String str, Function0<Unit> function0, String str2, BRg bRg) {
        C7384Etj.A0Y(auraButtonStyle, 5);
        C7384Etj.A0Y(function0, 7);
        this.buttons.add(new ButtonContent(new ResIdTextHolder(i, objArr), str, drawable, z, z2, auraButtonStyle, function0, str2, null, null, bRg, Integer.MAX_VALUE, AuraHaptics.BUTTON_TAP));
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void destructiveButton(String str, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, BRg bRg) {
        AnonymousClass002.A1D(str, 0, function0);
        button(str, drawable, z, z2, AuraButtonStyle.DESTRUCTIVE, str2, function0, str3, bRg);
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void primaryButton(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, BRg bRg) {
        C7384Etj.A0Y(function0, 6);
        button(i, objArr, drawable, z, z2, AuraButtonStyle.PRIMARY, str, function0, str2, bRg);
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope
    public void secondaryButton(String str, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, BRg bRg) {
        AnonymousClass002.A1D(str, 0, function0);
        button(str, drawable, z, z2, AuraButtonStyle.SECONDARY, str2, function0, str3, bRg);
    }
}
