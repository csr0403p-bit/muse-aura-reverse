package X;

import kotlin.Unit;

/* renamed from: X.15q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15q extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ C1BO<Float> $alpha$delegate;
    public final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15q(long j, C1BO<Float> c1bo) {
        super(1);
        this.$color = j;
        this.$alpha$delegate = c1bo;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        long j = this.$color;
        C1BO<Float> c1bo = this.$alpha$delegate;
        long j2 = C1Co.A00;
        AnonymousClass005.A0r(at3, AnonymousClass003.A00(C1BO.A01(c1bo)), j);
        return Unit.INSTANCE;
    }
}
