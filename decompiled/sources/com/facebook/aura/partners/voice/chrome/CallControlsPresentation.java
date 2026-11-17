package com.facebook.aura.partners.voice.chrome;

import X.AnonymousClass003;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.partners.voice.intf.VoiceCallControlsAction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CallControlsPresentation {
    public final List<VoiceCallControlsAction> actions;
    public final G0V<BFM, Integer, Unit> additionalControl;
    public final CallControlsBounds bounds;
    public final float captionReservationPx;
    public final boolean captionReserved;
    public final Function0<Float> controlReveal;
    public final VoiceCallControl displayButton;
    public final VoiceCallControl micControl;
    public final boolean muteAvailable;

    /* JADX WARN: Multi-variable type inference failed */
    public CallControlsPresentation(VoiceCallControl voiceCallControl, boolean z, VoiceCallControl voiceCallControl2, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Float> function0, List<? extends VoiceCallControlsAction> list, CallControlsBounds callControlsBounds, boolean z2, float f) {
        C7384Etj.A0Y(voiceCallControl, 0);
        AnonymousClass003.A0z(list, callControlsBounds);
        this.micControl = voiceCallControl;
        this.muteAvailable = z;
        this.displayButton = voiceCallControl2;
        this.additionalControl = g0v;
        this.controlReveal = function0;
        this.actions = list;
        this.bounds = callControlsBounds;
        this.captionReserved = z2;
        this.captionReservationPx = f;
    }

    public final List<VoiceCallControlsAction> getActions() {
        return this.actions;
    }

    public final G0V<BFM, Integer, Unit> getAdditionalControl() {
        return this.additionalControl;
    }

    public final CallControlsBounds getBounds() {
        return this.bounds;
    }

    public final float getCaptionReservationPx() {
        return this.captionReservationPx;
    }

    public final boolean getCaptionReserved() {
        return this.captionReserved;
    }

    public final Function0<Float> getControlReveal() {
        return this.controlReveal;
    }

    public final VoiceCallControl getDisplayButton() {
        return this.displayButton;
    }

    public final VoiceCallControl getMicControl() {
        return this.micControl;
    }

    public final boolean getMuteAvailable() {
        return this.muteAvailable;
    }
}
