package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.file.utils.HatchMediaAspectRatios;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImage$content$1$3$2$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ boolean $isSvg;
    public final /* synthetic */ String $sharedElementKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineImageKt$HatchInlineImage$content$1$3$2$1(String str, boolean z) {
        super(1);
        this.$sharedElementKey = str;
        this.$isSvg = z;
    }

    public final void invoke(float f) {
        HatchMediaAspectRatios hatchMediaAspectRatios = HatchMediaAspectRatios.INSTANCE;
        String str = this.$sharedElementKey;
        if (this.$isSvg) {
            f = 1.0f;
        }
        hatchMediaAspectRatios.put(str, f);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
