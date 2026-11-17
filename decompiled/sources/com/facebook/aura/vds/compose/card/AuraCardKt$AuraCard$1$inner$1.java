package com.facebook.aura.vds.compose.card;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C02i;
import X.C06I;
import X.C07C;
import X.C08R;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class AuraCardKt$AuraCard$1$inner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $alert;
    public final /* synthetic */ long $alertColor;
    public final /* synthetic */ Boolean $checked;
    public final /* synthetic */ AuraCardContent $content;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentComposable;
    public final /* synthetic */ boolean $destructive;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $footerComposable;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
    public final /* synthetic */ G0U<Boolean, Unit> $onChange;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ AuraCardStyle $style;
    public final /* synthetic */ G0W<C08R, BFM, Integer, Unit> $trailing;
    public final /* synthetic */ AuraCardType $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCardKt$AuraCard$1$inner$1(AuraCardContent auraCardContent, AuraCardStyle auraCardStyle, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, boolean z, AuraCardType auraCardType, G0W<? super C08R, ? super BFM, ? super Integer, Unit> g0w2, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, boolean z2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w3, long j, Boolean bool, boolean z3) {
        super(2);
        this.$content = auraCardContent;
        this.$style = auraCardStyle;
        this.$leading = g0v;
        this.$contentComposable = g0w;
        this.$alert = z;
        this.$type = auraCardType;
        this.$trailing = g0w2;
        this.$onClick = function0;
        this.$onChange = g0u;
        this.$destructive = z2;
        this.$footerComposable = g0w3;
        this.$alertColor = j;
        this.$checked = bool;
        this.$enabled = z3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int i2;
        boolean z;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C02i c02i = AcQ.A02;
            C3TH c3th = C2VU.A00;
            AuraCardContent auraCardContent = this.$content;
            AuraCardStyle auraCardStyle = this.$style;
            G0V<BFM, Integer, Unit> g0v = this.$leading;
            G0W<C07C, BFM, Integer, Unit> g0w = this.$contentComposable;
            boolean z2 = this.$alert;
            AuraCardType auraCardType = this.$type;
            G0W<C08R, BFM, Integer, Unit> g0w2 = this.$trailing;
            Function0<Unit> function0 = this.$onClick;
            G0U<Boolean, Unit> g0u = this.$onChange;
            boolean z3 = this.$destructive;
            G0W<C07C, BFM, Integer, Unit> g0w3 = this.$footerComposable;
            long j = this.$alertColor;
            Boolean bool = this.$checked;
            boolean z4 = this.$enabled;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c02i, bfm, c3th, 54);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i3);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90l c90l = C90l.A00;
            if (auraCardContent != null) {
                bfm.AgE(-2100360128);
                BRg bRgA0D = C3U4.A0D(C10G.A02, auraCardStyle.contentPaddingValues(AnonymousClass002.A1X(g0v)));
                C1AC c1ac = C2VU.A04;
                i2 = 6;
                InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0D);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v2);
                BPg.A02(bfm, akqA042, g0v3);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                if (g0v == null) {
                    bfm.AgE(-1193934329);
                } else {
                    bfm.AgE(-1193934328);
                    BRg bRgA4D = c90m.A4D(auraCardStyle.leadingAlignment(), bs0);
                    InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
                    int iA0D2 = AnonymousClass001.A0D(bbi);
                    AKQ akqA043 = BBI.A04(bbi);
                    BRg bRgA013 = AxM.A01(bfm, bRgA4D);
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    BPg.A02(bfm, interfaceC1380AiAA01, g0v2);
                    BPg.A02(bfm, akqA043, g0v3);
                    AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
                    BPg.A02(bfm, bRgA013, g0vA0u);
                    AnonymousClass001.A1H(bfm, g0v, 0);
                    BBI.A0R(bbi, true);
                }
                BBI.A0R(bbi, false);
                boolean zHasTrailingItems = AuraCardKt.hasTrailingItems(auraCardContent, z2, auraCardType, AnonymousClass002.A1X(g0w2));
                if (auraCardContent.mergeContentDescription && (function0 != null || g0u != null)) {
                    z = true;
                } else {
                    z = false;
                }
                AuraContentKt.AuraContent(c90m.AiP(bs0, 1.0f, true), auraCardContent, z3, z, AnonymousClass002.A1X(g0v), zHasTrailingItems, g0w3, bfm, 0, 0);
                if (zHasTrailingItems) {
                    bfm.AgE(-1193052595);
                    BRg bRgA0D2 = C3U4.A0D(bs0, auraCardStyle.trailingItemPaddingValues());
                    InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                    int iA0D3 = AnonymousClass001.A0D(bbi);
                    AKQ akqA044 = BBI.A04(bbi);
                    BRg bRgA014 = AxM.A01(bfm, bRgA0D2);
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    BPg.A02(bfm, interfaceC1380AiAA003, g0v2);
                    BPg.A02(bfm, akqA044, g0v3);
                    AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D3);
                    BPg.A02(bfm, bRgA014, g0vA0u);
                    String str = auraCardContent.label;
                    if (str == null) {
                        bfm.AgE(-1098620785);
                    } else {
                        bfm.AgE(-1098620784);
                        AuraCardKt.AuraCardLabel(c90m, auraCardStyle, str, auraCardContent.labelStyle, auraCardContent.labelMaxLines, bfm, 6, 0);
                    }
                    BBI.A0R(bbi, false);
                    if (z2) {
                        bfm.AgE(-1098462653);
                        AuraCardKt.m2485AuraCardAlertRPmYEkk(auraCardStyle, j, bfm, 0);
                    } else {
                        bfm.AgE(-1098387695);
                    }
                    BBI.A0R(bbi, false);
                    if (g0w2 == null) {
                        bfm.AgE(-1098356572);
                    } else {
                        bfm.AgE(-1975093507);
                        AnonymousClass001.A1G(c90m, bfm, g0w2, 6);
                    }
                    BBI.A0R(bbi, false);
                    AuraCardOptionKt.AuraCardOption(auraCardStyle, auraCardType, function0, bool, g0u, z4, bfm, 0, 0);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(-1192434672);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            } else {
                i2 = 6;
                bfm.AgE(-2098623601);
            }
            BBI.A0R(bbi, false);
            if (g0w == null) {
                bfm.AgE(-2098591486);
            } else {
                bfm.AgE(-1591717153);
                AnonymousClass001.A1G(c90l, bfm, g0w, i2);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
