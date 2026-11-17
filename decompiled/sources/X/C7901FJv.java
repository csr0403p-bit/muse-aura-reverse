package X;

/* renamed from: X.FJv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7901FJv implements InterfaceC7896FJq {
    public final /* synthetic */ G0V<C7897FJr, ContentType, FK1> A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC7896FJq
    public final /* bridge */ FK1 A58(C7897FJr c7897FJr, Content content, Object obj) {
        C7384Etj.A0Y(c7897FJr, 1);
        C7384Etj.A0Y(content, 1);
        return this.A00.invoke(c7897FJr, content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7901FJv(G0V<? super C7897FJr, ? super ContentType, FK1> g0v) {
        this.A00 = g0v;
    }

    @Override // X.InterfaceC7896FJq
    public final /* bridge */ boolean Afc(Object obj, Object obj2, Object obj3, Object obj4) {
        return !HqY.A00(obj, obj2);
    }
}
