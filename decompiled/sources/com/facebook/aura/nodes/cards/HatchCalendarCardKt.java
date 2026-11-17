package com.facebook.aura.nodes.cards;

import X.AII;
import X.AIM;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchCalendarCardKt {

    /* renamed from: com.facebook.aura.nodes.cards.HatchCalendarCardKt$CalendarColorHeaderRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $color;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Integer num, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$color = num;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCalendarCardKt.CalendarColorHeaderRow(this.$name, this.$color, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchCalendarCardKt$CalendarEventRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C127602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CalendarCardEvent $event;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127602(CalendarCardEvent calendarCardEvent, BRg bRg, int i, int i2) {
            super(2);
            this.$event = calendarCardEvent;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCalendarCardKt.CalendarEventRow(this.$event, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchCalendarCardKt$HatchCalendarCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CalendarCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CalendarCardData calendarCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = calendarCardData;
            this.$modifier = bRg;
            this.$inBubble = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCalendarCardKt.HatchCalendarCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CalendarColorHeaderRow(String str, Integer num, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        long j;
        BRg bRg2 = bRg;
        bfm.AgG(-277038943);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, num);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            B6A b6a = num != null ? new B6A((num.intValue() | (-16777216)) << 32) : null;
            if (b6a == null) {
                j = C3cI.A0K(bfm, 53556174).secondaryText;
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 53554097);
                j = b6a.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 8.0f);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            C1b8.A04(bfm, C11U.A02(bs0, 12.0f), j);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, num, bRg2, i, i2);
        }
    }

    public static final void CalendarEventRow(CalendarCardEvent calendarCardEvent, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c127602;
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(-1113211573);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(calendarCardEvent, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String eventTime = formatEventTime(calendarCardEvent);
            String str2 = calendarCardEvent.title;
            if (str2 == null || C7BY.A0j(str2)) {
                str2 = null;
            }
            String str3 = calendarCardEvent.location;
            if (str3 == null || C7BY.A0j(str3)) {
                str3 = null;
            }
            if (str2 != null) {
                str = str2;
            } else if (eventTime != null) {
                str = eventTime;
            } else {
                if (str3 == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        c127602 = new HatchCalendarCardKt$CalendarEventRow$primaryText$1(calendarCardEvent, bRg2, i, i2);
                        C3cG.A1D(bBbAAc, c127602);
                    }
                    return;
                }
                str = str3;
            }
            AII aiiA17 = AIM.A17();
            if (str2 != null && eventTime != null) {
                aiiA17.add(eventTime);
            }
            if (str3 != null && (str2 != null || eventTime != null)) {
                aiiA17.add(str3);
            }
            AII aiiA18 = AIM.A18(aiiA17);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            bfm.AgE(-2138661947);
            Iterator<E> it = aiiA18.iterator();
            while (it.hasNext()) {
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass005.A0j(it), null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c127602 = new C127602(calendarCardEvent, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c127602);
        }
    }

    public static final void HatchCalendarCard(CalendarCardData calendarCardData, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BFM bfm2;
        int i3;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        C7384Etj.A0Y(calendarCardData, 0);
        bfm.AgG(1982153887);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(calendarCardData, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            String str = calendarCardData.accountType;
            boolean zA67 = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(calendarCardData))) | bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchCalendarCardKt$HatchCalendarCard$1$1(contextA0H, calendarCardData, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, str);
            BRg bRgA07 = C3cI.A07(AnonymousClass001.A0R(bRg2), zA1K, bfm, iA05 >> 6);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 12.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str2 = calendarCardData.calendarName;
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(1830904584);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1830904585);
                Drawable drawable = (Drawable) mutableState.getValue();
                if (drawable != null) {
                    bfm.AgE(327274392);
                    i3 = 0;
                    bfm2 = bfm;
                    NodeCardComponentsKt.NodeCardAppRow(str2, drawable, null, bfm2, 0, 4);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(327347490);
                    bfm2 = bfm;
                    i3 = 0;
                    CalendarColorHeaderRow(str2, calendarCardData.calendarColor, null, bfm2, 0, 4);
                    BBI.A0R(bbi, false);
                }
                AuraDividerKt.AuraDivider(null, null, false, bfm2, i3, 7);
                BBI.A0R(bbi, false);
            }
            bfm.AgE(-1187855535);
            Iterator it = calendarCardData.events.iterator();
            while (it.hasNext()) {
                CalendarEventRow((CalendarCardEvent) it.next(), null, bfm, CalendarCardEvent.$stable, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(calendarCardData, bRg2, zA1K, i, i2);
        }
    }

    public static final String formatEventTime(CalendarCardEvent calendarCardEvent) {
        Long l = calendarCardEvent.startTimeMs;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(jLongValue).atZone(zoneIdSystemDefault);
        if (calendarCardEvent.allDay) {
            return zonedDateTimeAtZone.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        }
        FormatStyle formatStyle = FormatStyle.MEDIUM;
        FormatStyle formatStyle2 = FormatStyle.SHORT;
        String str = zonedDateTimeAtZone.format(DateTimeFormatter.ofLocalizedDateTime(formatStyle, formatStyle2));
        Long l2 = calendarCardEvent.endTimeMs;
        return l2 != null ? FGI.A0U(str, " \u2013 ", Instant.ofEpochMilli(l2.longValue()).atZone(zoneIdSystemDefault).format(DateTimeFormatter.ofLocalizedTime(formatStyle2))) : str;
    }
}
