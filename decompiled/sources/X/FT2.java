package X;

import android.net.Uri;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FT2 extends AbstractC7559F3s implements G0W<C7897FJr, ViewGroup, FJU, FK1> {
    public final /* synthetic */ FKF $controller;
    public final /* synthetic */ FT3 $model;
    public final /* synthetic */ G0V<String, String, Unit> $onMediaIdChanged;
    public final /* synthetic */ Function0<Unit> $onMount;
    public final /* synthetic */ Function0<Unit> $onUnmount;
    public final /* synthetic */ boolean $supportE2EEStreaming;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FKF;LX/FT3;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0V<-Ljava/lang/String;-Ljava/lang/String;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public FT2(FKF fkf, FT3 ft3, Function0 function0, Function0 function02, G0V g0v, boolean z) {
        super(3);
        this.$controller = fkf;
        this.$model = ft3;
        this.$supportE2EEStreaming = z;
        this.$onMount = function0;
        this.$onMediaIdChanged = g0v;
        this.$onUnmount = function02;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ FK1 invoke(C7897FJr c7897FJr, ViewGroup viewGroup, FJU fju) {
        AnonymousClass005.A0x(c7897FJr, viewGroup, fju);
        FKF fkf = this.$controller;
        String str = fkf.A04;
        FT3 ft3 = this.$model;
        FJ1 fj1 = ft3.A05;
        String str2 = ft3.A08;
        String str3 = ft3.A09;
        String str4 = ft3.A0A;
        String str5 = ft3.A07;
        HiK hiK = ft3.A04;
        boolean z = ft3.A0E;
        Uri uri = ft3.A02;
        boolean z2 = this.$supportE2EEStreaming;
        fkf.A01(uri, hiK, fj1, ft3.A06, str2, str3, str4, str5, 0, ft3.A01, ft3.A00, z, z2, ft3.A0F);
        this.$onMount.invoke();
        if (!C7384Etj.areEqual(str, this.$model.A08)) {
            this.$onMediaIdChanged.invoke(str, this.$model.A08);
        }
        return new FK1(new C8197FYo(24, this.$onUnmount, this.$controller));
    }
}
