package X;

import com.google.android.gms.internal.mlkit_vision_face.zzcu;

/* renamed from: X.Cxl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4511Cxl implements zzcu {
    public final int A00;
    public final EnumC4486CxF A01;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzcu) {
                zzcu zzcuVar = (zzcu) obj;
                if (this.A00 != ((C4511Cxl) zzcuVar).A00 || !this.A01.equals(zzcuVar.zzb())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.A00 ^ 14552422) + (this.A01.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("@com.google.firebase.encoders.proto.Protobuf(tag=");
        sbA0x.append(this.A00);
        sbA0x.append("intEncoding=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final EnumC4486CxF zzb() {
        return this.A01;
    }

    public C4511Cxl(EnumC4486CxF enumC4486CxF, int i) {
        this.A00 = i;
        this.A01 = enumC4486CxF;
    }
}
