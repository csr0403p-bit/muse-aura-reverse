package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$2$1(boolean z, boolean z2, Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$expanded = z;
        this.$isPrimaryThread = z2;
        this.$threadLogMetadata = map;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$expanded) {
            HatchMessageSelectionMoreOptionsMenuKt.logSelectionMenuDismiss(this.$isPrimaryThread, this.$threadLogMetadata);
        }
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
