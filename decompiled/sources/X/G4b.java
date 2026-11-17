package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class G4b {
    public static final G4b A01 = new G4b("TRUE", 0);
    public static final G4b A00 = new G4b("DEFAULT", 2);

    public final Boolean A00() {
        if (this == A00) {
            return null;
        }
        return this == A01 ? Boolean.TRUE : Boolean.FALSE;
    }

    public G4b(String str, int i) {
    }
}
