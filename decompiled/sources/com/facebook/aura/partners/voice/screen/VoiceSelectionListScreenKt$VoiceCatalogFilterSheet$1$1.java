package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Function0<Unit> $onClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$1$1(boolean z, Function0<Unit> function0) {
        super(1);
        this.$enabled = z;
        this.$onClose = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$enabled) {
            this.$onClose.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
