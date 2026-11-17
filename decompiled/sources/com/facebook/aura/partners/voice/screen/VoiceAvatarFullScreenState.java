package com.facebook.aura.partners.voice.screen;

import X.AGE;
import X.AGF;
import X.AOW;
import X.AT5;
import X.AT8;
import X.AaC;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.api.AvatarFullScreenSource;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes2.dex */
public final class VoiceAvatarFullScreenState implements AvatarFullScreen {
    public static final int $stable = 0;
    public final MutableState destination$delegate;
    public Object dragOwner;
    public final MutableState dragProgress$delegate;
    public final MutableState enteredFromHalfScreen$delegate;
    public final MutableState expanded$delegate;
    public final MutableState interactive$delegate;
    public final AT5<Float, AOW> progressAnimatable = AT8.A00(0.0f);
    public final MutableState settleVelocity$delegate;
    public final MutableState source$delegate;
    public final MutableState statusTopPx$delegate;

    public final void collapse(HatchStatusPillMetrics hatchStatusPillMetrics, boolean z) {
        C7384Etj.A0Y(hatchStatusPillMetrics, 0);
        if (getActive() && z) {
            hatchStatusPillMetrics.setAvatarExpanded(false);
        }
        setExpanded(false);
    }

    public final void collapseToAvatar(HatchStatusPillMetrics hatchStatusPillMetrics) {
        C7384Etj.A0Y(hatchStatusPillMetrics, 0);
        hatchStatusPillMetrics.setAvatarExpanded(false);
        setExpanded(false);
    }

    public final void expand(HatchStatusPillMetrics hatchStatusPillMetrics) {
        C7384Etj.A0Y(hatchStatusPillMetrics, 0);
        if (open(hatchStatusPillMetrics)) {
            setEnteredFromHalfScreen(false);
        }
    }

    public final boolean expandFromHalfScreen(HatchStatusPillMetrics hatchStatusPillMetrics) {
        C7384Etj.A0Y(hatchStatusPillMetrics, 0);
        if (getExpanded() || ((getActive() && !getEnteredFromHalfScreen()) || !open(hatchStatusPillMetrics))) {
            return false;
        }
        setEnteredFromHalfScreen(true);
        return true;
    }

    public final void finishCollapse() {
        setExpanded(false);
        setSource(null);
        setEnteredFromHalfScreen(false);
    }

    private void setEnteredFromHalfScreen(boolean z) {
        MutableState.A09(z, this.enteredFromHalfScreen$delegate);
    }

    private void setExpanded(boolean z) {
        MutableState.A09(z, this.expanded$delegate);
    }

    private void setSource(AvatarFullScreenSource avatarFullScreenSource) {
        this.source$delegate.Af8(avatarFullScreenSource);
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public AaC getDestination() {
        return (AaC) this.destination$delegate.getValue();
    }

    public final Object getDragOwner() {
        return this.dragOwner;
    }

    public final Float getDragProgress() {
        return (Float) this.dragProgress$delegate.getValue();
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public boolean getEnteredFromHalfScreen() {
        return MutableState.A0A(this.enteredFromHalfScreen$delegate);
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public boolean getExpanded() {
        return MutableState.A0A(this.expanded$delegate);
    }

    public final boolean getInteractive() {
        return MutableState.A0A(this.interactive$delegate);
    }

    public final AT5<Float, AOW> getProgressAnimatable() {
        return this.progressAnimatable;
    }

    public final Float getSettleVelocity() {
        return (Float) this.settleVelocity$delegate.getValue();
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public AvatarFullScreenSource getSource() {
        return (AvatarFullScreenSource) this.source$delegate.getValue();
    }

    public final float getStatusTopPx() {
        return AnonymousClass001.A02(this.statusTopPx$delegate.getValue());
    }

    public void setDestination(AaC aaC) {
        this.destination$delegate.Af8(aaC);
    }

    public final void setDragOwner(Object obj) {
        this.dragOwner = obj;
    }

    public final void setDragProgress(Float f) {
        this.dragProgress$delegate.Af8(f);
    }

    public final void setInteractive(boolean z) {
        MutableState.A09(z, this.interactive$delegate);
    }

    public final void setSettleVelocity(Float f) {
        this.settleVelocity$delegate.Af8(f);
    }

    public final void setStatusTopPx(float f) {
        this.statusTopPx$delegate.Af8(Float.valueOf(f));
    }

    public VoiceAvatarFullScreenState() {
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE ageA01 = AGF.A01();
        this.expanded$delegate = C3cG.A08(ageA01, boolA0h);
        this.source$delegate = C3cG.A08(ageA01, null);
        this.destination$delegate = C3cG.A08(ageA01, null);
        this.statusTopPx$delegate = C3cG.A08(ageA01, Float.valueOf(0.0f));
        this.enteredFromHalfScreen$delegate = C3cG.A08(ageA01, boolA0h);
        this.interactive$delegate = C3cG.A08(ageA01, boolA0h);
        this.settleVelocity$delegate = C3cG.A08(ageA01, null);
        this.dragProgress$delegate = C3cG.A08(ageA01, null);
    }

    private final boolean open(HatchStatusPillMetrics hatchStatusPillMetrics) {
        if (getDestination() == null) {
            return false;
        }
        if (getSource() == null) {
            AaC avatarBoundsInWindow = hatchStatusPillMetrics.getAvatarBoundsInWindow();
            if (avatarBoundsInWindow == null || avatarBoundsInWindow.A02 - avatarBoundsInWindow.A01 <= 0.0f || avatarBoundsInWindow.A00 - avatarBoundsInWindow.A03 <= 0.0f) {
                return false;
            }
            setSource(new AvatarFullScreenSource(avatarBoundsInWindow, hatchStatusPillMetrics.getPillBoundsInWindow()));
        }
        setExpanded(true);
        return true;
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public boolean getActive() {
        return getSource() != null;
    }

    public final float getAspectRatio() {
        AaC destination = getDestination();
        if (destination != null) {
            return (destination.A02 - destination.A01) / (destination.A00 - destination.A03);
        }
        return 0.5833333f;
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public float getEdgeProgress() {
        Number dragProgress = getDragProgress();
        if (dragProgress == null) {
            dragProgress = (Number) this.progressAnimatable.A04.getValue();
        }
        return dragProgress.floatValue();
    }

    @Override // com.facebook.aura.header.api.AvatarFullScreen
    public float getProgress() {
        return AnonymousClass003.A00(getEdgeProgress());
    }
}
