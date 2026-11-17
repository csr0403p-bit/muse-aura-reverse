package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C08039sm;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class JsonContentUtilsKt$PrettyJson$1 extends AbstractC7559F3s implements G0U<C08039sm, Unit> {
    public static final JsonContentUtilsKt$PrettyJson$1 INSTANCE = new JsonContentUtilsKt$PrettyJson$1();

    public JsonContentUtilsKt$PrettyJson$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C08039sm c08039sm) {
        C7384Etj.A0Y(c08039sm, 0);
        c08039sm.A0E = true;
        c08039sm.A02 = "  ";
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C08039sm c08039sm) {
        invoke2(c08039sm);
        return Unit.INSTANCE;
    }
}
