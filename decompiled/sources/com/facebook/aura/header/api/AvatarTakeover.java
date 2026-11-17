package com.facebook.aura.header.api;

import X.AWA;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1DG;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface AvatarTakeover {
    void Overlay(boolean z, BRg bRg, BFM bfm, int i);

    BRg avatarGestures(BRg bRg, BFM bfm, int i);

    BRg fullScreenStatus(BRg bRg, Function0<C1DG> function0, BFM bfm, int i);

    /* renamed from: getAvatarOverlap-D9Ej5fM, reason: not valid java name */
    float mo974getAvatarOverlapD9Ej5fM();

    AvatarFullScreen getFullScreen();

    /* renamed from: idleFraming-5oXFXW4, reason: not valid java name */
    BRg mo975idleFraming5oXFXW4(BRg bRg, AWA awa, float f, BFM bfm, int i);

    BRg idleViewport(BRg bRg, BFM bfm, int i);

    boolean isChromeHidden();

    boolean isEngaged();

    boolean isMediaVisible();

    boolean isVisible();

    void onIdleMediaShown(AvatarTakeoverIdleFrame avatarTakeoverIdleFrame);

    BRg portraitViewport(BRg bRg, float f, BFM bfm, int i);

    Integer rememberBackdropColor(BFM bfm, int i);

    AvatarTakeoverLayout rememberCompactLayout(boolean z, BFM bfm, int i);

    AvatarTakeoverIdleMedia rememberIdleMedia(boolean z, BFM bfm, int i);

    C1BO<Boolean> rememberIdlePreparation(boolean z, boolean z2, boolean z3, MutableState<Boolean> mutableState, BFM bfm, int i);

    Function0<Unit> rememberPanelToggle(BFM bfm, int i);

    /* renamed from: rememberTransition-TDGSqEk, reason: not valid java name */
    AvatarTakeoverTransition mo976rememberTransitionTDGSqEk(boolean z, AvatarTakeoverLayout avatarTakeoverLayout, float f, BFM bfm, int i);

    void updateVisibility(Object obj, boolean z);
}
