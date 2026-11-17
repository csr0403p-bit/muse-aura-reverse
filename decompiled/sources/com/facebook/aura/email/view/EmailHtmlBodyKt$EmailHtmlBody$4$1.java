package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.view.View;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailHtmlBodyKt$EmailHtmlBody$4$1 extends AbstractC7559F3s implements G0U<View, Unit> {
    public static final EmailHtmlBodyKt$EmailHtmlBody$4$1 INSTANCE = new EmailHtmlBodyKt$EmailHtmlBody$4$1();

    public EmailHtmlBodyKt$EmailHtmlBody$4$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        C7384Etj.A0Y(view, 0);
        if (view instanceof EmailBodyWebView) {
            ((EmailBodyWebView) view).release();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }
}
