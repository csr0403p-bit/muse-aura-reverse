package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C1515AkP;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.CFK;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchClockCardKt {
    public static final String TAG = "HatchClockCard";

    /* renamed from: com.facebook.aura.nodes.cards.HatchClockCardKt$ClockAlarmRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ClockAlarm $alarm;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClockAlarm clockAlarm, BRg bRg, int i, int i2) {
            super(2);
            this.$alarm = clockAlarm;
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
            HatchClockCardKt.ClockAlarmRow(this.$alarm, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchClockCardKt$HatchClockCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C127612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ClockCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127612(ClockCardData clockCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = clockCardData;
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
            HatchClockCardKt.HatchClockCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ClockAlarmRow(ClockAlarm clockAlarm, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        Integer num;
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(1321964453);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(clockAlarm, bfm, i) ? 1 : 0) | i : i;
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
            boolean zA1K = AnonymousClass003.A1K(bfm, clockAlarm.hour, clockAlarm.minute);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                Integer num2 = clockAlarm.hour;
                objAaT = (num2 == null || (num = clockAlarm.minute) == null) ? null : formatAlarmTime(num2.intValue(), num.intValue());
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            String str3 = clockAlarm.label;
            if (str3 == null || C7BY.A0j(str3)) {
                str3 = null;
            }
            if (str2 != null) {
                str = str2;
            } else {
                if (str3 == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        anonymousClass2 = new HatchClockCardKt$ClockAlarmRow$primaryText$1(clockAlarm, bRg2, i, i2);
                        C3cG.A1D(bBbAAc, anonymousClass2);
                    }
                    return;
                }
                str = str3;
            }
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (str2 == null || str3 == null) {
                bfm.AgE(1808649447);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1808440724).bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(clockAlarm, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchClockCard(com.facebook.aura.nodes.cards.ClockCardData r47, X.BRg r48, boolean r49, X.BFM r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.HatchClockCardKt.HatchClockCard(com.facebook.aura.nodes.cards.ClockCardData, X.BRg, boolean, X.BFM, int, int):void");
    }

    public static final void launchDismiss(Context context, ClockCardData clockCardData) {
        G0U hatchClockCardKt$launchDismiss$2$2;
        if (ClockCardWireActionsKt.CLOCK_ACTION_DISMISS_ALL.equals(clockCardData.action)) {
            launchDismissIntent(context, AnonymousClass1.INSTANCE);
            return;
        }
        for (ClockAlarm clockAlarm : clockCardData.alarms) {
            if (clockAlarm.hour == null || clockAlarm.minute == null) {
                String str = clockAlarm.label;
                if (str != null && str.length() != 0) {
                    hatchClockCardKt$launchDismiss$2$2 = new HatchClockCardKt$launchDismiss$2$2(clockAlarm);
                }
            } else {
                hatchClockCardKt$launchDismiss$2$2 = new HatchClockCardKt$launchDismiss$2$1(clockAlarm);
            }
            launchDismissIntent(context, hatchClockCardKt$launchDismiss$2$2);
        }
    }

    public static final void launchDismissIntent(Context context, G0U<? super Intent, Unit> g0u) {
        Intent intent = new Intent("android.intent.action.DISMISS_ALARM");
        intent.addFlags(268435456);
        g0u.invoke(intent);
        try {
            C3cI.A18(context, intent);
        } catch (ActivityNotFoundException e) {
            CFK.A0A(TAG, "No Clock app available to dismiss alarm", e);
        }
    }

    public static final String formatAlarmTime(int i, int i2) {
        String str = LocalTime.of(i, i2).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        C7384Etj.A0U(str);
        return str;
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchClockCardKt$launchDismiss$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Intent, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Intent intent) {
            C7384Etj.A0Y(intent, 0);
            intent.putExtra("android.intent.extra.alarm.SEARCH_MODE", "android.all");
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.INSTANCE;
        }
    }
}
