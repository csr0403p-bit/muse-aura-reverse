package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchCallingCardKt$HatchCallingCard$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ CallingCardData $data;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCallingCardKt$HatchCallingCard$2$1$1(HatchScreen hatchScreen, Map<String, String> map, Context context, CallingCardData callingCardData) {
        super(0);
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$context = context;
        this.$data = callingCardData;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchCallingCardKt.logCallClick(this.$screen, this.$threadLogMetadata);
        HatchCallingCardKt.openDialer(this.$context, this.$data.phoneNumber);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
