package com.facebook.aura.conversation.view;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewScrim$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ long $scrimColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        AnonymousClass005.A0r(at3, AnonymousClass003.A00(AnonymousClass003.A04(this.$progress)), this.$scrimColor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewScrim$1$1(long j, Function0<Float> function0) {
        super(1);
        this.$scrimColor = j;
        this.$progress = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
