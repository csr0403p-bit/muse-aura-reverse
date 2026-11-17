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
import X.AnonymousClass006;
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
import X.C3TH;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C90m;
import X.C9m9;
import X.CFK;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchGeofenceCardKt {
    public static final String TAG = "HatchGeofenceCard";
    public static final String TRIGGER_DWELL = "dwell";
    public static final String TRIGGER_ENTER = "enter";
    public static final String TRIGGER_EXIT = "exit";

    /* renamed from: com.facebook.aura.nodes.cards.HatchGeofenceCardKt$HatchGeofenceCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ GeofenceCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GeofenceCardData geofenceCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = geofenceCardData;
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
            HatchGeofenceCardKt.HatchGeofenceCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchGeofenceCard(GeofenceCardData geofenceCardData, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        int i3;
        BRg bRgA0Q = bRg;
        boolean zA1K = z;
        C7384Etj.A0Y(geofenceCardData, 0);
        bfm.AgG(1058599261);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(geofenceCardData, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(geofenceCardData.trigger);
            Object objAaT = bfm.AaT();
            Object objValueOf = null;
            if (zA65 || objAaT == C78N.A00) {
                String str = geofenceCardData.trigger;
                int iHashCode = str.hashCode();
                if (iHashCode == 3127582) {
                    if (str.equals(TRIGGER_EXIT)) {
                        i3 = R.string._name_removed__res_0x7f120b1e;
                        objValueOf = Integer.valueOf(i3);
                    }
                    objAaT = objValueOf;
                    bfm.Ai0(objValueOf);
                } else if (iHashCode != 95997746) {
                    if (iHashCode == 96667352 && str.equals(TRIGGER_ENTER)) {
                        i3 = R.string._name_removed__res_0x7f120b1d;
                        objValueOf = Integer.valueOf(i3);
                    }
                    objAaT = objValueOf;
                    bfm.Ai0(objValueOf);
                } else {
                    if (str.equals(TRIGGER_DWELL)) {
                        i3 = R.string._name_removed__res_0x7f120b1c;
                        objValueOf = Integer.valueOf(i3);
                    }
                    objAaT = objValueOf;
                    bfm.Ai0(objValueOf);
                }
            }
            Number number = (Number) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3cI.A07(bRgA0Q.then(c1062ATq), zA1K, bfm, iA05 >> 6);
            C9m9 c9m9A00 = AcQ.A00(12.0f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
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
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
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
            AVy aVyA00 = BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_map_dropper_checkmark_outline_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b1b), c90m.AiP(bs0, 1.0f, true), C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, 4.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(geofenceCardData.label, null, C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (number == null) {
                bfm.AgE(1669459882);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1669459883);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, number.intValue()), null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            String str2 = geofenceCardData.address;
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(1669791086);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1669791087).bodyRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (geofenceCardData.latitude == null || geofenceCardData.longitude == null) {
                bfm.AgE(1777626267);
            } else {
                bfm.AgE(1777352196);
                boolean z2 = false;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b1a);
                AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                boolean zA67 = bfm.A67(contextA0H);
                if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(geofenceCardData))) {
                    z2 = true;
                }
                boolean z3 = zA67 | z2;
                Object objAaT2 = bfm.AaT();
                if (z3 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchGeofenceCardKt$HatchGeofenceCard$1$3$1(contextA0H, geofenceCardData);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(geofenceCardData, bRgA0Q, zA1K, i, i2);
        }
    }

    public static final void openMap(Context context, GeofenceCardData geofenceCardData) {
        Double d = geofenceCardData.latitude;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = geofenceCardData.longitude;
            if (d2 != null) {
                double dDoubleValue2 = d2.doubleValue();
                String str = geofenceCardData.label;
                StringBuilder sb = new StringBuilder();
                sb.append(dDoubleValue);
                sb.append(",");
                sb.append(dDoubleValue2);
                String strEncode = Uri.encode(C3cJ.A0N("(", str, sb));
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sb2 = new StringBuilder("geo:");
                sb2.append(dDoubleValue);
                sb2.append(",");
                sb2.append(dDoubleValue2);
                sb2.append("?q=");
                Intent intentAddFlags = intent.setData(C7Je.A01(AnonymousClass001.A0v(strEncode, sb2))).addFlags(268435456);
                C7384Etj.A0U(intentAddFlags);
                try {
                    C3cI.A18(context, intentAddFlags);
                } catch (ActivityNotFoundException e) {
                    CFK.A0A(TAG, "No maps app available to open the location", e);
                }
            }
        }
    }
}
