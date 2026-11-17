package com.facebook.aura.conversation.api.inlineentity;

import X.BFM;
import X.G0V;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.model.HatchTextEntitySegment;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public interface ConversationInlineEntityIntegration {
    void ProvideInlineEntities(ConversationInlineEntityState conversationInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i);

    ConversationInlineEntityPreparation prepare(List<HatchTextEntitySegment> list);

    boolean rendersInlineEntitiesCleanly(AuraMarkdownDocument auraMarkdownDocument, int i);

    int sentinelCount(String str);
}
