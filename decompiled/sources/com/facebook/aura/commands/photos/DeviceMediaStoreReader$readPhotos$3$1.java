package com.facebook.aura.commands.photos;

import X.AbstractC7559F3s;
import X.G0U;

/* loaded from: classes3.dex */
public final class DeviceMediaStoreReader$readPhotos$3$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final DeviceMediaStoreReader$readPhotos$3$1 INSTANCE = new DeviceMediaStoreReader$readPhotos$3$1();

    public DeviceMediaStoreReader$readPhotos$3$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(String str) {
        return "relative_path LIKE ?";
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        return "relative_path LIKE ?";
    }
}
