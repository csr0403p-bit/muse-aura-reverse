package com.facebook.aura.status.view;

import X.AOW;
import X.AT5;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.C1003AOr;
import X.C1BO;
import X.C1DG;
import X.C3UX;
import X.G0V;
import X.InterfaceC05151eP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.header.api.AvatarTakeoverTransition;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import com.facebook.aura.status.viewmodel.HatchStatusPillViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $applyStatusBarPadding;
    public final /* synthetic */ C1BO<Float> $avatarAlpha$delegate;
    public final /* synthetic */ MutableState<AaC> $avatarBounds$delegate;
    public final /* synthetic */ float $avatarClipBottom;
    public final /* synthetic */ String $avatarContentDescription;
    public final /* synthetic */ float $avatarOffsetY;
    public final /* synthetic */ C3UX $avatarScope;
    public final /* synthetic */ float $avatarSizeDp;
    public final /* synthetic */ AT5<Float, AOW> $avatarSizePx;
    public final /* synthetic */ boolean $canOwnPanel;
    public final /* synthetic */ boolean $consumeAvatarDragGestures;
    public final /* synthetic */ float $expandedAvatarSizePx;
    public final /* synthetic */ boolean $hasAvatarArea;
    public final /* synthetic */ C1BO<HatchStatusPillUiState> $headerState$delegate;
    public final /* synthetic */ HatchStatusPillViewModel $headerViewModel;
    public final /* synthetic */ MutableState<Boolean> $idlePreparationFinished;
    public final /* synthetic */ boolean $isAvatarShown;
    public final /* synthetic */ boolean $isCompactAvatar;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ boolean $isHostVisible;
    public final /* synthetic */ boolean $isTakeoverAvatar;
    public final /* synthetic */ boolean $keepAvatarPlayerWarm;
    public final /* synthetic */ float $mediaAvatarScale;
    public final /* synthetic */ float $mediaAvatarSizeDp;
    public final /* synthetic */ C1003AOr<Float> $milestoneSpring;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onAvatarClick;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ StatusPillAvatarPanel $panel;
    public final /* synthetic */ Function0<C1DG> $panelMediaOffset;
    public final /* synthetic */ float $panelProgress;
    public final /* synthetic */ int $parkedOffsetPx;
    public final /* synthetic */ float $restingAvatarSizePx;
    public final /* synthetic */ AvatarTakeover $takeover;
    public final /* synthetic */ C1BO<Float> $takeoverFramingFraction;
    public final /* synthetic */ boolean $takeoverHoldsAvatar;
    public final /* synthetic */ AvatarTakeoverIdleMedia $takeoverIdleMedia;
    public final /* synthetic */ AvatarTakeoverTransition $takeoverTransition;
    public final /* synthetic */ InterfaceC05151eP $this_HatchStatusPill;
    public final /* synthetic */ C1BO<Boolean> $waitingForIdle;
    public final /* synthetic */ boolean $wrapContent;

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6(boolean z, boolean z2, BRg bRg, boolean z3, boolean z4, boolean z5, boolean z6, AvatarTakeoverTransition avatarTakeoverTransition, boolean z7, C1BO<Float> c1bo, float f, AvatarTakeover avatarTakeover, InterfaceC05151eP interfaceC05151eP, C1BO<HatchStatusPillUiState> c1bo2, float f2, Function0<C1DG> function0, float f3, float f4, float f5, boolean z8, boolean z9, float f6, StatusPillAvatarPanel statusPillAvatarPanel, MutableState<AaC> mutableState, int i, AT5<Float, AOW> at5, float f7, float f8, C1BO<Float> c1bo3, C1BO<Boolean> c1bo4, boolean z10, AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, MutableState<Boolean> mutableState2, C3UX c3ux, HatchStatusPillViewModel hatchStatusPillViewModel, boolean z11, String str, Function0<Unit> function02, Function0<Unit> function03, boolean z12, C1003AOr<Float> c1003AOr) {
        super(2);
        this.$isAvatarShown = z;
        this.$keepAvatarPlayerWarm = z2;
        this.$modifier = bRg;
        this.$wrapContent = z3;
        this.$canOwnPanel = z4;
        this.$isCompactAvatar = z5;
        this.$applyStatusBarPadding = z6;
        this.$takeoverTransition = avatarTakeoverTransition;
        this.$hasAvatarArea = z7;
        this.$avatarAlpha$delegate = c1bo;
        this.$panelProgress = f;
        this.$takeover = avatarTakeover;
        this.$this_HatchStatusPill = interfaceC05151eP;
        this.$headerState$delegate = c1bo2;
        this.$avatarOffsetY = f2;
        this.$panelMediaOffset = function0;
        this.$avatarClipBottom = f3;
        this.$avatarSizeDp = f4;
        this.$mediaAvatarSizeDp = f5;
        this.$isExpanded = z8;
        this.$isTakeoverAvatar = z9;
        this.$mediaAvatarScale = f6;
        this.$panel = statusPillAvatarPanel;
        this.$avatarBounds$delegate = mutableState;
        this.$parkedOffsetPx = i;
        this.$avatarSizePx = at5;
        this.$expandedAvatarSizePx = f7;
        this.$restingAvatarSizePx = f8;
        this.$takeoverFramingFraction = c1bo3;
        this.$waitingForIdle = c1bo4;
        this.$isHostVisible = z10;
        this.$takeoverIdleMedia = avatarTakeoverIdleMedia;
        this.$idlePreparationFinished = mutableState2;
        this.$avatarScope = c3ux;
        this.$headerViewModel = hatchStatusPillViewModel;
        this.$consumeAvatarDragGestures = z11;
        this.$avatarContentDescription = str;
        this.$onAvatarClick = function02;
        this.$onClick = function03;
        this.$takeoverHoldsAvatar = z12;
        this.$milestoneSpring = c1003AOr;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r46, int r47) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$6.invoke(X.BFM, int):void");
    }
}
