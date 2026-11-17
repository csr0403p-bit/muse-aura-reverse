package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchEmbodimentVideoKt$backdropPixelCopyExecutor$2 extends AbstractC7559F3s implements Function0<ExecutorService> {
    public static final HatchEmbodimentVideoKt$backdropPixelCopyExecutor$2 INSTANCE = new HatchEmbodimentVideoKt$backdropPixelCopyExecutor$2();

    public HatchEmbodimentVideoKt$backdropPixelCopyExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadExecutor("Aura-EmbodimentBackdropPixelCopy");
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadExecutor("Aura-EmbodimentBackdropPixelCopy");
    }
}
