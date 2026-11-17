package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC1103AYp;
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
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentPermissionOutgoingMediaApprovalKt {
    public static final C1D3 OutgoingMediaShape = C1D8.A00(12.0f);
    public static final float OutgoingMediaThumbnailSize = 150.0f;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOutgoingMediaApprovalKt$AgentPermissionOutgoingMediaApproval$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaApproval $approval;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = outgoingMediaApproval;
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
            AgentPermissionOutgoingMediaApprovalKt.AgentPermissionOutgoingMediaApproval(this.$approval, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOutgoingMediaApprovalKt$AgentPermissionOutgoingMediaApproval$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaApproval $approval;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = outgoingMediaApproval;
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
            AgentPermissionOutgoingMediaApprovalKt.AgentPermissionOutgoingMediaApproval(this.$approval, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOutgoingMediaApprovalKt$OutgoingMediaAttachmentTile$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, int i) {
            super(2);
            this.$item = outgoingMediaItem;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionOutgoingMediaApprovalKt.OutgoingMediaAttachmentTile(this.$item, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOutgoingMediaApprovalKt$OutgoingMediaLoadedPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C107562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaItem $item;
        public final /* synthetic */ String $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107562(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, String str, int i) {
            super(2);
            this.$item = outgoingMediaItem;
            this.$uri = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionOutgoingMediaApprovalKt.OutgoingMediaLoadedPreview(this.$item, this.$uri, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOutgoingMediaApprovalKt$OutgoingMediaPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C107571 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107571(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, int i) {
            super(2);
            this.$item = outgoingMediaItem;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionOutgoingMediaApprovalKt.OutgoingMediaPreview(this.$item, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionOutgoingMediaApprovalKt$OutgoingMediaSquareIconTile$2, reason: invalid class name and case insensitive filesystem */
    public final class C107582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.OutgoingMediaItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107582(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, int i) {
            super(2);
            this.$item = outgoingMediaItem;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionOutgoingMediaApprovalKt.OutgoingMediaSquareIconTile(this.$item, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String trimmedNonEmpty(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAgentPermissionsRepository.OutgoingMediaKind.values().length];
            try {
                AnonymousClass002.A13(HatchAgentPermissionsRepository.OutgoingMediaKind.IMAGE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAgentPermissionsRepository.OutgoingMediaKind.VIDEO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAgentPermissionsRepository.OutgoingMediaKind.AUDIO, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchAgentPermissionsRepository.OutgoingMediaKind.VOICE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchAgentPermissionsRepository.OutgoingMediaKind.DOCUMENT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AgentPermissionOutgoingMediaApproval(HatchAgentPermissionsRepository.OutgoingMediaApproval outgoingMediaApproval, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        List list;
        BRg bRg2 = bRg;
        bfm.AgG(634660744);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(outgoingMediaApproval, bfm, i) ? 1 : 0) | i : i;
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
            if (outgoingMediaApproval == null || (list = outgoingMediaApproval.items) == null) {
                list = C0881AGi.A00;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(outgoingMediaApproval, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingSmall;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120116);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AgentPermissionOutgoingMediaApprovalKt$AgentPermissionOutgoingMediaApproval$2$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BRg bRgA012 = AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, 1), c1062ATq, true);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0S, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 750585182);
            while (itA0w.hasNext()) {
                OutgoingMediaAttachmentTile((HatchAgentPermissionsRepository.OutgoingMediaItem) itA0w.next(), bfm, HatchAgentPermissionsRepository.OutgoingMediaItem.$stable);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(outgoingMediaApproval, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final String attachmentTitle(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, BFM bfm, int i) {
        int i2;
        String strTrimmedNonEmpty = trimmedNonEmpty(outgoingMediaItem.fileName);
        if (strTrimmedNonEmpty == null) {
            bfm.AgE(1279387971);
            int iOrdinal = outgoingMediaItem.kind.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-651464404);
                i2 = R.string._name_removed__res_0x7f120119;
            } else if (iOrdinal == 1) {
                bfm.AgE(-651460628);
                i2 = R.string._name_removed__res_0x7f12011a;
            } else if (iOrdinal == 2) {
                bfm.AgE(-651456852);
                i2 = R.string._name_removed__res_0x7f120117;
            } else if (iOrdinal == 3) {
                bfm.AgE(-651453071);
                i2 = R.string._name_removed__res_0x7f12011b;
            } else {
                if (iOrdinal != 4) {
                    throw AnonymousClass005.A0k(bfm, -651466081);
                }
                bfm.AgE(-651449041);
                i2 = R.string._name_removed__res_0x7f120118;
            }
            strTrimmedNonEmpty = AnonymousClass003.A0e(bfm, i2);
        } else {
            bfm.AgE(-651467414);
        }
        AnonymousClass002.A19(bfm);
        return strTrimmedNonEmpty;
    }

    public static final String mediaContentDescription(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, BFM bfm, int i) {
        String strTrimmedNonEmpty = trimmedNonEmpty(outgoingMediaItem.caption);
        if (strTrimmedNonEmpty == null && (strTrimmedNonEmpty = trimmedNonEmpty(outgoingMediaItem.fileName)) == null) {
            bfm.AgE(1641033937);
            strTrimmedNonEmpty = attachmentTitle(outgoingMediaItem, bfm, (i & 14) | HatchAgentPermissionsRepository.OutgoingMediaItem.$stable);
        } else {
            bfm.AgE(1641031798);
        }
        AnonymousClass002.A19(bfm);
        return strTrimmedNonEmpty;
    }

    public static final void OutgoingMediaAttachmentTile(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, BFM bfm, int i) {
        bfm.AgG(-308892885);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(outgoingMediaItem, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA05), bfm, iA05)) {
            BRg bRgA08 = C10G.A08(BRg.A00, OutgoingMediaThumbnailSize);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA08);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            OutgoingMediaPreview(outgoingMediaItem, bfm, HatchAgentPermissionsRepository.OutgoingMediaItem.$stable | (iA05 & 14));
            String strTrimmedNonEmpty = trimmedNonEmpty(outgoingMediaItem.caption);
            if (strTrimmedNonEmpty != null) {
                bfm.AgE(1625420488);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strTrimmedNonEmpty, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            } else {
                bfm.AgE(1625634977);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(outgoingMediaItem, i);
        }
    }

    public static final void OutgoingMediaLoadedPreview(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, String str, BFM bfm, int i) {
        bfm.AgG(-1605913010);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(outgoingMediaItem, bfm, i) ? 1 : 0) : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            BS0 bs0 = BRg.A00;
            float f = OutgoingMediaThumbnailSize;
            BRg bRgA03 = C11U.A03(C10G.A07(bs0, f), OutgoingMediaShape);
            long j = C3cH.A0W(bfm).background;
            C1DM c1dm = C1OM.A00;
            BRg bRgA032 = C1b8.A03(bRgA03, c1dm, j);
            Alignment alignment = C2VU.A09;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA032);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA01);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A01, B18.A00, mediaContentDescription(outgoingMediaItem, bfm, HatchAgentPermissionsRepository.OutgoingMediaItem.$stable | (iA05 & 14)), null, false, new C1DG(f), 0L, true, false, false, null, null, null, null, bfm, ((iA05 >> 3) & 14) | 102236592, 0, 32432);
            if (outgoingMediaItem.kind == HatchAgentPermissionsRepository.OutgoingMediaKind.VIDEO) {
                bfm.AgE(-159934171);
                BRg bRgA012 = C11U.A01(C10G.A07(bs0, 44.0f), 22.0f);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                BRg bRgA033 = C1b8.A03(bRgA012, c1dm, auraTheme.getColors(bfm, 6).surfaceOnMedia);
                InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA033);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA012, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.media_play_wght400_filled_24, 0), AuraIconSize.SMALL, null, auraTheme.getColors(bfm, 6).onMedia, null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-159464242);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107562(outgoingMediaItem, str, i);
        }
    }

    public static final void OutgoingMediaPreview(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, BFM bfm, int i) {
        bfm.AgG(1587361518);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(outgoingMediaItem, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            HatchAgentPermissionsRepository.OutgoingMediaDescriptor outgoingMediaDescriptor = outgoingMediaItem.media;
            String strResolveRawAssetUrl = null;
            String strTrimmedNonEmpty = trimmedNonEmpty(outgoingMediaDescriptor != null ? outgoingMediaDescriptor.url : null);
            boolean zA1P = AnonymousClass003.A1P(bfm, strTrimmedNonEmpty, abstractC3358CGzA0h, AnonymousClass002.A1U(bfm, outgoingMediaItem.kind));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                int iOrdinal = outgoingMediaItem.kind.ordinal();
                if (iOrdinal == 0) {
                    strResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(strTrimmedNonEmpty, abstractC3358CGzA0h);
                } else if (iOrdinal == 1) {
                    strResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveThumbnailUrl(strTrimmedNonEmpty, abstractC3358CGzA0h, HatchThumbnailDisplaySize.LARGE);
                } else if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                    throw C3cG.A0q();
                }
                bfm.Ai0(strResolveRawAssetUrl);
                objAaT = strResolveRawAssetUrl;
            }
            String str = (String) objAaT;
            if (str != null) {
                bfm.AgE(1497773786);
                OutgoingMediaLoadedPreview(outgoingMediaItem, str, bfm, HatchAgentPermissionsRepository.OutgoingMediaItem.$stable | (iA05 & 14));
            } else {
                bfm.AgE(1497867778);
                OutgoingMediaSquareIconTile(outgoingMediaItem, bfm, HatchAgentPermissionsRepository.OutgoingMediaItem.$stable | (iA05 & 14));
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107571(outgoingMediaItem, i);
        }
    }

    public static final void OutgoingMediaSquareIconTile(HatchAgentPermissionsRepository.OutgoingMediaItem outgoingMediaItem, BFM bfm, int i) {
        bfm.AgG(-2014985218);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(outgoingMediaItem, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, OutgoingMediaThumbnailSize);
            C1D3 c1d3 = OutgoingMediaShape;
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
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0J, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, iconResFor(outgoingMediaItem.kind), 0), AuraIconSize.SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(attachmentTitle(outgoingMediaItem, bfm, HatchAgentPermissionsRepository.OutgoingMediaItem.$stable | (iA05 & 14)), null, C3cH.A05(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), false, 0, 1, 5, null, null, null, bfm, 805306368, 6, 14770);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107582(outgoingMediaItem, i);
        }
    }

    public static final int iconResFor(HatchAgentPermissionsRepository.OutgoingMediaKind outgoingMediaKind) {
        int iOrdinal = outgoingMediaKind.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.image_wght400_outline_24;
        }
        if (iOrdinal == 1) {
            return R.drawable.camcorder_wght400_outline_24;
        }
        if (iOrdinal == 2) {
            return R.drawable.music_note_wght400_outline_24;
        }
        if (iOrdinal == 3) {
            return R.drawable.microphone_wght400_outline_24;
        }
        if (iOrdinal == 4) {
            return R.drawable.paperclip_wght400_outline_24;
        }
        throw C3cG.A0q();
    }
}
