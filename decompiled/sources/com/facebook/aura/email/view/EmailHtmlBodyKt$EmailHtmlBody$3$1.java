package com.facebook.aura.email.view;

import X.AbstractC3422CMk;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class EmailHtmlBodyKt$EmailHtmlBody$3$1 extends AbstractC7559F3s implements G0U<Context, View> {
    public final /* synthetic */ MutableState<Boolean> $failed$delegate;

    @Override // X.G0U
    public final View invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            return new EmailBodyWebView(context);
        } catch (RuntimeException unused) {
            AbstractC3422CMk.A04("EmailHtmlBody", "WebView creation failed; showing message text");
            MutableState.A09(true, this.$failed$delegate);
            return new View(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailHtmlBodyKt$EmailHtmlBody$3$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$failed$delegate = mutableState;
    }
}
