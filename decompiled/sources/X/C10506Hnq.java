package X;

/* renamed from: X.Hnq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10506Hnq implements InterfaceC10512HoG {
    public final EnumC9706GeK A00 = EnumC9706GeK.A0A;
    public final String A01;
    public final Throwable A02;

    @Override // X.InterfaceC10512HoG
    public final String AEf() {
        return this.A01;
    }

    @Override // X.InterfaceC10512HoG
    public final /* synthetic */ C9581GPs AJJ() {
        return null;
    }

    @Override // X.InterfaceC10512HoG
    public final EnumC9706GeK AJk() {
        return this.A00;
    }

    public C10506Hnq(Throwable th) {
        this.A02 = th;
        this.A01 = AnonymousClass007.A0a("Session fetch threw: ", th);
    }
}
