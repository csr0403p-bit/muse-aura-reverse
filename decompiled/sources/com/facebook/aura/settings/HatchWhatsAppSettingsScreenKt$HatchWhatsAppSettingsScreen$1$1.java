package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $initialIsLinked;
    public final /* synthetic */ boolean $needsAttention;
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;
    public final /* synthetic */ MutableState<Boolean> $visited$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$1$1(HatchWhatsAppViewModel hatchWhatsAppViewModel, boolean z, boolean z2, MutableState<Boolean> mutableState) {
        super(1);
        this.$viewModel = hatchWhatsAppViewModel;
        this.$initialIsLinked = z;
        this.$needsAttention = z2;
        this.$visited$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onScreenShown(this.$initialIsLinked, this.$needsAttention, !MutableState.A0A((MutableState) this.$visited$delegate));
        MutableState.A09(true, this.$visited$delegate);
        return new C78g() { // from class: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
