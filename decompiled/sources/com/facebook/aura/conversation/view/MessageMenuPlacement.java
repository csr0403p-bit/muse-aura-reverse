package com.facebook.aura.conversation.view;

import X.AHD;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuVerticalBand;

/* loaded from: classes.dex */
public final class MessageMenuPlacement {
    public final AHD<AuraContextMenuVerticalBand> bands;
    public final Float reactionBarWindowY;

    public final AHD<AuraContextMenuVerticalBand> getBands() {
        return this.bands;
    }

    public final Float getReactionBarWindowY() {
        return this.reactionBarWindowY;
    }

    public MessageMenuPlacement(Float f, AHD<AuraContextMenuVerticalBand> ahd) {
        this.reactionBarWindowY = f;
        this.bands = ahd;
    }
}
