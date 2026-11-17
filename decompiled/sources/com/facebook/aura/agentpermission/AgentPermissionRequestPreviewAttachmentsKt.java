package com.facebook.aura.agentpermission;

import X.AKQ;
import X.ARL;
import X.AbstractC0878AGe;
import X.AbstractC1103AYp;
import X.AbstractC3358CGz;
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
import X.B18;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1OM;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionRequestPreviewAttachmentsKt {
    public static final float PreviewAttachmentSize = 120.0f;
    public static final C1D3 PreviewAttachmentShape = C1D8.A00(12.0f);
    public static final Set<String> SUPPORTED_INLINE_IMAGE_CONTENT_TYPES = BFI.A0H(new String[]{MediaDeviceSyncClientKt.FALLBACK_MIME, HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE, "image/gif", "image/webp", "image/avif", "image/heic", "image/heif"});
    public static final Set<String> SUPPORTED_INLINE_VIDEO_CONTENT_TYPES = BFI.A0H(new String[]{HatchShareSheetRepository.MUTED_VIDEO_MIME, "video/quicktime", "video/webm"});

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentFallback$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment $item;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, BRg bRg, int i, int i2) {
            super(2);
            this.$item = agentPermissionRequestPreviewAttachment;
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
            AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachmentFallback(this.$item, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$2, reason: invalid class name and case insensitive filesystem */
    public final class C107742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107742(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$item = agentPermissionRequestPreviewAttachment;
            this.$modifier = bRg;
            this.$onOpen = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachmentMedia(this.$item, this.$modifier, this.$onOpen, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$item = agentPermissionRequestPreviewAttachment;
            this.$modifier = bRg;
            this.$onOpen = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachmentMedia(this.$item, this.$modifier, this.$onOpen, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$item = agentPermissionRequestPreviewAttachment;
            this.$modifier = bRg;
            this.$onOpen = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachmentMedia(this.$item, this.$modifier, this.$onOpen, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachments$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C107752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments $block;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107752(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments attachments, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i) {
            super(2);
            this.$block = attachments;
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachments(this.$block, this.$approval, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void PreviewAttachments(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments attachments, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BFM bfm, int i) {
        boolean zA1a = AnonymousClass002.A1a(attachments, agentPermissionApproval);
        C7384Etj.A0Y(hatchScreen, 2);
        bfm.AgG(-440824230);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(attachments, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(agentPermissionApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass005.A0A(bfm, hatchScreen);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            float f = AuraDimensKt.SpacingSmall;
            C9m9 c9m9A00 = AcQ.A00(f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String str = attachments.label;
            if (str == null) {
                bfm.AgE(-1733607323);
            } else {
                bfm.AgE(-1733607322);
                AgentPermissionRequestPreviewKt.PreviewLabel(str, bfm, 0);
            }
            BBI.A0R(bbi, false);
            BRg bRgA012 = AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, zA1a ? 1 : 0), C10G.A02, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0S, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            bfm.AgE(-914571530);
            for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment : attachments.items) {
                boolean zA1K = AnonymousClass004.A1K(iA05) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(agentPermissionApproval)));
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachments$1$2$1$1$1(hatchScreen, agentPermissionApproval);
                    bfm.Ai0(objAaT);
                }
                PreviewAttachmentMedia(agentPermissionRequestPreviewAttachment, null, (Function0) objAaT, bfm, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment.$stable, 2);
            }
            AnonymousClass002.A10(bbi, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107752(attachments, agentPermissionApproval, hatchScreen, i);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.values().length];
            try {
                AnonymousClass002.A13(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.IMAGE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.VIDEO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.FILE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PreviewAttachmentFallback(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1642847283);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionRequestPreviewAttachment, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, PreviewAttachmentSize);
            C1D3 c1d3 = PreviewAttachmentShape;
            BRg bRgA03 = C11U.A03(bRgA07, c1d3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA09 = C3U4.A09(C1DI.A02(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).background), c1d3, 1.0f, auraTheme.getColors(bfm, 6).border), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0a);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C3TH c3th = C2VU.A00;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, attachmentIcon(agentPermissionRequestPreviewAttachment.kind), 0), AuraIconSize.SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(agentPermissionRequestPreviewAttachment.fileName, null, C3cH.A05(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), false, 0, 1, 5, null, null, null, bfm, 805306368, 6, 14770);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionRequestPreviewAttachment, bRg2, i, i2);
        }
    }

    public static final void PreviewAttachmentMedia(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        G0V<? super BFM, ? super Integer, Unit> c107742;
        BRg bRgThen;
        String str;
        String strVersionedResourceUrl;
        C1DG c1dg;
        BRg bRg2 = bRg;
        Function0<Unit> function02 = function0;
        C7384Etj.A0Y(agentPermissionRequestPreviewAttachment, 0);
        bfm.AgG(-822826319);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionRequestPreviewAttachment, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource = agentPermissionRequestPreviewAttachment.resource;
            bfm.AgE(-462099958);
            if (agentPermissionRequestPreviewAttachmentResource != null) {
                BS0 bs0 = BRg.A00;
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA1Y = AnonymousClass005.A1Y(bfm, abstractC3358CGzA0h, auraNavigatorA0b, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionRequestPreviewAttachment)), AnonymousClass001.A1T(bfm, agentPermissionRequestPreviewAttachmentResource, AnonymousClass003.A1D(iA05)));
                Object objAaT2 = bfm.AaT();
                if (zA1Y || objAaT2 == C78N.A00) {
                    objAaT2 = new AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$openViewerModifier$1$1$1(function02, agentPermissionRequestPreviewAttachmentResource, agentPermissionRequestPreviewAttachment, abstractC3358CGzA0h, auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                bRgThen = bRg2.then(C0v5.A04(bs0, c1ydA0A, null, (Function0) objAaT2, true));
            } else {
                bRgThen = bRg2;
            }
            BBI bbiA07 = C3cG.A07(bfm);
            boolean zA1P = AnonymousClass003.A1P(bfm, agentPermissionRequestPreviewAttachmentResource, abstractC3358CGzA0h, AnonymousClass002.A1U(bfm, agentPermissionRequestPreviewAttachment.kind));
            Object objAaT3 = bfm.AaT();
            if (zA1P || objAaT3 == C78N.A00) {
                if (agentPermissionRequestPreviewAttachmentResource != null) {
                    str = agentPermissionRequestPreviewAttachmentResource.contentType;
                    strVersionedResourceUrl = versionedResourceUrl(agentPermissionRequestPreviewAttachmentResource);
                } else {
                    str = null;
                    strVersionedResourceUrl = null;
                }
                objAaT3 = (agentPermissionRequestPreviewAttachment.kind == HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.IMAGE && AbstractC0878AGe.A0k(SUPPORTED_INLINE_IMAGE_CONTENT_TYPES, str)) ? WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(strVersionedResourceUrl, abstractC3358CGzA0h) : (agentPermissionRequestPreviewAttachment.kind == HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.VIDEO && AbstractC0878AGe.A0k(SUPPORTED_INLINE_VIDEO_CONTENT_TYPES, str)) ? WorkspaceUriResolver.INSTANCE.resolveThumbnailUrl(strVersionedResourceUrl, abstractC3358CGzA0h, HatchThumbnailDisplaySize.LARGE) : null;
                bfm.Ai0(objAaT3);
            }
            String str2 = (String) objAaT3;
            if (str2 == null) {
                bfm.AgE(-1439046274);
                PreviewAttachmentFallback(agentPermissionRequestPreviewAttachment, bRgThen, bfm, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment.$stable | (iA05 & 14), 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc != null) {
                    c107742 = new C107742(agentPermissionRequestPreviewAttachment, bRg2, function02, i, i2);
                    bBbAAc.A06 = c107742;
                }
                return;
            }
            bfm.AgE(-1438966511);
            BBI.A0R(bbiA07, false);
            boolean zA65 = bfm.A65(str2);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT4;
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1438877634);
                PreviewAttachmentFallback(agentPermissionRequestPreviewAttachment, bRgThen, bfm, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment.$stable | (iA05 & 14), 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass3(agentPermissionRequestPreviewAttachment, bRg2, function02, i, i2);
                    c107742 = anonymousClass5;
                    bBbAAc.A06 = c107742;
                }
                return;
            }
            bfm.AgE(-1438797871);
            BBI.A0R(bbiA07, false);
            Float fAspectRatioOrNull = agentPermissionRequestPreviewAttachmentResource != null ? aspectRatioOrNull(agentPermissionRequestPreviewAttachmentResource) : null;
            BS0 bs02 = BRg.A00;
            BRg bRgThen2 = C10G.A09(bs02, 48.0f, 48.0f).then(bRgThen);
            Alignment alignment = C2VU.A09;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgThen2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA01);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v2);
            BRg bRgA03 = C11U.A03(bs02, PreviewAttachmentShape);
            long j = C3cH.A0W(bfm).background;
            C1DM c1dm = C1OM.A00;
            BRg bRgA032 = C1b8.A03(bRgA03, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgA032);
            AnonymousClass005.A0n(bfm, bbiA07, function03);
            BPg.A02(bfm, interfaceC1380AiAA012, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v2);
            float f = PreviewAttachmentSize;
            BRg bRgA04 = C10G.A04(bs02, f);
            if (fAspectRatioOrNull != null) {
                c1dg = null;
                bRgA04 = bRgA04.then(BJe.A00(bs02, fAspectRatioOrNull.floatValue(), false));
            } else {
                c1dg = null;
            }
            ARL arl = B18.A02;
            String str3 = agentPermissionRequestPreviewAttachment.fileName;
            boolean z = false;
            if (fAspectRatioOrNull == null) {
                z = true;
                c1dg = new C1DG(f);
            }
            boolean zA652 = bfm.A65(mutableState);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == C78N.A00) {
                objAaT5 = new AgentPermissionRequestPreviewAttachmentsKt$PreviewAttachmentMedia$4$1$2$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str2, bRgA04, arl, str3, null, z, c1dg, 0L, true, false, false, null, null, (Function0) objAaT5, null, bfm, 100663680, 48, 22160);
            if (agentPermissionRequestPreviewAttachment.kind == HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.VIDEO) {
                bfm.AgE(-1669766274);
                BRg bRgA013 = C11U.A01(C10G.A07(bs02, 44.0f), 22.0f);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                BRg bRgA033 = C1b8.A03(bRgA013, c1dm, auraTheme.getColors(bfm, 6).surfaceOnMedia);
                InterfaceC1380AiA interfaceC1380AiAA013 = C3Ue.A01(alignment, false);
                int iA0D2 = AnonymousClass001.A0D(bbiA07);
                AKQ akqA043 = BBI.A04(bbiA07);
                BRg bRgA014 = AxM.A01(bfm, bRgA033);
                AnonymousClass005.A0n(bfm, bbiA07, function03);
                BPg.A02(bfm, interfaceC1380AiAA013, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA014, g0v2);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.media_play_wght400_filled_24, 0), AuraIconSize.SMALL, null, auraTheme.getColors(bfm, 6).onMedia, null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbiA07, true);
            } else {
                bfm.AgE(-1669267515);
            }
            AnonymousClass002.A10(bbiA07, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(agentPermissionRequestPreviewAttachment, bRg2, function02, i, i2);
            c107742 = anonymousClass5;
            bBbAAc.A06 = c107742;
        }
    }

    public static final Float aspectRatioOrNull(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource) {
        Integer num = agentPermissionRequestPreviewAttachmentResource.width;
        if (num != null) {
            int iIntValue = num.intValue();
            if (agentPermissionRequestPreviewAttachmentResource.height != null) {
                return Float.valueOf(iIntValue / r0.intValue());
            }
        }
        return null;
    }

    public static final String versionedResourceUrl(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource agentPermissionRequestPreviewAttachmentResource) {
        Long l = agentPermissionRequestPreviewAttachmentResource.updatedAtMs;
        if (l == null) {
            return agentPermissionRequestPreviewAttachmentResource.url;
        }
        long jLongValue = l.longValue();
        char c = C7BY.A0k(agentPermissionRequestPreviewAttachmentResource.url, '?') ? '&' : '?';
        StringBuilder sbA0g = C3cG.A0g(agentPermissionRequestPreviewAttachmentResource.url);
        sbA0g.append(c);
        sbA0g.append("v=");
        sbA0g.append(jLongValue);
        return sbA0g.toString();
    }

    public static final int attachmentIcon(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind) {
        int iOrdinal = agentPermissionRequestPreviewAttachmentKind.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.image_wght400_outline_24;
        }
        if (iOrdinal == 1) {
            return R.drawable.camcorder_wght400_outline_24;
        }
        if (iOrdinal == 2) {
            return R.drawable.paperclip_wght400_outline_24;
        }
        throw C3cG.A0q();
    }
}
