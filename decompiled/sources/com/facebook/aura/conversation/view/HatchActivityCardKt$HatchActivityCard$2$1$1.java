package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0dx;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActivityCardKt$HatchActivityCard$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActivityCardKt$HatchActivityCard$2$1$1(C0dx c0dx, Map<String, String> map, MutableState<Boolean> mutableState) {
        super(0);
        this.$haptics = c0dx;
        this.$threadLogMetadata = map;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptics.AXr(AuraHaptics.CONTEXT_TAP);
        HatchActivityCardKt.logActivityCardHeaderClick(this.$threadLogMetadata);
        MutableState.A09(!MutableState.A0A((MutableState) r1), this.$expanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
