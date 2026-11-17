package com.facebook.aura.browsertask.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardContext;
import com.facebook.aura.model.HatchPresentationData;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class BrowserTaskPresentationCardRenderer$Render$browserTask$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationPresentationCardContext $context;
    public final /* synthetic */ HatchPresentationData $data;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ BrowserTaskPresentationCardRenderer $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserTaskPresentationCardRenderer$Render$browserTask$1(BrowserTaskPresentationCardRenderer browserTaskPresentationCardRenderer, HatchPresentationData hatchPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, int i) {
        super(2);
        this.$tmp0_rcvr = browserTaskPresentationCardRenderer;
        this.$data = hatchPresentationData;
        this.$context = conversationPresentationCardContext;
        this.$modifier = bRg;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.Render(this.$data, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
