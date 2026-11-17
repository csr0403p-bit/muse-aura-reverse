package X;

import com.google.android.gms.internal.mlkit_vision_label.zzcm;

/* renamed from: X.Cxm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4512Cxm implements zzcm {
    public final int A00;
    public final EnumC4487CxG A01;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzcm) {
                zzcm zzcmVar = (zzcm) obj;
                if (this.A00 != ((C4512Cxm) zzcmVar).A00 || !this.A01.equals(zzcmVar.zzb())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcm.class;
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

    @Override // com.google.android.gms.internal.mlkit_vision_label.zzcm
    public final EnumC4487CxG zzb() {
        return this.A01;
    }

    public C4512Cxm(EnumC4487CxG enumC4487CxG, int i) {
        this.A00 = i;
        this.A01 = enumC4487CxG;
    }
}
