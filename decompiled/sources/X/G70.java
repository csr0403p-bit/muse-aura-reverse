package X;

/* loaded from: classes6.dex */
public class G70 extends G72 {
    public final boolean A00;

    public static G70 A00(String str, boolean z) {
        return new G70(str, z);
    }

    @Override // X.G72
    public String toString() {
        return FGI.A0M("Markdown:", super.toString());
    }

    public G70(String str, boolean z) {
        super(str);
        this.A00 = z;
    }
}
