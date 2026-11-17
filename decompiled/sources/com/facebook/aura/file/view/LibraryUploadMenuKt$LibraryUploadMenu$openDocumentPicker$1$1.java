package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7OU;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$openDocumentPicker$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C7OU<Intent, ActivityResult> $documentLauncher;
    public final /* synthetic */ String $uploadFailedMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUploadMenuKt$LibraryUploadMenu$openDocumentPicker$1$1(C7OU<Intent, ActivityResult> c7ou, String str) {
        super(0);
        this.$documentLauncher = c7ou;
        this.$uploadFailedMessage = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        try {
            A02(intent);
        } catch (ActivityNotFoundException unused) {
            ToastApi.INSTANCE.showToast(this.$uploadFailedMessage);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
