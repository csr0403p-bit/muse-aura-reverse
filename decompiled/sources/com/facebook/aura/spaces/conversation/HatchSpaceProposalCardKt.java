package com.facebook.aura.spaces.conversation;

import X.AKQ;
import X.AbstractC3358CGz;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1D3;
import X.C1b8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.conversation.view.richcontent.LocalMarkProposalBuildingKt;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.model.SpaceProposalPresentation;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSpaceProposalCardKt {
    public static final C7197Ei9 ICON_CENTER_CROP = AnonymousClass005.A0Z(C7197Ei9.A0P);
    public static final float IconCornerRadius = 18.0f;
    public static final float IconSize = 72.0f;

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceProposalCardKt$FeatureRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i) {
            super(2);
            this.$text = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpaceProposalCardKt.FeatureRow(this.$text, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceProposalCardKt$MonogramText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$name = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpaceProposalCardKt.MonogramText(this.$name, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceProposalCardKt$SpaceIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C138892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138892(String str, String str2, int i) {
            super(2);
            this.$name = str;
            this.$imageUrl = str2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpaceProposalCardKt.SpaceIcon(this.$name, this.$imageUrl, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: HatchSpaceProposalCard-fWhpE4E, reason: not valid java name */
    public static final void m2174HatchSpaceProposalCardfWhpE4E(SpaceProposalPresentation spaceProposalPresentation, String str, BRg bRg, long j, C1D3 c1d3, G0U<? super String, Unit> g0u, BFM bfm, int i, int i2) {
        G0U<? super String, Unit> g0u2 = g0u;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(spaceProposalPresentation, str);
        C7384Etj.A0Y(c1d3, 4);
        bfm.AgG(-1676484873);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spaceProposalPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, c1d3);
        }
        int i4 = i2 & 32;
        int iA0Y = 196608;
        if (i4 != 0) {
            iA05 |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u2);
            iA05 |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u2 = null;
            }
            G0U g0u3 = (G0U) bfm.A6v(LocalMarkProposalBuildingKt.LocalMarkProposalBuilding);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(spaceProposalPresentation.imageUrl);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(spaceProposalPresentation.imageUrl, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, zA1b ? 1 : 0);
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.SPACE_CARD, str, null, null, 500L, 0.0f, null, null, null);
            SpaceConstructionStatus spaceConstructionStatus = spaceProposalPresentation.constructionStatus;
            int i5 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1W = AnonymousClass002.A1W(bfm, g0u3, bfm.A67(mapCurrentChatThreadLogMetadata), AnonymousClass002.A1Q(i5, 32)) | AnonymousClass007.A1I(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSpaceProposalCardKt$HatchSpaceProposalCard$1$1(str, mapCurrentChatThreadLogMetadata, g0u3, g0u2);
                bfm.Ai0(objAaT2);
            }
            G0U g0u4 = (G0U) objAaT2;
            boolean zA1R = AnonymousClass001.A1R(bfm, mapCurrentChatThreadLogMetadata, AnonymousClass003.A1H(bfm, hatchScreenA0M, i5 == 32));
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == C78N.A00) {
                objAaT3 = new HatchSpaceProposalCardKt$HatchSpaceProposalCard$2$1(hatchScreenA0M, str, mapCurrentChatThreadLogMetadata);
                bfm.Ai0(objAaT3);
            }
            m2175SpaceProposalCardContent8r3B23s(bRgHatchImpression, spaceProposalPresentation, str2, j, c1d3, spaceConstructionStatus, g0u4, (Function0) objAaT3, bfm, AnonymousClass001.A0A(iA05, (SpaceProposalPresentation.$stable << 3) | ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA05 & 7168)), zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchSpaceProposalCardKt$HatchSpaceProposalCard$3(spaceProposalPresentation, str, bRg2, j, c1d3, g0u2, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0291, code lost:
    
        if (r65.slug == null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0374 A[PHI: r11 r28 r36
  0x0374: PHI (r11v7 boolean) = (r11v6 boolean), (r11v8 boolean) binds: [B:98:0x0372, B:70:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x0374: PHI (r28v4 java.lang.String) = (r28v2 java.lang.String), (r28v5 java.lang.String) binds: [B:98:0x0372, B:70:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x0374: PHI (r36v1 boolean) = (r36v0 boolean), (r36v2 boolean) binds: [B:98:0x0372, B:70:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: SpaceProposalCardContent-8r3B23s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2175SpaceProposalCardContent8r3B23s(X.BRg r64, com.facebook.aura.model.SpaceProposalPresentation r65, java.lang.String r66, long r67, X.C1D3 r69, com.facebook.aura.model.SpaceConstructionStatus r70, X.G0U<? super java.lang.String, kotlin.Unit> r71, kotlin.jvm.functions.Function0<kotlin.Unit> r72, X.BFM r73, int r74, int r75) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.conversation.HatchSpaceProposalCardKt.m2175SpaceProposalCardContent8r3B23s(X.BRg, com.facebook.aura.model.SpaceProposalPresentation, java.lang.String, long, X.1D3, com.facebook.aura.model.SpaceConstructionStatus, X.G0U, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void FeatureRow(String str, BFM bfm, int i) {
        bfm.AgG(-215836829);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            int iA08 = C7BY.A08(str, ',', 0);
            if (iA08 < 0) {
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, C1822Arm.A00(null, AnonymousClass006.A0k(bfm, -428837284).bodyRegular, null, null, C1736ApY.A01, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16374);
            } else {
                bfm.AgE(-428692793);
                String strA0l = AnonymousClass002.A0l(str.substring(0, iA08));
                String strSubstring = str.substring(iA08);
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                C1736ApY c1736ApY = C1736ApY.A01;
                long j = B6A.A07;
                long j2 = C1809ArT.A01;
                int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, j));
                try {
                    c1731ApSA0W.A0E(strA0l);
                    c1731ApSA0W.A06(iA02);
                    iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, C06G.A08(bfm), j2, j2, j));
                    c1731ApSA0W.A0E(strSubstring);
                    c1731ApSA0W.A06(iA02);
                    AuraTextKt.m2640AuraTextVmYn7U0(c1731ApSA0W.A04(), null, 0L, C06G.A0T(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32758);
                } catch (Throwable th) {
                    c1731ApSA0W.A06(iA02);
                    throw th;
                }
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, i);
        }
    }

    public static final void MonogramText(String str, BFM bfm, int i) {
        bfm.AgG(-1885776448);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            String upperCase = BQG.A17(AnonymousClass002.A0l(str), 1).toUpperCase(Locale.ROOT);
            if (upperCase.length() == 0) {
                upperCase = "S";
            }
            AnonymousClass007.A10(bfm, C06G.A0U(bfm), upperCase, C06G.A0D(bfm));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public static final void SpaceIcon(String str, String str2, BFM bfm, int i) {
        bfm.AgG(-793852463);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            float f = IconSize;
            BRg bRgA01 = C1b8.A01(C11U.A03(C10G.A07(bs0, f), C06G.A0R(bfm)), C06G.A0B(bfm));
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
            if (str2 != null) {
                bfm.AgE(-1160240980);
                boolean zA1C = AnonymousClass003.A1C(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1C || objAaT == C78N.A00) {
                    objAaT = AnonymousClass005.A0S(bfm, false);
                }
                MutableState mutableState = (MutableState) objAaT;
                if (MutableState.A0A(mutableState)) {
                    bfm.AgE(-1159935413);
                } else {
                    bfm.AgE(-1160147081);
                    BRg bRgA07 = C10G.A07(bs0, f);
                    C7197Ei9 c7197Ei9 = ICON_CENTER_CROP;
                    boolean zA65 = bfm.A65(mutableState);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchSpaceProposalCardKt$SpaceIcon$1$1$1(mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    AuraImageKt.AuraImage(str2, bRgA07, c7197Ei9, null, null, false, null, (Function0) objAaT2, false, null, bfm, ((iA0d >> 3) & 14) | 1572912, 824);
                }
                BBI.A0R(bbi, false);
                if (MutableState.A0A(mutableState)) {
                    bfm.AgE(-1159913465);
                    MonogramText(str, bfm, iA0d & 14);
                } else {
                    bfm.AgE(-1159878869);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1159865973);
                MonogramText(str, bfm, iA0d & 14);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138892(str, str2, i);
        }
    }
}
