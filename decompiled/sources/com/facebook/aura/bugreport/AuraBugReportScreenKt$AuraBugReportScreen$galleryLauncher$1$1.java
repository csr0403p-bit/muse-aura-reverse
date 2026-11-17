package com.facebook.aura.bugreport;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$galleryLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        Intent intent;
        MutableState<List<Uri>> mutableState;
        ArrayList arrayListA0Q;
        C7384Etj.A0Y(activityResult, 0);
        if (activityResult.A00 != -1 || (intent = activityResult.A01) == null) {
            return;
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            ArrayList arrayList = new ArrayList();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            mutableState = this.$imageUris$delegate;
            float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
            arrayListA0Q = AbstractC0878AGe.A0P(arrayList, mutableState.getValue());
        } else {
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            mutableState = this.$imageUris$delegate;
            float f2 = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
            arrayListA0Q = AbstractC0878AGe.A0Q(data, mutableState.getValue());
        }
        mutableState.Af8(arrayListA0Q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$galleryLauncher$1$1(MutableState<List<Uri>> mutableState) {
        super(1);
        this.$imageUris$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
