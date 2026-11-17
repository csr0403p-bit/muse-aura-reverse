package com.facebook.aura.explore.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.share.api.ShareableItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$IdeaListRow$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $category;
    public final /* synthetic */ AHD<String> $connectionIds;
    public final /* synthetic */ boolean $hideDivider;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ boolean $isColorIconEnabled;
    public final /* synthetic */ boolean $isCompleted;
    public final /* synthetic */ boolean $isDismissing;
    public final /* synthetic */ boolean $isPreparingShare;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<IdeaContextMenuAction, Unit> $onContextMenuAction;
    public final /* synthetic */ Function0<Unit> $onContextMenuDismiss;
    public final /* synthetic */ Function0<Unit> $onDismissed;
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
    public HatchIdeasTabScreenKt$IdeaListRow$4(String str, String str2, String str3, boolean z, boolean z2, float f, String str4, boolean z3, boolean z4, G0U<? super Boolean, Unit> g0u, G0U<? super IdeaFeedback, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super IdeaContextMenuAction, Unit> g0u3, Function0<Unit> function04, boolean z5, ShareableItem shareableItem, AHD<String> ahd, boolean z6, Function0<Unit> function05, BRg bRg, int i, int i2, int i3, int i4) {
        super(2);
        this.$title = str;
        this.$summary = str2;
        this.$category = str3;
        this.$isCompleted = z;
        this.$showDivider = z2;
        this.$topPadding = f;
        this.$iconUrl = str4;
        this.$isColorIconEnabled = z3;
        this.$hideDivider = z4;
        this.$onSwipingChange = g0u;
        this.$onFeedback = g0u2;
        this.$onClick = function0;
        this.$onLongPress = function02;
        this.$onContextMenuDismiss = function03;
        this.$onContextMenuAction = g0u3;
        this.$onShare = function04;
        this.$isPreparingShare = z5;
        this.$shareItem = shareableItem;
        this.$connectionIds = ahd;
        this.$isDismissing = z6;
        this.$onDismissed = function05;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchIdeasTabScreenKt.m771IdeaListRowKqXp_Ps(this.$title, this.$summary, this.$category, this.$isCompleted, this.$showDivider, this.$topPadding, this.$iconUrl, this.$isColorIconEnabled, this.$hideDivider, this.$onSwipingChange, this.$onFeedback, this.$onClick, this.$onLongPress, this.$onContextMenuDismiss, this.$onContextMenuAction, this.$onShare, this.$isPreparingShare, this.$shareItem, this.$connectionIds, this.$isDismissing, this.$onDismissed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
