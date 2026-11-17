package X;

/* loaded from: classes6.dex */
public final class HkC extends Throwable {
    public final C9724Gec error;
    public final AbstractC10579HwA purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HkC(AbstractC10579HwA abstractC10579HwA, C9724Gec c9724Gec) {
        super(c9724Gec.A07);
        C7384Etj.A0Y(abstractC10579HwA, 0);
        this.purchase = abstractC10579HwA;
        this.error = c9724Gec;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C3cJ.A0L(this.error, ", error=", C3cG.A0f(this.purchase, "DcpFulfillmentError(purchase="));
    }
}
