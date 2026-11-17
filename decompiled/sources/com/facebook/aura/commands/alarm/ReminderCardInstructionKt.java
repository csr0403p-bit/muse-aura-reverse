package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2nw;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class ReminderCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.alarm.ReminderCardInstructionKt$reminderCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ List<ReminderCardItemInput> $reminders;

        /* renamed from: com.facebook.aura.commands.alarm.ReminderCardInstructionKt$reminderCardEnvelope$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00611 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
            public final /* synthetic */ List<ReminderCardItemInput> $reminders;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7pd c7pd) {
                C7384Etj.A0Y(c7pd, 0);
                Iterator<ReminderCardItemInput> it = this.$reminders.iterator();
                while (it.hasNext()) {
                    C7qW.A0B(new ReminderCardInstructionKt$reminderCardEnvelope$1$1$1$1(it.next()), c7pd);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00611(List<ReminderCardItemInput> list) {
                super(1);
                this.$reminders = list;
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
            C7qW.A06("action", this.$action, c2nw);
            C7qW.A07("reminders", new C00611(this.$reminders), c2nw);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, List<ReminderCardItemInput> list) {
            super(1);
            this.$action = str;
            this.$reminders = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    public static final String reminderCardEnvelope(String str, List<ReminderCardItemInput> list) {
        AnonymousClass003.A0u(str, list);
        return NodeCardEnvelopeKt.nodeCardEnvelope(HatchNodeCardJsonKt.TYPE_REMINDER, null, null, null, new AnonymousClass1(str, list));
    }
}
