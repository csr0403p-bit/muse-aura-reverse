package com.facebook.aura.email.view;

import X.AFz;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.view.ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$-2014358331$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1 INSTANCE = new ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1();

    public ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1() {
        super(4);
    }

    public final void invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i) {
        String str;
        String strA0s;
        boolean zA1a = AnonymousClass002.A1a(emailViewModel, bRg);
        C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean z = false;
        Object[] objArr = new Object[0];
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$key$1$1.INSTANCE;
            bfm.Ai0(objAaT);
        }
        Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
        C7384Etj.A0U(objA03);
        String str2 = (String) objA03;
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12097e);
        boolean zA67 = bfm.A67(emailViewModel);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj) {
            objAaT2 = new ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$1$1(emailViewModel);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, emailViewModel);
        String str3 = C1BO.A06(c1boA02).mailboxDeletedKey;
        boolean zA1S = AnonymousClass004.A1S(bfm, str2, auraNavigatorA0b, bfm.A65(c1boA02));
        Object objAaT3 = bfm.AaT();
        if (zA1S || objAaT3 == obj) {
            objAaT3 = new ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$2$1(str2, auraNavigatorA0b, c1boA02);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A17(bfm, objAaT3, str3);
        EmailMailbox emailMailbox = C1BO.A06(c1boA02).resetMailbox;
        if (emailMailbox == null || (str = emailMailbox.emailAddress) == null) {
            str = C1BO.A06(c1boA02).pendingResetAddress;
        }
        C1062ATq c1062ATq = C10G.A02;
        BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass007.A0H(bfm, bRg, c1062ATq), "email-delete-mailbox");
        InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(16.0f), bfm, C2VU.A02, 6);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA00);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function0);
        AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
        EmailSettingsComponentsKt.EmailNavHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120950), null, false, bfm, 0, 6);
        if (str != null) {
            bfm.AgE(962457082);
            strA0s = AnonymousClass003.A0f(bfm, bbi, str, R.string._name_removed__res_0x7f120951);
        } else {
            bfm.AgE(962459601);
            strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120952);
        }
        EmailSettingsComponentsKt.EmailSettingsHelp(strA0s, null, bfm, 0, 2);
        if (C1BO.A06(c1boA02).pendingResetAddress != null) {
            bfm.AgE(962463079);
            EmailComponentsKt.EmailErrorMessage(EmailError.RESET_REQUIRED, null, bfm, 6, 2);
        } else {
            bfm.AgE(-228373337);
        }
        BBI.A0R(bbi, false);
        if (C1BO.A06(c1boA02).resetMailboxLoaded || C1BO.A06(c1boA02).deletingMailbox) {
            bfm.AgE(-228161049);
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(-228305199);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a3);
            boolean zA672 = bfm.A67(emailViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$3$1$1(emailViewModel);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, null, null, null, null, false, false, false, false, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT4), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201341);
            BBI.A0R(bbi, false);
        }
        EmailComponentsKt.EmailErrorMessage(C1BO.A06(c1boA02).deleteError, null, bfm, 0, 2);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120950);
        AuraLabelButtonStyle auraLabelButtonStyleDestructive = AuraButtonStyles.INSTANCE.destructive(null, bfm, 48, zA1a ? 1 : 0);
        if (C1BO.A06(c1boA02).resetMailboxLoaded && str != null && !C1BO.A06(c1boA02).deletingMailbox) {
            z = true;
        }
        boolean z2 = C1BO.A06(c1boA02).deletingMailbox;
        boolean zA1P = AnonymousClass003.A1P(bfm, str2, strA01, bfm.A67(emailViewModel));
        Object objAaT5 = bfm.AaT();
        if (zA1P || objAaT5 == obj) {
            objAaT5 = new ComposableSingletons$EmailDeleteMailboxScreenKt$lambda$2014358331$1$3$2$1(emailViewModel, str2, strA01);
            bfm.Ai0(objAaT5);
        }
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, c1062ATq, auraLabelButtonStyleDestructive, null, null, false, false, z, z2, false, null, null, (Function0) objAaT5, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134199781);
        BBI.A0R(bbi, zA1a);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
        invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
