package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class GKT {
    public final GJO A00;
    public final InterfaceC9394GHj<? extends InterfaceC9329GEk> A01;
    public final Class<P> A02;
    public final String A03;

    /* JADX WARN: Type inference failed for: r0v6, types: [P, java.lang.Object] */
    public final P A00(AbstractC9321GEc serializedKey) throws GeneralSecurityException {
        AbstractC9465GKh abstractC9465GKhA04 = GL6.A01.A04(GKV.A00(this.A00, GKP.RAW, serializedKey, null, this.A03));
        GL9 gl9 = GL9.A01;
        return gl9.A00.get().A00(abstractC9465GKhA04, this.A02);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Class<TP;>;LX/GJO;LX/GHj<+LX/GEk;>;)V */
    public GKT(GJO typeUrl, InterfaceC9394GHj primitiveClass, Class keyMaterialType, String protobufKeyParser) {
        this.A01 = primitiveClass;
        this.A03 = protobufKeyParser;
        this.A02 = keyMaterialType;
        this.A00 = typeUrl;
    }
}
