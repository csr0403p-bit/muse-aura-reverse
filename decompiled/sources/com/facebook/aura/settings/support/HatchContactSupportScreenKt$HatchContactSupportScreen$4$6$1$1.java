package com.facebook.aura.settings.support;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import android.net.Uri;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchContactSupportScreenKt$HatchContactSupportScreen$4$6$1$1 extends C7438Evz implements G0U<List<? extends Uri>, Unit> {
    public HatchContactSupportScreenKt$HatchContactSupportScreen$4$6$1$1(Object obj) {
        super(1, obj, HatchContactSupportViewModel.class, "onAttachmentsPicked", "onAttachmentsPicked(Ljava/util/List;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Uri> list) {
        ((HatchContactSupportViewModel) AnonymousClass006.A0o(list, this)).onAttachmentsPicked(list);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }
}
