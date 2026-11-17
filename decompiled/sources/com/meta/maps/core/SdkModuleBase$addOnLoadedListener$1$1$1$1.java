package com.meta.maps.core;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import com.meta.maps.core.SdkModuleBase;

/* loaded from: classes4.dex */
public final class SdkModuleBase$addOnLoadedListener$1$1$1$1 extends AbstractC7559F3s implements G0U<SdkModuleBase.LoadedListener, Boolean> {
    public final /* synthetic */ SdkModuleBase.LoadedListener $listener;

    @Override // X.G0U
    public final Boolean invoke(SdkModuleBase.LoadedListener loadedListener) {
        C7384Etj.A0Y(loadedListener, 0);
        return Boolean.valueOf(AnonymousClass002.A1Z(loadedListener, this.$listener));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkModuleBase$addOnLoadedListener$1$1$1$1(SdkModuleBase.LoadedListener loadedListener) {
        super(1);
        this.$listener = loadedListener;
    }
}
