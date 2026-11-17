package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.view.View;

/* loaded from: classes4.dex */
public final class SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<String> $currentWebDomain$delegate;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$1$1(View view, C1BO<String> c1bo) {
        super(1);
        this.$view = view;
        this.$currentWebDomain$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final View view = this.$view;
        final C1BO<String> c1bo = this.$currentWebDomain$delegate;
        final Runnable runnable = new Runnable() { // from class: com.facebook.aura.settings.SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$1$1$wrap$1
            @Override // java.lang.Runnable
            public final void run() {
                WebDomainAutofillLayout webDomainAutofillLayoutWrapDialogLayout = SecureStorageWebDomainAutofillKt.wrapDialogLayout(view);
                if (webDomainAutofillLayoutWrapDialogLayout != null) {
                    webDomainAutofillLayoutWrapDialogLayout.setWebDomain(C1BO.A08(c1bo));
                }
            }
        };
        view.post(runnable);
        final View view2 = this.$view;
        return new C78g() { // from class: com.facebook.aura.settings.SecureStorageWebDomainAutofillKt$SecureStorageWebDomainAutofillEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                view2.removeCallbacks(runnable);
                SecureStorageWebDomainAutofillKt.unwrapDialogLayout(view2);
            }
        };
    }
}
