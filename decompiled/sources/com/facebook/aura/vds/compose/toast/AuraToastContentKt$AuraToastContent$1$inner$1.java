package com.facebook.aura.vds.compose.toast;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C02i;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1DP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconDefaults;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class AuraToastContentKt$AuraToastContent$1$inner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $hasEndItem;
    public final /* synthetic */ boolean $hasStartItem;
    public final /* synthetic */ Integer $leadingIcon;
    public final /* synthetic */ AuraIconSize $leadingIconSize;
    public final /* synthetic */ B6A $leadingIconTint;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ AuraToastOption $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToastContentKt$AuraToastContent$1$inner$1(boolean z, Integer num, boolean z2, AuraToastOption auraToastOption, AuraIconSize auraIconSize, B6A b6a, String str, String str2, Function0<Unit> function0) {
        super(2);
        this.$hasStartItem = z;
        this.$leadingIcon = num;
        this.$hasEndItem = z2;
        this.$type = auraToastOption;
        this.$leadingIconSize = auraIconSize;
        this.$leadingIconTint = b6a;
        this.$title = str;
        this.$subtitle = str2;
        this.$onClick = function0;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        boolean z;
        long jM2566colorsWaAFU9c;
        int i2;
        float f;
        float f2;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C02i c02i = AcQ.A02;
            C3TH c3th = C2VU.A00;
            boolean z2 = this.$hasStartItem;
            Integer num = this.$leadingIcon;
            boolean z3 = this.$hasEndItem;
            AuraToastOption auraToastOption = this.$type;
            AuraIconSize auraIconSize = this.$leadingIconSize;
            B6A b6a = this.$leadingIconTint;
            String str = this.$title;
            String str2 = this.$subtitle;
            Function0<Unit> function0 = this.$onClick;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c02i, bfm, c3th, 54);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i3 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i3);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgThen = C10G.A02.then(C10G.A00);
            AuraToastStyle auraToastStyle = AuraToastStyle.INSTANCE;
            BRg bRgA0D = C3U4.A0D(AnonymousClass001.A0U(bRgThen, AnonymousClass002.A0d(bfm).toast.minHeight), auraToastStyle.contentPaddingValues(z2, bfm, 48));
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0D);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            if (num == null) {
                bfm.AgE(-1401301196);
                i2 = 0;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1401301195);
                int iIntValue = num.intValue();
                BRg bRgA4D = c90m.A4D(c1ac, bs0);
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA4D);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA01, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AVy aVyA00 = BOf.A00(bfm, iIntValue, 0);
                if (b6a == null) {
                    bfm.AgE(1702803874);
                    jM2566colorsWaAFU9c = AuraIconDefaults.INSTANCE.m2566colorsWaAFU9c(bfm, 6);
                    z = false;
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1702802758);
                    z = false;
                    BBI.A0R(bbi, false);
                    jM2566colorsWaAFU9c = b6a.A00;
                }
                AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, jM2566colorsWaAFU9c, null, bfm, (AVy.$stable << 3) | 3072, 33);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
                i2 = z;
            }
            if (z2) {
                f = AuraDimensKt.SpacingSmall;
            } else {
                f = AuraDimensKt.SpacingNone;
            }
            if (z3) {
                f2 = AuraDimensKt.SpacingSmall;
            } else {
                f2 = AuraDimensKt.SpacingNone;
            }
            float f3 = AuraDimensKt.SpacingNone;
            BRg bRgA0D2 = C3U4.A0D(c90m.AiP(bs0, 1.0f, true), new C1DP(f, f3, f2, f3));
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(AcQ.A02(c1ac, AuraDimensKt.SpacingMicro), bfm, C2VU.A02, i2);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA0D2);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA044, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0vA0u);
            boolean z4 = i2;
            int i4 = i2;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A02(C2VU.A09, bs0, i2), C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, z4, i4, Integer.MAX_VALUE, 2, null, null, null, bfm, 805306416, 6, 14832);
            if (str2 != null && str2.length() != 0) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 956710964).footnoteRegular, null, null, null, z4, i4, Integer.MAX_VALUE, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, i2);
            } else {
                bfm.AgE(957019042);
                BBI.A0R(bbi, i2);
            }
            BBI.A0R(bbi, true);
            if (z3) {
                bfm.AgE(-1399460570);
                BRg bRgA0D3 = C3U4.A0D(bs0, auraToastStyle.trailingItemPaddingValues(auraToastOption, bfm, 48));
                InterfaceC1380AiA interfaceC1380AiAA004 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                int iA0D4 = AnonymousClass001.A0D(bbi);
                AKQ akqA045 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA0D3);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA004, g0v);
                BPg.A02(bfm, akqA045, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                BPg.A02(bfm, bRgA015, g0vA0u);
                AuraToastOptionKt.AuraToastOption(auraToastOption, function0, null, null, AnonymousClass002.A1X(function0), bfm, 3456, i2);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-1398981992);
            }
            AnonymousClass002.A10(bbi, i2, true);
            return;
        }
        bfm.Afo();
    }
}
