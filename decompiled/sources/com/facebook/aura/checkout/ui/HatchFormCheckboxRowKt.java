package com.facebook.aura.checkout.ui;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.C0A8;
import X.C0v2;
import X.C1515AkP;
import X.C1YD;
import X.C2VU;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.controls.AuraCheckboxKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchFormCheckboxRowKt {

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormCheckboxRowKt$HatchFormCheckboxRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onChange;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, String str2, int i, int i2) {
            super(2);
            this.$title = str;
            this.$checked = z;
            this.$onChange = g0u;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormCheckboxRowKt.HatchFormCheckboxRow(this.$title, this.$checked, this.$onChange, this.$modifier, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchFormCheckboxRow(String str, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, String str2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str3 = str2;
        int iA0C = AnonymousClass002.A0C(str, g0u, 0);
        bfm.AgG(694448788);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str4 = i4 == 0 ? str3 : null;
            BRg bRgA01 = C0v2.A01(AnonymousClass001.A0R(bRg2), new C1YD(1), g0u, z, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A05, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u2);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchFormCheckboxRowKt$HatchFormCheckboxRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraCheckboxKt.m2528AuraCheckboxO7ixnI(AnonymousClass001.A0X(bs0, objAaT), false, z, g0u, null, 0L, null, bfm, (iA0d << 3) & 8064, 114);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 1, iA0C, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (str4 == null) {
                bfm.AgE(876375549);
                BBI.A0R(bbi, false);
                str3 = str4;
            } else {
                str3 = str4;
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 876375550).caption1Regular, null, null, null, false, 0, 1, iA0C, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, g0u, bRg2, str3, i, i2);
        }
    }
}
