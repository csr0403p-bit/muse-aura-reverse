package com.facebook.aura.login.nativeflow;

import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C0v2;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.controls.AuraCheckboxKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginRememberDeviceSlotKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberDeviceSlotKt$NativeLoginRememberDeviceCheckbox$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, G0U<? super Boolean, Unit> g0u, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$checked = z;
            this.$onCheckedChange = g0u;
            this.$enabled = z2;
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
            NativeLoginRememberDeviceSlotKt.NativeLoginRememberDeviceCheckbox(this.$checked, this.$onCheckedChange, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRememberDeviceSlotKt$NativeLoginRememberDeviceSlot$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onRememberDeviceValueChange;
        public final /* synthetic */ Boolean $rememberDeviceValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Boolean bool, G0U<? super Boolean, Unit> g0u, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$rememberDeviceValue = bool;
            this.$onRememberDeviceValueChange = g0u;
            this.$enabled = z;
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
            NativeLoginRememberDeviceSlotKt.NativeLoginRememberDeviceSlot(this.$rememberDeviceValue, this.$onRememberDeviceValueChange, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginRememberDeviceSlot(Boolean bool, G0U<? super Boolean, Unit> g0u, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0u, 1);
        bfm.AgG(65438200);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bool) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (bool == null) {
                bfm.AgE(-445518438);
                C01N.A06(bfm, bRg2);
            } else {
                bfm.AgE(-445459135);
                NativeLoginRememberDeviceCheckbox(bool.booleanValue(), g0u, z, C3U4.A06(bRg2, AuraDimensKt.SpacingSmall), bfm, iA0d & 1022, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bool, g0u, z, bRg2, i, i2);
        }
    }

    public static final void NativeLoginRememberDeviceCheckbox(boolean z, G0U<? super Boolean, Unit> g0u, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1660959533);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0I = C06G.A0I(bfm, akh);
            BRg bRgA00 = AbstractC07539Wl.A00(C0v2.A01(AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), NativeLoginCommonKt.MIN_TOUCH_TARGET), new C1YD(1), g0u, z, z2), "lobster-native-auth-remember-device");
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = NativeLoginRememberDeviceSlotKt$NativeLoginRememberDeviceCheckbox$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraCheckboxKt.m2528AuraCheckboxO7ixnI(AnonymousClass001.A0X(bs0, objAaT), z2, z, g0u, null, 0L, new B6A(AnonymousClass001.A0f(bfm, akh).accent), bfm, AnonymousClass002.A08(iA0n << 6, (iA0n >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 48);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120512);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            if (!z2) {
                jA0I = HxS.A04(HDi.A0O[(int) (jA0I & 63)], B6A.A03(jA0I), B6A.A02(jA0I), B6A.A01(jA0I), 0.3f);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, bs0, true), jA0I, c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, g0u, z2, bRg2, i, i2);
        }
    }
}
