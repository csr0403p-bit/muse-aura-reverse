package X;

/* renamed from: X.Gqy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10187Gqy {
    public static final AbstractC10187Gqy A00 = new C10188Gqz();

    public final String A00(String str) {
        if (this instanceof C10188Gqz) {
            return str;
        }
        if (this instanceof C10094GpI) {
            C10094GpI c10094GpI = (C10094GpI) this;
            return c10094GpI._t1.A00(c10094GpI._t2.A00(str));
        }
        if (this instanceof C10154GqL) {
            return FGI.A0M(str, ((C10154GqL) this).A00);
        }
        if (this instanceof C10155GqM) {
            return FGI.A0M(((C10155GqM) this).A00, str);
        }
        C10156GqN c10156GqN = (C10156GqN) this;
        return FGI.A0U(c10156GqN.A00, str, c10156GqN.A01);
    }
}
