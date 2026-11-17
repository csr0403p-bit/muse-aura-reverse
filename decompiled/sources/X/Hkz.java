package X;

/* loaded from: classes6.dex */
public abstract class Hkz {
    public static final F0C A00 = AbstractC5321DgF.A00(C79.A0C, 47);

    public static final FBB A00(FGW fgw) {
        FBB fbb;
        Object obj = fgw.A03;
        if (!(obj instanceof FBB) || (fbb = (FBB) obj) == null) {
            throw BV5.A0U("Expected BloksContext in Bloks RenderTree but found ", C60Q.A0e(obj));
        }
        return fbb;
    }
}
