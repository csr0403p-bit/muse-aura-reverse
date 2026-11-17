package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import java.time.LocalDate;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginBirthdayRoute$3$1 extends C7438Evz implements G0U<LocalDate, Unit> {
    public NativeLoginRoutesKt$NativeLoginBirthdayRoute$3$1(Object obj) {
        super(1, obj, NativeLoginViewModel.class, "onBirthdaySelected", "onBirthdaySelected(Ljava/time/LocalDate;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDate localDate) {
        ((NativeLoginViewModel) AnonymousClass006.A0o(localDate, this)).onBirthdaySelected(localDate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
        invoke2(localDate);
        return Unit.INSTANCE;
    }
}
