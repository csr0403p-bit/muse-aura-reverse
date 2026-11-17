package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NodePermissionCardRenderer$Render$rowId$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationCardControls $controls;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ConversationCardRequest $request;
    public final /* synthetic */ NodePermissionCardRenderer $tmp4_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodePermissionCardRenderer$Render$rowId$1(NodePermissionCardRenderer nodePermissionCardRenderer, ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, int i) {
        super(2);
        this.$tmp4_rcvr = nodePermissionCardRenderer;
        this.$request = conversationCardRequest;
        this.$controls = conversationCardControls;
        this.$modifier = bRg;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp4_rcvr.Render(this.$request, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
