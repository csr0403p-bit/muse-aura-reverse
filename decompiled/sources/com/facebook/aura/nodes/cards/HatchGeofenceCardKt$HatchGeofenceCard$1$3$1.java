package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGeofenceCardKt$HatchGeofenceCard$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ GeofenceCardData $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGeofenceCardKt$HatchGeofenceCard$1$3$1(Context context, GeofenceCardData geofenceCardData) {
        super(0);
        this.$context = context;
        this.$data = geofenceCardData;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchGeofenceCardKt.openMap(this.$context, this.$data);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
