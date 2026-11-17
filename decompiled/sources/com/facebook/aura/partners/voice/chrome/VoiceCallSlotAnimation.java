package com.facebook.aura.partners.voice.chrome;

import X.AOP;
import X.ATD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C1BO;

/* loaded from: classes2.dex */
public final class VoiceCallSlotAnimation {
    public static final int $stable = 0;
    public final C1BO<Float> collapseProgress;
    public final boolean collapsingWithAvatar;
    public final C1BO<Float> heightState;
    public final float initialCollapse;
    public final float initialHeight;
    public final float initialWidth;
    public final C1BO<Float> revealState;
    public final AOP<Boolean> transition;
    public final C1BO<Float> widthState;

    private final float followCollapse(C1BO<Float> c1bo, float f) {
        C1BO<Float> c1bo2 = this.collapseProgress;
        if (c1bo2 == null) {
            return C1BO.A01(c1bo);
        }
        if (this.initialCollapse > 0.0f) {
            return f * ATD.A03(C1BO.A01(c1bo2) / this.initialCollapse, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final boolean getCollapsingWithAvatar() {
        return this.collapsingWithAvatar;
    }

    public final boolean getEntering() {
        return AnonymousClass001.A1X(this.transition.A07.getValue());
    }

    public final float getHeightProgress() {
        return followCollapse(this.heightState, this.initialHeight);
    }

    public final boolean getShowsCall() {
        return AnonymousClass001.A1X(this.transition.A02.A09()) || this.transition.A0F();
    }

    public final boolean getTurning() {
        return this.transition.A0F() || AnonymousClass001.A1X(this.transition.A02.A09()) != AnonymousClass001.A1X(this.transition.A07.getValue());
    }

    public final float getWidthProgress() {
        return followCollapse(this.widthState, this.initialWidth);
    }

    public VoiceCallSlotAnimation(AOP<Boolean> aop, C1BO<Float> c1bo, C1BO<Float> c1bo2, C1BO<Float> c1bo3, C1BO<Float> c1bo4) {
        AnonymousClass005.A14(aop, c1bo, c1bo2, c1bo3);
        this.transition = aop;
        this.widthState = c1bo;
        this.heightState = c1bo2;
        this.revealState = c1bo3;
        this.collapseProgress = c1bo4;
        this.initialCollapse = c1bo4 != null ? C1BO.A01(c1bo4) : 0.0f;
        this.initialWidth = C1BO.A01(c1bo);
        this.initialHeight = C1BO.A01(c1bo2);
        this.collapsingWithAvatar = AnonymousClass002.A1X(c1bo4);
    }

    public final float getHangUpFill() {
        return AnonymousClass003.A00((getWidthProgress() - 0.2f) / 0.3f);
    }

    public final float getRevealAlpha() {
        if (getEntering()) {
            return C1BO.A01(this.revealState);
        }
        return 1.0f;
    }

    public final boolean getTurnShown() {
        return getWidthProgress() > 0.0f || getHeightProgress() > 0.0f;
    }
}
