package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichFormatFullScreenKt$CodeFullScreen$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchContentViewModelData.Code $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichFormatFullScreenKt$CodeFullScreen$3$1$1(Context context, HatchContentViewModelData.Code code) {
        super(0);
        this.$context = context;
        this.$data = code;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ClipboardManager clipboardManager;
        Object systemService = this.$context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (!(systemService instanceof ClipboardManager) || (clipboardManager = (ClipboardManager) systemService) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("code text", this.$data.codeParams.codeContent));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
