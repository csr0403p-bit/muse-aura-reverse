package X;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class BnC {
    public static final Set<BnG> A00;
    public static final Set<BnG> A01;
    public static final Set<EnumC2859BnF> A02 = Collections.unmodifiableSet(EnumSet.of(EnumC2859BnF.PASSIVE_FOCUSED, EnumC2859BnF.PASSIVE_NOT_FOCUSED, EnumC2859BnF.LOCKED_FOCUSED, EnumC2859BnF.LOCKED_NOT_FOCUSED));
    public static final Set<EnumC2860BnH> A03 = Collections.unmodifiableSet(EnumSet.of(EnumC2860BnH.CONVERGED, EnumC2860BnH.UNKNOWN));

    static {
        BnG bnG = BnG.CONVERGED;
        BnG bnG2 = BnG.FLASH_REQUIRED;
        BnG bnG3 = BnG.UNKNOWN;
        Set<BnG> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(bnG, bnG2, bnG3));
        A00 = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(bnG2);
        enumSetCopyOf.remove(bnG3);
        A01 = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
