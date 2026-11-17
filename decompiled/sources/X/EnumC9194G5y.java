package X;

/* renamed from: X.G5y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9194G5y implements GIT {
    A01("UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY"),
    A02("IMMEDIATE_WITH_TIME_PRORATION"),
    A03("IMMEDIATE_AND_CHARGE_PRORATED_PRICE"),
    A04("IMMEDIATE_WITHOUT_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("DEFERRED_TO_NEXT_RECURRENCE"),
    A05("IMMEDIATE_AND_CHARGE_FULL_PRICE"),
    A06("IMMEDIATE_WITH_DEFERRED_REPLACEMENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF73("KEEP_EXISTING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF82("CHARGE_FULL_PRICE_WITH_PRORATED_REFUND");

    public final int a;

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(EnumC9194G5y.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    EnumC9194G5y(String str) {
        this.a = i;
    }
}
