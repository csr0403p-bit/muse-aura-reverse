package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$documentLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ G0V<Uri, String, Unit> $upload;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        Intent intent;
        Uri data;
        C7384Etj.A0Y(activityResult, 0);
        if (activityResult.A00 != -1 || (intent = activityResult.A01) == null || (data = intent.getData()) == null) {
            return;
        }
        this.$upload.invoke(data, LibraryUploadMenuKt.defaultFileName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LibraryUploadMenuKt$LibraryUploadMenu$documentLauncher$1$1(G0V<? super Uri, ? super String, Unit> g0v) {
        super(1);
        this.$upload = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
