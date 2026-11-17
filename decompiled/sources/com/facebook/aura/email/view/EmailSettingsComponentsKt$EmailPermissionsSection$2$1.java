package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.email.model.EmailPermissions;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSettingsComponentsKt$EmailPermissionsSection$2$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailPermissions $permissions;
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsComponentsKt$EmailPermissionsSection$2$1(EmailPermissions emailPermissions, EmailState emailState, AuraNavigator auraNavigator, String str, EmailViewModel emailViewModel) {
        super(3);
        this.$permissions = emailPermissions;
        this.$state = emailState;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
        this.$model = emailViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.C07C r18, X.BFM r19, int r20) {
        /*
            r17 = this;
            r5 = 0
            r0 = r18
            X.C7384Etj.A0Y(r0, r5)
            r1 = r20
            r0 = r20 & 17
            r8 = 16
            r7 = 1
            boolean r0 = X.AnonymousClass002.A1P(r0, r8)
            r6 = r19
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r1)
            if (r0 == 0) goto Ld8
            r1 = r17
            com.facebook.aura.email.model.EmailPermissions r0 = r1.$permissions
            X.AHD<com.facebook.aura.email.model.EmailPermissionMethod> r0 = r0.methods
            com.facebook.aura.email.viewmodel.EmailState r4 = r1.$state
            com.facebook.aura.navigation.AuraNavigator r3 = r1.$navigator
            java.lang.String r2 = r1.$environmentId
            com.facebook.aura.email.viewmodel.EmailViewModel r1 = r1.$model
            java.util.Iterator r12 = r0.iterator()
            r9 = 0
        L2c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r13 = r12.next()
            int r11 = r9 + 1
            if (r9 >= 0) goto L42
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L42:
            com.facebook.aura.email.model.EmailPermissionMethod r13 = (com.facebook.aura.email.model.EmailPermissionMethod) r13
            if (r9 <= 0) goto Ld0
            r0 = -1503948109(0xffffffffa65b92b3, float:-7.6179703E-16)
            r6.AgE(r0)
            r0 = 0
            com.facebook.aura.email.view.EmailSettingsComponentsKt.EmailRowDivider(r0, r6, r5, r7)
        L50:
            r0 = r6
            X.BBI r0 = (X.BBI) r0
            X.BBI.A0R(r0, r5)
            boolean r9 = r13.needsVerifiedEmail
            if (r9 == 0) goto L8e
            r9 = 622311964(0x2517ba1c, float:1.3160219E-16)
            r6.AgE(r9)
            java.lang.String r13 = r13.title
            boolean r14 = r4.getCanEditPermissions()
            boolean r9 = X.AnonymousClass003.A1N(r6, r3, r2)
            java.lang.Object r15 = r6.AaT()
            if (r9 != 0) goto L74
            java.lang.Object r9 = X.C78N.A00
            if (r15 != r9) goto L7c
        L74:
            com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$2$1$1$1$1 r15 = new com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$2$1$1$1$1
            r15.<init>(r3, r2)
            r6.Ai0(r15)
        L7c:
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r16 = 0
            r19 = 8
            r18 = r5
            r17 = r6
            com.facebook.aura.email.view.EmailSettingsComponentsKt.EmailPermissionVerifyRow(r13, r14, r15, r16, r17, r18, r19)
        L89:
            X.BBI.A0R(r0, r5)
            r9 = r11
            goto L2c
        L8e:
            r9 = 622546231(0x251b4d37, float:1.3470268E-16)
            r6.AgE(r9)
            java.lang.String r10 = r4.savingPermissionKey
            java.lang.String r9 = r13.key
            boolean r14 = X.C7384Etj.areEqual(r10, r9)
            boolean r9 = r4.getCanEditPermissions()
            if (r9 == 0) goto La9
            boolean r9 = r13.isEditable()
            r15 = 1
            if (r9 != 0) goto Laa
        La9:
            r15 = 0
        Laa:
            boolean r10 = X.AnonymousClass003.A1M(r6, r1, r13)
            java.lang.Object r9 = r6.AaT()
            if (r10 != 0) goto Lb8
            java.lang.Object r10 = X.C78N.A00
            if (r9 != r10) goto Lc0
        Lb8:
            com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$2$1$1$2$1 r9 = new com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$2$1$1$2$1
            r9.<init>(r1, r13)
            r6.Ai0(r9)
        Lc0:
            X.G0U r9 = (X.G0U) r9
            r17 = 0
            r19 = r5
            r20 = r8
            r18 = r6
            r16 = r9
            com.facebook.aura.email.view.EmailSettingsComponentsKt.EmailPermissionRow(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L89
        Ld0:
            r0 = 622265216(0x25170380, float:1.3098348E-16)
            r6.AgE(r0)
            goto L50
        Ld8:
            r6.Afo()
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$2$1.invoke(X.07C, X.BFM, int):void");
    }
}
