package com.facebook.aura.conversation.view;

import X.AnonymousClass003;
import X.C7384Etj;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.utils.HatchMediaAspectRatios;

/* loaded from: classes.dex */
public final class ImageOptionTileAnchor {
    public final MutableState aspectRatio$delegate;
    public InterfaceC1497Ak4 coordinates;
    public final String sharedElementKey;

    public ImageOptionTileAnchor(String str) {
        C7384Etj.A0Y(str, 0);
        this.sharedElementKey = str;
        this.aspectRatio$delegate = AnonymousClass003.A0S();
    }

    private final void setAspectRatio(Float f) {
        this.aspectRatio$delegate.Af8(f);
    }

    public final Float getAspectRatio() {
        return (Float) this.aspectRatio$delegate.getValue();
    }

    public final InterfaceC1497Ak4 getCoordinates() {
        return this.coordinates;
    }

    public final void onImageSizeDecoded(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float f = i / i2;
        setAspectRatio(Float.valueOf(f));
        HatchMediaAspectRatios.INSTANCE.put(this.sharedElementKey, f);
    }

    public final void setCoordinates(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.coordinates = interfaceC1497Ak4;
    }
}
