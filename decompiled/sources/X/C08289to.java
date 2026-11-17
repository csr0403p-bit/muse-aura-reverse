package X;

/* renamed from: X.9to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08289to implements C9hr<Character> {
    public static final C08289to A00 = new C08289to();
    public static final C9iZ A01 = new C07709if("kotlin.Char", C9u4.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return Character.valueOf(interfaceC07829iw.A8J());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAA(cCharValue);
    }
}
