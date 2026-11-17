package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchRunInBackgroundCardKt {

    /* renamed from: com.facebook.aura.nodes.cards.HatchRunInBackgroundCardKt$HatchRunInBackgroundCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RunInBackgroundCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RunInBackgroundCardData runInBackgroundCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = runInBackgroundCardData;
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
            HatchRunInBackgroundCardKt.HatchRunInBackgroundCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchRunInBackgroundCardKt$HatchRunInBackgroundCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RunInBackgroundCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RunInBackgroundCardData runInBackgroundCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = runInBackgroundCardData;
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
            HatchRunInBackgroundCardKt.HatchRunInBackgroundCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchRunInBackgroundCard(RunInBackgroundCardData runInBackgroundCardData, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        boolean z2 = z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(runInBackgroundCardData, 0);
        bfm.AgG(-165997177);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(runInBackgroundCardData, bfm, i) ? 1 : 0) | i : i;
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
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            HatchGatewayPrefsStore hatchGatewayPrefsStore = (HatchGatewayPrefsStore) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0S(bfm, hatchGatewayPrefsStore.getRunInBackgroundEnabled());
            }
            MutableState mutableState = (MutableState) objAaT2;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            if (MutableState.A0A(mutableState2)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(runInBackgroundCardData, bRg2, z2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq).then(NodeCardComponentsKt.hatchCardChrome(z2, bfm, (iA05 >> 6) & 14));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 12.0f, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            bfm.AgE(-307914843);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120baf), null, C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-307748405);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bae), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-307508155);
                BBI.A0R(bbi, false);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bab), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                if (runInBackgroundCardData.taskSummary != null) {
                    bfm.AgE(-307264278);
                    AuraTextKt.m2639AuraTextUY9GdpU(runInBackgroundCardData.taskSummary, null, C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-307109371);
                    BBI.A0R(bbi, false);
                }
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, 8.0f, 6);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bac);
                AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = new HatchRunInBackgroundCardKt$HatchRunInBackgroundCard$2$1$1$1(mutableState2);
                    bfm.Ai0(objAaT3);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgAiP, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134201285);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bad);
                AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined2 = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1);
                BRg bRgAiP2 = c90m.AiP(bs0, 1.0f, true);
                boolean zA1M = AnonymousClass003.A1M(bfm, hatchGatewayPrefsStore, contextA0H);
                Object objAaT4 = bfm.AaT();
                if (zA1M || objAaT4 == obj) {
                    objAaT4 = new HatchRunInBackgroundCardKt$HatchRunInBackgroundCard$2$1$2$1(hatchGatewayPrefsStore, contextA0H, mutableState);
                    bfm.Ai0(objAaT4);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgAiP2, auraLabelButtonStyleSecondaryOutlined2, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                BBI.A0R(bbi, true);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(runInBackgroundCardData, bRg2, z2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
