package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$DefaultAssistantSettingsCard$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ MutableState<Boolean> $isDefault$delegate;
    public final /* synthetic */ Function0<Boolean> $isDefaultAssistant;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        MutableState.A09(AnonymousClass003.A1Y(this.$isDefaultAssistant), this.$isDefault$delegate);
        return new InterfaceC06807bD() { // from class: com.facebook.aura.settings.HatchSettingsScreenKt$DefaultAssistantSettingsCard$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$DefaultAssistantSettingsCard$1$1(Function0<Boolean> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$isDefaultAssistant = function0;
        this.$isDefault$delegate = mutableState;
    }
}
