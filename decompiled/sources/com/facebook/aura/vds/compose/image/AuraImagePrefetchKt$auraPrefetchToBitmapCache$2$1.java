package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.G0U;
import X.InterfaceC7236Ej0;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraImagePrefetchKt$auraPrefetchToBitmapCache$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ InterfaceC7236Ej0<Void> $dataSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImagePrefetchKt$auraPrefetchToBitmapCache$2$1(InterfaceC7236Ej0<Void> interfaceC7236Ej0) {
        super(1);
        this.$dataSource = interfaceC7236Ej0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        this.$dataSource.A6Q();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$dataSource.A6Q();
    }
}
