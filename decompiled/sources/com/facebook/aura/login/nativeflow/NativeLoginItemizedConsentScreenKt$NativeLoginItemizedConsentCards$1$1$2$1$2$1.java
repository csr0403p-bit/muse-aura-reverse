package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        AuraBrowserLauncherKt.openBrowser(str, this.$context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$2$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
