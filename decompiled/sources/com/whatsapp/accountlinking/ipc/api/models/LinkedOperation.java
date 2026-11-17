package com.whatsapp.accountlinking.ipc.api.models;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.C2hx;
import X.C3cG;
import X.C79;
import X.C8i2;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes3.dex */
public abstract class LinkedOperation extends Operation {
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, new C8i2(9));

    public final class Companion {
        public final C9hr<LinkedOperation> serializer() {
            return AnonymousClass001.A12(LinkedOperation.$cachedSerializer$delegate);
        }
    }

    public static final /* synthetic */ C9hr _init_$_anonymous_() {
        return new PolymorphicSerializer(C3cG.A0x(LinkedOperation.class), new Annotation[0]);
    }

    public /* synthetic */ LinkedOperation(int i, C2hx c2hx) {
    }

    public static final /* synthetic */ void write$Self(LinkedOperation linkedOperation, C9j5 c9j5, C9iZ c9iZ) {
    }

    public LinkedOperation() {
    }
}
