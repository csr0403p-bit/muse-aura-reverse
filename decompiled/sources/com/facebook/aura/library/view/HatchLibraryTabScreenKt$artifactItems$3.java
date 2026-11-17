package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.FGI;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$artifactItems$3 extends AbstractC7559F3s implements G0U<Integer, Object> {
    public final /* synthetic */ String $keyPrefix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$artifactItems$3(String str) {
        super(1);
        this.$keyPrefix = str;
    }

    public final Object invoke(int i) {
        return FGI.A0S(this.$keyPrefix, "_row_", i);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
