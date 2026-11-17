package X;

/* loaded from: classes6.dex */
public enum G4i implements GIT {
    A01("BROADCAST_ACTION_UNSPECIFIED"),
    A02("PURCHASES_UPDATED_ACTION"),
    A03("LOCAL_PURCHASES_UPDATED_ACTION"),
    A04("ALTERNATIVE_BILLING_ACTION"),
    A05("IN_APP_BILLING_RESULT_UPDATE_ACTION"),
    A06("PLAY_BILLING_ACTIVITY_CREATED_ACTION");

    public final int a;

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(G4i.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    G4i(String str) {
        this.a = i;
    }
}
