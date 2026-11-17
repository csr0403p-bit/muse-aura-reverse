package X;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* loaded from: classes5.dex */
public final class Cx7 implements Protobuf {
    public final int A00;
    public final CxD A01;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Protobuf) {
                Protobuf protobuf = (Protobuf) obj;
                if (this.A00 != ((Cx7) protobuf).A00 || !this.A01.equals(protobuf.intEncoding())) {
                }
            }
            return false;
        }
        return true;
    }

    public static C2580BeF A00(Cx8 cx8, CxD cxD, int i) {
        cx8.A0X(new Cx7(cxD, i));
        return cx8.A0W();
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    @Override // com.google.firebase.encoders.proto.Protobuf
    public CxD intEncoding() {
        return this.A01;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        StringBuilder sbA0x = C60O.A0x("@com.google.firebase.encoders.proto.Protobuf(tag=");
        sbA0x.append(this.A00);
        sbA0x.append("intEncoding=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public Cx7(CxD cxD, int i) {
        this.A00 = i;
        this.A01 = cxD;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.A00) + (this.A01.hashCode() ^ 2041407134);
    }
}
