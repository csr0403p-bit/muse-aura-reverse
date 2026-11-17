package com.facebook.aura.confidentialvm.view;

import X.AEs;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSupportAccessViewModel;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SupportInvestigatingStatusCard implements ConversationComposerStatusCard {
    public static final SupportInvestigatingStatusCard INSTANCE = new SupportInvestigatingStatusCard();
    public static final String key = "confidential_vm_support_investigating";
    public static final int rank = 200;

    /* renamed from: com.facebook.aura.confidentialvm.view.SupportInvestigatingStatusCard$Render$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationComposerStatusContext $context;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, int i) {
            super(2);
            this.$context = conversationComposerStatusContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SupportInvestigatingStatusCard.this.Render(this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean rememberIsVisible(com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext r3, X.BFM r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
            r0 = -639722709(0xffffffffd9de9b2b, float:-7.8322567E15)
            r4.AgE(r0)
            X.CGz r0 = r3.userSession
            boolean r1 = r4.A65(r0)
            java.lang.Object r0 = r4.AaT()
            if (r1 != 0) goto L1a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L27
        L1a:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$Companion r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.Companion
            X.CGz r0 = r3.userSession
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = r1.getInstance(r0)
            X.1BN<java.lang.Boolean> r0 = r0.supportInvestigatingVisible
            r4.Ai0(r0)
        L27:
            X.1BN r0 = (X.C1BN) r0
            X.1BO r2 = X.C2CK.A02(r4, r0)
            com.facebook.aura.conversation.widget.api.ConversationTimelineSurface r1 = r3.surface
            com.facebook.aura.conversation.widget.api.ConversationTimelineSurface r0 = com.facebook.aura.conversation.widget.api.ConversationTimelineSurface.MAIN_CHAT
            if (r1 != r0) goto L3e
            boolean r0 = r3.isPrimaryConversation
            if (r0 == 0) goto L3e
            boolean r1 = X.C1BO.A0F(r2)
            r0 = 1
            if (r1 != 0) goto L3f
        L3e:
            r0 = 0
        L3f:
            X.AnonymousClass001.A1D(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.SupportInvestigatingStatusCard.rememberIsVisible(com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext, X.BFM, int):boolean");
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public String getKey() {
        return key;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public int getRank() {
        return rank;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public void Render(ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(conversationComposerStatusContext, bRg);
        bfm.AgG(1243364777);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationComposerStatusContext, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            ConfidentialVmSupportAccessViewModel.Factory factory = new ConfidentialVmSupportAccessViewModel.Factory(conversationComposerStatusContext.userSession);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            AEs aEsA14 = AnonymousClass004.A14(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), ConfidentialVmSupportAccessViewModel.class);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = SupportInvestigatingStatusCard$Render$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA67 = bfm.A67(aEsA14);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new SupportInvestigatingStatusCard$Render$2$1(aEsA14);
                bfm.Ai0(objAaT2);
            }
            HatchSupportInvestigatingCardKt.HatchSupportInvestigatingCard(function0, (Function0) ((InterfaceC7353EnQ) objAaT2), AbstractC07539Wl.A00(bRg, "hatch-support-investigating"), bfm, 6, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(conversationComposerStatusContext, bRg, i);
        }
    }
}
