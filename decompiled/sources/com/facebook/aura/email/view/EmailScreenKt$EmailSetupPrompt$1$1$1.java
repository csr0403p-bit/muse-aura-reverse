package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C60Q;
import X.C7mU;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.navigation.EmailSetupDeeplink;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class EmailScreenKt$EmailSetupPrompt$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailSetupPrompt$1$1$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C7mU.A00().A01().A05(this.$context, C60Q.A09(Uri.parse(EmailSetupDeeplink.URL)).setPackage(this.$context.getPackageName()));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
