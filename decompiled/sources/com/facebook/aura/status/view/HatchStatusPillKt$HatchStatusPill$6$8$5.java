package com.facebook.aura.status.view;

import X.AOW;
import X.AT5;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1003AOr;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import X.InterfaceC05151eP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.status.viewmodel.HatchPillState;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import com.facebook.aura.status.viewmodel.HatchStatusPillViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$8$5 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ String $avatarContentDescription;
    public final /* synthetic */ C3UX $avatarScope;
    public final /* synthetic */ AT5<Float, AOW> $avatarSizePx;
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
    public final /* synthetic */ C1003AOr<Float> $milestoneSpring;
    public final /* synthetic */ Function0<Unit> $onAvatarClick;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ float $panelProgress;
    public final /* synthetic */ float $restingAvatarSizePx;
    public final /* synthetic */ AvatarTakeover $takeover;
    public final /* synthetic */ C1BO<Float> $takeoverFramingFraction;
    public final /* synthetic */ boolean $takeoverHoldsAvatar;
    public final /* synthetic */ AvatarTakeoverIdleMedia $takeoverIdleMedia;
    public final /* synthetic */ InterfaceC05151eP $this_Box;
    public final /* synthetic */ C1BO<Boolean> $waitingForIdle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$8$5(AT5<Float, AOW> at5, boolean z, float f, float f2, boolean z2, C1BO<Float> c1bo, C1BO<Boolean> c1bo2, boolean z3, boolean z4, boolean z5, AvatarTakeover avatarTakeover, float f3, AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, MutableState<Boolean> mutableState, C3UX c3ux, HatchStatusPillViewModel hatchStatusPillViewModel, InterfaceC05151eP interfaceC05151eP, boolean z6, boolean z7, String str, Function0<Unit> function0, Function0<Unit> function02, C1BO<HatchStatusPillUiState> c1bo3, boolean z8, C1003AOr<Float> c1003AOr) {
        super(3);
        this.$avatarSizePx = at5;
        this.$isExpanded = z;
        this.$expandedAvatarSizePx = f;
        this.$restingAvatarSizePx = f2;
        this.$isCompactAvatar = z2;
        this.$takeoverFramingFraction = c1bo;
        this.$waitingForIdle = c1bo2;
        this.$isTakeoverAvatar = z3;
        this.$isHostVisible = z4;
        this.$isAvatarShown = z5;
        this.$takeover = avatarTakeover;
        this.$panelProgress = f3;
        this.$takeoverIdleMedia = avatarTakeoverIdleMedia;
        this.$idlePreparationFinished = mutableState;
        this.$avatarScope = c3ux;
        this.$headerViewModel = hatchStatusPillViewModel;
        this.$this_Box = interfaceC05151eP;
        this.$hasAvatarArea = z6;
        this.$consumeAvatarDragGestures = z7;
        this.$avatarContentDescription = str;
        this.$onAvatarClick = function0;
        this.$onClick = function02;
        this.$headerState$delegate = c1bo3;
        this.$takeoverHoldsAvatar = z8;
        this.$milestoneSpring = c1003AOr;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        float f;
        C1D3 c1d3A02;
        BRg bRgAvatarGestures;
        BRg bRgAQJ;
        BRg bRgIdleViewport = bRg;
        int iA0d = i;
        C7384Etj.A0Y(bRgIdleViewport, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRgIdleViewport);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AT5<Float, AOW> at5 = this.$avatarSizePx;
            if (this.$isExpanded) {
                f = this.$expandedAvatarSizePx;
            } else {
                f = this.$restingAvatarSizePx;
            }
            C1BO<Boolean> c1boRememberStatusPillAvatarTransitionComplete = HatchStatusPillKt.rememberStatusPillAvatarTransitionComplete(at5, f, this.$isCompactAvatar, this.$takeoverFramingFraction, this.$waitingForIdle, bfm, 8);
            HatchPillState hatchPillState = this.$headerState$delegate.getValue().pillState;
            AvatarMedia avatarMedia = this.$headerState$delegate.getValue().avatarMedia;
            boolean zA0F = C1BO.A0F(this.$waitingForIdle);
            boolean z2 = !this.$isTakeoverAvatar;
            String str = this.$headerState$delegate.getValue().milestoneVideoUrl;
            if (this.$takeoverHoldsAvatar) {
                str = null;
            }
            if (!this.$isHostVisible || !this.$isAvatarShown || (this.$isTakeoverAvatar && this.$takeover.isMediaVisible())) {
                z = false;
            }
            float f2 = this.$panelProgress;
            if (f2 > 0.0f) {
                c1d3A02 = C1D8.A02(Ab3.A01((1.0f - f2) * 50.0f));
            } else {
                c1d3A02 = C1D8.A00;
            }
            if (this.$takeoverIdleMedia != null) {
                bfm.AgE(221963374);
                bRgIdleViewport = this.$takeover.idleViewport(bRgIdleViewport, bfm, iA0d & 14);
            } else {
                bfm.AgE(222057552);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            AvatarTakeoverIdleMedia avatarTakeoverIdleMedia = this.$takeoverIdleMedia;
            boolean z3 = this.$isTakeoverAvatar;
            boolean zA1W = AnonymousClass004.A1W(bfm, c1boRememberStatusPillAvatarTransitionComplete, this.$isTakeoverAvatar, bfm.A65(this.$takeoverIdleMedia) | bfm.A65(this.$waitingForIdle));
            C1BO<Boolean> c1bo = this.$waitingForIdle;
            AvatarTakeoverIdleMedia avatarTakeoverIdleMedia2 = this.$takeoverIdleMedia;
            boolean z4 = this.$isTakeoverAvatar;
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchStatusPillKt$HatchStatusPill$6$8$5$3$1(c1bo, avatarTakeoverIdleMedia2, z4, c1boRememberStatusPillAvatarTransitionComplete);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA65 = bfm.A65(this.$idlePreparationFinished);
            MutableState<Boolean> mutableState = this.$idlePreparationFinished;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchStatusPillKt$HatchStatusPill$6$8$5$4$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$takeoverFramingFraction, bfm.A66(this.$isCompactAvatar));
            boolean z5 = this.$isCompactAvatar;
            C1BO<Float> c1bo2 = this.$takeoverFramingFraction;
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == C78N.A00) {
                objAaT3 = new HatchStatusPillKt$HatchStatusPill$6$8$5$5$1(z5, c1bo2);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            boolean z6 = this.$isExpanded;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$avatarSizePx, AnonymousClass001.A1T(bfm, this.$avatarScope, bfm.A66(z6))) | bfm.A62(this.$restingAvatarSizePx);
            boolean z7 = this.$isExpanded;
            C3UX c3ux = this.$avatarScope;
            AT5<Float, AOW> at52 = this.$avatarSizePx;
            float f3 = this.$restingAvatarSizePx;
            C1003AOr<Float> c1003AOr = this.$milestoneSpring;
            Object objAaT4 = bfm.AaT();
            if (zA1T || objAaT4 == C78N.A00) {
                objAaT4 = new HatchStatusPillKt$HatchStatusPill$6$8$5$6$1(z7, c3ux, at52, f3, c1003AOr);
                bfm.Ai0(objAaT4);
            }
            Function0 function04 = (Function0) objAaT4;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$headerViewModel, AnonymousClass001.A1T(bfm, this.$avatarSizePx, AnonymousClass001.A1U(bfm, this.$isExpanded, bfm.A67(this.$avatarScope))) | bfm.A62(this.$restingAvatarSizePx));
            C3UX c3ux2 = this.$avatarScope;
            boolean z8 = this.$isExpanded;
            AT5<Float, AOW> at53 = this.$avatarSizePx;
            float f4 = this.$restingAvatarSizePx;
            C1003AOr<Float> c1003AOr2 = this.$milestoneSpring;
            HatchStatusPillViewModel hatchStatusPillViewModel = this.$headerViewModel;
            Object objAaT5 = bfm.AaT();
            if (zA1T2 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchStatusPillKt$HatchStatusPill$6$8$5$7$1(c3ux2, z8, at53, f4, c1003AOr2, hatchStatusPillViewModel);
                bfm.Ai0(objAaT5);
            }
            HatchAnimatedBotAvatarKt.HatchAnimatedBotAvatar(hatchPillState, bRgIdleViewport, avatarMedia, avatarTakeoverIdleMedia, z3, function0, function02, zA0F, str, z, z2, z2, false, true, function03, z6, c1d3A02, function04, (Function0) objAaT5, false, bfm, AvatarMedia.$stable << 6, 3072, 528384);
            if (this.$isAvatarShown && this.$takeover != null) {
                bfm.AgE(222181924);
                HatchStatusPillKt.StatusPillAvatarOverlay(this.$takeover, c1boRememberStatusPillAvatarTransitionComplete, this.$panelProgress, this.$this_Box.AQJ(BRg.A00), bfm, 0, 0);
            } else {
                bfm.AgE(222431784);
            }
            BBI.A0R(bbi, false);
            if (!this.$isExpanded && this.$isAvatarShown && this.$hasAvatarArea) {
                bfm.AgE(222687968);
                boolean z9 = this.$isTakeoverAvatar;
                boolean z10 = this.$consumeAvatarDragGestures;
                String str2 = this.$avatarContentDescription;
                Function0<Unit> function05 = this.$onAvatarClick;
                Function0<Unit> function06 = this.$onClick;
                AvatarTakeover avatarTakeover = this.$takeover;
                if (avatarTakeover != null && z9 && avatarTakeover.getFullScreen().getActive()) {
                    bfm.AgE(223089325);
                    AvatarTakeover avatarTakeover2 = this.$takeover;
                    InterfaceC05151eP interfaceC05151eP = this.$this_Box;
                    float f5 = this.$panelProgress;
                    bRgAvatarGestures = BRg.A00;
                    bRgAQJ = avatarTakeover2.portraitViewport(interfaceC05151eP.AQJ(bRgAvatarGestures), f5, bfm, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(223215712);
                    BBI.A0R(bbi, false);
                    InterfaceC05151eP interfaceC05151eP2 = this.$this_Box;
                    bRgAvatarGestures = BRg.A00;
                    bRgAQJ = interfaceC05151eP2.AQJ(bRgAvatarGestures);
                }
                if (this.$takeover != null && this.$isTakeoverAvatar && this.$consumeAvatarDragGestures) {
                    bfm.AgE(223414670);
                    bRgAvatarGestures = this.$takeover.avatarGestures(bRgAvatarGestures, bfm, 6);
                } else {
                    bfm.AgE(223508786);
                }
                BBI.A0R(bbi, false);
                HatchStatusPillKt.StatusPillAvatarInteractionTarget(z9, z10, str2, function05, function06, bRgAQJ, bRgAvatarGestures, bfm, 0, 0);
            } else {
                bfm.AgE(223587464);
            }
            BBI.A0R(bbi, false);
            return;
        }
        bfm.Afo();
    }
}
