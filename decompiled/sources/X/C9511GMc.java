package X;

import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.helper.ValidationException;

/* renamed from: X.GMc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9511GMc {
    public static final boolean A01;
    public final Pattern A00;

    static {
        boolean z;
        try {
            try {
                Class<?> cls = Class.forName("com.google.re2j.Pattern", false, C9511GMc.class.getClassLoader());
                try {
                    Class<?> cls2 = Class.forName("java.lang.Module");
                    Method method = Class.class.getMethod("getModule", null);
                    Object objInvoke = method.invoke(C9511GMc.class, null);
                    Object objInvoke2 = method.invoke(cls, null);
                    if (!AnonymousClass001.A1X(cls2.getMethod("canRead", cls2).invoke(objInvoke, objInvoke2))) {
                        cls2.getMethod("addReads", cls2).invoke(objInvoke, objInvoke2);
                    }
                } catch (ClassNotFoundException unused) {
                }
                z = true;
            } catch (ReflectiveOperationException e) {
                System.err.println(AnonymousClass007.A0a("Warning: (bug? please report) couldn't access re2j from jsoup due to modules: ", e));
                z = false;
                A01 = z;
            }
        } catch (ClassNotFoundException unused2) {
            z = false;
            A01 = z;
        }
        A01 = z;
    }

    public static C9511GMc A00(String str) {
        if (A01 && Boolean.parseBoolean(System.getProperty("jsoup.useRe2j", "true"))) {
            return C9512GMd.A01(str);
        }
        try {
            return new C9511GMc(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new ValidationException(BV5.A0n("Pattern syntax error: ", e));
        }
    }

    public InterfaceC10311GuN A02(CharSequence charSequence) {
        return new C9514GMf(this.A00.matcher(charSequence));
    }

    public String toString() {
        return this.A00.toString();
    }

    public C9511GMc(Pattern pattern) {
        this.A00 = pattern;
    }
}
