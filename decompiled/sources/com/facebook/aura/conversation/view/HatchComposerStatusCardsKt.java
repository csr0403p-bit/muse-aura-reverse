package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusCard;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusCards;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import com.facebook.aura.conversation.widget.api.ConversationTimelineSurface;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchComposerStatusCardsKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchComposerStatusCardsKt$HatchComposerStatusCards$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $conversationId;
        public final /* synthetic */ boolean $isPrimaryConversation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConversationTimelineSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, ConversationTimelineSurface conversationTimelineSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$conversationId = str;
            this.$isPrimaryConversation = z;
            this.$surface = conversationTimelineSurface;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerStatusCardsKt.HatchComposerStatusCards(this.$conversationId, this.$isPrimaryConversation, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchComposerStatusCardsKt$HatchComposerStatusCards$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $conversationId;
        public final /* synthetic */ boolean $isPrimaryConversation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConversationTimelineSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, boolean z, ConversationTimelineSurface conversationTimelineSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$conversationId = str;
            this.$isPrimaryConversation = z;
            this.$surface = conversationTimelineSurface;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchComposerStatusCardsKt.HatchComposerStatusCards(this.$conversationId, this.$isPrimaryConversation, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchComposerStatusCards(String str, boolean z, ConversationTimelineSurface conversationTimelineSurface, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        AnonymousClass002.A1A(str, 0, conversationTimelineSurface);
        bfm.AgG(-749292937);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, conversationTimelineSurface);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1B = AnonymousClass003.A1B(iA0d) | bfm.A65(abstractC3358CGzA0h) | AnonymousClass003.A1C(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new ConversationComposerStatusContext(abstractC3358CGzA0h, str, z, conversationTimelineSurface);
                bfm.Ai0(objAaT);
            }
            ConversationComposerStatusContext conversationComposerStatusContext = (ConversationComposerStatusContext) objAaT;
            Object objA0p = AnonymousClass001.A0p(bfm, 1484011551);
            if (objA0p == C78N.A00) {
                objA0p = ConversationComposerStatusCards.INSTANCE.cards();
                bfm.Ai0(objA0p);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) objA0p) {
                if (((ConversationComposerStatusCard) obj).rememberIsVisible(conversationComposerStatusContext, bfm, ConversationComposerStatusContext.$stable)) {
                    arrayList.add(obj);
                }
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (arrayList.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(str, z, conversationTimelineSurface, bRg, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0D);
            Iterator itA0w = AnonymousClass001.A0w(bfm, arrayList, -836655207);
            while (itA0w.hasNext()) {
                ConversationComposerStatusCard conversationComposerStatusCard = (ConversationComposerStatusCard) itA0w.next();
                bfm.Ag8(-836654159, conversationComposerStatusCard.getKey());
                conversationComposerStatusCard.Render(conversationComposerStatusContext, BRg.A00, bfm, ConversationComposerStatusContext.$stable | 48);
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, z, conversationTimelineSurface, bRg, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
