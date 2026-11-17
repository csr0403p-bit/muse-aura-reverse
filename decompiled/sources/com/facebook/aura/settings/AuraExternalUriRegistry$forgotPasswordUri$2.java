package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BV3;
import X.C3cF;
import X.C60O;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AuraExternalUriRegistry$forgotPasswordUri$2 extends AbstractC7559F3s implements Function0<SecureUri> {
    public static final AuraExternalUriRegistry$forgotPasswordUri$2 INSTANCE = new AuraExternalUriRegistry$forgotPasswordUri$2();

    public AuraExternalUriRegistry$forgotPasswordUri$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SecureUri invoke() {
        String forgotPasswordUrl = AuraExternalUriRegistry.INSTANCE.getForgotPasswordUrl();
        if (C7BY.A0j(forgotPasswordUrl) || forgotPasswordUrl == null) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(forgotPasswordUrl).buildUpon().appendQueryParameter("source_app_id", BV3.A00(6)).appendQueryParameter("utm_source", AuraExternalUriRegistryKt.FORGOT_PASSWORD_UTM_SOURCE);
        String str = HatchAuthFlowContext.INSTANCE.snapshot().waterfallId;
        if (str != null) {
            builderAppendQueryParameter.appendQueryParameter(C3cF.A00(62), str);
        }
        return SecureUriKt.asSecureUri(C60O.A0o(builderAppendQueryParameter.build()));
    }
}
