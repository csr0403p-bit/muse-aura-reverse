package com.facebook.aura.spacesharing.impl;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
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
import X.BOD;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.spacesharing.impl.SharedSpaceSaveViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SharedSpaceSaveActionKt {

    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSaveActionKt$SharedSpaceSaveAction$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $shortcode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$shortcode = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SharedSpaceSaveActionKt.SharedSpaceSaveAction(this.$shortcode, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SharedSpaceSaveAction(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1496935462);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGzA0h);
            C1BO c1boA02 = C2CK.A02(bfm, hatchGatewayPrefsStoreA0D.hatcheryVmIdFlow);
            String gatewayUrl = hatchGatewayPrefsStoreA0D.getGatewayUrl();
            String strA0l = FGI.A0l("shared-space-save:", ((CH0) abstractC3358CGzA0h).A01, ":", C1BO.A08(c1boA02), ":", gatewayUrl, ":", str);
            SharedSpaceSaveViewModel.Factory factory = new SharedSpaceSaveViewModel.Factory(abstractC3358CGzA0h, str, gatewayUrl);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SharedSpaceSaveViewModel sharedSpaceSaveViewModel = (SharedSpaceSaveViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SharedSpaceSaveViewModel.class, strA0l);
            boolean zA67 = bfm.A67(sharedSpaceSaveViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SharedSpaceSaveActionKt$SharedSpaceSaveAction$1$1(sharedSpaceSaveViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, sharedSpaceSaveViewModel);
            C1BO c1boA022 = C2CK.A02(bfm, sharedSpaceSaveViewModel.state);
            BRg bRgA09 = C3U4.A09(bRg2, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            Integer num = ((SharedSpaceSaveState) c1boA022.getValue()).error;
            if (num == null) {
                bfm.AgE(1062476129);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1062476130);
                String strA01 = AbstractC2271BQs.A01(bfm, num.intValue());
                BS0 bs0 = BRg.A00;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = SharedSpaceSaveActionKt$SharedSpaceSaveAction$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT2, false), 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16380);
                BBI.A0R(bbi, false);
            }
            if (((SharedSpaceSaveState) c1boA022.getValue()).status == SharedSpaceSaveStatus.SAVED) {
                bfm.AgE(1062689751);
                boolean zEquals = "spaces".equals(((SharedSpaceSaveState) c1boA022.getValue()).placement);
                int i4 = R.string._name_removed__res_0x7f120ffc;
                if (zEquals) {
                    i4 = R.string._name_removed__res_0x7f120ffd;
                }
                String strA012 = AbstractC2271BQs.A01(bfm, i4);
                BS0 bs02 = BRg.A00;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = SharedSpaceSaveActionKt$SharedSpaceSaveAction$2$2$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(bs02, objAaT3, false), 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16380);
            } else {
                bfm.AgE(1063026597);
                String strA013 = AbstractC2271BQs.A01(bfm, ((SharedSpaceSaveState) c1boA022.getValue()).actionLabel);
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                C1062ATq c1062ATq = C10G.A02;
                boolean z = ((SharedSpaceSaveState) c1boA022.getValue()).loading;
                boolean z2 = ((SharedSpaceSaveState) c1boA022.getValue()).enabled;
                boolean zA672 = bfm.A67(sharedSpaceSaveViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA672 || objAaT4 == C78N.A00) {
                    objAaT4 = new SharedSpaceSaveActionKt$SharedSpaceSaveAction$2$3$1(sharedSpaceSaveViewModel);
                    bfm.Ai0(objAaT4);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, c1062ATq, auraLabelButtonStylePrimary, null, null, false, false, z2, z, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT4), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134199781);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, i, i2);
        }
    }
}
