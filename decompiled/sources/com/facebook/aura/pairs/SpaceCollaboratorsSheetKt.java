package com.facebook.aura.pairs;

import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7bA;
import X.C90m;
import X.CH0;
import X.Ey9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.pairs.SpaceCollaboratorsUiState;
import com.facebook.aura.pairs.SpaceCollaboratorsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.menu.SpaceContextMenuKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SpaceCollaboratorsSheetKt {
    public static final long NameLineHeight = C19U.A03(24);
    public static final int ROLE_MENU_HEADER = -1;
    public static final int ROLE_MENU_REMOVE = -2;

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceAccessRequestRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $busy;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onApprove;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ SpaceAccessRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SpaceAccessRequest spaceAccessRequest, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$request = spaceAccessRequest;
            this.$busy = z;
            this.$onApprove = function0;
            this.$onDecline = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceAccessRequestRow(this.$request, this.$busy, this.$onApprove, this.$onDecline, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C130212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ G0U<SpaceRole, Unit> $onRole;
        public final /* synthetic */ SpaceRole $role;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130212(String str, SpaceRole spaceRole, boolean z, G0U<? super SpaceRole, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$role = spaceRole;
            this.$enabled = z;
            this.$onRole = g0u;
            this.$onRemove = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorRoleMenu(this.$name, this.$role, this.$enabled, this.$onRole, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C130222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $avatar;
        public final /* synthetic */ boolean $dimmed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130222(String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2) {
            super(2);
            this.$name = str;
            this.$subtitle = str2;
            this.$avatar = g0v;
            this.$modifier = bRg;
            this.$dimmed = z;
            this.$trailing = g0v2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorRow(this.$name, this.$subtitle, this.$avatar, this.$modifier, this.$dimmed, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsEmptyCaption$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsEmptyCaption(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C130232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $count;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130232(String str, Integer num, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$count = num;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsHeader(this.$slug, this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsInviteButton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C130242 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public static final C130242 INSTANCE = new C130242();

        public C130242() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -1820640249).bodyMedium;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsInviteButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$enabled = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsInviteButton(this.$slug, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$2, reason: invalid class name and case insensitive filesystem */
    public final class C130252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SpaceCollaboratorsUiState.Loaded $state;
        public final /* synthetic */ SpaceCollaboratorsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130252(SpaceCollaboratorsUiState.Loaded loaded, SpaceCollaboratorsViewModel spaceCollaboratorsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$state = loaded;
            this.$viewModel = spaceCollaboratorsViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsList(this.$state, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsLoadFailed$2, reason: invalid class name and case insensitive filesystem */
    public final class C130262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130262(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsLoadFailed(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C130272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130272(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C130282 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $slug;
        public final /* synthetic */ C1BO<SpaceCollaboratorsUiState> $state$delegate;
        public final /* synthetic */ SpaceCollaboratorsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130282(String str, SpaceCollaboratorsViewModel spaceCollaboratorsViewModel, C1BO<? extends SpaceCollaboratorsUiState> c1bo) {
            super(3);
            this.$slug = str;
            this.$viewModel = spaceCollaboratorsViewModel;
            this.$state$delegate = c1bo;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r17, X.BFM r18, int r19) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt.C130282.invoke(X.07C, X.BFM, int):void");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsSheetKt$SpaceCollaboratorsSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C130293 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130293(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceCollaboratorsSheetKt.SpaceCollaboratorsSheet(this.$slug, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SpaceAccessRequestRow(SpaceAccessRequest spaceAccessRequest, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1735732222);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spaceAccessRequest, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = spaceAccessRequest.name;
            if (strA01 == null) {
                bfm.AgE(1591360996);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fce);
            } else {
                bfm.AgE(1591360500);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 44.0f), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            m1684SpaceInitialsAvataruFdPcIQ(strA01, 36.0f, null, bfm, 48, 4);
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbiA07, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            SpaceRole spaceRole = spaceAccessRequest.role;
            SpaceRole spaceRole2 = SpaceRole.EDIT;
            int i4 = R.string._name_removed__res_0x7f120fae;
            if (spaceRole == spaceRole2) {
                i4 = R.string._name_removed__res_0x7f120fad;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i4), null, C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C60Q.A04()), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbiA07, true);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, 8.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbiA07);
            AKQ akqA043 = BBI.A04(bbiA07);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbiA07, function03);
            BPg.A02(bfm, interfaceC1380AiAA0S, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fb2);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = auraButtonStyles.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean z2 = !z;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, null, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, z2, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA05 << 3) & 57344, 0, 134200781);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fac), null, null, auraButtonStyles.primary(null, bfm, 48, 1), auraButtonSize, null, false, false, z2, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA05 << 6) & 57344, 0, 134200781);
            BBI.A0R(bbiA07, true);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(spaceAccessRequest, z, function0, function02, bRg2, i, i2);
        }
    }

    /* renamed from: SpaceCollaboratorAvatar-942rkJo, reason: not valid java name */
    public static final void m1683SpaceCollaboratorAvatar942rkJo(SpaceCollaborator spaceCollaborator, String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(spaceCollaborator, str);
        bfm.AgG(808906490);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spaceCollaborator, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            PairsImageRef pairsImageRef = spaceCollaborator.photo;
            if (spaceCollaborator.isInvited || pairsImageRef == null) {
                bfm.AgE(-927944388);
                m1684SpaceInitialsAvataruFdPcIQ(str, f, bRg2, bfm, (iA05 >> 3) & 1022, zA1b ? 1 : 0);
            } else {
                bfm.AgE(-928024771);
                PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(pairsImageRef, f, bRg2, 0L, bfm, AnonymousClass002.A07(iA05 >> 3, PairsImageRef.$stable), 8);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorAvatar$1(spaceCollaborator, str, f, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorRoleMenu(String str, SpaceRole spaceRole, boolean z, G0U<? super SpaceRole, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1020980463);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(spaceRole));
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.check_outline_24_wght400, 0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fcd);
            bfm.AgE(1909697880);
            Ey9<SpaceRole> entries = SpaceRole.getEntries();
            ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
            for (SpaceRole spaceRole2 : entries) {
                int iOrdinal = spaceRole2.ordinal();
                String strA012 = AbstractC2271BQs.A01(bfm, spaceRole2.getLabel());
                AVy aVyA003 = BOf.A00(bfm, spaceRole2.getIcon(), 0);
                AVy aVy = null;
                if (spaceRole2 == spaceRole) {
                    aVy = aVyA00;
                }
                arrayListA0i.add(new AuraContextMenuItem(iOrdinal, strA012, null, aVyA003, null, aVy, AnonymousClass002.A1Z(spaceRole2, spaceRole), false, false, true, false, BRg.A00, 1, 1));
            }
            BBI bbiA07 = C3cG.A07(bfm);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            AVy aVyA004 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120fbc);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            long j = C3cH.A0W(bfm).primaryText;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA004, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA0t, (Function0) objAaT2, null, z, C60P.A04(j), new C1DG(24.0f), null, null, bfm, (AVy.$stable << 3) | 12610944 | ((iA0d << 21) & 1879048192), 48, 12577);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1L = AnonymousClass005.A1L(iA0d) | AnonymousClass003.A1C(iA0d) | ((iA0d & 7168) == 2048);
            Object objAaT3 = bfm.AaT();
            if (zA1L || objAaT3 == obj) {
                objAaT3 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$2$1(function0, g0u, mutableState, spaceRole);
                bfm.Ai0(objAaT3);
            }
            G0U g0u2 = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u2, (Function0) objAaT4, zA0A, null, 0L, null, false, new SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$4(str, arrayListA0i, strA01, aVyA002), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130212(str, spaceRole, z, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorRow(String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v2, BFM bfm, int i, int i2) {
        long jA06;
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v3 = g0v2;
        boolean zA1K = z;
        bfm.AgG(-186672792);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
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
            iA0d |= AnonymousClass004.A0r(bfm, zA1K);
        }
        int i5 = i2 & 32;
        int iA0Y = 196608;
        if (i5 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0v3);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            if (i5 != 0) {
                g0v3 = ComposableSingletons$SpaceCollaboratorsSheetKt.f211lambda$965724866;
            }
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 60.0f), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = C11S.A00(bs0, zA1K ? 0.5f : 1.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass003.A13(bfm, g0v, iA0d >> 6);
            BBI.A0R(bbi, true);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, C3cH.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, NameLineHeight);
            if (zA1K) {
                bfm.AgE(-2125301989);
                jA06 = C3cH.A07(bfm, auraTheme);
            } else {
                bfm.AgE(-2125300839);
                jA06 = C3cH.A06(bfm, auraTheme);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, jA06, c1822ArmA00, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C60Q.A04()), null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            AnonymousClass003.A13(bfm, g0v3, iA0d >> 15);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130222(str, str2, g0v, bRg2, zA1K, g0v3, i, i2);
        }
    }

    public static final void SpaceCollaboratorsEmptyCaption(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(136850166);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120fb5);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C3U4.A04(AnonymousClass001.A0R(bRg2), 12.0f), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorsHeader(String str, Integer num, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        boolean z;
        String str2;
        String strA0s;
        BRg bRg2 = bRg;
        bfm.AgG(1539191774);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, num);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            UnifiedArtifact unifiedArtifactRememberSpaceCatalogEntry = SpaceContextMenuKt.rememberSpaceCatalogEntry(str, bfm, iA0d & 14);
            boolean zA1K = AnonymousClass003.A1K(bfm, unifiedArtifactRememberSpaceCatalogEntry != null ? unifiedArtifactRememberSpaceCatalogEntry.iconUrl : null, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(unifiedArtifactRememberSpaceCatalogEntry != null ? unifiedArtifactRememberSpaceCatalogEntry.iconUrl : null, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str3 = (String) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C3TH c3th = C2VU.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
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
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (str3 == null || C7BY.A0j(str3)) {
                z = true;
                bfm.AgE(-447241522);
            } else {
                bfm.AgE(-447428142);
                z = true;
                AuraImageKt.m2573AuraImageXRP3Ue8(str3, C11U.A03(C10G.A07(BRg.A00, 64.0f), AuraTheme.INSTANCE.getShapes(bfm, 6).media), B18.A00, null, null, false, new C1DG(64.0f), 0L, false, false, false, null, null, null, null, bfm, 1573248, 0, 32696);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0A = C3U4.A0A(c1062ATq, 4.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, c3th, 4.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0A);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0T, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (unifiedArtifactRememberSpaceCatalogEntry == null || (str2 = unifiedArtifactRememberSpaceCatalogEntry.displayName) == null) {
                str2 = str;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C60Q.A04(), 0L, C19U.A03(25));
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = SpaceCollaboratorsSheetKt$SpaceCollaboratorsHeader$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), jA06, c1822ArmA00, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            if (num != null) {
                bfm.AgE(-1098750005);
                strA0s = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f10003a, new Object[]{num}, bfm, num.intValue());
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1098636421);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120fb4);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0s, c1062ATq, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, z);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            BBI.A0R(bbi, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130232(str, num, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorsInviteButton(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(43958729);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fb7);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0U(C3U4.A04(AnonymousClass001.A0R(bRg2), 12.0f), 46.0f), "hatch-space-collaborators-invite");
            boolean zA67 = bfm.A67(auraNavigatorA0b) | AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsInviteButton$1$1(auraNavigatorA0b, str);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA00, auraLabelButtonStylePrimary, null, null, false, false, z, false, false, null, null, (Function0) objAaT, null, null, null, null, C130242.INSTANCE, null, null, null, false, 0, false, 0, bfm, (iA0d << 24) & 1879048192, 0, 0, 133676517);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, z, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorsList(SpaceCollaboratorsUiState.Loaded loaded, SpaceCollaboratorsViewModel spaceCollaboratorsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        int label;
        BRg bRg2 = bRg;
        bfm.AgG(706406447);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(loaded, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(spaceCollaboratorsViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0R(bRg2), 8.0f);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
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
            List<SpaceAccessRequest> list = loaded.collaborators.accessRequests;
            if (list.isEmpty()) {
                bfm.AgE(1141238333);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1140795312);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fab);
                BS0 bs0 = BRg.A00;
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 536779181);
                while (itA0w.hasNext()) {
                    SpaceAccessRequest spaceAccessRequest = (SpaceAccessRequest) itA0w.next();
                    boolean zContains = loaded.busy.contains(spaceAccessRequest.activityId);
                    int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                    boolean zA1T = AnonymousClass001.A1T(bfm, spaceAccessRequest, i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(spaceCollaboratorsViewModel)));
                    Object objAaT2 = bfm.AaT();
                    if (zA1T || objAaT2 == C78N.A00) {
                        objAaT2 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$2$1$1$1(spaceCollaboratorsViewModel, spaceAccessRequest);
                        bfm.Ai0(objAaT2);
                    }
                    Function0 function02 = (Function0) objAaT2;
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, spaceAccessRequest, i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(spaceCollaboratorsViewModel)));
                    Object objAaT3 = bfm.AaT();
                    if (zA1T2 || objAaT3 == C78N.A00) {
                        objAaT3 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$2$1$2$1(spaceCollaboratorsViewModel, spaceAccessRequest);
                        bfm.Ai0(objAaT3);
                    }
                    SpaceAccessRequestRow(spaceAccessRequest, zContains, function02, (Function0) objAaT3, null, bfm, SpaceAccessRequest.$stable, 16);
                }
                AnonymousClass003.A0q(bbi);
                BBI.A0R(bbi, false);
            }
            SpaceCollaboratorRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fd2), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fbf), B1V.A00(bfm, new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$3(loaded), -1938249022), null, false, null, bfm, 384, 56);
            bfm.AgE(1422298090);
            for (SpaceCollaborator spaceCollaborator : loaded.collaborators.collaborators) {
                String strA0v = spaceCollaborator.name;
                if (strA0v == null) {
                    bfm.AgE(991153932);
                    strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120fb6);
                } else {
                    bfm.AgE(991152847);
                }
                BBI.A0R(bbi, false);
                if (spaceCollaborator.isInvited) {
                    label = R.string._name_removed__res_0x7f120fb9;
                } else {
                    SpaceRole spaceRole = spaceCollaborator.role;
                    if (spaceRole == null) {
                        spaceRole = SpaceRole.USE;
                    }
                    label = spaceRole.getLabel();
                }
                SpaceCollaboratorRow(strA0v, AbstractC2271BQs.A01(bfm, label), B1V.A00(bfm, new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$1(spaceCollaborator, strA0v), 1708119191), null, spaceCollaborator.isInvited, B1V.A00(bfm, new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2(strA0v, spaceCollaborator, loaded, spaceCollaboratorsViewModel), 705105562), bfm, 196992, 8);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130252(loaded, spaceCollaboratorsViewModel, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorsLoadFailed(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1362277588);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0R(bRg2), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(12.0f), bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fbb);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceCollaboratorsSheetKt$SpaceCollaboratorsLoadFailed$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822ArmA0B, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fcc), null, null, AnonymousClass006.A0g(bfm), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130262(function0, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorsSheet(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1176016499);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0d = FGI.A0d("space-collaborators:", ((CH0) abstractC3358CGzA0h).A01, ":", str);
            SpaceCollaboratorsViewModel.Factory factory = new SpaceCollaboratorsViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SpaceCollaboratorsViewModel spaceCollaboratorsViewModel = (SpaceCollaboratorsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SpaceCollaboratorsViewModel.class, strA0d);
            boolean zA67 = bfm.A67(spaceCollaboratorsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsSheet$1$1(spaceCollaboratorsViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, spaceCollaboratorsViewModel, (G0U) objAaT, SpaceCollaboratorsViewModel.$stable, 2);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, AbstractC07539Wl.A00(bRg2, "hatch-space-collaborators-sheet"), null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new C130282(str, spaceCollaboratorsViewModel, C2CK.A02(bfm, spaceCollaboratorsViewModel.state)), 1652826518), bfm, 6, 48, 2044);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130293(str, bRg2, i, i2);
        }
    }

    /* renamed from: SpaceInitialsAvatar-uFdPcIQ, reason: not valid java name */
    public static final void m1684SpaceInitialsAvataruFdPcIQ(String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1450138941);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
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
            List listA0g = C7BY.A0g(str, new char[]{' '});
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : listA0g) {
                AnonymousClass006.A1F((String) obj, obj, arrayListA0h);
            }
            List listA0a = AbstractC0878AGe.A0a(arrayListA0h, 2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceCollaboratorsSheetKt$SpaceInitialsAvatar$initials$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            String strA0L = AbstractC0878AGe.A0L("", "", "", listA0a, (G0U) objAaT);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0L, C10G.A02(C2VU.A09, C1b8.A03(C10G.A07(bRg2, f), C1D8.A00, auraTheme.getColors(bfm, 6).highlight), false), C3cH.A07(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceCollaboratorsSheetKt$SpaceInitialsAvatar$1(str, f, bRg2, i, i2);
        }
    }

    public static final void SpaceCollaboratorsLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(336914639);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA02 = C10G.A02(C2VU.A09, C3U4.A06(AnonymousClass001.A0R(bRg), 24.0f), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130272(bRg, i, i2);
        }
    }

    public static final /* synthetic */ SpaceCollaboratorsUiState access$SpaceCollaboratorsSheet$lambda$1(C1BO c1bo) {
        return (SpaceCollaboratorsUiState) c1bo.getValue();
    }
}
