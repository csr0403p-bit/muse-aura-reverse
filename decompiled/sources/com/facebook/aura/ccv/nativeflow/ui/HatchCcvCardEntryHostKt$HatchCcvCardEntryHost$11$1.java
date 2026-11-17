package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$11$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$11$1(Object obj) {
        super(1, obj, HatchCcvViewModel.class, "onZipChange", "onZipChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchCcvViewModel) AnonymousClass006.A0o(str, this)).onZipChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
