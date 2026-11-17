package com.facebook.aura.conversation.view;

import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C16Z;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewImage$4$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ long $dimColor;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ float $sourceDim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewImage$4$1(long j, float f, Function0<Float> function0) {
        super(1);
        this.$dimColor = j;
        this.$sourceDim = f;
        this.$progress = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        AnonymousClass005.A0r(c16z, this.$sourceDim * (1.0f - ATD.A03(AnonymousClass003.A04(this.$progress), 0.0f, 1.0f)), this.$dimColor);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
