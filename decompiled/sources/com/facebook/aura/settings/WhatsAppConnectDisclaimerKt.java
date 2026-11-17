package com.facebook.aura.settings;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
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
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0881AGi;
import X.C1515AkP;
import X.C1822Arm;
import X.C31u;
import X.C3U4;
import X.C7384Etj;
import X.C7462Ewq;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.settings.MC;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WhatsAppConnectDisclaimerKt {
    public static final String WHATSAPP_CONNECT_LEARN_MORE_URL = "https://faq.whatsapp.com/1111412106858632?helpref=faq_content";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(WhatsAppConnectDisclaimerKt.class, "whatsAppLearnMoreUrl", "getWhatsAppLearnMoreUrl()Ljava/lang/String;", 1)};
    public static final C31u whatsAppLearnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.whatsapp_settings_learn_more_url);

    /* renamed from: com.facebook.aura.settings.WhatsAppConnectDisclaimerKt$WhatsAppConnectDisclaimer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$agentName = str;
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
            WhatsAppConnectDisclaimerKt.WhatsAppConnectDisclaimer(this.$agentName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.WhatsAppConnectDisclaimerKt$WhatsAppConnectFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C136262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $templateRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136262(int i, WhatsAppConnectDisclosure whatsAppConnectDisclosure, BRg bRg, int i2, int i3) {
            super(2);
            this.$templateRes = i;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppConnectDisclaimerKt.WhatsAppConnectFooter(this.$templateRes, this.$disclosure, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.WhatsAppConnectDisclaimerKt$WhatsAppDataDisclosureRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C136272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ String $appName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136272(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$agentName = str;
            this.$appName = str2;
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
            WhatsAppConnectDisclaimerKt.WhatsAppDataDisclosureRow(this.$agentName, this.$appName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.WhatsAppConnectDisclaimerKt$WhatsAppDisclosureRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C136282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ List<HatchTextLink> $links;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136282(int i, String str, String str2, BRg bRg, List<HatchTextLink> list, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$title = str;
            this.$body = str2;
            this.$modifier = bRg;
            this.$links = list;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppConnectDisclaimerKt.WhatsAppDisclosureRow(this.$iconRes, this.$title, this.$body, this.$modifier, this.$links, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void WhatsAppConnectDisclaimer(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1689550645);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingLargePlusMicro, 0);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            WhatsAppDisclosureRow(R.drawable.shieldkeyhole_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121166), AnonymousClass006.A0w(bfm, str, HatchAppName.value, R.string._name_removed__res_0x7f121165), null, null, bfm, 0, 24);
            WhatsAppDataDisclosureRow(str, HatchAppName.value, null, bfm, (iA0d & 14) | 48, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WhatsAppConnectFooter(int r13, com.facebook.aura.settings.WhatsAppConnectDisclosure r14, X.BRg r15, X.BFM r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.WhatsAppConnectDisclaimerKt.WhatsAppConnectFooter(int, com.facebook.aura.settings.WhatsAppConnectDisclosure, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void WhatsAppDataDisclosureRow(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-818915656);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String whatsAppLearnMoreUrl = getWhatsAppLearnMoreUrl();
            if (C7BY.A0j(whatsAppLearnMoreUrl)) {
                whatsAppLearnMoreUrl = WHATSAPP_CONNECT_LEARN_MORE_URL;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121163);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121170);
            boolean zA1P = AnonymousClass003.A1P(bfm, strA012, whatsAppLearnMoreUrl, AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1C(iA0d) | bfm.A65(strA01));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = HatchLinkTextKt.withLinkedArguments(strA01, Arrays.asList(new HxE(str2, ""), new HxE(str, ""), new HxE(strA012, whatsAppLearnMoreUrl)));
                bfm.Ai0(objAaT);
            }
            HxE hxE = (HxE) objAaT;
            WhatsAppDisclosureRow(R.drawable.ai_speech_bubble_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121164), (String) hxE.first, bRg2, (List) hxE.second, bfm, (iA0d << 3) & 7168, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136272(str, str2, bRg2, i, i2);
        }
    }

    public static final void WhatsAppDisclosureRow(int i, String str, String str2, BRg bRg, List<HatchTextLink> list, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        List<HatchTextLink> list2 = list;
        bfm.AgG(368314519);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, list2, 32768, i2) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 9363, 9362), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                list2 = C0881AGi.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            long jA0A = C06G.A0A(bfm);
            AuraIconSize auraIconSize = AuraIconSize.X_SMALL;
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingNano;
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A0B(bs0, f, f), aVyA00, auraIconSize, null, jA0A, null, bfm, AnonymousClass001.A04(), 32);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C1822Arm c1822ArmA0V = C06G.A0V(bfm);
            long jA0C = C06G.A0C(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = WhatsAppConnectDisclaimerKt$WhatsAppDisclosureRow$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA0C, c1822ArmA0V, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16368);
            HatchLinkTextKt.m1188HatchLinkText10k_G_c(str2, list2, null, C06G.A0Y(bfm), C06G.A08(bfm), null, null, false, bfm, ((iA0D >> 6) & 14) | ((iA0D >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 228);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136282(i, str, str2, bRg2, list2, i2, i3);
        }
    }

    public static final String getWhatsAppLearnMoreUrl() {
        return (String) C31u.A00(whatsAppLearnMoreUrl$delegate, $$delegatedProperties);
    }

    public static final HxE<String, List<HatchTextLink>> toLinkedSentence(List<WhatsAppConnectDisclosureRun> list) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (WhatsAppConnectDisclosureRun whatsAppConnectDisclosureRun : list) {
            String str = whatsAppConnectDisclosureRun.url;
            if (str != null) {
                arrayList.add(new HatchTextLink(sb.length(), whatsAppConnectDisclosureRun.text.length(), str));
            }
            sb.append(whatsAppConnectDisclosureRun.text);
        }
        return new HxE<>(sb.toString(), arrayList);
    }
}
