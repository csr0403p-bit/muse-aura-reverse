package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C16Z;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ReconnectingCoverKt$reconnectingCover$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ long $scrim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReconnectingCoverKt$reconnectingCover$1(long j, Function0<Float> function0) {
        super(1);
        this.$scrim = j;
        this.$progress = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        AnonymousClass005.A0r(c16z, AnonymousClass003.A04(this.$progress) * 0.6f, this.$scrim);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
