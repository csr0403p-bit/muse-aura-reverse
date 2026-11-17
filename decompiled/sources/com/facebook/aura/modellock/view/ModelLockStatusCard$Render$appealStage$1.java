package com.facebook.aura.modellock.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationComposerStatusContext;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ModelLockStatusCard$Render$appealStage$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationComposerStatusContext $context;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ModelLockStatusCard $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockStatusCard$Render$appealStage$1(ModelLockStatusCard modelLockStatusCard, ConversationComposerStatusContext conversationComposerStatusContext, BRg bRg, int i) {
        super(2);
        this.$tmp0_rcvr = modelLockStatusCard;
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
        this.$tmp0_rcvr.Render(this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
