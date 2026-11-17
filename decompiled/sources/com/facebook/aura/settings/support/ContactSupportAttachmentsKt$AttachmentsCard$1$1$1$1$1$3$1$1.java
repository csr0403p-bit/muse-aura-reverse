package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Uri, Unit> $onAttachmentRemoved;
    public final /* synthetic */ Uri $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactSupportAttachmentsKt$AttachmentsCard$1$1$1$1$1$3$1$1(G0U<? super Uri, Unit> g0u, Uri uri) {
        super(0);
        this.$onAttachmentRemoved = g0u;
        this.$uri = uri;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchContactSupportScreenKt.logContactSupportClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.DELETE_BUTTON, null);
        this.$onAttachmentRemoved.invoke(this.$uri);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
