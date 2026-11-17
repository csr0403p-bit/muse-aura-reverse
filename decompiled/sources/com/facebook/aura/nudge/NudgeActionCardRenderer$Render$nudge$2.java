package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NudgeActionCardRenderer$Render$nudge$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationCardControls $controls;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ConversationCardRequest $request;
    public final /* synthetic */ NudgeActionCardRenderer $tmp4_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NudgeActionCardRenderer$Render$nudge$2(NudgeActionCardRenderer nudgeActionCardRenderer, ConversationCardRequest conversationCardRequest, ConversationCardControls conversationCardControls, BRg bRg, int i) {
        super(2);
        this.$tmp4_rcvr = nudgeActionCardRenderer;
        this.$request = conversationCardRequest;
        this.$controls = conversationCardControls;
        this.$modifier = bRg;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp4_rcvr.Render(this.$request, this.$controls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
