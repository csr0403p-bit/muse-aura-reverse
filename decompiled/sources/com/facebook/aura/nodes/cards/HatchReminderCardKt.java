package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchReminderCardKt {

    /* renamed from: com.facebook.aura.nodes.cards.HatchReminderCardKt$HatchReminderCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ReminderCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReminderCardData reminderCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = reminderCardData;
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
            HatchReminderCardKt.HatchReminderCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchReminderCardKt$ReminderRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C127642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ReminderCardItem $item;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127642(ReminderCardItem reminderCardItem, BRg bRg, int i, int i2) {
            super(2);
            this.$item = reminderCardItem;
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
            HatchReminderCardKt.ReminderRow(this.$item, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchReminderCard(ReminderCardData reminderCardData, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1K = z;
        C7384Etj.A0Y(reminderCardData, 0);
        bfm.AgG(-1373933205);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(reminderCardData, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3cI.A07(bRgA0Q.then(c1062ATq), zA1K, bfm, iA05 >> 6);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 12.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 8.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0L, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.bell_wght400_outline_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba9), AnonymousClass001.A0O(c90m, bs0, true), C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
            if (reminderCardData.reminders.isEmpty()) {
                bfm.AgE(-1110179507);
            } else {
                bfm.AgE(-1110259270);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                Iterator it = reminderCardData.reminders.iterator();
                while (it.hasNext()) {
                    ReminderRow((ReminderCardItem) it.next(), null, bfm, ReminderCardItem.$stable, 2);
                }
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(reminderCardData, bRgA0Q, zA1K, i, i2);
        }
    }

    public static final void ReminderRow(ReminderCardItem reminderCardItem, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c127642;
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(-1442462934);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(reminderCardItem, bfm, i) ? 1 : 0) | i : i;
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
            boolean zA1R = AnonymousClass005.A1R(bfm, reminderCardItem.hour, reminderCardItem.minute, reminderCardItem.triggerTimeMs);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = formatReminderTime(reminderCardItem);
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            String str3 = reminderCardItem.label;
            if (str3 == null || C7BY.A0j(str3)) {
                str3 = null;
            }
            if (str2 != null) {
                str = str2;
            } else {
                if (str3 == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        c127642 = new HatchReminderCardKt$ReminderRow$primaryText$1(reminderCardItem, bRg2, i, i2);
                        C3cG.A1D(bBbAAc, c127642);
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
                bfm.AgE(-320217234);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -320425957).bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c127642 = new C127642(reminderCardItem, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c127642);
        }
    }

    public static final String formatReminderTime(ReminderCardItem reminderCardItem) {
        int iIntValue;
        int iIntValue2;
        Integer num = reminderCardItem.hour;
        Integer num2 = reminderCardItem.minute;
        if (num != null && num2 != null && (iIntValue = num.intValue()) >= 0 && iIntValue < 24 && (iIntValue2 = num2.intValue()) >= 0 && iIntValue2 < 60) {
            return LocalTime.of(iIntValue, iIntValue2).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        }
        Long l = reminderCardItem.triggerTimeMs;
        if (l != null) {
            return Instant.ofEpochMilli(l.longValue()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT));
        }
        return null;
    }
}
