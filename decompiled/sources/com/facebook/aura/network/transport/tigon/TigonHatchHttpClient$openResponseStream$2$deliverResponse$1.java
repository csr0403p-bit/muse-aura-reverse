package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.BV4;
import X.C7384Etj;
import X.C78T;
import X.G0U;
import X.G0W;
import X.Hm1;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class TigonHatchHttpClient$openResponseStream$2$deliverResponse$1 extends AbstractC7559F3s implements G0U<HatchHttpResponseStream, Unit> {
    public final /* synthetic */ Hm1<HatchHttpResponseStream> $continuation;
    public final /* synthetic */ AtomicBoolean $responseDelivered;

    /* renamed from: com.facebook.aura.network.transport.tigon.TigonHatchHttpClient$openResponseStream$2$deliverResponse$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<Throwable, HatchHttpResponseStream, C78T, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th, HatchHttpResponseStream hatchHttpResponseStream, C78T c78t) {
            HatchHttpResponseStream hatchHttpResponseStream2 = hatchHttpResponseStream;
            C7384Etj.A0Y(hatchHttpResponseStream2, 1);
            hatchHttpResponseStream2.close();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th, HatchHttpResponseStream hatchHttpResponseStream, C78T c78t) {
            C7384Etj.A0Y(hatchHttpResponseStream, 1);
            hatchHttpResponseStream.close();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchHttpResponseStream hatchHttpResponseStream) {
        C7384Etj.A0Y(hatchHttpResponseStream, 0);
        if (BV4.A1V(this.$responseDelivered)) {
            this.$continuation.Abe(hatchHttpResponseStream, AnonymousClass1.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TigonHatchHttpClient$openResponseStream$2$deliverResponse$1(AtomicBoolean atomicBoolean, Hm1<? super HatchHttpResponseStream> hm1) {
        super(1);
        this.$responseDelivered = atomicBoolean;
        this.$continuation = hm1;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchHttpResponseStream hatchHttpResponseStream) {
        invoke2(hatchHttpResponseStream);
        return Unit.INSTANCE;
    }
}
