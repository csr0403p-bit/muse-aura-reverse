package X;

import java.util.List;

/* renamed from: X.FJt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7899FJt<ContentType> {
    public final List<C7834FGp<?, ContentType, ? super Object>> A00 = C3cG.A0h();

    public final void A02(InterfaceC7353EnQ interfaceC7353EnQ) {
        List<C7834FGp<?, ContentType, ? super Object>> list = this.A00;
        list.add(new C7834FGp<>(new C7894FJo(new C7900FJu(interfaceC7353EnQ), new FYS(list.size(), 1)), null));
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/Object;LX/G0V<-LX/FJr;-TContentType;LX/FK1;>;)V */
    public final void A00(G0V g0v, Object[] objArr) {
        List<C7834FGp<?, ContentType, ? super Object>> list = this.A00;
        list.add(new C7834FGp<>(new C7894FJo(new C7901FJv(g0v), new FYS(list.size(), 0)), objArr));
    }

    /* JADX WARN: Incorrect types in method signature: <LayoutDataT:Ljava/lang/Object;>([Ljava/lang/Object;LX/G0W<-LX/FJr;-TContentType;-TLayoutDataT;LX/FK1;>;)V */
    public final void A01(G0W g0w, Object[] objArr) {
        List<C7834FGp<?, ContentType, ? super Object>> list = this.A00;
        list.add(new C7834FGp<>(new C7894FJo(new C7898FJs(g0w), new FYS(list.size(), 2)), objArr));
    }
}
