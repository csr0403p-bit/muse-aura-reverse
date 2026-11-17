package X;

/* loaded from: classes5.dex */
public final class CGl {
    public final C4oT A00;

    public CGl(C4oT c4oT) {
        C7384Etj.A0Y(c4oT, 0);
        this.A00 = c4oT;
    }

    public final CGk A00() {
        C4oT c4oT = this.A00;
        int i = c4oT.getInt("encryption_key_id", -1);
        String string = c4oT.getString("encryption_key_public_key", null);
        long j = c4oT.getLong("encryption_key_expiration_timestamp_ms", -1L);
        String string2 = c4oT.getString("encryption_key_state", null);
        if (i == -1 || string == null || j == -1 || string2 == null) {
            return null;
        }
        return new CGk(j, string, i, string2);
    }
}
