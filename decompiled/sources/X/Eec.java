package X;

import android.os.CancellationSignal;

/* loaded from: classes5.dex */
public final class Eec extends AbstractC7025EeW<EfF<InterfaceC7064EfB>> {
    public static final String __redex_internal_original_name = "LocalThumbnailBitmapSdk29Producer$1";
    public final /* synthetic */ CancellationSignal A00;
    public final /* synthetic */ C7031Eed A01;
    public final /* synthetic */ InterfaceC7029Eea A02;
    public final /* synthetic */ InterfaceC7027EeY A03;
    public final /* synthetic */ C7183Eht A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eec(CancellationSignal cancellationSignal, InterfaceC7028EeZ interfaceC7028EeZ, C7031Eed c7031Eed, InterfaceC7029Eea interfaceC7029Eea, InterfaceC7029Eea interfaceC7029Eea2, InterfaceC7027EeY interfaceC7027EeY, InterfaceC7027EeY interfaceC7027EeY2, C7183Eht c7183Eht) {
        super(interfaceC7028EeZ, interfaceC7029Eea, interfaceC7027EeY, "LocalThumbnailBitmapSdk29Producer");
        this.A03 = interfaceC7027EeY2;
        this.A02 = interfaceC7029Eea2;
        this.A04 = c7183Eht;
        this.A00 = cancellationSignal;
        this.A01 = c7031Eed;
    }

    @Override // X.AbstractC7025EeW, X.AbstractRunnableC7002Ee4
    public final void A01() {
        super.A01();
        this.A00.cancel();
    }

    @Override // X.AbstractC7025EeW, X.AbstractRunnableC7002Ee4
    public final void A02(Exception exc) {
        super.A02(exc);
        InterfaceC7027EeY interfaceC7027EeY = this.A03;
        InterfaceC7029Eea interfaceC7029Eea = this.A02;
        interfaceC7027EeY.AWt(interfaceC7029Eea, "LocalThumbnailBitmapSdk29Producer", false);
        interfaceC7029Eea.AYq("local", "thumbnail_bitmap");
    }

    @Override // X.AbstractC7025EeW, X.AbstractRunnableC7002Ee4
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        super.A04(obj);
        InterfaceC7027EeY interfaceC7027EeY = this.A03;
        InterfaceC7029Eea interfaceC7029Eea = this.A02;
        interfaceC7027EeY.AWt(interfaceC7029Eea, "LocalThumbnailBitmapSdk29Producer", AnonymousClass002.A1X(obj));
        interfaceC7029Eea.AYq("local", "thumbnail_bitmap");
    }
}
