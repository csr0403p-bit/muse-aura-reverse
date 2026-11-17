package com.facebook.aura.vds.compose.font;

import X.AbstractC1996Aw5;
import X.AbstractC7559F3s;
import X.B08;
import X.C1736ApY;
import com.facebook.aura.vds.font.api.AuraAppTypeface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class FontFamilyExtKt$DefaultOptimisticAi$2 extends AbstractC7559F3s implements Function0<AbstractC1996Aw5> {
    public static final FontFamilyExtKt$DefaultOptimisticAi$2 INSTANCE = new FontFamilyExtKt$DefaultOptimisticAi$2();

    public FontFamilyExtKt$DefaultOptimisticAi$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1996Aw5 invoke() {
        return B08.A00(C1736ApY.A04, AuraAppTypeface.INSTANCE.getOptimisticAi());
    }
}
