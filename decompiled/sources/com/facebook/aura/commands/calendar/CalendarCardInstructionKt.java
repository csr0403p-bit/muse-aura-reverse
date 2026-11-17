package com.facebook.aura.commands.calendar;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2nw;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class CalendarCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.calendar.CalendarCardInstructionKt$calendarCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $accountType;
        public final /* synthetic */ String $action;
        public final /* synthetic */ Integer $calendarColor;
        public final /* synthetic */ String $calendarName;
        public final /* synthetic */ List<CalendarCardEventInput> $events;

        /* renamed from: com.facebook.aura.commands.calendar.CalendarCardInstructionKt$calendarCardEnvelope$1$6, reason: invalid class name */
        public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
            public final /* synthetic */ List<CalendarCardEventInput> $events;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C7pd c7pd) {
                C7384Etj.A0Y(c7pd, 0);
                Iterator<CalendarCardEventInput> it = this.$events.iterator();
                while (it.hasNext()) {
                    C7qW.A0B(new CalendarCardInstructionKt$calendarCardEnvelope$1$6$1$1(it.next()), c7pd);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(List<CalendarCardEventInput> list) {
                super(1);
                this.$events = list;
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
            String str = this.$calendarName;
            if (str != null && str.length() > 0) {
                C7qW.A06("calendar_name", str, c2nw);
            }
            Integer num = this.$calendarColor;
            if (num != null) {
                C7qW.A05(num, "calendar_color", c2nw);
            }
            String str2 = this.$accountType;
            if (str2 != null && str2.length() > 0) {
                C7qW.A06("account_type", str2, c2nw);
            }
            C7qW.A07(CalendarEventsCreateHandlerKt.PARAM_EVENTS, new AnonymousClass6(this.$events), c2nw);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Integer num, String str3, List<CalendarCardEventInput> list) {
            super(1);
            this.$action = str;
            this.$calendarName = str2;
            this.$calendarColor = num;
            this.$accountType = str3;
            this.$events = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    public static final String calendarCardEnvelope(String str, List<CalendarCardEventInput> list, String str2, Integer num, String str3) {
        AnonymousClass003.A0u(str, list);
        return NodeCardEnvelopeKt.nodeCardEnvelope("calendar", null, null, null, new AnonymousClass1(str, str2, num, str3, list));
    }

    public static /* synthetic */ String calendarCardEnvelope$default(String str, List list, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return calendarCardEnvelope(str, list, str2, num, str3);
    }
}
