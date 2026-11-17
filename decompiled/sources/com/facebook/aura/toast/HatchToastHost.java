package com.facebook.aura.toast;

import X.HtJ;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;

/* loaded from: classes2.dex */
public interface HatchToastHost {
    boolean getAcceptsToasts();

    Object show(AuraToast.ToastArgs toastArgs, HtJ<? super Unit> htJ);

    /* renamed from: com.facebook.aura.toast.HatchToastHost$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getAcceptsToasts(HatchToastHost hatchToastHost) {
            return true;
        }

        public static /* synthetic */ boolean access$getAcceptsToasts$jd(HatchToastHost hatchToastHost) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static boolean getAcceptsToasts(HatchToastHost hatchToastHost) {
            return true;
        }
    }
}
