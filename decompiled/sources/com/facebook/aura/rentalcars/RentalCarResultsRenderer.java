package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3UV;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationGenericListContext;
import com.facebook.aura.conversation.widget.api.ConversationGenericListRenderer;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.rentalcars.RentalCarDecode;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class RentalCarResultsRenderer implements ConversationGenericListRenderer {
    public static final RentalCarResultsRenderer INSTANCE = new RentalCarResultsRenderer();

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationGenericListContext $context;
        public final /* synthetic */ GenericListPresentation $list;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GenericListPresentation genericListPresentation, ConversationGenericListContext conversationGenericListContext, BRg bRg, int i) {
            super(2);
            this.$list = genericListPresentation;
            this.$context = conversationGenericListContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsRenderer.this.Render(this.$list, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationGenericListRenderer
    public void Render(GenericListPresentation genericListPresentation, ConversationGenericListContext conversationGenericListContext, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A10(genericListPresentation, conversationGenericListContext, bRg);
        bfm.AgG(-1745290290);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, genericListPresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationGenericListContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            RentalCarDecodeKey rentalCarDecodeKey = new RentalCarDecodeKey(conversationGenericListContext.hostMessageId, conversationGenericListContext.presentationId);
            RentalCarDecode rentalCarDecode = RentalCarDecodeCache.INSTANCE.get(rentalCarDecodeKey, genericListPresentation);
            if (rentalCarDecode == null) {
                rentalCarDecode = RentalCarDecode.Pending.INSTANCE;
            }
            boolean zA65 = bfm.A65(rentalCarDecodeKey) | AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new RentalCarResultsRenderer$Render$decoded$2$1(rentalCarDecodeKey, genericListPresentation, null);
                bfm.Ai0(objAaT);
            }
            RentalCarDecode rentalCarDecode2 = (RentalCarDecode) C3UV.A00(bfm, rentalCarDecode, rentalCarDecodeKey, genericListPresentation, (G0V) objAaT).getValue();
            if (C7384Etj.areEqual(rentalCarDecode2, RentalCarDecode.Pending.INSTANCE)) {
                bfm.AgE(2108263634);
            } else if (C7384Etj.areEqual(rentalCarDecode2, RentalCarDecode.Failed.INSTANCE)) {
                bfm.AgE(2108265093);
                AnonymousClass001.A1G(bRg, bfm, conversationGenericListContext.renderDefault, (iA0d >> 6) & 14);
            } else {
                if (!(rentalCarDecode2 instanceof RentalCarDecode.Ready)) {
                    throw AnonymousClass005.A0k(bfm, 2108262148);
                }
                bfm.AgE(2108267629);
                RentalCarResultsCardKt.m1883RentalCarResultsCard3f6hBDE(((RentalCarDecode.Ready) rentalCarDecode2).results, conversationGenericListContext.hostMessageId, conversationGenericListContext.presentationId, conversationGenericListContext.sessionId, conversationGenericListContext.containerBackgroundColor, conversationGenericListContext.containerShape, bRg, bfm, (iA0d << 12) & 3670016, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(genericListPresentation, conversationGenericListContext, bRg, i);
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationGenericListRenderer
    public boolean canRender(GenericListPresentation genericListPresentation) {
        C7384Etj.A0Y(genericListPresentation, 0);
        return RentalCarRateJsonKt.hasRentalCarRows(genericListPresentation);
    }
}
