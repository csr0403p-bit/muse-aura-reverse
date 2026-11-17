package X;

/* loaded from: classes6.dex */
public abstract class HiI extends Enum<HiI> {
    public static Integer A00(String str) {
        if (str.equals("px")) {
            return C79.A00;
        }
        if (str.equals("em")) {
            return C79.A01;
        }
        if (str.equals("ex")) {
            return C79.A0C;
        }
        if (str.equals("in")) {
            return C79.A0K;
        }
        if (str.equals("cm")) {
            return C79.A0P;
        }
        if (str.equals("mm")) {
            return C79.A0T;
        }
        if (str.equals("pt")) {
            return C79.A0W;
        }
        if (str.equals("pc")) {
            return C79.A0Y;
        }
        if (str.equals("percent")) {
            return C79.A0Z;
        }
        throw C60O.A0i(str);
    }
}
