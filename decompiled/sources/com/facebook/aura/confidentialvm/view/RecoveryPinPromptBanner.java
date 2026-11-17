package com.facebook.aura.confidentialvm.view;

import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.conversation.widget.api.ConversationTopBanner;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RecoveryPinPromptBanner implements ConversationTopBanner {
    public static final RecoveryPinPromptBanner INSTANCE = new RecoveryPinPromptBanner();
    public static final String key = "cvm_recovery_pin_prompt";
    public static final int rank = 100;

    /* renamed from: com.facebook.aura.confidentialvm.view.RecoveryPinPromptBanner$Render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            RecoveryPinPromptBanner.this.Render(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBanner
    public void Render(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(1283657595);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208aa);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.asterisk_outline_24_wght400, 0);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new RecoveryPinPromptBanner$Render$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchChatPromptPillKt.HatchChatPromptPill(strA01, aVyA00, (Function0) objAaT, bRg, bfm, (AVy.$stable << 3) | ((iA0d << 9) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean rememberIsVisible(com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext r2, X.BFM r3, int r4) {
        /*
            r1 = this;
            r0 = 0
            X.C7384Etj.A0Y(r2, r0)
            r0 = -666071097(0xffffffffd84c8fc7, float:-8.9967156E14)
            r3.AgE(r0)
            X.CGz r0 = r2.userSession
            boolean r1 = r3.A65(r0)
            java.lang.Object r0 = r3.AaT()
            if (r1 != 0) goto L1a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L27
        L1a:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$Companion r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.Companion
            X.CGz r0 = r2.userSession
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = r1.getInstance(r0)
            X.1BN<java.lang.Boolean> r0 = r0.recoveryPinPromptVisible
            r3.Ai0(r0)
        L27:
            X.1BN r0 = (X.C1BN) r0
            X.1BO r1 = X.C2CK.A02(r3, r0)
            boolean r0 = r2.isPrimaryConversation
            if (r0 == 0) goto L38
            boolean r1 = X.C1BO.A0F(r1)
            r0 = 1
            if (r1 != 0) goto L39
        L38:
            r0 = 0
        L39:
            X.AnonymousClass001.A1D(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.RecoveryPinPromptBanner.rememberIsVisible(com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext, X.BFM, int):boolean");
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBanner
    public String getKey() {
        return key;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBanner
    public int getRank() {
        return rank;
    }
}
