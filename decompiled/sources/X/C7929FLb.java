package X;

/* renamed from: X.FLb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7929FLb implements FOO {
    public final /* synthetic */ C7930FLc A00;
    public final /* synthetic */ G0U<FBB, Boolean> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/FBB;Ljava/lang/Boolean;>;LX/FLc;)V */
    public C7929FLb(C7930FLc c7930FLc, G0U g0u) {
        this.A01 = g0u;
        this.A00 = c7930FLc;
    }

    @Override // X.FOO
    public final boolean onBackInvoked() {
        return AnonymousClass003.A1X(this.A00.A04.ACs(), this.A01);
    }
}
