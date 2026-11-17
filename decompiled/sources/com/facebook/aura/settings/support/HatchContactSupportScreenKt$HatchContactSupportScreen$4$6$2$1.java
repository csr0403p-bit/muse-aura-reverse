package com.facebook.aura.settings.support;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchContactSupportScreenKt$HatchContactSupportScreen$4$6$2$1 extends C7438Evz implements G0U<Uri, Unit> {
    public HatchContactSupportScreenKt$HatchContactSupportScreen$4$6$2$1(Object obj) {
        super(1, obj, HatchContactSupportViewModel.class, "onAttachmentRemoved", "onAttachmentRemoved(Landroid/net/Uri;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri uri) {
        ((HatchContactSupportViewModel) AnonymousClass006.A0o(uri, this)).onAttachmentRemoved(uri);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        invoke2(uri);
        return Unit.INSTANCE;
    }
}
