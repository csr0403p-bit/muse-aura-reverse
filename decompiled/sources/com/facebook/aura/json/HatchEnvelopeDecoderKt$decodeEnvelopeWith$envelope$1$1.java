package com.facebook.aura.json;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9jG;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class HatchEnvelopeDecoderKt$decodeEnvelopeWith$envelope$1$1<T> extends AbstractC7559F3s implements Function0<C9jG<? extends HatchEnvelope<T>>> {
    public final /* synthetic */ Function0<C9hr<T>> $resultSerializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEnvelopeDecoderKt$decodeEnvelopeWith$envelope$1$1(Function0<? extends C9hr<T>> function0) {
        super(0);
        this.$resultSerializer = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9jG<HatchEnvelope<T>> invoke() {
        C9iZ c9iZ = HatchEnvelope.$cachedDescriptor;
        C9hr<T> c9hrInvoke = this.$resultSerializer.invoke();
        C7384Etj.A0Y(c9hrInvoke, 0);
        return new HatchEnvelope$$serializer(c9hrInvoke);
    }
}
