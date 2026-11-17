package com.facebook.aura.partners.voice.screen;

import X.AGE;
import X.AGF;
import X.AaC;
import X.AnonymousClass001;
import X.C1518AkS;
import X.C3cG;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverState {
    public static final int $stable = 0;
    public final MutableState backdropColor$delegate;
    public final MutableState captionBounds$delegate;
    public final MutableState dragHandleMeasurement$delegate;
    public final MutableState dragHandleToneSource$delegate;
    public final MutableState halfScreenMediaBounds$delegate;
    public final MutableState isMediaVisible$delegate;
    public final MutableState isStatusFocusPending$delegate;
    public final MutableState isVisible$delegate;
    public int statusFocusTargets;
    public final Set<Object> visibleOwners;
    public final VoiceAvatarFullScreenState fullScreen = new VoiceAvatarFullScreenState();
    public final C1518AkS statusFocus = new C1518AkS();

    public final void focusStatus() {
        setStatusFocusPending$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(false);
        if (this.statusFocusTargets > 0) {
            C1518AkS.A00(this.statusFocus);
        }
    }

    public final void updateVisibility(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        Set<Object> set = this.visibleOwners;
        if (z) {
            set.add(obj);
        } else {
            set.remove(obj);
        }
        setVisible(!this.visibleOwners.isEmpty());
    }

    private final void setVisible(boolean z) {
        MutableState.A09(z, this.isVisible$delegate);
    }

    public final void focusStatusWhenCallStarts() {
        if (this.statusFocusTargets > 0) {
            setStatusFocusPending$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(true);
        }
    }

    public final Integer getBackdropColor() {
        return (Integer) this.backdropColor$delegate.getValue();
    }

    public final AaC getCaptionBounds() {
        return (AaC) this.captionBounds$delegate.getValue();
    }

    public final VoiceDragHandleMeasurement getDragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return (VoiceDragHandleMeasurement) this.dragHandleMeasurement$delegate.getValue();
    }

    public final VoiceDragHandleToneSource getDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return (VoiceDragHandleToneSource) this.dragHandleToneSource$delegate.getValue();
    }

    public final VoiceAvatarFullScreenState getFullScreen() {
        return this.fullScreen;
    }

    public final AaC getHalfScreenMediaBounds$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return (AaC) this.halfScreenMediaBounds$delegate.getValue();
    }

    public final C1518AkS getStatusFocus$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return this.statusFocus;
    }

    public final int getStatusFocusTargets$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return this.statusFocusTargets;
    }

    public final boolean isMediaVisible() {
        return MutableState.A0A(this.isMediaVisible$delegate);
    }

    public final boolean isStatusFocusPending$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return MutableState.A0A(this.isStatusFocusPending$delegate);
    }

    public final boolean isVisible() {
        return MutableState.A0A(this.isVisible$delegate);
    }

    public final void setBackdropColor(Integer num) {
        this.backdropColor$delegate.Af8(num);
    }

    public final void setCaptionBounds(AaC aaC) {
        this.captionBounds$delegate.Af8(aaC);
    }

    public final void setDragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(VoiceDragHandleMeasurement voiceDragHandleMeasurement) {
        this.dragHandleMeasurement$delegate.Af8(voiceDragHandleMeasurement);
    }

    public final void setDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(VoiceDragHandleToneSource voiceDragHandleToneSource) {
        this.dragHandleToneSource$delegate.Af8(voiceDragHandleToneSource);
    }

    public final void setHalfScreenMediaBounds$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(AaC aaC) {
        this.halfScreenMediaBounds$delegate.Af8(aaC);
    }

    public final void setMediaVisible(boolean z) {
        MutableState.A09(z, this.isMediaVisible$delegate);
    }

    public final void setStatusFocusPending$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(boolean z) {
        MutableState.A09(z, this.isStatusFocusPending$delegate);
    }

    public final void setStatusFocusTargets$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(int i) {
        this.statusFocusTargets = i;
    }

    public VoiceAvatarTakeoverState() {
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE ageA01 = AGF.A01();
        this.isStatusFocusPending$delegate = C3cG.A08(ageA01, boolA0h);
        this.captionBounds$delegate = C3cG.A08(ageA01, null);
        this.isVisible$delegate = C3cG.A08(ageA01, boolA0h);
        this.visibleOwners = C3cG.A0k();
        this.isMediaVisible$delegate = C3cG.A08(ageA01, boolA0h);
        this.backdropColor$delegate = C3cG.A08(ageA01, null);
        this.dragHandleToneSource$delegate = C3cG.A08(ageA01, null);
        this.dragHandleMeasurement$delegate = C3cG.A08(ageA01, null);
        this.halfScreenMediaBounds$delegate = C3cG.A08(ageA01, null);
    }
}
