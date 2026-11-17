package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKQ;
import X.AbstractC0885AGm;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7197Ei9;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.os.SystemClock;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.model.HatchSourceReference;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSourcesBottomSheetKt {
    public static final C7197Ei9 FAVICON_OPTIONS = AnonymousClass005.A0Z(C7197Ei9.A0P);
    public static final float FAVICON_SIZE = 40.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchCitationAnalytics $citationAnalytics;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onSourceClick;
        public final /* synthetic */ HatchSearchResultData $searchResultData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, G0U<? super String, Unit> g0u, Function0<Unit> function0, int i) {
            super(2);
            this.$searchResultData = hatchSearchResultData;
            this.$citationAnalytics = hatchCitationAnalytics;
            this.$onSourceClick = g0u;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSourcesBottomSheetKt.HatchSourcesBottomSheet(this.$searchResultData, this.$citationAnalytics, this.$onSourceClick, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchCitationAnalytics $citationAnalytics;
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ G0U<String, Unit> $onSourceClick;
        public final /* synthetic */ AHD<HatchSourceReference> $references;
        public final /* synthetic */ long $sheetInstanceKey;
        public final /* synthetic */ AuraTypography $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AHD<HatchSourceReference> ahd, HatchCitationAnalytics hatchCitationAnalytics, G0U<? super String, Unit> g0u, long j, AuraTypography auraTypography, AuraColors auraColors) {
            super(3);
            this.$references = ahd;
            this.$citationAnalytics = hatchCitationAnalytics;
            this.$onSourceClick = g0u;
            this.$sheetInstanceKey = j;
            this.$typography = auraTypography;
            this.$colors = auraColors;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            Map<String, String> mapSourceRowMetadata;
            String str;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(bs0, AuraDimensKt.SpacingMedium, 0.0f);
                AHD<HatchSourceReference> ahd = this.$references;
                HatchCitationAnalytics hatchCitationAnalytics = this.$citationAnalytics;
                G0U<String, Unit> g0u = this.$onSourceClick;
                long j = this.$sheetInstanceKey;
                AuraTypography auraTypography = this.$typography;
                AuraColors auraColors = this.$colors;
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j2 = bbi.A06;
                int i2 = (int) (j2 ^ (j2 >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                } else {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                    BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                    G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
                    ArrayList arrayList = new ArrayList();
                    for (HatchSourceReference hatchSourceReference : ahd) {
                        String str2 = hatchSourceReference.link;
                        if (str2 != null) {
                            AnonymousClass002.A1J(hatchSourceReference, str2, arrayList);
                        }
                    }
                    Iterator itA0w = AnonymousClass001.A0w(bfm, arrayList, 976596428);
                    int i3 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            HxE hxE = (HxE) next;
                            HatchSourceReference hatchSourceReference2 = (HatchSourceReference) hxE.first;
                            String str3 = (String) hxE.second;
                            boolean zA1a = AnonymousClass001.A1a(AnonymousClass003.A1K(bfm, hatchCitationAnalytics, str3), bfm, i3);
                            Object objAaT = bfm.AaT();
                            if (zA1a || objAaT == C78N.A00) {
                                HatchOrigin hatchOrigin = HatchOrigin.CHAT;
                                HatchSurface hatchSurface = HatchSurface.CHAT;
                                HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
                                HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
                                HatchComponent hatchComponent = HatchComponent.SOURCE_LINK;
                                if (hatchCitationAnalytics != null) {
                                    mapSourceRowMetadata = hatchCitationAnalytics.sourceRowMetadata(str3, null);
                                } else {
                                    mapSourceRowMetadata = null;
                                }
                                Integer numValueOf = Integer.valueOf(i3);
                                if (hatchCitationAnalytics != null) {
                                    str = hatchCitationAnalytics.messageId;
                                } else {
                                    str = null;
                                }
                                StringBuilder sb = new StringBuilder("source_link:");
                                sb.append(str);
                                sb.append(":");
                                sb.append(i3);
                                sb.append(":");
                                sb.append(j);
                                objAaT = HatchImpressionModifierKt.hatchImpression(bs0, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, mapSourceRowMetadata, numValueOf, 500L, 0.0f, sb.toString(), null, null);
                                bfm.Ai0(objAaT);
                            }
                            BRg bRgThen = C10G.A02.then((BRg) objAaT);
                            boolean zA1W = AnonymousClass002.A1W(bfm, g0u, AnonymousClass003.A1K(bfm, hatchCitationAnalytics, str3), bfm.A63(i3));
                            Object objAaT2 = bfm.AaT();
                            if (zA1W || objAaT2 == C78N.A00) {
                                objAaT2 = new HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$4$1$1$1$1(hatchCitationAnalytics, str3, i3, g0u);
                                bfm.Ai0(objAaT2);
                            }
                            BRg bRgA0B2 = C3U4.A0B(C0v5.A04(bRgThen, null, null, (Function0) objAaT2, true), 0.0f, 12.0f);
                            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                            int iA0D = AnonymousClass001.A0D(bbi);
                            AKQ akqA042 = BBI.A04(bbi);
                            BRg bRgA012 = AxM.A01(bfm, bRgA0B2);
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                            BPg.A02(bfm, akqA042, g0v2);
                            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                            BPg.A02(bfm, bRgA012, g0vA0u);
                            C90m c90m = C90m.A00;
                            String str4 = hatchSourceReference2.faviconUri;
                            if (str4 != null) {
                                bfm.AgE(-1557245921);
                                AuraImageKt.AuraImage(str4, C11U.A02(bs0, HatchSourcesBottomSheetKt.FAVICON_SIZE), HatchSourcesBottomSheetKt.FAVICON_OPTIONS, null, null, false, null, null, false, null, bfm, 0, 1016);
                                C01N.A09(bfm, bs0, 12.0f);
                            } else {
                                bfm.AgE(-1557001827);
                            }
                            BBI.A0R(bbi, false);
                            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
                            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                            int iA0D2 = AnonymousClass001.A0D(bbi);
                            AKQ akqA043 = BBI.A04(bbi);
                            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                            BPg.A02(bfm, akqA043, g0v2);
                            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
                            BPg.A02(bfm, bRgA013, g0vA0u);
                            String str5 = hatchSourceReference2.title;
                            if (str5 == null) {
                                str5 = str3;
                            }
                            AuraTextKt.m2639AuraTextUY9GdpU(str5, null, auraColors.primaryText, auraTypography.subheadlineEmphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                            String str6 = hatchSourceReference2.description;
                            if (str6 != null) {
                                bfm.AgE(-213811826);
                                AuraTextKt.m2639AuraTextUY9GdpU(str6, null, auraColors.secondaryText, auraTypography.footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                                BBI.A0R(bbi, false);
                            } else {
                                bfm.AgE(-213558649);
                                BBI.A0R(bbi, false);
                            }
                            BBI.A0R(bbi, true);
                            BBI.A0R(bbi, true);
                            i3 = i4;
                        }
                    }
                    AnonymousClass003.A0q(bbi);
                    return;
                }
                throw F60.createAndThrow();
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchCitationAnalytics $citationAnalytics;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onSourceClick;
        public final /* synthetic */ HatchSearchResultData $searchResultData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, G0U<? super String, Unit> g0u, Function0<Unit> function0, int i) {
            super(2);
            this.$searchResultData = hatchSearchResultData;
            this.$citationAnalytics = hatchCitationAnalytics;
            this.$onSourceClick = g0u;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSourcesBottomSheetKt.HatchSourcesBottomSheet(this.$searchResultData, this.$citationAnalytics, this.$onSourceClick, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchSourcesBottomSheet(HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics, G0U<? super String, Unit> g0u, Function0<Unit> function0, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        AnonymousClass005.A11(hatchSearchResultData, g0u, function0, 0);
        bfm.AgG(-1438331733);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchSearchResultData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, hatchCitationAnalytics);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            AHD<HatchSourceReference> ahd = hatchSearchResultData.references;
            if (ahd == null || ahd.isEmpty()) {
                bfm.AgE(1548329950);
                Unit unit = Unit.INSTANCE;
                boolean z = (iA05 & 7168) == 2048;
                Object objAaT = bfm.AaT();
                if (z || objAaT == C78N.A00) {
                    objAaT = new HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1(function0, null);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A18(bfm, objAaT, unit);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass2(hatchSearchResultData, hatchCitationAnalytics, g0u, function0, i);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 1548384727);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = Long.valueOf(SystemClock.elapsedRealtimeNanos());
                bfm.Ai0(objAaT2);
            }
            long jLongValue = ((Number) objAaT2).longValue();
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            boolean zA67 = bfm.A67(mapCurrentChatThreadLogMetadata) | AnonymousClass003.A1E(iA05);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$3$1(mapCurrentChatThreadLogMetadata, function0);
                bfm.Ai0(objAaT3);
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, null, (Function0) objAaT3, auraSheetStateRememberAuraBottomSheetState, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12087e), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass4(ahd, hatchCitationAnalytics, g0u, jLongValue, auraTypographyA0f, auraColorsA0c), 1811143726), bfm, 0, 3072, 8147);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(hatchSearchResultData, hatchCitationAnalytics, g0u, function0, i);
            bBbAAc.A06 = anonymousClass5;
        }
    }

    public static final void logSourcesSheetDismiss(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, HatchSubsurface.CITATION_SECTION, HatchScreen.MAIN_CHAT, HatchComponent.CITATION_PANEL, null, map);
    }
}
