package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$rememberHatchProductIconContent$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ Map<String, Float> $aspectRatios;
    public final /* synthetic */ AuraMarkdownInlineEntitySlot $slot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$rememberHatchProductIconContent$1$1$1$1$1$1(Map<String, Float> map, AuraMarkdownInlineEntitySlot auraMarkdownInlineEntitySlot) {
        super(1);
        this.$aspectRatios = map;
        this.$slot = auraMarkdownInlineEntitySlot;
    }

    public final void invoke(float f) {
        this.$aspectRatios.put(this.$slot.key, Float.valueOf(f));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
