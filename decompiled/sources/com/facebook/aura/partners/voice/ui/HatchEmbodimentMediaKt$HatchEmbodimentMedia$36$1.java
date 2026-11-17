package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import X.InterfaceC2178B0w;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$36$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<InterfaceC2178B0w, Unit>> $currentOnPlaceholderReady$delegate;
    public final /* synthetic */ InterfaceC2178B0w $openingStillFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$36$1(InterfaceC2178B0w interfaceC2178B0w, C1BO<? extends G0U<? super InterfaceC2178B0w, Unit>> c1bo) {
        super(1);
        this.$openingStillFrame = interfaceC2178B0w;
        this.$currentOnPlaceholderReady$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnPlaceholderReady$delegate).invoke(this.$openingStillFrame);
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$36$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
