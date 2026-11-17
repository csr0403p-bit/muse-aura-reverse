package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.BOf;
import X.BPc;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C90m;
import X.EnumC10573Huf;
import X.EnumC3085Bxl;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchNotificationOptInCardKt {

    /* renamed from: com.facebook.aura.nodes.cards.HatchNotificationOptInCardKt$HatchNotificationOptInCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NotificationOptInCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NotificationOptInCardData notificationOptInCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = notificationOptInCardData;
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
            HatchNotificationOptInCardKt.HatchNotificationOptInCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchNotificationOptInCard(NotificationOptInCardData notificationOptInCardData, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        String strA0s;
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(notificationOptInCardData, 0);
        bfm.AgG(739805210);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(notificationOptInCardData, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            String str = notificationOptInCardData.cronId;
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, abstractC3358CGzA0h, contextA0H);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = NotificationOptInStore.Companion.getInstance(abstractC3358CGzA0h, contextA0H);
                bfm.Ai0(objAaT);
            }
            NotificationOptInStore notificationOptInStore = (NotificationOptInStore) objAaT;
            C1BO c1boA02 = C2CK.A02(bfm, notificationOptInStore.notificationsEnabled);
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA67 = bfm.A67(notificationOptInStore);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchNotificationOptInCardKt$HatchNotificationOptInCard$1$1(notificationOptInStore);
                bfm.Ai0(objAaT2);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT2, 6, 2);
            Function0<Unit> function0RememberNotificationOptInAction = rememberNotificationOptInAction(str, bfm, 0);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3cI.A07(bRg2.then(c1062ATq), z2, bfm, iA05 >> 6);
            boolean zA1N = AnonymousClass003.A1N(bfm, notificationOptInStore, str);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == C78N.A00) {
                objAaT3 = new HatchNotificationOptInCardKt$HatchNotificationOptInCard$2$1(notificationOptInStore, str);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA00 = BPc.A00(bRgA07, EnumC10573Huf.A06, (G0U) objAaT3, 0.0f, 0L);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
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
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == C78N.A00) {
                objAaT4 = HatchNotificationOptInCardKt$HatchNotificationOptInCard$3$1$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            BRg bRgA012 = ARD.A01(c1062ATq, (G0U) objAaT4, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.bell_wght400_outline_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d34), AnonymousClass001.A0O(c90m, bs0, true), C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
            Boolean bool = true;
            if (bool.equals(c1boA02.getValue())) {
                bfm.AgE(1252086216);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120d33);
            } else {
                bfm.AgE(1252088583);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120d32);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, c1062ATq, AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, !bool.equals(c1boA02.getValue()), false, false, null, null, function0RememberNotificationOptInAction, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(notificationOptInCardData, bRg2, z2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberNotificationOptInAction(java.lang.String r18, X.BFM r19, int r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.HatchNotificationOptInCardKt.rememberNotificationOptInAction(java.lang.String, X.BFM, int):kotlin.jvm.functions.Function0");
    }
}
