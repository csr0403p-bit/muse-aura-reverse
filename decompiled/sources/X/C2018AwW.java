package X;

/* renamed from: X.AwW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2018AwW extends AvR implements AzW {
    public AvV A00;
    public B1Q A01;

    @Override // X.AzW
    public final void AVU() {
        this.A01 = null;
        AaD.A00(this);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        AvV avV = this.A00;
        if (avV != null) {
            avV.A01(this);
        }
    }
}
