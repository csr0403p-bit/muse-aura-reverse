package com.facebook.aura.microphone.api;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C1BN;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class Microphone {
    public static final Microphone INSTANCE = new Microphone();

    /* renamed from: com.facebook.aura.microphone.api.Microphone$owner$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<MicrophoneOwner> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MicrophoneOwner invoke() {
            return new MicrophoneOwner();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ MicrophoneOwner invoke() {
            return new MicrophoneOwner();
        }
    }

    public final C1BN<MicrophonePriority> holder(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return owner(abstractC3358CGz).holder;
    }

    private final MicrophoneOwner owner(AbstractC3358CGz abstractC3358CGz) {
        return (MicrophoneOwner) abstractC3358CGz.A03(MicrophoneOwner.class, AnonymousClass1.INSTANCE);
    }

    public final MicrophoneClaim claim(AbstractC3358CGz abstractC3358CGz, MicrophonePriority microphonePriority, Function0<Unit> function0) {
        AnonymousClass005.A0x(abstractC3358CGz, microphonePriority, function0);
        return owner(abstractC3358CGz).claim(microphonePriority, function0);
    }

    public final void preempt(AbstractC3358CGz abstractC3358CGz, MicrophonePriority microphonePriority) {
        AnonymousClass003.A0u(abstractC3358CGz, microphonePriority);
        owner(abstractC3358CGz).preempt(microphonePriority);
    }
}
