package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C2nw;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class ClockCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.alarm.ClockCardInstructionKt$clockCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ List<ClockCardAlarm> $alarms;

        /* renamed from: com.facebook.aura.commands.alarm.ClockCardInstructionKt$clockCardEnvelope$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00601 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
            public final /* synthetic */ List<ClockCardAlarm> $alarms;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7pd c7pd) {
                C7384Etj.A0Y(c7pd, 0);
                Iterator<ClockCardAlarm> it = this.$alarms.iterator();
                while (it.hasNext()) {
                    C7qW.A0B(new ClockCardInstructionKt$clockCardEnvelope$1$1$1$1(it.next()), c7pd);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00601(List<ClockCardAlarm> list) {
                super(1);
                this.$alarms = list;
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
            C7qW.A07("alarms", new C00601(this.$alarms), c2nw);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, List<ClockCardAlarm> list) {
            super(1);
            this.$action = str;
            this.$alarms = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public static final String clockCardEnvelope(String str, List<ClockCardAlarm> list, String str2, String str3) {
        List<String> list2;
        String strNodeCardDeviceActionFallback;
        ?? A1Z = AnonymousClass005.A1Z(str, list, str2);
        if (str.equals(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS) || str.equals(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS_ALL)) {
            list2 = NodeCardEnvelopeKt.NODE_CARD_CLIENTS_ANDROID_ONLY;
            strNodeCardDeviceActionFallback = NodeCardEnvelopeKt.nodeCardDeviceActionFallback(str2, "manage alarms");
        } else {
            list2 = null;
            strNodeCardDeviceActionFallback = NodeCardEnvelopeKt.nodeCardDeviceInfoFallback(str2, list.size() > A1Z ? "Alarms set" : "Alarm set");
        }
        return NodeCardEnvelopeKt.nodeCardEnvelope(HatchNodeCardJsonKt.TYPE_CLOCK, list2, strNodeCardDeviceActionFallback, str3, new AnonymousClass1(str, list));
    }
}
