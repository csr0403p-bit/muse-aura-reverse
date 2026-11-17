package com.facebook.aura.commands.sms;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C2nw;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.C9Y;
import X.G0U;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class MessagingCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.sms.MessagingCardInstructionKt$messagingCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ List<MessagingAttachmentArg> $attachments;
        public final /* synthetic */ String $body;
        public final /* synthetic */ List<MessagingRecipientArg> $recipients;

        /* renamed from: com.facebook.aura.commands.sms.MessagingCardInstructionKt$messagingCardEnvelope$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00651 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
            public final /* synthetic */ List<MessagingRecipientArg> $recipients;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7pd c7pd) {
                C7384Etj.A0Y(c7pd, 0);
                Iterator<MessagingRecipientArg> it = this.$recipients.iterator();
                while (it.hasNext()) {
                    C7qW.A0B(new MessagingCardInstructionKt$messagingCardEnvelope$1$1$1$1(it.next()), c7pd);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00651(List<MessagingRecipientArg> list) {
                super(1);
                this.$recipients = list;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
                invoke2(c7pd);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.commands.sms.MessagingCardInstructionKt$messagingCardEnvelope$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
            public final /* synthetic */ List<MessagingAttachmentArg> $attachments;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7pd c7pd) {
                C7384Etj.A0Y(c7pd, 0);
                Iterator<MessagingAttachmentArg> it = this.$attachments.iterator();
                while (it.hasNext()) {
                    C7qW.A0B(new MessagingCardInstructionKt$messagingCardEnvelope$1$2$1$1(it.next()), c7pd);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(List<MessagingAttachmentArg> list) {
                super(1);
                this.$attachments = list;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
                invoke2(c7pd);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2nw c2nw) {
            C7384Etj.A0Y(c2nw, 0);
            C7qW.A06(MetaAiAppBroadcastSender.EXTRA_BODY, this.$body, c2nw);
            C7qW.A07("recipients", new C00651(this.$recipients), c2nw);
            if (!this.$attachments.isEmpty()) {
                C7qW.A07(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, new AnonymousClass2(this.$attachments), c2nw);
            }
            MessagingRecipientArg messagingRecipientArg = (MessagingRecipientArg) AbstractC0878AGe.A0G(this.$recipients);
            if (messagingRecipientArg != null) {
                C7qW.A06("address", messagingRecipientArg.address, c2nw);
                String str = messagingRecipientArg.contactName;
                if (str != null) {
                    C7qW.A06("contact_name", str, c2nw);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, List<MessagingAttachmentArg> list, List<MessagingRecipientArg> list2) {
            super(1);
            this.$body = str;
            this.$attachments = list;
            this.$recipients = list2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ String messagingCardEnvelope$default(List list, String str, String str2, List list2, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = C0881AGi.A00;
        }
        return messagingCardEnvelope(list, str, str2, list2);
    }

    public static final String messagingCardEnvelope(List<MessagingRecipientArg> list, String str, String str2, List<MessagingAttachmentArg> list2) {
        AnonymousClass005.A14(list, str, str2, list2);
        return NodeCardEnvelopeKt.nodeCardEnvelope(HatchNodeCardJsonKt.TYPE_MESSAGING, NodeCardEnvelopeKt.NODE_CARD_CLIENTS_ANDROID_ONLY, NodeCardEnvelopeKt.nodeCardDeviceActionFallback(str2, "send this message"), null, new AnonymousClass1(str, list2, list));
    }
}
