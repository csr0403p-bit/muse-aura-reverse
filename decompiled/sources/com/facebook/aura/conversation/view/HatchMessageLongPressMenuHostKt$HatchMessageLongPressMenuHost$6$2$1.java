package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.model.ReplyAttributionSerializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchMessageUiModel $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$2$1(Context context, HatchMessageUiModel hatchMessageUiModel) {
        super(0);
        this.$context = context;
        this.$message = hatchMessageUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ClipboardManager clipboardManager;
        Object systemService = this.$context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (!(systemService instanceof ClipboardManager) || (clipboardManager = (ClipboardManager) systemService) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(ReplyAttributionSerializer.TYPE_MESSAGE, this.$message.content));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
