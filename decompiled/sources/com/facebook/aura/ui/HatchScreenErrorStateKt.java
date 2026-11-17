package com.facebook.aura.ui;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1515AkP;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchScreenErrorStateKt {
    public static final String TAG = "HatchScreenErrorState";

    /* renamed from: com.facebook.aura.ui.HatchScreenErrorStateKt$HatchScreenErrorState$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $componentId;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ HatchSubsurface $subsurface;
        public final /* synthetic */ HatchSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, Function0<Unit> function0, BRg bRg, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, String str2, int i, int i2) {
            super(2);
            this.$message = str;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$surface = hatchSurface;
            this.$subsurface = hatchSubsurface;
            this.$screen = hatchScreen;
            this.$componentId = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScreenErrorStateKt.HatchScreenErrorState(this.$message, this.$onRetry, this.$modifier, this.$surface, this.$subsurface, this.$screen, this.$componentId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchScreenErrorState(String str, Function0<Unit> function0, BRg bRg, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, String str2, BFM bfm, int i, int i2) {
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        HatchSurface hatchSurface2 = hatchSurface;
        HatchSubsurface hatchSubsurface2 = hatchSubsurface;
        HatchScreen hatchScreen2 = hatchScreen;
        String str3 = str2;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-2044784973);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function02);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(hatchSurface2));
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, AnonymousClass003.A0K(hatchSubsurface2));
        }
        int i7 = i2 & 32;
        int iA0H = 196608;
        if (i7 != 0) {
            iA0d |= iA0H;
        } else if ((i & 196608) == 0) {
            iA0H = AnonymousClass004.A0H(bfm, AnonymousClass003.A0M(hatchScreen2));
            iA0d |= iA0H;
        }
        int i8 = i2 & 64;
        int iA0j = 1572864;
        if (i8 != 0) {
            iA0d |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str3);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                function02 = null;
            }
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                hatchSurface2 = null;
            }
            if (i6 != 0) {
                hatchSubsurface2 = null;
            }
            if (i7 != 0) {
                hatchScreen2 = null;
            }
            if (i8 != 0) {
                str3 = null;
            }
            Object[] objArr = {str, hatchSurface2, hatchSubsurface2, hatchScreen2};
            int i9 = 458752 & iA0d;
            int i10 = iA0d & 7168;
            int i11 = iA0d & 57344;
            int i12 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i12, 4) | AnonymousClass002.A1Q(i9, 131072) | AnonymousClass002.A1Q(i10, 2048) | AnonymousClass002.A1Q(i11, 16384);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new HatchScreenErrorStateKt$HatchScreenErrorState$1$1(hatchScreen2, hatchSurface2, hatchSubsurface2, str);
                bfm.Ai0(objAaT);
            }
            C78e.A07(bfm, (G0U) objAaT, objArr);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRg2, f);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = HatchScreenErrorStateKt$HatchScreenErrorState$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT2, false);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i13 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, i13);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, i12, 0, 16306);
            if (function02 != null) {
                bfm.AgE(-1723181993);
                C01N.A08(bfm, BRg.A00, f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12004b);
                AuraLabelButtonStyle auraLabelButtonStyleA0g = AnonymousClass006.A0g(bfm);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                boolean zA1Q2 = AnonymousClass002.A1Q(i10, 2048) | AnonymousClass002.A1Q(i11, 16384) | AnonymousClass002.A1Q(i9, 131072) | AnonymousClass005.A1C(iA0d) | AnonymousClass001.A1O(iA0d);
                Object objAaT3 = bfm.AaT();
                if (zA1Q2 || objAaT3 == obj) {
                    objAaT3 = new HatchScreenErrorStateKt$HatchScreenErrorState$3$1$1(hatchSurface2, hatchSubsurface2, hatchScreen2, str3, function02);
                    bfm.Ai0(objAaT3);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM("hatch-screen-error-retry-button", strA01, null, null, auraLabelButtonStyleA0g, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196614, 0, 0, 134201292);
            } else {
                bfm.AgE(-1722780295);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, function02, bRg2, hatchSurface2, hatchSubsurface2, hatchScreen2, str3, i, i2);
        }
    }

    public static final void logRetryClick(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, String str) {
        HatchInteractionLogger.INSTANCE.logClick(hatchSurface, hatchSubsurface, hatchScreen, HatchComponent.RETRY_BUTTON, str, null, null);
    }
}
