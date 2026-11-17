package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.unsend.HatchUnsendNuxStore;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $conversationUnsend;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ MutableState<Boolean> $showUnsendNux$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchUnsendNuxStore $unsendNuxStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$6$1(boolean z, Map<String, String> map, HatchUnsendNuxStore hatchUnsendNuxStore, G0U<? super HatchMessageUiModel, Unit> g0u, HatchMessageUiModel hatchMessageUiModel, MutableState<Boolean> mutableState) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$unsendNuxStore = hatchUnsendNuxStore;
        this.$conversationUnsend = g0u;
        this.$message = hatchMessageUiModel;
        this.$showUnsendNux$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchMessageLongPressMenuHostKt.logUnsendNuxConfirm(this.$isPrimaryThread, this.$threadLogMetadata);
        MutableState.A09(false, this.$showUnsendNux$delegate);
        this.$unsendNuxStore.markSeen();
        G0U<HatchMessageUiModel, Unit> g0u = this.$conversationUnsend;
        if (g0u != null) {
            g0u.invoke(this.$message);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
