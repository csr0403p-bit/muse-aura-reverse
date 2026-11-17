package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Akp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1533Akp extends AbstractC7559F3s implements Function0<C1453AjM> {
    public final /* synthetic */ int $compositeKeyHash;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<Context, T> $factory;
    public final /* synthetic */ View $ownerView;
    public final /* synthetic */ BBV $parentReference;
    public final /* synthetic */ AFx $stateRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/G0U<-Landroid/content/Context;+TT;>;LX/BBV;LX/AFx;ILandroid/view/View;)V */
    public C1533Akp(Context context, View view, BBV bbv, AFx aFx, G0U g0u, int i) {
        super(0);
        this.$context = context;
        this.$factory = g0u;
        this.$parentReference = bbv;
        this.$stateRegistry = aFx;
        this.$compositeKeyHash = i;
        this.$ownerView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ C1453AjM invoke() {
        Context context = this.$context;
        G0U<Context, T> g0u = this.$factory;
        BBV bbv = this.$parentReference;
        AFx aFx = this.$stateRegistry;
        int i = this.$compositeKeyHash;
        KeyEvent.Callback callback = this.$ownerView;
        C7384Etj.A0Z(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new C1534Akq(context, bbv, aFx, (InterfaceC1464AjX) callback, g0u, i).A0J;
    }
}
