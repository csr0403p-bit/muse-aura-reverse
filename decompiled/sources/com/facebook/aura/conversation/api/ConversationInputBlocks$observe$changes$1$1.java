package com.facebook.aura.conversation.api;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationInputBlocks$observe$changes$1$1", f = "ConversationInputBlocks.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConversationInputBlocks$observe$changes$1$1 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConversationInputBlock $source;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationInputBlocks$observe$changes$1$1(ConversationInputBlock conversationInputBlock, HtJ<? super ConversationInputBlocks$observe$changes$1$1> htJ) {
        super(2, htJ);
        this.$source = conversationInputBlock;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ConversationInputBlocks$observe$changes$1$1 conversationInputBlocks$observe$changes$1$1 = new ConversationInputBlocks$observe$changes$1$1(this.$source, htJ);
        conversationInputBlocks$observe$changes$1$1.L$0 = obj;
        return conversationInputBlocks$observe$changes$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Boolean boolValueOf = Boolean.valueOf(this.$source.isBlocked());
            this.L$0 = null;
            this.label = 1;
            if (c20z.emit(boolValueOf, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
        return ((ConversationInputBlocks$observe$changes$1$1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
