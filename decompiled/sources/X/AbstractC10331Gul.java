package X;

/* renamed from: X.Gul, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10331Gul extends Enum<AbstractC10331Gul> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "Doctype";
            case 1:
                return "StartTag";
            case 2:
                return "EndTag";
            case 3:
                return "Comment";
            case 4:
                return "Character";
            case 5:
                return "XmlDecl";
            default:
                return "EOF";
        }
    }
}
