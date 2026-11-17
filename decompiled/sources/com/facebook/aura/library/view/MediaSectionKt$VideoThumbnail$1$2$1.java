package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.file.utils.HatchMediaAspectRatios;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaSectionKt$VideoThumbnail$1$2$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ String $sharedElementKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSectionKt$VideoThumbnail$1$2$1(String str) {
        super(1);
        this.$sharedElementKey = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        HatchMediaAspectRatios.INSTANCE.put(this.$sharedElementKey, f);
    }
}
