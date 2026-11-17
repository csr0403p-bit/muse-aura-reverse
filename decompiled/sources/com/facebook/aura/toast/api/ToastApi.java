package com.facebook.aura.toast.api;

import X.C06G;
import X.C22I;
import X.C3Em;
import X.C4JM;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;

/* loaded from: classes.dex */
public final class ToastApi {
    public static final int $stable = 0;
    public static final ToastApi INSTANCE = new ToastApi();
    public static final C3Em<AuraToast.ToastArgs> _toasts;
    public static final C22I<AuraToast.ToastArgs> toasts;

    public final void showToast(String str) {
        C7384Etj.A0Y(str, 0);
        _toasts.AhV(new AuraToast.ToastArgs(str, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null));
    }

    static {
        C9290GCr c9290GCr = new C9290GCr(C79.A01, 0, 10);
        _toasts = c9290GCr;
        toasts = c9290GCr;
    }

    public final C22I<AuraToast.ToastArgs> getToasts() {
        return toasts;
    }

    public final void showLongToast(int i) {
        C06G.A0i(AuraToast.Duration.LONG, C4JM.A00().getString(i));
    }

    public final void showToast(int i) {
        showToast(C4JM.A00().getString(i));
    }

    public final void showToast(AuraToast.ToastArgs toastArgs) {
        C7384Etj.A0Y(toastArgs, 0);
        _toasts.AhV(toastArgs);
    }
}
