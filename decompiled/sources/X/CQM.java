package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CQM implements CQN<Object, Object> {
    public static final /* synthetic */ CQM[] A00;
    public static final CQM A01;

    static {
        CQM cqm = new CQM();
        A01 = cqm;
        A00 = new CQM[]{cqm};
    }

    public static CQM valueOf(String name) {
        return (CQM) Enum.valueOf(CQM.class, name);
    }

    public static CQM[] values() {
        return (CQM[]) A00.clone();
    }
}
