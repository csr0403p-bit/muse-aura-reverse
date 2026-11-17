package com.facebook.aura.conversation.view;

import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.C1Ny;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$openContextMenu$1$1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
    public final /* synthetic */ BubbleChildTapTracker $childTapTracker;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ MutableState<AWx> $longPressOffset$delegate;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ MutableState<Boolean> $pendingMenuOpen$delegate;
    public final /* synthetic */ MutableState<String> $pressedMediaKey$delegate;
    public final /* synthetic */ MutableState<Boolean> $selectionActive$delegate;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$openContextMenu$1$1(HatchMessageUiModel hatchMessageUiModel, boolean z, Map<String, String> map, C1Ny c1Ny, AXN axn, MutableState<AWx> mutableState, BubbleChildTapTracker bubbleChildTapTracker, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5) {
        super(1);
        this.$message = hatchMessageUiModel;
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$imeInsets = c1Ny;
        this.$density = axn;
        this.$longPressOffset$delegate = mutableState;
        this.$childTapTracker = bubbleChildTapTracker;
        this.$pressedMediaKey$delegate = mutableState2;
        this.$selectionActive$delegate = mutableState3;
        this.$pendingMenuOpen$delegate = mutableState4;
        this.$showContextMenu$delegate = mutableState5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
        m654invoke_kEHs6E(aWx);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-_kEHs6E, reason: not valid java name */
    public final void m654invoke_kEHs6E(AWx aWx) {
        HatchMessageLongPressMenuHostKt.logMessageLongPress(this.$message, this.$isPrimaryThread, this.$threadLogMetadata);
        this.$longPressOffset$delegate.Af8(aWx);
        this.$pressedMediaKey$delegate.Af8(aWx != null ? this.$childTapTracker.childPressTracker.pressedMediaKey : null);
        MutableState.A09(false, this.$selectionActive$delegate);
        if (this.$imeInsets.ACy(this.$density) > 0) {
            MutableState.A09(true, this.$pendingMenuOpen$delegate);
        } else {
            MutableState.A09(true, this.$showContextMenu$delegate);
        }
    }
}
