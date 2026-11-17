package com.facebook.aura.explore.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C0v5;
import X.C1BO;
import X.C1YD;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$IdeaListRow$3$1$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ String $category;
    public final /* synthetic */ AHD<String> $connectionIds;
    public final /* synthetic */ C1BO<Float> $dividerAlpha;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ boolean $isColorIconEnabled;
    public final /* synthetic */ boolean $isCompleted;
    public final /* synthetic */ C00r $menuAnchorHeightPx$delegate;
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Function0<Unit> $onLongPress;
    public final /* synthetic */ boolean $showDivider;
    public final /* synthetic */ String $summary;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$IdeaListRow$3$1$1(Function0<Unit> function0, Function0<Unit> function02, float f, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, C1BO<Float> c1bo, AHD<String> ahd, MutableState<Boolean> mutableState, C00r c00r) {
        super(3);
        this.$onLongPress = function0;
        this.$onClick = function02;
        this.$topPadding = f;
        this.$title = str;
        this.$summary = str2;
        this.$category = str3;
        this.$isCompleted = z;
        this.$showDivider = z2;
        this.$iconUrl = str4;
        this.$isColorIconEnabled = z3;
        this.$dividerAlpha = c1bo;
        this.$connectionIds = ahd;
        this.$menuExpanded$delegate = mutableState;
        this.$menuAnchorHeightPx$delegate = c00r;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            String strA0i = AnonymousClass005.A0i(bfm);
            C1YD c1yd = new C1YD(0);
            boolean zA65 = bfm.A65(this.$onLongPress);
            Function0<Unit> function0 = this.$onLongPress;
            MutableState<Boolean> mutableState = this.$menuExpanded$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchIdeasTabScreenKt$IdeaListRow$3$1$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA03 = C0v5.A03(bRg, c1yd, strA0i, (Function0) objAaT, this.$onClick, true);
            float f = HatchIdeasTabScreenKt.IdeaRowHorizontalPadding;
            BRg bRgA0C = C3U4.A0C(bRgA03, f, this.$topPadding, f, 0.0f);
            String str = this.$title;
            String str2 = this.$summary;
            String str3 = this.$category;
            boolean z = this.$isCompleted;
            boolean z2 = this.$showDivider;
            String str4 = this.$iconUrl;
            boolean z3 = this.$isColorIconEnabled;
            C00r c00r = this.$menuAnchorHeightPx$delegate;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new HatchIdeasTabScreenKt$IdeaListRow$3$1$1$2$1(c00r);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA652 = bfm.A65(this.$dividerAlpha);
            C1BO<Float> c1bo = this.$dividerAlpha;
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == obj) {
                objAaT3 = new HatchIdeasTabScreenKt$IdeaListRow$3$1$1$3$1(c1bo);
                bfm.Ai0(objAaT3);
            }
            HatchIdeasTabScreenKt.IdeaRowContent(str, str2, str3, z, z2, false, str4, z3, bRgA0C, g0u, (Function0) objAaT3, this.$connectionIds, bfm, 805502976, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
