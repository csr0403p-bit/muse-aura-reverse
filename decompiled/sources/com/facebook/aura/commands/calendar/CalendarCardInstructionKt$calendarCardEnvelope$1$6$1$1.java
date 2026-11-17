package com.facebook.aura.commands.calendar;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class CalendarCardInstructionKt$calendarCardEnvelope$1$6$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ CalendarCardEventInput $event;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        Long l = this.$event.eventId;
        if (l != null) {
            C7qW.A05(l, "event_id", c2nw);
        }
        String str = this.$event.title;
        if (str != null && str.length() > 0) {
            C7qW.A06("title", str, c2nw);
        }
        Long l2 = this.$event.startMillis;
        if (l2 != null) {
            C7qW.A05(l2, "start_time", c2nw);
        }
        Long l3 = this.$event.endMillis;
        if (l3 != null) {
            C7qW.A05(l3, "end_time", c2nw);
        }
        if (this.$event.allDay) {
            C7qW.A04(AnonymousClass001.A0i(), "all_day", c2nw);
        }
        String str2 = this.$event.location;
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        C7qW.A06(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, str2, c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarCardInstructionKt$calendarCardEnvelope$1$6$1$1(CalendarCardEventInput calendarCardEventInput) {
        super(1);
        this.$event = calendarCardEventInput;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
