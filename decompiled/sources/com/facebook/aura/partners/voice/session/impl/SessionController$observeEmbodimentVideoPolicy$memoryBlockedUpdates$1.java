package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.EnumC10460Hji;
import X.F1F;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.memory.AuraMemory;
import com.facebook.aura.memory.AuraMemoryState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1", f = "SessionController.kt", l = {4976}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1(SessionController sessionController, HtJ<? super SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1 sessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1 = new SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1(this.this$0, htJ);
        sessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1.L$0 = obj;
        return sessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        final C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final F1F f1f = new F1F();
            C20Q<AuraMemoryState> c20qObserve = AuraMemory.INSTANCE.observe(this.this$0.context);
            C20Z<? super AuraMemoryState> c20z2 = new C20Z() { // from class: com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraMemoryState) obj2, (HtJ<? super Unit>) htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.facebook.aura.memory.AuraMemoryState r4, X.HtJ<? super kotlin.Unit> r5) {
                    /*
                        r3 = this;
                        X.F1F r2 = r1
                        if (r4 == 0) goto Lf
                        com.facebook.aura.partners.voice.gating.VoiceGating r1 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
                        boolean r0 = r2.element
                        boolean r1 = r1.isEmbodimentPressureBlocked(r4, r0)
                        r0 = 0
                        if (r1 == 0) goto L10
                    Lf:
                        r0 = 1
                    L10:
                        r2.element = r0
                        X.20Z<java.lang.Boolean> r1 = r2
                        X.F1F r0 = r1
                        boolean r0 = r0.element
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        java.lang.Object r0 = r1.emit(r0, r5)
                        java.lang.Object r0 = X.C3cG.A0U(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1.AnonymousClass1.emit(com.facebook.aura.memory.AuraMemoryState, X.HtJ):java.lang.Object");
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (c20qObserve.collect(c20z2, this) == enumC10460Hji) {
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
        return ((SessionController$observeEmbodimentVideoPolicy$memoryBlockedUpdates$1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
