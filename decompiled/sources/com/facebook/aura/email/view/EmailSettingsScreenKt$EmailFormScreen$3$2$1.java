package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.email.keys.EmailOwnerConfirmationKey;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailFormScreen$3$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ String $formKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<EmailState> $state$delegate;

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailFormScreen$3$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                boolean r0 = r1 instanceof com.facebook.aura.email.keys.EmailIntroKey
                if (r0 != 0) goto Ld
                boolean r1 = r1 instanceof com.facebook.aura.email.keys.EmailFormKey
                r0 = 0
                if (r1 == 0) goto Le
            Ld:
                r0 = 1
            Le:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailFormScreen$3$2$1.AnonymousClass1.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsScreenKt$EmailFormScreen$3$2$1(String str, AuraNavigator auraNavigator, String str2, C1BO<EmailState> c1bo) {
        super(1);
        this.$formKey = str;
        this.$navigator = auraNavigator;
        this.$environmentId = str2;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C7384Etj.areEqual(C1BO.A06(this.$state$delegate).savedFormKey, this.$formKey)) {
            this.$navigator.popAll(AnonymousClass1.INSTANCE);
            this.$navigator.navigate((AuraNavKey) new EmailOwnerConfirmationKey(this.$environmentId), false);
        }
        return new C78g() { // from class: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailFormScreen$3$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
