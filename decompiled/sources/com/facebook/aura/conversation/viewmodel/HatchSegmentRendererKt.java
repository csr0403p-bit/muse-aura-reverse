package com.facebook.aura.conversation.viewmodel;

import X.AbstractC0885AGm;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntities;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPlan;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityPreparation;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import com.facebook.aura.model.HatchTextEntitySegment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class HatchSegmentRendererKt {
    public static final int inlineEntitySentinelCount(String str) {
        C7384Etj.A0Y(str, 0);
        return ConversationInlineEntities.INSTANCE.sentinelCount(str);
    }

    public static final boolean rendersPillsCleanly(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        ConversationInlineEntities conversationInlineEntities = ConversationInlineEntities.INSTANCE;
        if (conversationInlineEntities.sentinelCount(str) == 0) {
            return false;
        }
        try {
            objA0s = AuraMarkdown.INSTANCE.parse(str, false);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        AuraMarkdownDocument auraMarkdownDocument = (AuraMarkdownDocument) objA0s;
        if (auraMarkdownDocument != null) {
            return conversationInlineEntities.rendersInlineEntitiesCleanly(str, auraMarkdownDocument);
        }
        return false;
    }

    public static final SegmentRender toSegmentRender(List<HatchTextEntitySegment> list) {
        C7384Etj.A0Y(list, 0);
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<HatchTextEntitySegment> it = list.iterator();
                while (it.hasNext()) {
                    if (!it.next().isSupported()) {
                        return null;
                    }
                }
            }
            ConversationInlineEntityPreparation conversationInlineEntityPreparationPrepare = ConversationInlineEntities.INSTANCE.prepare(list);
            if (!C7384Etj.areEqual(conversationInlineEntityPreparationPrepare, ConversationInlineEntityPreparation.NotApplicable.INSTANCE) && !C7384Etj.areEqual(conversationInlineEntityPreparationPrepare, ConversationInlineEntityPreparation.Rejected.INSTANCE)) {
                if (!(conversationInlineEntityPreparationPrepare instanceof ConversationInlineEntityPreparation.Ready)) {
                    throw C3cG.A0q();
                }
                ConversationInlineEntityPlan conversationInlineEntityPlan = ((ConversationInlineEntityPreparation.Ready) conversationInlineEntityPreparationPrepare).plan;
                StringBuilder sbA0w = C60O.A0w();
                int i = 0;
                for (HatchTextEntitySegment hatchTextEntitySegment : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    String strA0p = hatchTextEntitySegment.text;
                    if (strA0p == null) {
                        strA0p = C60O.A0p(Integer.valueOf(i), conversationInlineEntityPlan.markersBySegmentIndex);
                        if (strA0p == null) {
                            return null;
                        }
                    }
                    sbA0w.append(strA0p);
                    i = i2;
                }
                return new SegmentRender(sbA0w.toString(), conversationInlineEntityPlan.state, conversationInlineEntityPlan.markersBySegmentIndex.size());
            }
        }
        return null;
    }
}
