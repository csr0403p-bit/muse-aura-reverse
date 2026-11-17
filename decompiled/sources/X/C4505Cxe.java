package X;

import com.google.android.gms.internal.mlkit_vision_common.zzai;

/* renamed from: X.Cxe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4505Cxe implements zzai {
    public final int A00;
    public final EnumC4485CxE A01;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzai) {
                zzai zzaiVar = (zzai) obj;
                if (this.A00 != ((C4505Cxe) zzaiVar).A00 || !this.A01.equals(zzaiVar.zzb())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzai.class;
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final EnumC4485CxE zzb() {
        return this.A01;
    }

    public C4505Cxe(EnumC4485CxE enumC4485CxE, int i) {
        this.A00 = i;
        this.A01 = enumC4485CxE;
    }
}
