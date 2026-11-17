package com.facebook.aura.assist;

import X.AGE;
import X.AGF;
import X.AOP;
import X.AaC;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.C00r;
import X.C1BO;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class AssistVoicePresentation {
    public static final int $stable = 0;
    public final C00r capturedBottomInset$delegate;
    public final MutableState composerBounds$delegate;
    public final MutableState identityBounds$delegate;
    public final C00r inputBottomInset$delegate;
    public final C1BO<Float> progress;
    public final AOP<Boolean> transition;

    public final void setComposerBounds(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        this.composerBounds$delegate.Af8(aaC);
    }

    public final void setIdentityBounds(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        this.identityBounds$delegate.Af8(aaC);
    }

    public final void captureComposer() {
        setCapturedBottomInset(this.inputBottomInset$delegate.AGd());
    }

    public final int getCapturedBottomInset() {
        return this.capturedBottomInset$delegate.AGd();
    }

    public final AaC getComposerBounds() {
        return (AaC) this.composerBounds$delegate.getValue();
    }

    public final AaC getIdentityBounds() {
        return (AaC) this.identityBounds$delegate.getValue();
    }

    public final int getInputBottomInset() {
        return this.inputBottomInset$delegate.AGd();
    }

    public final C1BO<Float> getProgress() {
        return this.progress;
    }

    public final boolean getShowingVoice() {
        return AnonymousClass001.A1X(this.transition.A02.A09()) || AnonymousClass001.A1X(this.transition.A07.getValue());
    }

    public final AOP<Boolean> getTransition() {
        return this.transition;
    }

    public final boolean isVoice() {
        return AnonymousClass001.A1X(this.transition.A07.getValue());
    }

    public final void setCapturedBottomInset(int i) {
        this.capturedBottomInset$delegate.AdX(i);
    }

    public final void setInputBottomInset(int i) {
        this.inputBottomInset$delegate.AdX(i);
    }

    public AssistVoicePresentation(AOP<Boolean> aop, C1BO<Float> c1bo) {
        boolean zA1b = AnonymousClass004.A1b(aop, c1bo);
        this.transition = aop;
        this.progress = c1bo;
        AaC aaC = AaC.A04;
        AGE ageA01 = AGF.A01();
        this.identityBounds$delegate = new ParcelableSnapshotMutableState(ageA01, aaC);
        this.composerBounds$delegate = new ParcelableSnapshotMutableState(ageA01, aaC);
        this.inputBottomInset$delegate = new ParcelableSnapshotMutableIntState(zA1b ? 1 : 0);
        this.capturedBottomInset$delegate = new ParcelableSnapshotMutableIntState(zA1b ? 1 : 0);
    }
}
