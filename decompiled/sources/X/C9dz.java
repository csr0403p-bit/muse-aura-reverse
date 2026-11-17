package X;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* renamed from: X.9dz, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9dz<T> implements C9hr<T> {
    public List<? extends Annotation> A00;
    public final T A01;
    public final F0C A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;[Ljava/lang/annotation/Annotation;)V */
    public C9dz(Object obj, String str, Annotation[] annotationArr) {
        this(str, obj);
        C7384Etj.A0Y(obj, 1);
        this.A00 = Arrays.asList(annotationArr);
    }

    @Override // X.C9jG
    public final T deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ descriptor = getDescriptor();
        C9j4 c9j4A55 = interfaceC07829iw.A55(descriptor);
        int iA8N = c9j4A55.A8N(getDescriptor());
        if (iA8N != -1) {
            throw new SerializationException(FGI.A0H("Unexpected index ", iA8N));
        }
        c9j4A55.AAd(descriptor);
        return this.A01;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, T t) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.A56(getDescriptor()).AAd(getDescriptor());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return (C9iZ) this.A02.getValue();
    }

    public C9dz(String str, T t) {
        this.A01 = t;
        this.A00 = C0881AGi.A00;
        this.A02 = AbstractC5321DgF.A02(C79.A01, new C2303BTd(str, this, 2));
    }
}
