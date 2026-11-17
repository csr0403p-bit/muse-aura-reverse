package X;

import java.io.Serializable;

/* renamed from: X.Gpu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10129Gpu implements Serializable {
    public static final long serialVersionUID = 1;
    public final InterfaceC9886GkG[] _additionalKeySerializers;
    public final InterfaceC9886GkG[] _additionalSerializers;
    public final AbstractC10196GrH[] _modifiers;
    public static final InterfaceC9886GkG[] A01 = new InterfaceC9886GkG[0];
    public static final AbstractC10196GrH[] A00 = new AbstractC10196GrH[0];

    public C10129Gpu() {
        this(null, null, null);
    }

    public C10129Gpu(AbstractC10196GrH[] abstractC10196GrHArr, InterfaceC9886GkG[] interfaceC9886GkGArr, InterfaceC9886GkG[] interfaceC9886GkGArr2) {
        this._additionalSerializers = interfaceC9886GkGArr == null ? A01 : interfaceC9886GkGArr;
        this._additionalKeySerializers = interfaceC9886GkGArr2 == null ? A01 : interfaceC9886GkGArr2;
        this._modifiers = abstractC10196GrHArr == null ? A00 : abstractC10196GrHArr;
    }
}
