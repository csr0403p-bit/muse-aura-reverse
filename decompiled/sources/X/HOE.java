package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class HOE {
    public static final /* synthetic */ HOE[] A00;
    public static final HOE A01;

    static {
        HOE hoe = new HOE() { // from class: X.HOF
        };
        A01 = hoe;
        A00 = new HOE[]{hoe, new HOE() { // from class: X.HOG
        }};
    }

    public static HOE valueOf(String str) {
        return (HOE) Enum.valueOf(HOE.class, str);
    }

    public static HOE[] values() {
        return (HOE[]) A00.clone();
    }

    public HOE(String str, int i) {
    }
}
