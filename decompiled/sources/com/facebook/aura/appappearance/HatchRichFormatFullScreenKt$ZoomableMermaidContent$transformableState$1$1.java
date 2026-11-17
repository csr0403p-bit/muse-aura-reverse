package com.facebook.aura.appappearance;

import X.ATD;
import X.AWx;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.G0W;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRichFormatFullScreenKt$ZoomableMermaidContent$transformableState$1$1 extends AbstractC7559F3s implements G0W<Float, AWx, Float, Unit> {
    public final /* synthetic */ MutableState<AWx> $offset$delegate;
    public final /* synthetic */ C00q $scale$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichFormatFullScreenKt$ZoomableMermaidContent$transformableState$1$1(C00q c00q, MutableState<AWx> mutableState) {
        super(3);
        this.$scale$delegate = c00q;
        this.$offset$delegate = mutableState;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m249invoked4ec7I(float f, long j, float f2) {
        float fA03 = ATD.A03(this.$scale$delegate.AFn() * f, 0.5f, 8.0f);
        MutableState<AWx> mutableState = this.$offset$delegate;
        HatchRichFormatFullScreenKt.ZoomableMermaidContent$lambda$5(mutableState, AWx.A05(AWx.A02(HatchRichFormatFullScreenKt.ZoomableMermaidContent$lambda$4(mutableState), fA03 / this.$scale$delegate.AFn()), j));
        this.$scale$delegate.AdS(fA03);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Float f, AWx aWx, Float f2) {
        m249invoked4ec7I(AnonymousClass001.A02(f), aWx.A00, AnonymousClass001.A02(f2));
        return Unit.INSTANCE;
    }
}
