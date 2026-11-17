package com.facebook.aura.nudge;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import com.facebook.aura.conversation.widget.api.ConversationTimelineSource;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConversationCardTimeline implements ConversationTimelineSource {
    public static final ConversationCardTimeline INSTANCE = new ConversationCardTimeline();

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimeline$observe$1", f = "ConversationCardTimeline.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationCardTimeline$observe$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<List<? extends RequestedCardContent>, List<? extends ConversationTimelineContent>, HtJ<? super AHD<? extends ConversationTimelineContent>>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RequestedCardContent> list, List<? extends ConversationTimelineContent> list2, HtJ<? super AHD<? extends ConversationTimelineContent>> htJ) {
            return invoke2((List<RequestedCardContent>) list, list2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Collection collection = (Collection) this.L$0;
            Iterable iterable = (Iterable) this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AGI.A07(AbstractC0878AGe.A0P(iterable, collection));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RequestedCardContent> list, List<? extends ConversationTimelineContent> list2, HtJ<? super AHD<? extends ConversationTimelineContent>> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // com.facebook.aura.conversation.widget.api.ConversationTimelineSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C20Q<X.AHD<com.facebook.aura.conversation.widget.api.ConversationTimelineContent>> observe(com.facebook.aura.conversation.widget.api.ConversationTimelineContext r5) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            com.facebook.aura.conversation.widget.api.ConversationTimelineSurface r1 = r5.surface
            com.facebook.aura.conversation.widget.api.ConversationTimelineSurface r0 = com.facebook.aura.conversation.widget.api.ConversationTimelineSurface.MAIN_CHAT
            if (r1 != r0) goto L15
            java.lang.String r1 = r5.conversationId
            java.lang.String r0 = "primary_session_id"
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 != 0) goto L16
        L15:
            r4 = 0
        L16:
            com.facebook.aura.conversation.api.ConversationCardRequests$Companion r1 = com.facebook.aura.conversation.api.ConversationCardRequests.Companion
            X.CGz r0 = r5.userSession
            com.facebook.aura.conversation.api.ConversationCardRequests r3 = r1.getInstance(r0)
            com.facebook.aura.conversation.widget.api.ConversationTimelineSurface r0 = r5.surface
            java.lang.String r2 = com.facebook.aura.nudge.ConversationCardTimelineKt.getAnalyticsValue(r0)
            java.lang.String r1 = r5.conversationId
            X.20Q<java.lang.Boolean> r0 = r5.isConversationIdle
            X.20Q r0 = r3.observe(r1, r4, r0)
            X.20Q r0 = com.facebook.aura.nudge.ConversationCardTimelineKt.withExitTransitions(r0)
            com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1 r3 = new com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1
            r3.<init>(r0, r2)
            if (r4 == 0) goto L46
            X.20Q r2 = com.facebook.aura.nudge.ConversationCardTimelineKt.observeNudge(r5)
        L3b:
            r1 = 0
            com.facebook.aura.nudge.ConversationCardTimeline$observe$1 r0 = new com.facebook.aura.nudge.ConversationCardTimeline$observe$1
            r0.<init>(r1)
            X.60I r0 = X.C3rb.A03(r0, r3, r2)
            return r0
        L46:
            X.AGi r0 = X.C0881AGi.A00
            X.20Y r2 = new X.20Y
            r2.<init>(r0)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationCardTimeline.observe(com.facebook.aura.conversation.widget.api.ConversationTimelineContext):X.20Q");
    }
}
