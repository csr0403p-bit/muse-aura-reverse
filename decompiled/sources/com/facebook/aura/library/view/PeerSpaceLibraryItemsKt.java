package com.facebook.aura.library.view;

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
import X.BBb;
import X.BFI;
import X.BFM;
import X.BRg;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.G0U;
import X.G0V;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spaces.menu.PeerSpaceLeaveDialogKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PeerSpaceLibraryItemsKt {
    public static final int MENU_LEAVE = 2;
    public static final int MENU_MOVE_TO_SPACES = 1;
    public static final int MENU_PIN = 0;
    public static final String PEER_SPACE_REF_PREFIX = "peer_space:";

    /* renamed from: com.facebook.aura.library.view.PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ArtifactFile $artifact;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onMoved;
        public final /* synthetic */ Function0<Unit> $onTogglePin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ArtifactFile artifactFile, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$artifact = artifactFile;
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onMoved = function02;
            this.$onTogglePin = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PeerSpaceLibraryItemsKt.PeerSpaceItemContextMenu(this.$artifact, this.$expanded, this.$onDismiss, this.$onMoved, this.$onTogglePin, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.library.view.PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHH<AuraContextMenuItem> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AHH<AuraContextMenuItem> ahh) {
            super(2);
            this.$items = ahh;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(593631588);
            AHH<AuraContextMenuItem> ahh = this.$items;
            AnonymousClass002.A19(bfm);
            return ahh;
        }
    }

    /* renamed from: com.facebook.aura.library.view.PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ArtifactFile $artifact;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onMoved;
        public final /* synthetic */ Function0<Unit> $onTogglePin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ArtifactFile artifactFile, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$artifact = artifactFile;
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onMoved = function02;
            this.$onTogglePin = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PeerSpaceLibraryItemsKt.PeerSpaceItemContextMenu(this.$artifact, this.$expanded, this.$onDismiss, this.$onMoved, this.$onTogglePin, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void PeerSpaceItemContextMenu(ArtifactFile artifactFile, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        C7384Etj.A0Y(artifactFile, 0);
        AnonymousClass002.A1B(function0, 2, function02);
        bfm.AgG(-1903561044);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(artifactFile, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            UnifiedArtifactsRepository unifiedArtifactsRepository = (UnifiedArtifactsRepository) objAaT;
            boolean zA652 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = PinnedItemsRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT2);
            }
            PinnedItemsRepository pinnedItemsRepository = (PinnedItemsRepository) objAaT2;
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT3, obj);
            View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120487);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120486);
            boolean z2 = artifactFile.isPinned;
            int i2 = R.string._name_removed__res_0x7f120558;
            if (z2) {
                i2 = R.string._name_removed__res_0x7f12055d;
            }
            String strA013 = AbstractC2271BQs.A01(bfm, i2);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120557);
            AVy aVyA00 = AbstractC8407FdO.A00(bfm, R.drawable.thumbpin_outline_24_wght400);
            AVy aVyA002 = AbstractC8407FdO.A00(bfm, R.drawable.sidebarchevronclosed_filled_24_wght500);
            String str = artifactFile.spaceId;
            ArtifactPlacementRequest artifactPlacementRequest = (str != null && HatchUtils.INSTANCE.isSidePanelSpacesEnabled() && artifactFile.placement == ArtifactPlacement.LIBRARY) ? new ArtifactPlacementRequest(artifactFile.artifactRef, str, ArtifactPlacement.SPACES) : null;
            boolean zA653 = bfm.A65(artifactFile.artifactRef);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == obj) {
                Object objPeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(C7BY.A0K(PEER_SPACE_REF_PREFIX, artifactFile.artifactRef));
                objAaT4 = null;
                if (HatchUtil.INSTANCE.isConnectionsTabEnabled()) {
                    objAaT4 = objPeerSpaceTargetFromItemKey;
                }
                bfm.Ai0(objAaT4);
            }
            ArtifactOpenTarget.PeerSpace peerSpace = (ArtifactOpenTarget.PeerSpace) objAaT4;
            Object[] objArr = new Object[0];
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$confirmLeave$2$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT5, objArr);
            AHH ahhA0C = AGI.A0C(BFI.A0F(new AuraContextMenuItem[]{function03 != null ? new AuraContextMenuItem(0, strA013, null, aVyA00, null, null, false, false, false, true, false, BRg.A00, 1, 1) : null, artifactPlacementRequest != null ? new AuraContextMenuItem(1, strA014, null, aVyA002, null, null, false, false, false, true, false, BRg.A00, 1, 1) : null, peerSpace != null ? new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df0), null, AbstractC8407FdO.A00(bfm, R.drawable.trash_wght400_outline_24), null, null, false, false, false, true, true, BRg.A00, 1, 1) : null}));
            if (peerSpace != null) {
                bfm.AgE(1763349000);
                String str2 = peerSpace.hostMuse;
                String str3 = peerSpace.spaceId;
                boolean zA0A = MutableState.A0A(mutableStateA0K);
                boolean zA654 = bfm.A65(mutableStateA0K);
                Object objAaT6 = bfm.AaT();
                if (zA654 || objAaT6 == obj) {
                    objAaT6 = new PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$1$1(mutableStateA0K);
                    bfm.Ai0(objAaT6);
                }
                Function0 function04 = (Function0) objAaT6;
                boolean zA655 = bfm.A65(mutableStateA0K);
                Object objAaT7 = bfm.AaT();
                if (zA655 || objAaT7 == obj) {
                    objAaT7 = new PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$2$1(mutableStateA0K);
                    bfm.Ai0(objAaT7);
                }
                PeerSpaceLeaveDialogKt.PeerSpaceLeaveDialog(str2, str3, zA0A, function04, (Function0) objAaT7, null, bfm, 0, 32);
            } else {
                bfm.AgE(1763577718);
            }
            AnonymousClass001.A1D(bfm);
            if (ahhA0C.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass6 = new AnonymousClass3(artifactFile, z, function0, function02, function03, i);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            int i3 = iA05 & 896;
            boolean zA1X = AnonymousClass005.A1X(bfm, strA012, view, AnonymousClass001.A1T(bfm, pinnedItemsRepository, AnonymousClass005.A1V(bfm, artifactPlacementRequest, c3ux, unifiedArtifactsRepository, AnonymousClass002.A1W(bfm, mutableStateA0K, AnonymousClass005.A1L(iA05), AnonymousClass003.A19(i3)))) | AnonymousClass006.A1X(iA05), bfm.A65(strA01));
            Object objAaT8 = bfm.AaT();
            if (zA1X || objAaT8 == obj) {
                objAaT8 = new PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1(function0, function03, artifactPlacementRequest, mutableStateA0K, c3ux, unifiedArtifactsRepository, pinnedItemsRepository, function02, strA01, strA012, view);
                bfm.Ai0(objAaT8);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, (G0U) objAaT8, function0, z, null, 0L, null, false, new AnonymousClass5(ahhA0C), false, null, null, null, false, bfm, i3 | ((iA05 << 6) & 7168), 0, 16113);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(artifactFile, z, function0, function02, function03, i);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final String peerSpaceSubtitle(String str, BFM bfm, int i) {
        String strA01;
        if (str != null) {
            bfm.AgE(-1370872077);
            strA01 = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c71);
        } else {
            bfm.AgE(-1370781371);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c70);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }
}
