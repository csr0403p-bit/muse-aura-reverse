package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FgY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CharSequence A07;
    public CharSequence A08;
    public String A09;
    public ArrayList<Runnable> A0A;
    public ArrayList<String> A0C;
    public ArrayList<String> A0D;
    public boolean A0E;
    public final C8518FfP A0H;
    public final ClassLoader A0I;
    public ArrayList<C8598Fh0> A0B = C3cG.A0h();
    public boolean A0F = true;
    public boolean A0G = false;

    public final void A00() {
        if (this.A0E) {
            throw C3cG.A0Q("This transaction is already being added to the back stack");
        }
        this.A0F = false;
    }

    public void A01(Fragment fragment, String str, int i, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            Hi5 hi5 = AbstractC8519FfS.A00;
            FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str2);
            AbstractC8519FfS.A02(fragmentReuseViolation);
            Hi5 hi5A00 = AbstractC8519FfS.A00(fragment);
            AbstractC7611F5y.A0k(hi5A00, fragmentReuseViolation, EnumC8520FfT.DETECT_FRAGMENT_REUSE, fragment, hi5A00.A01);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw BV5.A0V("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sbA0f = C3cG.A0f(fragment, "Can't change tag of fragment ");
                sbA0f.append(": was ");
                sbA0f.append(fragment.mTag);
                sbA0f.append(" now ");
                throw BV8.A0m(str, sbA0f);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sbA0f2 = C3cG.A0f(fragment, "Can't add fragment ");
                sbA0f2.append(" with tag ");
                sbA0f2.append(str);
                throw C8j3.A0w(" to container view with no id", sbA0f2);
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sbA0f3 = C3cG.A0f(fragment, "Can't change container ID of fragment ");
                sbA0f3.append(": was ");
                sbA0f3.append(fragment.mFragmentId);
                throw C3cG.A0Q(C60P.A1O(" now ", sbA0f3, i));
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        A02(new C8598Fh0(fragment, i2));
    }

    public final void A02(C8598Fh0 c8598Fh0) {
        this.A0B.add(c8598Fh0);
        c8598Fh0.A01 = this.A02;
        c8598Fh0.A02 = this.A03;
        c8598Fh0.A03 = this.A04;
        c8598Fh0.A04 = this.A05;
    }

    public FgY(C8518FfP c8518FfP, ClassLoader classLoader) {
        this.A0H = c8518FfP;
        this.A0I = classLoader;
    }
}
