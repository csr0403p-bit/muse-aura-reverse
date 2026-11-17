package com.facebook.aura.vds.compose.buttongroup;

import X.AnonymousClass005;
import X.BRg;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface AuraButtonGroupScope {

    /* renamed from: com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void button$default(AuraButtonGroupScope auraButtonGroupScope, String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, String str2, Function0 function0, String str3, BRg bRg, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: button");
            }
            if ((i & 2) != 0) {
                drawable = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            boolean zA1P = AnonymousClass005.A1P(i, z2);
            if ((i & 32) != 0) {
                str2 = null;
            }
            if ((i & 128) != 0) {
                str3 = null;
            }
            if ((i & 256) != 0) {
                bRg = BRg.A00;
            }
            auraButtonGroupScope.button(str, drawable, z, zA1P, auraButtonStyle, str2, function0, str3, bRg);
        }

        public static /* synthetic */ void destructiveButton$default(AuraButtonGroupScope auraButtonGroupScope, String str, Drawable drawable, boolean z, boolean z2, String str2, Function0 function0, String str3, BRg bRg, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destructiveButton");
            }
            if ((i & 2) != 0) {
                drawable = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            boolean zA1P = AnonymousClass005.A1P(i, z2);
            if ((i & 16) != 0) {
                str2 = AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID;
            }
            if ((i & 64) != 0) {
                str3 = null;
            }
            if ((i & 128) != 0) {
                bRg = BRg.A00;
            }
            auraButtonGroupScope.destructiveButton(str, drawable, z, zA1P, str2, function0, str3, bRg);
        }

        public static /* synthetic */ void primaryButton$default(AuraButtonGroupScope auraButtonGroupScope, String str, Drawable drawable, boolean z, boolean z2, String str2, Function0 function0, String str3, int i, BRg bRg, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: primaryButton");
            }
            if ((i2 & 2) != 0) {
                drawable = null;
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            boolean zA1P = AnonymousClass005.A1P(i2, z2);
            if ((i2 & 16) != 0) {
                str2 = AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID;
            }
            if ((i2 & 64) != 0) {
                str3 = null;
            }
            if ((i2 & 128) != 0) {
                i = Integer.MAX_VALUE;
            }
            if ((i2 & 256) != 0) {
                bRg = BRg.A00;
            }
            auraButtonGroupScope.primaryButton(str, drawable, z, zA1P, str2, (Function0<Unit>) function0, str3, i, bRg);
        }

        public static /* synthetic */ void secondaryButton$default(AuraButtonGroupScope auraButtonGroupScope, String str, Drawable drawable, boolean z, boolean z2, String str2, Function0 function0, String str3, BRg bRg, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: secondaryButton");
            }
            if ((i & 2) != 0) {
                drawable = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            boolean zA1P = AnonymousClass005.A1P(i, z2);
            if ((i & 16) != 0) {
                str2 = AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID;
            }
            if ((i & 64) != 0) {
                str3 = null;
            }
            if ((i & 128) != 0) {
                bRg = BRg.A00;
            }
            auraButtonGroupScope.secondaryButton(str, drawable, z, zA1P, str2, function0, str3, bRg);
        }

        public static /* synthetic */ void button$default(AuraButtonGroupScope auraButtonGroupScope, int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, String str, Function0 function0, String str2, BRg bRg, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    objArr = null;
                }
                if ((i2 & 4) != 0) {
                    drawable = null;
                }
                if ((i2 & 8) != 0) {
                    z = true;
                }
                boolean zA1Q = AnonymousClass005.A1Q(i2, z2);
                if ((i2 & 64) != 0) {
                    str = null;
                }
                if ((i2 & 256) != 0) {
                    str2 = null;
                }
                if ((i2 & 512) != 0) {
                    bRg = BRg.A00;
                }
                auraButtonGroupScope.button(i, objArr, drawable, z, zA1Q, auraButtonStyle, str, function0, str2, bRg);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: button");
        }

        public static /* synthetic */ void destructiveButton$default(AuraButtonGroupScope auraButtonGroupScope, int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0 function0, String str2, BRg bRg, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    objArr = null;
                }
                if ((i2 & 4) != 0) {
                    drawable = null;
                }
                if ((i2 & 8) != 0) {
                    z = true;
                }
                boolean zA1Q = AnonymousClass005.A1Q(i2, z2);
                if ((i2 & 32) != 0) {
                    str = AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID;
                }
                if ((i2 & 128) != 0) {
                    str2 = null;
                }
                if ((i2 & 256) != 0) {
                    bRg = BRg.A00;
                }
                auraButtonGroupScope.destructiveButton(i, objArr, drawable, z, zA1Q, str, function0, str2, bRg);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destructiveButton");
        }

        public static /* synthetic */ void primaryButton$default(AuraButtonGroupScope auraButtonGroupScope, int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0 function0, String str2, BRg bRg, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    objArr = null;
                }
                if ((i2 & 4) != 0) {
                    drawable = null;
                }
                if ((i2 & 8) != 0) {
                    z = true;
                }
                boolean zA1Q = AnonymousClass005.A1Q(i2, z2);
                if ((i2 & 32) != 0) {
                    str = AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID;
                }
                if ((i2 & 128) != 0) {
                    str2 = null;
                }
                if ((i2 & 256) != 0) {
                    bRg = BRg.A00;
                }
                auraButtonGroupScope.primaryButton(i, objArr, drawable, z, zA1Q, str, (Function0<Unit>) function0, str2, bRg);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: primaryButton");
        }

        public static /* synthetic */ void secondaryButton$default(AuraButtonGroupScope auraButtonGroupScope, int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0 function0, String str2, BRg bRg, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    objArr = null;
                }
                if ((i2 & 4) != 0) {
                    drawable = null;
                }
                if ((i2 & 8) != 0) {
                    z = true;
                }
                boolean zA1Q = AnonymousClass005.A1Q(i2, z2);
                if ((i2 & 32) != 0) {
                    str = AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID;
                }
                if ((i2 & 128) != 0) {
                    str2 = null;
                }
                if ((i2 & 256) != 0) {
                    bRg = BRg.A00;
                }
                auraButtonGroupScope.secondaryButton(i, objArr, drawable, z, zA1Q, str, function0, str2, bRg);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: secondaryButton");
        }
    }

    void button(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, String str, Function0<Unit> function0, String str2, BRg bRg);

    void button(String str, Drawable drawable, boolean z, boolean z2, AuraButtonStyle auraButtonStyle, String str2, Function0<Unit> function0, String str3, BRg bRg);

    void destructiveButton(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, BRg bRg);

    void destructiveButton(String str, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, BRg bRg);

    void primaryButton(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, BRg bRg);

    void primaryButton(String str, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, int i, BRg bRg);

    void secondaryButton(int i, Object[] objArr, Drawable drawable, boolean z, boolean z2, String str, Function0<Unit> function0, String str2, BRg bRg);

    void secondaryButton(String str, Drawable drawable, boolean z, boolean z2, String str2, Function0<Unit> function0, String str3, BRg bRg);

    public abstract class DefaultImpls {
    }
}
