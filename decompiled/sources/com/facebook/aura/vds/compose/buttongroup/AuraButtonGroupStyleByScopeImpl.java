package com.facebook.aura.vds.compose.buttongroup;

import X.BRg;
import X.C1YL;
import X.C7384Etj;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraButtonGroupStyleByScopeImpl implements AuraButtonGroupStyleByScope {
    public final List<ButtonContent> buttons = new ArrayList();

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope
    /* renamed from: button-IiUgNnk */
    public void mo2448buttonIiUgNnk(int i, Object[] objArr, C1YL c1yl, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, String str3, BRg bRg, int i2) {
        C7384Etj.A0Y(function0, 7);
        this.buttons.add(new ButtonContent(new ResIdTextHolder(i, objArr), str, drawable, z, z2, AuraButtonStyle.PRIMARY, function0, str2, str3, c1yl, bRg, Integer.MAX_VALUE, i2));
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope
    /* renamed from: button-LKWACpY */
    public void mo2449buttonLKWACpY(String str, C1YL c1yl, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, BRg bRg, int i) {
        C7384Etj.A0Y(function0, 6);
        this.buttons.add(new ButtonContent(new StringTextHolder(str), str2, drawable, z, z2, AuraButtonStyle.PRIMARY, function0, str3, null, c1yl, bRg, Integer.MAX_VALUE, i));
    }

    public final List<ButtonContent> getButtons() {
        return this.buttons;
    }
}
