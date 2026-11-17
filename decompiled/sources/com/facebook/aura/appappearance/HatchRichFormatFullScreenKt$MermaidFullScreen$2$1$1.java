package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRichFormatFullScreenKt$MermaidFullScreen$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchContentViewModelData.MermaidDiagram $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichFormatFullScreenKt$MermaidFullScreen$2$1$1(Context context, HatchContentViewModelData.MermaidDiagram mermaidDiagram) {
        super(0);
        this.$context = context;
        this.$data = mermaidDiagram;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ClipboardManager clipboardManager;
        Object systemService = this.$context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (!(systemService instanceof ClipboardManager) || (clipboardManager = (ClipboardManager) systemService) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("mermaid source", this.$data.mermaidSource));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
