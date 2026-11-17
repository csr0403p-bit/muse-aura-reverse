package com.facebook.aura.email.view;

import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C10G;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C5wL;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G2j;
import X.InterfaceC7353EnQ;
import com.facebook.aura.email.model.EmailAttachmentFile;
import com.facebook.aura.email.viewmodel.EmailAttachmentUiState;
import com.facebook.aura.email.viewmodel.EmailAttachmentViewModel;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.file.view.FileViewerScreenKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class EmailAttachmentScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentScreenKt$EmailAttachmentScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ EmailAttachmentViewModel $model;
        public final /* synthetic */ C1BO<EmailAttachmentUiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(EmailAttachmentViewModel emailAttachmentViewModel, C1BO<? extends EmailAttachmentUiState> c1bo) {
            super(4);
            this.$model = emailAttachmentViewModel;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m745invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m745invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BRg bRgA0A = C3U4.A0A(C10G.A01, f, f2);
            if (C7384Etj.areEqual(this.$state$delegate.getValue(), EmailAttachmentUiState.Loading.INSTANCE)) {
                bfm.AgE(333617520);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(bRgA0A, bfm, 0, 0);
            } else {
                bfm.AgE(333681566);
                EmailError emailError = EmailError.LOAD;
                EmailAttachmentViewModel emailAttachmentViewModel = this.$model;
                boolean zA67 = bfm.A67(emailAttachmentViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new EmailAttachmentScreenKt$EmailAttachmentScreen$3$1$1(emailAttachmentViewModel);
                    bfm.Ai0(objAaT);
                }
                EmailComponentsKt.EmailRetry(emailError, (Function0) ((InterfaceC7353EnQ) objAaT), bRgA0A, bfm, 6, 0);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAttachmentScreenKt$EmailAttachmentScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $attachmentIndex;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$environmentId = str;
            this.$messageId = str2;
            this.$attachmentIndex = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            EmailAttachmentScreenKt.EmailAttachmentScreen(this.$environmentId, this.$messageId, this.$attachmentIndex, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void EmailAttachmentScreen(String str, String str2, int i, BRg bRg, BFM bfm, int i2, int i3) {
        EmailAttachmentUiState.Loaded loaded;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(-71610665);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            StringBuilder sbA0f = C3cG.A0f(bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration), "email-attachment:");
            C60O.A1R(":", str, sbA0f);
            sbA0f.append(str2);
            String strA1O = C60P.A1O(":", sbA0f, i);
            EmailAttachmentViewModel.Factory factory = new EmailAttachmentViewModel.Factory(AnonymousClass002.A0H(bfm), AnonymousClass002.A0h(bfm), str, str2, i);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            EmailAttachmentViewModel emailAttachmentViewModel = (EmailAttachmentViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA1O, C3cG.A0x(EmailAttachmentViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, emailAttachmentViewModel.state);
            EmailAttachmentUiState emailAttachmentUiState = (EmailAttachmentUiState) c1boA02.getValue();
            if (!(emailAttachmentUiState instanceof EmailAttachmentUiState.Loaded) || (loaded = (EmailAttachmentUiState.Loaded) emailAttachmentUiState) == null) {
                bfm.AgE(1246432103);
                AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
                BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "email-attachment-viewer");
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new EmailAttachmentScreenKt$EmailAttachmentScreen$2$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRgA00, null, 0L, "", null, (Function0) objAaT, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new AnonymousClass3(emailAttachmentViewModel, c1boA02), 923563960), bfm, 24582, zA1b ? 1 : 0, 805306368, 536870828);
            } else {
                bfm.AgE(1246161907);
                EmailAttachmentFile emailAttachmentFile = loaded.file;
                String str3 = emailAttachmentFile.uri;
                String str4 = emailAttachmentFile.filename;
                boolean zA672 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new EmailAttachmentScreenKt$EmailAttachmentScreen$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                FileViewerScreenKt.FileViewerScreen(str3, (Function0) objAaT2, bRg2, str4, zA1b, zA1b, zA1b, bfm, ((iA0d >> 3) & 896) | 1794048, zA1b ? 1 : 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, i, bRg2, i2, i3);
        }
    }

    public static final /* synthetic */ EmailAttachmentUiState access$EmailAttachmentScreen$lambda$0(C1BO c1bo) {
        return (EmailAttachmentUiState) c1bo.getValue();
    }
}
