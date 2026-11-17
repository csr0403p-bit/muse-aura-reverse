package com.facebook.aura.commands.photos;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class PhotoSource$Companion$selectableWireValues$2 extends AbstractC7559F3s implements G0U<PhotoSource, CharSequence> {
    public static final PhotoSource$Companion$selectableWireValues$2 INSTANCE = new PhotoSource$Companion$selectableWireValues$2();

    public PhotoSource$Companion$selectableWireValues$2() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(PhotoSource photoSource) {
        PhotoSource photoSource2 = photoSource;
        C7384Etj.A0Y(photoSource2, 0);
        return photoSource2.getWireValue();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(PhotoSource photoSource) {
        C7384Etj.A0Y(photoSource, 0);
        return photoSource.getWireValue();
    }
}
