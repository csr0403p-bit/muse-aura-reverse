package com.facebook.aura.toast;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.HnJ;
import X.Hxb;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.network.sandbox.HatchDeveloperOverrides;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchGlobalToastsRegistry implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final Context appContext;
    public final BLG<List<Object>> mounts;
    public final C3UX scope;

    public final class Companion {
        public final HatchGlobalToastsRegistry getInstance(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            return (HatchGlobalToastsRegistry) abstractC3358CGz.A03(HatchGlobalToastsRegistry.class, new HatchGlobalToastsRegistry$Companion$getInstance$1(context));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void showATODOverrideWarning() {
        if (HatchGlobalToastsRegistryKt.hasShownATODWarning || HatchDeveloperOverrides.cachedAtodToken == null) {
            return;
        }
        HatchGlobalToastsRegistryKt.hasShownATODWarning = true;
        ToastApi.INSTANCE.showToast(new AuraToast.ToastArgs("Developer warning: AT-OD token override active for Jarvis", null, AuraToast.Duration.LONG, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final BLG<List<Object>> getMounts$fbandroid_express_aura_java_com_facebook_aura_toast_toast() {
        return this.mounts;
    }

    public HatchGlobalToastsRegistry(Context context) {
        this.appContext = context;
        this.scope = C3cH.A0x(C3cG.A0v());
        this.mounts = HnJ.A01(C0881AGi.A00);
        showATODOverrideWarning();
    }

    public /* synthetic */ HatchGlobalToastsRegistry(Context context, C06H c06h) {
        this(context);
    }
}
