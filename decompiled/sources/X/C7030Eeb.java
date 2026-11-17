package X;

/* renamed from: X.Eeb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7030Eeb extends AbstractC7025EeW<EfF<InterfaceC7064EfB>> {
    public static final String __redex_internal_original_name = "LocalVideoThumbnailProducer$1";
    public final /* synthetic */ C7032Eee A00;
    public final /* synthetic */ InterfaceC7029Eea A01;
    public final /* synthetic */ InterfaceC7027EeY A02;
    public final /* synthetic */ C7183Eht A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7030Eeb(InterfaceC7028EeZ interfaceC7028EeZ, C7032Eee c7032Eee, InterfaceC7029Eea interfaceC7029Eea, InterfaceC7029Eea interfaceC7029Eea2, InterfaceC7027EeY interfaceC7027EeY, InterfaceC7027EeY interfaceC7027EeY2, C7183Eht c7183Eht) {
        super(interfaceC7028EeZ, interfaceC7029Eea, interfaceC7027EeY, "VideoThumbnailProducer");
        this.A02 = interfaceC7027EeY2;
        this.A01 = interfaceC7029Eea2;
        this.A03 = c7183Eht;
        this.A00 = c7032Eee;
    }

    @Override // X.AbstractC7025EeW, X.AbstractRunnableC7002Ee4
    public final void A02(Exception exc) {
        super.A02(exc);
        InterfaceC7027EeY interfaceC7027EeY = this.A02;
        InterfaceC7029Eea interfaceC7029Eea = this.A01;
        interfaceC7027EeY.AWt(interfaceC7029Eea, "VideoThumbnailProducer", false);
        interfaceC7029Eea.AYq("local", "video");
    }

    @Override // X.AbstractC7025EeW, X.AbstractRunnableC7002Ee4
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        super.A04(obj);
        InterfaceC7027EeY interfaceC7027EeY = this.A02;
        InterfaceC7029Eea interfaceC7029Eea = this.A01;
        interfaceC7027EeY.AWt(interfaceC7029Eea, "VideoThumbnailProducer", AnonymousClass002.A1X(obj));
        interfaceC7029Eea.AYq("local", "video");
    }
}
