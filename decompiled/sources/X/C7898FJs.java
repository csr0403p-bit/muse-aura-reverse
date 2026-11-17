package X;

/* renamed from: X.FJs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7898FJs<Content> implements InterfaceC7896FJq {
    public final /* synthetic */ G0W<C7897FJr, ContentType, LayoutDataT, FK1> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C7898FJs(G0W<? super C7897FJr, ? super ContentType, ? super LayoutDataT, FK1> g0w) {
        this.A00 = g0w;
    }

    @Override // X.InterfaceC7896FJq
    public final FK1 A58(C7897FJr c7897FJr, ContentType contenttype, Object obj) {
        AnonymousClass003.A0u(c7897FJr, contenttype);
        return this.A00.invoke(c7897FJr, contenttype, obj);
    }

    @Override // X.InterfaceC7896FJq
    public final /* bridge */ boolean Afc(Object obj, Object obj2, Object obj3, Object obj4) {
        return (HqY.A00(obj3, obj4) && HqY.A00(obj, obj2)) ? false : true;
    }
}
