package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCodeBlockKt$HatchCodeBlock$2$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $code;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $copied$delegate;
    public final /* synthetic */ String $copyLabel;
    public final /* synthetic */ String $language;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCodeBlockKt$HatchCodeBlock$2$1$2$2$1(String str, Map<String, String> map, Context context, String str2, String str3, MutableState<Boolean> mutableState) {
        super(0);
        this.$language = str;
        this.$threadLogMetadata = map;
        this.$context = context;
        this.$copyLabel = str2;
        this.$code = str3;
        this.$copied$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ClipboardManager clipboardManager;
        HatchCodeBlockKt.logCodeCopyClick(this.$language, this.$threadLogMetadata);
        Object systemService = this.$context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if ((systemService instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) systemService) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(this.$copyLabel, this.$code));
        }
        MutableState.A09(true, this.$copied$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
