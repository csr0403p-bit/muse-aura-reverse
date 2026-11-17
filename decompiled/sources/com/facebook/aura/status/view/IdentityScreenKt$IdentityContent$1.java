package com.facebook.aura.status.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.ui.HatchEditFileButtonKt;
import com.facebook.aura.ui.HatchIdentitySectionViewKt;
import com.facebook.aura.ui.HatchScreenEmptyStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdentityScreenKt$IdentityContent$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $content;
    public final /* synthetic */ AiIdentity $identity;
    public final /* synthetic */ String $memoryModifiedDate;
    public final /* synthetic */ G0U<String, Unit> $onOpenFile;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ String $soulModifiedDate;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdentityScreenKt$IdentityContent$1(C1110AYw c1110AYw, float f, AiIdentity aiIdentity, String str, float f2, G0U<? super String, Unit> g0u, String str2, String str3) {
        super(3);
        this.$scrollState = c1110AYw;
        this.$topPadding = f;
        this.$identity = aiIdentity;
        this.$content = str;
        this.$bottomPadding = f2;
        this.$onOpenFile = g0u;
        this.$soulModifiedDate = str2;
        this.$memoryModifiedDate = str3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(AbstractC1103AYp.A02(this.$scrollState, C10G.A01, true), 0.0f, this.$topPadding, 0.0f, 0.0f);
            AiIdentity aiIdentity = this.$identity;
            String str = this.$content;
            float f = this.$bottomPadding;
            G0U<String, Unit> g0u = this.$onOpenFile;
            String str2 = this.$soulModifiedDate;
            String str3 = this.$memoryModifiedDate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            BPg.A03(bfm, g0u2);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v3);
            if (aiIdentity != null) {
                bfm.AgE(-398413901);
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0B = C3U4.A0B(AbstractC07539Wl.A00(c1062ATq, "hatch-identity-card"), 0.0f, AuraDimensKt.SpacingMedium);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0v3);
                InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A03, bfm, C2VU.A05);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0b, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0v3);
                BRg bRgA0O = AnonymousClass001.A0O(C90m.A00, bs0, true);
                InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgA0O);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                BPg.A02(bfm, akqA044, g0v2);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0v3);
                String str4 = aiIdentity.name;
                C1822Arm c1822ArmA0X = C06G.A0X(bfm);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                AuraTextKt.m2639AuraTextUY9GdpU(str4, AbstractC07539Wl.A00(bs0, "hatch-identity-name"), C06G.A0L(bfm, akh), c1822ArmA0X, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                String str5 = aiIdentity.tagline;
                if (str5 == null) {
                    bfm.AgE(1132808302);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1132808303);
                    AuraTextKt.m2639AuraTextUY9GdpU(str5, null, C06G.A0I(bfm, akh), C01N.A01(bfm, bs0, 2.0f).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, true);
                String str6 = aiIdentity.emoji;
                if (str6 == null) {
                    bfm.AgE(439793575);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(439793576);
                    BRg bRgA015 = C1b8.A01(C11U.A02(bs0, 36.0f), C06G.A0K(bfm, akh));
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    int iA0D4 = AnonymousClass001.A0D(bbi);
                    AKQ akqA045 = BBI.A04(bbi);
                    BRg bRgA016 = AxM.A01(bfm, bRgA015);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                    BPg.A02(bfm, akqA045, g0v2);
                    AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D4);
                    BPg.A02(bfm, bRgA016, g0v3);
                    AuraTextKt.m2639AuraTextUY9GdpU(str6, null, 0L, C1822Arm.A00(null, C06G.A0T(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16777213, 0L, C19U.A03(20), 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                    BBI.A0R(bbi, true);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, true);
                String str7 = aiIdentity.creature;
                if (str7 == null && (str7 = aiIdentity.description) == null) {
                    bfm.AgE(1579616495);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1579616496);
                    C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
                    HatchIdentitySectionViewKt.HatchIdentitySectionView(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c2e), str7, null, bfm, 0, 4);
                    BBI.A0R(bbi, false);
                }
                String str8 = aiIdentity.vibe;
                if (str8 == null) {
                    bfm.AgE(1579922651);
                } else {
                    bfm.AgE(1579922652);
                    C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
                    HatchIdentitySectionViewKt.HatchIdentitySectionView(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c33), str8, null, bfm, 0, 4);
                }
                BBI.A0R(bbi, false);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c34);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.pencil_wght400_outline_24, 0);
                boolean zA65 = bfm.A65(g0u);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new IdentityScreenKt$IdentityContent$1$1$1$4$1(g0u);
                    bfm.Ai0(objAaT);
                }
                HatchEditFileButtonKt.HatchEditFileButton(strA01, aVyA00, (Function0) objAaT, AbstractC07539Wl.A00(bs0, "hatch-identity-md-button"), bfm, (AVy.$stable << 3) | 3072, 0);
                BBI.A0R(bbi, true);
            } else if (str.length() == 0) {
                bfm.AgE(-395433096);
                HatchScreenEmptyStateKt.HatchScreenEmptyState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c31), C10G.A02, BOf.A00(bfm, R.drawable.fingerprint_wght400_outline_24, 0), null, bfm, (AVy.$stable << 6) | 48, 8);
            } else {
                bfm.AgE(-395201247);
            }
            BBI.A0R(bbi, false);
            float f2 = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f2);
            C1062ATq c1062ATq2 = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f2, 0);
            int iA0D5 = AnonymousClass001.A0D(bbi);
            AKQ akqA046 = BBI.A04(bbi);
            BRg bRgA017 = AxM.A01(bfm, c1062ATq2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
            BPg.A02(bfm, akqA046, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D5);
            BPg.A02(bfm, bRgA017, g0v3);
            C90m c90m = C90m.A00;
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c32);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c2d);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = IdentityScreenKt.generateSoulPalette();
                bfm.Ai0(objAaT2);
            }
            AHD ahd = (AHD) objAaT2;
            AVy aVyA002 = BOf.A00(bfm, R.drawable.heart_outline_20, 0);
            BRg bRgA00 = AbstractC07539Wl.A00(c90m.AiP(bs0, 1.0f, true), "hatch-identity-soul-card");
            boolean zA652 = bfm.A65(g0u);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == obj) {
                objAaT3 = new IdentityScreenKt$IdentityContent$1$1$2$2$1(g0u);
                bfm.Ai0(objAaT3);
            }
            int i3 = AVy.$stable;
            IdentityScreenKt.FileCard(strA012, strA013, ahd, aVyA002, (Function0) objAaT3, bRgA00, str2, bfm, (i3 << 9) | 384, 0);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c30);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c2d);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = IdentityScreenKt.generateMemoryPalette();
                bfm.Ai0(objAaT4);
            }
            AHD ahd2 = (AHD) objAaT4;
            AVy aVyA003 = BOf.A00(bfm, R.drawable.thought_bubble_wght400_outline_24, 0);
            BRg bRgA002 = AbstractC07539Wl.A00(c90m.AiP(bs0, 1.0f, true), "hatch-identity-memory-card");
            boolean zA653 = bfm.A65(g0u);
            Object objAaT5 = bfm.AaT();
            if (zA653 || objAaT5 == obj) {
                objAaT5 = new IdentityScreenKt$IdentityContent$1$1$2$4$1(g0u);
                bfm.Ai0(objAaT5);
            }
            IdentityScreenKt.FileCard(strA014, strA015, ahd2, aVyA003, (Function0) objAaT5, bRgA002, str3, bfm, (i3 << 9) | 384, 0);
            BBI.A0R(bbi, true);
            C01N.A04(bfm, bbi, bs0, C06G.A00(bfm) + f, true);
            return;
        }
        bfm.Afo();
    }
}
