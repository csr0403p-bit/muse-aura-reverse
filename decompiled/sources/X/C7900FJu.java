package X;

/* renamed from: X.FJu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7900FJu implements InterfaceC7896FJq {
    public final /* synthetic */ InterfaceC7353EnQ<?> A00;

    @Override // X.InterfaceC7896FJq
    public final /* bridge */ FK1 A58(C7897FJr c7897FJr, Content content, Object obj) {
        C7384Etj.A0Y(c7897FJr, 1);
        C7384Etj.A0Y(content, 1);
        InterfaceC7353EnQ<?> interfaceC7353EnQ = this.A00;
        ((G0V) interfaceC7353EnQ).invoke(content, null);
        return new FK1(new C8188FYf(content, interfaceC7353EnQ));
    }

    public C7900FJu(InterfaceC7353EnQ interfaceC7353EnQ) {
        this.A00 = interfaceC7353EnQ;
    }

    @Override // X.InterfaceC7896FJq
    public final /* bridge */ boolean Afc(Object obj, Object obj2, Object obj3, Object obj4) {
        return !HqY.A00(obj, obj2);
    }
}
