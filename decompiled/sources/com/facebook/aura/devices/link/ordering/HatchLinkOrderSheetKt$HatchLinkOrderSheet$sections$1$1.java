package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchLinkOrderSheetKt$HatchLinkOrderSheet$sections$1$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchLinkOrderSheetKt$HatchLinkOrderSheet$sections$1$1(Object obj) {
        super(1, obj, HatchLinkOrderViewModel.class, "onAddressQueryChange", "onAddressQueryChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchLinkOrderViewModel) AnonymousClass006.A0o(str, this)).onAddressQueryChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
