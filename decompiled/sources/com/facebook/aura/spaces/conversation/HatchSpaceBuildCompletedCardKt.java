package com.facebook.aura.spaces.conversation;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BPg;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1AC;
import X.C1D3;
import X.C1DM;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.conversation.view.richcontent.AttachmentPreviewShapeKt;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.SpaceBuildCompletedPresentation;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.menu.ChatSpaceOpenerKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSpaceBuildCompletedCardKt {
    public static final C7197Ei9 IMAGE_CENTER_CROP = AnonymousClass005.A0Z(C7197Ei9.A0P);
    public static final float IconCornerRadius = 8.0f;
    public static final float IconSize = 40.0f;
    public static final float PreviewAspectRatio = 1.5f;
    public static final float PreviewCornerRadius = 12.0f;
    public static final float PreviewInset = 4.0f;

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceBuildCompletedCardKt$MonogramText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
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
            HatchSpaceBuildCompletedCardKt.MonogramText(this.$name, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceBuildCompletedCardKt$SpaceCardOverflowButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$title = str2;
            this.$imageUrl = str3;
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
            HatchSpaceBuildCompletedCardKt.SpaceCardOverflowButton(this.$slug, this.$title, this.$imageUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceBuildCompletedCardKt$SpaceIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C138872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138872(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$imageUrl = str2;
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
            HatchSpaceBuildCompletedCardKt.SpaceIcon(this.$name, this.$imageUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.conversation.HatchSpaceBuildCompletedCardKt$SpacePreviewImage$2, reason: invalid class name and case insensitive filesystem */
    public final class C138882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138882(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$onError = function0;
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
            HatchSpaceBuildCompletedCardKt.SpacePreviewImage(this.$imageUrl, this.$onError, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String normalizeSpaceBuildImageUri(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        String str2 = HatchUrlSegments.FS_RAW_SEGMENT;
        if (!strA0l.startsWith(HatchUrlSegments.FS_RAW_SEGMENT)) {
            str2 = "fs/raw/";
            if (!strA0l.startsWith("fs/raw/")) {
                str2 = "/media/raw/";
                if (!strA0l.startsWith("/media/raw/")) {
                    str2 = "media/raw/";
                    if (!strA0l.startsWith("media/raw/")) {
                        str2 = HatchUrlSegments.FS_THUMBNAIL_SEGMENT;
                        if (!strA0l.startsWith(HatchUrlSegments.FS_THUMBNAIL_SEGMENT)) {
                            str2 = "fs/thumbnail/";
                            if (!strA0l.startsWith("fs/thumbnail/")) {
                                return strA0l;
                            }
                        }
                    }
                }
            }
        }
        return C7BY.A0K(str2, strA0l);
    }

    /* renamed from: HatchSpaceBuildCompletedCard-T042LqI, reason: not valid java name */
    public static final void m2172HatchSpaceBuildCompletedCardT042LqI(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation, BRg bRg, long j, C1D3 c1d3, String str, BFM bfm, int i, int i2) {
        String str2;
        C1DM c1dmA0R;
        C1D3 c1d32 = c1d3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(spaceBuildCompletedPresentation, 0);
        bfm.AgG(-2127023129);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spaceBuildCompletedPresentation, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1d32);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c1d32 = null;
            }
            str2 = i5 == 0 ? str : null;
            if (c1d32 == null) {
                bfm.AgE(335214923);
                c1dmA0R = C06G.A0R(bfm);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 335213838);
                c1dmA0R = c1d32;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1R = AnonymousClass005.A1R(bfm, spaceBuildCompletedPresentation.previewCardImageUrl, spaceBuildCompletedPresentation.thumbnailImageUrl, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
                String str3 = spaceBuildCompletedPresentation.previewCardImageUrl;
                if (str3 == null) {
                    str3 = spaceBuildCompletedPresentation.thumbnailImageUrl;
                }
                objAaT = workspaceUriResolver.resolveRawAssetUrl(normalizeSpaceBuildImageUri(str3), abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str4 = (String) objAaT;
            boolean zA1K = AnonymousClass003.A1K(bfm, spaceBuildCompletedPresentation.iconImageUrl, abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                objAaT2 = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(normalizeSpaceBuildImageUri(spaceBuildCompletedPresentation.iconImageUrl), abstractC3358CGzA0h);
                bfm.Ai0(objAaT2);
            }
            String str5 = (String) objAaT2;
            G0U<String, Unit> g0uRememberChatSpaceOpener = ChatSpaceOpenerKt.rememberChatSpaceOpener(bfm, 0);
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            String str6 = spaceBuildCompletedPresentation.name;
            boolean zA1O = AnonymousClass003.A1O(bfm, mapCurrentChatThreadLogMetadata, g0uRememberChatSpaceOpener, AnonymousClass005.A1L(iA05) | AnonymousClass002.A1U(bfm, hatchScreenA0M)) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(spaceBuildCompletedPresentation)));
            Object objAaT3 = bfm.AaT();
            if (zA1O || objAaT3 == C78N.A00) {
                objAaT3 = new HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$1$1(hatchScreenA0M, str2, mapCurrentChatThreadLogMetadata, g0uRememberChatSpaceOpener, spaceBuildCompletedPresentation);
                bfm.Ai0(objAaT3);
            }
            m2173SpaceChatCard8r3B23s(str6, str4, str5, j, c1dmA0R, (Function0) objAaT3, bRg2, B1V.A00(bfm, new HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$2(spaceBuildCompletedPresentation, str5), -769888509), bfm, AnonymousClass006.A04((iA05 << 3) & 7168, 12582912, iA05), 0);
        } else {
            bfm.Afo();
            str2 = str;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$3(spaceBuildCompletedPresentation, bRg2, j, c1d32, str2, i, i2);
        }
    }

    public static final void MonogramText(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(457870512);
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
            String upperCase = BQG.A17(AnonymousClass002.A0l(str), 1).toUpperCase(Locale.ROOT);
            if (upperCase.length() == 0) {
                upperCase = "S";
            }
            AuraTextKt.m2639AuraTextUY9GdpU(upperCase, bRg2, C06G.A0D(bfm), C06G.A0U(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0177 A[PHI: r7 r36
  0x0177: PHI (r7v11 boolean) = (r7v14 boolean), (r7v15 boolean) binds: [B:43:0x0175, B:41:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0177: PHI (r36v1 boolean) = (r36v4 boolean), (r36v5 boolean) binds: [B:43:0x0175, B:41:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d A[PHI: r7 r36
  0x017d: PHI (r7v13 boolean) = (r7v11 boolean), (r7v14 boolean) binds: [B:45:0x017b, B:43:0x0175] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r36v3 boolean) = (r36v1 boolean), (r36v4 boolean) binds: [B:45:0x017b, B:43:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceCardOverflowButton(java.lang.String r54, java.lang.String r55, java.lang.String r56, X.BRg r57, X.BFM r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.conversation.HatchSpaceBuildCompletedCardKt.SpaceCardOverflowButton(java.lang.String, java.lang.String, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: SpaceChatCard-8r3B23s, reason: not valid java name */
    public static final void m2173SpaceChatCard8r3B23s(String str, String str2, String str3, long j, C1DM c1dm, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1D(c1dm, 4, function0);
        bfm.AgG(934510114);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c1dm);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        int i4 = i2 & 128;
        int iA0a = 12582912;
        if (i4 != 0) {
            iA0d |= iA0a;
        } else if ((12582912 & i) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0v2);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c78);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA04 = C0v5.A04(C1b8.A01(C11U.A03(bRg2.then(c1062ATq), c1dm), j), new C1YD(0), null, function0, true);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            if (str2 == null || MutableState.A0A(mutableState)) {
                bfm.AgE(1014914698);
                BBI.A0R(bbi, false);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(mutableState, bfm, 1014377499);
                Object objAaT2 = bfm.AaT();
                if (zA1Y || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSpaceBuildCompletedCardKt$SpaceChatCard$1$1$1(mutableState);
                    bfm.Ai0(objAaT2);
                }
                float f = PreviewInset;
                SpacePreviewImage(str2, (Function0) objAaT2, C11U.A03(C3U4.A0C(c1062ATq, f, f, f, 0.0f), AttachmentPreviewShapeKt.m671attachmentPreviewShapeVpY3zN4(c1dm, f, PreviewCornerRadius)), bfm, (iA0d >> 3) & 14, 0);
                BBI.A0R(bbi, false);
            }
            BS0 bs0 = BRg.A00;
            C1AC c1ac = C2VU.A05;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            BRg bRgA0B = C3U4.A0B(c90m.AiP(bs0, 1.0f, true), 12.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(interfaceC04981Yd, bfm, C2VU.A04, 48);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v3);
            BPg.A02(bfm, akqA043, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA013, g0vA0u);
            int i5 = iA0d & 14;
            SpaceIcon(str, str3, null, bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i5, 4);
            C01N.A07(bfm, C10G.A08(bs0, 12.0f));
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA004 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D4 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA004, g0v3);
            BPg.A02(bfm, akqA044, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).footnoteEmphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, i5 | 805306368, 6, 14838);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).caption1Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            if (g0v2 == null) {
                bfm.AgE(-834405667);
            } else {
                bfm.AgE(-165463644);
                AnonymousClass003.A13(bfm, g0v2, iA0d >> 21);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchSpaceBuildCompletedCardKt$SpaceChatCard$2(str, str2, str3, j, c1dm, function0, bRg2, g0v2, i, i2);
        }
    }

    public static final void SpaceIcon(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1185490817);
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
            float f = IconSize;
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A07(bRg2, f), IconCornerRadius), C06G.A0B(bfm));
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
                bfm.AgE(451426729);
                boolean zA1C = AnonymousClass003.A1C(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1C || objAaT == C78N.A00) {
                    objAaT = AnonymousClass005.A0S(bfm, false);
                }
                MutableState mutableState = (MutableState) objAaT;
                if (MutableState.A0A(mutableState)) {
                    bfm.AgE(451733257);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(451520628);
                    BRg bRgA07 = C10G.A07(BRg.A00, f);
                    C7197Ei9 c7197Ei9 = IMAGE_CENTER_CROP;
                    boolean zA65 = bfm.A65(mutableState);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchSpaceBuildCompletedCardKt$SpaceIcon$1$1$1(mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    AuraImageKt.AuraImage(str2, bRgA07, c7197Ei9, null, null, false, null, (Function0) objAaT2, false, null, bfm, ((iA0d >> 3) & 14) | 1572912, 824);
                    BBI.A0R(bbi, false);
                }
                if (MutableState.A0A(mutableState)) {
                    bfm.AgE(451755205);
                    MonogramText(str, null, bfm, iA0d & 14, 2);
                } else {
                    bfm.AgE(451789801);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(451802697);
                MonogramText(str, null, bfm, iA0d & 14, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138872(str, str2, bRg2, i, i2);
        }
    }

    public static final void SpacePreviewImage(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-466581990);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(BJe.A00(bRgA0P, 1.5f, false), C06G.A0B(bfm));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AuraImageKt.AuraImage(str, C10G.A01, IMAGE_CENTER_CROP, null, null, false, null, function0, false, null, bfm, AnonymousClass001.A0C(iA0d << 18, (iA0d & 14) | 1572912), 824);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138882(str, function0, bRgA0P, i, i2);
        }
    }
}
