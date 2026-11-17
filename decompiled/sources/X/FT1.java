package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FT1 extends AbstractC7559F3s implements G0U<C7899FJt<ViewGroup>, Unit> {
    public final /* synthetic */ FKF $controller;
    public final /* synthetic */ FT3 $model;
    public final /* synthetic */ G0V<String, String, Unit> $onMediaIdChanged;
    public final /* synthetic */ Function0<Unit> $onMount;
    public final /* synthetic */ Function0<Unit> $onUnmount;
    public final /* synthetic */ boolean $supportE2EEStreaming = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FT1(FKF fkf, FT3 ft3, Function0 function0, Function0 function02, G0V g0v) {
        super(1);
        this.$model = ft3;
        this.$controller = fkf;
        this.$onMount = function0;
        this.$onMediaIdChanged = g0v;
        this.$onUnmount = function02;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C7899FJt<ViewGroup> c7899FJt) {
        C7899FJt<ViewGroup> c7899FJt2 = c7899FJt;
        C7384Etj.A0Y(c7899FJt2, 0);
        FT3 ft3 = this.$model;
        Object[] objArr = {ft3.A05, ft3.A08, ft3.A09, ft3.A0A, ft3.A07, ft3.A04, ft3.A02, Integer.valueOf(ft3.A01), Integer.valueOf(ft3.A00), Boolean.valueOf(ft3.A0F), ft3.A06};
        FKF fkf = this.$controller;
        boolean z = this.$supportE2EEStreaming;
        c7899FJt2.A01(new FT2(fkf, ft3, this.$onMount, this.$onUnmount, this.$onMediaIdChanged, z), objArr);
        Unit unit = Unit.INSTANCE;
        c7899FJt2.A01(new FZT(this.$controller, 1), new Object[]{unit});
        FT3 ft32 = this.$model;
        c7899FJt2.A00(new C8196FYn(22, this.$controller, ft32), BV4.A1Z(ft32.A0D));
        FT3 ft33 = this.$model;
        c7899FJt2.A00(new C8196FYn(23, this.$controller, ft33), new Object[]{ft33.A03});
        FT3 ft34 = this.$model;
        c7899FJt2.A00(new C8196FYn(24, this.$controller, ft34), new Object[]{ft34.A0C});
        FT3 ft35 = this.$model;
        c7899FJt2.A00(new C8196FYn(25, this.$controller, ft35), new Object[]{ft35.A0B});
        return unit;
    }
}
