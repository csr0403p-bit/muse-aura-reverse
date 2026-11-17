package com.facebook.aura.vds.compose.picker;

import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0CD;
import X.C0t8;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C3Ue;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$WheelColumn$5$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<Integer> $items;
    public final /* synthetic */ G0U<Integer, String> $label;
    public final /* synthetic */ int $selected;

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$5$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ AHD<Integer> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<Integer> ahd) {
            super(1);
            this.$items = ahd;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return this.$items.get(AnonymousClass001.A0F(num));
        }

        public final Object invoke(int i) {
            return this.$items.get(i);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$5$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<AnonymousClass037, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<Integer> $items;
        public final /* synthetic */ G0U<Integer, String> $label;
        public final /* synthetic */ int $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<Integer> ahd, int i, G0U<? super Integer, String> g0u) {
            super(4);
            this.$items = ahd;
            this.$selected = i;
            this.$label = g0u;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
            C1822Arm c1822Arm;
            long j;
            int iA0E = i2;
            C7384Etj.A0Y(anonymousClass037, 0);
            if ((i2 & 48) == 0) {
                iA0E = i2 | AnonymousClass004.A0E(bfm, i);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
                bfm.Afo();
                return;
            }
            boolean zA1Q = AnonymousClass002.A1Q(AnonymousClass001.A0F(this.$items.get(i)), this.$selected);
            BRg bRgA0R = AnonymousClass001.A0R(C10G.A04(BRg.A00, AuraWheelDatePickerKt.WHEEL_ITEM_HEIGHT));
            Alignment alignment = C2VU.A09;
            G0U<Integer, String> g0u = this.$label;
            AHD<Integer> ahd = this.$items;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            String str = (String) AnonymousClass006.A0p(ahd, g0u, i);
            if (zA1Q) {
                c1822Arm = AnonymousClass006.A0k(bfm, -621807038).bodyEmphasized;
                BBI.A0R(bbi, false);
                j = AnonymousClass003.A0c(bfm, -435692930).primaryText;
            } else {
                c1822Arm = AnonymousClass006.A0k(bfm, -621724795).bodyRegular;
                BBI.A0R(bbi, false);
                j = AnonymousClass003.A0c(bfm, -435691840).secondaryText;
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, c1822Arm, null, null, new C1YL(3), false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14770);
            BBI.A0R(bbi, true);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
            invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        int size = this.$items.size();
        AHD<Integer> ahd = this.$items;
        c0cd.APL(new AnonymousClass1(ahd), C0t8.A00, AnonymousClass001.A0M(new AnonymousClass2(ahd, this.$selected, this.$label), 1456466605), size);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraWheelDatePickerKt$WheelColumn$5$1$1(AHD<Integer> ahd, int i, G0U<? super Integer, String> g0u) {
        super(1);
        this.$items = ahd;
        this.$selected = i;
        this.$label = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
