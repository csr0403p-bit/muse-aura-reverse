package com.facebook.aura.bloks;

import X.AbstractC10476Hkp;
import X.AbstractC7965FMw;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C7958FMo;
import X.C8j3;
import X.FD3;
import X.FDW;
import X.FN4;
import X.FOO;
import X.Hi4;
import X.HiC;
import X.InterfaceC7962FMs;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.activity.AuraCDSBloksActivity;
import com.facebook.aura.bloks.data.AuraAppDataConfig;
import com.facebook.aura.bloks.screen.AuraAppScreenConfig;
import com.facebook.aura.bloks.ui.AuraCdsBottomSheetFragment;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AuraBloksNavigator {
    public void openCdsBottomSheet(Context context, String str, Map<String, String> map, FN4 fn4, FDW fdw, AuraAppScreenConfig auraAppScreenConfig, int i, FOO foo) {
        AnonymousClass002.A1B(map, 2, fn4);
        C7384Etj.A0Y(auraAppScreenConfig, 5);
        AuraCdsBottomSheetFragment.Companion companion = AuraCdsBottomSheetFragment.Companion;
        if (str == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        AuraCdsBottomSheetFragment auraCdsBottomSheetFragmentNewInstance = companion.newInstance(str, auraAppScreenConfig.builder.cdsOpenScreenConfig.A01());
        if (context == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        Activity activityA00 = HiC.A00(context);
        if (!(activityA00 instanceof FragmentActivity)) {
            throw C3cG.A0Q("Unable to launch CDS bottom sheet fragment without FragmentActivity!");
        }
        FD3.A03.A02(context);
        String strA00 = AbstractC10476Hkp.A00(fdw);
        AuraAppScreenConfig.Builder builder = auraAppScreenConfig.builder;
        if (!builder.cdsOpenScreenConfig.A0F.fullScreenStyle) {
            C7958FMo c7958FMo = new C7958FMo(foo, null, i);
            AbstractC7965FMw.A08(auraCdsBottomSheetFragmentNewInstance, (FragmentActivity) activityA00, fn4, builder.actionLoadingScreen, new AuraAppDataConfig(), c7958FMo, strA00);
            return;
        }
        AuraCDSBloksActivity.IntentBuilder intentBuilder = new AuraCDSBloksActivity.IntentBuilder(context);
        intentBuilder.bloksAppId = str;
        intentBuilder.bloksScreenId = strA00;
        intentBuilder.bloksParams = map;
        intentBuilder.appScreenConfig = Hi4.A00(auraAppScreenConfig);
        intentBuilder.keyboardSoftInputMode = i;
        intentBuilder.backButtonOverride = Hi4.A00(foo);
        context.startActivity(intentBuilder.build());
    }

    public /* bridge */ /* synthetic */ Fragment createFullScreenFragment(Context context, String str, Map map, FN4 fn4, FDW fdw, FDW fdw2, InterfaceC7962FMs interfaceC7962FMs) {
        throw C8j3.A18("Opening Full screen fragments not supported");
    }

    public /* bridge */ /* synthetic */ void navigateToFullScreen(Context context, String str, Map map, FN4 fn4, FDW fdw, FDW fdw2, InterfaceC7962FMs interfaceC7962FMs) {
        throw C8j3.A18("Navigation to Full Screen Non-CDS screen is not currently supported");
    }

    public /* bridge */ /* synthetic */ void openBottomSheet(Context context, String str, Map map, FN4 fn4, FDW fdw, FDW fdw2, InterfaceC7962FMs interfaceC7962FMs) {
        throw C8j3.A18("Opening Non-CDS bottom sheet is not supported currently");
    }

    public Fragment createFullScreenFragment(Context context, String str, Map<String, String> map, FN4 fn4, FDW fdw, FDW fdw2, AuraAppScreenConfig auraAppScreenConfig) {
        throw C8j3.A18("Opening Full screen fragments not supported");
    }

    public void navigateToFullScreen(Context context, String str, Map<String, String> map, FN4 fn4, FDW fdw, FDW fdw2, AuraAppScreenConfig auraAppScreenConfig) {
        throw C8j3.A18("Navigation to Full Screen Non-CDS screen is not currently supported");
    }

    public void openBottomSheet(Context context, String str, Map<String, String> map, FN4 fn4, FDW fdw, FDW fdw2, AuraAppScreenConfig auraAppScreenConfig) {
        throw C8j3.A18("Opening Non-CDS bottom sheet is not supported currently");
    }

    public /* bridge */ /* synthetic */ void openCdsBottomSheet(Context context, String str, Map map, FN4 fn4, FDW fdw, InterfaceC7962FMs interfaceC7962FMs, int i, FOO foo) {
        openCdsBottomSheet(context, str, (Map<String, String>) map, fn4, fdw, (AuraAppScreenConfig) interfaceC7962FMs, i, foo);
    }
}
