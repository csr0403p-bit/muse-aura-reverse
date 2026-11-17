package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.BH1;
import X.BQz;
import X.C2283BSj;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.F0C;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Polymorphic
@Serializable
/* loaded from: classes4.dex */
public abstract class OperationResult {
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ResponseCode responseCode;

    public final class Companion {
        public final C9hr<OperationResult> serializer() {
            return AnonymousClass001.A12(OperationResult.$cachedSerializer$delegate);
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{C2283BSj.A01(num, 47)};
        $cachedSerializer$delegate = C2283BSj.A01(num, 48);
    }

    public static final /* synthetic */ C9hr _init_$_anonymous_() {
        return new PolymorphicSerializer(C3cG.A0x(OperationResult.class), new Annotation[0]);
    }

    public static /* synthetic */ void getResponseCode$annotations() {
    }

    public ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public final String serialize() {
        BQz bQz = BH1.A00;
        C9hr<Object> value = $cachedSerializer$delegate.getValue();
        C7384Etj.A0Y(value, 0);
        return bQz.A00.A02(this, value);
    }

    public /* synthetic */ OperationResult(int i, ResponseCode responseCode, C2hx c2hx) {
        this.responseCode = responseCode;
    }

    public OperationResult(ResponseCode responseCode) {
        C7384Etj.A0Y(responseCode, 0);
        this.responseCode = responseCode;
    }
}
