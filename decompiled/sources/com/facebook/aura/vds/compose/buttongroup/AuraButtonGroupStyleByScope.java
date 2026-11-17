package com.facebook.aura.vds.compose.buttongroup;

import X.AnonymousClass005;
import X.BRg;
import X.C1YL;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface AuraButtonGroupStyleByScope {

    /* renamed from: com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: button-IiUgNnk$default, reason: not valid java name */
        public static /* synthetic */ void m2450buttonIiUgNnk$default(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope, int i, Object[] objArr, C1YL c1yl, Drawable drawable, boolean z, boolean z2, String str, Function0 function0, String str2, String str3, BRg bRg, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: button-IiUgNnk");
            }
            if ((i3 & 2) != 0) {
                objArr = null;
            }
            if ((i3 & 4) != 0) {
                c1yl = null;
            }
            if ((i3 & 8) != 0) {
                drawable = null;
            }
            if ((i3 & 16) != 0) {
                z = true;
            }
            if ((i3 & 32) != 0) {
                z2 = false;
            }
            if ((i3 & 64) != 0) {
                str = null;
            }
            if ((i3 & 256) != 0) {
                str2 = null;
            }
            if ((i3 & 512) != 0) {
                str3 = null;
            }
            if ((i3 & 1024) != 0) {
                bRg = BRg.A00;
            }
            if ((i3 & 2048) != 0) {
                i2 = AuraHaptics.BUTTON_TAP;
            }
            auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(i, objArr, c1yl, drawable, z, z2, str, function0, str2, str3, bRg, i2);
        }

        /* renamed from: button-LKWACpY$default, reason: not valid java name */
        public static /* synthetic */ void m2451buttonLKWACpY$default(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope, String str, C1YL c1yl, Drawable drawable, boolean z, boolean z2, String str2, Function0 function0, String str3, BRg bRg, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: button-LKWACpY");
            }
            if ((i2 & 2) != 0) {
                c1yl = null;
            }
            if ((i2 & 4) != 0) {
                drawable = null;
            }
            if ((i2 & 8) != 0) {
                z = true;
            }
            boolean zA1Q = AnonymousClass005.A1Q(i2, z2);
            if ((i2 & 32) != 0) {
                str2 = null;
            }
            if ((i2 & 128) != 0) {
                str3 = null;
            }
            if ((i2 & 256) != 0) {
                bRg = BRg.A00;
            }
            if ((i2 & 512) != 0) {
                i = AuraHaptics.BUTTON_TAP;
            }
            auraButtonGroupStyleByScope.mo2449buttonLKWACpY(str, c1yl, drawable, z, zA1Q, str2, function0, str3, bRg, i);
        }
    }

    /* renamed from: button-IiUgNnk, reason: not valid java name */
    void mo2448buttonIiUgNnk(int i, Object[] objArr, C1YL c1yl, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, String str3, BRg bRg, int i2);

    /* renamed from: button-LKWACpY, reason: not valid java name */
    void mo2449buttonLKWACpY(String str, C1YL c1yl, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, BRg bRg, int i);

    public abstract class DefaultImpls {
    }
}
