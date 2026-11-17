package X;

/* loaded from: classes6.dex */
public final class FGX<ContentType> extends FGT<ContentType> {
    public final long A00;
    public final InterfaceC7830FGl<ContentType> A01;
    public final String A02;
    public final FGT<ContentType> A03;

    /* JADX WARN: Illegal instructions before constructor call */
    public FGX(FGT<ContentType> fgt) {
        C0881AGi c0881AGi = C0881AGi.A00;
        super(null, c0881AGi, c0881AGi);
        this.A03 = fgt;
        this.A00 = fgt.A0J();
        this.A01 = fgt.A0K();
        this.A02 = fgt.A0L();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TContentType;LX/FGT<TContentType;>;Ljava/lang/Object;Ljava/lang/Object;LX/FGa;LX/FGm;ZLX/AHs<LX/FGg;>;)V */
    @Override // X.FGT
    public final void A0M(AbstractC0916AHs abstractC0916AHs, C7831FGm c7831FGm, FG6 fg6, C7819FGa c7819FGa, FGT fgt, Object obj, Object obj2, Object obj3, boolean z) {
        AnonymousClass005.A0x(fg6, obj, fgt);
        C60O.A1N(c7831FGm, 6, abstractC0916AHs);
        this.A03.A0M(abstractC0916AHs, c7831FGm, fg6, c7819FGa, ((FGX) fgt).A03, obj, obj2, obj3, z);
        super.A0M(abstractC0916AHs, c7831FGm, fg6, c7819FGa, fgt, obj, obj2, obj3, z);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;LX/AHs<LX/FGg;>;TContentType;Ljava/lang/Object;LX/FGm;)V */
    @Override // X.FGT
    public final void A0N(AbstractC0916AHs abstractC0916AHs, C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        AnonymousClass005.A0x(fg6, abstractC0916AHs, obj);
        C7384Etj.A0Y(c7831FGm, 4);
        this.A03.A0N(abstractC0916AHs, c7831FGm, fg6, obj, obj2);
        super.A0N(abstractC0916AHs, c7831FGm, fg6, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.FGT
    public final void A0T(C7834FGp<?, ? super ContentType, ?> c7834FGp) {
        C7384Etj.A0Y(c7834FGp, 0);
        FGT<ContentType> fgt = this.A03;
        C0918AHu<FH1, FG4> c0918AHu = fgt.A00;
        if (c0918AHu != null) {
            InterfaceC7833FGo<MODEL, CONTENT, BIND_DATA> interfaceC7833FGo = c7834FGp.A00;
            if (c0918AHu.A07(interfaceC7833FGo.AGl())) {
                throw C60O.A0i(FGI.A0d("Binder ", interfaceC7833FGo.getDescription(), " already exists in the wrapped ", fgt.A0L()));
            }
        }
        super.A0T(c7834FGp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.FGT
    public final void A0U(C7834FGp<?, ? super ContentType, ?> c7834FGp) {
        C7384Etj.A0Y(c7834FGp, 0);
        FGT<ContentType> fgt = this.A03;
        C0918AHu<FH1, FG4> c0918AHu = fgt.A01;
        if (c0918AHu != null) {
            InterfaceC7833FGo<MODEL, CONTENT, BIND_DATA> interfaceC7833FGo = c7834FGp.A00;
            if (c0918AHu.A07(interfaceC7833FGo.AGl())) {
                throw C60O.A0i(FGI.A0d("Binder ", interfaceC7833FGo.getDescription(), " already exists in the wrapped ", fgt.A0L()));
            }
        }
        super.A0U(c7834FGp);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TContentType;Ljava/lang/Object;LX/FGm;)V */
    @Override // X.FGT
    public final void A0O(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        this.A03.A0O(c7831FGm, fg6, obj, obj2);
        super.A0O(c7831FGm, fg6, obj, obj2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TContentType;Ljava/lang/Object;LX/FGm;)V */
    @Override // X.FGT
    public final void A0P(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        super.A0P(c7831FGm, fg6, obj, obj2);
        this.A03.A0P(c7831FGm, fg6, obj, obj2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TContentType;Ljava/lang/Object;LX/FGm;)V */
    @Override // X.FGT
    public final void A0Q(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        this.A03.A0Q(c7831FGm, fg6, obj, obj2);
        super.A0Q(c7831FGm, fg6, obj, obj2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TContentType;Ljava/lang/Object;LX/FGm;)V */
    @Override // X.FGT
    public final void A0R(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        super.A0R(c7831FGm, fg6, obj, obj2);
        this.A03.A0R(c7831FGm, fg6, obj, obj2);
    }
}
