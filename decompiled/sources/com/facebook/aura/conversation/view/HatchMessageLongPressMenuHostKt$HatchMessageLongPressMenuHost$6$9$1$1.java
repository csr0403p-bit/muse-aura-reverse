package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $onReaction;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchMessageLongPressMenuHostKt.logReactionClick(this.$message, str, this.$threadLogMetadata);
        this.$onReaction.invoke(str);
        MutableState.A09(false, this.$showContextMenu$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9$1$1(HatchMessageUiModel hatchMessageUiModel, Map<String, String> map, G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$message = hatchMessageUiModel;
        this.$threadLogMetadata = map;
        this.$onReaction = g0u;
        this.$showContextMenu$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
