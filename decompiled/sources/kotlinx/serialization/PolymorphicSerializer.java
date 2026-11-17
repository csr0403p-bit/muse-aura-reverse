package kotlinx.serialization;

import X.AbstractC5321DgF;
import X.AnonymousClass007;
import X.C0881AGi;
import X.C2293BSt;
import X.C60O;
import X.C79;
import X.C9hu;
import X.C9iZ;
import X.C9uG;
import X.F0C;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class PolymorphicSerializer<T> extends C9hu<T> {
    public List<? extends Annotation> A00;
    public final C9uG<T> A01;
    public final F0C A02;

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return (C9iZ) this.A02.getValue();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A01, C60O.A0x("kotlinx.serialization.PolymorphicSerializer(baseClass: "));
    }

    public PolymorphicSerializer(C9uG<T> c9uG) {
        this.A01 = c9uG;
        this.A00 = C0881AGi.A00;
        this.A02 = AbstractC5321DgF.A02(C79.A01, C2293BSt.A00(this, 42));
    }

    public PolymorphicSerializer(C9uG<T> c9uG, Annotation[] annotationArr) {
        this(c9uG);
        this.A00 = Arrays.asList(annotationArr);
    }
}
