package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchReactionPickerBottomSheetKt$HatchReactionPickerBottomSheet$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $messageRole;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ G0U<String, Unit> $onReaction;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchReactionPickerBottomSheetKt.handleReactionSelected(str, this.$messageRole, this.$threadLogMetadata, this.$onReaction, this.$onDismiss);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchReactionPickerBottomSheetKt$HatchReactionPickerBottomSheet$1$1$1(String str, Map<String, String> map, G0U<? super String, Unit> g0u, Function0<Unit> function0) {
        super(1);
        this.$messageRole = str;
        this.$threadLogMetadata = map;
        this.$onReaction = g0u;
        this.$onDismiss = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
