package com.facebook.aura.maps;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1b8;
import X.C3cH;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.appmodules.AuraAppModules;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchMapsNativePlaceholderKt {

    /* renamed from: com.facebook.aura.maps.HatchMapsNativePlaceholderKt$HatchMapsNativeLoading$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapsNativePlaceholderKt.HatchMapsNativeLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapDisplayMode $displayMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchMapsNativeModuleState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchMapsNativeModuleState hatchMapsNativeModuleState, HatchMapDisplayMode hatchMapDisplayMode, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchMapsNativeModuleState;
            this.$displayMode = hatchMapDisplayMode;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapsNativePlaceholderKt.HatchMapsNativePlaceholder(this.$state, this.$displayMode, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchMapsNativeLoading(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(233715491);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                int i4 = HatchMapsNativeModule.$stable;
                objAaT = AnonymousClass001.A0j(bfm, !AuraAppModules.INSTANCE.isInstalled(HatchMapsNativeModule.MODULE_NAME));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            boolean z = C3cH.A0W(bfm).isLight;
            HatchMapStyle hatchMapStyle = HatchMapStyle.INSTANCE;
            int lightBackgroundColor = z ? hatchMapStyle.getLightBackgroundColor() : hatchMapStyle.getDarkBackgroundColor();
            long j = B6A.A01;
            BRg bRgA01 = C1b8.A01(bRg2, lightBackgroundColor << 32);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0D);
            if (zA1X) {
                bfm.AgE(1210213194);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            } else {
                bfm.AgE(1210239141);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final void HatchMapsNativePlaceholder(HatchMapsNativeModuleState hatchMapsNativeModuleState, HatchMapDisplayMode hatchMapDisplayMode, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(hatchMapsNativeModuleState, hatchMapDisplayMode);
        bfm.AgG(-658253844);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchMapsNativeModuleState) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass005.A09(bfm, hatchMapDisplayMode);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Unit unit = Unit.INSTANCE;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            if (hatchMapsNativeModuleState == HatchMapsNativeModuleState.UNAVAILABLE) {
                bfm.AgE(780696939);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) objAaT2, bRg2, HatchSurface.CHAT, null, HatchMapAnalyticsKt.getAnalyticsScreen(hatchMapDisplayMode), null, bfm, (iA08 & 896) | 3120, 80);
            } else {
                bfm.AgE(780960780);
                HatchMapsNativeLoading(bRg2, bfm, (iA08 >> 6) & 14, zA1b ? 1 : 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchMapsNativeModuleState, hatchMapDisplayMode, bRg2, i, i2);
        }
    }
}
