package com.facebook.aura.partners.voice.api;

import X.AbstractC7559F3s;
import X.C3cG;
import X.G0U;
import X.InterfaceC10560Hsz;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceCatalogRepository$streamPreviewPcm$2$send$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ AtomicInteger $inFlight;
    public final /* synthetic */ InterfaceC10560Hsz<Integer> $winner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCatalogRepository$streamPreviewPcm$2$send$1(AtomicInteger atomicInteger, InterfaceC10560Hsz<Integer> interfaceC10560Hsz) {
        super(1);
        this.$inFlight = atomicInteger;
        this.$winner = interfaceC10560Hsz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (this.$inFlight.decrementAndGet() == 0) {
            C3cG.A1F(this.$winner, null);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
