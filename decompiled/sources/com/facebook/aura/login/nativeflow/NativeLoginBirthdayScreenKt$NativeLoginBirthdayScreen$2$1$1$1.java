package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$2$1$1$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String string = AuraExternalUriRegistry.INSTANCE.getBirthdayInfoUri().uri.toString();
        C7384Etj.A0U(string);
        AuraBrowserLauncherKt.openBrowser(string, this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
