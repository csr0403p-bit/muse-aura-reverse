package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AbstractC8829Fnp;
import X.C60P;
import X.C7mU;
import X.C7oa;
import X.CFK;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSettingsScreenKt$AppUpdatesCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$AppUpdatesCard$1$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.TAB_SETTINGS, HatchScreen.SETTINGS_MAIN, HatchComponent.APP_UPDATES_BUTTON, null, null, null);
        try {
            Context context = this.$context;
            Intent intentA03 = C60P.A03(C7oa.A00);
            intentA03.setComponent(new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"));
            intentA03.putExtra("package_name", context.getPackageName());
            C7mU.A00().A07(AbstractC8829Fnp.A00).A05(this.$context, intentA03);
        } catch (ActivityNotFoundException e) {
            CFK.A0A(HatchSettingsScreenKt.TAG, "App Update Settings activity not found", e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
