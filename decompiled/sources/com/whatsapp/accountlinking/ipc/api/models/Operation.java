package com.whatsapp.accountlinking.ipc.api.models;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.BPT;
import X.BQz;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C8i2;
import X.C9hq;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9uG;
import X.F0C;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes3.dex */
public abstract class Operation {
    public static final long DEFAULT_OP_TIMEOUT_MS = 15000;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, new C8i2(10));

    public final class Companion {
        public final C9hr<Operation> serializer() {
            return AnonymousClass001.A12(Operation.$cachedSerializer$delegate);
        }
    }

    public abstract int getVersion();

    public static final /* synthetic */ C9hr _init_$_anonymous_() {
        return new C9hq("Operation", C3cG.A0x(Operation.class), new Annotation[0], new C9uG[]{C3cG.A0x(LinkedOperation.class), C3cG.A0x(UnlinkedOperation.class)}, new C9hr[]{new PolymorphicSerializer(C3cG.A0x(LinkedOperation.class), new Annotation[0]), new PolymorphicSerializer(C3cG.A0x(UnlinkedOperation.class), new Annotation[0])});
    }

    public long getOperationTimeoutMs() {
        return 15000L;
    }

    public final String serialize() {
        BQz bQz = BPT.A00;
        C9hr<Object> value = $cachedSerializer$delegate.getValue();
        C7384Etj.A0Y(value, 0);
        return bQz.A00.A02(this, value);
    }

    public /* synthetic */ Operation(C06H c06h) {
    }

    public static final /* synthetic */ void write$Self(Operation operation, C9j5 c9j5, C9iZ c9iZ) {
    }

    public /* synthetic */ Operation(int i, C2hx c2hx) {
    }

    public Operation() {
    }
}
