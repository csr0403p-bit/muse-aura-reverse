package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContactSupportAttachmentsKt$AddAttachmentButton$launcher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAttachmentsPicked;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        Intent intent;
        C7384Etj.A0Y(activityResult, 0);
        if (activityResult.A00 != -1 || (intent = activityResult.A01) == null) {
            return;
        }
        this.$onAttachmentsPicked.invoke(ContactSupportAttachmentsKt.pickedUris(intent));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactSupportAttachmentsKt$AddAttachmentButton$launcher$1$1(G0U<? super List<? extends Uri>, Unit> g0u) {
        super(1);
        this.$onAttachmentsPicked = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
