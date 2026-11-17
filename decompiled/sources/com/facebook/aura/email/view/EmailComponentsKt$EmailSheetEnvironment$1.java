package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C07C;
import X.C10G;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.G0W;
import X.G2j;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSheetEnvironment$1 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $allowReset;
    public final /* synthetic */ G2j<EmailViewModel, BRg, BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $fillHeight;
    public final /* synthetic */ G0W<EmailViewModel, BFM, Integer, Unit> $footer;
    public final /* synthetic */ float $horizontalPadding;

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSheetEnvironment$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G2j<EmailViewModel, BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ float $horizontalPadding;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ boolean $resetBlocked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, G2j<? super EmailViewModel, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, EmailViewModel emailViewModel, float f) {
            super(3);
            this.$resetBlocked = z;
            this.$content = g2j;
            this.$model = emailViewModel;
            this.$horizontalPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                if (this.$resetBlocked) {
                    bfm.AgE(-1004533370);
                    EmailComponentsKt.EmailErrorMessage(EmailError.RESET_REQUIRED, C3U4.A09(BRg.A00, 24.0f), bfm, 54, 0);
                } else {
                    bfm.AgE(-1004530386);
                    G2j<EmailViewModel, BRg, BFM, Integer, Unit> g2j = this.$content;
                    EmailViewModel emailViewModel = this.$model;
                    BS0 bs0 = BRg.A00;
                    float f = this.$horizontalPadding;
                    AnonymousClass001.A1F(emailViewModel, C3U4.A0C(bs0, f, 0.0f, f, 24.0f), bfm, g2j, 0);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSheetEnvironment$1(boolean z, boolean z2, G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, G2j<? super EmailViewModel, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, float f) {
        super(4);
        this.$allowReset = z;
        this.$fillHeight = z2;
        this.$footer = g0w;
        this.$content = g2j;
        this.$horizontalPadding = f;
    }

    public final void invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i) {
        BRg bRgA04 = bRg;
        boolean zA1b = AnonymousClass004.A1b(emailViewModel, bRgA04);
        C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
        boolean z = false;
        boolean z2 = !this.$allowReset && (C1BO.A06(c1boA02).pendingResetAddress != null || C1BO.A06(c1boA02).deletingMailbox);
        AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
        if (this.$fillHeight) {
            bfm.AgE(-2060770270);
            bRgA04 = C10G.A04(bRgA04, EmailComponentsKt.emailFlowSheetHeight(bfm, zA1b ? 1 : 0));
        } else {
            bfm.AgE(-2060769133);
        }
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, zA1b);
        B1U b1uA00 = null;
        if (z2) {
            bfm.AgE(540778073);
        } else {
            bfm.AgE(540796457);
            G0W<EmailViewModel, BFM, Integer, Unit> g0w = this.$footer;
            if (g0w == null) {
                bfm.AgE(540796456);
            } else {
                bfm.AgE(540796457);
                b1uA00 = B1V.A00(bfm, new EmailComponentsKt$EmailSheetEnvironment$1$1$1(g0w, emailViewModel), -1697264584);
            }
            BBI.A0R(bbi, zA1b);
        }
        BBI.A0R(bbi, zA1b);
        if (!C1BO.A06(c1boA02).saving && !C1BO.A06(c1boA02).sendersBusy && !C1BO.A06(c1boA02).confirmingOwner) {
            z = true;
        }
        AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA04, null, null, b1uA00, null, null, z, zA1b, this.$fillHeight, null, B1V.A00(bfm, new AnonymousClass2(z2, this.$content, emailViewModel, this.$horizontalPadding), 79401537), bfm, 390, 48, 1384);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
        invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
