package com.facebook.aura.conversation.api.inlineentity;

import X.AGI;
import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.AnonymousClass801;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ConversationInlineEntities {
    public static final int $stable = 0;
    public static final ConversationInlineEntities INSTANCE = new ConversationInlineEntities();

    /* renamed from: com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntities$ProvideInlineEntities$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ ConversationInlineEntityState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ConversationInlineEntityState conversationInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$state = conversationInlineEntityState;
            this.$messageId = str;
            this.$sessionId = str2;
            this.$isPrimaryThread = z;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationInlineEntities.this.ProvideInlineEntities(this.$state, this.$messageId, this.$sessionId, this.$isPrimaryThread, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public final void ProvideInlineEntities(ConversationInlineEntityState conversationInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass002.A1C(str, 1, g0v);
        bfm.AgG(-1805724315);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationInlineEntityState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                ArrayList arrayListA11 = C60O.A11(1);
                arrayListA11.add(AnonymousClass801.A00(new int[]{0}[0]));
                objAaT = AGI.A07(arrayListA11);
                bfm.Ai0(objAaT);
            }
            int i2 = iA05 << 6;
            ConversationInlineEntityIntegrationKt.ProvideRegisteredInlineEntities((AHD) objAaT, 0, conversationInlineEntityState instanceof PreparedInlineEntityState ? (PreparedInlineEntityState) conversationInlineEntityState : null, str, str2, z, g0v, bfm, AnonymousClass001.A05(i2, AnonymousClass004.A02(i2, (i2 & 7168) | 48)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(conversationInlineEntityState, str, str2, z, g0v, i);
        }
    }

    public final ConversationInlineEntityPreparation prepare(List<HatchTextEntitySegment> list) {
        ConversationInlineEntityPreparation conversationInlineEntityPreparation;
        C7384Etj.A0Y(list, 0);
        ConversationInlineEntityIntegration conversationInlineEntityIntegrationA00 = AnonymousClass801.A00(new int[]{0}[0]);
        C7384Etj.A0U(conversationInlineEntityIntegrationA00);
        ConversationInlineEntityPreparation conversationInlineEntityPreparationPrepare = conversationInlineEntityIntegrationA00.prepare(list);
        if (C7384Etj.areEqual(conversationInlineEntityPreparationPrepare, ConversationInlineEntityPreparation.NotApplicable.INSTANCE)) {
            conversationInlineEntityPreparation = ConversationInlineEntityPreparation.NotApplicable.INSTANCE;
        } else {
            if (!C7384Etj.areEqual(conversationInlineEntityPreparationPrepare, ConversationInlineEntityPreparation.Rejected.INSTANCE)) {
                if (!(conversationInlineEntityPreparationPrepare instanceof ConversationInlineEntityPreparation.Ready)) {
                    throw C3cG.A0q();
                }
                ConversationInlineEntityPlan conversationInlineEntityPlan = ((ConversationInlineEntityPreparation.Ready) conversationInlineEntityPreparationPrepare).plan;
                if (!conversationInlineEntityPlan.markersBySegmentIndex.isEmpty()) {
                    LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                    Iterator itA0n = AnonymousClass002.A0n(conversationInlineEntityPlan.markersBySegmentIndex);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        int iA0F = AnonymousClass001.A0F(entryA0l.getKey());
                        Object value = entryA0l.getValue();
                        Integer numValueOf = Integer.valueOf(iA0F);
                        if (!linkedHashMapA0j.containsKey(numValueOf)) {
                            linkedHashMapA0j.put(numValueOf, value);
                        }
                    }
                    ArrayList arrayListA0h = C3cG.A0h();
                    arrayListA0h.add(new PreparedInlineEntityIntegration(conversationInlineEntityIntegrationA00, conversationInlineEntityPlan.state));
                    return new ConversationInlineEntityPreparation.Ready(new ConversationInlineEntityPlan(AGI.A08(linkedHashMapA0j), new PreparedInlineEntityState(AGI.A07(arrayListA0h))));
                }
                conversationInlineEntityPreparation = ConversationInlineEntityPreparation.NotApplicable.INSTANCE;
            }
            conversationInlineEntityPreparation = ConversationInlineEntityPreparation.Rejected.INSTANCE;
        }
        return conversationInlineEntityPreparation;
    }

    public final boolean rendersInlineEntitiesCleanly(String str, AuraMarkdownDocument auraMarkdownDocument) {
        boolean zA1a = AnonymousClass002.A1a(str, auraMarkdownDocument);
        ConversationInlineEntityIntegration conversationInlineEntityIntegrationA00 = AnonymousClass801.A00(new int[]{0}[0]);
        C7384Etj.A0U(conversationInlineEntityIntegrationA00);
        int iSentinelCount = conversationInlineEntityIntegrationA00.sentinelCount(str);
        if (iSentinelCount == 0 || conversationInlineEntityIntegrationA00.rendersInlineEntitiesCleanly(auraMarkdownDocument, iSentinelCount)) {
            return zA1a;
        }
        return false;
    }

    public final int sentinelCount(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass801.A00(new int[]{0}[0]).sentinelCount(str);
    }
}
