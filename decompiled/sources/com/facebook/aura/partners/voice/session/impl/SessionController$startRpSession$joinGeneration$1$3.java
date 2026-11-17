package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.EnumC10460Hji;
import X.F2X;
import X.G0V;
import X.Ht9;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2349BUy;
import com.facebook.aura.model.HatchChatEvent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startRpSession$joinGeneration$1$3", f = "SessionController.kt", l = {3540}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startRpSession$joinGeneration$1$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startRpSession$joinGeneration$1$3$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements C20Z, InterfaceC2349BUy {
        public final /* synthetic */ SessionController $tmp0;

        public AnonymousClass1(SessionController sessionController) {
            this.$tmp0 = sessionController;
        }

        public final Object emit(HatchChatEvent hatchChatEvent, HtJ<? super Unit> htJ) {
            this.$tmp0.trackTurnLatency(hatchChatEvent);
            return Unit.INSTANCE;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                return C3cI.A1V(obj, getFunctionDelegate());
            }
            return false;
        }

        @Override // X.InterfaceC2349BUy
        public final Ht9<?> getFunctionDelegate() {
            return new F2X(2, this.$tmp0, SessionController.class, "trackTurnLatency", "trackTurnLatency(Lcom/facebook/aura/model/HatchChatEvent;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            this.$tmp0.trackTurnLatency((HatchChatEvent) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startRpSession$joinGeneration$1$3(SessionController sessionController, HtJ<? super SessionController$startRpSession$joinGeneration$1$3> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$startRpSession$joinGeneration$1$3(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchChatEvent> chatEvents = this.this$0.gateway.getChatEvents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (chatEvents.collect(anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new SessionController$startRpSession$joinGeneration$1$3(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
