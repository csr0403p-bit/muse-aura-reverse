package X;

/* renamed from: X.76U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C76U {
    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/Context;Ljava/lang/String;LX/6PP;LX/77E;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final void A00(String str) throws ClassNotFoundException {
        Class<?> cls = Class.forName(str);
        if (!C77D.class.isAssignableFrom(cls)) {
            throw C3cG.A0Q("Provided class must implement ActionCallback.");
        }
        C7384Etj.A0Z(cls.getDeclaredConstructor(null).newInstance(null), "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
        throw new NullPointerException("onAction");
    }
}
