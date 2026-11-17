package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$prewarmComposerDrafts$1$text$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$prewarmComposerDrafts$1$text$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ boolean $restore;
    public int label;
    public final /* synthetic */ HatchConversationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationViewModel$prewarmComposerDrafts$1$text$1(HatchConversationViewModel hatchConversationViewModel, boolean z, HtJ<? super HatchConversationViewModel$prewarmComposerDrafts$1$text$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationViewModel;
        this.$restore = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationViewModel$prewarmComposerDrafts$1$text$1(this.this$0, this.$restore, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.this$0.getComposerDrafts().prewarm();
        return this.$restore ? this.this$0.getComposerDrafts().text(this.this$0.sessionId) : "";
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((HatchConversationViewModel$prewarmComposerDrafts$1$text$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
