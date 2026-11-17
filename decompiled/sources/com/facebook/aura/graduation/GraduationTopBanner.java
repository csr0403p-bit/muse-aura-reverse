package com.facebook.aura.graduation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
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
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import com.facebook.aura.conversation.widget.api.ConversationTopBanner;
import com.facebook.aura.graduation.repo.HatchGraduationRepository;
import com.facebook.aura.graduation.repo.HatchGraduationState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class GraduationTopBanner implements ConversationTopBanner {
    public static final GraduationTopBanner INSTANCE = new GraduationTopBanner();
    public static final String key = "graduation";
    public static final int rank = 200;

    /* renamed from: com.facebook.aura.graduation.GraduationTopBanner$Render$2, reason: invalid class name */
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
            GraduationTopBanner.this.Render(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBanner
    public void Render(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(1290185011);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new GraduationTopBanner$Render$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            GraduationChatBannerKt.GraduationChatBanner((Function0) objAaT, bRg, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i);
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationTopBanner
    public boolean rememberIsVisible(ConversationComposerStatusContext conversationComposerStatusContext, BFM bfm, int i) {
        C7384Etj.A0Y(conversationComposerStatusContext, 0);
        bfm.AgE(-1868507289);
        boolean zA65 = bfm.A65(conversationComposerStatusContext.userSession);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchGraduationRepository.Companion.getInstance(conversationComposerStatusContext.userSession).state;
            bfm.Ai0(objAaT);
        }
        boolean shouldPromptInChat = ((HatchGraduationState) C1BO.A07(bfm, (C1BN) objAaT)).getShouldPromptInChat();
        AnonymousClass001.A1D(bfm);
        return shouldPromptInChat;
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
