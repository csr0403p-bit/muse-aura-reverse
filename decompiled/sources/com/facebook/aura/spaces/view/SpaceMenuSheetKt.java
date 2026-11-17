package com.facebook.aura.spaces.view;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C07C;
import X.C0861A6i;
import X.C1BO;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7353EnQ;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.localbrowser.ManagedBrowserDecoder;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SpaceMenuSheetKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.menu.SpaceContextMenuKt;
import com.facebook.aura.spaces.menu.SpaceMenuLogOrigin;
import com.facebook.aura.spaces.menu.SpaceRenameDialogKt;
import com.facebook.aura.spaces.model.AuraNavBarViewModel;
import com.facebook.aura.spaces.view.SpaceMenuViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SpaceMenuSheetKt {

    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuActions$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SpaceMenuViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDeleted;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ SpaceMenuState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(String str, SpaceMenuViewModel spaceMenuViewModel, SpaceMenuState spaceMenuState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$slug = str;
            this.$model = spaceMenuViewModel;
            this.$state = spaceMenuState;
            this.$onDeleted = function0;
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
            SpaceMenuSheetKt.SpaceMenuActions(this.$slug, this.$model, this.$state, this.$onDeleted, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuEffects$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SpaceMenuViewModel $model;
        public final /* synthetic */ Function0<Unit> $onDeleted;
        public final /* synthetic */ Function0<Unit> $onRenamed;
        public final /* synthetic */ String $slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, SpaceMenuViewModel spaceMenuViewModel, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$slug = str;
            this.$model = spaceMenuViewModel;
            this.$onDeleted = function0;
            this.$onRenamed = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceMenuSheetKt.SpaceMenuEffects(this.$slug, this.$model, this.$onDeleted, this.$onRenamed, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Integer $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Integer num) {
            super(3);
            this.$error = num;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, this.$error.intValue()), null, null, null, null, null, null, bfm, 0, 126);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C139722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SpaceMenuSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139722(SpaceMenuSheetKey spaceMenuSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = spaceMenuSheetKey;
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
            SpaceMenuSheetKt.SpaceMenuSheet(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SpaceMenuActions(String str, SpaceMenuViewModel spaceMenuViewModel, SpaceMenuState spaceMenuState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        InterfaceC7353EnQ interfaceC7353EnQ;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        BRg bRg2 = bRg;
        bfm.AgG(252404063);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(spaceMenuViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(spaceMenuState, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA0t = null;
            if (spaceMenuState.isShared) {
                bbiA0M = AnonymousClass002.A0M(bfm, -1117957058);
            } else {
                bfm.AgE(2042144262);
                strA0t = AnonymousClass001.A0t(bfm, spaceMenuState.title, R.string._name_removed__res_0x7f120226);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new SpaceMenuSheetKt$SpaceMenuActions$1$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            int i4 = iA0d & 14;
            int i5 = i4 | 3072 | (SpaceMenuViewModel.$stable << 3);
            int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            SpaceMenuEffects(str, spaceMenuViewModel, function0, (Function0) objAaT3, bfm, ((iA0d >> 3) & 896) | i5 | i6);
            String str2 = spaceMenuState.title;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new SpaceMenuSheetKt$SpaceMenuActions$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            Function0 function06 = (Function0) objAaT4;
            boolean z = spaceMenuState.isPinned;
            boolean z2 = spaceMenuState.canShare;
            boolean z3 = spaceMenuState.canDownloadHtml;
            boolean z4 = spaceMenuState.available;
            boolean z5 = !spaceMenuState.isShared;
            boolean z6 = spaceMenuState.isSaved;
            Integer num = spaceMenuState.audienceCount;
            SpaceConstructionStatus spaceConstructionStatus = spaceMenuState.constructionStatus;
            String str3 = spaceMenuState.imageUrl;
            if (spaceMenuState.showPin) {
                bfm.AgE(-1117188877);
                boolean z7 = i6 == 32 || ((iA0d & 64) != 0 && bfm.A67(spaceMenuViewModel));
                Object objAaT5 = bfm.AaT();
                if (z7 || objAaT5 == obj) {
                    objAaT5 = new SpaceMenuSheetKt$SpaceMenuActions$3$1(spaceMenuViewModel);
                    bfm.Ai0(objAaT5);
                }
                interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT5;
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-1117167426);
                BBI.A0R(bbiA0M, false);
                interfaceC7353EnQ = null;
            }
            if (spaceMenuState.isShared) {
                bfm.AgE(-1116990850);
                BBI.A0R(bbiA0M, false);
                function02 = null;
            } else {
                bfm.AgE(-1117110323);
                boolean z8 = (iA0d & 896) == 256 || ((iA0d & 512) != 0 && bfm.A67(spaceMenuState));
                Object objAaT6 = bfm.AaT();
                if (z8 || objAaT6 == obj) {
                    objAaT6 = new SpaceMenuSheetKt$SpaceMenuActions$4$1(spaceMenuState, mutableState2, mutableState);
                    bfm.Ai0(objAaT6);
                }
                function02 = (Function0) objAaT6;
                BBI.A0R(bbiA0M, false);
            }
            if (strA0t == null) {
                bfm.AgE(-1116928199);
                BBI.A0R(bbiA0M, false);
                function03 = null;
            } else {
                bfm.AgE(-1116928198);
                boolean zA1J = AnonymousClass003.A1J(bfm, strA0t, auraNavigatorA0b);
                Object objAaT7 = bfm.AaT();
                if (zA1J || objAaT7 == obj) {
                    objAaT7 = new SpaceMenuSheetKt$SpaceMenuActions$5$1$1(strA0t, auraNavigatorA0b);
                    bfm.Ai0(objAaT7);
                }
                function03 = (Function0) objAaT7;
                BBI.A0R(bbiA0M, false);
            }
            ArtifactPlacementRequest artifactPlacementRequest = spaceMenuState.toLibrary;
            if (artifactPlacementRequest == null) {
                bfm.AgE(-1116629576);
                BBI.A0R(bbiA0M, false);
                function04 = null;
            } else {
                bfm.AgE(-1116629575);
                boolean zA1T = AnonymousClass001.A1T(bfm, artifactPlacementRequest, i6 == 32 || ((iA0d & 64) != 0 && bfm.A67(spaceMenuViewModel)));
                Object objAaT8 = bfm.AaT();
                if (zA1T || objAaT8 == obj) {
                    objAaT8 = new SpaceMenuSheetKt$SpaceMenuActions$6$1$1(spaceMenuViewModel, artifactPlacementRequest);
                    bfm.Ai0(objAaT8);
                }
                function04 = (Function0) objAaT8;
                BBI.A0R(bbiA0M, false);
            }
            ArtifactPlacementRequest artifactPlacementRequest2 = spaceMenuState.toSpaces;
            if (artifactPlacementRequest2 == null) {
                bfm.AgE(-1116547240);
                BBI.A0R(bbiA0M, false);
                function05 = null;
            } else {
                bfm.AgE(-1116547239);
                boolean zA1T2 = AnonymousClass001.A1T(bfm, artifactPlacementRequest2, i6 == 32 || ((iA0d & 64) != 0 && bfm.A67(spaceMenuViewModel)));
                Object objAaT9 = bfm.AaT();
                if (zA1T2 || objAaT9 == obj) {
                    objAaT9 = new SpaceMenuSheetKt$SpaceMenuActions$7$1$1(spaceMenuViewModel, artifactPlacementRequest2);
                    bfm.Ai0(objAaT9);
                }
                function05 = (Function0) objAaT9;
                BBI.A0R(bbiA0M, false);
            }
            SpaceContextMenuKt.m2179SpaceContextMenuxDtEYtk(str, str2, true, function06, function0, bRg2, true, z, (Function0) interfaceC7353EnQ, z2, z3, z5, z6, num, spaceConstructionStatus, str3, z4, function02, function03, function04, function05, null, 0L, new SpaceMenuLogOrigin.SpacePage(spaceMenuState.spaceId), bfm, AnonymousClass004.A03(iA0d << 3, i4 | 1573248), 0, 0, ManagedBrowserDecoder.MAX_REQUEST_BYTES);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1116379033);
                String strA05 = MutableState.A05(mutableState2);
                Object objAaT10 = bfm.AaT();
                if (objAaT10 == obj) {
                    objAaT10 = new SpaceMenuSheetKt$SpaceMenuActions$8$1(mutableState2);
                    bfm.Ai0(objAaT10);
                }
                G0U g0u = (G0U) objAaT10;
                boolean z9 = i6 == 32 || ((iA0d & 64) != 0 && bfm.A67(spaceMenuViewModel));
                Object objAaT11 = bfm.AaT();
                if (z9 || objAaT11 == obj) {
                    objAaT11 = new SpaceMenuSheetKt$SpaceMenuActions$9$1(spaceMenuViewModel, mutableState2);
                    bfm.Ai0(objAaT11);
                }
                Function0 function07 = (Function0) objAaT11;
                Object objAaT12 = bfm.AaT();
                if (objAaT12 == obj) {
                    objAaT12 = new SpaceMenuSheetKt$SpaceMenuActions$10$1(mutableState);
                    bfm.Ai0(objAaT12);
                }
                SpaceRenameDialogKt.SpaceRenameDialog(strA05, g0u, function07, (Function0) objAaT12, null, new SpaceMenuLogOrigin.SpacePage(spaceMenuState.spaceId), bfm, 3120, 16);
            } else {
                bfm.AgE(-1116106109);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass11(str, spaceMenuViewModel, spaceMenuState, function0, bRg2, i, i2);
        }
    }

    public static final void SpaceMenuSheet(SpaceMenuSheetKey spaceMenuSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(spaceMenuSheetKey, 0);
        bfm.AgG(-1034602874);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, spaceMenuSheetKey) | i : i;
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
            SpaceMetadataViewModel spaceMetadataViewModelRememberSpaceMetadataModel = SpaceMetadataViewModelKt.rememberSpaceMetadataModel(spaceMenuSheetKey.slug, bfm, 0);
            int iHashCode = abstractC3358CGzA0h.hashCode();
            int iHashCode2 = spaceMetadataViewModelRememberSpaceMetadataModel.hashCode();
            StringBuilder sb = new StringBuilder("space-menu:");
            sb.append(iHashCode);
            sb.append(":");
            sb.append(iHashCode2);
            String strA0y = AnonymousClass006.A0y(spaceMenuSheetKey, ":", sb);
            SpaceMenuViewModel.Factory factory = new SpaceMenuViewModel.Factory(abstractC3358CGzA0h, spaceMenuSheetKey, spaceMetadataViewModelRememberSpaceMetadataModel.lookup);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SpaceMenuViewModel spaceMenuViewModel = (SpaceMenuViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SpaceMenuViewModel.class, strA0y);
            C1BO c1boA02 = C2CK.A02(bfm, spaceMenuViewModel.state);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1M = AnonymousClass003.A1M(bfm, spaceMenuSheetKey, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new SpaceMenuSheetKt$SpaceMenuSheet$onDeleted$1$1(spaceMenuSheetKey, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            Integer num = ((SpaceMenuState) c1boA02.getValue()).error;
            if (num != null) {
                bfm.AgE(-1167946111);
                AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass1(num), -84031266), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 2044);
            } else {
                bfm.AgE(-1167789003);
                SpaceMenuActions(spaceMenuSheetKey.slug, spaceMenuViewModel, (SpaceMenuState) c1boA02.getValue(), function0, bRg2, bfm, (SpaceMenuViewModel.$stable << 3) | (SpaceMenuState.$stable << 6) | (57344 & (iA0T << 9)), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139722(spaceMenuSheetKey, bRg2, i, i2);
        }
    }

    public static final void SpaceMenuEffects(String str, SpaceMenuViewModel spaceMenuViewModel, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(145488509);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(spaceMenuViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraNavBarViewModel.Factory factory = new AuraNavBarViewModel.Factory(abstractC3358CGzA0h);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            AuraNavBarViewModel auraNavBarViewModel = (AuraNavBarViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(AuraNavBarViewModel.class));
            View viewA0J = AnonymousClass001.A0J(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120486);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120487);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060b);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060d);
            Object[] objArr = {spaceMenuViewModel, viewA0J, strA01, strA012, strA013, strA014};
            boolean zA1S = AnonymousClass004.A1S(bfm, strA01, viewA0J, AnonymousClass005.A1T(bfm, strA012, strA013, strA014, AnonymousClass002.A1V(bfm, auraNavBarViewModel, AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass004.A1K(iA0d), (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(spaceMenuViewModel))), AnonymousClass004.A1M(iA0d)) | AnonymousClass001.A1L(iA0d)));
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new SpaceMenuSheetKt$SpaceMenuEffects$1$1(spaceMenuViewModel, function0, auraNavigatorA0b, function02, auraNavBarViewModel, str, strA012, strA013, strA014, strA01, viewA0J, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, spaceMenuViewModel, function0, function02, i);
        }
    }
}
