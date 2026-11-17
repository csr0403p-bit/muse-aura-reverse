package X;

/* loaded from: classes4.dex */
public final class B83 {
    public final C2186B9f A00;
    public final C2183B9b A01;

    public final void A00(B9U b9u) {
        C2183B9b c2183B9b = this.A01;
        if (c2183B9b != null) {
            C2183B9b.A00(c2183B9b, b9u.A01);
            return;
        }
        C2186B9f c2186B9f = this.A00;
        if (c2186B9f == null) {
            throw C3cG.A0Q("Unreachable");
        }
        AbstractC2185B9e abstractC2185B9e = b9u.A00;
        C7384Etj.A0Y(abstractC2185B9e, 0);
        B9Y b9y = new B9Y(abstractC2185B9e, new C2188B9i(abstractC2185B9e, null));
        abstractC2185B9e.A01.add(b9y);
        C2183B9b.A00(c2186B9f.A02, b9y);
    }

    public B83(C2186B9f c2186B9f, C2183B9b c2183B9b) {
        this.A01 = c2183B9b;
        this.A00 = c2186B9f;
        if (c2183B9b == null && c2186B9f == null) {
            throw C60O.A0i("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
