package X;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.FJj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7890FJj implements InterfaceC7833FGo<List<? extends FJn>, FHQ, Void> {
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(context, 2);
        FHQ fhq = (FHQ) obj;
        List list = (List) obj2;
        AbstractC7609F5w.A1G(fhq, list);
        fhq.post(new RunnableC7891FJk(fhq, list));
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        C7892FJl c7892FJl;
        Object parent = (FHQ) obj;
        AnonymousClass003.A0x(parent, obj2);
        while ((parent instanceof ViewGroup) && !(parent instanceof FGJ)) {
            View view = (View) parent;
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if ((touchDelegate instanceof C7892FJl) && (c7892FJl = (C7892FJl) touchDelegate) != null) {
                List<FHU> list = c7892FJl.A00;
                if (AbstractC0882AGj.A0v(list, FZS.A02(obj2, 24))) {
                    AbstractC06907md.A04(list, C7895FJp.A00);
                }
                if (c7892FJl.A00.isEmpty()) {
                    view.setTouchDelegate(null);
                }
            }
            parent = view.getParent();
        }
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(List<? extends FJn> list, List<? extends FJn> list2, Object obj, Object obj2) {
        AnonymousClass003.A0u(list, list2);
        return !list.equals(list2);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
