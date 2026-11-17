package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.C7OU;
import X.CFK;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContactSupportAttachmentsKt$AddAttachmentButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C7OU<Intent, ActivityResult> $launcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSupportAttachmentsKt$AddAttachmentButton$1$1(C7OU<Intent, ActivityResult> c7ou) {
        super(0);
        this.$launcher = c7ou;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchContactSupportScreenKt.logContactSupportClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.ADD_ATTACHMENTS_BUTTON, null);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.putExtra("android.intent.extra.MIME_TYPES", HelpTicketAttachmentFiles.MIME_TYPES);
        try {
            A02(intent);
        } catch (ActivityNotFoundException e) {
            CFK.A08(ContactSupportAttachmentsKt.TAG, "No activity to handle attachment picker", e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
