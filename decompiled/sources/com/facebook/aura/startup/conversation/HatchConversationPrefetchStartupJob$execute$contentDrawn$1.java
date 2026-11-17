package com.facebook.aura.startup.conversation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob$execute$contentDrawn$1", f = "HatchConversationPrefetchStartupJob.kt", l = {158}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationPrefetchStartupJob$execute$contentDrawn$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;

    public HatchConversationPrefetchStartupJob$execute$contentDrawn$1(HtJ<? super HatchConversationPrefetchStartupJob$execute$contentDrawn$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationPrefetchStartupJob$execute$contentDrawn$1(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationFirstDrawSignal hatchConversationFirstDrawSignal = HatchConversationFirstDrawSignal.INSTANCE;
            this.label = 1;
            if (hatchConversationFirstDrawSignal.awaitFirstContentDrawn(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return true;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchConversationPrefetchStartupJob$execute$contentDrawn$1(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
