package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewImage$bounds$1$1 extends AbstractC7559F3s implements Function0<AaC> {
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ AaC $sourceBounds;
    public final /* synthetic */ AaC $targetBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewImage$bounds$1$1(AaC aaC, AaC aaC2, Function0<Float> function0) {
        super(0);
        this.$sourceBounds = aaC;
        this.$targetBounds = aaC2;
        this.$progress = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AaC invoke() {
        AaC aaC = this.$sourceBounds;
        AaC aaC2 = this.$targetBounds;
        float fA04 = AnonymousClass003.A04(this.$progress);
        float f = 1.0f - fA04;
        return new AaC((f * aaC.A01) + (aaC2.A01 * fA04), (f * aaC.A03) + (aaC2.A03 * fA04), (f * aaC.A02) + (aaC2.A02 * fA04), (f * aaC.A00) + (fA04 * aaC2.A00));
    }
}
