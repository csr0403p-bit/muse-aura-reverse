package com.facebook.aura.modellock.view;

import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BN;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import com.facebook.aura.modellock.ModelLockAppealStage;
import com.facebook.aura.modellock.ModelLockRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ModelLockStatusCard implements ConversationComposerStatusCard {
    public static final ModelLockStatusCard INSTANCE = new ModelLockStatusCard();
    public static final String key = "model_lock";
    public static final int rank = 100;

    /* renamed from: com.facebook.aura.modellock.view.ModelLockStatusCard$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationComposerStatusContext $context;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, int i) {
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
            ModelLockStatusCard.this.Render(this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public void Render(ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        boolean zA1b = AnonymousClass004.A1b(conversationComposerStatusContext, bRg);
        bfm.AgG(1615137455);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationComposerStatusContext, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            ModelLockAppealStage modelLockAppealStageRememberAppealStage = rememberAppealStage(conversationComposerStatusContext, bfm, ConversationComposerStatusContext.$stable | (iA05 & 14) | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            if (modelLockAppealStageRememberAppealStage == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new ModelLockStatusCard$Render$appealStage$1(this, conversationComposerStatusContext, bRg, i);
                    bBbAAc.A06 = anonymousClass1;
                }
                return;
            }
            HatchModelLockCardKt.HatchModelLockCard(modelLockAppealStageRememberAppealStage, conversationComposerStatusContext, AbstractC07539Wl.A00(bRg, "hatch-model-lock"), bfm, (ConversationComposerStatusContext.$stable << 3) | ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(conversationComposerStatusContext, bRg, i);
            bBbAAc.A06 = anonymousClass1;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public boolean rememberIsVisible(ConversationComposerStatusContext conversationComposerStatusContext, BFM bfm, int i) {
        C7384Etj.A0Y(conversationComposerStatusContext, 0);
        bfm.AgE(-168990543);
        boolean zA1X = AnonymousClass002.A1X(rememberAppealStage(conversationComposerStatusContext, bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ConversationComposerStatusContext.$stable | (i & 14)));
        AnonymousClass001.A1D(bfm);
        return zA1X;
    }

    private final ModelLockAppealStage rememberAppealStage(ConversationComposerStatusContext conversationComposerStatusContext, BFM bfm, int i) {
        boolean zA65 = bfm.A65(conversationComposerStatusContext.userSession);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = ModelLockRepository.Companion.getInstance(conversationComposerStatusContext.userSession).appealStage;
            bfm.Ai0(objAaT);
        }
        return (ModelLockAppealStage) C1BO.A07(bfm, (C1BN) objAaT);
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public String getKey() {
        return key;
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard
    public int getRank() {
        return rank;
    }
}
