package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G2j;
import X.InterfaceC7353EnQ;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailScreen$3 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ String $initialAction;
    public final /* synthetic */ Function0<Unit> $onSetupRequestHandled;
    public final /* synthetic */ float $topPadding;

    public final void invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i) {
        EmailMailbox emailMailbox;
        boolean zA1a = AnonymousClass002.A1a(emailViewModel, bRg);
        C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
        boolean zA67 = bfm.A67(emailViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new EmailScreenKt$EmailScreen$3$1$1(emailViewModel);
            bfm.Ai0(objAaT);
        }
        C7bA.A05(bfm, null, emailViewModel, (G0U) objAaT, i & 14, 2);
        int i2 = i << 3;
        EmailScreenKt.EmailSetupLaunchEffect(this.$environmentId, emailViewModel, this.$initialAction, this.$onSetupRequestHandled, bfm, i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        if (C1BO.A06(c1boA02).pendingResetAddress != null || C1BO.A06(c1boA02).deletingMailbox) {
            bfm.AgE(1767463179);
            EmailComponentsKt.EmailErrorMessage(EmailError.RESET_REQUIRED, C3U4.A0A(bRg, this.$topPadding, this.$bottomPadding), bfm, 6, 0);
        } else {
            if (C1BO.A06(c1boA02).loading && !C1BO.A06(c1boA02).hasLoaded) {
                BRg bRgA0R = AnonymousClass002.A0R(bRg, bfm, 1767469801);
                float f = this.$topPadding;
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C3U4.A0A(bRgA0R, f, this.$bottomPadding + f), bfm, 0, 0);
            } else if (C1BO.A06(c1boA02).error != null && !C1BO.A06(c1boA02).hasLoaded) {
                bfm.AgE(1767477589);
                EmailError emailError = C1BO.A06(c1boA02).error;
                boolean zA672 = bfm.A67(emailViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new EmailScreenKt$EmailScreen$3$2$1(emailViewModel);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA0T = AnonymousClass001.A0T(bRg);
                float f2 = this.$topPadding;
                EmailComponentsKt.EmailRetry(emailError, (Function0) ((InterfaceC7353EnQ) objAaT2), C3U4.A0A(bRgA0T, f2, this.$bottomPadding + f2), bfm, 0, 0);
            } else if (C1BO.A06(c1boA02).mailbox == null || ((emailMailbox = C1BO.A06(c1boA02).mailbox) != null && emailMailbox.isTakenDown() == zA1a)) {
                bfm.AgE(-1042472328);
                AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                float f3 = this.$topPadding;
                float f4 = this.$bottomPadding;
                EmailMailbox emailMailbox2 = C1BO.A06(c1boA02).mailbox;
                EmailRestrictionNotice takenDownNotice = emailMailbox2 != null ? emailMailbox2.getTakenDownNotice() : null;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, AnonymousClass003.A1M(bfm, this.$inboxSession, auraNavigatorA0b));
                EmailInboxSessionViewModel emailInboxSessionViewModel = this.$inboxSession;
                String str = this.$environmentId;
                Object objAaT3 = bfm.AaT();
                if (zA1R || objAaT3 == C78N.A00) {
                    objAaT3 = new EmailScreenKt$EmailScreen$3$3$1(emailInboxSessionViewModel, auraNavigatorA0b, str);
                    bfm.Ai0(objAaT3);
                }
                EmailScreenKt.m754EmailSetupPromptcmhDWc(f3, f4, bRg, takenDownNotice, (Function0) objAaT3, bfm, i2 & 896, 0);
            } else {
                bfm.AgE(1767498374);
                EmailScreenKt.m752EmailInboxnSlTg7c(this.$environmentId, C1BO.A06(c1boA02), emailViewModel, this.$topPadding, this.$bottomPadding, bRg, bfm, AnonymousClass001.A08(i << 12, (i << 6) & 896), 0);
            }
        }
        AnonymousClass001.A1D(bfm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailScreen$3(String str, String str2, Function0<Unit> function0, float f, float f2, EmailInboxSessionViewModel emailInboxSessionViewModel) {
        super(4);
        this.$environmentId = str;
        this.$initialAction = str2;
        this.$onSetupRequestHandled = function0;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$inboxSession = emailInboxSessionViewModel;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
        invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
