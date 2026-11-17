package com.facebook.aura.explore.view;

import X.AHD;
import X.AKQ;
import X.AXN;
import X.AYD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1Cd;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.share.api.ShareableItem;
import com.facebook.aura.share.view.ItemShareLogContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$IdeaListRow$3 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ String $category;
    public final /* synthetic */ AHD<String> $connectionIds;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C1BO<Float> $dividerAlpha;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ boolean $isColorIconEnabled;
    public final /* synthetic */ boolean $isCompleted;
    public final /* synthetic */ boolean $isPreparingShare;
    public final /* synthetic */ C00r $menuAnchorHeightPx$delegate;
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<IdeaContextMenuAction, Unit> $onContextMenuAction;
    public final /* synthetic */ Function0<Unit> $onContextMenuDismiss;
    public final /* synthetic */ G0U<IdeaFeedback, Unit> $onFeedback;
    public final /* synthetic */ Function0<Unit> $onLongPress;
    public final /* synthetic */ Function0<Unit> $onShare;
    public final /* synthetic */ G0U<Boolean, Unit> $onSwipingChange;
    public final /* synthetic */ ShareableItem $shareItem;
    public final /* synthetic */ boolean $showDivider;
    public final /* synthetic */ String $summary;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$IdeaListRow$3(BRg bRg, G0U<? super Boolean, Unit> g0u, G0U<? super IdeaFeedback, Unit> g0u2, boolean z, AXN axn, float f, G0U<? super IdeaContextMenuAction, Unit> g0u3, Function0<Unit> function0, boolean z2, ShareableItem shareableItem, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, String str, String str2, String str3, boolean z3, String str4, boolean z4, C1BO<Float> c1bo, AHD<String> ahd, MutableState<Boolean> mutableState, C00r c00r) {
        super(3);
        this.$modifier = bRg;
        this.$onSwipingChange = g0u;
        this.$onFeedback = g0u2;
        this.$isCompleted = z;
        this.$density = axn;
        this.$topPadding = f;
        this.$onContextMenuAction = g0u3;
        this.$onShare = function0;
        this.$isPreparingShare = z2;
        this.$shareItem = shareableItem;
        this.$onContextMenuDismiss = function02;
        this.$onLongPress = function03;
        this.$onClick = function04;
        this.$title = str;
        this.$summary = str2;
        this.$category = str3;
        this.$showDivider = z3;
        this.$iconUrl = str4;
        this.$isColorIconEnabled = z4;
        this.$dividerAlpha = c1bo;
        this.$connectionIds = ahd;
        this.$menuExpanded$delegate = mutableState;
        this.$menuAnchorHeightPx$delegate = c00r;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
            BRg bRg = this.$modifier;
            G0U<Boolean, Unit> g0u = this.$onSwipingChange;
            G0U<IdeaFeedback, Unit> g0u2 = this.$onFeedback;
            boolean z = this.$isCompleted;
            AXN axn = this.$density;
            float f = this.$topPadding;
            G0U<IdeaContextMenuAction, Unit> g0u3 = this.$onContextMenuAction;
            Function0<Unit> function0 = this.$onShare;
            boolean z2 = this.$isPreparingShare;
            ShareableItem shareableItem = this.$shareItem;
            Function0<Unit> function02 = this.$onContextMenuDismiss;
            Function0<Unit> function03 = this.$onLongPress;
            Function0<Unit> function04 = this.$onClick;
            String str = this.$title;
            String str2 = this.$summary;
            String str3 = this.$category;
            boolean z3 = this.$showDivider;
            String str4 = this.$iconUrl;
            boolean z4 = this.$isColorIconEnabled;
            C1BO<Float> c1bo = this.$dividerAlpha;
            AHD<String> ahd = this.$connectionIds;
            MutableState<Boolean> mutableState = this.$menuExpanded$delegate;
            C00r c00r = this.$menuAnchorHeightPx$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            IdeaSwipeActionsKt.IdeaRowSwipeContainer(g0u, g0u2, null, B1V.A00(bfm, new HatchIdeasTabScreenKt$IdeaListRow$3$1$1(function03, function04, f, str, str2, str3, z, z3, str4, z4, c1bo, ahd, mutableState, c00r), 943707413), bfm, 3072, 4);
            if (c00r.AGd() > 0) {
                bfm.AgE(-1654508533);
                boolean zA0A = MutableState.A0A((MutableState) mutableState);
                boolean z5 = !z;
                ItemShareLogContext itemShareLogContext = new ItemShareLogContext(HatchSurface.IDEAS, HatchSubsurface.DOT_MENU, HatchScreen.IDEAS_HOME);
                BRg bRgA012 = AYD.A01(C10G.A04(C10G.A02, axn.Agy(c00r.AGd())), 0.0f, f);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = new HatchIdeasTabScreenKt$IdeaListRow$3$1$3$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                Function0 function06 = (Function0) objAaT;
                boolean zA65 = bfm.A65(function02);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new HatchIdeasTabScreenKt$IdeaListRow$3$1$4$1(function02, mutableState);
                    bfm.Ai0(objAaT2);
                }
                IdeaContextMenuKt.IdeaContextMenu(zA0A, z5, function06, g0u3, itemShareLogContext, bRgA012, false, function0, z2, shareableItem, (Function0) objAaT2, bfm, (ItemShareLogContext.$stable << 12) | 384, 0, 64);
            } else {
                bfm.AgE(-1653680864);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
