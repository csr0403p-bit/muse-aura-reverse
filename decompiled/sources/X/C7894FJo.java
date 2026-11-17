package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FJo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7894FJo implements InterfaceC7833FGo {
    public final InterfaceC7896FJq<Content> A00;
    public final C7897FJr A01 = new C7897FJr();
    public final FH1 A02;
    public final Function0<String> A03;

    @Override // X.InterfaceC7833FGo
    public final FH1 AGl() {
        return this.A02;
    }

    @Override // X.InterfaceC7833FGo
    public final boolean Afc(Model model, Model model2, Object obj, Object obj2) {
        return this.A00.Afc(model, model2, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        FK1 fk1 = (FK1) obj4;
        AnonymousClass003.A0u(fg3, context);
        C7897FJr c7897FJr = this.A01;
        c7897FJr.A01 = fg3;
        c7897FJr.A00 = context;
        if (fk1 != null) {
            try {
                fk1.A00.invoke();
            } finally {
                c7897FJr.A01 = null;
                c7897FJr.A00 = null;
            }
        }
    }

    @Override // X.InterfaceC7833FGo
    public final String getDescription() {
        return AnonymousClass007.A0a("binder:", this.A03.invoke());
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Ljava/lang/String;>;LX/FJq<TContent;>;)V */
    public C7894FJo(InterfaceC7896FJq interfaceC7896FJq, Function0 function0) {
        this.A03 = function0;
        this.A00 = interfaceC7896FJq;
        this.A02 = new Ht5(interfaceC7896FJq.getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        AnonymousClass003.A0u(fg3, context);
        C7897FJr c7897FJr = this.A01;
        c7897FJr.A01 = fg3;
        c7897FJr.A00 = context;
        try {
            return this.A00.A58(c7897FJr, obj, obj3);
        } finally {
            c7897FJr.A01 = null;
            c7897FJr.A00 = null;
        }
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
    }
}
