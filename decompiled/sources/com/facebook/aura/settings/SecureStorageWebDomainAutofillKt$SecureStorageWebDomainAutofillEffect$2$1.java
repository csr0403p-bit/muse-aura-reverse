package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ View $view;
    public final /* synthetic */ String $webDomain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$2$1(View view, String str) {
        super(0);
        this.$view = view;
        this.$webDomain = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WebDomainAutofillLayout webDomainAutofillLayout = SecureStorageWebDomainAutofillKt.webDomainAutofillLayout(this.$view);
        if (webDomainAutofillLayout != null) {
            webDomainAutofillLayout.setWebDomain(this.$webDomain);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
