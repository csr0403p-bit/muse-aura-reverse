package com.facebook.aura.conversation.view;

import X.AHD;
import X.AOI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $onReaction;
    public final /* synthetic */ AOI<Boolean> $reactionBarExpandedStates;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
    public final /* synthetic */ MutableState<Boolean> $showReactionPicker$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9(AOI<Boolean> aoi, HatchMessageUiModel hatchMessageUiModel, Map<String, String> map, G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState, boolean z, MutableState<Boolean> mutableState2) {
        super(2);
        this.$reactionBarExpandedStates = aoi;
        this.$message = hatchMessageUiModel;
        this.$threadLogMetadata = map;
        this.$onReaction = g0u;
        this.$showContextMenu$delegate = mutableState;
        this.$isPrimaryThread = z;
        this.$showReactionPicker$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AppFloatingLayerKt.AppFloatingLayers(null, false, bfm, 0, 3);
            AOI<Boolean> aoi = this.$reactionBarExpandedStates;
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            AHD<String> ahd = hatchMessageUiModel.reactions;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$showContextMenu$delegate, AnonymousClass001.A1R(bfm, this.$onReaction, AnonymousClass001.A1T(bfm, this.$threadLogMetadata, bfm.A67(hatchMessageUiModel))));
            HatchMessageUiModel hatchMessageUiModel2 = this.$message;
            Map<String, String> map = this.$threadLogMetadata;
            G0U<String, Unit> g0u = this.$onReaction;
            MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9$1$1(hatchMessageUiModel2, map, g0u, mutableState);
                bfm.Ai0(objAaT);
            }
            G0U g0u2 = (G0U) objAaT;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$showReactionPicker$delegate, AnonymousClass001.A1R(bfm, this.$showContextMenu$delegate, AnonymousClass001.A1T(bfm, this.$threadLogMetadata, bfm.A66(this.$isPrimaryThread))));
            boolean z = this.$isPrimaryThread;
            Map<String, String> map2 = this.$threadLogMetadata;
            MutableState<Boolean> mutableState2 = this.$showContextMenu$delegate;
            MutableState<Boolean> mutableState3 = this.$showReactionPicker$delegate;
            Object objAaT2 = bfm.AaT();
            if (zA1R2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9$2$1(z, map2, mutableState2, mutableState3);
                bfm.Ai0(objAaT2);
            }
            HatchMessageLongPressMenuHostKt.HatchInlineReactionBar(aoi, ahd, g0u2, (Function0) objAaT2, bfm, 0);
            return;
        }
        bfm.Afo();
    }
}
