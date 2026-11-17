package com.facebook.aura.skills.connect;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.G0U;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class CustomConnectorAuthScreenKt$CustomConnectorDisclaimers$1$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedPrivacyDisclaimer;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomConnectorAuthScreenKt$CustomConnectorDisclaimers$1$1$1(ApQ apQ, Context context) {
        super(1);
        this.$annotatedPrivacyDisclaimer = apQ;
        this.$context = context;
    }

    public final void invoke(int i) {
        if (AbstractC0878AGe.A0G(this.$annotatedPrivacyDisclaimer.A04(i, i)) != null) {
            AuraBrowserLauncherKt.openBrowser("https://www.facebook.com/privacy/genai", this.$context);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
