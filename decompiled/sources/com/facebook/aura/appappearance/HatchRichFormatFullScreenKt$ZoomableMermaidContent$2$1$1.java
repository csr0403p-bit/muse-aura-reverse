package com.facebook.aura.appappearance;

import X.AWx;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C00q;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRichFormatFullScreenKt$ZoomableMermaidContent$2$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ MutableState<AWx> $offset$delegate;
    public final /* synthetic */ C00q $scale$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.AeX(this.$scale$delegate.AFn());
        c2av.AeY(this.$scale$delegate.AFn());
        c2av.Af5(AnonymousClass003.A03(HatchRichFormatFullScreenKt.ZoomableMermaidContent$lambda$4(this.$offset$delegate)));
        c2av.Af6(AnonymousClass004.A00(HatchRichFormatFullScreenKt.ZoomableMermaidContent$lambda$4(this.$offset$delegate)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichFormatFullScreenKt$ZoomableMermaidContent$2$1$1(C00q c00q, MutableState<AWx> mutableState) {
        super(1);
        this.$scale$delegate = c00q;
        this.$offset$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
