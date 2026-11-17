package com.facebook.aura.spaces.menu;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C1BO;
import X.C2CK;
import X.C3UV;
import X.C3UX;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.FGI;
import X.G0U;
import X.G0V;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey;
import com.facebook.aura.spaces.menu.PeerSpaceMembersState;
import com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel;
import com.facebook.aura.ui.MoveSpacePlacementConfirmationDialogKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class PeerSpaceMenuSheetKt {
    public static final int PEER_MENU_ADD_SHORTCUT = 3;
    public static final int PEER_MENU_ADD_WIDGET = 4;
    public static final int PEER_MENU_COLLABORATORS = 0;
    public static final int PEER_MENU_DOWNLOAD = 5;
    public static final int PEER_MENU_LEAVE = 2;
    public static final int PEER_MENU_MOVE_TO_LIBRARY = 1;

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PeerSpaceMenuSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = peerSpaceMenuSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            PeerSpaceMenuSheetKt.PeerSpaceMenuSheet(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AVy $addShortcutIcon;
        public final /* synthetic */ String $addShortcutLabel;
        public final /* synthetic */ C1BO<Boolean> $addShortcutSupported$delegate;
        public final /* synthetic */ AVy $addWidgetIcon;
        public final /* synthetic */ String $addWidgetLabel;
        public final /* synthetic */ C1BO<Boolean> $addWidgetSupported$delegate;
        public final /* synthetic */ C1BO<Boolean> $canDownloadHtml$delegate;
        public final /* synthetic */ String $collaboratorsLabel;
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ AVy $downloadIcon;
        public final /* synthetic */ String $downloadLabel;
        public final /* synthetic */ AVy $leaveIcon;
        public final /* synthetic */ String $leaveLabel;
        public final /* synthetic */ C1BO<ArtifactPlacementRequest> $moveToLibrary$delegate;
        public final /* synthetic */ AVy $moveToLibraryIcon;
        public final /* synthetic */ String $moveToLibraryLabel;
        public final /* synthetic */ AVy $usersIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, AVy aVy, AuraColors auraColors, String str2, AVy aVy2, String str3, AVy aVy3, String str4, AVy aVy4, String str5, AVy aVy5, String str6, AVy aVy6, C1BO<ArtifactPlacementRequest> c1bo, C1BO<Boolean> c1bo2, C1BO<Boolean> c1bo3, C1BO<Boolean> c1bo4) {
            super(2);
            this.$collaboratorsLabel = str;
            this.$usersIcon = aVy;
            this.$colors = auraColors;
            this.$moveToLibraryLabel = str2;
            this.$moveToLibraryIcon = aVy2;
            this.$downloadLabel = str3;
            this.$downloadIcon = aVy3;
            this.$addShortcutLabel = str4;
            this.$addShortcutIcon = aVy4;
            this.$addWidgetLabel = str5;
            this.$addWidgetIcon = aVy5;
            this.$leaveLabel = str6;
            this.$leaveIcon = aVy6;
            this.$moveToLibrary$delegate = c1bo;
            this.$canDownloadHtml$delegate = c1bo2;
            this.$addShortcutSupported$delegate = c1bo3;
            this.$addWidgetSupported$delegate = c1bo4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(190427095);
            String str = this.$collaboratorsLabel;
            AVy aVy = this.$usersIcon;
            B6A b6a = new B6A(this.$colors.primaryText);
            BS0 bs0 = BRg.A00;
            AuraContextMenuItem auraContextMenuItem = new AuraContextMenuItem(0, str, null, aVy, b6a, null, false, false, false, true, false, bs0, 1, 1);
            AuraContextMenuItem auraContextMenuItem2 = new AuraContextMenuItem(1, this.$moveToLibraryLabel, null, this.$moveToLibraryIcon, new B6A(this.$colors.primaryText), null, false, false, false, true, false, bs0, 1, 1);
            AuraContextMenuItem auraContextMenuItem3 = null;
            if (this.$moveToLibrary$delegate.getValue() == null) {
                auraContextMenuItem2 = null;
            }
            AuraContextMenuItem auraContextMenuItem4 = new AuraContextMenuItem(5, this.$downloadLabel, null, this.$downloadIcon, new B6A(this.$colors.primaryText), null, false, false, false, true, false, bs0, 1, 1);
            if (!C1BO.A0F(this.$canDownloadHtml$delegate)) {
                auraContextMenuItem4 = null;
            }
            AuraContextMenuItem auraContextMenuItem5 = new AuraContextMenuItem(3, this.$addShortcutLabel, null, this.$addShortcutIcon, new B6A(this.$colors.primaryText), null, false, false, false, true, false, bs0, 1, 1);
            if (!C1BO.A0F(this.$addShortcutSupported$delegate)) {
                auraContextMenuItem5 = null;
            }
            AuraContextMenuItem auraContextMenuItem6 = new AuraContextMenuItem(4, this.$addWidgetLabel, null, this.$addWidgetIcon, new B6A(this.$colors.primaryText), null, false, false, false, true, false, bs0, 1, 1);
            if (C1BO.A0F(this.$addWidgetSupported$delegate)) {
                auraContextMenuItem3 = auraContextMenuItem6;
            }
            AHH ahhA0C = AGI.A0C(BFI.A0F(new AuraContextMenuItem[]{auraContextMenuItem, auraContextMenuItem2, auraContextMenuItem4, auraContextMenuItem5, auraContextMenuItem3, new AuraContextMenuItem(2, this.$leaveLabel, null, this.$leaveIcon, null, null, false, false, false, true, true, bs0, 1, 1)}));
            AnonymousClass001.A1D(bfm);
            return ahhA0C;
        }
    }

    public static final void PeerSpaceMenuSheet(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, BRg bRg, BFM bfm, int i, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(peerSpaceMenuSheetKey, 0);
        bfm.AgG(-1582109302);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, peerSpaceMenuSheetKey) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$addShortcutSupported$2$1(contextA0H, null);
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA01 = C3UV.A01(bfm, false, contextA0H, (G0V) objAaT2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120548);
            boolean zA672 = bfm.A67(contextA0H);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$addWidgetSupported$2$1(contextA0H, null);
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA012 = C3UV.A01(bfm, false, contextA0H, (G0V) objAaT3);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = peerSpaceMenuSheetKey.hostMuse;
            String str3 = peerSpaceMenuSheetKey.spaceId;
            String strA0j = FGI.A0j("peer-space-members:", str, ":", str2, ":", str3);
            PeerSpaceMembersViewModel.Factory factory = new PeerSpaceMembersViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PeerSpaceMembersViewModel peerSpaceMembersViewModel = (PeerSpaceMembersViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), PeerSpaceMembersViewModel.class, strA0j);
            C1BO c1boA02 = C2CK.A02(bfm, peerSpaceMembersViewModel.state);
            C1BO c1boA022 = C2CK.A02(bfm, peerSpaceMembersViewModel.moveToLibrary);
            C1BO c1boA023 = C2CK.A02(bfm, peerSpaceMembersViewModel.iconUrl);
            C1BO c1boA024 = C2CK.A02(bfm, peerSpaceMembersViewModel.canDownloadHtml);
            Object[] objArr = new Object[0];
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$confirmLeave$2$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT4, objArr);
            Object[] objArr2 = new Object[0];
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$confirmMove$2$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            MutableState mutableStateA0K2 = AnonymousClass006.A0K(bfm, objAaT5, objArr2);
            PeerSpaceMembersState peerSpaceMembersState = (PeerSpaceMembersState) c1boA02.getValue();
            PeerSpaceMembersState.Loaded loaded = peerSpaceMembersState instanceof PeerSpaceMembersState.Loaded ? (PeerSpaceMembersState.Loaded) peerSpaceMembersState : null;
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df5);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120556);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120547);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120549);
            String strA016 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120230);
            String strA017 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df0);
            AVy aVyA00 = AbstractC8407FdO.A00(bfm, R.drawable.users2_outline_24_wght600);
            AVy aVyA002 = AbstractC8407FdO.A00(bfm, R.drawable.folderarrowright_outline_24_wght400);
            AVy aVyA003 = AbstractC8407FdO.A00(bfm, R.drawable.house_wght400_outline_24);
            AVy aVyA004 = AbstractC8407FdO.A00(bfm, R.drawable.grid4outlier_wght400_outline_24);
            AVy aVyA005 = AbstractC8407FdO.A00(bfm, R.drawable.arrowdownload_outline_24_wght400);
            AVy aVyA006 = AbstractC8407FdO.A00(bfm, R.drawable.trash_wght400_outline_24);
            bfm.AgE(11463211);
            String strA018 = peerSpaceMenuSheetKey.title;
            if (strA018.length() == 0) {
                strA018 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060a);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            String strA08 = C1BO.A08(c1boA023);
            long jA0N = AnonymousClass003.A0N(AnonymousClass002.A0F());
            boolean zA673 = bfm.A67(auraNavigatorA0b);
            Object objAaT6 = bfm.AaT();
            if (zA673 || objAaT6 == obj) {
                objAaT6 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT6);
            }
            Function0 function0 = (Function0) objAaT6;
            boolean zA1T = AnonymousClass005.A1T(bfm, c1boA023, strA01, mutableStateA0K, AnonymousClass005.A1V(bfm, c3ux, contextA0H, abstractC3358CGzA0h, AnonymousClass003.A1O(bfm, peerSpaceMenuSheetKey, mutableStateA0K2, bfm.A67(auraNavigatorA0b))));
            Object objAaT7 = bfm.AaT();
            if (zA1T || objAaT7 == obj) {
                objAaT7 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1(auraNavigatorA0b, peerSpaceMenuSheetKey, c3ux, contextA0H, mutableStateA0K2, abstractC3358CGzA0h, strA01, c1boA023, mutableStateA0K);
                bfm.Ai0(objAaT7);
            }
            G0U g0u = (G0U) objAaT7;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(strA012, aVyA00, auraColorsA0c, strA013, aVyA002, strA016, aVyA005, strA014, aVyA003, strA015, aVyA004, strA017, aVyA006, c1boA022, c1boA024, mutableStateA01, mutableStateA012);
            boolean zA674 = bfm.A67(loaded);
            Object objAaT8 = bfm.AaT();
            if (zA674 || objAaT8 == obj) {
                objAaT8 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$5$1(loaded);
                bfm.Ai0(objAaT8);
            }
            SpaceMenuPresentationKt.m2180SpaceMenuPresentationrSEfpyU(strA018, strA08, true, true, jA0N, function0, g0u, anonymousClass4, bRg2, null, (G0U) objAaT8, bfm, ((iA0T << 21) & 234881024) | 28032, 0, 512);
            ArtifactPlacementRequest artifactPlacementRequest = (ArtifactPlacementRequest) c1boA022.getValue();
            if (artifactPlacementRequest == null || !MutableState.A0A(mutableStateA0K2)) {
                bfm.AgE(359385667);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(359385668);
                ArtifactPlacement artifactPlacement = ArtifactPlacement.LIBRARY;
                boolean zA1V = AnonymousClass005.A1V(bfm, peerSpaceMembersViewModel, artifactPlacementRequest, auraNavigatorA0b, bfm.A65(mutableStateA0K2));
                Object objAaT9 = bfm.AaT();
                if (zA1V || objAaT9 == obj) {
                    objAaT9 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$7$1$1(peerSpaceMembersViewModel, artifactPlacementRequest, auraNavigatorA0b, mutableStateA0K2);
                    bfm.Ai0(objAaT9);
                }
                Function0 function02 = (Function0) objAaT9;
                boolean zA65 = bfm.A65(mutableStateA0K2);
                Object objAaT10 = bfm.AaT();
                if (zA65 || objAaT10 == obj) {
                    objAaT10 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$7$2$1(mutableStateA0K2);
                    bfm.Ai0(objAaT10);
                }
                Function0 function03 = (Function0) objAaT10;
                boolean zA652 = bfm.A65(mutableStateA0K2);
                Object objAaT11 = bfm.AaT();
                if (zA652 || objAaT11 == obj) {
                    objAaT11 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$7$3$1(mutableStateA0K2);
                    bfm.Ai0(objAaT11);
                }
                MoveSpacePlacementConfirmationDialogKt.MoveSpacePlacementConfirmationDialog(artifactPlacement, function02, function03, (Function0) objAaT11, null, bfm, 6, 16);
                BBI.A0R(bbi, false);
            }
            String str4 = peerSpaceMenuSheetKey.hostMuse;
            String str5 = peerSpaceMenuSheetKey.spaceId;
            boolean zA0A = MutableState.A0A(mutableStateA0K);
            boolean zA653 = bfm.A65(mutableStateA0K);
            Object objAaT12 = bfm.AaT();
            if (zA653 || objAaT12 == obj) {
                objAaT12 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$8$1(mutableStateA0K);
                bfm.Ai0(objAaT12);
            }
            Function0 function04 = (Function0) objAaT12;
            boolean zA1T2 = AnonymousClass004.A1T(bfm, auraNavigatorA0b, peerSpaceMenuSheetKey, bfm.A65(mutableStateA0K));
            Object objAaT13 = bfm.AaT();
            if (zA1T2 || objAaT13 == obj) {
                objAaT13 = new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$9$1(auraNavigatorA0b, mutableStateA0K, peerSpaceMenuSheetKey);
                bfm.Ai0(objAaT13);
            }
            PeerSpaceLeaveDialogKt.PeerSpaceLeaveDialog(str4, str5, zA0A, function04, (Function0) objAaT13, null, bfm, 0, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass10(peerSpaceMenuSheetKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ArtifactPlacementRequest access$PeerSpaceMenuSheet$lambda$5(C1BO c1bo) {
        return (ArtifactPlacementRequest) c1bo.getValue();
    }
}
