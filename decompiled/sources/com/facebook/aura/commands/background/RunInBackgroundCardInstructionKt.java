package com.facebook.aura.commands.background;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C3cF;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class RunInBackgroundCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.background.RunInBackgroundCardInstructionKt$runInBackgroundCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $taskSummary;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2nw c2nw) {
            C7384Etj.A0Y(c2nw, 0);
            String str = this.$taskSummary;
            if (str != null) {
                C7qW.A06("task_summary", str, c2nw);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$taskSummary = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    public static final String runInBackgroundCardEnvelope(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return NodeCardEnvelopeKt.nodeCardEnvelope(C3cF.A00(53), NodeCardEnvelopeKt.NODE_CARD_CLIENTS_ANDROID_ONLY, NodeCardEnvelopeKt.nodeCardDeviceActionFallback(str2, "run this in the background"), null, new AnonymousClass1(str));
    }
}
