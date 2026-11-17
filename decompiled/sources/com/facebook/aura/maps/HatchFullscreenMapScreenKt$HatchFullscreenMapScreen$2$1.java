package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.ResultEventBus;

/* loaded from: classes2.dex */
public final class HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ResultEventBus $resultEventBus;
    public final /* synthetic */ String $selectionResultKey;
    public final /* synthetic */ MutableState<String> $selectionState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$2$1(MutableState<String> mutableState, ResultEventBus resultEventBus, String str) {
        super(1);
        this.$selectionState = mutableState;
        this.$resultEventBus = resultEventBus;
        this.$selectionResultKey = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final MutableState<String> mutableState = this.$selectionState;
        final ResultEventBus resultEventBus = this.$resultEventBus;
        final String str = this.$selectionResultKey;
        return new C78g() { // from class: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Object value = mutableState.getValue();
                if (value != null) {
                    resultEventBus.removeResult(str);
                    resultEventBus.sendResult(str, value);
                }
            }
        };
    }
}
